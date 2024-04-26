
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
 *         &lt;element name="WSI4_PointRelais_RechercheResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI3_PointRelais_Recherche" minOccurs="0"/&gt;
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
    "wsi4PointRelaisRechercheResult"
})
@XmlRootElement(name = "WSI4_PointRelais_RechercheResponse")
public class WSI4PointRelaisRechercheResponse {

    @XmlElement(name = "WSI4_PointRelais_RechercheResult")
    protected RetWSI3PointRelaisRecherche wsi4PointRelaisRechercheResult;

    /**
     * Obtient la valeur de la propriété wsi4PointRelaisRechercheResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI3PointRelaisRecherche }
     *     
     */
    public RetWSI3PointRelaisRecherche getWSI4PointRelaisRechercheResult() {
        return wsi4PointRelaisRechercheResult;
    }

    /**
     * Définit la valeur de la propriété wsi4PointRelaisRechercheResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI3PointRelaisRecherche }
     *     
     */
    public void setWSI4PointRelaisRechercheResult(RetWSI3PointRelaisRecherche value) {
        this.wsi4PointRelaisRechercheResult = value;
    }

}
