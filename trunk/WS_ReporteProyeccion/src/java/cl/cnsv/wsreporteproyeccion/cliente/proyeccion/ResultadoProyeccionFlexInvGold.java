
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultadoProyeccionFlexInvGold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultadoProyeccionFlexInvGold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edadActuarial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="finalAnnio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indemnizacionFallecimiento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="premioPermanencia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="primaAcumulada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorPoliza" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoProyeccionFlexInvGold", propOrder = {
    "edadActuarial",
    "finalAnnio",
    "indemnizacionFallecimiento",
    "premioPermanencia",
    "primaAcumulada",
    "valorPoliza"
})
public class ResultadoProyeccionFlexInvGold {

    protected Integer edadActuarial;
    protected Integer finalAnnio;
    protected Double indemnizacionFallecimiento;
    protected Double premioPermanencia;
    protected Double primaAcumulada;
    protected Double valorPoliza;

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
     * Gets the value of the finalAnnio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinalAnnio() {
        return finalAnnio;
    }

    /**
     * Sets the value of the finalAnnio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinalAnnio(Integer value) {
        this.finalAnnio = value;
    }

    /**
     * Gets the value of the indemnizacionFallecimiento property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIndemnizacionFallecimiento() {
        return indemnizacionFallecimiento;
    }

    /**
     * Sets the value of the indemnizacionFallecimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIndemnizacionFallecimiento(Double value) {
        this.indemnizacionFallecimiento = value;
    }

    /**
     * Gets the value of the premioPermanencia property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremioPermanencia() {
        return premioPermanencia;
    }

    /**
     * Sets the value of the premioPermanencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremioPermanencia(Double value) {
        this.premioPermanencia = value;
    }

    /**
     * Gets the value of the primaAcumulada property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimaAcumulada() {
        return primaAcumulada;
    }

    /**
     * Sets the value of the primaAcumulada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimaAcumulada(Double value) {
        this.primaAcumulada = value;
    }

    /**
     * Gets the value of the valorPoliza property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPoliza() {
        return valorPoliza;
    }

    /**
     * Sets the value of the valorPoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPoliza(Double value) {
        this.valorPoliza = value;
    }

}
