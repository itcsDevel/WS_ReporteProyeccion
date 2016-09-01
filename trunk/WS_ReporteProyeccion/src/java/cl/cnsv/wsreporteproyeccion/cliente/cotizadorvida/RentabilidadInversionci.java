
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rentabilidadInversionci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rentabilidadInversionci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoSvs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoSvsCoberturaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoSvsCoberturaMuerteAccidental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rentabilidadInversionci", namespace = "http://cnsv.cl/ci", propOrder = {
    "codigoSvs",
    "codigoSvsCoberturaFallecimiento",
    "codigoSvsCoberturaMuerteAccidental"
})
public class RentabilidadInversionci {

    protected String codigoSvs;
    protected String codigoSvsCoberturaFallecimiento;
    protected String codigoSvsCoberturaMuerteAccidental;

    /**
     * Gets the value of the codigoSvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSvs() {
        return codigoSvs;
    }

    /**
     * Sets the value of the codigoSvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSvs(String value) {
        this.codigoSvs = value;
    }

    /**
     * Gets the value of the codigoSvsCoberturaFallecimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSvsCoberturaFallecimiento() {
        return codigoSvsCoberturaFallecimiento;
    }

    /**
     * Sets the value of the codigoSvsCoberturaFallecimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSvsCoberturaFallecimiento(String value) {
        this.codigoSvsCoberturaFallecimiento = value;
    }

    /**
     * Gets the value of the codigoSvsCoberturaMuerteAccidental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSvsCoberturaMuerteAccidental() {
        return codigoSvsCoberturaMuerteAccidental;
    }

    /**
     * Sets the value of the codigoSvsCoberturaMuerteAccidental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSvsCoberturaMuerteAccidental(String value) {
        this.codigoSvsCoberturaMuerteAccidental = value;
    }

}
