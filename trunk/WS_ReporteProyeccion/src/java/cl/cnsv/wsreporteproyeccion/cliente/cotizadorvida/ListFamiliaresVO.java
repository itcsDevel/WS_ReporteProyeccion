
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listFamiliaresVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listFamiliaresVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list_familiares" type="{http://cnsv.cl/}familiarVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listFamiliaresVO", propOrder = {
    "listFamiliares"
})
public class ListFamiliaresVO {

    @XmlElement(name = "list_familiares", nillable = true)
    protected List<FamiliarVO> listFamiliares;

    /**
     * Gets the value of the listFamiliares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listFamiliares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListFamiliares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamiliarVO }
     * 
     * 
     */
    public List<FamiliarVO> getListFamiliares() {
        if (listFamiliares == null) {
            listFamiliares = new ArrayList<FamiliarVO>();
        }
        return this.listFamiliares;
    }

}
