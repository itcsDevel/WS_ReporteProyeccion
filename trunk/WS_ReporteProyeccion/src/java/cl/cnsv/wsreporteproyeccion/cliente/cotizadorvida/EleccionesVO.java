
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eleccionesVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eleccionesVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portafolioSeleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaReferencialAnual" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valorUf" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eleccionesVO", propOrder = {
    "formaPago",
    "plan",
    "portafolioSeleccionado",
    "primaReferencialAnual",
    "valorUf"
})
public class EleccionesVO {

    protected String formaPago;
    protected String plan;
    protected String portafolioSeleccionado;
    protected double primaReferencialAnual;
    protected double valorUf;

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
     * Gets the value of the portafolioSeleccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortafolioSeleccionado() {
        return portafolioSeleccionado;
    }

    /**
     * Sets the value of the portafolioSeleccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortafolioSeleccionado(String value) {
        this.portafolioSeleccionado = value;
    }

    /**
     * Gets the value of the primaReferencialAnual property.
     * 
     */
    public double getPrimaReferencialAnual() {
        return primaReferencialAnual;
    }

    /**
     * Sets the value of the primaReferencialAnual property.
     * 
     */
    public void setPrimaReferencialAnual(double value) {
        this.primaReferencialAnual = value;
    }

    /**
     * Gets the value of the valorUf property.
     * 
     */
    public double getValorUf() {
        return valorUf;
    }

    /**
     * Sets the value of the valorUf property.
     * 
     */
    public void setValorUf(double value) {
        this.valorUf = value;
    }

}
