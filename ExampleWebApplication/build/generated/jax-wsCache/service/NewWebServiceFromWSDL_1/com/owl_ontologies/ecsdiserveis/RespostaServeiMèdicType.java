
package com.owl_ontologies.ecsdiserveis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resposta_Servei_M重icType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resposta_Servei_M重icType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_resposta_servei_m重ic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resposta_Servei_M\u00e8dicType", propOrder = {
    "idRespostaServeiM\u00e8dic"
})
public class RespostaServeiM重icType {

    @XmlElement(name = "id_resposta_servei_m\u00e8dic", required = true)
    protected String idRespostaServeiM重ic;

    /**
     * Gets the value of the idRespostaServeiM重ic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRespostaServeiM重ic() {
        return idRespostaServeiM重ic;
    }

    /**
     * Sets the value of the idRespostaServeiM重ic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRespostaServeiM重ic(String value) {
        this.idRespostaServeiM重ic = value;
    }

}
