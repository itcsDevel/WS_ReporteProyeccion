
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerProyeccionVidAhorro57BisResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerProyeccionVidAhorro57BisResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.proyeccion.cnsv.cl/}respuestaVidAhorro57Bis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProyeccionVidAhorro57BisResponse", propOrder = {
    "_return"
})
public class ObtenerProyeccionVidAhorro57BisResponse {

    @XmlElement(name = "return")
    protected RespuestaVidAhorro57Bis _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaVidAhorro57Bis }
     *     
     */
    public RespuestaVidAhorro57Bis getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaVidAhorro57Bis }
     *     
     */
    public void setReturn(RespuestaVidAhorro57Bis value) {
        this._return = value;
    }

}
