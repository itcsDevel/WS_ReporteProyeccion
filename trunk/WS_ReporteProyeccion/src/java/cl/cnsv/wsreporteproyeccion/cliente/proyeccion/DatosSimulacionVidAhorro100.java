
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSimulacionVidAhorro100 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSimulacionVidAhorro100">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaCalculoProyeccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaProyectadaSFP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="supuestoRentabilidad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSimulacionVidAhorro100", propOrder = {
    "codigoPlan",
    "fechaCalculoProyeccion",
    "formaPago",
    "primaProyectadaSFP",
    "supuestoRentabilidad"
})
public class DatosSimulacionVidAhorro100 {

    protected Integer codigoPlan;
    protected String fechaCalculoProyeccion;
    protected String formaPago;
    protected Double primaProyectadaSFP;
    protected Double supuestoRentabilidad;

    /**
     * Gets the value of the codigoPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoPlan() {
        return codigoPlan;
    }

    /**
     * Sets the value of the codigoPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoPlan(Integer value) {
        this.codigoPlan = value;
    }

    /**
     * Gets the value of the fechaCalculoProyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCalculoProyeccion() {
        return fechaCalculoProyeccion;
    }

    /**
     * Sets the value of the fechaCalculoProyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCalculoProyeccion(String value) {
        this.fechaCalculoProyeccion = value;
    }

    /**
     * Gets the value of the formaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Sets the value of the formaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the primaProyectadaSFP property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimaProyectadaSFP() {
        return primaProyectadaSFP;
    }

    /**
     * Sets the value of the primaProyectadaSFP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimaProyectadaSFP(Double value) {
        this.primaProyectadaSFP = value;
    }

    /**
     * Gets the value of the supuestoRentabilidad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSupuestoRentabilidad() {
        return supuestoRentabilidad;
    }

    /**
     * Sets the value of the supuestoRentabilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSupuestoRentabilidad(Double value) {
        this.supuestoRentabilidad = value;
    }

}
