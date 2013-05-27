
package matchmakerclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceOwls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerService", propOrder = {
    "serviceOwls"
})
public class RegisterService {

    protected String serviceOwls;

    /**
     * Gets the value of the serviceOwls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOwls() {
        return serviceOwls;
    }

    /**
     * Sets the value of the serviceOwls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOwls(String value) {
        this.serviceOwls = value;
    }

}
