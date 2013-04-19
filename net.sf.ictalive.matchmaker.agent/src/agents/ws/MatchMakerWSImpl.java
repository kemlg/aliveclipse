package agents.ws;

import agents.ReloadableMatchMaker;
import agents.ServicePrefs;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.OwlsUtils;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * MatchMaker web service definition for JAX-WS.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
@WebService(targetNamespace=MatchMakerWS.TARGET_NAMESPACE,
    serviceName=MatchMakerWS.SERVICE_NAME,
    portName=MatchMakerWS.PORT_NAME)
public class MatchMakerWSImpl implements MatchMakerWS {
    private final ReloadableMatchMaker delegate;
    
    public MatchMakerWSImpl(ReloadableMatchMaker delegate) {
        this.delegate = Preconditions.checkNotNull(delegate);
    }

    private static final URI defaultBaseURI = URI.create(TARGET_NAMESPACE + "/default");

    @WebMethod
    public void registerService(@WebParam(name = "serviceOwls") String serviceOwls) {
        getMatchMaker().registerService(OwlsUtils.parseString(serviceOwls, defaultBaseURI)); //client should include a base URI
    }

    @WebMethod
    public void registerServiceByURL(@WebParam(name = "serviceOwlsURL") String serviceOwlsURL) {
        try {
            getMatchMaker().registerService(OwlsUtils.parseURI(URI.create(serviceOwlsURL), defaultBaseURI)); //client should include a base URI
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    @WebMethod
    public MatchResult[] performMatch(
            @WebParam(name = "queryOwls") String queryOwls,
            @WebParam(name = "preference") ServicePrefs preference,
            @WebParam(name = "maxResults") Integer maxResults) {
        Collection<Match> matches = delegate.getMatchMaker().match(OwlsUtils.parseString(queryOwls, defaultBaseURI),
                InputMatcher.SUPERCLASSES, OutputMatcher.SUBCLASSES, Predicates.alwaysTrue());
        if (preference != null) {
            if (maxResults == null) maxResults = Integer.MAX_VALUE;
            List<List<Match>> results = preference.getPreference().topElements(matches, maxResults);
            matches = Lists.newArrayList(Iterables.concat(results));
        }
        return MatchResult.fromMatches(matches);
    }


    @WebMethod
    public void reload() {
        delegate.reload();
    }

    public MatchMaker getMatchMaker() {
        return delegate.getMatchMaker();
    }
}
