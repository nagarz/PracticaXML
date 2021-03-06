//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.05 at 04:44:22 PM CEST 
//


package dani.java.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultatsAprenentatge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultatsAprenentatge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="resultatAprenentatge" type="{http://www.xtec.cat/ProgramacioAula}ResultatAprenentatge"/>
 *       &lt;/sequence>
 *       &lt;attribute name="activitatEnsenyamentAprenentatge-ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultatsAprenentatge", propOrder = {
    "resultatAprenentatge"
})
public class ResultatsAprenentatge {

    @XmlElement(required = true)
    protected List<ResultatAprenentatge> resultatAprenentatge;
    @XmlAttribute(name = "activitatEnsenyamentAprenentatge-ref")
    @XmlIDREF
    protected Object activitatEnsenyamentAprenentatgeRef;

    /**
     * Gets the value of the resultatAprenentatge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultatAprenentatge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultatAprenentatge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultatAprenentatge }
     * 
     * 
     */
    public List<ResultatAprenentatge> getResultatAprenentatge() {
        if (resultatAprenentatge == null) {
            resultatAprenentatge = new ArrayList<ResultatAprenentatge>();
        }
        return this.resultatAprenentatge;
    }

    /**
     * Gets the value of the activitatEnsenyamentAprenentatgeRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActivitatEnsenyamentAprenentatgeRef() {
        return activitatEnsenyamentAprenentatgeRef;
    }

    /**
     * Sets the value of the activitatEnsenyamentAprenentatgeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActivitatEnsenyamentAprenentatgeRef(Object value) {
        this.activitatEnsenyamentAprenentatgeRef = value;
    }

}
