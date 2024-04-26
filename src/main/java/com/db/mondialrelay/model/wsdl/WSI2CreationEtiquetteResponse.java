
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
 *         &lt;element name="WSI2_CreationEtiquetteResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_CreationEtiquette" minOccurs="0"/&gt;
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
    "wsi2CreationEtiquetteResult"
})
@XmlRootElement(name = "WSI2_CreationEtiquetteResponse")
public class WSI2CreationEtiquetteResponse {

    @XmlElement(name = "WSI2_CreationEtiquetteResult")
    protected RetWSI2CreationEtiquette wsi2CreationEtiquetteResult;

    /**
     * Obtient la valeur de la propriété wsi2CreationEtiquetteResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2CreationEtiquette }
     *     
     */
    public RetWSI2CreationEtiquette getWSI2CreationEtiquetteResult() {
        return wsi2CreationEtiquetteResult;
    }

    /**
     * Définit la valeur de la propriété wsi2CreationEtiquetteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2CreationEtiquette }
     *     
     */
    public void setWSI2CreationEtiquetteResult(RetWSI2CreationEtiquette value) {
        this.wsi2CreationEtiquetteResult = value;
    }

}
