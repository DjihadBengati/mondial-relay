
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
 *         &lt;element name="WSI2_RecherchePointRelaisHorairesResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RecherchePointRelaisHoraires" minOccurs="0"/&gt;
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
    "wsi2RecherchePointRelaisHorairesResult"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisHorairesResponse")
public class WSI2RecherchePointRelaisHorairesResponse {

    @XmlElement(name = "WSI2_RecherchePointRelaisHorairesResult")
    protected RetWSI2RecherchePointRelaisHoraires wsi2RecherchePointRelaisHorairesResult;

    /**
     * Obtient la valeur de la propriété wsi2RecherchePointRelaisHorairesResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RecherchePointRelaisHoraires }
     *     
     */
    public RetWSI2RecherchePointRelaisHoraires getWSI2RecherchePointRelaisHorairesResult() {
        return wsi2RecherchePointRelaisHorairesResult;
    }

    /**
     * Définit la valeur de la propriété wsi2RecherchePointRelaisHorairesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RecherchePointRelaisHoraires }
     *     
     */
    public void setWSI2RecherchePointRelaisHorairesResult(RetWSI2RecherchePointRelaisHoraires value) {
        this.wsi2RecherchePointRelaisHorairesResult = value;
    }

}
