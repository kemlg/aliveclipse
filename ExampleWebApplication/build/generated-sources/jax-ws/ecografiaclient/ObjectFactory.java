
package ecografiaclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ecografiaclient package. 
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

    private final static QName _Ecografia_QNAME = new QName("http://dmas.dfki.de/axis/services/Ecografia", "Ecografia");
    private final static QName _Paciente_QNAME = new QName("http://dmas.dfki.de/axis/services/Ecografia", "Paciente");
    private final static QName _Cita_QNAME = new QName("http://dmas.dfki.de/axis/services/Ecografia", "Cita");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ecografiaclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CitaType }
     * 
     */
    public CitaType createCitaType() {
        return new CitaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmas.dfki.de/axis/services/Ecografia", name = "Ecografia")
    public JAXBElement<String> createEcografia(String value) {
        return new JAXBElement<String>(_Ecografia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmas.dfki.de/axis/services/Ecografia", name = "Paciente")
    public JAXBElement<String> createPaciente(String value) {
        return new JAXBElement<String>(_Paciente_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmas.dfki.de/axis/services/Ecografia", name = "Cita")
    public JAXBElement<CitaType> createCita(CitaType value) {
        return new JAXBElement<CitaType>(_Cita_QNAME, CitaType.class, null, value);
    }

}
