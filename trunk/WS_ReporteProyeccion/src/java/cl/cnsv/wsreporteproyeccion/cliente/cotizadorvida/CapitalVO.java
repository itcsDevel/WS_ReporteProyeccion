
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capitalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capitalVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capitalFijo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="porcCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capitalVO", propOrder = {
    "capitalFijo",
    "maxCapital",
    "minCapital",
    "porcCapital"
})
public class CapitalVO {

    protected Double capitalFijo;
    protected Double maxCapital;
    protected Double minCapital;
    protected Double porcCapital;

    /**
     * Gets the value of the capitalFijo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapitalFijo() {
        return capitalFijo;
    }

    /**
     * Sets the value of the capitalFijo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapitalFijo(Double value) {
        this.capitalFijo = value;
    }

    /**
     * Gets the value of the maxCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxCapital() {
        return maxCapital;
    }

    /**
     * Sets the value of the maxCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxCapital(Double value) {
        this.maxCapital = value;
    }

    /**
     * Gets the value of the minCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinCapital() {
        return minCapital;
    }

    /**
     * Sets the value of the minCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinCapital(Double value) {
        this.minCapital = value;
    }

    /**
     * Gets the value of the porcCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPorcCapital() {
        return porcCapital;
    }

    /**
     * Sets the value of the porcCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPorcCapital(Double value) {
        this.porcCapital = value;
    }

}
