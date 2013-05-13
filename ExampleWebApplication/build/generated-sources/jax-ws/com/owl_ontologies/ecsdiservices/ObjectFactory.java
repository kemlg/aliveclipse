
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.owl_ontologies.ecsdiservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CentroMedico_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "CentroMedico");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owl_ontologies.ecsdiservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CentroMedicoType }
     * 
     */
    public CentroMedicoType createCentroMedicoType() {
        return new CentroMedicoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentroMedicoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "CentroMedico")
    public JAXBElement<CentroMedicoType> createCentroMedico(CentroMedicoType value) {
        return new JAXBElement<CentroMedicoType>(_CentroMedico_QNAME, CentroMedicoType.class, null, value);
    }

}
