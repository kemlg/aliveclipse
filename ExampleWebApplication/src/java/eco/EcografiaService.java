/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import com.owl_ontologies.ecsdiservices.CitaType;
import com.owl_ontologies.ecsdiservices.EcografiaType;
import com.owl_ontologies.ecsdiservices.Imagen;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "EcografiaService", portName = "EcografiaPort", endpointInterface = "com.owl_ontologies.ecsdiservices.EcografiaPortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/ECSDIServices.wsdl")
public class EcografiaService {

    public com.owl_ontologies.ecsdiservices.EcografiaType asignarCita(com.owl_ontologies.ecsdiservices.EcografiaType inputEcografia, java.lang.String inputPaciente2) throws DatatypeConfigurationException {
        EcografiaType et;
        XMLGregorianCalendar xgc;
        GregorianCalendar gc;
        Imagen imagen;
        
        gc = new GregorianCalendar();
        xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        
        imagen = new Imagen();
        imagen.setIDPrueba("testImagen");
        
        et = new EcografiaType();
        et.setEcoBool(true);
        et.setEcoDate(xgc);
        et.setEcoDateTime(xgc);
        et.setEcoFloat((float)1.1111);
        et.setEcoInt(1);
        et.setEcoString("test");
        et.setEcoTime(xgc);
        et.setIDPrueba("test2");
        et.setSubPrueba(imagen);
        
        return et;
    }
    
}
