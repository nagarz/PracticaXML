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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramacioAula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramacioAula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resum" type="{http://www.xtec.cat/ProgramacioAula}Resum"/>
 *         &lt;element name="unitatsFormatives" type="{http://www.xtec.cat/ProgramacioAula}UnitatsFormatives"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramacioAula", namespace = "http://www.xtec.cat/ProgramacioAula", propOrder = {
    "resum",
    "unitatsFormatives"
})
@XmlRootElement(name = "programacioAula")
public class ProgramacioAula {

    @XmlElementRef(name = "resum", required = true)
    protected Resum resum;
    @XmlElementRef(name = "unitatsFormatives", required = true)
    protected UnitatsFormatives unitatsFormatives;

    /**
     * Gets the value of the resum property.
     * 
     * @return
     *     possible object is
     *     {@link Resum }
     *     
     */
    public Resum getResum() {
        return resum;
    }

    /**
     * Sets the value of the resum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resum }
     *     
     */
    public void setResum(Resum value) {
        this.resum = value;
    }

    /**
     * Gets the value of the unitatsFormatives property.
     * 
     * @return
     *     possible object is
     *     {@link UnitatsFormatives }
     *     
     */
    public UnitatsFormatives getUnitatsFormatives() {
        return unitatsFormatives;
    }

    /**
     * Sets the value of the unitatsFormatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitatsFormatives }
     *     
     */
    public void setUnitatsFormatives(UnitatsFormatives value) {
        this.unitatsFormatives = value;
    }

}
