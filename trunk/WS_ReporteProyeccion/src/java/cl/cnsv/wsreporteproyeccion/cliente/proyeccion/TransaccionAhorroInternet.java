
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaccionAhorroInternet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaccionAhorroInternet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capitalMuerteAccidental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAnual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaProyectadaMensual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaProyeccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccionAhorroInternet", propOrder = {
    "capitalMuerteAccidental",
    "capitalPlan",
    "ccAnual",
    "fechaNacimiento",
    "primaProyectadaMensual",
    "tasaProyeccion",
    "nBranch"
})
public class TransaccionAhorroInternet {

    protected String capitalMuerteAccidental;
    protected String capitalPlan;
    protected String ccAnual;
    protected String fechaNacimiento;
    protected String primaProyectadaMensual;
    protected String tasaProyeccion;
    protected String nBranch;

    /**
     * Gets the value of the capitalMuerteAccidental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalMuerteAccidental() {
        return capitalMuerteAccidental;
    }

    /**
     * Sets the value of the capitalMuerteAccidental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalMuerteAccidental(String value) {
        this.capitalMuerteAccidental = value;
    }

    /**
     * Gets the value of the capitalPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalPlan() {
        return capitalPlan;
    }

    /**
     * Sets the value of the capitalPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalPlan(String value) {
        this.capitalPlan = value;
    }

    /**
     * Gets the value of the ccAnual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAnual() {
        return ccAnual;
    }

    /**
     * Sets the value of the ccAnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAnual(String value) {
        this.ccAnual = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the primaProyectadaMensual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaProyectadaMensual() {
        return primaProyectadaMensual;
    }

    /**
     * Sets the value of the primaProyectadaMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaProyectadaMensual(String value) {
        this.primaProyectadaMensual = value;
    }

    /**
     * Gets the value of the tasaProyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaProyeccion() {
        return tasaProyeccion;
    }

    /**
     * Sets the value of the tasaProyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaProyeccion(String value) {
        this.tasaProyeccion = value;
    }

    /**
     * Gets the value of the nBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBranch() {
        return nBranch;
    }

    /**
     * Sets the value of the nBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBranch(String value) {
        this.nBranch = value;
    }

}
