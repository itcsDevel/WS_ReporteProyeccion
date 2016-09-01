
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputWSProyeccionVidAhorro57Bis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputWSProyeccionVidAhorro57Bis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asegurable" type="{http://cnsv.cl/}asegurableVO" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datosSimulacionVidAhorro57BisVO" type="{http://cnsv.cl/}datosSimulacionVidAhorro57BisVO" minOccurs="0"/>
 *         &lt;element name="listFamiliaresVO" type="{http://cnsv.cl/}listFamiliaresVO" minOccurs="0"/>
 *         &lt;element name="listfamiliares" type="{http://cnsv.cl/}familiarVO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "outputWSProyeccionVidAhorro57Bis", propOrder = {
    "asegurable",
    "codigo",
    "datosSimulacionVidAhorro57BisVO",
    "listFamiliaresVO",
    "listfamiliares",
    "mensaje"
})
public class OutputWSProyeccionVidAhorro57Bis {

    protected AsegurableVO asegurable;
    protected Integer codigo;
    protected DatosSimulacionVidAhorro57BisVO datosSimulacionVidAhorro57BisVO;
    protected ListFamiliaresVO listFamiliaresVO;
    @XmlElement(nillable = true)
    protected List<FamiliarVO> listfamiliares;
    protected String mensaje;

    /**
     * Gets the value of the asegurable property.
     * 
     * @return
     *     possible object is
     *     {@link AsegurableVO }
     *     
     */
    public AsegurableVO getAsegurable() {
        return asegurable;
    }

    /**
     * Sets the value of the asegurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsegurableVO }
     *     
     */
    public void setAsegurable(AsegurableVO value) {
        this.asegurable = value;
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
     * Gets the value of the datosSimulacionVidAhorro57BisVO property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSimulacionVidAhorro57BisVO }
     *     
     */
    public DatosSimulacionVidAhorro57BisVO getDatosSimulacionVidAhorro57BisVO() {
        return datosSimulacionVidAhorro57BisVO;
    }

    /**
     * Sets the value of the datosSimulacionVidAhorro57BisVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSimulacionVidAhorro57BisVO }
     *     
     */
    public void setDatosSimulacionVidAhorro57BisVO(DatosSimulacionVidAhorro57BisVO value) {
        this.datosSimulacionVidAhorro57BisVO = value;
    }

    /**
     * Gets the value of the listFamiliaresVO property.
     * 
     * @return
     *     possible object is
     *     {@link ListFamiliaresVO }
     *     
     */
    public ListFamiliaresVO getListFamiliaresVO() {
        return listFamiliaresVO;
    }

    /**
     * Sets the value of the listFamiliaresVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFamiliaresVO }
     *     
     */
    public void setListFamiliaresVO(ListFamiliaresVO value) {
        this.listFamiliaresVO = value;
    }

    /**
     * Gets the value of the listfamiliares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfamiliares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListfamiliares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamiliarVO }
     * 
     * 
     */
    public List<FamiliarVO> getListfamiliares() {
        if (listfamiliares == null) {
            listfamiliares = new ArrayList<FamiliarVO>();
        }
        return this.listfamiliares;
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
