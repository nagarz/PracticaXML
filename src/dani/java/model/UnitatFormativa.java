//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.05 at 04:44:22 PM CEST 
//


package dani.java.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnitatFormativa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitatFormativa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hores" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="horesLliureDisposicio" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dataInici" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nuclisFormatius" type="{http://www.xtec.cat/ProgramacioAula}NuclisFormatius"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitatFormativa", propOrder = {
    "id",
    "nom",
    "hores",
    "horesLliureDisposicio",
    "dataInici",
    "dataFinal",
    "formula",
    "nuclisFormatius"
})
public class UnitatFormativa {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected BigInteger hores;
    @XmlElement(required = true)
    protected BigInteger horesLliureDisposicio;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataInici;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataFinal;
    @XmlElement(required = true)
    protected String formula;
    @XmlElement(required = true)
    protected NuclisFormatius nuclisFormatius;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the hores property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHores() {
        return hores;
    }

    /**
     * Sets the value of the hores property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHores(BigInteger value) {
        this.hores = value;
    }

    /**
     * Gets the value of the horesLliureDisposicio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHoresLliureDisposicio() {
        return horesLliureDisposicio;
    }

    /**
     * Sets the value of the horesLliureDisposicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHoresLliureDisposicio(BigInteger value) {
        this.horesLliureDisposicio = value;
    }

    /**
     * Gets the value of the dataInici property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInici() {
        return dataInici;
    }

    /**
     * Sets the value of the dataInici property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInici(XMLGregorianCalendar value) {
        this.dataInici = value;
    }

    /**
     * Gets the value of the dataFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the nuclisFormatius property.
     * 
     * @return
     *     possible object is
     *     {@link NuclisFormatius }
     *     
     */
    public NuclisFormatius getNuclisFormatius() {
        return nuclisFormatius;
    }

    /**
     * Sets the value of the nuclisFormatius property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuclisFormatius }
     *     
     */
    public void setNuclisFormatius(NuclisFormatius value) {
        this.nuclisFormatius = value;
    }

}
