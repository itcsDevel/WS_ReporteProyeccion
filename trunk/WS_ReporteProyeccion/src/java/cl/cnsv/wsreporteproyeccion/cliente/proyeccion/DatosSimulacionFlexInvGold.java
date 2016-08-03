
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSimulacionFlexInvGold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSimulacionFlexInvGold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaCalculoProyeccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primeraPrima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rentabilidadAnual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSimulacionFlexInvGold", propOrder = {
    "codigoPlan",
    "fechaCalculoProyeccion",
    "primeraPrima",
    "rentabilidadAnual"
})
public class DatosSimulacionFlexInvGold {

    protected Integer codigoPlan;
    protected String fechaCalculoProyeccion;
    protected Double primeraPrima;
    protected Double rentabilidadAnual;

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
     * Gets the value of the primeraPrima property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimeraPrima() {
        return primeraPrima;
    }

    /**
     * Sets the value of the primeraPrima property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimeraPrima(Double value) {
        this.primeraPrima = value;
    }

    /**
     * Gets the value of the rentabilidadAnual property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRentabilidadAnual() {
        return rentabilidadAnual;
    }

    /**
     * Sets the value of the rentabilidadAnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRentabilidadAnual(Double value) {
        this.rentabilidadAnual = value;
    }

}
