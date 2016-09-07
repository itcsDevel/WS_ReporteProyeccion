
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDatosEmailCotizacionInternetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDatosEmailCotizacionInternetResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cnsv.cl/}outputEmailCotizacionInternetVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDatosEmailCotizacionInternetResponse", propOrder = {
    "_return"
})
public class GetDatosEmailCotizacionInternetResponse {

    @XmlElement(name = "return")
    protected OutputEmailCotizacionInternetVO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OutputEmailCotizacionInternetVO }
     *     
     */
    public OutputEmailCotizacionInternetVO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputEmailCotizacionInternetVO }
     *     
     */
    public void setReturn(OutputEmailCotizacionInternetVO value) {
        this._return = value;
    }

}
