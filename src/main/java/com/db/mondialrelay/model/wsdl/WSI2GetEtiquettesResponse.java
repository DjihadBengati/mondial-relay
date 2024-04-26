
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
 *         &lt;element name="WSI2_GetEtiquettesResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_GetEtiquettes" minOccurs="0"/&gt;
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
    "wsi2GetEtiquettesResult"
})
@XmlRootElement(name = "WSI2_GetEtiquettesResponse")
public class WSI2GetEtiquettesResponse {

    @XmlElement(name = "WSI2_GetEtiquettesResult")
    protected RetWSI2GetEtiquettes wsi2GetEtiquettesResult;

    /**
     * Obtient la valeur de la propriété wsi2GetEtiquettesResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2GetEtiquettes }
     *     
     */
    public RetWSI2GetEtiquettes getWSI2GetEtiquettesResult() {
        return wsi2GetEtiquettesResult;
    }

    /**
     * Définit la valeur de la propriété wsi2GetEtiquettesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2GetEtiquettes }
     *     
     */
    public void setWSI2GetEtiquettesResult(RetWSI2GetEtiquettes value) {
        this.wsi2GetEtiquettesResult = value;
    }

}
