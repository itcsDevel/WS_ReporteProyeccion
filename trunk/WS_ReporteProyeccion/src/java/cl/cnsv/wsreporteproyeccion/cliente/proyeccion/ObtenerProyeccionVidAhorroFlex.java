
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerProyeccionVidAhorroFlex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerProyeccionVidAhorroFlex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaccion" type="{http://ws.proyeccion.cnsv.cl/}transaccionVidAhorroFlex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProyeccionVidAhorroFlex", propOrder = {
    "transaccion"
})
public class ObtenerProyeccionVidAhorroFlex {

    protected TransaccionVidAhorroFlex transaccion;

    /**
     * Gets the value of the transaccion property.
     * 
     * @return
     *     possible object is
     *     {@link TransaccionVidAhorroFlex }
     *     
     */
    public TransaccionVidAhorroFlex getTransaccion() {
        return transaccion;
    }

    /**
     * Sets the value of the transaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransaccionVidAhorroFlex }
     *     
     */
    public void setTransaccion(TransaccionVidAhorroFlex value) {
        this.transaccion = value;
    }

}
