
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerProyeccionVidAhorro100 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerProyeccionVidAhorro100">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaccion" type="{http://ws.proyeccion.cnsv.cl/}transaccionVidAhorro100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProyeccionVidAhorro100", propOrder = {
    "transaccion"
})
public class ObtenerProyeccionVidAhorro100 {

    protected TransaccionVidAhorro100 transaccion;

    /**
     * Gets the value of the transaccion property.
     * 
     * @return
     *     possible object is
     *     {@link TransaccionVidAhorro100 }
     *     
     */
    public TransaccionVidAhorro100 getTransaccion() {
        return transaccion;
    }

    /**
     * Sets the value of the transaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransaccionVidAhorro100 }
     *     
     */
    public void setTransaccion(TransaccionVidAhorro100 value) {
        this.transaccion = value;
    }

}
