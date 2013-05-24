
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentroMedicoDATA.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CentroMedicoDATA">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CapElSerral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CentroMedicoDATA")
@XmlEnum
public enum CentroMedicoDATA {

    @XmlEnumValue("CapElSerral")
    CAP_EL_SERRAL("CapElSerral");
    private final String value;

    CentroMedicoDATA(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CentroMedicoDATA fromValue(String v) {
        for (CentroMedicoDATA c: CentroMedicoDATA.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
