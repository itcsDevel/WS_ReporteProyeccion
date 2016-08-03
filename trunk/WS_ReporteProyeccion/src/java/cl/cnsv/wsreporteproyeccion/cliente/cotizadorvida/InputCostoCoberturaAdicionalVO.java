
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputCostoCoberturaAdicionalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputCostoCoberturaAdicionalVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NCapital" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nModulec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nProduct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sSmoking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputCostoCoberturaAdicionalVO", propOrder = {
    "nCapital",
    "nCover",
    "nModulec",
    "nProduct",
    "nSex",
    "sSmoking"
})
public class InputCostoCoberturaAdicionalVO {

    @XmlElement(name = "NCapital")
    protected Integer nCapital;
    protected Integer nCover;
    protected Integer nModulec;
    protected Integer nProduct;
    protected Integer nSex;
    protected String sSmoking;

    /**
     * Gets the value of the nCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCapital() {
        return nCapital;
    }

    /**
     * Sets the value of the nCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCapital(Integer value) {
        this.nCapital = value;
    }

    /**
     * Gets the value of the nCover property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCover() {
        return nCover;
    }

    /**
     * Sets the value of the nCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCover(Integer value) {
        this.nCover = value;
    }

    /**
     * Gets the value of the nModulec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNModulec() {
        return nModulec;
    }

    /**
     * Sets the value of the nModulec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNModulec(Integer value) {
        this.nModulec = value;
    }

    /**
     * Gets the value of the nProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNProduct() {
        return nProduct;
    }

    /**
     * Sets the value of the nProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNProduct(Integer value) {
        this.nProduct = value;
    }

    /**
     * Gets the value of the nSex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSex() {
        return nSex;
    }

    /**
     * Sets the value of the nSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSex(Integer value) {
        this.nSex = value;
    }

    /**
     * Gets the value of the sSmoking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSmoking() {
        return sSmoking;
    }

    /**
     * Sets the value of the sSmoking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSmoking(String value) {
        this.sSmoking = value;
    }

}
