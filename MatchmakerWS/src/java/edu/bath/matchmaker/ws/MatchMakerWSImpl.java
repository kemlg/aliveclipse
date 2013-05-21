package edu.bath.matchmaker.ws;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.mindswap.owl.OWLOntology;

/**
 * MatchMaker web service definition for JAX-WS.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
@WebService(targetNamespace=MatchMakerWS.TARGET_NAMESPACE,
    serviceName=MatchMakerWS.SERVICE_NAME,
    portName=MatchMakerWS.PORT_NAME)
public class MatchMakerWSImpl implements MatchMakerWS {
    static MatchMaker delegate = new MatchMaker();
    private static int count = 0;
    
    public MatchMakerWSImpl() {
    }

    public MatchMakerWSImpl(MatchMaker delegate) {
        MatchMakerWSImpl.delegate = delegate;
    }

    private static final URI defaultBaseURI = URI.create(TARGET_NAMESPACE + "/default");

    @WebMethod
    @Override
    public void registerService(@WebParam(name = "serviceOwls") String serviceOwls) {
         delegate.registerService(OwlsUtils.parseString(serviceOwls, defaultBaseURI)); //client should include a base URI
        System.out.println(delegate.getServices());
    }

    @WebMethod
    @Override
    public void registerServiceByURL(@WebParam(name = "serviceOwls") String serviceOwlsURL) {
        try {
            delegate.registerService(OwlsUtils.parseURI(URI.create(serviceOwlsURL), defaultBaseURI)); //client should include a base URI
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    @WebMethod
    @Override
    public MatchResult[] performMatch(@WebParam(name = "queryOwls") String queryOwls) {
//        Collection<Match> matches = delegate.match(OwlsUtils.parseString(queryOwls, defaultBaseURI),
//                InputMatchers.SUPERCLASSES, OutputMatchers.SUBCLASSES, Predicates.alwaysFalse());
        Collection<Match> matches = delegate.match(OwlsUtils.parseString(queryOwls, defaultBaseURI),
                InputMatchers.EXACT, OutputMatchers.EXACT, Predicates.alwaysTrue());
        return MatchResult.fromMatches(matches);
    }

    @WebMethod
    @Override
    public MatchResult[] performMatchByURL(@WebParam(name = "queryOwls") String queryOwls) {
        try {
                    Collection<Match> matches = delegate.match(OwlsUtils.parseURI(URI.create(queryOwls), defaultBaseURI),
                            InputMatchers.SUPERCLASSES, OutputMatchers.SUBCLASSES, Predicates.alwaysFalse());
            //        Collection<Match> matches = delegate.match(OwlsUtils.parseURI(URI.create(queryOwls), defaultBaseURI),
            //                InputMatchers.EXACT, OutputMatchers.EXACT, Predicates.alwaysTrue());
                    return MatchResult.fromMatches(matches);
        } catch (IOException ex) {
            Logger.getLogger(MatchMakerWSImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    @WebMethod
    @Override
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

    @Override
    public void mapDomainOntology(String newURI, String ontologyURI) {
        try {
            OwlsUtils.mapURI(new URI(newURI), new URI(ontologyURI));
        } catch (URISyntaxException ex) {
            Logger.getLogger(MatchMakerWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
