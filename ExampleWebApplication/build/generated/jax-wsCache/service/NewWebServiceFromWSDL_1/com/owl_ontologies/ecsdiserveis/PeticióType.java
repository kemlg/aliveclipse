
package com.owl_ontologies.ecsdiserveis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Petici�Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Petici�Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_petici�" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    Petici�ServeiM�dicType.class
})
public class Petici�Type {

    @XmlElement(name = "id_petici\u00f3", required = true)
    protected String idPetici�;

    /**
     * Gets the value of the idPetici� property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPetici�() {
        return idPetici�;
    }

    /**
     * Sets the value of the idPetici� property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPetici�(String value) {
        this.idPetici� = value;
    }

}
