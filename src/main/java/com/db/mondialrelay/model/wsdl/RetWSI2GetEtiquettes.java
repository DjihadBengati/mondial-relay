
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_GetEtiquettes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_GetEtiquettes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL_PDF_A4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_PDF_A5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_GetEtiquettes", propOrder = {
    "urlpdfa4",
    "urlpdfa5"
})
@XmlSeeAlso({
    RetWSI3GetEtiquettes.class
})
public class RetWSI2GetEtiquettes
    extends Ret
{

    @XmlElement(name = "URL_PDF_A4")
    protected String urlpdfa4;
    @XmlElement(name = "URL_PDF_A5")
    protected String urlpdfa5;

    /**
     * Obtient la valeur de la propriété urlpdfa4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPDFA4() {
        return urlpdfa4;
    }

    /**
     * Définit la valeur de la propriété urlpdfa4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPDFA4(String value) {
        this.urlpdfa4 = value;
    }

    /**
     * Obtient la valeur de la propriété urlpdfa5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPDFA5() {
        return urlpdfa5;
    }

    /**
     * Définit la valeur de la propriété urlpdfa5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPDFA5(String value) {
        this.urlpdfa5 = value;
    }

}
