/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */
package cl.cnsv.wsreporteproyeccion.jasperserver;

import cl.cnsv.crypto.encryption.CryptoUtil;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputCotizacionInternet;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import cl.cnsv.wsreporteproyeccion.vo.ResultadoDocumentoVO;
import org.apache.log4j.Logger;

/**
 * Clase que implementa el llamado a JasperServer a traves de la API Jersey
 *
 * fecha: 25-08-2016
 *
 * @author exitcs6
 */
public class ServicioJasperServerJerseyImpl implements ServicioJasperServer {

    private static final Logger LOGGER = Logger.getLogger(ServicioJasperServerJerseyImpl.class);

    @Override
    public ResultadoDocumentoVO buscarArchivoByPoliza(InputProyeccionesVO inputProyecciones) {
        ResultadoDocumentoVO resultado = new ResultadoDocumentoVO();
        String codigo;
        String mensaje;
        String documento;
        String jasperServerServer = Propiedades.getFuncProperty("jasperServer.server");
        String loginUrl = Propiedades.getFuncProperty("jasperServer.url_login");
        String URL_LOGIN = jasperServerServer + "/" + loginUrl;
        LOGGER.info("URL_LOGIN: ".concat(URL_LOGIN));
        String USERNAME = Propiedades.getKeyProperty("jasperServer.username");
        LOGGER.info("USERNAME: ".concat(USERNAME));
        String PASSWORD = Propiedades.getKeyProperty("jasperServer.password");
        LOGGER.info("PASSWORD (encriptada): ".concat(PASSWORD));
        String privateKeyFile = Propiedades.getConfProperty("KEY");
        LOGGER.info("privateKeyFile: ".concat(privateKeyFile));
        CryptoUtil crypto = new CryptoUtil("", privateKeyFile);
        String decodedPassword = crypto.decryptData(PASSWORD);        
        String numeroPoliza = inputProyecciones.getNumeroPoliza();
        LOGGER.info("NRO_PROPUESTA: ".concat(numeroPoliza));
        String fileName = Propiedades.getFuncProperty("tmp.proyeccion.file.name");
        JasperClientJersey jasperClient = new JasperClientJersey(URL_LOGIN, USERNAME, decodedPassword, fileName, numeroPoliza);
        String dataUrl = Propiedades.getFuncProperty("jasperServer.proyeccion.urlData");
        String urlJasperServer = jasperServerServer + "/" + dataUrl;
        LOGGER.info("urlJasperServer: ".concat(urlJasperServer));
        byte[] pdfBase64;
        try {
            pdfBase64 = jasperClient.getPdfJasperApiRestV2(urlJasperServer);
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("jasperserver.error.codigo");
            mensaje = Propiedades.getFuncProperty("jasperserver.error.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            resultado.setCodigo(codigo);
            resultado.setMensaje(mensaje);
            return resultado;
        }
        documento = new String(pdfBase64);
        LOGGER.info("Respuesta jasperserver: ".concat(documento));
        codigo = Propiedades.getFuncProperty("codigo.ok");
        mensaje = Propiedades.getFuncProperty("mensaje.ok");
        resultado.setCodigo(codigo);
        resultado.setMensaje(mensaje);
        resultado.setDocumento(documento);
        return resultado;
    }

    @Override
    public ResultadoDocumentoVO buscarArchivoByCotizacion(InputCotizacionInternet inputCotizacionInternet) {
        ResultadoDocumentoVO resultado = new ResultadoDocumentoVO();
        String codigo;
        String mensaje;
        String documento;
        String jasperServerServer = Propiedades.getFuncProperty("jasperServer.server");
        String loginUrl = Propiedades.getFuncProperty("jasperServer.url_login");
        String URL_LOGIN = jasperServerServer + "/" + loginUrl;
        LOGGER.info("URL_LOGIN: ".concat(URL_LOGIN));
        String USERNAME = Propiedades.getKeyProperty("jasperServer.username");
        LOGGER.info("USERNAME: ".concat(USERNAME));
        String PASSWORD = Propiedades.getKeyProperty("jasperServer.password");
        LOGGER.info("PASSWORD (encriptada): ".concat(PASSWORD));
        String privateKeyFile = Propiedades.getConfProperty("KEY");
        LOGGER.info("privateKeyFile: ".concat(privateKeyFile));
        CryptoUtil crypto = new CryptoUtil("", privateKeyFile);
        String decodedPassword = crypto.decryptData(PASSWORD);        
        String idCotizacion = inputCotizacionInternet.getIdCotizacion();
        LOGGER.info("NRO_COTIZACION: ".concat(idCotizacion));
        String fileName = Propiedades.getFuncProperty("tmp.cotizacionInternet.file.name");
        JasperClientJersey jasperClient = new JasperClientJersey(URL_LOGIN, USERNAME, decodedPassword, fileName, idCotizacion);
        String dataUrl = Propiedades.getFuncProperty("jasperServer.cotizacionInternet.urlData");
        String urlJasperServer = jasperServerServer + "/" + dataUrl;
        LOGGER.info("urlJasperServer: ".concat(urlJasperServer));
        byte[] pdfBase64;
        try {
            pdfBase64 = jasperClient.getPdfJasperApiRestV2(urlJasperServer);
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("jasperserver.error.codigo");
            mensaje = Propiedades.getFuncProperty("jasperserver.error.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            resultado.setCodigo(codigo);
            resultado.setMensaje(mensaje);
            return resultado;
        }
        documento = new String(pdfBase64);
        LOGGER.info("Respuesta jasperserver: ".concat(documento));
        codigo = Propiedades.getFuncProperty("codigo.ok");
        mensaje = Propiedades.getFuncProperty("mensaje.ok");
        resultado.setCodigo(codigo);
        resultado.setMensaje(mensaje);
        resultado.setDocumento(documento);
        return resultado;
    }

}
