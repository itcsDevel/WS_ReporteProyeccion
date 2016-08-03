
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCoberturasVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCoberturasVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listcoberturas" type="{http://ws.wscotizadorvida.cnsv.cl/}coberturasVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCoberturasVo", propOrder = {
    "listcoberturas"
})
public class ListCoberturasVo {

    @XmlElement(nillable = true)
    protected List<CoberturasVO> listcoberturas;

    /**
     * Gets the value of the listcoberturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcoberturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListcoberturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoberturasVO }
     * 
     * 
     */
    public List<CoberturasVO> getListcoberturas() {
        if (listcoberturas == null) {
            listcoberturas = new ArrayList<CoberturasVO>();
        }
        return this.listcoberturas;
    }

}
