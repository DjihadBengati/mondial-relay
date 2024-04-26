
package com.db.mondialrelay.model.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfPointRelais_Details complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPointRelais_Details"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointRelais_Details" type="{http://www.mondialrelay.fr/webservice/}PointRelais_Details" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPointRelais_Details", propOrder = {
    "pointRelaisDetails"
})
public class ArrayOfPointRelaisDetails {

    @XmlElement(name = "PointRelais_Details", nillable = true)
    protected List<PointRelaisDetails> pointRelaisDetails;

    /**
     * Gets the value of the pointRelaisDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pointRelaisDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointRelaisDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointRelaisDetails }
     * 
     * 
     */
    public List<PointRelaisDetails> getPointRelaisDetails() {
        if (pointRelaisDetails == null) {
            pointRelaisDetails = new ArrayList<PointRelaisDetails>();
        }
        return this.pointRelaisDetails;
    }

}
