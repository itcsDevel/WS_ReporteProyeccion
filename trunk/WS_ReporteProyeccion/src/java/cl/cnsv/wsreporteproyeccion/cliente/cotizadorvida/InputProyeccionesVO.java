
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputProyeccionesVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputProyeccionesVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
<<<<<<< HEAD
 *         &lt;element name="numeroPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
=======
 *         &lt;element name="numeroCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputProyeccionesVO", propOrder = {
<<<<<<< HEAD
    "numeroPoliza"
})
public class InputProyeccionesVO {

    protected String numeroPoliza;
=======
    "numeroCertificado",
    "numeroPoliza",
    "producto",
    "ramo",
    "tipoCertificado"
})
public class InputProyeccionesVO {

    protected String numeroCertificado;
    protected String numeroPoliza;
    protected String producto;
    protected String ramo;
    protected String tipoCertificado;

    /**
     * Gets the value of the numeroCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCertificado() {
        return numeroCertificado;
    }

    /**
     * Sets the value of the numeroCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCertificado(String value) {
        this.numeroCertificado = value;
    }
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * Gets the value of the numeroPoliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    /**
     * Sets the value of the numeroPoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPoliza(String value) {
        this.numeroPoliza = value;
    }

<<<<<<< HEAD
=======
    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the ramo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamo() {
        return ramo;
    }

    /**
     * Sets the value of the ramo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamo(String value) {
        this.ramo = value;
    }

    /**
     * Gets the value of the tipoCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCertificado() {
        return tipoCertificado;
    }

    /**
     * Sets the value of the tipoCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCertificado(String value) {
        this.tipoCertificado = value;
    }

>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
}
