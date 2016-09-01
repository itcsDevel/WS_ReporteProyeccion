
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cotizacionci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cotizacionci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asegurable" type="{http://cnsv.cl/}asegurableci" minOccurs="0"/>
 *         &lt;element name="beneficiarios" type="{http://cnsv.cl/}beneficiarioci" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coberturas" type="{http://cnsv.cl/}coberturaci" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contratante" type="{http://cnsv.cl/}contratanteci" minOccurs="0"/>
 *         &lt;element name="proyeccion" type="{http://cnsv.cl/ci}proyeccionci" minOccurs="0"/>
 *         &lt;element name="rentabilidadInversion" type="{http://cnsv.cl/ci}rentabilidadInversionci" minOccurs="0"/>
 *         &lt;element name="usoInterno" type="{http://cnsv.cl/ci}usoInternoci" minOccurs="0"/>
 *         &lt;element name="viaCobro" type="{http://cnsv.cl/ci}viaCobroci" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizacionci", propOrder = {
    "asegurable",
    "beneficiarios",
    "coberturas",
    "contratante",
    "proyeccion",
    "rentabilidadInversion",
    "usoInterno",
    "viaCobro"
})
public class Cotizacionci {

    protected Asegurableci asegurable;
    @XmlElement(nillable = true)
    protected List<Beneficiarioci> beneficiarios;
    @XmlElement(nillable = true)
    protected List<Coberturaci> coberturas;
    protected Contratanteci contratante;
    protected Proyeccionci proyeccion;
    protected RentabilidadInversionci rentabilidadInversion;
    protected UsoInternoci usoInterno;
    protected ViaCobroci viaCobro;

    /**
     * Gets the value of the asegurable property.
     * 
     * @return
     *     possible object is
     *     {@link Asegurableci }
     *     
     */
    public Asegurableci getAsegurable() {
        return asegurable;
    }

    /**
     * Sets the value of the asegurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asegurableci }
     *     
     */
    public void setAsegurable(Asegurableci value) {
        this.asegurable = value;
    }

    /**
     * Gets the value of the beneficiarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Beneficiarioci }
     * 
     * 
     */
    public List<Beneficiarioci> getBeneficiarios() {
        if (beneficiarios == null) {
            beneficiarios = new ArrayList<Beneficiarioci>();
        }
        return this.beneficiarios;
    }

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
     * Gets the value of the contratante property.
     * 
     * @return
     *     possible object is
     *     {@link Contratanteci }
     *     
     */
    public Contratanteci getContratante() {
        return contratante;
    }

    /**
     * Sets the value of the contratante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contratanteci }
     *     
     */
    public void setContratante(Contratanteci value) {
        this.contratante = value;
    }

    /**
     * Gets the value of the proyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link Proyeccionci }
     *     
     */
    public Proyeccionci getProyeccion() {
        return proyeccion;
    }

    /**
     * Sets the value of the proyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proyeccionci }
     *     
     */
    public void setProyeccion(Proyeccionci value) {
        this.proyeccion = value;
    }

    /**
     * Gets the value of the rentabilidadInversion property.
     * 
     * @return
     *     possible object is
     *     {@link RentabilidadInversionci }
     *     
     */
    public RentabilidadInversionci getRentabilidadInversion() {
        return rentabilidadInversion;
    }

    /**
     * Sets the value of the rentabilidadInversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentabilidadInversionci }
     *     
     */
    public void setRentabilidadInversion(RentabilidadInversionci value) {
        this.rentabilidadInversion = value;
    }

    /**
     * Gets the value of the usoInterno property.
     * 
     * @return
     *     possible object is
     *     {@link UsoInternoci }
     *     
     */
    public UsoInternoci getUsoInterno() {
        return usoInterno;
    }

    /**
     * Sets the value of the usoInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsoInternoci }
     *     
     */
    public void setUsoInterno(UsoInternoci value) {
        this.usoInterno = value;
    }

    /**
     * Gets the value of the viaCobro property.
     * 
     * @return
     *     possible object is
     *     {@link ViaCobroci }
     *     
     */
    public ViaCobroci getViaCobro() {
        return viaCobro;
    }

    /**
     * Sets the value of the viaCobro property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViaCobroci }
     *     
     */
    public void setViaCobro(ViaCobroci value) {
        this.viaCobro = value;
    }

}
