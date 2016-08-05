
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

<<<<<<< HEAD
=======
import com.thoughtworks.xstream.annotations.XStreamAlias;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coberturasVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coberturasVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npersonas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prima_referencial_anual" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coberturasVO", propOrder = {
    "capital",
    "cobertura",
    "npersonas",
    "primaReferencialAnual"
})
<<<<<<< HEAD
=======
@XStreamAlias("cobertura")
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
public class CoberturasVO {

    protected double capital;
    protected String cobertura;
    protected int npersonas;
    @XmlElement(name = "prima_referencial_anual")
    protected double primaReferencialAnual;

    /**
     * Gets the value of the capital property.
     * 
     */
    public double getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     */
    public void setCapital(double value) {
        this.capital = value;
    }

    /**
     * Gets the value of the cobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobertura() {
        return cobertura;
    }

    /**
     * Sets the value of the cobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobertura(String value) {
        this.cobertura = value;
    }

    /**
     * Gets the value of the npersonas property.
     * 
     */
    public int getNpersonas() {
        return npersonas;
    }

    /**
     * Sets the value of the npersonas property.
     * 
     */
    public void setNpersonas(int value) {
        this.npersonas = value;
    }

    /**
     * Gets the value of the primaReferencialAnual property.
     * 
     */
    public double getPrimaReferencialAnual() {
        return primaReferencialAnual;
    }

    /**
     * Sets the value of the primaReferencialAnual property.
     * 
     */
    public void setPrimaReferencialAnual(double value) {
        this.primaReferencialAnual = value;
    }

}
