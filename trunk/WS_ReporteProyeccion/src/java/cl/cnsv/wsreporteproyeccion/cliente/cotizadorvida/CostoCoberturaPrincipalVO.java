
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for costoCoberturaPrincipalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="costoCoberturaPrincipalVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edadActuarial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="periodoFin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="periodoIni" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
<<<<<<< HEAD
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
=======
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "costoCoberturaPrincipalVO", propOrder = {
    "edadActuarial",
    "periodoFin",
    "periodoIni",
<<<<<<< HEAD
    "tasa"
=======
    "valor"
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
})
public class CostoCoberturaPrincipalVO {

    protected Integer edadActuarial;
    protected Integer periodoFin;
    protected Integer periodoIni;
<<<<<<< HEAD
    protected Double tasa;
=======
    protected Double valor;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * Gets the value of the edadActuarial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdadActuarial() {
        return edadActuarial;
    }

    /**
     * Sets the value of the edadActuarial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdadActuarial(Integer value) {
        this.edadActuarial = value;
    }

    /**
     * Gets the value of the periodoFin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoFin() {
        return periodoFin;
    }

    /**
     * Sets the value of the periodoFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoFin(Integer value) {
        this.periodoFin = value;
    }

    /**
     * Gets the value of the periodoIni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoIni() {
        return periodoIni;
    }

    /**
     * Sets the value of the periodoIni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoIni(Integer value) {
        this.periodoIni = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the tasa property.
=======
     * Gets the value of the valor property.
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
<<<<<<< HEAD
    public Double getTasa() {
        return tasa;
    }

    /**
     * Sets the value of the tasa property.
=======
    public Double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
<<<<<<< HEAD
    public void setTasa(Double value) {
        this.tasa = value;
=======
    public void setValor(Double value) {
        this.valor = value;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
    }

}
