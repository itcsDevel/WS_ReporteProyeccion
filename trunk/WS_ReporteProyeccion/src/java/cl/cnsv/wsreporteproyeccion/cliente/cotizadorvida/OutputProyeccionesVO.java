
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

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
 *         &lt;element name="antecedentes" type="{http://ws.wscotizadorvida.cnsv.cl/}antecedentesVO" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="elecciones" type="{http://ws.wscotizadorvida.cnsv.cl/}eleccionesVO" minOccurs="0"/>
 *         &lt;element name="listcoberturas" type="{http://ws.wscotizadorvida.cnsv.cl/}listCoberturasVo" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "antecedentes",
    "codigo",
    "elecciones",
    "listcoberturas",
    "mensaje"
})
public class OutputProyeccionesVO {

    protected AntecedentesVO antecedentes;
    protected Integer codigo;
    protected EleccionesVO elecciones;
    protected ListCoberturasVo listcoberturas;
    protected String mensaje;

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
     * Gets the value of the listcoberturas property.
     * 
     * @return
     *     possible object is
     *     {@link ListCoberturasVo }
     *     
     */
    public ListCoberturasVo getListcoberturas() {
        return listcoberturas;
    }

    /**
     * Sets the value of the listcoberturas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCoberturasVo }
     *     
     */
    public void setListcoberturas(ListCoberturasVo value) {
        this.listcoberturas = value;
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

}
