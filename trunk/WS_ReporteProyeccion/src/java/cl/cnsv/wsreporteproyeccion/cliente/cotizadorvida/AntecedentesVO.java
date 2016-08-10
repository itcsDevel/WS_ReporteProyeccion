
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for antecedentesVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="antecedentesVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edadActConyuge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edadActHijos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edadActPadres" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edadActTitular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFumador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antecedentesVO", propOrder = {
    "edadActConyuge",
    "edadActHijos",
    "edadActPadres",
    "edadActTitular",
    "fechaNacimiento",
    "nombre",
    "sexo",
    "tipoFumador"
})
public class AntecedentesVO {

    protected int edadActConyuge;
    protected String edadActHijos;
    protected int edadActPadres;
    protected int edadActTitular;
    protected String fechaNacimiento;
    protected String nombre;
    protected String sexo;
    protected String tipoFumador;

    /**
     * Gets the value of the edadActConyuge property.
     * 
     */
    public int getEdadActConyuge() {
        return edadActConyuge;
    }

    /**
     * Sets the value of the edadActConyuge property.
     * 
     */
    public void setEdadActConyuge(int value) {
        this.edadActConyuge = value;
    }

    /**
     * Gets the value of the edadActHijos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdadActHijos() {
        return edadActHijos;
    }

    /**
     * Sets the value of the edadActHijos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdadActHijos(String value) {
        this.edadActHijos = value;
    }

    /**
     * Gets the value of the edadActPadres property.
     * 
     */
    public int getEdadActPadres() {
        return edadActPadres;
    }

    /**
     * Sets the value of the edadActPadres property.
     * 
     */
    public void setEdadActPadres(int value) {
        this.edadActPadres = value;
    }

    /**
     * Gets the value of the edadActTitular property.
     * 
     */
    public int getEdadActTitular() {
        return edadActTitular;
    }

    /**
     * Sets the value of the edadActTitular property.
     * 
     */
    public void setEdadActTitular(int value) {
        this.edadActTitular = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
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
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the tipoFumador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFumador() {
        return tipoFumador;
    }

    /**
     * Sets the value of the tipoFumador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFumador(String value) {
        this.tipoFumador = value;
    }

}
