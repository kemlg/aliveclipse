/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import javax.jws.WebService;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "EcografiaService", portName = "EcografiaPort", endpointInterface = "com.owl_ontologies.ecsdiservices.EcografiaPortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/EcoService/ECSDIServices.wsdl")
public class EcoService {

    public com.owl_ontologies.ecsdiservices.CitaType asignarCita(com.owl_ontologies.ecsdiservices.EcografiaType inputEcografia, java.lang.String inputPaciente2) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
