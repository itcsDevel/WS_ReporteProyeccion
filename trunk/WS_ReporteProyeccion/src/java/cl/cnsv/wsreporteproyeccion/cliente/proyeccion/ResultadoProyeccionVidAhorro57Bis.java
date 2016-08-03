
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultadoProyeccionVidAhorro57Bis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultadoProyeccionVidAhorro57Bis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficioTributario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="beneficioTributarioAcum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="edadActuarial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="finalAnnio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indemnizacionFallecimiento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="primaPagadaAcumulada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoAhorroNeto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorPoliza" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorPoliza57Bis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorRescate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoProyeccionVidAhorro57Bis", propOrder = {
    "beneficioTributario",
    "beneficioTributarioAcum",
    "edadActuarial",
    "finalAnnio",
    "indemnizacionFallecimiento",
    "primaPagadaAcumulada",
    "saldoAhorroNeto",
    "valorPoliza",
    "valorPoliza57Bis",
    "valorRescate"
})
public class ResultadoProyeccionVidAhorro57Bis {

    protected Double beneficioTributario;
    protected Double beneficioTributarioAcum;
    protected Integer edadActuarial;
    protected Integer finalAnnio;
    protected Double indemnizacionFallecimiento;
    protected Double primaPagadaAcumulada;
    protected Double saldoAhorroNeto;
    protected Double valorPoliza;
    protected Double valorPoliza57Bis;
    protected Double valorRescate;

    /**
     * Gets the value of the beneficioTributario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeneficioTributario() {
        return beneficioTributario;
    }

    /**
     * Sets the value of the beneficioTributario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeneficioTributario(Double value) {
        this.beneficioTributario = value;
    }

    /**
     * Gets the value of the beneficioTributarioAcum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeneficioTributarioAcum() {
        return beneficioTributarioAcum;
    }

    /**
     * Sets the value of the beneficioTributarioAcum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeneficioTributarioAcum(Double value) {
        this.beneficioTributarioAcum = value;
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
     * Gets the value of the primaPagadaAcumulada property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimaPagadaAcumulada() {
        return primaPagadaAcumulada;
    }

    /**
     * Sets the value of the primaPagadaAcumulada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimaPagadaAcumulada(Double value) {
        this.primaPagadaAcumulada = value;
    }

    /**
     * Gets the value of the saldoAhorroNeto property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoAhorroNeto() {
        return saldoAhorroNeto;
    }

    /**
     * Sets the value of the saldoAhorroNeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoAhorroNeto(Double value) {
        this.saldoAhorroNeto = value;
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

    /**
     * Gets the value of the valorPoliza57Bis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPoliza57Bis() {
        return valorPoliza57Bis;
    }

    /**
     * Sets the value of the valorPoliza57Bis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPoliza57Bis(Double value) {
        this.valorPoliza57Bis = value;
    }

    /**
     * Gets the value of the valorRescate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorRescate() {
        return valorRescate;
    }

    /**
     * Sets the value of the valorRescate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorRescate(Double value) {
        this.valorRescate = value;
    }

}
