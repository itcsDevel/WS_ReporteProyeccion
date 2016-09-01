
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputWSProyeccionVidAhorro100 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputWSProyeccionVidAhorro100">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asegurable" type="{http://cnsv.cl/}asegurableVO" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datosSimulacionVidAhorro100VO" type="{http://cnsv.cl/}datosSimulacionVidAhorro100VO" minOccurs="0"/>
 *         &lt;element name="listFamiliaresVO" type="{http://cnsv.cl/}listFamiliaresVO" minOccurs="0"/>
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
@XmlType(name = "outputWSProyeccionVidAhorro100", propOrder = {
    "asegurable",
    "codigo",
    "datosSimulacionVidAhorro100VO",
    "listFamiliaresVO",
    "mensaje"
})
public class OutputWSProyeccionVidAhorro100 {

    protected AsegurableVO asegurable;
    protected Integer codigo;
    protected DatosSimulacionVidAhorro100VO datosSimulacionVidAhorro100VO;
    protected ListFamiliaresVO listFamiliaresVO;
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
     * Gets the value of the datosSimulacionVidAhorro100VO property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSimulacionVidAhorro100VO }
     *     
     */
    public DatosSimulacionVidAhorro100VO getDatosSimulacionVidAhorro100VO() {
        return datosSimulacionVidAhorro100VO;
    }

    /**
     * Sets the value of the datosSimulacionVidAhorro100VO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSimulacionVidAhorro100VO }
     *     
     */
    public void setDatosSimulacionVidAhorro100VO(DatosSimulacionVidAhorro100VO value) {
        this.datosSimulacionVidAhorro100VO = value;
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
