package cl.cnsv.wsreporteproyeccion.jasperserver;


import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.representation.Form;
import java.io.File;
import java.util.ArrayList;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

/**
 *
 * @author exitcs3.
 */
public class JasperClientJersey {

    private static final Logger LOGGER = Logger.getLogger(JasperClientJersey.class);
    private final String urlLogin;
    private final String userName;
    private final String password;
    private final String fileName;
    private final String parametro;

    public JasperClientJersey(String urlLogin, String userName, String password, String fileName, String parametro) {
        this.urlLogin = urlLogin;
        this.userName = userName;
        this.password = password;
        this.fileName = fileName;
        this.parametro = parametro;
    }

    public byte[] getPdfJasperApiRestV2(String urlData) throws Exception {
        byte[] binaryFile;       
        Client client = Client.create();

         //add a filter to set cookies received from the server and to check if login has been triggered        
        client.addFilter(new ClientFilter() {
            private ArrayList<Object> cookies;

            @Override
            public ClientResponse handle(ClientRequest request) throws ClientHandlerException {
                if (cookies != null) {
                    request.getHeaders().put("Cookie", cookies);
                }
                ClientResponse response = getNext().handle(request);
                 //copy cookies
                if (response.getCookies() != null) {
                    if (cookies == null) {
                        cookies = new ArrayList<Object>();
                    }
                    // A simple addAll just for illustration (should probably check for duplicates and expired cookies)
                    cookies.addAll(response.getCookies());
                }
                return response;
            }
        });

         //Login:
        WebResource webResource = client.resource(urlLogin);

        Form form = new Form();
        form.putSingle("j_username", userName); 
        form.putSingle("j_password", password);
        webResource.type("application/x-www-form-urlencoded").post(form);

        //Get the protected web page: (this time the service will return the data)
        urlData = urlData.replaceAll("%s", parametro);
        webResource = client.resource(urlData);

        /**
         * ****************con rest v2*****************************
         */
        binaryFile = webResource.type("application/pdf").get(byte[].class);
        if("1".equals(Propiedades.getFuncProperty("tmp.proyeccion.file.create"))) {
            String filePath = System.getProperty("TMP_REPORTEPROYECCION");
            String strFileName = fileName.replaceAll("%s", parametro);
            String strFile = filePath + "/" + strFileName;
            File file = new File(strFile);
            if (file.exists()) {
                if(file.delete()) {
                    FileUtils.writeByteArrayToFile(file, binaryFile);
                }
                else {
                    LOGGER.info("No fue posible eliminar el archivo: " + strFile);
                }
            }
            else {
                FileUtils.writeByteArrayToFile(file, binaryFile);
            }            
        }
        binaryFile = Base64.encodeBase64(binaryFile);
        return binaryFile;
    }
}
