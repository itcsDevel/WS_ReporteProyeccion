
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCostoCoberturaPrincipalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCostoCoberturaPrincipalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.wscotizadorvida.cnsv.cl/}outputCostoCoberturaPrincipalVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCostoCoberturaPrincipalResponse", propOrder = {
    "_return"
})
public class GetCostoCoberturaPrincipalResponse {

    @XmlElement(name = "return")
    protected OutputCostoCoberturaPrincipalVO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OutputCostoCoberturaPrincipalVO }
     *     
     */
    public OutputCostoCoberturaPrincipalVO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputCostoCoberturaPrincipalVO }
     *     
     */
    public void setReturn(OutputCostoCoberturaPrincipalVO value) {
        this._return = value;
    }

}
