
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edadci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edadci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edadActuarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalAnio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indemnizacionFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otrosAbonos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaAcumulada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edadci", propOrder = {
    "edadActuarial",
    "finalAnio",
    "indemnizacionFallecimiento",
    "otrosAbonos",
    "primaAcumulada",
    "valorPoliza"
})
public class Edadci {

    protected String edadActuarial;
    protected String finalAnio;
    protected String indemnizacionFallecimiento;
    protected String otrosAbonos;
    protected String primaAcumulada;
    protected String valorPoliza;

    /**
     * Gets the value of the edadActuarial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdadActuarial() {
        return edadActuarial;
    }

    /**
     * Sets the value of the edadActuarial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdadActuarial(String value) {
        this.edadActuarial = value;
    }

    /**
     * Gets the value of the finalAnio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalAnio() {
        return finalAnio;
    }

    /**
     * Sets the value of the finalAnio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalAnio(String value) {
        this.finalAnio = value;
    }

    /**
     * Gets the value of the indemnizacionFallecimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndemnizacionFallecimiento() {
        return indemnizacionFallecimiento;
    }

    /**
     * Sets the value of the indemnizacionFallecimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndemnizacionFallecimiento(String value) {
        this.indemnizacionFallecimiento = value;
    }

    /**
     * Gets the value of the otrosAbonos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrosAbonos() {
        return otrosAbonos;
    }

    /**
     * Sets the value of the otrosAbonos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrosAbonos(String value) {
        this.otrosAbonos = value;
    }

    /**
     * Gets the value of the primaAcumulada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaAcumulada() {
        return primaAcumulada;
    }

    /**
     * Sets the value of the primaAcumulada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaAcumulada(String value) {
        this.primaAcumulada = value;
    }

    /**
     * Gets the value of the valorPoliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorPoliza() {
        return valorPoliza;
    }

    /**
     * Sets the value of the valorPoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorPoliza(String value) {
        this.valorPoliza = value;
    }

}
