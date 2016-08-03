
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProyeccionesVidAhorro100VOResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProyeccionesVidAhorro100VOResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.wscotizadorvida.cnsv.cl/}outputWSProyeccionVidAhorro100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProyeccionesVidAhorro100VOResponse", propOrder = {
    "_return"
})
public class GetProyeccionesVidAhorro100VOResponse {

    @XmlElement(name = "return")
    protected OutputWSProyeccionVidAhorro100 _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OutputWSProyeccionVidAhorro100 }
     *     
     */
    public OutputWSProyeccionVidAhorro100 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputWSProyeccionVidAhorro100 }
     *     
     */
    public void setReturn(OutputWSProyeccionVidAhorro100 value) {
        this._return = value;
    }

}
