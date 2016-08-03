
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaccionVidAhorroFlex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaccionVidAhorroFlex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asegurable" type="{http://ws.proyeccion.cnsv.cl/}asegurable" minOccurs="0"/>
 *         &lt;element name="datosSimulacion" type="{http://ws.proyeccion.cnsv.cl/}datosSimulacionVidAhorroFlex" minOccurs="0"/>
 *         &lt;element name="familiares" type="{http://ws.proyeccion.cnsv.cl/}familiar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inyecciones" type="{http://ws.proyeccion.cnsv.cl/}inyeccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recargos" type="{http://ws.proyeccion.cnsv.cl/}recargo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rescates" type="{http://ws.proyeccion.cnsv.cl/}rescate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccionVidAhorroFlex", propOrder = {
    "asegurable",
    "datosSimulacion",
    "familiares",
    "inyecciones",
    "recargos",
    "rescates"
})
public class TransaccionVidAhorroFlex {

    protected Asegurable asegurable;
    protected DatosSimulacionVidAhorroFlex datosSimulacion;
    @XmlElement(nillable = true)
    protected List<Familiar> familiares;
    @XmlElement(nillable = true)
    protected List<Inyeccion> inyecciones;
    @XmlElement(nillable = true)
    protected List<Recargo> recargos;
    @XmlElement(nillable = true)
    protected List<Rescate> rescates;

    /**
     * Gets the value of the asegurable property.
     * 
     * @return
     *     possible object is
     *     {@link Asegurable }
     *     
     */
    public Asegurable getAsegurable() {
        return asegurable;
    }

    /**
     * Sets the value of the asegurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asegurable }
     *     
     */
    public void setAsegurable(Asegurable value) {
        this.asegurable = value;
    }

    /**
     * Gets the value of the datosSimulacion property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSimulacionVidAhorroFlex }
     *     
     */
    public DatosSimulacionVidAhorroFlex getDatosSimulacion() {
        return datosSimulacion;
    }

    /**
     * Sets the value of the datosSimulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSimulacionVidAhorroFlex }
     *     
     */
    public void setDatosSimulacion(DatosSimulacionVidAhorroFlex value) {
        this.datosSimulacion = value;
    }

    /**
     * Gets the value of the familiares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familiares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamiliares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Familiar }
     * 
     * 
     */
    public List<Familiar> getFamiliares() {
        if (familiares == null) {
            familiares = new ArrayList<Familiar>();
        }
        return this.familiares;
    }

    public void setFamiliares(List<Familiar> familiares) {
        this.familiares = familiares;
    }

    /**
     * Gets the value of the inyecciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inyecciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInyecciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inyeccion }
     * 
     * 
     */
    
    
    
    
    
    
    public List<Inyeccion> getInyecciones() {
        if (inyecciones == null) {
            inyecciones = new ArrayList<Inyeccion>();
        }
        return this.inyecciones;
    }

    /**
     * Gets the value of the recargos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recargos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecargos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recargo }
     * 
     * 
     */
    public List<Recargo> getRecargos() {
        if (recargos == null) {
            recargos = new ArrayList<Recargo>();
        }
        return this.recargos;
    }

    /**
     * Gets the value of the rescates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rescates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRescates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rescate }
     * 
     * 
     */
    public List<Rescate> getRescates() {
        if (rescates == null) {
            rescates = new ArrayList<Rescate>();
        }
        return this.rescates;
    }

}
