
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for costoCoberturaAdicionalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="costoCoberturaAdicionalVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cosoMensual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="edadActuarial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tasaMensual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "costoCoberturaAdicionalVO", propOrder = {
    "cosoMensual",
    "edadActuarial",
    "tasaMensual"
})
public class CostoCoberturaAdicionalVO {

    protected Double cosoMensual;
    protected Integer edadActuarial;
    protected Double tasaMensual;

    /**
     * Gets the value of the cosoMensual property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCosoMensual() {
        return cosoMensual;
    }

    /**
     * Sets the value of the cosoMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCosoMensual(Double value) {
        this.cosoMensual = value;
    }

    /**
     * Gets the value of the edadActuarial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdadActuarial() {
        return edadActuarial;
    }

    /**
     * Sets the value of the edadActuarial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdadActuarial(Integer value) {
        this.edadActuarial = value;
    }

    /**
     * Gets the value of the tasaMensual property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTasaMensual() {
        return tasaMensual;
    }

    /**
     * Sets the value of the tasaMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTasaMensual(Double value) {
        this.tasaMensual = value;
    }

}
