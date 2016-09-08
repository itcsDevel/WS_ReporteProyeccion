
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capitalPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costoCoberturaAnual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaUf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaProyeccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtimeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planVO", propOrder = {
    "capitalPlan",
    "costoCoberturaAnual",
    "nombre",
    "primaUf",
    "tasaProyeccion",
    "vtimeId"
})
public class PlanVO {

    protected String capitalPlan;
    protected String costoCoberturaAnual;
    protected String nombre;
    protected String primaUf;
    protected String tasaProyeccion;
    protected String vtimeId;

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
     * Gets the value of the costoCoberturaAnual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostoCoberturaAnual() {
        return costoCoberturaAnual;
    }

    /**
     * Sets the value of the costoCoberturaAnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostoCoberturaAnual(String value) {
        this.costoCoberturaAnual = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the primaUf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaUf() {
        return primaUf;
    }

    /**
     * Sets the value of the primaUf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaUf(String value) {
        this.primaUf = value;
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
     * Gets the value of the vtimeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtimeId() {
        return vtimeId;
    }

    /**
     * Sets the value of the vtimeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtimeId(String value) {
        this.vtimeId = value;
    }

}
