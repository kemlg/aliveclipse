package edu.bath.matchmaker.ws;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.sun.xml.ws.developer.Stateful;
import com.sun.xml.ws.developer.StatefulWebServiceManager;
import edu.bath.matchmaker.InputMatchers;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.OutputMatchers;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.ServiceDescriptor;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.Addressing;
import javax.xml.ws.wsaddressing.W3CEndpointReference;
import org.mindswap.owl.OWLOntology;

/**
 * MatchMaker web service definition for JAX-WS.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
@Stateful
@WebService(targetNamespace=MatchMakerWS.TARGET_NAMESPACE,
    serviceName=MatchMakerWS.SERVICE_NAME,
    portName=MatchMakerWS.PORT_NAME)
@Addressing
public class MatchMakerWSImpl implements MatchMakerWS {
    final MatchMaker delegate;
    private static StatefulWebServiceManager<MatchMakerWSImpl> manager;
    
    public static void setManager(StatefulWebServiceManager<MatchMakerWSImpl> manager) {
        MatchMakerWSImpl.manager = manager;
    }
    
    public static StatefulWebServiceManager<MatchMakerWSImpl> getManager() {
        return manager;
    }
    
    public void endSession() {
        manager.unexport(this);
    }
    
    public MatchMakerWSImpl() {
          this.delegate = new MatchMaker();
    }
    
    public MatchMakerWSImpl(MatchMaker delegate) {
        this.delegate = delegate;
    }

    private static final URI defaultBaseURI = URI.create(TARGET_NAMESPACE + "/default");

    @WebMethod
    public void registerService(@WebParam(name = "serviceOwls") String serviceOwls) {
         delegate.registerService(OwlsUtils.parseString(serviceOwls, defaultBaseURI)); //client should include a base URI
        System.out.println(delegate.getServices());
    }

    @WebMethod
    public void registerServiceByURL(@WebParam(name = "serviceOwls") String serviceOwlsURL) {
        try {
            delegate.registerService(OwlsUtils.parseURI(URI.create(serviceOwlsURL), defaultBaseURI)); //client should include a base URI
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    @WebMethod
    public MatchResult[] performMatch(@WebParam(name = "queryOwls") String queryOwls) {
//        Collection<Match> matches = delegate.match(OwlsUtils.parseString(queryOwls, defaultBaseURI),
//                InputMatchers.SUPERCLASSES, OutputMatchers.SUBCLASSES, Predicates.alwaysFalse());
        Collection<Match> matches = delegate.match(OwlsUtils.parseString(queryOwls, defaultBaseURI),
                InputMatchers.EXACT, OutputMatchers.EXACT, Predicates.alwaysTrue());
        return MatchResult.fromMatches(matches);
    }

    @WebMethod
    public MatchResult[] performSignatureMatch(
            @WebParam(name = "inputs") String[] inputTypes,
            @WebParam(name = "outputs") String[] outputTypes) {
        Collection<Match> matches = delegate.match(owlsFromSignature(inputTypes, outputTypes),
                InputMatchers.SUPERCLASSES, OutputMatchers.SUBCLASSES, Predicates.alwaysFalse());
        return MatchResult.fromMatches(matches);
    }

    private static final URI dummyServiceURI = URI.create("http://dummy/query");
    private static OWLOntology owlsFromSignature(String[] inputTypes, String[] outputTypes) {
        Map<URI, URI> inputs = createParams("in", inputTypes);
        Map<URI, URI> outputs = createParams("out", outputTypes);

        return ServiceDescriptor.fromInputsOutputs(dummyServiceURI, inputs, outputs).toOwls("").getOntology();
    }

    private static Map<URI, URI> createParams(String paramNamePrefix, String[] paramTypes) {
        ImmutableMap.Builder<URI, URI> builder = ImmutableMap.builder();
        int pos = 0;
        for (String type : paramTypes) {
            URI name = URI.create(paramNamePrefix + (pos++));
            builder.put(name, URI.create(type));
        }
        return builder.build();
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "startSession")
    public W3CEndpointReference startSession() {
        MatchMakerWSImpl session = new MatchMakerWSImpl();
        return MatchMakerWSImpl.getManager().export(session);
    }
}