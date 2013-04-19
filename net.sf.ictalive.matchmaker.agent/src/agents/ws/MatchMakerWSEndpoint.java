package agents.ws;

import agents.ReloadableMatchMaker;
import edu.bath.matchmaker.MatchMaker;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

/**
 * MatchMaker web service deployment and proxying utilities.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class MatchMakerWSEndpoint {
    private MatchMakerWSEndpoint() { }

    private static final QName serviceQName = new QName(MatchMakerWS.TARGET_NAMESPACE, MatchMakerWS.SERVICE_NAME);

    /**
     * Deploys the MatchMaker service locally on the given port, and returns a proxy to it.
     *
     * @param port the port that the MatchMaker service to listen to
     * @param reloadableMatchMaker a proxy to the underlying {@link MatchMaker} instance on which the service will be implemented
     * @return a proxy to the deployed service
     */
    public static Proxy deploy(int port, ReloadableMatchMaker reloadableMatchMaker) {
        MatchMakerWSImpl serviceImpl = new MatchMakerWSImpl(reloadableMatchMaker);
        String location = "http://localhost:" + port + "/" + MatchMakerWS.SERVICE_NAME;
        Endpoint endpoint = Endpoint.publish(location, serviceImpl);

        try {
            return new Proxy(endpoint, serviceImpl, location, port);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a client for a matchmaker service deployed at the specified location.
     *
     * @param serviceLocation the location where the matchmaker service is deployed
     * @return a client for the matchmaker service
     */
    public static MatchMakerWS createClient(String serviceLocation) {
        try {
            return createClient(new URL(serviceLocation));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a client for a matchmaker service deployed at the specified location.
     *
     * @param serviceLocation the location where the matchmaker service is deployed
     * @return a client for the matchmaker service
     */
    public static MatchMakerWS createClient(URL serviceLocation) {
        Service service = Service.create(serviceLocation, serviceQName);
        return service.getPort(new QName(MatchMakerWS.TARGET_NAMESPACE, MatchMakerWS.PORT_NAME), MatchMakerWS.class);
    }

    /**
     * A proxy to a deployed MatchMaker service.
     */
    public static class Proxy {

        private final Endpoint endpoint;
        private final MatchMakerWSImpl matchMaker;
        private final String serviceLocation;
        private final int port;

        Proxy(Endpoint endpoint, MatchMakerWSImpl matchMaker, String serviceLocation, int port) {
            this.endpoint = endpoint;
            this.matchMaker = matchMaker;
            this.serviceLocation = serviceLocation;
            this.port = port;
        }

        /**
         * Returns the service endpoint.
         *
         * @return the service endpoint
         */
        public Endpoint getEndpoint() {
            return endpoint;
        }

        /**
         * Returns the web interface to the (local) service.
         *
         * @return the web interface to the service
         */
        public MatchMakerWS getMatchMakerWS() {
            return matchMaker;
        }

        /**
         * Returns a reference to the component backing the local matchmaker service.
         *
         * @return a reference to the component backing the local matchmaker service
         */
        public MatchMaker getMatchMaker() {
            return matchMaker.getMatchMaker();
        }

        /**
         * Returns the URL of the service.
         *
         * @return the URL of the service
         */
        public String getServiceLocation() {
            return serviceLocation;
        }

        /**
         * Returns the port of the service.
         *
         * @return the port of the service
         */
        public int getPort() {
            return port;
        }

        /**
         * Returns the location of the WSDL document of the service.
         *
         * @return the location of the WSDL document of the service
         */
        public String getServiceWsdlLocation() {
            return serviceLocation + "?wsdl";
        }
    }
}
