
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_RecherchePointRelais complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RecherchePointRelais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PR01" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR02" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR03" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR04" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR05" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR06" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR07" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR08" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR09" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *         &lt;element name="PR10" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RecherchePointRelais", propOrder = {
    "pr01",
    "pr02",
    "pr03",
    "pr04",
    "pr05",
    "pr06",
    "pr07",
    "pr08",
    "pr09",
    "pr10"
})
public class RetWSI2RecherchePointRelais
    extends Ret
{

    @XmlElement(name = "PR01")
    protected RetWSI2SubPointRelais pr01;
    @XmlElement(name = "PR02")
    protected RetWSI2SubPointRelais pr02;
    @XmlElement(name = "PR03")
    protected RetWSI2SubPointRelais pr03;
    @XmlElement(name = "PR04")
    protected RetWSI2SubPointRelais pr04;
    @XmlElement(name = "PR05")
    protected RetWSI2SubPointRelais pr05;
    @XmlElement(name = "PR06")
    protected RetWSI2SubPointRelais pr06;
    @XmlElement(name = "PR07")
    protected RetWSI2SubPointRelais pr07;
    @XmlElement(name = "PR08")
    protected RetWSI2SubPointRelais pr08;
    @XmlElement(name = "PR09")
    protected RetWSI2SubPointRelais pr09;
    @XmlElement(name = "PR10")
    protected RetWSI2SubPointRelais pr10;

    /**
     * Obtient la valeur de la propriété pr01.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR01() {
        return pr01;
    }

    /**
     * Définit la valeur de la propriété pr01.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR01(RetWSI2SubPointRelais value) {
        this.pr01 = value;
    }

    /**
     * Obtient la valeur de la propriété pr02.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR02() {
        return pr02;
    }

    /**
     * Définit la valeur de la propriété pr02.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR02(RetWSI2SubPointRelais value) {
        this.pr02 = value;
    }

    /**
     * Obtient la valeur de la propriété pr03.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR03() {
        return pr03;
    }

    /**
     * Définit la valeur de la propriété pr03.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR03(RetWSI2SubPointRelais value) {
        this.pr03 = value;
    }

    /**
     * Obtient la valeur de la propriété pr04.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR04() {
        return pr04;
    }

    /**
     * Définit la valeur de la propriété pr04.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR04(RetWSI2SubPointRelais value) {
        this.pr04 = value;
    }

    /**
     * Obtient la valeur de la propriété pr05.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR05() {
        return pr05;
    }

    /**
     * Définit la valeur de la propriété pr05.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR05(RetWSI2SubPointRelais value) {
        this.pr05 = value;
    }

    /**
     * Obtient la valeur de la propriété pr06.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR06() {
        return pr06;
    }

    /**
     * Définit la valeur de la propriété pr06.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR06(RetWSI2SubPointRelais value) {
        this.pr06 = value;
    }

    /**
     * Obtient la valeur de la propriété pr07.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR07() {
        return pr07;
    }

    /**
     * Définit la valeur de la propriété pr07.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR07(RetWSI2SubPointRelais value) {
        this.pr07 = value;
    }

    /**
     * Obtient la valeur de la propriété pr08.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR08() {
        return pr08;
    }

    /**
     * Définit la valeur de la propriété pr08.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR08(RetWSI2SubPointRelais value) {
        this.pr08 = value;
    }

    /**
     * Obtient la valeur de la propriété pr09.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR09() {
        return pr09;
    }

    /**
     * Définit la valeur de la propriété pr09.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR09(RetWSI2SubPointRelais value) {
        this.pr09 = value;
    }

    /**
     * Obtient la valeur de la propriété pr10.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR10() {
        return pr10;
    }

    /**
     * Définit la valeur de la propriété pr10.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR10(RetWSI2SubPointRelais value) {
        this.pr10 = value;
    }

}
