/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.cliente;

import cl.cnsv.crypto.encryption.CryptoUtil;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputCondicionadoVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputCotizacionInternet;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCondicionadoVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCotizacionInternet;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputEmailCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputPlanVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputTipoProyeccionVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionFlexInvGlodVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.WSCotizadorVida;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.apache.log4j.Logger;


/**
 *
 * @author ITCS09
 */
public class ClienteServicioCotizadorVida {
    
    private static final Logger LOGGER = Logger.getLogger(ClienteServicioCotizadorVida.class);
    private WSCotizadorVida port = null;

    public ClienteServicioCotizadorVida() throws Exception {
        if (port == null) {
            String wsdl = Propiedades.getFuncProperty("ws.cotizadorvida.wsdl");
            URL url = new URL(wsdl);
            QName qname = new QName("http://cnsv.cl/", "WS_CotizadorVida");
            LOGGER.info("WSDL servicio WSCotizadorVida " + wsdl);
            final String username = Propiedades.getKeyProperty("ws.cotizadorvida.username");
            final String encryptedPassword = Propiedades.getKeyProperty("ws.cotizadorvida.password");
            LOGGER.info("username: " + username);
            LOGGER.info("encryptedPassword: " + encryptedPassword);
            String privateKeyFile = Propiedades.getConfProperty("KEY");
            CryptoUtil cryptoUtil = new CryptoUtil("", privateKeyFile);
            final String password = cryptoUtil.decryptData(encryptedPassword);
            LOGGER.info("password: " + password);
            Authenticator.setDefault(new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password.toCharArray());
                }
            });
            Service service = Service.create(url, qname);
            port = service.getPort(WSCotizadorVida.class);   
        }
    }
    
    /**
     * Obtiene las proyecciónes del asegurable de la póliza
     * @param input
     * @return 
     */
    public OutputProyeccionesVO getProyeccionesVO(InputProyeccionesVO input) {        
        return port.getProyeccionesVO(input);
    } 
   
    /**
     * Obtiene los parámetros de la proyección FlexInvGold
     * @param input
     * @return 
     */
    public OutputWSProyeccionFlexInvGlodVO getProyeccionesFlexInvGlodVO (InputProyeccionesVO input){
        return port.getProyeccionesFlexInvGlodVO(input);
    }
    
    /**
     * Obtiene los parámetros de la proyección VidAhorro100
     * @param input
     * @return 
     */
    public OutputWSProyeccionVidAhorro100 getProyeccionesVidAhorro100VO (InputProyeccionesVO input){
        return port.getProyeccionesVidAhorro100VO(input);                    
    }
    
    /**
     * Obtiene los parámetros de la proyección VidAhorro57Bis
     * @param input
     * @return 
     */      
    public OutputWSProyeccionVidAhorro57Bis getProyeccionesVidAhorro57BisVO (InputProyeccionesVO input){
        return port.getProyeccionesVidAhorro57BisVO(input);
    } 
      
    /**
     * Permite obtener los datos de proyeccion del producto
     * Vida Ahorro Flex.
     * @param input
     * @return 
    */
    public OutputWSProyeccionVidAhorroFlex getProyeccionesVidAhorroFlexVO (InputProyeccionesVO input){
        return port.getProyeccionesVidAhorroFlexVO(input);
    }
    
    /**
     * Permite obtener el tipo de proyeccion.
     * @param input
     * @return 
    */
    public OutputTipoProyeccionVO getTipoProyeccionVO (InputProyeccionesVO input){     
        return port.getTipoProyeccionVO(input);      
    }
    
    /**
     * Permite obtener el nombre del condicionado.
     * @param input
     * @return 
     */
    public OutputCondicionadoVO getNombreCondicionado(InputCondicionadoVO input) {
        return port.getNombreCondicionado(input);
    }
    
    /**
     * Permite obtener la informacion para el reporte de cotizacion internet.
     * @param input
     * @return 
     */
    public OutputCotizacionInternet getCotizacionInternet(InputCotizacionInternet input) {
        return port.getCotizacionInternet(input);
    }
    
    /**
     * Permite obtener los datos para la plantilla html del email 
     * de cotizacion internet.
     * @param input
     * @return 
     */
    public OutputEmailCotizacionInternetVO getDatosEmailCotizacionInternet(InputCotizacionInternet input) {
        return port.getDatosEmailCotizacionInternet(input);
    }
    
    /**
     * Permite obtener los datos del plan de cotizacion internet.
     * @param input
     * @return 
     */
    public OutputPlanVO getDatosPlanCotizacionInternet(InputCotizacionInternet input) {
        return port.getDatosPlanCotizacionInternet(input);
    }
    
}