
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputMontosInyeccionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputMontosInyeccionVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
<<<<<<< HEAD
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
=======
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modulec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "inputMontosInyeccionVO", propOrder = {
    "branch",
<<<<<<< HEAD
=======
    "modulec",
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
    "product"
})
public class InputMontosInyeccionVO {

<<<<<<< HEAD
    protected String branch;
    protected String product;
=======
    protected Integer branch;
    protected Integer modulec;
    protected Integer product;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getBranch() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getBranch() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setBranch(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.branch = value;
    }

    /**
<<<<<<< HEAD
=======
     * Gets the value of the modulec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModulec() {
        return modulec;
    }

    /**
     * Sets the value of the modulec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModulec(Integer value) {
        this.modulec = value;
    }

    /**
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getProduct() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getProduct() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setProduct(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.product = value;
    }

}
