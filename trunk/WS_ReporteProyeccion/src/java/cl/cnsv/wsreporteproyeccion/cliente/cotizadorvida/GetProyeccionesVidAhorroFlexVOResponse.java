
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProyeccionesVidAhorroFlexVOResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProyeccionesVidAhorroFlexVOResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.wscotizadorvida.cnsv.cl/}outputWSProyeccionVidAhorroFlex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProyeccionesVidAhorroFlexVOResponse", propOrder = {
    "_return"
})
public class GetProyeccionesVidAhorroFlexVOResponse {

    @XmlElement(name = "return")
    protected OutputWSProyeccionVidAhorroFlex _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OutputWSProyeccionVidAhorroFlex }
     *     
     */
    public OutputWSProyeccionVidAhorroFlex getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputWSProyeccionVidAhorroFlex }
     *     
     */
    public void setReturn(OutputWSProyeccionVidAhorroFlex value) {
        this._return = value;
    }

}
