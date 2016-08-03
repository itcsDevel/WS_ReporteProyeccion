
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for limitesInyeccionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitesInyeccionVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxInyeccion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minInyeccion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitesInyeccionVO", propOrder = {
    "maxInyeccion",
    "minInyeccion"
})
public class LimitesInyeccionVO {

    protected Double maxInyeccion;
    protected Double minInyeccion;

    /**
     * Gets the value of the maxInyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxInyeccion() {
        return maxInyeccion;
    }

    /**
     * Sets the value of the maxInyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxInyeccion(Double value) {
        this.maxInyeccion = value;
    }

    /**
     * Gets the value of the minInyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinInyeccion() {
        return minInyeccion;
    }

    /**
     * Sets the value of the minInyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinInyeccion(Double value) {
        this.minInyeccion = value;
    }

}
