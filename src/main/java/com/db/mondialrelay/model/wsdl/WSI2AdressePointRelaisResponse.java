
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
 *         &lt;element name="WSI2_AdressePointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_AdressePointRelais" minOccurs="0"/&gt;
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
    "wsi2AdressePointRelaisResult"
})
@XmlRootElement(name = "WSI2_AdressePointRelaisResponse")
public class WSI2AdressePointRelaisResponse {

    @XmlElement(name = "WSI2_AdressePointRelaisResult")
    protected RetWSI2AdressePointRelais wsi2AdressePointRelaisResult;

    /**
     * Obtient la valeur de la propriété wsi2AdressePointRelaisResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2AdressePointRelais }
     *     
     */
    public RetWSI2AdressePointRelais getWSI2AdressePointRelaisResult() {
        return wsi2AdressePointRelaisResult;
    }

    /**
     * Définit la valeur de la propriété wsi2AdressePointRelaisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2AdressePointRelais }
     *     
     */
    public void setWSI2AdressePointRelaisResult(RetWSI2AdressePointRelais value) {
        this.wsi2AdressePointRelaisResult = value;
    }

}
