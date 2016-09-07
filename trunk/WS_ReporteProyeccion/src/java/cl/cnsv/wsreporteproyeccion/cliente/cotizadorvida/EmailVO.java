
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glosaPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAsegurable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPropuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailVO", propOrder = {
    "email",
    "glosaPlan",
    "nombreAsegurable",
    "numeroPropuesta"
})
public class EmailVO {

    protected String email;
    protected String glosaPlan;
    protected String nombreAsegurable;
    protected String numeroPropuesta;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the glosaPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosaPlan() {
        return glosaPlan;
    }

    /**
     * Sets the value of the glosaPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosaPlan(String value) {
        this.glosaPlan = value;
    }

    /**
     * Gets the value of the nombreAsegurable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsegurable() {
        return nombreAsegurable;
    }

    /**
     * Sets the value of the nombreAsegurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsegurable(String value) {
        this.nombreAsegurable = value;
    }

    /**
     * Gets the value of the numeroPropuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPropuesta() {
        return numeroPropuesta;
    }

    /**
     * Sets the value of the numeroPropuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPropuesta(String value) {
        this.numeroPropuesta = value;
    }

}
