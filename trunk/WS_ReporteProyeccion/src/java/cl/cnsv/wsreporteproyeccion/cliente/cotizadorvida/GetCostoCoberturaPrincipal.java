
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCostoCoberturaPrincipal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCostoCoberturaPrincipal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada" type="{http://ws.wscotizadorvida.cnsv.cl/}inputCostoCoberturaPrincipalVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCostoCoberturaPrincipal", propOrder = {
    "entrada"
})
public class GetCostoCoberturaPrincipal {

    protected InputCostoCoberturaPrincipalVO entrada;

    /**
     * Gets the value of the entrada property.
     * 
     * @return
     *     possible object is
     *     {@link InputCostoCoberturaPrincipalVO }
     *     
     */
    public InputCostoCoberturaPrincipalVO getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputCostoCoberturaPrincipalVO }
     *     
     */
    public void setEntrada(InputCostoCoberturaPrincipalVO value) {
        this.entrada = value;
    }

}
