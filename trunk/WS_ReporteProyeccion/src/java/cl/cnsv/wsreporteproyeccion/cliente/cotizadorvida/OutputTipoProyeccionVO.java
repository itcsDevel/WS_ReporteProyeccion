
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputTipoProyeccionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputTipoProyeccionVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nproduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_proyeccion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputTipoProyeccionVO", propOrder = {
    "codigo",
    "mensaje",
    "nproduct",
    "tipoProyeccion"
})
public class OutputTipoProyeccionVO {

    protected int codigo;
    protected String mensaje;
    protected int nproduct;
    @XmlElement(name = "tipo_proyeccion")
    protected int tipoProyeccion;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the nproduct property.
     * 
     */
    public int getNproduct() {
        return nproduct;
    }

    /**
     * Sets the value of the nproduct property.
     * 
     */
    public void setNproduct(int value) {
        this.nproduct = value;
    }

    /**
     * Gets the value of the tipoProyeccion property.
     * 
     */
    public int getTipoProyeccion() {
        return tipoProyeccion;
    }

    /**
     * Sets the value of the tipoProyeccion property.
     * 
     */
    public void setTipoProyeccion(int value) {
        this.tipoProyeccion = value;
    }

}
