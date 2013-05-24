
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

    private final static QName _Paciente_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Paciente");
    private final static QName _Cita_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Cita");
    private final static QName _Ecografia_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Ecografia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owl_ontologies.ecsdiservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EcografiaType }
     * 
     */
    public EcografiaType createEcografiaType() {
        return new EcografiaType();
    }

    /**
     * Create an instance of {@link CitaType }
     * 
     */
    public CitaType createCitaType() {
        return new CitaType();
    }

    /**
     * Create an instance of {@link Imagen }
     * 
     */
    public Imagen createImagen() {
        return new Imagen();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Paciente")
    public JAXBElement<String> createPaciente(String value) {
        return new JAXBElement<String>(_Paciente_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Cita")
    public JAXBElement<CitaType> createCita(CitaType value) {
        return new JAXBElement<CitaType>(_Cita_QNAME, CitaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EcografiaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Ecografia")
    public JAXBElement<EcografiaType> createEcografia(EcografiaType value) {
        return new JAXBElement<EcografiaType>(_Ecografia_QNAME, EcografiaType.class, null, value);
    }

}
