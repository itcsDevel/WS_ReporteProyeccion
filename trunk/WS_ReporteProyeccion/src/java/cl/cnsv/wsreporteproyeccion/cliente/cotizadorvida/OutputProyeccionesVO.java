
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputProyeccionesVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputProyeccionesVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antecedentes" type="{http://ws.wscotizadorvida.cnsv.cl/}antecedentesVO" minOccurs="0"/>
 *         &lt;element name="elecciones" type="{http://ws.wscotizadorvida.cnsv.cl/}eleccionesVO" minOccurs="0"/>
 *         &lt;element name="coberturas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cobertura" type="{http://ws.wscotizadorvida.cnsv.cl/}coberturaVO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputProyeccionesVO", propOrder = {
    "codigo",
    "mensaje",
    "antecedentes",
    "elecciones",
    "coberturas"
})
public class OutputProyeccionesVO {

    protected Integer codigo;
    protected String mensaje;
    protected AntecedentesVO antecedentes;
    protected EleccionesVO elecciones;
    protected OutputProyeccionesVO.Coberturas coberturas;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the antecedentes property.
     * 
     * @return
     *     possible object is
     *     {@link AntecedentesVO }
     *     
     */
    public AntecedentesVO getAntecedentes() {
        return antecedentes;
    }

    /**
     * Sets the value of the antecedentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntecedentesVO }
     *     
     */
    public void setAntecedentes(AntecedentesVO value) {
        this.antecedentes = value;
    }

    /**
     * Gets the value of the elecciones property.
     * 
     * @return
     *     possible object is
     *     {@link EleccionesVO }
     *     
     */
    public EleccionesVO getElecciones() {
        return elecciones;
    }

    /**
     * Sets the value of the elecciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link EleccionesVO }
     *     
     */
    public void setElecciones(EleccionesVO value) {
        this.elecciones = value;
    }

    /**
     * Gets the value of the coberturas property.
     * 
     * @return
     *     possible object is
     *     {@link OutputProyeccionesVO.Coberturas }
     *     
     */
    public OutputProyeccionesVO.Coberturas getCoberturas() {
        return coberturas;
    }

    /**
     * Sets the value of the coberturas property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputProyeccionesVO.Coberturas }
     *     
     */
    public void setCoberturas(OutputProyeccionesVO.Coberturas value) {
        this.coberturas = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cobertura" type="{http://ws.wscotizadorvida.cnsv.cl/}coberturaVO" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cobertura"
    })
    public static class Coberturas {

        protected List<CoberturaVO> cobertura;

        /**
         * Gets the value of the cobertura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cobertura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCobertura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoberturaVO }
         * 
         * 
         */
        public List<CoberturaVO> getCobertura() {
            if (cobertura == null) {
                cobertura = new ArrayList<CoberturaVO>();
            }
            return this.cobertura;
        }

    }

}
