
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_RechercheCP complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RechercheCP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Liste" type="{http://www.mondialrelay.fr/webservice/}ArrayOfCommune" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RechercheCP", propOrder = {
    "liste"
})
public class RetWSI2RechercheCP
    extends Ret
{

    @XmlElement(name = "Liste")
    protected ArrayOfCommune liste;

    /**
     * Obtient la valeur de la propriété liste.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommune }
     *     
     */
    public ArrayOfCommune getListe() {
        return liste;
    }

    /**
     * Définit la valeur de la propriété liste.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommune }
     *     
     */
    public void setListe(ArrayOfCommune value) {
        this.liste = value;
    }

}
