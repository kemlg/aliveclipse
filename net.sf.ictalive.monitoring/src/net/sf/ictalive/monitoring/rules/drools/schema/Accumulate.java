//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.07 at 04:10:50 PM CEST 
//


package net.sf.ictalive.monitoring.rules.drools.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *       &lt;choice>
 *         &lt;group ref="{http://drools.org/drools-5.0}accumulate"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pattern",
    "abstractConditionalElement",
    "init",
    "action",
    "result",
    "externalFunction"
})
@XmlRootElement(name = "accumulate")
public class Accumulate {

    protected Pattern pattern;
    @XmlElementRef(name = "abstractConditionalElement", namespace = "http://drools.org/drools-5.0", type = JAXBElement.class)
    protected JAXBElement<? extends ConditionalElementType> abstractConditionalElement;
    protected String init;
    protected String action;
    protected String result;
    @XmlElement(name = "external-function")
    protected ExternalFunction externalFunction;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link Pattern }
     *     
     */
    public Pattern getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pattern }
     *     
     */
    public void setPattern(Pattern value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the abstractConditionalElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrConditionalElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndConditionalElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionalElementType }{@code >}
     *     
     */
    public JAXBElement<? extends ConditionalElementType> getAbstractConditionalElement() {
        return abstractConditionalElement;
    }

    /**
     * Sets the value of the abstractConditionalElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrConditionalElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndConditionalElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionalElementType }{@code >}
     *     
     */
    public void setAbstractConditionalElement(JAXBElement<? extends ConditionalElementType> value) {
        this.abstractConditionalElement = ((JAXBElement<? extends ConditionalElementType> ) value);
    }

    /**
     * Gets the value of the init property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInit() {
        return init;
    }

    /**
     * Sets the value of the init property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInit(String value) {
        this.init = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the externalFunction property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFunction }
     *     
     */
    public ExternalFunction getExternalFunction() {
        return externalFunction;
    }

    /**
     * Sets the value of the externalFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFunction }
     *     
     */
    public void setExternalFunction(ExternalFunction value) {
        this.externalFunction = value;
    }

}
