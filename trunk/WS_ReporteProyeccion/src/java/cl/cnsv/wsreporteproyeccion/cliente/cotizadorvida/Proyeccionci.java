
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proyeccionci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proyeccionci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coberturas" type="{http://cnsv.cl/}coberturaci" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edades" type="{http://cnsv.cl/}edadci" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supuestoRentabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorUf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyeccionci", namespace = "http://cnsv.cl/ci", propOrder = {
    "coberturas",
    "edades",
    "fecha",
    "supuestoRentabilidad",
    "valorUf"
})
public class Proyeccionci {

    @XmlElement(nillable = true)
    protected List<Coberturaci> coberturas;
    @XmlElement(nillable = true)
    protected List<Edadci> edades;
    protected String fecha;
    protected String supuestoRentabilidad;
    protected String valorUf;

    /**
     * Gets the value of the coberturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coberturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoberturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coberturaci }
     * 
     * 
     */
    public List<Coberturaci> getCoberturas() {
        if (coberturas == null) {
            coberturas = new ArrayList<Coberturaci>();
        }
        return this.coberturas;
    }

    /**
     * Gets the value of the edades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Edadci }
     * 
     * 
     */
    public List<Edadci> getEdades() {
        if (edades == null) {
            edades = new ArrayList<Edadci>();
        }
        return this.edades;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the supuestoRentabilidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupuestoRentabilidad() {
        return supuestoRentabilidad;
    }

    /**
     * Sets the value of the supuestoRentabilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupuestoRentabilidad(String value) {
        this.supuestoRentabilidad = value;
    }

    /**
     * Gets the value of the valorUf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorUf() {
        return valorUf;
    }

    /**
     * Sets the value of the valorUf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorUf(String value) {
        this.valorUf = value;
    }

}
