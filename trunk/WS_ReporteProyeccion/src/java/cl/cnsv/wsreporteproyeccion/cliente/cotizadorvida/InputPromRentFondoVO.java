
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputPromRentFondoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputPromRentFondoVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
<<<<<<< HEAD
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deffecdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fondo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
=======
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deffecdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fondo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "inputPromRentFondoVO", propOrder = {
    "anno",
    "deffecdate",
    "fondo",
    "mes"
})
public class InputPromRentFondoVO {

<<<<<<< HEAD
    protected String anno;
    protected String deffecdate;
    protected String fondo;
    protected String mes;
=======
    protected Integer anno;
    protected String deffecdate;
    protected Integer fondo;
    protected Integer mes;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getAnno() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getAnno() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setAnno(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setAnno(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.anno = value;
    }

    /**
     * Gets the value of the deffecdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeffecdate() {
        return deffecdate;
    }

    /**
     * Sets the value of the deffecdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeffecdate(String value) {
        this.deffecdate = value;
    }

    /**
     * Gets the value of the fondo property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getFondo() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getFondo() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return fondo;
    }

    /**
     * Sets the value of the fondo property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setFondo(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setFondo(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.fondo = value;
    }

    /**
     * Gets the value of the mes property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getMes() {
=======
     *     {@link Integer }
     *     
     */
    public Integer getMes() {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        return mes;
    }

    /**
     * Sets the value of the mes property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setMes(String value) {
=======
     *     {@link Integer }
     *     
     */
    public void setMes(Integer value) {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
        this.mes = value;
    }

}
