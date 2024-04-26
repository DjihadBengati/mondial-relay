
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
 *         &lt;element name="WSI2_RecherchePointRelaisAvanceeResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RecherchePointRelaisAvancee" minOccurs="0"/&gt;
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
    "wsi2RecherchePointRelaisAvanceeResult"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisAvanceeResponse")
public class WSI2RecherchePointRelaisAvanceeResponse {

    @XmlElement(name = "WSI2_RecherchePointRelaisAvanceeResult")
    protected RetWSI2RecherchePointRelaisAvancee wsi2RecherchePointRelaisAvanceeResult;

    /**
     * Obtient la valeur de la propriété wsi2RecherchePointRelaisAvanceeResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RecherchePointRelaisAvancee }
     *     
     */
    public RetWSI2RecherchePointRelaisAvancee getWSI2RecherchePointRelaisAvanceeResult() {
        return wsi2RecherchePointRelaisAvanceeResult;
    }

    /**
     * Définit la valeur de la propriété wsi2RecherchePointRelaisAvanceeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RecherchePointRelaisAvancee }
     *     
     */
    public void setWSI2RecherchePointRelaisAvanceeResult(RetWSI2RecherchePointRelaisAvancee value) {
        this.wsi2RecherchePointRelaisAvanceeResult = value;
    }

}
