
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coberturaci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coberturaci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoSvs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costoCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCondicionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coberturaci", propOrder = {
    "capital",
    "codigoSvs",
    "costoCobertura",
    "nombre",
    "nombreCondicionado",
    "nCover"
})
public class Coberturaci {

    protected String capital;
    protected String codigoSvs;
    protected String costoCobertura;
    protected String nombre;
    protected String nombreCondicionado;
    protected String nCover;

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the codigoSvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSvs() {
        return codigoSvs;
    }

    /**
     * Sets the value of the codigoSvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSvs(String value) {
        this.codigoSvs = value;
    }

    /**
     * Gets the value of the costoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostoCobertura() {
        return costoCobertura;
    }

    /**
     * Sets the value of the costoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostoCobertura(String value) {
        this.costoCobertura = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the nombreCondicionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCondicionado() {
        return nombreCondicionado;
    }

    /**
     * Sets the value of the nombreCondicionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCondicionado(String value) {
        this.nombreCondicionado = value;
    }

    /**
     * Gets the value of the nCover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCover() {
        return nCover;
    }

    /**
     * Sets the value of the nCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCover(String value) {
        this.nCover = value;
    }

}
