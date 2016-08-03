
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRentabilidadPromedio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRentabilidadPromedio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada" type="{http://ws.wscotizadorvida.cnsv.cl/}inputRentabilidadPromVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRentabilidadPromedio", propOrder = {
    "entrada"
})
public class GetRentabilidadPromedio {

    protected InputRentabilidadPromVO entrada;

    /**
     * Gets the value of the entrada property.
     * 
     * @return
     *     possible object is
     *     {@link InputRentabilidadPromVO }
     *     
     */
    public InputRentabilidadPromVO getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputRentabilidadPromVO }
     *     
     */
    public void setEntrada(InputRentabilidadPromVO value) {
        this.entrada = value;
    }

}
