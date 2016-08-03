
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProyeccionesVidAhorro57BisVOResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProyeccionesVidAhorro57BisVOResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.wscotizadorvida.cnsv.cl/}outputWSProyeccionVidAhorro57Bis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProyeccionesVidAhorro57BisVOResponse", propOrder = {
    "_return"
})
public class GetProyeccionesVidAhorro57BisVOResponse {

    @XmlElement(name = "return")
    protected OutputWSProyeccionVidAhorro57Bis _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OutputWSProyeccionVidAhorro57Bis }
     *     
     */
    public OutputWSProyeccionVidAhorro57Bis getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputWSProyeccionVidAhorro57Bis }
     *     
     */
    public void setReturn(OutputWSProyeccionVidAhorro57Bis value) {
        this._return = value;
    }

}
