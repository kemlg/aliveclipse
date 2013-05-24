
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

    private final static QName _Petició_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServeis", "Petici\u00f3");
    private final static QName _PeticióServeiMèdic_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServeis", "Petici\u00f3_Servei_M\u00e8dic");
    private final static QName _RespostaServeiMèdic_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServeis", "Resposta_Servei_M\u00e8dic");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owl_ontologies.ecsdiserveis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticióServeiMèdicType }
     * 
     */
    public PeticióServeiMèdicType createPeticióServeiMèdicType() {
        return new PeticióServeiMèdicType();
    }

    /**
     * Create an instance of {@link PeticióType }
     * 
     */
    public PeticióType createPeticióType() {
        return new PeticióType();
    }

    /**
     * Create an instance of {@link RespostaServeiMèdicType }
     * 
     */
    public RespostaServeiMèdicType createRespostaServeiMèdicType() {
        return new RespostaServeiMèdicType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticióType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServeis", name = "Petici\u00f3")
    public JAXBElement<PeticióType> createPetició(PeticióType value) {
        return new JAXBElement<PeticióType>(_Petició_QNAME, PeticióType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticióServeiMèdicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServeis", name = "Petici\u00f3_Servei_M\u00e8dic", substitutionHeadNamespace = "http://www.owl-ontologies.com/ECSDIServeis", substitutionHeadName = "Petici\u00f3")
    public JAXBElement<PeticióServeiMèdicType> createPeticióServeiMèdic(PeticióServeiMèdicType value) {
        return new JAXBElement<PeticióServeiMèdicType>(_PeticióServeiMèdic_QNAME, PeticióServeiMèdicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespostaServeiMèdicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServeis", name = "Resposta_Servei_M\u00e8dic")
    public JAXBElement<RespostaServeiMèdicType> createRespostaServeiMèdic(RespostaServeiMèdicType value) {
        return new JAXBElement<RespostaServeiMèdicType>(_RespostaServeiMèdic_QNAME, RespostaServeiMèdicType.class, null, value);
    }

}
