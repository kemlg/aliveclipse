//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.07 at 04:10:50 PM CEST 
//


package net.sf.ictalive.monitoring.rules.drools.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://drools.org/drools-5.0}collect"/>
 *         &lt;element ref="{http://drools.org/drools-5.0}expression"/>
 *         &lt;element ref="{http://drools.org/drools-5.0}accumulate"/>
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
    "collect",
    "expression",
    "accumulate"
})
@XmlRootElement(name = "from")
public class From {

    protected Collect collect;
    protected String expression;
    protected Accumulate accumulate;

    /**
     * Gets the value of the collect property.
     * 
     * @return
     *     possible object is
     *     {@link Collect }
     *     
     */
    public Collect getCollect() {
        return collect;
    }

    /**
     * Sets the value of the collect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collect }
     *     
     */
    public void setCollect(Collect value) {
        this.collect = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the accumulate property.
     * 
     * @return
     *     possible object is
     *     {@link Accumulate }
     *     
     */
    public Accumulate getAccumulate() {
        return accumulate;
    }

    /**
     * Sets the value of the accumulate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accumulate }
     *     
     */
    public void setAccumulate(Accumulate value) {
        this.accumulate = value;
    }

}
