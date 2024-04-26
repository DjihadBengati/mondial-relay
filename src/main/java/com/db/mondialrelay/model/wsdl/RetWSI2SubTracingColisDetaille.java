
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_sub_TracingColisDetaille complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_sub_TracingColisDetaille"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Heure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Emplacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relais_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relais_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_sub_TracingColisDetaille", propOrder = {
    "libelle",
    "date",
    "heure",
    "emplacement",
    "relaisNum",
    "relaisPays"
})
public class RetWSI2SubTracingColisDetaille {

    @XmlElement(name = "Libelle")
    protected String libelle;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Heure")
    protected String heure;
    @XmlElement(name = "Emplacement")
    protected String emplacement;
    @XmlElement(name = "Relais_Num")
    protected String relaisNum;
    @XmlElement(name = "Relais_Pays")
    protected String relaisPays;

    /**
     * Obtient la valeur de la propriété libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit la valeur de la propriété libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété heure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Définit la valeur de la propriété heure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeure(String value) {
        this.heure = value;
    }

    /**
     * Obtient la valeur de la propriété emplacement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplacement() {
        return emplacement;
    }

    /**
     * Définit la valeur de la propriété emplacement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplacement(String value) {
        this.emplacement = value;
    }

    /**
     * Obtient la valeur de la propriété relaisNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisNum() {
        return relaisNum;
    }

    /**
     * Définit la valeur de la propriété relaisNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisNum(String value) {
        this.relaisNum = value;
    }

    /**
     * Obtient la valeur de la propriété relaisPays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisPays() {
        return relaisPays;
    }

    /**
     * Définit la valeur de la propriété relaisPays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisPays(String value) {
        this.relaisPays = value;
    }

}
