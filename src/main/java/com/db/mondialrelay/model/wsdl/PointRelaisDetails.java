
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointRelais_Details complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointRelais_Details"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LgAdr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LgAdr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LgAdr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LgAdr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Localisation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Localisation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeActivite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Lundi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Mardi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Mercredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Jeudi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Vendredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Samedi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Horaires_Dimanche" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Informations_Dispo" type="{http://www.mondialrelay.fr/webservice/}ArrayOfPeriode" minOccurs="0"/&gt;
 *         &lt;element name="URL_Photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointRelais_Details", propOrder = {
    "stat",
    "num",
    "lgAdr1",
    "lgAdr2",
    "lgAdr3",
    "lgAdr4",
    "cp",
    "ville",
    "pays",
    "localisation1",
    "localisation2",
    "latitude",
    "longitude",
    "typeActivite",
    "nace",
    "information",
    "horairesLundi",
    "horairesMardi",
    "horairesMercredi",
    "horairesJeudi",
    "horairesVendredi",
    "horairesSamedi",
    "horairesDimanche",
    "informationsDispo",
    "urlPhoto",
    "urlPlan",
    "distance"
})
public class PointRelaisDetails {

    @XmlElement(name = "STAT")
    protected String stat;
    @XmlElement(name = "Num")
    protected String num;
    @XmlElement(name = "LgAdr1")
    protected String lgAdr1;
    @XmlElement(name = "LgAdr2")
    protected String lgAdr2;
    @XmlElement(name = "LgAdr3")
    protected String lgAdr3;
    @XmlElement(name = "LgAdr4")
    protected String lgAdr4;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "Localisation1")
    protected String localisation1;
    @XmlElement(name = "Localisation2")
    protected String localisation2;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "TypeActivite")
    protected String typeActivite;
    @XmlElement(name = "NACE")
    protected String nace;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "Horaires_Lundi")
    protected ArrayOfString horairesLundi;
    @XmlElement(name = "Horaires_Mardi")
    protected ArrayOfString horairesMardi;
    @XmlElement(name = "Horaires_Mercredi")
    protected ArrayOfString horairesMercredi;
    @XmlElement(name = "Horaires_Jeudi")
    protected ArrayOfString horairesJeudi;
    @XmlElement(name = "Horaires_Vendredi")
    protected ArrayOfString horairesVendredi;
    @XmlElement(name = "Horaires_Samedi")
    protected ArrayOfString horairesSamedi;
    @XmlElement(name = "Horaires_Dimanche")
    protected ArrayOfString horairesDimanche;
    @XmlElement(name = "Informations_Dispo")
    protected ArrayOfPeriode informationsDispo;
    @XmlElement(name = "URL_Photo")
    protected String urlPhoto;
    @XmlElement(name = "URL_Plan")
    protected String urlPlan;
    @XmlElement(name = "Distance")
    protected String distance;

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

    /**
     * Obtient la valeur de la propriété num.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Définit la valeur de la propriété num.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Obtient la valeur de la propriété lgAdr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr1() {
        return lgAdr1;
    }

    /**
     * Définit la valeur de la propriété lgAdr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr1(String value) {
        this.lgAdr1 = value;
    }

    /**
     * Obtient la valeur de la propriété lgAdr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr2() {
        return lgAdr2;
    }

    /**
     * Définit la valeur de la propriété lgAdr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr2(String value) {
        this.lgAdr2 = value;
    }

    /**
     * Obtient la valeur de la propriété lgAdr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr3() {
        return lgAdr3;
    }

    /**
     * Définit la valeur de la propriété lgAdr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr3(String value) {
        this.lgAdr3 = value;
    }

    /**
     * Obtient la valeur de la propriété lgAdr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr4() {
        return lgAdr4;
    }

    /**
     * Définit la valeur de la propriété lgAdr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr4(String value) {
        this.lgAdr4 = value;
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
     * Obtient la valeur de la propriété localisation1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation1() {
        return localisation1;
    }

    /**
     * Définit la valeur de la propriété localisation1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation1(String value) {
        this.localisation1 = value;
    }

    /**
     * Obtient la valeur de la propriété localisation2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation2() {
        return localisation2;
    }

    /**
     * Définit la valeur de la propriété localisation2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation2(String value) {
        this.localisation2 = value;
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
     * Obtient la valeur de la propriété information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Définit la valeur de la propriété information.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Obtient la valeur de la propriété horairesLundi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesLundi() {
        return horairesLundi;
    }

    /**
     * Définit la valeur de la propriété horairesLundi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesLundi(ArrayOfString value) {
        this.horairesLundi = value;
    }

    /**
     * Obtient la valeur de la propriété horairesMardi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesMardi() {
        return horairesMardi;
    }

    /**
     * Définit la valeur de la propriété horairesMardi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesMardi(ArrayOfString value) {
        this.horairesMardi = value;
    }

    /**
     * Obtient la valeur de la propriété horairesMercredi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesMercredi() {
        return horairesMercredi;
    }

    /**
     * Définit la valeur de la propriété horairesMercredi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesMercredi(ArrayOfString value) {
        this.horairesMercredi = value;
    }

    /**
     * Obtient la valeur de la propriété horairesJeudi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesJeudi() {
        return horairesJeudi;
    }

    /**
     * Définit la valeur de la propriété horairesJeudi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesJeudi(ArrayOfString value) {
        this.horairesJeudi = value;
    }

    /**
     * Obtient la valeur de la propriété horairesVendredi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesVendredi() {
        return horairesVendredi;
    }

    /**
     * Définit la valeur de la propriété horairesVendredi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesVendredi(ArrayOfString value) {
        this.horairesVendredi = value;
    }

    /**
     * Obtient la valeur de la propriété horairesSamedi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesSamedi() {
        return horairesSamedi;
    }

    /**
     * Définit la valeur de la propriété horairesSamedi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesSamedi(ArrayOfString value) {
        this.horairesSamedi = value;
    }

    /**
     * Obtient la valeur de la propriété horairesDimanche.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesDimanche() {
        return horairesDimanche;
    }

    /**
     * Définit la valeur de la propriété horairesDimanche.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesDimanche(ArrayOfString value) {
        this.horairesDimanche = value;
    }

    /**
     * Obtient la valeur de la propriété informationsDispo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeriode }
     *     
     */
    public ArrayOfPeriode getInformationsDispo() {
        return informationsDispo;
    }

    /**
     * Définit la valeur de la propriété informationsDispo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeriode }
     *     
     */
    public void setInformationsDispo(ArrayOfPeriode value) {
        this.informationsDispo = value;
    }

    /**
     * Obtient la valeur de la propriété urlPhoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPhoto() {
        return urlPhoto;
    }

    /**
     * Définit la valeur de la propriété urlPhoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPhoto(String value) {
        this.urlPhoto = value;
    }

    /**
     * Obtient la valeur de la propriété urlPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPlan() {
        return urlPlan;
    }

    /**
     * Définit la valeur de la propriété urlPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPlan(String value) {
        this.urlPlan = value;
    }

    /**
     * Obtient la valeur de la propriété distance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Définit la valeur de la propriété distance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

}
