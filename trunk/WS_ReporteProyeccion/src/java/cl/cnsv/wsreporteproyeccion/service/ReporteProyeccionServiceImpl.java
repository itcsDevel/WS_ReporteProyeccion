/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.service;

import cl.cnsv.crypto.encryption.CryptoUtil;
import cl.cnsv.wsreporteproyeccion.alfresco.ServicioAlfresco;
import cl.cnsv.wsreporteproyeccion.alfresco.ServicioAlfrescoImpl;
import cl.cnsv.wsreporteproyeccion.cliente.ClienteServicioCotizadorVida;
import cl.cnsv.wsreporteproyeccion.cliente.ClienteServiciosProyeccion;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.AntecedentesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Asegurableci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Beneficiarioci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.CoberturaVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Coberturaci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.CondicionadoVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Cotizacionci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionFlexInvGoldVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorro100VO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorro57BisVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorroFlexVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Edadci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.EleccionesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.EmailVO;
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
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.PlanVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Proyeccionci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.RentabilidadInversionci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.UsoInternoci;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.ViaCobroci;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaAhorroInternet;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.ResultadoProyeccionAhorroInternet;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.ResultadoProyeccionFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.ResultadoProyeccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.ResultadoProyeccionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.ResultadoProyeccionVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionAhorroInternet;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.jasperserver.ServicioJasperServer;
import cl.cnsv.wsreporteproyeccion.jasperserver.ServicioJasperServerJerseyImpl;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import cl.cnsv.wsreporteproyeccion.utils.ProyeccionBeanFactory;
import cl.cnsv.wsreporteproyeccion.validator.ReporteProyeccionValidator;
import cl.cnsv.wsreporteproyeccion.validator.ReporteProyeccionValidatorImpl;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputVO;
import cl.cnsv.wsreporteproyeccion.vo.ResultadoDocumentoVO;
import com.thoughtworks.xstream.XStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

/**
 *
 * @author ITCS09
 */
public class ReporteProyeccionServiceImpl implements ReporteProyeccionService {

    private static final Logger LOGGER = Logger.getLogger(ReporteProyeccionServiceImpl.class);
    private final ReporteProyeccionValidator validator;
    private ServicioAlfresco servicioAlfresco;
    private ServicioJasperServer servicioJasperServer;

    public ReporteProyeccionServiceImpl() {
        validator = new ReporteProyeccionValidatorImpl();
    }

    @Override
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {

        //<editor-fold defaultstate="collapsed" desc="Inicio">
        LOGGER.info("Iniciando el metodo obtenerProyeccion...");
        OutputObtenerProyeccionVO output = new OutputObtenerProyeccionVO();
        String codigo;
        String mensaje;
        String documento = null;
        XStream xStream = new XStream();
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Validacion de entrada">
        OutputVO outputValidacion = validator.validarObtenerProyeccion(input);
        if (!Integer.valueOf(Propiedades.getFuncProperty("codigo.ok")).equals(outputValidacion.getCodigo())) {
            codigo = Integer.toString(outputValidacion.getCodigo());
            mensaje = outputValidacion.getMensaje();
            LOGGER.info(mensaje);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Buscar el tipo de proyeccion de la poliza">
        ClienteServicioCotizadorVida clienteCotizadorVida;
        try {
            clienteCotizadorVida = new ClienteServicioCotizadorVida();
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        String numeroPoliza = input.getNumeroPoliza();
        InputProyeccionesVO inputProyecciones = new InputProyeccionesVO();
        inputProyecciones.setNumeroPoliza(numeroPoliza);
        String xmlInputProyecciones = xStream.toXML(inputProyecciones);
        LOGGER.info("Llamado a getTipoProyeccionVO - cotizadorVida: \n" + xmlInputProyecciones);
        OutputTipoProyeccionVO outputObtenerTipoProyeccion;
        try {
            outputObtenerTipoProyeccion = clienteCotizadorVida.getTipoProyeccionVO(inputProyecciones);
            String xmlOutputTipoProyeccion = xStream.toXML(outputObtenerTipoProyeccion);
            LOGGER.info("Respuesta de getTipoProyeccionVO - cotizadorVida: \n" + xmlOutputTipoProyeccion);
            int codigoObtenerTipoProyeccion = outputObtenerTipoProyeccion.getCodigo();
            if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoObtenerTipoProyeccion)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.mensaje");
                LOGGER.info(mensaje + ": " + outputObtenerTipoProyeccion.getMensaje());
                output.setCodigo(codigo);
                output.setMensaje(mensaje);
                return output;
            }

        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="En base al tipo de proyeccion ir a Alfresco o a JasperServer">
        int tipoProyeccion = outputObtenerTipoProyeccion.getTipoProyeccion();
        if (Integer.valueOf(Propiedades.getFuncProperty("codigo.tipoproyeccion.alfresco")).equals(tipoProyeccion)) {
            LOGGER.info("Llamado a buscarArchivoAlfrescoByName - servicio Alfresco: \n" + xmlInputProyecciones);
            servicioAlfresco = new ServicioAlfrescoImpl();
            ResultadoDocumentoVO outputAlfresco;
            try {
                outputAlfresco = servicioAlfresco.buscarArchivoAlfrescoByName(inputProyecciones);
                String xmlOutputAlfresco = xStream.toXML(outputAlfresco);
                LOGGER.info("Respuesta de buscarArchivoAlfrescoByName - servicio Alfresco: \n" + xmlOutputAlfresco);
                String codigoAlfresco = outputAlfresco.getCodigo();
                if (!Propiedades.getFuncProperty("alfresco.codigo.ok").equals(codigoAlfresco)) {
                    codigo = Propiedades.getFuncProperty("alfresco.error.codigo");
                    mensaje = Propiedades.getFuncProperty("alfresco.error.mensaje");
                    LOGGER.info(mensaje + ": " + outputAlfresco.getMensaje());
                    output.setCodigo(codigo);
                    output.setMensaje(mensaje);
                    return output;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("alfresco.error.codigo");
                mensaje = Propiedades.getFuncProperty("alfresco.error.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                output.setCodigo(codigo);
                output.setMensaje(mensaje);
                return output;
            }
            documento = outputAlfresco.getDocumento();
        } else if (Integer.valueOf(Propiedades.getFuncProperty("codigo.tipoproyeccion.jasperserver")).equals(tipoProyeccion)) {
            LOGGER.info("Llamado a jasperserver: \n" + xmlInputProyecciones);
            servicioJasperServer = new ServicioJasperServerJerseyImpl();
            ResultadoDocumentoVO outputJasperServer;
            try {
                outputJasperServer = servicioJasperServer.buscarArchivoByPoliza(inputProyecciones);
                String xmlOutputJasperServer = xStream.toXML(outputJasperServer);
                LOGGER.info("Respuesta de jasperserver: \n" + xmlOutputJasperServer);
                String codigoJasperServer = outputJasperServer.getCodigo();
                if (!Propiedades.getFuncProperty("jasperserver.ok.codigo").equals(codigoJasperServer)) {
                    codigo = Propiedades.getFuncProperty("jasperserver.error.codigo");
                    mensaje = Propiedades.getFuncProperty("jasperserver.error.mensaje");
                    LOGGER.info(mensaje + ": " + outputJasperServer.getMensaje());
                    output.setCodigo(codigo);
                    output.setMensaje(mensaje);
                    return output;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("jasperserver.error.codigo");
                mensaje = Propiedades.getFuncProperty("jasperserver.error.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                output.setCodigo(codigo);
                output.setMensaje(mensaje);
                return output;
            }
            documento = outputJasperServer.getDocumento();
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Terminar">
        codigo = Propiedades.getFuncProperty("codigo.ok");
        mensaje = Propiedades.getFuncProperty("mensaje.ok");
        output.setCodigo(codigo);
        output.setMensaje(mensaje);
        output.setProyeccion(documento);
        return output;
        //</editor-fold>
    }

    @Override
    public String obtenerXmlProyeccion(String numeroPoliza) {

        //<editor-fold defaultstate="collapsed" desc="Inicio">        
        String xml;
        XStream xStream = new XStream();
        Document document = DocumentFactory.getInstance().createDocument();
        String codigo;
        String mensaje;
        Element elemProyeccion = document.addElement("proyeccion");
        Element elemAsegurable;
        Element elemUsoInterno;
        Element elemPrimaTotal;
        Element elemParametros;
        Element elemEdadAhorro;
        Element elemEdad;
        Element elemCoberturas;
        Element elemCobertura;
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Obtener datos basicos de proyeccion">
        //Nodo xml proyeccion
        elemProyeccion.addElement("numPropuesta").addText(numeroPoliza);

        ClienteServicioCotizadorVida clienteCotizadorVida;
        try {
            clienteCotizadorVida = new ClienteServicioCotizadorVida();
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemProyeccion.addElement("codigo").addText(codigo);
            elemProyeccion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        InputProyeccionesVO inputProyecciones = new InputProyeccionesVO();
        inputProyecciones.setNumeroPoliza(numeroPoliza);
        String xmlInputProyecciones = xStream.toXML(inputProyecciones);
        LOGGER.info("Llamado a getProyeccionesVO - cotizadorVida: \n" + xmlInputProyecciones);
        OutputProyeccionesVO outputProyecciones;
        try {
            outputProyecciones = clienteCotizadorVida.getProyeccionesVO(inputProyecciones);
            String xmlOutputProyecciones = xStream.toXML(outputProyecciones);
            LOGGER.info("Respuesta de getProyeccionesVO - cotizadorVida: \n" + xmlOutputProyecciones);
            Integer codigoOutputProyecciones = outputProyecciones.getCodigo();
            if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputProyecciones)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyecciones.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyecciones.mensaje");
                LOGGER.info(mensaje + ": " + outputProyecciones.getMensaje());
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            AntecedentesVO antecedentes = outputProyecciones.getAntecedentes();
            String nombres = antecedentes.getNombre();
            if (nombres == null) {
                nombres = "";
            }
            String tipoFumador = antecedentes.getTipoFumador();
            if (tipoFumador == null) {
                tipoFumador = "";
            }
            String fechaNacimiento = antecedentes.getFechaNacimiento();
            if (fechaNacimiento == null) {
                fechaNacimiento = "";
            }
            int edadActuarial = antecedentes.getEdadActTitular();
            String sexo = antecedentes.getSexo();
            if (sexo == null) {
                sexo = "";
            }
            int edadConyuge = antecedentes.getEdadActConyuge();
            String edadHijos = antecedentes.getEdadActHijos();
            if (edadHijos == null) {
                edadHijos = "";
            }
            int edadPadres = antecedentes.getEdadActPadres();
            EleccionesVO elecciones = outputProyecciones.getElecciones();
            String plan = elecciones.getPlan();
            if (plan == null) {
                plan = "";
            }
            String formaPago = elecciones.getFormaPago();
            if (formaPago == null) {
                formaPago = "";
            }
            String portafolioSeleccionado = elecciones.getPortafolioSeleccionado();
            if (portafolioSeleccionado == null) {
                portafolioSeleccionado = "";
            }
            double primaReferencialAnual = elecciones.getPrimaReferencialAnual();
            double valorUf = elecciones.getValorUf();

            //Nodo xml asegurable
            elemAsegurable = elemProyeccion.addElement("asegurable");
            elemAsegurable.addElement("nombres").addText(nombres);
            elemAsegurable.addElement("apellidosPaterno").addText("");
            elemAsegurable.addElement("apellidosMaterno").addText("");
            elemAsegurable.addElement("tipoFumador").addText(tipoFumador);
            elemAsegurable.addElement("fechaNacimiento").addText(fechaNacimiento);
            elemAsegurable.addElement("edadActuarial").addText(Integer.toString(edadActuarial));
            elemAsegurable.addElement("sexo").addText(sexo);
            elemAsegurable.addElement("edadconyugue").addText(Integer.toString(edadConyuge));
            elemAsegurable.addElement("edadhijos").addText(edadHijos);
            elemAsegurable.addElement("edadpadres").addText(Integer.toString(edadPadres));

            //Nodo xml usoInterno
            elemUsoInterno = elemProyeccion.addElement("usoInterno");
            elemUsoInterno.addElement("plan").addText(plan);
            elemUsoInterno.addElement("codPlan").addText(plan);
            elemUsoInterno.addElement("formaPago").addText(formaPago);
            elemUsoInterno.addElement("portafolioseleccionado").addText(portafolioSeleccionado);
            elemUsoInterno.addElement("primareferencial").addText(Double.toString(primaReferencialAnual));

            //Nodo xml primaTotal
            elemPrimaTotal = elemProyeccion.addElement("primaTotal");
            elemPrimaTotal.addElement("valorMoneda").addText(Double.toString(valorUf));

            //Nodo xml coberturas
            elemCoberturas = elemProyeccion.addElement("coberturas");
            OutputProyeccionesVO.Coberturas coberturas = outputProyecciones.getCoberturas();
            List<CoberturaVO> coberturaList = coberturas.getCobertura();
            for (CoberturaVO coberturaVO : coberturaList) {
                elemCobertura = elemCoberturas.addElement("cobertura");
                String nombreCobertura = coberturaVO.getNombre();
                if (nombreCobertura == null) {
                    nombreCobertura = "";
                }
                elemCobertura.addElement("nombreCobertura").addText(nombreCobertura);
                Double capital = coberturaVO.getCapital();
                if (capital == null) {
                    elemCobertura.addElement("capital").addText("");
                } else {
                    elemCobertura.addElement("capital").addText(Double.toString(capital));
                }
                Integer npersonas = coberturaVO.getNpersonas();
                if (npersonas == null) {
                    elemCobertura.addElement("nasegurados").addText("");
                } else {
                    elemCobertura.addElement("nasegurados").addText(Integer.toString(npersonas));
                }
                Double primaReferencial = coberturaVO.getPrimaReferencialAnual();
                if (primaReferencial == null) {
                    elemCobertura.addElement("ntotalprima").addText("");
                } else {
                    elemCobertura.addElement("ntotalprima").addText(Double.toString(primaReferencial));
                }
            }
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyecciones.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyecciones.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemProyeccion.addElement("codigo").addText(codigo);
            elemProyeccion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Obtener tipo de proyeccion y codigo del producto">
        LOGGER.info("Llamado a getTipoProyeccionVO - cotizadorVida: \n" + xmlInputProyecciones);
        OutputTipoProyeccionVO outputObtenerTipoProyeccion;
        try {
            outputObtenerTipoProyeccion = clienteCotizadorVida.getTipoProyeccionVO(inputProyecciones);
            String xmlOutputTipoProyeccion = xStream.toXML(outputObtenerTipoProyeccion);
            LOGGER.info("Respuesta de getTipoProyeccionVO - cotizadorVida: \n" + xmlOutputTipoProyeccion);
            int codigoObtenerTipoProyeccion = outputObtenerTipoProyeccion.getCodigo();
            if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoObtenerTipoProyeccion)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.mensaje");
                LOGGER.info(mensaje + ": " + outputObtenerTipoProyeccion.getMensaje());
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemProyeccion.addElement("codigo").addText(codigo);
            elemProyeccion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Segun tipo de proyeccion y codigo de producto buscar informacion para proyeccion">        
        int nproduct = outputObtenerTipoProyeccion.getNproduct();
        if (Integer.valueOf(nproduct).equals(Integer.valueOf(Propiedades.getFuncProperty("codigo.va100")))) {
            OutputWSProyeccionVidAhorro100 outputWSProyeccionVidAhorro100;
            try {
                LOGGER.info("Llamado a getProyeccionesVidAhorro100VO - cotizadorVida: \n" + xmlInputProyecciones);
                outputWSProyeccionVidAhorro100 = clienteCotizadorVida.getProyeccionesVidAhorro100VO(inputProyecciones);
                String xmlOutputWSProyeccionVidAhorro100 = xStream.toXML(outputWSProyeccionVidAhorro100);
                LOGGER.info("Respuesta de getProyeccionesVidAhorro100VO - cotizadorVida: \n" + xmlOutputWSProyeccionVidAhorro100);
                Integer codigoOutputProyeccionVa100 = outputWSProyeccionVidAhorro100.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputProyeccionVa100)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionva100.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionva100.mensaje");
                    LOGGER.info(mensaje + ": " + outputWSProyeccionVidAhorro100.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionva100.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionva100.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo xml usoInterno
            DatosSimulacionVidAhorro100VO datosSimulacionVidAhorro100VO = outputWSProyeccionVidAhorro100.getDatosSimulacionVidAhorro100VO();
            Double supuestoRentabilidad = datosSimulacionVidAhorro100VO.getSupuestoRentabilidad();
            if (supuestoRentabilidad == null) {
                elemUsoInterno.addElement("supuestorentabilidad").addText("");
            } else {
                elemUsoInterno.addElement("supuestorentabilidad").addText(Double.toString(supuestoRentabilidad));
            }
            elemUsoInterno.addElement("rentaImponible").addText("");

            //Nodo xml primaTotal
            Double primaProyectadaSFP = datosSimulacionVidAhorro100VO.getPrimaProyectadaSFP();
            if (primaProyectadaSFP == null) {
                elemPrimaTotal.addElement("primaProyectada").addText("");
            } else {
                elemPrimaTotal.addElement("primaProyectada").addText(Double.toString(primaProyectadaSFP));
            }

            //Nodo xml parametros
            elemParametros = elemProyeccion.addElement("parametros");
            elemParametros.addElement("recargosimulador").addText("");

            //Obtener el condicionado particular (POL-CAD)
            InputCondicionadoVO inputCondicionadoVO = new InputCondicionadoVO();
            inputCondicionadoVO.setBranch(Propiedades.getFuncProperty("codigo.ramo"));
            inputCondicionadoVO.setCover(Propiedades.getFuncProperty("codigo.va100.cobertura.fallecimiento"));
            inputCondicionadoVO.setModulec(Propiedades.getFuncProperty("codigo.modulo"));
            inputCondicionadoVO.setProduct(Propiedades.getFuncProperty("codigo.va100"));
            String xmlInputCondicionado = xStream.toXML(inputCondicionadoVO);
            LOGGER.info("Llamado a getNombreCondicionado - cotizadorVida: \n" + xmlInputCondicionado);
            OutputCondicionadoVO outputCondicionadoVO;
            try {
                outputCondicionadoVO = clienteCotizadorVida.getNombreCondicionado(inputCondicionadoVO);
                String xmlOutputCondicionadoVO = xStream.toXML(outputCondicionadoVO);
                LOGGER.info("Respuesta getNombreCondicionado - cotizadorVida: \n" + xmlOutputCondicionadoVO);
                Integer codigoOutputCondicionado = outputCondicionadoVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputCondicionado)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                    LOGGER.info(mensaje + ": " + outputCondicionadoVO.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            List<CondicionadoVO> cursorCondicionado = outputCondicionadoVO.getCursor();
            CondicionadoVO condicionado = cursorCondicionado.get(0);
            String scondsvs = condicionado.getScondsvs();
            if (scondsvs == null) {
                scondsvs = "";
            }
            elemUsoInterno.addElement("codigoSvsPol").addText(scondsvs);

            //Construye entrada para el servicio de proyeccion
            TransaccionVidAhorro100 inputProyeccionVa100;
            try {
                inputProyeccionVa100
                        = ProyeccionBeanFactory.buildVa100(outputWSProyeccionVidAhorro100);
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("error.beanfactory.proyeccionva100.codigo");
                mensaje = Propiedades.getFuncProperty("error.beanfactory.proyeccionva100.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Consulta al servicio de proyeccion
            ClienteServiciosProyeccion clienteProyeccion;
            try {
                clienteProyeccion = new ClienteServiciosProyeccion();
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.login.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.login.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            String xmlInputProyeccionVa100 = xStream.toXML(inputProyeccionVa100);
            LOGGER.info("Llamado a getProyeccionVidAhorro100 - proyeccion: \n" + xmlInputProyeccionVa100);
            RespuestaVidAhorro100 outputProyeccionVidAhorro100;
            try {
                outputProyeccionVidAhorro100 = clienteProyeccion.getProyeccionVidAhorro100(inputProyeccionVa100);
                String xmlOutputProyeccionVidAhorro100 = xStream.toXML(outputProyeccionVidAhorro100);
                LOGGER.info("Respuesta de getProyeccionVidAhorro100 - proyeccion: \n" + xmlOutputProyeccionVidAhorro100);
                String codigoProyeccionVidAhorro100 = outputProyeccionVidAhorro100.getCodigo();
                if (!Propiedades.getFuncProperty("ws.proyeccion.codigo.ok").equals(codigoProyeccionVidAhorro100)) {
                    codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionva100.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionva100.mensaje");
                    LOGGER.info(mensaje + ": " + outputProyeccionVidAhorro100.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionva100.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionva100.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo edadAhorro
            elemEdadAhorro = elemProyeccion.addElement("edadahorro");

            //Ciclo con datos de proyeccion
            List<ResultadoProyeccionVidAhorro100> resultadosProyeccion = outputProyeccionVidAhorro100.getResultadosProyeccion();
            for (ResultadoProyeccionVidAhorro100 resultadoProyeccionVidAhorro100 : resultadosProyeccion) {
                elemEdad = elemEdadAhorro.addElement("edad");
                Integer finalAnnio = resultadoProyeccionVidAhorro100.getFinalAnnio();
                if (finalAnnio == null) {
                    elemEdad.addElement("finalano").addText("");
                } else {
                    elemEdad.addElement("finalano").addText(Integer.toString(finalAnnio));
                }
                Integer edadActuarial = resultadoProyeccionVidAhorro100.getEdadActuarial();
                if (edadActuarial == null) {
                    elemEdad.addElement("edadactuarial").addText("");
                } else {
                    elemEdad.addElement("edadactuarial").addText(Integer.toString(edadActuarial));
                }
                Double primaAcumulada = resultadoProyeccionVidAhorro100.getPrimaAcumulada();
                if (primaAcumulada == null) {
                    elemEdad.addElement("primaacumulada").addText("");
                } else {
                    elemEdad.addElement("primaacumulada").addText(Double.toString(primaAcumulada));
                }
                Double valorPoliza = resultadoProyeccionVidAhorro100.getValorPoliza();
                if (valorPoliza == null) {
                    elemEdad.addElement("valorpoliza").addText("");
                } else {
                    elemEdad.addElement("valorpoliza").addText(Double.toString(valorPoliza));
                }
                Double indemnizacionFallecimiento = resultadoProyeccionVidAhorro100.getIndemnizacionFallecimiento();
                if (indemnizacionFallecimiento == null) {
                    elemEdad.addElement("indemnizacionfallecimiento").addText("");
                } else {
                    elemEdad.addElement("indemnizacionfallecimiento").addText(Double.toString(indemnizacionFallecimiento));
                }
                elemEdad.addElement("relleno").addText("I");
                elemEdad.addElement("valorpoliza57bis").addText("");
            }
        } //end codigo.va100
        else if (Integer.valueOf(nproduct).equals(Integer.valueOf(Propiedades.getFuncProperty("codigo.57bis")))) {
            OutputWSProyeccionVidAhorro57Bis outputProyeccionesVidAhorro57BisVO;
            try {
                LOGGER.info("Llamado a getProyeccionesVidAhorro57BisVO - cotizadorVida: \n" + xmlInputProyecciones);
                outputProyeccionesVidAhorro57BisVO = clienteCotizadorVida.getProyeccionesVidAhorro57BisVO(inputProyecciones);
                String xmlOutputProyeccionesVidAhorro57BisVO = xStream.toXML(outputProyeccionesVidAhorro57BisVO);
                LOGGER.info("Respuesta de getProyeccionesVidAhorro57BisVO - cotizadorVida: \n" + xmlOutputProyeccionesVidAhorro57BisVO);
                Integer codigoOutputProyeccionesVidAhorro57BisVO = outputProyeccionesVidAhorro57BisVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputProyeccionesVidAhorro57BisVO)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccion57bis.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccion57bis.mensaje");
                    LOGGER.info(mensaje + ": " + outputProyeccionesVidAhorro57BisVO.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccion57bis.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccion57bis.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo xml usoInterno
            DatosSimulacionVidAhorro57BisVO datosSimulacionVidAhorro57BisVO = outputProyeccionesVidAhorro57BisVO.getDatosSimulacionVidAhorro57BisVO();
            Double supuestoRentabilidad = datosSimulacionVidAhorro57BisVO.getSupuestoRentabilidad();
            if (supuestoRentabilidad == null) {
                elemUsoInterno.addElement("supuestorentabilidad").addText("");
            } else {
                elemUsoInterno.addElement("supuestorentabilidad").addText(Double.toString(supuestoRentabilidad));
            }
            elemUsoInterno.addElement("rentaImponible").addText("");

            //Nodo xml primaTotal
            Double primaProyectadaSFP = datosSimulacionVidAhorro57BisVO.getPrimaProyectadaSFP();
            if (primaProyectadaSFP == null) {
                elemPrimaTotal.addElement("primaProyectada").addText("");
            } else {
                elemPrimaTotal.addElement("primaProyectada").addText(Double.toString(primaProyectadaSFP));
            }

            //Nodo xml parametros
            elemParametros = elemProyeccion.addElement("parametros");
            elemParametros.addElement("recargosimulador").addText("");

            //Obtener el condicionado particular (POL-CAD)
            InputCondicionadoVO inputCondicionadoVO = new InputCondicionadoVO();
            inputCondicionadoVO.setBranch(Propiedades.getFuncProperty("codigo.ramo"));
            inputCondicionadoVO.setCover(Propiedades.getFuncProperty("codigo.57bis.cobertura.fallecimiento"));
            inputCondicionadoVO.setModulec(Propiedades.getFuncProperty("codigo.modulo"));
            inputCondicionadoVO.setProduct(Propiedades.getFuncProperty("codigo.57bis"));
            String xmlInputCondicionado = xStream.toXML(inputCondicionadoVO);
            LOGGER.info("Llamado a getNombreCondicionado - cotizadorVida: \n" + xmlInputCondicionado);
            OutputCondicionadoVO outputCondicionadoVO;
            try {
                outputCondicionadoVO = clienteCotizadorVida.getNombreCondicionado(inputCondicionadoVO);
                String xmlOutputCondicionadoVO = xStream.toXML(outputCondicionadoVO);
                LOGGER.info("Respuesta getNombreCondicionado - cotizadorVida: \n" + xmlOutputCondicionadoVO);
                Integer codigoOutputCondicionado = outputCondicionadoVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputCondicionado)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                    LOGGER.info(mensaje + ": " + outputCondicionadoVO.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            List<CondicionadoVO> cursorCondicionado = outputCondicionadoVO.getCursor();
            CondicionadoVO condicionado = cursorCondicionado.get(0);
            String scondsvs = condicionado.getScondsvs();
            if (scondsvs == null) {
                scondsvs = "";
            }
            elemUsoInterno.addElement("codigoSvsPol").addText(scondsvs);

            //Construye entrada para el servicio de proyeccion
            TransaccionVidAhorro57Bis inputProyeccion87Bis;
            try {
                inputProyeccion87Bis
                        = ProyeccionBeanFactory.build57Bis(outputProyeccionesVidAhorro57BisVO);
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("error.beanfactory.proyeccionva57bis.codigo");
                mensaje = Propiedades.getFuncProperty("error.beanfactory.proyeccionv57bis.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Consulta al servicio de proyeccion
            ClienteServiciosProyeccion clienteProyeccion;
            try {
                clienteProyeccion = new ClienteServiciosProyeccion();
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.login.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.login.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            String xmlInputProyeccion57Bis = xStream.toXML(inputProyeccion87Bis);
            LOGGER.info("Llamado a getProyeccionVidAhorro57Bis - proyeccion: \n" + xmlInputProyeccion57Bis);
            RespuestaVidAhorro57Bis outputProyeccion57Bis;
            try {
                outputProyeccion57Bis = clienteProyeccion.getProyeccionVidAhorro57Bis(inputProyeccion87Bis);
                String xmlOutputProyeccion57Bis = xStream.toXML(outputProyeccion57Bis);
                LOGGER.info("Respuesta de getProyeccionVidAhorro57Bis - proyeccion: \n" + xmlOutputProyeccion57Bis);
                String codigoOutputProyeccion57Bis = outputProyeccion57Bis.getCodigo();
                if (!Propiedades.getFuncProperty("ws.proyeccion.codigo.ok").equals(codigoOutputProyeccion57Bis)) {
                    codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccion57bis.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccion57bis.mensaje");
                    LOGGER.info(mensaje + ": " + outputProyeccion57Bis.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccion57bis.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccion57bis.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo edadAhorro
            elemEdadAhorro = elemProyeccion.addElement("edadahorro");

            //Ciclo con datos de proyeccion
            List<ResultadoProyeccionVidAhorro57Bis> resultadosProyeccion = outputProyeccion57Bis.getResultadosProyeccion();
            for (ResultadoProyeccionVidAhorro57Bis resultadoProyeccion57Bis : resultadosProyeccion) {
                elemEdad = elemEdadAhorro.addElement("edad");
                Integer finalAnnio = resultadoProyeccion57Bis.getFinalAnnio();
                if (finalAnnio == null) {
                    elemEdad.addElement("finalano").addText("");
                } else {
                    elemEdad.addElement("finalano").addText(Integer.toString(finalAnnio));
                }
                Integer edadActuarial = resultadoProyeccion57Bis.getEdadActuarial();
                if (edadActuarial == null) {
                    elemEdad.addElement("edadactuarial").addText("");
                } else {
                    elemEdad.addElement("edadactuarial").addText(Integer.toString(edadActuarial));
                }
                Double primaAcumulada = resultadoProyeccion57Bis.getPrimaPagadaAcumulada();
                if (primaAcumulada == null) {
                    elemEdad.addElement("primaacumulada").addText("");
                } else {
                    elemEdad.addElement("primaacumulada").addText(Double.toString(primaAcumulada));
                }
                Double valorPoliza = resultadoProyeccion57Bis.getValorPoliza();
                if (valorPoliza == null) {
                    elemEdad.addElement("valorpoliza").addText("");
                    elemEdad.addElement("valorpoliza57bis").addText("");
                } else {
                    elemEdad.addElement("valorpoliza").addText(Double.toString(valorPoliza));
                    elemEdad.addElement("valorpoliza57bis").addText(Double.toString(valorPoliza));
                }
                Double indemnizacionFallecimiento = resultadoProyeccion57Bis.getIndemnizacionFallecimiento();
                if (indemnizacionFallecimiento == null) {
                    elemEdad.addElement("indemnizacionfallecimiento").addText("");
                } else {
                    elemEdad.addElement("indemnizacionfallecimiento").addText(Double.toString(indemnizacionFallecimiento));
                }
                elemEdad.addElement("relleno").addText("I");
            }

        } //end codigo.57bis
        else if (Integer.valueOf(nproduct).equals(Integer.valueOf(Propiedades.getFuncProperty("codigo.flex")))) {
            OutputWSProyeccionVidAhorroFlex outputProyeccionesVidAhorroFlexVO;
            try {
                LOGGER.info("Llamado a getProyeccionesVidAhorroFlexVO - cotizadorVida: \n" + xmlInputProyecciones);
                outputProyeccionesVidAhorroFlexVO = clienteCotizadorVida.getProyeccionesVidAhorroFlexVO(inputProyecciones);
                String xmlOutputProyeccionesVidAhorroFlexVO = xStream.toXML(outputProyeccionesVidAhorroFlexVO);
                LOGGER.info("Respuesta de getProyeccionesVidAhorroFlexVO - cotizadorVida: \n" + xmlOutputProyeccionesVidAhorroFlexVO);
                Integer codigoOutputProyeccionesVidAhorroFlexVO = outputProyeccionesVidAhorroFlexVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputProyeccionesVidAhorroFlexVO)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionflex.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionflex.mensaje");
                    LOGGER.info(mensaje + ": " + outputProyeccionesVidAhorroFlexVO.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionflex.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionflex.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo xml usoInterno
            DatosSimulacionVidAhorroFlexVO datosSimulacionVidAhorroFlexVO = outputProyeccionesVidAhorroFlexVO.getDatosSimulacionVidAhorroFlexVO();
            Double supuestoRentabilidad = datosSimulacionVidAhorroFlexVO.getSupuestoRentabilidad();
            if (supuestoRentabilidad == null) {
                elemUsoInterno.addElement("supuestorentabilidad").addText("");
            } else {
                elemUsoInterno.addElement("supuestorentabilidad").addText(Double.toString(supuestoRentabilidad));
            }
            elemUsoInterno.addElement("rentaImponible").addText("");

            //Nodo xml primaTotal
            Double primaProyectadaSFP = datosSimulacionVidAhorroFlexVO.getPrimaProyectadaSFP();
            if (primaProyectadaSFP == null) {
                elemPrimaTotal.addElement("primaProyectada").addText("");
            } else {
                elemPrimaTotal.addElement("primaProyectada").addText(Double.toString(primaProyectadaSFP));
            }

            //Nodo xml parametros
            elemParametros = elemProyeccion.addElement("parametros");
            elemParametros.addElement("recargosimulador").addText("");

            //Obtener el condicionado particular (POL-CAD)
            InputCondicionadoVO inputCondicionadoVO = new InputCondicionadoVO();
            inputCondicionadoVO.setBranch(Propiedades.getFuncProperty("codigo.ramo"));
            inputCondicionadoVO.setCover(Propiedades.getFuncProperty("codigo.flex.cobertura.fallecimiento"));
            inputCondicionadoVO.setModulec(Propiedades.getFuncProperty("codigo.modulo"));
            inputCondicionadoVO.setProduct(Propiedades.getFuncProperty("codigo.flex"));
            String xmlInputCondicionado = xStream.toXML(inputCondicionadoVO);
            LOGGER.info("Llamado a getNombreCondicionado - cotizadorVida: \n" + xmlInputCondicionado);
            OutputCondicionadoVO outputCondicionadoVO;
            try {
                outputCondicionadoVO = clienteCotizadorVida.getNombreCondicionado(inputCondicionadoVO);
                String xmlOutputCondicionadoVO = xStream.toXML(outputCondicionadoVO);
                LOGGER.info("Respuesta getNombreCondicionado - cotizadorVida: \n" + xmlOutputCondicionadoVO);
                Integer codigoOutputCondicionado = outputCondicionadoVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputCondicionado)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                    LOGGER.info(mensaje + ": " + outputCondicionadoVO.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            List<CondicionadoVO> cursorCondicionado = outputCondicionadoVO.getCursor();
            CondicionadoVO condicionado = cursorCondicionado.get(0);
            String scondsvs = condicionado.getScondsvs();
            if (scondsvs == null) {
                scondsvs = "";
            }
            elemUsoInterno.addElement("codigoSvsPol").addText(scondsvs);

            //Construye entrada para el servicio de proyeccion
            TransaccionVidAhorroFlex inputProyeccionVaFlex;
            try {
                inputProyeccionVaFlex
                        = ProyeccionBeanFactory.buildFlex(outputProyeccionesVidAhorroFlexVO);
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("error.beanfactory.proyeccionflex.codigo");
                mensaje = Propiedades.getFuncProperty("error.beanfactory.proyeccionflex.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Consulta al servicio de proyeccion
            ClienteServiciosProyeccion clienteProyeccion;
            try {
                clienteProyeccion = new ClienteServiciosProyeccion();
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.login.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.login.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            String xmlInputProyeccionVa100 = xStream.toXML(inputProyeccionVaFlex);
            LOGGER.info("Llamado a getProyeccionVidAhorroFlex - proyeccion: \n" + xmlInputProyeccionVa100);
            RespuestaVidAhorroFlex outputProyeccionVidAhorroFlex;
            try {
                outputProyeccionVidAhorroFlex = clienteProyeccion.getProyeccionVidAhorroFlex(inputProyeccionVaFlex);
                String xmlOutputProyeccionVidAhorroFlex = xStream.toXML(outputProyeccionVidAhorroFlex);
                LOGGER.info("Respuesta de getProyeccionVidAhorroFlex - proyeccion: \n" + xmlOutputProyeccionVidAhorroFlex);
                String codigoOutputProyeccionVidAhorroFlex = outputProyeccionVidAhorroFlex.getCodigo();
                if (!Propiedades.getFuncProperty("ws.proyeccion.codigo.ok").equals(codigoOutputProyeccionVidAhorroFlex)) {
                    codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionflex.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionflex.mensaje");
                    LOGGER.info(mensaje + ": " + outputProyeccionVidAhorroFlex.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionflex.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionflex.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo edadAhorro
            elemEdadAhorro = elemProyeccion.addElement("edadahorro");

            //Ciclo con datos de proyeccion
            List<ResultadoProyeccionVidAhorroFlex> resultadosProyeccion = outputProyeccionVidAhorroFlex.getResultadosProyeccion();
            for (ResultadoProyeccionVidAhorroFlex resultadoProyeccion : resultadosProyeccion) {
                elemEdad = elemEdadAhorro.addElement("edad");
                Integer finalAnnio = resultadoProyeccion.getFinalAnnio();
                if (finalAnnio == null) {
                    elemEdad.addElement("finalano").addText("");
                } else {
                    elemEdad.addElement("finalano").addText(Integer.toString(finalAnnio));
                }
                Integer edadActuarial = resultadoProyeccion.getEdadActuarial();
                if (edadActuarial == null) {
                    elemEdad.addElement("edadactuarial").addText("");
                } else {
                    elemEdad.addElement("edadactuarial").addText(Integer.toString(edadActuarial));
                }
                Double primaAcumulada = resultadoProyeccion.getPrimaAcumulada();
                if (primaAcumulada == null) {
                    elemEdad.addElement("primaacumulada").addText("");
                } else {
                    elemEdad.addElement("primaacumulada").addText(Double.toString(primaAcumulada));
                }
                Double valorPoliza = resultadoProyeccion.getValorPoliza();
                if (valorPoliza == null) {
                    elemEdad.addElement("valorpoliza").addText("");
                } else {
                    elemEdad.addElement("valorpoliza").addText(Double.toString(valorPoliza));
                }
                Double indemnizacionFallecimiento = resultadoProyeccion.getIndemnizacionFallecimiento();
                if (indemnizacionFallecimiento == null) {
                    elemEdad.addElement("indemnizacionfallecimiento").addText("");
                } else {
                    elemEdad.addElement("indemnizacionfallecimiento").addText(Double.toString(indemnizacionFallecimiento));
                }
                elemEdad.addElement("relleno").addText("I");
                elemEdad.addElement("valorpoliza57bis").addText("");
            }
        } //end codigo.flex
        else if (Integer.valueOf(nproduct).equals(Integer.valueOf(Propiedades.getFuncProperty("codigo.figold")))) {
            OutputWSProyeccionFlexInvGlodVO outputGetProyeccionesFlexInvGold;
            try {
                LOGGER.info("Llamado a getProyeccionesFlexInvGlodVO - cotizadorVida: \n" + xmlInputProyecciones);
                outputGetProyeccionesFlexInvGold = clienteCotizadorVida.getProyeccionesFlexInvGlodVO(inputProyecciones);
                String xmlOutputGetProyeccionesFlexInvGlodVO = xStream.toXML(outputGetProyeccionesFlexInvGold);
                LOGGER.info("Respuesta de getProyeccionesFlexInvGlodVO - cotizadorVida: \n" + xmlOutputGetProyeccionesFlexInvGlodVO);
                Integer codigoOutputGetProyeccionesFlexInvGold = outputGetProyeccionesFlexInvGold.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputGetProyeccionesFlexInvGold)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionfigold.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionfigold.mensaje");
                    LOGGER.info(mensaje + ": " + outputGetProyeccionesFlexInvGold.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionfigold.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.proyeccionfigold.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo xml usoInterno
            DatosSimulacionFlexInvGoldVO datosSimulacionFlexInvGoldVO = outputGetProyeccionesFlexInvGold.getDatosSimulacionFlexInvGoldVO();
            Double rentabilidadAnual = datosSimulacionFlexInvGoldVO.getRentabilidadAnual();
            if (rentabilidadAnual == null) {
                elemUsoInterno.addElement("rentabilidadAnual").addText("");
            } else {
                elemUsoInterno.addElement("rentabilidadAnual").addText(Double.toString(rentabilidadAnual));
            }
            elemUsoInterno.addElement("rentaImponible").addText("");

            //Nodo xml primaTotal
            elemPrimaTotal = elemProyeccion.addElement("primaTotal");
            //TODO completar valorMoneda (UF) en campo primaTotal
            elemPrimaTotal.addElement("valorMoneda").addText("");

            //Nodo xml parametros
            elemParametros = elemProyeccion.addElement("parametros");
            elemParametros.addElement("recargosimulador").addText("");

            //Obtener el condicionado particular (POL-CAD)
            InputCondicionadoVO inputCondicionadoVO = new InputCondicionadoVO();
            inputCondicionadoVO.setBranch(Propiedades.getFuncProperty("codigo.ramo"));
            inputCondicionadoVO.setCover(Propiedades.getFuncProperty("codigo.figold.cobertura.fallecimiento"));
            inputCondicionadoVO.setModulec(Propiedades.getFuncProperty("codigo.modulo"));
            inputCondicionadoVO.setProduct(Propiedades.getFuncProperty("codigo.figold"));
            String xmlInputCondicionado = xStream.toXML(inputCondicionadoVO);
            LOGGER.info("Llamado a getNombreCondicionado - cotizadorVida: \n" + xmlInputCondicionado);
            OutputCondicionadoVO outputCondicionadoVO;
            try {
                outputCondicionadoVO = clienteCotizadorVida.getNombreCondicionado(inputCondicionadoVO);
                String xmlOutputCondicionadoVO = xStream.toXML(outputCondicionadoVO);
                LOGGER.info("Respuesta getNombreCondicionado - cotizadorVida: \n" + xmlOutputCondicionadoVO);
                Integer codigoOutputCondicionado = outputCondicionadoVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputCondicionado)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                    LOGGER.info(mensaje + ": " + outputGetProyeccionesFlexInvGold.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            List<CondicionadoVO> cursorCondicionado = outputCondicionadoVO.getCursor();
            CondicionadoVO condicionado = cursorCondicionado.get(0);
            String scondsvs = condicionado.getScondsvs();
            if (scondsvs == null) {
                scondsvs = "";
            }
            elemUsoInterno.addElement("codigoSvsPol").addText(scondsvs);

            //Construye entrada para el servicio de proyeccion
            TransaccionFlexInvGold inputProyeccionFlexInvGold;
            try {
                inputProyeccionFlexInvGold = ProyeccionBeanFactory.buildFIGold(outputGetProyeccionesFlexInvGold);
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("error.beanfactory.proyeccionfigold.codigo");
                mensaje = Propiedades.getFuncProperty("error.beanfactory.proyeccionfigold.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Consulta al servicio de proyeccion
            ClienteServiciosProyeccion clienteProyeccion;
            try {
                clienteProyeccion = new ClienteServiciosProyeccion();
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.login.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.login.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            String xmlInputProyeccionFlexInvGold = xStream.toXML(inputProyeccionFlexInvGold);
            LOGGER.info("Llamado a getProyeccionFlexInvGold - proyeccion: \n" + xmlInputProyeccionFlexInvGold);
            RespuestaFlexInvGold outputProyeccionFlexInvGold;
            try {
                outputProyeccionFlexInvGold = clienteProyeccion.getProyeccionFlexInvGold(inputProyeccionFlexInvGold);
                String xmlOutputProyeccionFlexInvGold = xStream.toXML(outputProyeccionFlexInvGold);
                LOGGER.info("Respuesta de getProyeccionFlexInvGold - proyeccion: \n" + xmlOutputProyeccionFlexInvGold);
                String codigoOutputProyeccionFlexInvGold = outputProyeccionFlexInvGold.getCodigo();
                if (!Propiedades.getFuncProperty("ws.proyeccion.codigo.ok").equals(codigoOutputProyeccionFlexInvGold)) {
                    codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionfigold.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionfigold.mensaje");
                    LOGGER.info(mensaje + ": " + outputProyeccionFlexInvGold.getMensaje());
                    elemProyeccion.addElement("codigo").addText(codigo);
                    elemProyeccion.addElement("mensaje").addText(mensaje);
                    xml = document.asXML();
                    return xml;
                }
            } catch (Exception e) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionfigold.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionfigold.mensaje");
                LOGGER.error(mensaje + ": " + e.getMessage(), e);
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }

            //Nodo edadAhorro
            elemEdadAhorro = elemProyeccion.addElement("edadahorro");

            //Ciclo con datos de proyeccion
            List<ResultadoProyeccionFlexInvGold> resultadosProyeccion = outputProyeccionFlexInvGold.getResultadosProyeccion();
            for (ResultadoProyeccionFlexInvGold resultadoProyeccionFlexInvGold : resultadosProyeccion) {
                elemEdad = elemEdadAhorro.addElement("edad");
                Integer finalAnnio = resultadoProyeccionFlexInvGold.getFinalAnnio();
                if (finalAnnio == null) {
                    elemEdad.addElement("finalano").addText("");
                } else {
                    elemEdad.addElement("finalano").addText(Integer.toString(finalAnnio));
                }
                Integer edadActuarial = resultadoProyeccionFlexInvGold.getEdadActuarial();
                if (edadActuarial == null) {
                    elemEdad.addElement("edadactuarial").addText("");
                } else {
                    elemEdad.addElement("edadactuarial").addText(Integer.toString(edadActuarial));
                }
                Double primaAcumulada = resultadoProyeccionFlexInvGold.getPrimaAcumulada();
                if (primaAcumulada == null) {
                    elemEdad.addElement("primaacumulada").addText("");
                } else {
                    elemEdad.addElement("primaacumulada").addText(Double.toString(primaAcumulada));
                }
                Double valorPoliza = resultadoProyeccionFlexInvGold.getValorPoliza();
                if (valorPoliza == null) {
                    elemEdad.addElement("valorpoliza").addText("");
                } else {
                    elemEdad.addElement("valorpoliza").addText(Double.toString(valorPoliza));
                }
                Double indemnizacionFallecimiento = resultadoProyeccionFlexInvGold.getIndemnizacionFallecimiento();
                if (indemnizacionFallecimiento == null) {
                    elemEdad.addElement("indemnizacionfallecimiento").addText("");
                } else {
                    elemEdad.addElement("indemnizacionfallecimiento").addText(Double.toString(indemnizacionFallecimiento));
                }
                elemEdad.addElement("relleno").addText("I");
                elemEdad.addElement("valorpoliza57bis").addText("");
            }
        } //end codigo.figold
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Termino">
        codigo = Propiedades.getFuncProperty("codigo.ok");
        mensaje = Propiedades.getFuncProperty("mensaje.ok");
        LOGGER.info(mensaje);
        elemProyeccion.addElement("codigo").addText(codigo);
        elemProyeccion.addElement("mensaje").addText(mensaje);
        xml = document.asXML();
        return xml;
        //</editor-fold>

    }

    @Override
    public OutputObtenerCotizacionInternetVO obtenerCotizacionInternet(InputObtenerCotizacionInternetVO input) {

        //<editor-fold defaultstate="collapsed" desc="Inicio">
        LOGGER.info("Iniciando el metodo obtenerCotizacionInternet...");
        OutputObtenerCotizacionInternetVO output = new OutputObtenerCotizacionInternetVO();
        String codigo;
        String mensaje;
        XStream xStream = new XStream();
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Validacion de entrada">
        OutputVO outputValidacion = validator.validarObtenerCotizacionInternet(input);
        if (!Integer.valueOf(Propiedades.getFuncProperty("codigo.ok")).equals(outputValidacion.getCodigo())) {
            codigo = Integer.toString(outputValidacion.getCodigo());
            mensaje = outputValidacion.getMensaje();
            LOGGER.info(mensaje);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Ir a JasperServer">
        String numeroCotizacion = input.getNumeroCotizacion();
        InputCotizacionInternet inputCotizacionInternet = new InputCotizacionInternet();
        inputCotizacionInternet.setIdCotizacion(numeroCotizacion);
        String xmlInputCotizacionInternet = xStream.toXML(inputCotizacionInternet);
        LOGGER.info("Llamado a jasperserver: \n" + xmlInputCotizacionInternet);
        servicioJasperServer = new ServicioJasperServerJerseyImpl();
        ResultadoDocumentoVO outputJasperServer;
        try {
            outputJasperServer = servicioJasperServer.buscarArchivoByCotizacion(inputCotizacionInternet);
            String xmlOutputJasperServer = xStream.toXML(outputJasperServer);
            LOGGER.info("Respuesta de jasperserver: \n" + xmlOutputJasperServer);
            String codigoJasperServer = outputJasperServer.getCodigo();
            if (!Propiedades.getFuncProperty("jasperserver.ok.codigo").equals(codigoJasperServer)) {
                codigo = Propiedades.getFuncProperty("jasperserver.error.codigo");
                mensaje = Propiedades.getFuncProperty("jasperserver.error.mensaje");
                LOGGER.info(mensaje + ": " + outputJasperServer.getMensaje());
                output.setCodigo(codigo);
                output.setMensaje(mensaje);
                return output;
            }
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("jasperserver.error.codigo");
            mensaje = Propiedades.getFuncProperty("jasperserver.error.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Ir a buscar datos email al servicio cotizador vida">
        ClienteServicioCotizadorVida clienteCotizadorVida;
        try {
            clienteCotizadorVida = new ClienteServicioCotizadorVida();
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }

        //Se busca el nombre del asegurado, glosa del plan y numero de propuesta        
        LOGGER.info("Llamado a getDatosEmailCotizacionInternet - cotizadorVida: \n" + xmlInputCotizacionInternet);
        OutputEmailCotizacionInternetVO outputEmail;
        try {
            outputEmail = clienteCotizadorVida.getDatosEmailCotizacionInternet(inputCotizacionInternet);
            String xmlOutputEmail = xStream.toXML(outputEmail);
            LOGGER.info("Respuesta de getDatosEmailCotizacionInternet - cotizadorVida: \n" + xmlOutputEmail);
            String codigoOutputEmail = outputEmail.getCodigo();
            if (!Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok").equals(codigoOutputEmail)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.datosemail.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.datosemail.mensaje");
                LOGGER.info(mensaje + ": " + outputEmail.getMensaje());
                output.setCodigo(codigo);
                output.setMensaje(mensaje);
                return output;
            }

        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.datosemail.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.datosemail.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Enviar correo con documento adjunto">
        String documento = outputJasperServer.getDocumento();
        try {
            EmailVO datosEmail = outputEmail.getDatosEmail();
            String htmlBody = Propiedades.getFuncProperty("email.html");
            String nombreAsegurable = datosEmail.getNombreAsegurable();
            if (nombreAsegurable == null) {
                nombreAsegurable = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[NOMBRE_ASEGURADO]", nombreAsegurable);
            String glosaPlan = datosEmail.getGlosaPlan();
            if (glosaPlan == null) {
                glosaPlan = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[GLOSA_PLAN]", glosaPlan);
            String numeroPropuesta = datosEmail.getNumeroPropuesta();
            if (numeroPropuesta == null) {
                numeroPropuesta = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[NRO_PROPUESTA]", numeroPropuesta);

            //Parametrizar imagenes
            String imgBulletBgVerde = Propiedades.getFuncProperty("email.images.bulletbgverde");
            if (imgBulletBgVerde == null) {
                imgBulletBgVerde = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_BULLET_BG_VERDE]", imgBulletBgVerde);

            String imgFace = Propiedades.getFuncProperty("email.images.face");
            if (imgFace == null) {
                imgFace = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_FACE]", imgFace);

            String imgTwitter = Propiedades.getFuncProperty("email.images.twitter");
            if (imgTwitter == null) {
                imgTwitter = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_TWITTER]", imgTwitter);

            String imgYoutube = Propiedades.getFuncProperty("email.images.youtube");
            if (imgYoutube == null) {
                imgYoutube = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_YOUTUBE]", imgYoutube);

            String imgMail15 = Propiedades.getFuncProperty("email.images.mail00115");
            if (imgMail15 == null) {
                imgMail15 = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_MAIL_00115]", imgMail15);

            String imgFono = Propiedades.getFuncProperty("email.images.fono");
            if (imgFono == null) {
                imgFono = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_FONO]", imgFono);

            String imgMail16 = Propiedades.getFuncProperty("email.images.mail00116");
            if (imgMail16 == null) {
                imgMail16 = "";
            }
            htmlBody = StringUtils.replace(htmlBody, "$P[IMG_MAIL_00116]", imgMail16);

            byte[] attachmentData = Base64.decodeBase64(documento);

            final String username = Propiedades.getKeyProperty("email.username");
            final String encryptedPassword = Propiedades.getKeyProperty("email.password");
            String privateKeyFile = Propiedades.getConfProperty("KEY");
            CryptoUtil cryptoUtil = new CryptoUtil("", privateKeyFile);
            final String password = cryptoUtil.decryptData(encryptedPassword);
            final String auth = Propiedades.getFuncProperty("email.auth");
            final String starttls = Propiedades.getFuncProperty("email.starttls");
            final String host = Propiedades.getFuncProperty("email.host");
            final String port = Propiedades.getFuncProperty("email.port");

            //Log de datos de correo
            String strDatosCorreo
                    = "username: " + username + "\n"
                    + "auth: " + auth + "\n"
                    + "host: " + host + "\n";
            LOGGER.info("Datos correo: \n".concat(strDatosCorreo));

            Properties props = new Properties();
            props.put("mail.smtp.auth", auth);
            if (!"0".equals(starttls)) {
                props.put("mail.smtp.starttls.enable", starttls);
            }
            props.put("mail.smtp.host", host);
            if (!"0".equals(port)) {
                props.put("mail.smtp.port", port);
            }
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            String fileName = Propiedades.getFuncProperty("tmp.cotizacionInternet.file.name");
            fileName = fileName.replaceAll("%s", numeroPropuesta);
            fileName = fileName + ".pdf";

            // creates a new e-mail message
            Message msg = new MimeMessage(session);
            String from = Propiedades.getFuncProperty("email.from");
            msg.setFrom(new InternetAddress(from));
            //TODO considerar email de prueba o email del asegurado            
            String emailTo;
            if ("1".equals(Propiedades.getFuncProperty("email.to.test"))) {
                emailTo = Propiedades.getFuncProperty("email.to.mail");
            } else {
                emailTo = datosEmail.getEmail();
            }
            InternetAddress[] toAddresses = {new InternetAddress(emailTo)};
            msg.setRecipients(Message.RecipientType.TO, toAddresses);
            String subject = Propiedades.getFuncProperty("email.subject");
            msg.setSubject(subject);
            msg.setSentDate(new Date());

            // creates message part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(htmlBody, "text/html");

            // creates multi-part
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // adds attachments
            MimeBodyPart attachPart = new MimeBodyPart();
            DataSource dataSource = new ByteArrayDataSource(attachmentData, "application/pdf");
            attachPart.setDataHandler(new DataHandler(dataSource));
            attachPart.setFileName(fileName);
            multipart.addBodyPart(attachPart);

            // sets the multi-part as e-mail's content
            msg.setContent(multipart);

            // sends the e-mail
            Transport.send(msg);

        } catch (Exception ex) {
            codigo = Propiedades.getFuncProperty("email.error.codigo");
            mensaje = Propiedades.getFuncProperty("email.error.mensaje");
            LOGGER.error(mensaje + ": " + ex.getMessage(), ex);
            output.setCodigo(codigo);
            output.setMensaje(mensaje);
            return output;
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Termino">
        codigo = Propiedades.getFuncProperty("codigo.ok");
        mensaje = Propiedades.getFuncProperty("mensaje.ok");
        output.setCodigo(codigo);
        output.setMensaje(mensaje);
        return output;
        //</editor-fold>

    }

    @Override
    public String obtenerXmlCotizacionInternet(String nroCotizacion) {

        //<editor-fold defaultstate="collapsed" desc="Inicio">
        String xml;
        XStream xStream = new XStream();
        Document document = DocumentFactory.getInstance().createDocument();
        String codigo;
        String mensaje;
        Element elemCotizacion = document.addElement("cotizacion");
        Element elemAsegurable;
        Element elemContratante;
        Element elemBeneficiarios;
        Element elemViaCobro;
        Element elemUsoInterno;
        Element elemCoberturas;
        Element elemRentabilidadInversion;
        Element elemProyeccion;
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Obtener datos de cotizacion internet">
        String capitalMuerteAccidental;
        String capitalPlan;
        String ccAnual;
        String fechaNacimiento;
        String primaProyectadaMensual;
        String tasaProyeccion;
        String nBranch = Propiedades.getFuncProperty("codigo.ramo");
        List<Coberturaci> coberturas;
        ClienteServicioCotizadorVida clienteCotizadorVida;
        try {
            clienteCotizadorVida = new ClienteServicioCotizadorVida();
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.login.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemCotizacion.addElement("codigo").addText(codigo);
            elemCotizacion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        InputCotizacionInternet inputCotizacionInternet = new InputCotizacionInternet();
        inputCotizacionInternet.setIdCotizacion(nroCotizacion);
        String xmlInputCotizacionInternet = xStream.toXML(inputCotizacionInternet);
        LOGGER.info("Llamado a getCotizacionInternet - cotizadorVida: \n" + xmlInputCotizacionInternet);
        OutputCotizacionInternet outputCotizacionInternet;
        try {
            outputCotizacionInternet = clienteCotizadorVida.getCotizacionInternet(inputCotizacionInternet);
            String xmlOutputCotizacionInternet = xStream.toXML(outputCotizacionInternet);
            LOGGER.info("Respuesta de getCotizacionInternet - cotizadorVida: \n" + xmlOutputCotizacionInternet);
            Integer codigoOutputCotizacionInternet = Integer.valueOf(outputCotizacionInternet.getCodigo());
            if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputCotizacionInternet)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.mensaje");
                LOGGER.info(mensaje + ": " + outputCotizacionInternet.getMensaje());
                elemCotizacion.addElement("codigo").addText(codigo);
                elemCotizacion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
            Cotizacionci cotizacion = outputCotizacionInternet.getCotizacion();
            Asegurableci asegurable = cotizacion.getAsegurable();
            String actividadEconomica = asegurable.getActividadEconomica();
            if (actividadEconomica == null) {
                actividadEconomica = "";
            }
            String apellidoMaterno = asegurable.getApellidoMaterno();
            if (apellidoMaterno == null) {
                apellidoMaterno = "";
            }
            String apellidoPaterno = asegurable.getApellidoPaterno();
            if (apellidoPaterno == null) {
                apellidoPaterno = "";
            }
            String celular = asegurable.getCelular();
            if (celular == null) {
                celular = "";
            }
            String ciudad = asegurable.getCiudad();
            if (ciudad == null) {
                ciudad = "";
            }
            String comuna = asegurable.getComuna();
            if (comuna == null) {
                comuna = "";
            }
            String direccion = asegurable.getDireccion();
            if (direccion == null) {
                direccion = "";
            }
            String edadActuarial = asegurable.getEdadActuarial();
            if (edadActuarial == null) {
                edadActuarial = "";
            }
            String email = asegurable.getEmail();
            if (email == null) {
                email = "";
            }
            String estadoCivil = asegurable.getEstadoCivil();
            if (estadoCivil == null) {
                estadoCivil = "";
            }
            fechaNacimiento = asegurable.getFechaNacimiento();
            if (fechaNacimiento == null) {
                fechaNacimiento = "";
            }
            String fijo = asegurable.getFijo();
            if (fijo == null) {
                fijo = "";
            }
            String ingresoLiquido = asegurable.getIngresoLiquido();
            if (ingresoLiquido == null) {
                ingresoLiquido = "";
            }
            String nacionalidad = asegurable.getNacionalidad();
            if (nacionalidad == null) {
                nacionalidad = "";
            }
            String nombres = asegurable.getNombres();
            if (nombres == null) {
                nombres = "";
            }
            String profesion = asegurable.getProfesion();
            if (profesion == null) {
                profesion = "";
            }
            String rut = asegurable.getRut();
            if (rut == null) {
                rut = "";
            }
            String sexo = asegurable.getSexo();
            if (sexo == null) {
                sexo = "";
            }
            String tipoFumador = asegurable.getTipoFumador();
            if (tipoFumador == null) {
                tipoFumador = "";
            }

            //Nodo xml asegurable
            elemAsegurable = elemCotizacion.addElement("asegurable");
            elemAsegurable.addElement("actividadEconomica").setText(actividadEconomica);
            elemAsegurable.addElement("apellidoMaterno").setText(apellidoMaterno);
            elemAsegurable.addElement("apellidoPaterno").setText(apellidoPaterno);
            elemAsegurable.addElement("celular").setText(celular);
            elemAsegurable.addElement("ciudad").setText(ciudad);
            elemAsegurable.addElement("comuna").setText(comuna);
            elemAsegurable.addElement("direccion").setText(direccion);
            elemAsegurable.addElement("edadActuarial").setText(edadActuarial);
            elemAsegurable.addElement("email").setText(email);
            elemAsegurable.addElement("estadoCivil").setText(estadoCivil);
            elemAsegurable.addElement("fechaNacimiento").setText(fechaNacimiento);
            elemAsegurable.addElement("fijo").setText(fijo);
            elemAsegurable.addElement("ingresoLiquido").setText(ingresoLiquido);
            elemAsegurable.addElement("nacionalidad").setText(nacionalidad);
            elemAsegurable.addElement("nombres").setText(nombres);
            elemAsegurable.addElement("profesion").setText(profesion);
            elemAsegurable.addElement("rut").setText(rut);
            elemAsegurable.addElement("sexo").setText(sexo);
            elemAsegurable.addElement("tipoFumador").setText(tipoFumador);

            //Nodo xml contratante
            elemContratante = elemCotizacion.addElement("contratante");
            elemContratante.addElement("actividadEconomica").setText(actividadEconomica);
            elemContratante.addElement("apellidoMaterno").setText(apellidoMaterno);
            elemContratante.addElement("apellidoPaterno").setText(apellidoPaterno);
            elemContratante.addElement("celular").setText(celular);
            elemContratante.addElement("ciudad").setText(ciudad);
            elemContratante.addElement("comuna").setText(comuna);
            elemContratante.addElement("direccion").setText(direccion);
            elemContratante.addElement("edadActuarial").setText(edadActuarial);
            elemContratante.addElement("email").setText(email);
            elemContratante.addElement("estadoCivil").setText(estadoCivil);
            elemContratante.addElement("fechaNacimiento").setText(fechaNacimiento);
            elemContratante.addElement("fijo").setText(fijo);
            elemContratante.addElement("ingresoLiquido").setText(ingresoLiquido);
            elemContratante.addElement("nacionalidad").setText(nacionalidad);
            elemContratante.addElement("nombres").setText(nombres);
            elemContratante.addElement("profesion").setText(profesion);
            elemContratante.addElement("rut").setText(rut);
            elemContratante.addElement("sexo").setText(sexo);
            elemContratante.addElement("tipoFumador").setText(tipoFumador);

            //Datos beneficiarios
            elemBeneficiarios = elemCotizacion.addElement("beneficiarios");
            List<Beneficiarioci> beneficiarios = cotizacion.getBeneficiarios();
            if (beneficiarios != null) {
                for (Beneficiarioci beneficiario : beneficiarios) {
                    Element elemBeneficiario = elemBeneficiarios.addElement("beneficiario");
                    String apellidoPaternoBeneficiario = beneficiario.getApellidoPaterno();
                    if (apellidoPaternoBeneficiario == null) {
                        apellidoPaternoBeneficiario = "";
                    }
                    elemBeneficiario.addElement("apellidoPaterno").setText(apellidoPaternoBeneficiario);
                    String apellidoMaternoBeneficiario = beneficiario.getApellidoMaterno();
                    if (apellidoMaternoBeneficiario == null) {
                        apellidoMaternoBeneficiario = "";
                    }
                    elemBeneficiario.addElement("apellidoMaterno").setText(apellidoMaternoBeneficiario);
                    String nombreBeneficiario = beneficiario.getNombres();
                    if (nombreBeneficiario == null) {
                        nombreBeneficiario = "";
                    }
                    elemBeneficiario.addElement("nombres").setText(nombreBeneficiario);
                    String direccionParticularBeneficiario = beneficiario.getDireccionParticular();
                    if (direccionParticularBeneficiario == null) {
                        direccionParticularBeneficiario = "";
                    }
                    elemBeneficiario.addElement("direccionParticular").setText(direccionParticularBeneficiario);
                    String comunaBeneficiario = beneficiario.getComuna();
                    if (comunaBeneficiario == null) {
                        comunaBeneficiario = "";
                    }
                    elemBeneficiario.addElement("comuna").setText(comunaBeneficiario);
                    String celularBeneficiario = beneficiario.getCelular();
                    if (celularBeneficiario == null) {
                        celularBeneficiario = "";
                    }
                    elemBeneficiario.addElement("celular").setText(celularBeneficiario);
                    String emailBeneficiario = beneficiario.getEmail();
                    if (emailBeneficiario == null) {
                        emailBeneficiario = "";
                    }
                    elemBeneficiario.addElement("email").setText(emailBeneficiario);
                    String ciudadBeneficiario = beneficiario.getCiudad();
                    if (ciudadBeneficiario == null) {
                        ciudadBeneficiario = "";
                    }
                    elemBeneficiario.addElement("ciudad").setText(ciudadBeneficiario);
                    String fijoBeneficiario = beneficiario.getFijo();
                    if (fijoBeneficiario == null) {
                        fijoBeneficiario = "";
                    }
                    elemBeneficiario.addElement("fijo").setText(fijoBeneficiario);
                }
            }

            //Datos via cobro
            ViaCobroci viaCobro = cotizacion.getViaCobro();
            if (viaCobro != null) {
                elemViaCobro = elemCotizacion.addElement("viaCobro");
                String institucion = viaCobro.getInstitucion();
                if (institucion == null) {
                    institucion = "";
                }
                elemViaCobro.addElement("institucion").setText(institucion);
                String numeroCuenta = viaCobro.getNumeroCuenta();
                if (numeroCuenta == null) {
                    numeroCuenta = "";
                }
                elemViaCobro.addElement("numeroCuenta").setText(numeroCuenta);
                String diaCobro = viaCobro.getDiaCobro();
                if (diaCobro == null) {
                    diaCobro = "";
                }
                elemViaCobro.addElement("diaCobro").setText(diaCobro);
                String numeroMandato = viaCobro.getNumeroMandato();
                if (numeroMandato == null) {
                    numeroMandato = "";
                }
                elemViaCobro.addElement("numeroMandato").setText(numeroMandato);
            }

            //Datos uso interno
            UsoInternoci usoInterno = cotizacion.getUsoInterno();
            if (usoInterno != null) {
                elemUsoInterno = elemCotizacion.addElement("usoInterno");
                String codMoneda = usoInterno.getCodMoneda();
                if (codMoneda == null) {
                    codMoneda = "";
                }
                elemUsoInterno.addElement("codMoneda").setText(codMoneda);
                String moneda = usoInterno.getMoneda();
                if (moneda == null) {
                    moneda = "";
                }
                elemUsoInterno.addElement("moneda").setText(moneda);
                String codigoAgencia = usoInterno.getCodigoAgencia();
                if (codigoAgencia == null) {
                    codigoAgencia = "";
                }
                elemUsoInterno.addElement("codigoAgencia").setText(codigoAgencia);
                String codAgenteVenta = usoInterno.getCodAgenteVenta();
                if (codAgenteVenta == null) {
                    codAgenteVenta = "";
                }
                elemUsoInterno.addElement("codAgenteVenta").setText(codAgenteVenta);
                String agenteVenta = usoInterno.getAgenteVenta();
                if (agenteVenta == null) {
                    agenteVenta = "";
                }
                elemUsoInterno.addElement("agenteVenta").setText(agenteVenta);
                String origenVenta = usoInterno.getOrigenVenta();
                if (origenVenta == null) {
                    origenVenta = "";
                }
                elemUsoInterno.addElement("origenVenta").setText(origenVenta);
                String certificadoCobertura = usoInterno.getCertificadoCobertura();
                if (certificadoCobertura == null) {
                    certificadoCobertura = "";
                }
                elemUsoInterno.addElement("certificadoCobertura").setText(certificadoCobertura);
                String declaracionBeneficiario = usoInterno.getDeclaracionBeneficiario();
                if (declaracionBeneficiario == null) {
                    declaracionBeneficiario = "";
                }
                elemUsoInterno.addElement("declaracionBeneficiario").setText(declaracionBeneficiario);
                String numeroDps = usoInterno.getNumeroDps();
                if (numeroDps == null) {
                    numeroDps = "";
                }
                elemUsoInterno.addElement("numeroDps").setText(numeroDps);
                String numeroDpsConyuge = usoInterno.getNumeroDpsConyuge();
                if (numeroDpsConyuge == null) {
                    numeroDpsConyuge = "";
                }
                elemUsoInterno.addElement("numeroDpsConyuge").setText(numeroDpsConyuge);
                String plan = usoInterno.getPlan();
                if (plan == null) {
                    plan = "";
                }
                elemUsoInterno.addElement("plan").setText(plan);
                String gastosSuscripcion = usoInterno.getGastosSuscripcion();
                if (gastosSuscripcion == null) {
                    gastosSuscripcion = "";
                }
                elemUsoInterno.addElement("gastosSuscripcion").setText(gastosSuscripcion);
                String formaPago = usoInterno.getFormaPago();
                if (formaPago == null) {
                    formaPago = "";
                }
                elemUsoInterno.addElement("formaPago").setText(formaPago);
                String fechaInicio = usoInterno.getFechaInicio();
                if (fechaInicio == null) {
                    fechaInicio = "";
                }
                elemUsoInterno.addElement("fechaInicio").setText(fechaInicio);
                String fechaTermino = usoInterno.getFechaTermino();
                if (fechaTermino == null) {
                    fechaTermino = "";
                }
                elemUsoInterno.addElement("fechaTermino").setText(fechaTermino);
                String periodoCobertura = usoInterno.getPeriodoCobertura();
                if (periodoCobertura == null) {
                    periodoCobertura = "";
                }
                elemUsoInterno.addElement("periodoCobertura").setText(periodoCobertura);
                String periodoPago = usoInterno.getPeriodoPago();
                if (periodoPago == null) {
                    periodoPago = "";
                }
                elemUsoInterno.addElement("periodoPago").setText(periodoPago);
                String opcion = usoInterno.getOpcion();
                if (opcion == null) {
                    opcion = "";
                }
                elemUsoInterno.addElement("opcion").setText(opcion);
                String fondoInversion = usoInterno.getFondoInversion();
                if (fondoInversion == null) {
                    fondoInversion = "";
                }
                elemUsoInterno.addElement("fondoInversion").setText(fondoInversion);
                String rmg = usoInterno.getRmg();
                if (rmg == null) {
                    rmg = "";
                }
                elemUsoInterno.addElement("rmg").setText(rmg);
            }

            //Datos coberturas
            elemCoberturas = elemCotizacion.addElement("coberturas");
            coberturas = cotizacion.getCoberturas();
            if (coberturas != null) {
                for (Coberturaci cobertura : coberturas) {
                    Element elemCobertura = elemCoberturas.addElement("cobertura");
                    String nombre = cobertura.getNombre();
                    if (nombre == null) {
                        nombre = "";
                    }
                    elemCobertura.addElement("nombre").setText(nombre);
                    String capital = cobertura.getCapital();
                    if (capital == null) {
                        capital = "";
                    }
                    elemCobertura.addElement("capital").setText(capital);
                    String costoCobertura = cobertura.getCostoCobertura();
                    if (costoCobertura == null) {
                        costoCobertura = "";
                    }
                    elemCobertura.addElement("costoCobertura").setText(costoCobertura);
                    String nombreCondicionado = cobertura.getNombreCondicionado();
                    if (nombreCondicionado == null) {
                        nombreCondicionado = "";
                    }
                    elemCobertura.addElement("nombreCondicionado").setText(nombreCondicionado);
                    String codigoSvs = cobertura.getCodigoSvs();
                    if (codigoSvs == null) {
                        codigoSvs = "";
                    }
                    elemCobertura.addElement("codigoSvs").setText(codigoSvs);
                }
            }

            //Datos rentabilidad inversion
            RentabilidadInversionci rentabilidadInversion = cotizacion.getRentabilidadInversion();
            elemRentabilidadInversion = elemCotizacion.addElement("rentabilidadInversion");
            if (rentabilidadInversion != null) {
                String codigoSvs = rentabilidadInversion.getCodigoSvs();
                if (codigoSvs == null) {
                    codigoSvs = "";
                }
                elemRentabilidadInversion.addElement("codigoSvs").setText(codigoSvs);
                String codigoSvsCoberturaFallecimiento = rentabilidadInversion.getCodigoSvsCoberturaFallecimiento();
                if (codigoSvsCoberturaFallecimiento == null) {
                    codigoSvsCoberturaFallecimiento = "";
                }
                elemRentabilidadInversion.addElement("codigoSvsCoberturaFallecimiento").setText(codigoSvsCoberturaFallecimiento);
                String codigoSvsCoberturaMuerteAccidental = rentabilidadInversion.getCodigoSvsCoberturaMuerteAccidental();
                if (codigoSvsCoberturaMuerteAccidental == null) {
                    codigoSvsCoberturaMuerteAccidental = "";
                }
                elemRentabilidadInversion.addElement("codigoSvsCoberturaMuerteAccidental").setText(codigoSvsCoberturaMuerteAccidental);
            }

            //Datos proyeccion
            Proyeccionci proyeccion = cotizacion.getProyeccion();
            elemProyeccion = elemCotizacion.addElement("proyeccion");
            if (proyeccion != null) {
                String fecha = proyeccion.getFecha();
                if (fecha == null) {
                    fecha = "";
                }
                elemProyeccion.addElement("fecha").setText(fecha);
                String valorUf = proyeccion.getValorUf();
                if (valorUf == null) {
                    valorUf = "";
                }
                elemProyeccion.addElement("valorUf").setText(valorUf);
                String supuestoRentabilidad = proyeccion.getSupuestoRentabilidad();
                if (supuestoRentabilidad == null) {
                    supuestoRentabilidad = "";
                }
                elemProyeccion.addElement("supuestoRentabilidad").setText(supuestoRentabilidad);

                //Datos proyeccion - coberturas
                coberturas = proyeccion.getCoberturas();
                if (coberturas != null) {
                    for (Coberturaci cobertura : coberturas) {
                        Element elemCobertura = elemProyeccion.addElement("cobertura");
                        String nombre = cobertura.getNombre();
                        if (nombre == null) {
                            nombre = "";
                        }
                        elemCobertura.addElement("nombre").setText(nombre);
                        String capital = cobertura.getCapital();
                        if (capital == null) {
                            elemCobertura.addElement("capital").setText(capital);
                        }
                        String costoCobertura = cobertura.getCostoCobertura();
                        if (costoCobertura == null) {
                            costoCobertura = "";
                        }
                        elemCobertura.addElement("costoCobertura").setText(costoCobertura);
                        String nombreCondicionado = cobertura.getNombreCondicionado();
                        if (nombreCondicionado == null) {
                            nombreCondicionado = "";
                        }
                        elemCobertura.addElement("nombreCondicionado").setText(nombreCondicionado);
                        String codigoSvs = cobertura.getCodigoSvs();
                        if (codigoSvs == null) {
                            codigoSvs = "";
                        }
                        elemCobertura.addElement("codigoSvs").setText(codigoSvs);
                    }
                }
            }

        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemCotizacion.addElement("codigo").addText(codigo);
            elemCotizacion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Obtener plan cotizacion internet">
        inputCotizacionInternet = new InputCotizacionInternet();
        inputCotizacionInternet.setIdCotizacion(nroCotizacion);
        xmlInputCotizacionInternet = xStream.toXML(inputCotizacionInternet);
        LOGGER.info("Llamado a getDatosPlanCotizacionInternet - cotizadorVida: \n" + xmlInputCotizacionInternet);        
        OutputPlanVO outputPlan;
        try {
            outputPlan = clienteCotizadorVida.getDatosPlanCotizacionInternet(inputCotizacionInternet);
            String xmlOutputPlan = xStream.toXML(outputPlan);
            LOGGER.info("Respuesta de getDatosPlanCotizacionInternet - cotizadorVida: \n" + xmlOutputPlan);
            Integer codigoOutputPlan = Integer.valueOf(outputCotizacionInternet.getCodigo());
            if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputPlan)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.mensaje");
                LOGGER.info(mensaje + ": " + outputCotizacionInternet.getMensaje());
                elemCotizacion.addElement("codigo").addText(codigo);
                elemCotizacion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.codigo");
            mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.cotizacionInternet.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemCotizacion.addElement("codigo").addText(codigo);
            elemCotizacion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        PlanVO plan = outputPlan.getPlan();
        capitalPlan = plan.getCapitalPlan();
        ccAnual = plan.getCostoCoberturaAnual();
        primaProyectadaMensual = plan.getPrimaUf();
        tasaProyeccion = plan.getTasaProyeccion();
        
        //Buscar capital muerte accidental dentro de las coberturas;
        String codigoMuerteAccidental = Propiedades.getFuncProperty("codigo.muerteaccidental");
        capitalMuerteAccidental = buscarCapitalMuerteAccidental(coberturas, codigoMuerteAccidental);        
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Obtener datos de proyeccion">
        ClienteServiciosProyeccion clienteProyeccion;
        try {
            clienteProyeccion = new ClienteServiciosProyeccion();
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.proyeccion.error.login.codigo");
            mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.login.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemProyeccion.addElement("codigo").addText(codigo);
            elemProyeccion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        TransaccionAhorroInternet inputAhorroInternet = new TransaccionAhorroInternet();
        inputAhorroInternet.setCapitalMuerteAccidental(capitalMuerteAccidental);
        inputAhorroInternet.setCapitalPlan(capitalPlan);
        inputAhorroInternet.setCcAnual(ccAnual);
        inputAhorroInternet.setFechaNacimiento(fechaNacimiento);
        inputAhorroInternet.setPrimaProyectadaMensual(primaProyectadaMensual);
        inputAhorroInternet.setTasaProyeccion(tasaProyeccion);
        inputAhorroInternet.setNBranch(nBranch);        
        String xmlInputAhorroInternet = xStream.toXML(inputAhorroInternet);
        LOGGER.info("Llamado a obtenerProyeccionAhorroInternet - proyeccion: \n" + xmlInputAhorroInternet);
        RespuestaAhorroInternet outputAhorroInternet;
        try {
            outputAhorroInternet = clienteProyeccion.obtenerProyeccionAhorroInternet(inputAhorroInternet);
            String xmlOutputAhorroInternet = xStream.toXML(outputAhorroInternet);
            LOGGER.info("Respuesta de obtenerProyeccionAhorroInternet - proyeccion: \n" + xmlOutputAhorroInternet);
            String codigoOutputAhorroInternet = outputAhorroInternet.getCodigo();
            if (!Propiedades.getFuncProperty("ws.proyeccion.codigo.ok").equals(codigoOutputAhorroInternet)) {
                codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionahorrointernet.codigo");
                mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionahorrointernet.mensaje");
                LOGGER.info(mensaje + ": " + outputAhorroInternet.getMensaje());
                elemProyeccion.addElement("codigo").addText(codigo);
                elemProyeccion.addElement("mensaje").addText(mensaje);
                xml = document.asXML();
                return xml;
            }
        } catch (Exception e) {
            codigo = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionahorrointernet.codigo");
            mensaje = Propiedades.getFuncProperty("ws.proyeccion.error.proyeccionahorrointernet.mensaje");
            LOGGER.error(mensaje + ": " + e.getMessage(), e);
            elemProyeccion.addElement("codigo").addText(codigo);
            elemProyeccion.addElement("mensaje").addText(mensaje);
            xml = document.asXML();
            return xml;
        }
        
        //Datos proyeccion - edad ahorro                
        List<Edadci> edades = construirListaProyeccion(outputAhorroInternet);
        Element elemEdadAhorro = elemProyeccion.addElement("edadahorro");        
        for (Edadci edad : edades) {
            Element elemEdad = elemEdadAhorro.addElement("edad");
            String finalAnio = edad.getFinalAnio();
            if (finalAnio == null) {
                finalAnio = "";
            }
            elemEdad.addElement("finalAnio").setText(finalAnio);
            String edadActuarialAhorro = edad.getEdadActuarial();
            if (edadActuarialAhorro == null) {
                edadActuarialAhorro = "";
            }
            elemEdad.addElement("edadActuarial").setText(edadActuarialAhorro);
            String primaAcumulada = edad.getPrimaAcumulada();
            if (primaAcumulada == null) {
                primaAcumulada = "";
            }
            elemEdad.addElement("primaAcumulada").setText(primaAcumulada);
            String otrosAbonos = edad.getOtrosAbonos();
            if (otrosAbonos == null) {
                otrosAbonos = "";
            }
            elemEdad.addElement("otrosAbonos").setText(otrosAbonos);
            String valorPoliza = edad.getValorPoliza();
            if (valorPoliza == null) {
                valorPoliza = "";
            }
            elemEdad.addElement("valorPoliza").setText(valorPoliza);
            String indemnizacionFallecimiento = edad.getIndemnizacionFallecimiento();
            if (indemnizacionFallecimiento == null) {
                indemnizacionFallecimiento = "";
            }
            elemEdad.addElement("indemnizacionFallecimiento").setText(indemnizacionFallecimiento);
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Termino">
        codigo = Propiedades.getFuncProperty("codigo.ok");
        mensaje = Propiedades.getFuncProperty("mensaje.ok");
        LOGGER.info(mensaje);
        elemCotizacion.addElement("codigo").addText(codigo);
        elemCotizacion.addElement("mensaje").addText(mensaje);
        xml = document.asXML();
        return xml;
        //</editor-fold>
    }

    private String buscarCapitalMuerteAccidental(List<Coberturaci> coberturas, String codigoMuerteAccidental) {
        String capitalMuerteAccidental = null;
        for (Coberturaci cobertura : coberturas) {
            String nCover = cobertura.getNCover();
            if (nCover.equals(codigoMuerteAccidental)) {
                capitalMuerteAccidental = cobertura.getCostoCobertura();
                break;
            }
        }
        return capitalMuerteAccidental;
    }

    private List<Edadci> construirListaProyeccion(RespuestaAhorroInternet outputAhorroInternet) {
        List<Edadci> edades = new LinkedList<Edadci>();
        List<ResultadoProyeccionAhorroInternet> resultadosProyeccion = outputAhorroInternet.getResultadosProyeccion();
        for (ResultadoProyeccionAhorroInternet resultadoProyeccion : resultadosProyeccion) {
            Integer edadActuarial = resultadoProyeccion.getEdadActuarial();
            Integer finalAnnio = resultadoProyeccion.getFinalAnnio();
            Double indemnizacionFallecimiento = resultadoProyeccion.getIndemnizacionFallecimiento();
            Double otrosAbonos = resultadoProyeccion.getOtrosAbonos();
            Double primaAcumulada = resultadoProyeccion.getPrimaAcumulada();
            Double valorPoliza = resultadoProyeccion.getValorPoliza();
            Edadci edad = new Edadci();
            edad.setEdadActuarial(Integer.toString(edadActuarial));
            edad.setFinalAnio(Integer.toString(finalAnnio));
            edad.setIndemnizacionFallecimiento(Double.toString(indemnizacionFallecimiento));
            edad.setOtrosAbonos(Double.toString(otrosAbonos));
            edad.setPrimaAcumulada(Double.toString(primaAcumulada));
            edad.setValorPoliza(Double.toString(valorPoliza));
            edades.add(edad);
        }
        return edades;
    }
}
