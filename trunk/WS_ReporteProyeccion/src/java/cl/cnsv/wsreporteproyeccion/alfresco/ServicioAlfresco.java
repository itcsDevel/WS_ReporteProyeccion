/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.alfresco;

<<<<<<< HEAD
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.lang.CharEncoding;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import cl.cnsv.wsreporteproyeccion.vo.ResultadoWSAlfresco;
=======
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

/**
 *
 * @author ITCS09
 */
public class ServicioAlfresco {
<<<<<<< HEAD
     private static final Logger LOGGER = Logger.getLogger(ServicioAlfresco.class);
     private final String carpetaAlfresco = Propiedades.getFuncProperty("reportesweb.alfresco.bajar.carpeta");
     private final String urlNameAlfresco = Propiedades.getFuncProperty("reportesweb.alfresco.bajar.urlName");
     private final String endpointAlfresco = Propiedades.getFuncProperty("reportesweb.alfresco.bajar.url");
     
    public ServicioAlfresco() {
        
    }
        
    public ResultadoWSAlfresco  buscarArchivoAlfrescoByName(InputProyeccionesVO nameFile) {
        LOGGER.info("Iniciando Método Bajar de Alfresco por nombre con WS_ReporteProyeccion");
        ResultadoWSAlfresco archivoAlfresco = new ResultadoWSAlfresco();
        String endpoint = "";
        JSONObject input = new JSONObject();
        String output = "";
        try {
            
            input.put("carpeta",carpetaAlfresco);
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
                        obj3 = new JSONArray();
                        JSONObject objListCasos = obj2.getJSONObject(i);
                        obj3.put(objListCasos);
                    }
                    if (obj3.length() > 0) {
                        for (int j = 0; j < obj3.length(); j++) {
                            JSONObject json = (JSONObject) obj3.get(j);
                           // archivoAlfresco.setDocAlfresco((String) json.get("docAlfresco"));
                            archivoAlfresco.setDocumento((String) json.get("documento"));
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("Error al descargar archivo alfresco por nombre mediante WS_ReporteProyeccion: " + e);
            System.out.println("Error al descargar archivo alfresco por nombre mediante WS_ReporteProyeccion: " + e);
        }
        
        if(archivoAlfresco.getDocumento().isEmpty()){
            archivoAlfresco.setCodigo("1");
            archivoAlfresco.setMensaje("Error al BUscar Archivo Alfresco");
       }else{
        LOGGER.info("Póliza de Ruta Alfresco Generada con Exito");
        //archivoAlfresco.setArchivo(archivoAlfresco.getDocumento().getBytes());
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
        ClientResponse response = webResource.accept(mediaType).header("Content-Type", contentType.toString()).post(ClientResponse.class, input);
      
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new Exception(response.toString());
        }

        String result = response.getEntity(String.class);
        if (result == null || result.isEmpty()) {
            throw new Exception("No existe cuerpo de respuesta");
        }
        return result;
    }
    
    
    
=======
     private static Logger log = Logger.getLogger(ServicioAlfresco.class);

    public ServicioAlfresco() {
    }
    
    
     
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
    
    
     
     
     
}
