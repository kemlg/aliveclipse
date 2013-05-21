 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecografia;

import javax.jws.WebService;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "EcografiaService", portName = "EcografiaPort", endpointInterface = "de.dfki.dmas.axis.services.ecografia.EcografiaPortType", targetNamespace = "http://dmas.dfki.de/axis/services/Ecografia", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL_1/EcografiaService.wsdl")
public class EcografiaService {

    public de.dfki.dmas.axis.services.ecografia.CitaType asignarCita(java.lang.String inputEcografia, java.lang.String inputPaciente) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
