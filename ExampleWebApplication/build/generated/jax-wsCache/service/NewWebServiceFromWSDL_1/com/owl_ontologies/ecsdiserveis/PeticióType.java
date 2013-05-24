
package com.owl_ontologies.ecsdiserveis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeticióType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeticióType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_petició" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Petici\u00f3Type", propOrder = {
    "idPetici\u00f3"
})
@XmlSeeAlso({
    PeticióServeiMèdicType.class
})
public class PeticióType {

    @XmlElement(name = "id_petici\u00f3", required = true)
    protected String idPetició;

    /**
     * Gets the value of the idPetició property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPetició() {
        return idPetició;
    }

    /**
     * Sets the value of the idPetició property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPetició(String value) {
        this.idPetició = value;
    }

}
