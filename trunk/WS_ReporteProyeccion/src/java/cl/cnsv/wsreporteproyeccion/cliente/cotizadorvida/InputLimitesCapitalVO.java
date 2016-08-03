
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputLimitesCapitalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputLimitesCapitalVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nbranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmodulec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nproduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputLimitesCapitalVO", propOrder = {
    "nbranch",
    "ncover",
    "nmodulec",
    "nproduct",
    "nrol"
})
public class InputLimitesCapitalVO {

    protected String nbranch;
    protected String ncover;
    protected String nmodulec;
    protected String nproduct;
    protected String nrol;

    /**
     * Gets the value of the nbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbranch() {
        return nbranch;
    }

    /**
     * Sets the value of the nbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbranch(String value) {
        this.nbranch = value;
    }

    /**
     * Gets the value of the ncover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcover() {
        return ncover;
    }

    /**
     * Sets the value of the ncover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcover(String value) {
        this.ncover = value;
    }

    /**
     * Gets the value of the nmodulec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmodulec() {
        return nmodulec;
    }

    /**
     * Sets the value of the nmodulec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmodulec(String value) {
        this.nmodulec = value;
    }

    /**
     * Gets the value of the nproduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNproduct() {
        return nproduct;
    }

    /**
     * Sets the value of the nproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNproduct(String value) {
        this.nproduct = value;
    }

    /**
     * Gets the value of the nrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrol() {
        return nrol;
    }

    /**
     * Sets the value of the nrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrol(String value) {
        this.nrol = value;
    }

}
