
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usoInternoci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usoInternoci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenteVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificadoCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="declaracionBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fondoInversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gastosSuscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDpsConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodoCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rmg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usoInternoci", namespace = "http://cnsv.cl/ci", propOrder = {
    "agenteVenta",
    "certificadoCobertura",
    "codigoAgencia",
    "declaracionBeneficiario",
    "fechaInicio",
    "fechaTermino",
    "fondoInversion",
    "formaPago",
    "gastosSuscripcion",
    "moneda",
    "numeroDps",
    "numeroDpsConyuge",
    "opcion",
    "origenVenta",
    "periodoCobertura",
    "periodoPago",
    "plan",
    "rmg"
})
public class UsoInternoci {

    protected String agenteVenta;
    protected String certificadoCobertura;
    protected String codigoAgencia;
    protected String declaracionBeneficiario;
    protected String fechaInicio;
    protected String fechaTermino;
    protected String fondoInversion;
    protected String formaPago;
    protected String gastosSuscripcion;
    protected String moneda;
    protected String numeroDps;
    protected String numeroDpsConyuge;
    protected String opcion;
    protected String origenVenta;
    protected String periodoCobertura;
    protected String periodoPago;
    protected String plan;
    protected String rmg;

    /**
     * Gets the value of the agenteVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenteVenta() {
        return agenteVenta;
    }

    /**
     * Sets the value of the agenteVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenteVenta(String value) {
        this.agenteVenta = value;
    }

    /**
     * Gets the value of the certificadoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificadoCobertura() {
        return certificadoCobertura;
    }

    /**
     * Sets the value of the certificadoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificadoCobertura(String value) {
        this.certificadoCobertura = value;
    }

    /**
     * Gets the value of the codigoAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    /**
     * Sets the value of the codigoAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAgencia(String value) {
        this.codigoAgencia = value;
    }

    /**
     * Gets the value of the declaracionBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaracionBeneficiario() {
        return declaracionBeneficiario;
    }

    /**
     * Sets the value of the declaracionBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaracionBeneficiario(String value) {
        this.declaracionBeneficiario = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaTermino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTermino() {
        return fechaTermino;
    }

    /**
     * Sets the value of the fechaTermino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTermino(String value) {
        this.fechaTermino = value;
    }

    /**
     * Gets the value of the fondoInversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFondoInversion() {
        return fondoInversion;
    }

    /**
     * Sets the value of the fondoInversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFondoInversion(String value) {
        this.fondoInversion = value;
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
     * Gets the value of the gastosSuscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGastosSuscripcion() {
        return gastosSuscripcion;
    }

    /**
     * Sets the value of the gastosSuscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGastosSuscripcion(String value) {
        this.gastosSuscripcion = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the numeroDps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDps() {
        return numeroDps;
    }

    /**
     * Sets the value of the numeroDps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDps(String value) {
        this.numeroDps = value;
    }

    /**
     * Gets the value of the numeroDpsConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDpsConyuge() {
        return numeroDpsConyuge;
    }

    /**
     * Sets the value of the numeroDpsConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDpsConyuge(String value) {
        this.numeroDpsConyuge = value;
    }

    /**
     * Gets the value of the opcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcion() {
        return opcion;
    }

    /**
     * Sets the value of the opcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcion(String value) {
        this.opcion = value;
    }

    /**
     * Gets the value of the origenVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenVenta() {
        return origenVenta;
    }

    /**
     * Sets the value of the origenVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenVenta(String value) {
        this.origenVenta = value;
    }

    /**
     * Gets the value of the periodoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoCobertura() {
        return periodoCobertura;
    }

    /**
     * Sets the value of the periodoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoCobertura(String value) {
        this.periodoCobertura = value;
    }

    /**
     * Gets the value of the periodoPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoPago() {
        return periodoPago;
    }

    /**
     * Sets the value of the periodoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoPago(String value) {
        this.periodoPago = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan(String value) {
        this.plan = value;
    }

    /**
     * Gets the value of the rmg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmg() {
        return rmg;
    }

    /**
     * Sets the value of the rmg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmg(String value) {
        this.rmg = value;
    }

}
