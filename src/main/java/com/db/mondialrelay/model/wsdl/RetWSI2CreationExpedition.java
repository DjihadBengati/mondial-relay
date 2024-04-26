
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_CreationExpedition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_CreationExpedition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpeditionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRI_AgenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRI_Groupe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRI_Navette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRI_Agence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRI_TourneeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRI_LivraisonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodesBarres" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_CreationExpedition", propOrder = {
    "expeditionNum",
    "triAgenceCode",
    "triGroupe",
    "triNavette",
    "triAgence",
    "triTourneeCode",
    "triLivraisonMode",
    "codesBarres"
})
public class RetWSI2CreationExpedition
    extends Ret
{

    @XmlElement(name = "ExpeditionNum")
    protected String expeditionNum;
    @XmlElement(name = "TRI_AgenceCode")
    protected String triAgenceCode;
    @XmlElement(name = "TRI_Groupe")
    protected String triGroupe;
    @XmlElement(name = "TRI_Navette")
    protected String triNavette;
    @XmlElement(name = "TRI_Agence")
    protected String triAgence;
    @XmlElement(name = "TRI_TourneeCode")
    protected String triTourneeCode;
    @XmlElement(name = "TRI_LivraisonMode")
    protected String triLivraisonMode;
    @XmlElement(name = "CodesBarres")
    protected ArrayOfString codesBarres;

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
     * Obtient la valeur de la propriété triAgenceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIAgenceCode() {
        return triAgenceCode;
    }

    /**
     * Définit la valeur de la propriété triAgenceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIAgenceCode(String value) {
        this.triAgenceCode = value;
    }

    /**
     * Obtient la valeur de la propriété triGroupe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIGroupe() {
        return triGroupe;
    }

    /**
     * Définit la valeur de la propriété triGroupe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIGroupe(String value) {
        this.triGroupe = value;
    }

    /**
     * Obtient la valeur de la propriété triNavette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRINavette() {
        return triNavette;
    }

    /**
     * Définit la valeur de la propriété triNavette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRINavette(String value) {
        this.triNavette = value;
    }

    /**
     * Obtient la valeur de la propriété triAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIAgence() {
        return triAgence;
    }

    /**
     * Définit la valeur de la propriété triAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIAgence(String value) {
        this.triAgence = value;
    }

    /**
     * Obtient la valeur de la propriété triTourneeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRITourneeCode() {
        return triTourneeCode;
    }

    /**
     * Définit la valeur de la propriété triTourneeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRITourneeCode(String value) {
        this.triTourneeCode = value;
    }

    /**
     * Obtient la valeur de la propriété triLivraisonMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRILivraisonMode() {
        return triLivraisonMode;
    }

    /**
     * Définit la valeur de la propriété triLivraisonMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRILivraisonMode(String value) {
        this.triLivraisonMode = value;
    }

    /**
     * Obtient la valeur de la propriété codesBarres.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCodesBarres() {
        return codesBarres;
    }

    /**
     * Définit la valeur de la propriété codesBarres.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCodesBarres(ArrayOfString value) {
        this.codesBarres = value;
    }

}
