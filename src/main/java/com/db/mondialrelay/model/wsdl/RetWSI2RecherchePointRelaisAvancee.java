
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_RecherchePointRelaisAvancee complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RecherchePointRelaisAvancee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListePR" type="{http://www.mondialrelay.fr/webservice/}ArrayOfRet_WSI2_sub_PointRelaisAvancee" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RecherchePointRelaisAvancee", propOrder = {
    "listePR"
})
public class RetWSI2RecherchePointRelaisAvancee
    extends Ret
{

    @XmlElement(name = "ListePR")
    protected ArrayOfRetWSI2SubPointRelaisAvancee listePR;

    /**
     * Obtient la valeur de la propriété listePR.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetWSI2SubPointRelaisAvancee }
     *     
     */
    public ArrayOfRetWSI2SubPointRelaisAvancee getListePR() {
        return listePR;
    }

    /**
     * Définit la valeur de la propriété listePR.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetWSI2SubPointRelaisAvancee }
     *     
     */
    public void setListePR(ArrayOfRetWSI2SubPointRelaisAvancee value) {
        this.listePR = value;
    }

}
