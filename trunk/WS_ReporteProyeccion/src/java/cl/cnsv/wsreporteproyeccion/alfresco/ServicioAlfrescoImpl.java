/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */
package cl.cnsv.wsreporteproyeccion.alfresco;

import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import cl.cnsv.wsreporteproyeccion.vo.ResultadoDocumentoVO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.File;
import javax.ws.rs.core.MediaType;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.CharEncoding;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Clase que implementa el llamado al servici Alfresco
 *
 * fecha: 25-08-2016
 *
 * @author exitcs6
 */
public class ServicioAlfrescoImpl implements ServicioAlfresco {

    private static final Logger LOGGER = Logger.getLogger(ServicioAlfresco.class);
    private final String carpetaAlfresco;
    private final String urlNameAlfresco;
    private final String endpointAlfresco;

    public ServicioAlfrescoImpl() {
        carpetaAlfresco = Propiedades.getFuncProperty("alfresco.bajar.carpeta");
        urlNameAlfresco = Propiedades.getFuncProperty("alfresco.bajar.urlName");
        endpointAlfresco = Propiedades.getFuncProperty("alfresco.bajar.url");
    }

    @Override
    public ResultadoDocumentoVO buscarArchivoAlfrescoByName(InputProyeccionesVO nameFile) {
        LOGGER.info("Iniciando Metodo Bajar de Alfresco por nombre con WS_ReporteProyeccion");
        ResultadoDocumentoVO archivoAlfresco = new ResultadoDocumentoVO();
        String endpoint = "";
        JSONObject input = new JSONObject();
        String output = "";
        try {
            input.put("carpeta", carpetaAlfresco);
            input.put("urlName", urlNameAlfresco);
            input.put("nPoliza", nameFile.getNumeroPoliza());
            endpoint = endpointAlfresco;

            output = post(endpoint, MediaType.APPLICATION_JSON, input);

            JSONObject obj = new JSONObject(output);
            archivoAlfresco.setCodigo((String) obj.get("codigo"));
            archivoAlfresco.setMensaje((String) obj.get("mensaje"));

            JSONArray obj2;
            JSONArray obj3;
            try {
                obj2 = obj.getJSONArray("archivo");
            } catch (Exception ex) {
                LOGGER.error("Problema al obtener el elemento obj.getJSONArray(\"archivo\"): " + ex.getMessage(), ex);
                obj2 = new JSONArray();
                JSONObject objListCasos = obj.getJSONObject("archivo");
                obj2.put(objListCasos);
                throw ex;
            }

            if (obj2.length() > 0) {
                for (int i = 0; i < obj2.length(); i++) {
                    try {
                        obj3 = obj2.getJSONArray(i);
                    } catch (Exception ex) {
                        LOGGER.debug("Problema al obtener el elemento obj2.getJSONArray(i), i = " + i + ": " + ex.getMessage());
                        obj3 = new JSONArray();
                        JSONObject objListCasos = obj2.getJSONObject(i);
                        obj3.put(objListCasos);
                    }
                    if (obj3.length() > 0) {
                        for (int j = 0; j < obj3.length(); j++) {
                            JSONObject json = (JSONObject) obj3.get(j);
                            if (json == null) {
                                LOGGER.debug("Elemento JSONObject obj3.get(j), con j = " + j + " es nulo!");
                                archivoAlfresco.setDocumento("");
                            } else {
                                Object objDocumento = json.get("documento");
                                if (objDocumento == null || JSONObject.NULL.equals(objDocumento)) {
                                    LOGGER.debug("Elemento JSONObject obj3.get(j).documento, con j = " + j + " es nulo!");
                                    archivoAlfresco.setDocumento("");
                                } else {
                                    archivoAlfresco.setDocumento((String) objDocumento);
                                }
                            }
                        }
                    }
                }
            }

            if ("1".equals(Propiedades.getFuncProperty("tmp.file.create"))) {

                String documento = archivoAlfresco.getDocumento();
                byte[] binaryFile = documento.getBytes();
                binaryFile = Base64.decodeBase64(binaryFile);
                String filePath = System.getProperty("TMP_REPORTEPROYECCION");
                String fileName = Propiedades.getFuncProperty("tmp.file.name");
                fileName = fileName.replaceAll("%s", nameFile.getNumeroPoliza());
                String strFile = filePath + "/" + fileName;
                File file = new File(strFile);
                if (file.exists()) {
                    if (file.delete()) {
                        FileUtils.writeByteArrayToFile(file, binaryFile);
                    } else {
                        LOGGER.info("No fue posible eliminar el archivo: " + strFile);
                    }
                } else {
                    FileUtils.writeByteArrayToFile(file, binaryFile);
                }
            }

        } catch (Exception e) {
            LOGGER.error("Error al descargar archivo alfresco por nombre mediante WS_ReporteProyeccion: " + e.getMessage(), e);
        }

        String documento = archivoAlfresco.getDocumento();
        if (documento == null || documento.isEmpty()) {
            archivoAlfresco.setCodigo("1");
            archivoAlfresco.setMensaje("Error al buscar archivo Alfresco");
        } else {
            LOGGER.info("Póliza de Ruta Alfresco Generada con Exito");
        }
        return archivoAlfresco;
    }

    /**
     * @param endpoint
     * @param mediaType
     * @param data
     * @return
     * @throws Exception
     */
    protected String post(String endpoint, String mediaType, Object data) throws Exception {

        Client client = Client.create();
        client.setConnectTimeout(3000000);
        WebResource webResource = client.resource(endpoint);
        String input = data != null ? data.toString() : null;

        StringBuilder contentType = new StringBuilder(mediaType);
        contentType.append(";charset=" + CharEncoding.UTF_8);
        ClientResponse response = webResource
                .accept(mediaType)
                .header("Content-Type", contentType.toString())
                .post(ClientResponse.class, input);

        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new Exception(response.toString());
        }

        String result = response.getEntity(String.class);
        if (result == null || result.isEmpty()) {
            throw new Exception("No existe cuerpo de respuesta");
        }
        return result;
    }

}
