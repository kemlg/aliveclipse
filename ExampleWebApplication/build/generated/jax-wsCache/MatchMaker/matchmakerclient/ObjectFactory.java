
package matchmakerclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the matchmakerclient package. 
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

    private final static QName _RegisterServiceByURL_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "registerServiceByURL");
    private final static QName _PerformMatch_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "performMatch");
    private final static QName _PerformSignatureMatch_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "performSignatureMatch");
    private final static QName _PerformMatchByURL_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "performMatchByURL");
    private final static QName _PerformMatchResponse_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "performMatchResponse");
    private final static QName _RegisterService_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "registerService");
    private final static QName _RegisterServiceByURLResponse_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "registerServiceByURLResponse");
    private final static QName _MapDomainOntologyResponse_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "mapDomainOntologyResponse");
    private final static QName _PerformMatchByURLResponse_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "performMatchByURLResponse");
    private final static QName _RegisterServiceResponse_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "registerServiceResponse");
    private final static QName _MapDomainOntology_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "mapDomainOntology");
    private final static QName _PerformSignatureMatchResponse_QNAME = new QName("http://www.cs.bath.ac.uk/alive", "performSignatureMatchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: matchmakerclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerformMatch }
     * 
     */
    public PerformMatch createPerformMatch() {
        return new PerformMatch();
    }

    /**
     * Create an instance of {@link RegisterServiceByURL }
     * 
     */
    public RegisterServiceByURL createRegisterServiceByURL() {
        return new RegisterServiceByURL();
    }

    /**
     * Create an instance of {@link PerformMatchResponse }
     * 
     */
    public PerformMatchResponse createPerformMatchResponse() {
        return new PerformMatchResponse();
    }

    /**
     * Create an instance of {@link PerformMatchByURL }
     * 
     */
    public PerformMatchByURL createPerformMatchByURL() {
        return new PerformMatchByURL();
    }

    /**
     * Create an instance of {@link RegisterService }
     * 
     */
    public RegisterService createRegisterService() {
        return new RegisterService();
    }

    /**
     * Create an instance of {@link PerformSignatureMatch }
     * 
     */
    public PerformSignatureMatch createPerformSignatureMatch() {
        return new PerformSignatureMatch();
    }

    /**
     * Create an instance of {@link MapDomainOntologyResponse }
     * 
     */
    public MapDomainOntologyResponse createMapDomainOntologyResponse() {
        return new MapDomainOntologyResponse();
    }

    /**
     * Create an instance of {@link RegisterServiceByURLResponse }
     * 
     */
    public RegisterServiceByURLResponse createRegisterServiceByURLResponse() {
        return new RegisterServiceByURLResponse();
    }

    /**
     * Create an instance of {@link PerformSignatureMatchResponse }
     * 
     */
    public PerformSignatureMatchResponse createPerformSignatureMatchResponse() {
        return new PerformSignatureMatchResponse();
    }

    /**
     * Create an instance of {@link MapDomainOntology }
     * 
     */
    public MapDomainOntology createMapDomainOntology() {
        return new MapDomainOntology();
    }

    /**
     * Create an instance of {@link RegisterServiceResponse }
     * 
     */
    public RegisterServiceResponse createRegisterServiceResponse() {
        return new RegisterServiceResponse();
    }

    /**
     * Create an instance of {@link PerformMatchByURLResponse }
     * 
     */
    public PerformMatchByURLResponse createPerformMatchByURLResponse() {
        return new PerformMatchByURLResponse();
    }

    /**
     * Create an instance of {@link MatchResult }
     * 
     */
    public MatchResult createMatchResult() {
        return new MatchResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterServiceByURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "registerServiceByURL")
    public JAXBElement<RegisterServiceByURL> createRegisterServiceByURL(RegisterServiceByURL value) {
        return new JAXBElement<RegisterServiceByURL>(_RegisterServiceByURL_QNAME, RegisterServiceByURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "performMatch")
    public JAXBElement<PerformMatch> createPerformMatch(PerformMatch value) {
        return new JAXBElement<PerformMatch>(_PerformMatch_QNAME, PerformMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformSignatureMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "performSignatureMatch")
    public JAXBElement<PerformSignatureMatch> createPerformSignatureMatch(PerformSignatureMatch value) {
        return new JAXBElement<PerformSignatureMatch>(_PerformSignatureMatch_QNAME, PerformSignatureMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformMatchByURL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "performMatchByURL")
    public JAXBElement<PerformMatchByURL> createPerformMatchByURL(PerformMatchByURL value) {
        return new JAXBElement<PerformMatchByURL>(_PerformMatchByURL_QNAME, PerformMatchByURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformMatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "performMatchResponse")
    public JAXBElement<PerformMatchResponse> createPerformMatchResponse(PerformMatchResponse value) {
        return new JAXBElement<PerformMatchResponse>(_PerformMatchResponse_QNAME, PerformMatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "registerService")
    public JAXBElement<RegisterService> createRegisterService(RegisterService value) {
        return new JAXBElement<RegisterService>(_RegisterService_QNAME, RegisterService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterServiceByURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "registerServiceByURLResponse")
    public JAXBElement<RegisterServiceByURLResponse> createRegisterServiceByURLResponse(RegisterServiceByURLResponse value) {
        return new JAXBElement<RegisterServiceByURLResponse>(_RegisterServiceByURLResponse_QNAME, RegisterServiceByURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDomainOntologyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "mapDomainOntologyResponse")
    public JAXBElement<MapDomainOntologyResponse> createMapDomainOntologyResponse(MapDomainOntologyResponse value) {
        return new JAXBElement<MapDomainOntologyResponse>(_MapDomainOntologyResponse_QNAME, MapDomainOntologyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformMatchByURLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "performMatchByURLResponse")
    public JAXBElement<PerformMatchByURLResponse> createPerformMatchByURLResponse(PerformMatchByURLResponse value) {
        return new JAXBElement<PerformMatchByURLResponse>(_PerformMatchByURLResponse_QNAME, PerformMatchByURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "registerServiceResponse")
    public JAXBElement<RegisterServiceResponse> createRegisterServiceResponse(RegisterServiceResponse value) {
        return new JAXBElement<RegisterServiceResponse>(_RegisterServiceResponse_QNAME, RegisterServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDomainOntology }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "mapDomainOntology")
    public JAXBElement<MapDomainOntology> createMapDomainOntology(MapDomainOntology value) {
        return new JAXBElement<MapDomainOntology>(_MapDomainOntology_QNAME, MapDomainOntology.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformSignatureMatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cs.bath.ac.uk/alive", name = "performSignatureMatchResponse")
    public JAXBElement<PerformSignatureMatchResponse> createPerformSignatureMatchResponse(PerformSignatureMatchResponse value) {
        return new JAXBElement<PerformSignatureMatchResponse>(_PerformSignatureMatchResponse_QNAME, PerformSignatureMatchResponse.class, null, value);
    }

}
