/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.util.FileManager;
import com.owl_ontologies.ecsdiservices.CentroMedicoType;
import java.io.InputStream;
import javax.jws.WebService;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "EcsdiService", portName = "EcsdiSoap", endpointInterface = "com.owl_ontologies.ecsdiservices.EcsdiSoap", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/ECSDIServices.wsdl")
public class NewWebServiceFromWSDL {

    public com.owl_ontologies.ecsdiservices.CentroMedicoType getOutputCentroMedico(java.lang.String inputNombreCiudad) {


        return new CentroMedicoType();
    }

    public static void main(String args[]) {
        NewWebServiceFromWSDL ws = new NewWebServiceFromWSDL();
        ws.readOwl();
    }

    private void readOwl() {
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        // use the FileManager to find the input file
        InputStream in = FileManager.get().open("ECSDIOntology.owl");
        if (in == null) {
            throw new IllegalArgumentException(
                    "File not found");
        }

        // read the RDF/XML file
        model.read(in, null);

        // write it to standard out
        model.write(System.out);

        String queryString = "PREFIX ecsdi:<http://www.owl-ontologies.com/ECSDI.owl>\n"
                + "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"
                + "SELECT ?indiv WHERE { ?indiv rdf:type ecsdi:Hospital  }";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query, model);
        ResultSet results = qexec.execSelect();
        // Output query results	
        ResultSetFormatter.out(System.out, results, query);
    }
}
