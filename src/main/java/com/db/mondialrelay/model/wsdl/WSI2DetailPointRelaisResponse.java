
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
 *         &lt;element name="WSI2_DetailPointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_DetailPointRelais" minOccurs="0"/&gt;
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
    "wsi2DetailPointRelaisResult"
})
@XmlRootElement(name = "WSI2_DetailPointRelaisResponse")
public class WSI2DetailPointRelaisResponse {

    @XmlElement(name = "WSI2_DetailPointRelaisResult")
    protected RetWSI2DetailPointRelais wsi2DetailPointRelaisResult;

    /**
     * Obtient la valeur de la propriété wsi2DetailPointRelaisResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2DetailPointRelais }
     *     
     */
    public RetWSI2DetailPointRelais getWSI2DetailPointRelaisResult() {
        return wsi2DetailPointRelaisResult;
    }

    /**
     * Définit la valeur de la propriété wsi2DetailPointRelaisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2DetailPointRelais }
     *     
     */
    public void setWSI2DetailPointRelaisResult(RetWSI2DetailPointRelais value) {
        this.wsi2DetailPointRelaisResult = value;
    }

}
