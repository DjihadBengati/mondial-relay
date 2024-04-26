
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI3_GetEtiquettes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI3_GetEtiquettes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_WSI2_GetEtiquettes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL_PDF_10x15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI3_GetEtiquettes", propOrder = {
    "urlpdf10X15"
})
public class RetWSI3GetEtiquettes
    extends RetWSI2GetEtiquettes
{

    @XmlElement(name = "URL_PDF_10x15")
    protected String urlpdf10X15;

    /**
     * Obtient la valeur de la propriété urlpdf10X15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPDF10X15() {
        return urlpdf10X15;
    }

    /**
     * Définit la valeur de la propriété urlpdf10X15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPDF10X15(String value) {
        this.urlpdf10X15 = value;
    }

}
