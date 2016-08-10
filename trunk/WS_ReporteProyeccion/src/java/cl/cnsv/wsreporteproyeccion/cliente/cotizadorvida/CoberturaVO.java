
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coberturaVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coberturaVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="npersonas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="primaReferencialAnual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coberturaVO", propOrder = {
    "nombre",
    "capital",
    "npersonas",
    "primaReferencialAnual"
})
public class CoberturaVO {

    protected String nombre;
    protected Double capital;
    protected Integer npersonas;
    protected Double primaReferencialAnual;

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapital(Double value) {
        this.capital = value;
    }

    /**
     * Gets the value of the npersonas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNpersonas() {
        return npersonas;
    }

    /**
     * Sets the value of the npersonas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNpersonas(Integer value) {
        this.npersonas = value;
    }

    /**
     * Gets the value of the primaReferencialAnual property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimaReferencialAnual() {
        return primaReferencialAnual;
    }

    /**
     * Sets the value of the primaReferencialAnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimaReferencialAnual(Double value) {
        this.primaReferencialAnual = value;
    }

}
