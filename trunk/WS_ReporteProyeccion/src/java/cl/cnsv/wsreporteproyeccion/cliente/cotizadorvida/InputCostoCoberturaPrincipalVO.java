
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputCostoCoberturaPrincipalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputCostoCoberturaPrincipalVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
<<<<<<< HEAD
 *         &lt;element name="NCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nModulec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
=======
 *         &lt;element name="NCapital" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nBranch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nModulec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nProduct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
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
@XmlType(name = "inputCostoCoberturaPrincipalVO", propOrder = {
    "fecha",
    "nCapital",
    "nBranch",
    "nCover",
    "nModulec",
    "nProduct",
    "nSex",
    "sSmoking"
})
public class InputCostoCoberturaPrincipalVO {

    protected String fecha;
    @XmlElement(name = "NCapital")
<<<<<<< HEAD
    protected String nCapital;
    protected String nBranch;
    protected String nCover;
    protected String nModulec;
    protected String nProduct;
    protected String nSex;
=======
    protected Integer nCapital;
    protected Integer nBranch;
    protected Integer nCover;
    protected Integer nModulec;
    protected Integer nProduct;
    protected Integer nSex;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
    protected String sSmoking;

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the nCapital property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNCapital() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNCapital() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nCapital;
    }

    /**
     * Sets the value of the nCapital property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNCapital(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNCapital(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nCapital = value;
    }

    /**
     * Gets the value of the nBranch property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNBranch() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNBranch() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nBranch;
    }

    /**
     * Sets the value of the nBranch property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNBranch(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNBranch(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nBranch = value;
    }

    /**
     * Gets the value of the nCover property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNCover() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNCover() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nCover;
    }

    /**
     * Sets the value of the nCover property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNCover(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNCover(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nCover = value;
    }

    /**
     * Gets the value of the nModulec property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNModulec() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNModulec() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nModulec;
    }

    /**
     * Sets the value of the nModulec property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNModulec(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNModulec(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nModulec = value;
    }

    /**
     * Gets the value of the nProduct property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNProduct() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNProduct() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nProduct;
    }

    /**
     * Sets the value of the nProduct property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNProduct(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNProduct(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nProduct = value;
    }

    /**
     * Gets the value of the nSex property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNSex() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNSex() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nSex;
    }

    /**
     * Sets the value of the nSex property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNSex(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNSex(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
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
