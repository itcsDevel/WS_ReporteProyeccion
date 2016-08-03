/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.service;

import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;
import javax.enterprise.inject.Alternative;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

/** 
 * Clase que implementa el servicio de reporte proyeccion con datos de prueba.
 * 
 * fecha: 03-08-2016 
 * @author exitcs6 
 */
@Alternative
public class ReporteProyeccionServiceDummyImpl implements ReporteProyeccionService {

    @Override
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerXmlProyeccion(String numeroPoliza) {
        String xml = "";
        Document document = DocumentFactory.getInstance().createDocument();
        
        //Nodo xml proyeccion
        Element elemProyeccion = document.addElement("proyeccion");
        elemProyeccion.addElement("numPropuesta").addText(numeroPoliza);
        
        //Nodo xml asegurable
        Element elemAsegurable = elemProyeccion.addElement("asegurable");
        elemAsegurable.addElement("rut").addText("14347708-8");
        elemAsegurable.addElement("nombres").addText("ROSA MARGARITA CORTES BUGUENO");
        elemAsegurable.addElement("apellidosPaterno").addText("CORTES");
        elemAsegurable.addElement("apellidosMaterno").addText("BUGUENO");
        elemAsegurable.addElement("tipoFumador").addText("SI");
        elemAsegurable.addElement("fechaNacimiento").addText("15/07/1979");
        elemAsegurable.addElement("edadActuarial").addText("37");
        elemAsegurable.addElement("sexo").addText("Femenino");
        elemAsegurable.addElement("edadconyugue").addText("");
        elemAsegurable.addElement("edadhijos").addText("");
        elemAsegurable.addElement("edadpadres").addText("");
        
        //Nodo xml usoInterno
        Element elemUsoInterno = elemProyeccion.addElement("usoInterno");
        elemUsoInterno.addElement("plan").addText("Simulación FLEXIBLE INV. GOLD A");
        elemUsoInterno.addElement("codPlan").addText("296");
        elemUsoInterno.addElement("formaPago").addText("Libre");
        elemUsoInterno.addElement("portafolioseleccionado").addText("Conservador");
        elemUsoInterno.addElement("primareferencial").addText("6.042,44");
        elemUsoInterno.addElement("supuestorentabilidad").addText("0,78 %");
        elemUsoInterno.addElement("rentaImponible").addText("");
        elemUsoInterno.addElement("codigoSvsPol").addText("POL220150832");
        
        //Nodo xml primaTotal
        Element elemPrimaTotal = elemProyeccion.addElement("primaTotal");
        elemPrimaTotal.addElement("valorMoneda").addText("26.148,38");
        elemPrimaTotal.addElement("primaProyectada").addText("6.042,44");
        
        //Nodo xml parametros
        Element elemParametros = elemProyeccion.addElement("parametros");
        elemParametros.addElement("recargosimulador").addText("");
        
        //Nodo edadAhorro
        Element elemEdadAhorro = elemProyeccion.addElement("edadahorro");
        Element elemEdad = elemEdadAhorro.addElement("edad");
        elemEdad.addElement("finalano").addText("");
        
        //Nodo cotizacion
        Element elemCotizacion = elemProyeccion.addElement("cotizacion");
        Element elemCoberturas = elemCotizacion.addElement("coberturas");
        Element elemCobertura = elemCoberturas.addElement("cobertura");
        elemCobertura.addElement("nombreCobertura").addText("FALLECIMIENTO");
        elemCobertura.addElement("capital").addText("91,00");
        elemCobertura.addElement("nasegurados").addText("1");
        elemCobertura.addElement("ntotalprima").addText("91,00");
        
        xml = document.asXML();
        return xml;
    }

}