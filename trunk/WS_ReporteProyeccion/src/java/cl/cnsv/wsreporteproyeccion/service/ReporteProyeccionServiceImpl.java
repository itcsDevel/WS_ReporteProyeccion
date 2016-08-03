/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.service;

import cl.cnsv.wsreporteproyeccion.cliente.ClienteServicioCotizadorVida;
import cl.cnsv.wsreporteproyeccion.cliente.ClienteServiciosProyeccion;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.AntecedentesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.CondicionadoVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorro100VO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.EleccionesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputCondicionadoVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCondicionadoVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputTipoProyeccionVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.RespuestaVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import cl.cnsv.wsreporteproyeccion.utils.ProyeccionBeanFactory;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;
import com.thoughtworks.xstream.XStream;
import java.util.List;
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

    @Override
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {
        
        return null;
    }

    @Override
    public String obtenerXmlProyeccion(String numeroPoliza) {
        
        //<editor-fold defaultstate="collapsed" desc="Inicio">        
        String xml = "";
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
        LOGGER.info("Llamado a getProyeccionesVO: \n" + xmlInputProyecciones);
        OutputProyeccionesVO outputProyecciones;
        try {
            outputProyecciones = clienteCotizadorVida.getProyeccionesVO(inputProyecciones);
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
            String tipoFumador = antecedentes.getTipoFumado();
            String fechaNacimiento = antecedentes.getFechaNacimiento();
            int edadActuarial = antecedentes.getEdadActTitular();
            String sexo = antecedentes.getSexo();
            int edadConyuge = antecedentes.getEdadActConyuge();
            String edadHijos = antecedentes.getEdadActHijos();
            int edadPadres = antecedentes.getEdadActPadres();
            EleccionesVO elecciones = outputProyecciones.getElecciones();
            String plan = elecciones.getPlan();
            String formaPago = elecciones.getFormaPago();
            String portafolioSeleccionado = elecciones.getPortafolioSeleccionado();
            double primaReferencialAnual = elecciones.getPrimaReferencialAnual();
            
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
        
        //<editor-fold defaultstate="collapsed" desc="Obtener codigo de producto">
        LOGGER.info("Llamado a getTipoProyeccionVO: \n" + xmlInputProyecciones);
        OutputTipoProyeccionVO outputObtenerTipoProyeccion;
        try {
            outputObtenerTipoProyeccion = clienteCotizadorVida.getObtenerTipoProyeccionVO(inputProyecciones);
            int codigoObtenerTipoProyeccion = outputObtenerTipoProyeccion.getCodigo();
            if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoObtenerTipoProyeccion)) {
                codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.codigo");
                mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.tipoproyeccion.mensaje");
                LOGGER.info(mensaje + ": " + outputProyecciones.getMensaje());
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
        
        //<editor-fold defaultstate="collapsed" desc="Llamar al servicio de proyeccion">
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
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Segun codigo de producto buscar informacion para proyeccion">
        OutputWSProyeccionVidAhorro100 outputWSProyeccionVidAhorro100;
        int nproduct = outputObtenerTipoProyeccion.getNproduct();
        if (nproduct == Integer.valueOf(Propiedades.getFuncProperty("codigo.va100"))) {
            try {
                outputWSProyeccionVidAhorro100 = clienteCotizadorVida.getWSProyeccionVidAhorro100(inputProyecciones);
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
            
            elemUsoInterno.addElement("supuestorentabilidad").addText(Double.toString(supuestoRentabilidad));            
            elemUsoInterno.addElement("rentaImponible").addText("");
            
            //Obtener el condicionado particular (POL-CAD)
            InputCondicionadoVO inputCondicionadoVO = new InputCondicionadoVO();
            inputCondicionadoVO.setBranch(Propiedades.getFuncProperty("codigo.ramo"));
            inputCondicionadoVO.setCover(Propiedades.getFuncProperty("codigo.va100.cobertura.fallecimiento"));
            inputCondicionadoVO.setModulec(Propiedades.getFuncProperty("codigo.modulo"));
            inputCondicionadoVO.setProduct(Propiedades.getFuncProperty("codigo.va100"));
            OutputCondicionadoVO outputCondicionadoVO;
            try {
                outputCondicionadoVO = clienteCotizadorVida.getNombreCondicionado(inputCondicionadoVO);
                Integer codigoOutputCondicionado = outputCondicionadoVO.getCodigo();
                if (!Integer.valueOf(Propiedades.getFuncProperty("ws.cotizadorvida.codigo.ok")).equals(codigoOutputCondicionado)) {
                    codigo = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.codigo");
                    mensaje = Propiedades.getFuncProperty("ws.cotizadorvida.error.condicionado.mensaje");
                    LOGGER.info(mensaje + ": " + outputWSProyeccionVidAhorro100.getMensaje());
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
            elemUsoInterno.addElement("codigoSvsPol").addText(condicionado.getScondsvs());
            
            //Construye entrada para el servicio de proyeccion
            TransaccionVidAhorro100 inputProyeccionVa100;                    
            try {
                inputProyeccionVa100 = 
                    ProyeccionBeanFactory.buildVa100(outputWSProyeccionVidAhorro100);
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
            RespuestaVidAhorro100 outputProyeccionVidAhorro100;
            try {
                outputProyeccionVidAhorro100 = clienteProyeccion.getProyeccionVidAhorro100(inputProyeccionVa100);
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
            
            
        }
        
        
        
        //</editor-fold>
        
        //Nodo xml primaTotal
        elemPrimaTotal = elemProyeccion.addElement("primaTotal");
        elemPrimaTotal.addElement("valorMoneda").addText("26.148,38");
        elemPrimaTotal.addElement("primaProyectada").addText("6.042,44");
        
        //Nodo xml parametros
        elemParametros = elemProyeccion.addElement("parametros");
        elemParametros.addElement("recargosimulador").addText("");
        
        //Nodo edadAhorro
        elemEdadAhorro = elemProyeccion.addElement("edadahorro");
        elemEdad = elemEdadAhorro.addElement("edad");
        elemEdad.addElement("finalano").addText("2016");
        elemEdad.addElement("edadactuarial").addText("21");
        elemEdad.addElement("primaacumulada").addText("0.146832");
        elemEdad.addElement("valorpoliza").addText("0.146833");
        elemEdad.addElement("indemnizacionfallecimiento").addText("0.146834");
        elemEdad.addElement("relleno").addText("I");        
        elemEdad.addElement("valorpoliza57bis").addText("");
        
        elemEdad = elemEdadAhorro.addElement("edad");
        elemEdad.addElement("finalano").addText("2016");
        elemEdad.addElement("edadactuarial").addText("22");
        elemEdad.addElement("primaacumulada").addText("0.146833");
        elemEdad.addElement("valorpoliza").addText("0.146834");
        elemEdad.addElement("indemnizacionfallecimiento").addText("0.146835");
        elemEdad.addElement("relleno").addText("I");        
        elemEdad.addElement("valorpoliza57bis").addText("");
        
        //Nodo cotizacion
        elemCoberturas = elemProyeccion.addElement("coberturas");
        elemCobertura = elemCoberturas.addElement("cobertura");
        elemCobertura.addElement("nombreCobertura").addText("FALLECIMIENTO");
        elemCobertura.addElement("capital").addText("91,00");
        elemCobertura.addElement("nasegurados").addText("1");
        elemCobertura.addElement("ntotalprima").addText("91,00");
        
        xml = document.asXML();
        return xml;
    }
    
    
    
}
