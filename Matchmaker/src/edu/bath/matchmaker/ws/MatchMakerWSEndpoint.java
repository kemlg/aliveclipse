package edu.bath.matchmaker.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * MatchMaker web service deployment and proxying utilities.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class MatchMakerWSEndpoint {

    private MatchMakerWSEndpoint() {
    }
    private static final QName serviceQName = new QName(MatchMakerWS.TARGET_NAMESPACE, MatchMakerWS.SERVICE_NAME);

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

}
