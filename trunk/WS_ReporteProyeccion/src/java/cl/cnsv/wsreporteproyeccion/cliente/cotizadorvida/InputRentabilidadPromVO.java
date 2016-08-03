
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputRentabilidadPromVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputRentabilidadPromVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dfecCotiz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbranch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ncountFondo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nproduct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="slistFondo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputRentabilidadPromVO", propOrder = {
    "dfecCotiz",
    "nbranch",
    "ncountFondo",
    "nproduct",
    "slistFondo"
})
public class InputRentabilidadPromVO {

    protected String dfecCotiz;
    protected Integer nbranch;
    protected Integer ncountFondo;
    protected Integer nproduct;
    protected String slistFondo;

    /**
     * Gets the value of the dfecCotiz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfecCotiz() {
        return dfecCotiz;
    }

    /**
     * Sets the value of the dfecCotiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfecCotiz(String value) {
        this.dfecCotiz = value;
    }

    /**
     * Gets the value of the nbranch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbranch() {
        return nbranch;
    }

    /**
     * Sets the value of the nbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbranch(Integer value) {
        this.nbranch = value;
    }

    /**
     * Gets the value of the ncountFondo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNcountFondo() {
        return ncountFondo;
    }

    /**
     * Sets the value of the ncountFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNcountFondo(Integer value) {
        this.ncountFondo = value;
    }

    /**
     * Gets the value of the nproduct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNproduct() {
        return nproduct;
    }

    /**
     * Sets the value of the nproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNproduct(Integer value) {
        this.nproduct = value;
    }

    /**
     * Gets the value of the slistFondo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlistFondo() {
        return slistFondo;
    }

    /**
     * Sets the value of the slistFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlistFondo(String value) {
        this.slistFondo = value;
    }

}
