
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WSI2_RecherchePointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RecherchePointRelais" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsi2RecherchePointRelaisResult"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisResponse")
public class WSI2RecherchePointRelaisResponse {

    @XmlElement(name = "WSI2_RecherchePointRelaisResult")
    protected RetWSI2RecherchePointRelais wsi2RecherchePointRelaisResult;

    /**
     * Obtient la valeur de la propriété wsi2RecherchePointRelaisResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RecherchePointRelais }
     *     
     */
    public RetWSI2RecherchePointRelais getWSI2RecherchePointRelaisResult() {
        return wsi2RecherchePointRelaisResult;
    }

    /**
     * Définit la valeur de la propriété wsi2RecherchePointRelaisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RecherchePointRelais }
     *     
     */
    public void setWSI2RecherchePointRelaisResult(RetWSI2RecherchePointRelais value) {
        this.wsi2RecherchePointRelaisResult = value;
    }

}
