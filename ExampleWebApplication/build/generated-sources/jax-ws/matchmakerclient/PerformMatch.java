
package matchmakerclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for performMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="performMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryOwls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "performMatch", propOrder = {
    "queryOwls"
})
public class PerformMatch {

    protected String queryOwls;

    /**
     * Gets the value of the queryOwls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryOwls() {
        return queryOwls;
    }

    /**
     * Sets the value of the queryOwls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryOwls(String value) {
        this.queryOwls = value;
    }

}
