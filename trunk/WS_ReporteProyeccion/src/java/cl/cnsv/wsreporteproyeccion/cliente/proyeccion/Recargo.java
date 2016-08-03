
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCobertura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="porcentaje" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recargo", propOrder = {
    "codigoCobertura",
    "porcentaje",
    "tasa"
})
public class Recargo {

    protected Integer codigoCobertura;
    protected Double porcentaje;
    protected Double tasa;

    /**
     * Gets the value of the codigoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoCobertura() {
        return codigoCobertura;
    }

    /**
     * Sets the value of the codigoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoCobertura(Integer value) {
        this.codigoCobertura = value;
    }

    /**
     * Gets the value of the porcentaje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPorcentaje(Double value) {
        this.porcentaje = value;
    }

    /**
     * Gets the value of the tasa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTasa() {
        return tasa;
    }

    /**
     * Sets the value of the tasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTasa(Double value) {
        this.tasa = value;
    }

}
