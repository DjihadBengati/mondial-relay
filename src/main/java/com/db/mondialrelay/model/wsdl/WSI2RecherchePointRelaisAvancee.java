
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
 *         &lt;element name="Enseigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Taille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Poids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelaiEnvoi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RayonRecherche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeActivite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "enseigne",
    "pays",
    "ville",
    "cp",
    "latitude",
    "longitude",
    "taille",
    "poids",
    "action",
    "delaiEnvoi",
    "rayonRecherche",
    "typeActivite",
    "nace",
    "security"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisAvancee")
public class WSI2RecherchePointRelaisAvancee {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Taille")
    protected String taille;
    @XmlElement(name = "Poids")
    protected String poids;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "DelaiEnvoi")
    protected String delaiEnvoi;
    @XmlElement(name = "RayonRecherche")
    protected String rayonRecherche;
    @XmlElement(name = "TypeActivite")
    protected String typeActivite;
    @XmlElement(name = "NACE")
    protected String nace;
    @XmlElement(name = "Security")
    protected String security;

    /**
     * Obtient la valeur de la propriété enseigne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnseigne() {
        return enseigne;
    }

    /**
     * Définit la valeur de la propriété enseigne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnseigne(String value) {
        this.enseigne = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propriété cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * Définit la valeur de la propriété cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtient la valeur de la propriété latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Définit la valeur de la propriété latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtient la valeur de la propriété longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Définit la valeur de la propriété longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtient la valeur de la propriété taille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaille() {
        return taille;
    }

    /**
     * Définit la valeur de la propriété taille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaille(String value) {
        this.taille = value;
    }

    /**
     * Obtient la valeur de la propriété poids.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoids() {
        return poids;
    }

    /**
     * Définit la valeur de la propriété poids.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoids(String value) {
        this.poids = value;
    }

    /**
     * Obtient la valeur de la propriété action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Définit la valeur de la propriété action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtient la valeur de la propriété delaiEnvoi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaiEnvoi() {
        return delaiEnvoi;
    }

    /**
     * Définit la valeur de la propriété delaiEnvoi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaiEnvoi(String value) {
        this.delaiEnvoi = value;
    }

    /**
     * Obtient la valeur de la propriété rayonRecherche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayonRecherche() {
        return rayonRecherche;
    }

    /**
     * Définit la valeur de la propriété rayonRecherche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayonRecherche(String value) {
        this.rayonRecherche = value;
    }

    /**
     * Obtient la valeur de la propriété typeActivite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeActivite() {
        return typeActivite;
    }

    /**
     * Définit la valeur de la propriété typeActivite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeActivite(String value) {
        this.typeActivite = value;
    }

    /**
     * Obtient la valeur de la propriété nace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACE() {
        return nace;
    }

    /**
     * Définit la valeur de la propriété nace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACE(String value) {
        this.nace = value;
    }

    /**
     * Obtient la valeur de la propriété security.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Définit la valeur de la propriété security.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

}
