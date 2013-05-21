/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mri;

import javax.jws.WebService;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "MriService", portName = "MriPort", endpointInterface = "de.dfki.dmas.axis.services.mri.MriPortType", targetNamespace = "http://dmas.dfki.de/axis/services/Mri", wsdlLocation = "WEB-INF/wsdl/MRIService/MRIService.wsdl")
public class MRIService {

    public de.dfki.dmas.axis.services.mri.CitaType asignarCita(java.lang.String inputMRI, java.lang.String inputPaciente) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
