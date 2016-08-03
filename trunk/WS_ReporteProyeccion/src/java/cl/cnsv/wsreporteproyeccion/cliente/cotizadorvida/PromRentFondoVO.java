
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for promRentFondoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="promRentFondoVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dcompdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deffecdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dnulldate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="naverageprof" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nfunds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nmonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nusercode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nyear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promRentFondoVO", propOrder = {
    "dcompdate",
    "deffecdate",
    "dnulldate",
    "naverageprof",
    "nfunds",
    "nmonth",
    "nusercode",
    "nyear"
})
public class PromRentFondoVO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dcompdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deffecdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dnulldate;
    protected Double naverageprof;
    protected Integer nfunds;
    protected Integer nmonth;
    protected Integer nusercode;
    protected Integer nyear;

    /**
     * Gets the value of the dcompdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDcompdate() {
        return dcompdate;
    }

    /**
     * Sets the value of the dcompdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDcompdate(XMLGregorianCalendar value) {
        this.dcompdate = value;
    }

    /**
     * Gets the value of the deffecdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeffecdate() {
        return deffecdate;
    }

    /**
     * Sets the value of the deffecdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeffecdate(XMLGregorianCalendar value) {
        this.deffecdate = value;
    }

    /**
     * Gets the value of the dnulldate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDnulldate() {
        return dnulldate;
    }

    /**
     * Sets the value of the dnulldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDnulldate(XMLGregorianCalendar value) {
        this.dnulldate = value;
    }

    /**
     * Gets the value of the naverageprof property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNaverageprof() {
        return naverageprof;
    }

    /**
     * Sets the value of the naverageprof property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNaverageprof(Double value) {
        this.naverageprof = value;
    }

    /**
     * Gets the value of the nfunds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNfunds() {
        return nfunds;
    }

    /**
     * Sets the value of the nfunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNfunds(Integer value) {
        this.nfunds = value;
    }

    /**
     * Gets the value of the nmonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNmonth() {
        return nmonth;
    }

    /**
     * Sets the value of the nmonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNmonth(Integer value) {
        this.nmonth = value;
    }

    /**
     * Gets the value of the nusercode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNusercode() {
        return nusercode;
    }

    /**
     * Sets the value of the nusercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNusercode(Integer value) {
        this.nusercode = value;
    }

    /**
     * Gets the value of the nyear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNyear() {
        return nyear;
    }

    /**
     * Sets the value of the nyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNyear(Integer value) {
        this.nyear = value;
    }

}
