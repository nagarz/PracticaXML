//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.05 at 04:44:22 PM CEST 
//


package dani.java.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="familia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cicle" type="{http://www.xtec.cat/ProgramacioAula}Cicle"/>
 *         &lt;element name="modul" type="{http://www.xtec.cat/ProgramacioAula}Modul"/>
 *         &lt;element name="titular" type="{http://www.xtec.cat/ProgramacioAula}Titular"/>
 *         &lt;element name="torn" type="{http://www.xtec.cat/ProgramacioAula}Torn"/>
 *         &lt;element name="grup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programacioComuna" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resum", propOrder = {
    "familia",
    "cicle",
    "modul",
    "titular",
    "torn",
    "grup",
    "programacioComuna"
})
public class Resum {

    @XmlElement(required = true)
    protected String familia;
    @XmlElement(required = true)
    protected Cicle cicle;
    @XmlElement(required = true)
    protected Modul modul;
    @XmlElement(required = true)
    protected Titular titular;
    @XmlElement(required = true)
    protected Torn torn;
    @XmlElement(required = true)
    protected String grup;
    @XmlElement(required = true)
    protected String programacioComuna;

    /**
     * Gets the value of the familia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * Sets the value of the familia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilia(String value) {
        this.familia = value;
    }

    /**
     * Gets the value of the cicle property.
     * 
     * @return
     *     possible object is
     *     {@link Cicle }
     *     
     */
    public Cicle getCicle() {
        return cicle;
    }

    /**
     * Sets the value of the cicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cicle }
     *     
     */
    public void setCicle(Cicle value) {
        this.cicle = value;
    }

    /**
     * Gets the value of the modul property.
     * 
     * @return
     *     possible object is
     *     {@link Modul }
     *     
     */
    public Modul getModul() {
        return modul;
    }

    /**
     * Sets the value of the modul property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modul }
     *     
     */
    public void setModul(Modul value) {
        this.modul = value;
    }

    /**
     * Gets the value of the titular property.
     * 
     * @return
     *     possible object is
     *     {@link Titular }
     *     
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     * Sets the value of the titular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Titular }
     *     
     */
    public void setTitular(Titular value) {
        this.titular = value;
    }

    /**
     * Gets the value of the torn property.
     * 
     * @return
     *     possible object is
     *     {@link Torn }
     *     
     */
    public Torn getTorn() {
        return torn;
    }

    /**
     * Sets the value of the torn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Torn }
     *     
     */
    public void setTorn(Torn value) {
        this.torn = value;
    }

    /**
     * Gets the value of the grup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrup() {
        return grup;
    }

    /**
     * Sets the value of the grup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrup(String value) {
        this.grup = value;
    }

    /**
     * Gets the value of the programacioComuna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramacioComuna() {
        return programacioComuna;
    }

    /**
     * Sets the value of the programacioComuna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramacioComuna(String value) {
        this.programacioComuna = value;
    }

}
