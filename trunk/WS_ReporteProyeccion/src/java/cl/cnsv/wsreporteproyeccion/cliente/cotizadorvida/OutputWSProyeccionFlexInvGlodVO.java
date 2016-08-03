
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputWSProyeccionFlexInvGlodVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputWSProyeccionFlexInvGlodVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asegurable" type="{http://ws.wscotizadorvida.cnsv.cl/}asegurableVO" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datosSimulacionFlexInvGoldVO" type="{http://ws.wscotizadorvida.cnsv.cl/}datosSimulacionFlexInvGoldVO" minOccurs="0"/>
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
@XmlType(name = "outputWSProyeccionFlexInvGlodVO", propOrder = {
    "asegurable",
    "codigo",
    "datosSimulacionFlexInvGoldVO",
    "mensaje"
})
public class OutputWSProyeccionFlexInvGlodVO {

    protected AsegurableVO asegurable;
    protected Integer codigo;
    protected DatosSimulacionFlexInvGoldVO datosSimulacionFlexInvGoldVO;
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
     * Gets the value of the datosSimulacionFlexInvGoldVO property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSimulacionFlexInvGoldVO }
     *     
     */
    public DatosSimulacionFlexInvGoldVO getDatosSimulacionFlexInvGoldVO() {
        return datosSimulacionFlexInvGoldVO;
    }

    /**
     * Sets the value of the datosSimulacionFlexInvGoldVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSimulacionFlexInvGoldVO }
     *     
     */
    public void setDatosSimulacionFlexInvGoldVO(DatosSimulacionFlexInvGoldVO value) {
        this.datosSimulacionFlexInvGoldVO = value;
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
