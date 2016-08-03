
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultadoTributarioVidAhorro57Bis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultadoTributarioVidAhorro57Bis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditoDebito" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="diferencialSaldoArrastre" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="factorAjuste" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="glosaMes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inyeccion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxRetiroSinImpuesto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prima57BisAcumulada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remanenteYearAnterior" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remanenteYearSiguiente" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rescate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoAhorroNeto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoArrastreMensual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoArrastreYearAnterior" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoArrastreYearSiguiente" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="san" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vp57bis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoTributarioVidAhorro57Bis", propOrder = {
    "creditoDebito",
    "diferencialSaldoArrastre",
    "factorAjuste",
    "glosaMes",
    "inyeccion",
    "maxRetiroSinImpuesto",
    "mes",
    "prima57BisAcumulada",
    "remanenteYearAnterior",
    "remanenteYearSiguiente",
    "rescate",
    "saldoAhorroNeto",
    "saldoArrastreMensual",
    "saldoArrastreYearAnterior",
    "saldoArrastreYearSiguiente",
    "san",
    "vp57Bis",
    "year"
})
public class ResultadoTributarioVidAhorro57Bis {

    protected Double creditoDebito;
    protected Double diferencialSaldoArrastre;
    protected Double factorAjuste;
    protected String glosaMes;
    protected Double inyeccion;
    protected Double maxRetiroSinImpuesto;
    protected Integer mes;
    protected Double prima57BisAcumulada;
    protected Double remanenteYearAnterior;
    protected Double remanenteYearSiguiente;
    protected Double rescate;
    protected Double saldoAhorroNeto;
    protected Double saldoArrastreMensual;
    protected Double saldoArrastreYearAnterior;
    protected Double saldoArrastreYearSiguiente;
    protected Double san;
    @XmlElement(name = "vp57bis")
    protected Double vp57Bis;
    protected Integer year;

    /**
     * Gets the value of the creditoDebito property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditoDebito() {
        return creditoDebito;
    }

    /**
     * Sets the value of the creditoDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditoDebito(Double value) {
        this.creditoDebito = value;
    }

    /**
     * Gets the value of the diferencialSaldoArrastre property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiferencialSaldoArrastre() {
        return diferencialSaldoArrastre;
    }

    /**
     * Sets the value of the diferencialSaldoArrastre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiferencialSaldoArrastre(Double value) {
        this.diferencialSaldoArrastre = value;
    }

    /**
     * Gets the value of the factorAjuste property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFactorAjuste() {
        return factorAjuste;
    }

    /**
     * Sets the value of the factorAjuste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFactorAjuste(Double value) {
        this.factorAjuste = value;
    }

    /**
     * Gets the value of the glosaMes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosaMes() {
        return glosaMes;
    }

    /**
     * Sets the value of the glosaMes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosaMes(String value) {
        this.glosaMes = value;
    }

    /**
     * Gets the value of the inyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInyeccion() {
        return inyeccion;
    }

    /**
     * Sets the value of the inyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInyeccion(Double value) {
        this.inyeccion = value;
    }

    /**
     * Gets the value of the maxRetiroSinImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxRetiroSinImpuesto() {
        return maxRetiroSinImpuesto;
    }

    /**
     * Sets the value of the maxRetiroSinImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxRetiroSinImpuesto(Double value) {
        this.maxRetiroSinImpuesto = value;
    }

    /**
     * Gets the value of the mes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * Sets the value of the mes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMes(Integer value) {
        this.mes = value;
    }

    /**
     * Gets the value of the prima57BisAcumulada property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrima57BisAcumulada() {
        return prima57BisAcumulada;
    }

    /**
     * Sets the value of the prima57BisAcumulada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrima57BisAcumulada(Double value) {
        this.prima57BisAcumulada = value;
    }

    /**
     * Gets the value of the remanenteYearAnterior property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemanenteYearAnterior() {
        return remanenteYearAnterior;
    }

    /**
     * Sets the value of the remanenteYearAnterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemanenteYearAnterior(Double value) {
        this.remanenteYearAnterior = value;
    }

    /**
     * Gets the value of the remanenteYearSiguiente property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemanenteYearSiguiente() {
        return remanenteYearSiguiente;
    }

    /**
     * Sets the value of the remanenteYearSiguiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemanenteYearSiguiente(Double value) {
        this.remanenteYearSiguiente = value;
    }

    /**
     * Gets the value of the rescate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRescate() {
        return rescate;
    }

    /**
     * Sets the value of the rescate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRescate(Double value) {
        this.rescate = value;
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
     * Gets the value of the saldoArrastreMensual property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoArrastreMensual() {
        return saldoArrastreMensual;
    }

    /**
     * Sets the value of the saldoArrastreMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoArrastreMensual(Double value) {
        this.saldoArrastreMensual = value;
    }

    /**
     * Gets the value of the saldoArrastreYearAnterior property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoArrastreYearAnterior() {
        return saldoArrastreYearAnterior;
    }

    /**
     * Sets the value of the saldoArrastreYearAnterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoArrastreYearAnterior(Double value) {
        this.saldoArrastreYearAnterior = value;
    }

    /**
     * Gets the value of the saldoArrastreYearSiguiente property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoArrastreYearSiguiente() {
        return saldoArrastreYearSiguiente;
    }

    /**
     * Sets the value of the saldoArrastreYearSiguiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoArrastreYearSiguiente(Double value) {
        this.saldoArrastreYearSiguiente = value;
    }

    /**
     * Gets the value of the san property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSan() {
        return san;
    }

    /**
     * Sets the value of the san property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSan(Double value) {
        this.san = value;
    }

    /**
     * Gets the value of the vp57Bis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVp57Bis() {
        return vp57Bis;
    }

    /**
     * Sets the value of the vp57Bis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVp57Bis(Double value) {
        this.vp57Bis = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

}
