package agents;

import edu.bath.matchmaker.MatchMaker;
import agents.ws.MatchMakerWSEndpoint;
import agents.ws.MatchMakerWSEndpoint.Proxy;

/**
 * Deploys locally the matchmaker as a web service (at port {@linkplain #DEFAULT_SERVICE_PORT})
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class MatchMakerService {
    private MatchMakerService() { }

    public static final int DEFAULT_SERVICE_PORT = 17962;

    public static void main(String[] args) {
        int port = DEFAULT_SERVICE_PORT;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Expected port argument (int) on which to deploy the matchmaker service");
                System.exit(-1);
            }
        }

        System.out.println("Deploying service at port: " + port);
        MatchMakerWSEndpoint.deploy(port, ReloadableMatchMaker.createSimple());
        System.out.println("Matchmaker service location: " + proxy.getServiceLocation());
        System.out.println("Matchmaker service wsdl location: " + proxy.getServiceWsdlLocation());
    }
    
    private static volatile Proxy proxy;

    /**
     * Returns a proxy the matchmaker service deployed to this JVM, or null the service is not deployed
     *
     * @return a proxy the matchmaker service deployed to this JVM, or null the service is not deployed
     */
    public static MatchMakerWSEndpoint.Proxy getGlobalProxy() {
        return proxy;
    }
}
