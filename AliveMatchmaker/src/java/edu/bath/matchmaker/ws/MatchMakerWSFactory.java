/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bath.matchmaker.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.wsaddressing.W3CEndpointReference;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "MatchMakerWSFactory")
public class MatchMakerWSFactory {
    static String TARGET_NAMESPACE = "http://www.cs.bath.ac.uk/alive";
    static String SERVICE_NAME = "MatchMakerFactory";
    static String PORT_NAME = "MatchMakerFactoryPort";

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "startSession")
    public W3CEndpointReference startSession() {
        MatchMakerWSImpl session = new MatchMakerWSImpl();
        return MatchMakerWSImpl.getManager().export(session);
    }
}
