package cl.cnsv.wsreporteproyeccion.utils;


import java.util.ArrayList;

/**
 *
 * @author Carlo Diban B.
 */
public class JasperClientRestApiV2 {

    String urlLogin;
    String userName;
    String password;

    public JasperClientRestApiV2(String urlLogin, String userName, String password) {
        this.urlLogin = urlLogin;
        this.userName = userName;
        this.password = password;
    }

    public byte[] getPdfJasperApiRestV2(String urlData) {
        byte[] binaryFile = null;
        return binaryFile;
        
        //TODO migrar a jersey 2.
        
//        Client client = Client.create();
//
//        // add a filter to set cookies received from the server and to check if login has been triggered        
//        client.addFilter(new ClientFilter() {
//            private ArrayList<Object> cookies;
//
//            @Override
//            public ClientResponse handle(ClientRequest request) throws ClientHandlerException {
//                if (cookies != null) {
//                    request.getHeaders().put("Cookie", cookies);
//                }
//                ClientResponse response = getNext().handle(request);
//                // copy cookies
//                if (response.getCookies() != null) {
//                    if (cookies == null) {
//                        cookies = new ArrayList<Object>();
//                    }
//                    // A simple addAll just for illustration (should probably check for duplicates and expired cookies)
//                    cookies.addAll(response.getCookies());
//                }
//                return response;
//            }
//        });

        // Login:
//        WebResource webResource = client.resource(urlLogin);
//
//        Form form = new Form();
//        form.putSingle("j_username", userName);
//        form.putSingle("j_password", password);
//        webResource.type("application/x-www-form-urlencoded").post(form);
//
//        // Get the protected web page: (this time the service will return the data)
//        webResource = client.resource(urlData);
//
//        /**
//         * ****************con rest v2*****************************
//         */
//        binaryFile = webResource.type("application/pdf").get(byte[].class);
//        return binaryFile;
    }
}
