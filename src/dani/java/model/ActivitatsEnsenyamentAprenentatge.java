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
 * <p>Java class for ActivitatsEnsenyamentAprenentatge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitatsEnsenyamentAprenentatge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="activitatEnsenyamentAprenentatge" type="{http://www.xtec.cat/ProgramacioAula}ActivitatEnsenyamentAprenentatge"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nucliFormatiu-ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitatsEnsenyamentAprenentatge", propOrder = {
    "activitatEnsenyamentAprenentatge"
})
public class ActivitatsEnsenyamentAprenentatge {

    @XmlElement(required = true)
    protected List<ActivitatEnsenyamentAprenentatge> activitatEnsenyamentAprenentatge;
    @XmlAttribute(name = "nucliFormatiu-ref")
    @XmlIDREF
    protected Object nucliFormatiuRef;

    /**
     * Gets the value of the activitatEnsenyamentAprenentatge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activitatEnsenyamentAprenentatge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivitatEnsenyamentAprenentatge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivitatEnsenyamentAprenentatge }
     * 
     * 
     */
    public List<ActivitatEnsenyamentAprenentatge> getActivitatEnsenyamentAprenentatge() {
        if (activitatEnsenyamentAprenentatge == null) {
            activitatEnsenyamentAprenentatge = new ArrayList<ActivitatEnsenyamentAprenentatge>();
        }
        return this.activitatEnsenyamentAprenentatge;
    }

    /**
     * Gets the value of the nucliFormatiuRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNucliFormatiuRef() {
        return nucliFormatiuRef;
    }

    /**
     * Sets the value of the nucliFormatiuRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNucliFormatiuRef(Object value) {
        this.nucliFormatiuRef = value;
    }

}
