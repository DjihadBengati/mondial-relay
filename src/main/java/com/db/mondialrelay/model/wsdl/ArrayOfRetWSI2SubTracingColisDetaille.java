
package com.db.mondialrelay.model.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfRet_WSI2_sub_TracingColisDetaille complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRet_WSI2_sub_TracingColisDetaille"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ret_WSI2_sub_TracingColisDetaille" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_TracingColisDetaille" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRet_WSI2_sub_TracingColisDetaille", propOrder = {
    "retWSI2SubTracingColisDetaille"
})
public class ArrayOfRetWSI2SubTracingColisDetaille {

    @XmlElement(name = "ret_WSI2_sub_TracingColisDetaille", nillable = true)
    protected List<RetWSI2SubTracingColisDetaille> retWSI2SubTracingColisDetaille;

    /**
     * Gets the value of the retWSI2SubTracingColisDetaille property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the retWSI2SubTracingColisDetaille property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetWSI2SubTracingColisDetaille().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetWSI2SubTracingColisDetaille }
     * 
     * 
     */
    public List<RetWSI2SubTracingColisDetaille> getRetWSI2SubTracingColisDetaille() {
        if (retWSI2SubTracingColisDetaille == null) {
            retWSI2SubTracingColisDetaille = new ArrayList<RetWSI2SubTracingColisDetaille>();
        }
        return this.retWSI2SubTracingColisDetaille;
    }

}
