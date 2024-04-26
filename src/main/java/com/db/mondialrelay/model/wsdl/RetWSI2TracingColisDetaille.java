
package com.db.mondialrelay.model.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_TracingColisDetaille complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_TracingColisDetaille"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Libelle01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relais_Libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relais_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Libelle02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tracing" type="{http://www.mondialrelay.fr/webservice/}ArrayOfRet_WSI2_sub_TracingColisDetaille" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_TracingColisDetaille", propOrder = {
    "libelle01",
    "relaisLibelle",
    "relaisNum",
    "libelle02",
    "tracing"
})
public class RetWSI2TracingColisDetaille
    extends Ret
{

    @XmlElement(name = "Libelle01")
    protected String libelle01;
    @XmlElement(name = "Relais_Libelle")
    protected String relaisLibelle;
    @XmlElement(name = "Relais_Num")
    protected String relaisNum;
    @XmlElement(name = "Libelle02")
    protected String libelle02;
    @XmlElement(name = "Tracing")
    protected ArrayOfRetWSI2SubTracingColisDetaille tracing;

    /**
     * Obtient la valeur de la propriété libelle01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle01() {
        return libelle01;
    }

    /**
     * Définit la valeur de la propriété libelle01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle01(String value) {
        this.libelle01 = value;
    }

    /**
     * Obtient la valeur de la propriété relaisLibelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisLibelle() {
        return relaisLibelle;
    }

    /**
     * Définit la valeur de la propriété relaisLibelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisLibelle(String value) {
        this.relaisLibelle = value;
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
     * Obtient la valeur de la propriété libelle02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle02() {
        return libelle02;
    }

    /**
     * Définit la valeur de la propriété libelle02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle02(String value) {
        this.libelle02 = value;
    }

    /**
     * Obtient la valeur de la propriété tracing.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetWSI2SubTracingColisDetaille }
     *     
     */
    public ArrayOfRetWSI2SubTracingColisDetaille getTracing() {
        return tracing;
    }

    /**
     * Définit la valeur de la propriété tracing.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetWSI2SubTracingColisDetaille }
     *     
     */
    public void setTracing(ArrayOfRetWSI2SubTracingColisDetaille value) {
        this.tracing = value;
    }

}
