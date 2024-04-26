
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_CreationEtiquette complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_CreationEtiquette"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpeditionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_Etiquette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_CreationEtiquette", propOrder = {
    "expeditionNum",
    "urlEtiquette"
})
public class RetWSI2CreationEtiquette
    extends Ret
{

    @XmlElement(name = "ExpeditionNum")
    protected String expeditionNum;
    @XmlElement(name = "URL_Etiquette")
    protected String urlEtiquette;

    /**
     * Obtient la valeur de la propriété expeditionNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditionNum() {
        return expeditionNum;
    }

    /**
     * Définit la valeur de la propriété expeditionNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditionNum(String value) {
        this.expeditionNum = value;
    }

    /**
     * Obtient la valeur de la propriété urlEtiquette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLEtiquette() {
        return urlEtiquette;
    }

    /**
     * Définit la valeur de la propriété urlEtiquette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLEtiquette(String value) {
        this.urlEtiquette = value;
    }

}
