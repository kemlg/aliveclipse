
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EcografiaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcografiaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EcoFloat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="EcoDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EcoString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EcoDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EcoBool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EcoTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="EcoInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubPrueba" type="{http://www.owl-ontologies.com/ECSDIServices}Imagen"/>
 *         &lt;element name="IDPrueba" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcografiaType", propOrder = {
    "ecoFloat",
    "ecoDateTime",
    "ecoString",
    "ecoDate",
    "ecoBool",
    "ecoTime",
    "ecoInt",
    "subPrueba",
    "idPrueba"
})
public class EcografiaType {

    @XmlElement(name = "EcoFloat")
    protected float ecoFloat;
    @XmlElement(name = "EcoDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ecoDateTime;
    @XmlElement(name = "EcoString", required = true)
    protected String ecoString;
    @XmlElement(name = "EcoDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ecoDate;
    @XmlElement(name = "EcoBool")
    protected boolean ecoBool;
    @XmlElement(name = "EcoTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar ecoTime;
    @XmlElement(name = "EcoInt")
    protected int ecoInt;
    @XmlElement(name = "SubPrueba", required = true)
    protected Imagen subPrueba;
    @XmlElement(name = "IDPrueba", required = true)
    protected String idPrueba;

    /**
     * Gets the value of the ecoFloat property.
     * 
     */
    public float getEcoFloat() {
        return ecoFloat;
    }

    /**
     * Sets the value of the ecoFloat property.
     * 
     */
    public void setEcoFloat(float value) {
        this.ecoFloat = value;
    }

    /**
     * Gets the value of the ecoDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEcoDateTime() {
        return ecoDateTime;
    }

    /**
     * Sets the value of the ecoDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEcoDateTime(XMLGregorianCalendar value) {
        this.ecoDateTime = value;
    }

    /**
     * Gets the value of the ecoString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcoString() {
        return ecoString;
    }

    /**
     * Sets the value of the ecoString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcoString(String value) {
        this.ecoString = value;
    }

    /**
     * Gets the value of the ecoDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEcoDate() {
        return ecoDate;
    }

    /**
     * Sets the value of the ecoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEcoDate(XMLGregorianCalendar value) {
        this.ecoDate = value;
    }

    /**
     * Gets the value of the ecoBool property.
     * 
     */
    public boolean isEcoBool() {
        return ecoBool;
    }

    /**
     * Sets the value of the ecoBool property.
     * 
     */
    public void setEcoBool(boolean value) {
        this.ecoBool = value;
    }

    /**
     * Gets the value of the ecoTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEcoTime() {
        return ecoTime;
    }

    /**
     * Sets the value of the ecoTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEcoTime(XMLGregorianCalendar value) {
        this.ecoTime = value;
    }

    /**
     * Gets the value of the ecoInt property.
     * 
     */
    public int getEcoInt() {
        return ecoInt;
    }

    /**
     * Sets the value of the ecoInt property.
     * 
     */
    public void setEcoInt(int value) {
        this.ecoInt = value;
    }

    /**
     * Gets the value of the subPrueba property.
     * 
     * @return
     *     possible object is
     *     {@link Imagen }
     *     
     */
    public Imagen getSubPrueba() {
        return subPrueba;
    }

    /**
     * Sets the value of the subPrueba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Imagen }
     *     
     */
    public void setSubPrueba(Imagen value) {
        this.subPrueba = value;
    }

    /**
     * Gets the value of the idPrueba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPrueba() {
        return idPrueba;
    }

    /**
     * Sets the value of the idPrueba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPrueba(String value) {
        this.idPrueba = value;
    }

}
