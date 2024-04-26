
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_ complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_", propOrder = {
    "stat"
})
@XmlSeeAlso({
    RetWSI2CreationExpedition.class,
    RetWSI2CreationEtiquette.class,
    RetWSI2GetEtiquettes.class,
    RetWSI2RechercheCP.class,
    RetWSI3PointRelaisRecherche.class,
    RetWSI2AdressePointRelais.class,
    RetWSI2DetailPointRelais.class,
    RetWSI2RecherchePointRelais.class,
    RetWSI2RecherchePointRelaisAvancee.class,
    RetWSI2RecherchePointRelaisHoraires.class,
    RetWSI2TracingColisDetaille.class
})
public class Ret {

    @XmlElement(name = "STAT")
    protected String stat;

    /**
     * Obtient la valeur de la propriété stat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAT() {
        return stat;
    }

    /**
     * Définit la valeur de la propriété stat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAT(String value) {
        this.stat = value;
    }

}
