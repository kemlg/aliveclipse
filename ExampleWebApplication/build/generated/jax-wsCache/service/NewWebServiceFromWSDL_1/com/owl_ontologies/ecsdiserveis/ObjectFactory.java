
package com.owl_ontologies.ecsdiserveis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.owl_ontologies.ecsdiserveis package. 
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

    private final static QName _Petici�_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServeis", "Petici\u00f3");
    private final static QName _Petici�ServeiM�dic_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServeis", "Petici\u00f3_Servei_M\u00e8dic");
    private final static QName _RespostaServeiM�dic_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServeis", "Resposta_Servei_M\u00e8dic");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owl_ontologies.ecsdiserveis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Petici�ServeiM�dicType }
     * 
     */
    public Petici�ServeiM�dicType createPetici�ServeiM�dicType() {
        return new Petici�ServeiM�dicType();
    }

    /**
     * Create an instance of {@link Petici�Type }
     * 
     */
    public Petici�Type createPetici�Type() {
        return new Petici�Type();
    }

    /**
     * Create an instance of {@link RespostaServeiM�dicType }
     * 
     */
    public RespostaServeiM�dicType createRespostaServeiM�dicType() {
        return new RespostaServeiM�dicType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Petici�Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServeis", name = "Petici\u00f3")
    public JAXBElement<Petici�Type> createPetici�(Petici�Type value) {
        return new JAXBElement<Petici�Type>(_Petici�_QNAME, Petici�Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Petici�ServeiM�dicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServeis", name = "Petici\u00f3_Servei_M\u00e8dic", substitutionHeadNamespace = "http://www.owl-ontologies.com/ECSDIServeis", substitutionHeadName = "Petici\u00f3")
    public JAXBElement<Petici�ServeiM�dicType> createPetici�ServeiM�dic(Petici�ServeiM�dicType value) {
        return new JAXBElement<Petici�ServeiM�dicType>(_Petici�ServeiM�dic_QNAME, Petici�ServeiM�dicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespostaServeiM�dicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServeis", name = "Resposta_Servei_M\u00e8dic")
    public JAXBElement<RespostaServeiM�dicType> createRespostaServeiM�dic(RespostaServeiM�dicType value) {
        return new JAXBElement<RespostaServeiM�dicType>(_RespostaServeiM�dic_QNAME, RespostaServeiM�dicType.class, null, value);
    }

}
