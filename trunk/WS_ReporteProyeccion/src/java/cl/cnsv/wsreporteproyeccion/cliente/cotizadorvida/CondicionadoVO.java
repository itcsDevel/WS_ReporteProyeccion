
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for condicionadoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="condicionadoVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dcompdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nidcondmaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntypecodsvs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nusercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scondsvs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snamecodsvs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condicionadoVO", propOrder = {
    "dcompdate",
    "nidcondmaster",
    "ntypecodsvs",
    "nusercode",
    "scondsvs",
    "snamecodsvs"
})
public class CondicionadoVO {

    protected String dcompdate;
    protected String nidcondmaster;
    protected String ntypecodsvs;
    protected String nusercode;
    protected String scondsvs;
    protected String snamecodsvs;

    /**
     * Gets the value of the dcompdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcompdate() {
        return dcompdate;
    }

    /**
     * Sets the value of the dcompdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcompdate(String value) {
        this.dcompdate = value;
    }

    /**
     * Gets the value of the nidcondmaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNidcondmaster() {
        return nidcondmaster;
    }

    /**
     * Sets the value of the nidcondmaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNidcondmaster(String value) {
        this.nidcondmaster = value;
    }

    /**
     * Gets the value of the ntypecodsvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtypecodsvs() {
        return ntypecodsvs;
    }

    /**
     * Sets the value of the ntypecodsvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtypecodsvs(String value) {
        this.ntypecodsvs = value;
    }

    /**
     * Gets the value of the nusercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNusercode() {
        return nusercode;
    }

    /**
     * Sets the value of the nusercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNusercode(String value) {
        this.nusercode = value;
    }

    /**
     * Gets the value of the scondsvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScondsvs() {
        return scondsvs;
    }

    /**
     * Sets the value of the scondsvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScondsvs(String value) {
        this.scondsvs = value;
    }

    /**
     * Gets the value of the snamecodsvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnamecodsvs() {
        return snamecodsvs;
    }

    /**
     * Sets the value of the snamecodsvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnamecodsvs(String value) {
        this.snamecodsvs = value;
    }

}
