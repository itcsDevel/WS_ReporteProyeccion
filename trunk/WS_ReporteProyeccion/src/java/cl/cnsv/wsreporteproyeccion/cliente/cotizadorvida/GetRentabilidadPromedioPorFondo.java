
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRentabilidadPromedioPorFondo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRentabilidadPromedioPorFondo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada" type="{http://cnsv.cl/}inputPromRentFondoVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRentabilidadPromedioPorFondo", propOrder = {
    "entrada"
})
public class GetRentabilidadPromedioPorFondo {

    protected InputPromRentFondoVO entrada;

    /**
     * Gets the value of the entrada property.
     * 
     * @return
     *     possible object is
     *     {@link InputPromRentFondoVO }
     *     
     */
    public InputPromRentFondoVO getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputPromRentFondoVO }
     *     
     */
    public void setEntrada(InputPromRentFondoVO value) {
        this.entrada = value;
    }

}
