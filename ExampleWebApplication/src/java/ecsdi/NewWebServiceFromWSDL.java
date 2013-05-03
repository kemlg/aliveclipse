/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import javax.jws.WebService;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "EcsdiService", portName = "EcsdiSoap", endpointInterface = "com.owl_ontologies.ecsdiservices.EcsdiSoap", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/ECSDIServices.wsdl")
public class NewWebServiceFromWSDL {

    public com.owl_ontologies.ecsdiservices.CentroMedicoType getOutputCentroMedico(java.lang.String inputNombreCiudad) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
