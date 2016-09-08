
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerProyeccionAhorroInternet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerProyeccionAhorroInternet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaccion" type="{http://ws.proyeccion.cnsv.cl/}transaccionAhorroInternet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProyeccionAhorroInternet", propOrder = {
    "transaccion"
})
public class ObtenerProyeccionAhorroInternet {

    protected TransaccionAhorroInternet transaccion;

    /**
     * Gets the value of the transaccion property.
     * 
     * @return
     *     possible object is
     *     {@link TransaccionAhorroInternet }
     *     
     */
    public TransaccionAhorroInternet getTransaccion() {
        return transaccion;
    }

    /**
     * Sets the value of the transaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransaccionAhorroInternet }
     *     
     */
    public void setTransaccion(TransaccionAhorroInternet value) {
        this.transaccion = value;
    }

}
