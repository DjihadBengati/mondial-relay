
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
 *         &lt;element name="WSI2_STAT_LabelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "wsi2STATLabelResult"
})
@XmlRootElement(name = "WSI2_STAT_LabelResponse")
public class WSI2STATLabelResponse {

    @XmlElement(name = "WSI2_STAT_LabelResult")
    protected String wsi2STATLabelResult;

    /**
     * Obtient la valeur de la propriété wsi2STATLabelResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSI2STATLabelResult() {
        return wsi2STATLabelResult;
    }

    /**
     * Définit la valeur de la propriété wsi2STATLabelResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSI2STATLabelResult(String value) {
        this.wsi2STATLabelResult = value;
    }

}
