
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerProyeccionFlexInvGoldResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerProyeccionFlexInvGoldResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.proyeccion.cnsv.cl/}respuestaFlexInvGold" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProyeccionFlexInvGoldResponse", propOrder = {
    "_return"
})
public class ObtenerProyeccionFlexInvGoldResponse {

    @XmlElement(name = "return")
    protected RespuestaFlexInvGold _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaFlexInvGold }
     *     
     */
    public RespuestaFlexInvGold getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaFlexInvGold }
     *     
     */
    public void setReturn(RespuestaFlexInvGold value) {
        this._return = value;
    }

}
