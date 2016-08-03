
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaVidAhorro57Bis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestaVidAhorro57Bis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultadosProyeccion" type="{http://ws.proyeccion.cnsv.cl/}resultadoProyeccionVidAhorro57Bis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultadosTributario" type="{http://ws.proyeccion.cnsv.cl/}resultadoTributarioVidAhorro57Bis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaVidAhorro57Bis", propOrder = {
    "codigo",
    "mensaje",
    "resultadosProyeccion",
    "resultadosTributario"
})
public class RespuestaVidAhorro57Bis {

    protected String codigo;
    protected String mensaje;
    @XmlElement(nillable = true)
    protected List<ResultadoProyeccionVidAhorro57Bis> resultadosProyeccion;
    @XmlElement(nillable = true)
    protected List<ResultadoTributarioVidAhorro57Bis> resultadosTributario;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
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
     * Gets the value of the resultadosProyeccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultadosProyeccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultadosProyeccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultadoProyeccionVidAhorro57Bis }
     * 
     * 
     */
    public List<ResultadoProyeccionVidAhorro57Bis> getResultadosProyeccion() {
        if (resultadosProyeccion == null) {
            resultadosProyeccion = new ArrayList<ResultadoProyeccionVidAhorro57Bis>();
        }
        return this.resultadosProyeccion;
    }

    /**
     * Gets the value of the resultadosTributario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultadosTributario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultadosTributario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultadoTributarioVidAhorro57Bis }
     * 
     * 
     */
    public List<ResultadoTributarioVidAhorro57Bis> getResultadosTributario() {
        if (resultadosTributario == null) {
            resultadosTributario = new ArrayList<ResultadoTributarioVidAhorro57Bis>();
        }
        return this.resultadosTributario;
    }

}
