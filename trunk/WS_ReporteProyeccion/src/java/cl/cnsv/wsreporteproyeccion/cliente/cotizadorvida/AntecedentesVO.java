
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="edad_act_conyuge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edad_act_hijos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edad_act_padres" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edad_act_titular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_fumado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tipoFumado"
})
public class AntecedentesVO {

    @XmlElement(name = "edad_act_conyuge")
    protected int edadActConyuge;
    @XmlElement(name = "edad_act_hijos")
    protected String edadActHijos;
    @XmlElement(name = "edad_act_padres")
    protected int edadActPadres;
    @XmlElement(name = "edad_act_titular")
    protected int edadActTitular;
    @XmlElement(name = "fecha_nacimiento")
    protected String fechaNacimiento;
    protected String nombre;
    protected String sexo;
    @XmlElement(name = "tipo_fumado")
    protected String tipoFumado;

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
     * Gets the value of the tipoFumado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFumado() {
        return tipoFumado;
    }

    /**
     * Sets the value of the tipoFumado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFumado(String value) {
        this.tipoFumado = value;
    }

}
