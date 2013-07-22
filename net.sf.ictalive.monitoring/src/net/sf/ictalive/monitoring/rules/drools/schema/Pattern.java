//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.07 at 04:10:50 PM CEST 
//


package net.sf.ictalive.monitoring.rules.drools.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://drools.org/drools-5.0}field-binding"/>
 *         &lt;element ref="{http://drools.org/drools-5.0}field-constraint"/>
 *         &lt;element ref="{http://drools.org/drools-5.0}from"/>
 *         &lt;element ref="{http://drools.org/drools-5.0}predicate"/>
 *         &lt;element ref="{http://drools.org/drools-5.0}abstractConstraintConective"/>
 *       &lt;/choice>
 *       &lt;attribute name="field-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="object-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fieldBindingOrFieldConstraintOrFrom"
})
@XmlRootElement(name = "pattern")
public class Pattern {

    @XmlElementRefs({
        @XmlElementRef(name = "field-constraint", namespace = "http://drools.org/drools-5.0", type = FieldConstraint.class),
        @XmlElementRef(name = "predicate", namespace = "http://drools.org/drools-5.0", type = Predicate.class),
        @XmlElementRef(name = "from", namespace = "http://drools.org/drools-5.0", type = From.class),
        @XmlElementRef(name = "field-binding", namespace = "http://drools.org/drools-5.0", type = FieldBinding.class),
        @XmlElementRef(name = "abstractConstraintConective", namespace = "http://drools.org/drools-5.0", type = JAXBElement.class)
    })
    protected List<Object> fieldBindingOrFieldConstraintOrFrom;
    @XmlAttribute(name = "field-name")
    protected String fieldName;
    @XmlAttribute
    protected String identifier;
    @XmlAttribute(name = "object-type", required = true)
    protected String objectType;

    /**
     * Gets the value of the fieldBindingOrFieldConstraintOrFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldBindingOrFieldConstraintOrFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldBindingOrFieldConstraintOrFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldConstraint }
     * {@link Predicate }
     * {@link From }
     * {@link FieldBinding }
     * {@link JAXBElement }{@code <}{@link AndConstraintConnective }{@code >}
     * {@link JAXBElement }{@code <}{@link OrConstraintConnective }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstraintConnectiveElementType }{@code >}
     * 
     * 
     */
    public List<Object> getFieldBindingOrFieldConstraintOrFrom() {
        if (fieldBindingOrFieldConstraintOrFrom == null) {
            fieldBindingOrFieldConstraintOrFrom = new ArrayList<Object>();
        }
        return this.fieldBindingOrFieldConstraintOrFrom;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

}