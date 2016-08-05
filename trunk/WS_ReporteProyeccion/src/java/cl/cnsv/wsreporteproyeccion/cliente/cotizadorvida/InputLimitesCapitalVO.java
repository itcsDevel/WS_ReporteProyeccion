
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
<<<<<<< HEAD
 *         &lt;element name="nbranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmodulec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nproduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
=======
 *         &lt;element name="nbranch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ncover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nmodulec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nproduct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nrol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
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

<<<<<<< HEAD
    protected String nbranch;
    protected String ncover;
    protected String nmodulec;
    protected String nproduct;
    protected String nrol;
=======
    protected Integer nbranch;
    protected Integer ncover;
    protected Integer nmodulec;
    protected Integer nproduct;
    protected Integer nrol;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * Gets the value of the nbranch property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNbranch() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNbranch() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nbranch;
    }

    /**
     * Sets the value of the nbranch property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNbranch(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNbranch(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nbranch = value;
    }

    /**
     * Gets the value of the ncover property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNcover() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNcover() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return ncover;
    }

    /**
     * Sets the value of the ncover property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNcover(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNcover(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.ncover = value;
    }

    /**
     * Gets the value of the nmodulec property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNmodulec() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNmodulec() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nmodulec;
    }

    /**
     * Sets the value of the nmodulec property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNmodulec(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNmodulec(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nmodulec = value;
    }

    /**
     * Gets the value of the nproduct property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNproduct() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNproduct() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nproduct;
    }

    /**
     * Sets the value of the nproduct property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNproduct(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNproduct(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nproduct = value;
    }

    /**
     * Gets the value of the nrol property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getNrol() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getNrol() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return nrol;
    }

    /**
     * Sets the value of the nrol property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setNrol(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setNrol(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.nrol = value;
    }

}
