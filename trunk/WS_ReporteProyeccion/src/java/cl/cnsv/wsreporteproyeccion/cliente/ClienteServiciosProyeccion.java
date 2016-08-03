/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.cliente;

import cl.cnsv.crypto.encryption.CryptoUtil;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.ServiciosProyeccion;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import org.apache.log4j.Logger;

/**
 *
 * @author ITCS09
 */
public class ClienteServiciosProyeccion {
    private static final Logger LOGGER = Logger.getLogger(ClienteServiciosProyeccion.class);
    private ServiciosProyeccion port = null;

    public ClienteServiciosProyeccion() throws Exception { 
        if (port == null) {
            String wsdl = Propiedades.getFuncProperty("ws.proyeccion.wsdl");
            URL url = new URL(wsdl);
            LOGGER.info("WSDL servicio WSProyeccion " + url);
            QName qname = new QName("http://ws.proyeccion.cnsv.cl/", "ServiciosProyeccion");
            Service service = Service.create(url, qname);
            final String username = Propiedades.getKeyProperty("ws.proyeccion.username");
            final String encryptedPassword = Propiedades.getKeyProperty("ws.proyeccion.password");
            LOGGER.info("username: " + username);
            LOGGER.info("encryptedPassword: " + encryptedPassword);           
            String privateKeyFile = Propiedades.getConfProperty("KEY");
            CryptoUtil cryptoUtil = new CryptoUtil("", privateKeyFile);
            String password = cryptoUtil.decryptData(encryptedPassword);
            LOGGER.info("password: " + password);
            port = service.getPort(ServiciosProyeccion.class);        
            BindingProvider prov = (BindingProvider) port;
            prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
            prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
        }
    }
     
    
     /**
     * Obtiene Proyeccion de producto Vida Ahorro 100
     * @param input
     * @return
     */
    public RespuestaFlexInvGold getProyeccionFlexInvGold(TransaccionFlexInvGold input) {
        return port.obtenerProyeccionFlexInvGold(input);        
    }
    
    
      
    /**
     * Obtiene Proyeccion de producto Vida Ahorro 100
     * @param input
     * @return
     */
    public RespuestaVidAhorro100 getProyeccionVidAhorro100(TransaccionVidAhorro100 input) {        
        return port.obtenerProyeccionVidAhorro100(input);
    }

    /**
     * Obtiene proyeccion de producto 57 Bis
     * @param input
     * @return
     */
    public RespuestaVidAhorro57Bis getProyeccionVidAhorro57Bis(TransaccionVidAhorro57Bis input) {        
        return port.obtenerProyeccionVidAhorro57Bis(input);
    }

    /**
     * Obtiene proyeccion de producto Vida Ahorro Flex
     * @param input
     * @return
     */
    public RespuestaVidAhorroFlex getProyeccionVidAhorroFlex(TransaccionVidAhorroFlex input) {
        return port.obtenerProyeccionVidAhorroFlex(input);            
    }
}
