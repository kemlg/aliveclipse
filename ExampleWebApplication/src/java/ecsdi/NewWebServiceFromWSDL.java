/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.util.FileManager;
import com.owl_ontologies.ecsdiservices.CentroMedicoDATA;
import com.owl_ontologies.ecsdiservices.CentroMedicoType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import javax.jws.WebService;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "EcsdiService", portName = "EcsdiSoap", endpointInterface = "com.owl_ontologies.ecsdiservices.EcsdiSoap", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/ECSDIServices.wsdl")
public class NewWebServiceFromWSDL {

    public com.owl_ontologies.ecsdiservices.CentroMedicoType getOutputCentroMedico(java.lang.String inputNombreCiudad) {
        return getCentros(inputNombreCiudad).iterator().next();
    }
    
    private void printSubClasses() {
        // create an empty model
        Model model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MICRO_RULE_INF);
        //Model model = ModelFactory.createDefaultModel();

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

        String queryString = "PREFIX ecsdi:<http://www.owl-ontologies.com/ECSDI.owl#>\n"
                + "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"
                + "SELECT ?indiv WHERE { ?indiv rdfs:subClassOf ecsdi:CentroMedico  }";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query, model);
        ResultSet results = qexec.execSelect();
        // Output query results	
        ResultSetFormatter.out(System.out, results, query);
    }

    private void printCentros() {
        // create an empty model
        Model model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MICRO_RULE_INF);
        //Model model = ModelFactory.createDefaultModel();

        // use the FileManager to find the input file
        InputStream in = FileManager.get().open("ECSDIOntology.owl");
        if (in == null) {
            throw new IllegalArgumentException(
                    "File not found");
        }

        // read the RDF/XML file
        model.read(in, null);

        String queryString = "PREFIX ecsdi:<http://www.owl-ontologies.com/ECSDI.owl#>\n"
                + "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"
                + "SELECT ?indiv WHERE { ?indiv rdf:type ecsdi:CentroMedico  }";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query, model);
        ResultSet results = qexec.execSelect();
        // Output query results	
        ResultSetFormatter.out(System.out, results, query);

        qexec = QueryExecutionFactory.create(query, model);
        results = qexec.execSelect();
        QuerySolution result = results.next();
        Resource resource = result.getResource("indiv");
        System.out.println(resource.listProperties());
    }

    private void printProperties() {
        // create an empty model
        Model model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MICRO_RULE_INF);
        //Model model = ModelFactory.createDefaultModel();

        // use the FileManager to find the input file
        InputStream in = FileManager.get().open("ECSDIOntology.owl");
        if (in == null) {
            throw new IllegalArgumentException(
                    "File not found");
        }

        // read the RDF/XML file
        model.read(in, null);

        String queryString = "PREFIX ecsdi:<http://www.owl-ontologies.com/ECSDI.owl#>\n"
                + "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"
                + "SELECT ?indiv WHERE { ?indiv rdf:type ecsdi:CentroMedico  }";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query, model);
        ResultSet results = qexec.execSelect();
        QuerySolution result = results.next();
        Resource resource = result.getResource("indiv");
        System.out.println(resource);
        StmtIterator it = resource.listProperties();
        while (it.hasNext()) {
            Statement statement = it.next();
            System.out.println(statement);
        }
    }

    private Collection<CentroMedicoType> getCentros(String queryPoblacion) {
        // create an empty model
        Model model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MICRO_RULE_INF);
        //Model model = ModelFactory.createDefaultModel();

        // use the FileManager to find the input file
        InputStream in = FileManager.get().open("ECSDIOntology.owl");
        if (in == null) {
            throw new IllegalArgumentException(
                    "File not found");
        }

        // read the RDF/XML file
        model.read(in, null);

        String queryString = "PREFIX ecsdi:<http://www.owl-ontologies.com/ECSDI.owl#>\n"
                + "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"
                + "SELECT ?indiv WHERE { ?indiv rdf:type ecsdi:CentroMedico.\n"
                + "                      ?indiv ecsdi:Poblacion \"" + queryPoblacion + "\"}";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query, model);
        ResultSet results = qexec.execSelect();
        Collection<CentroMedicoType> centros = new ArrayList<CentroMedicoType>();
        while(results.hasNext()) {
            CentroMedicoType cm = new CentroMedicoType();
            QuerySolution result = results.next();
            Resource resource = result.getResource("indiv");
            cm.setNombre(resource.getProperty(model.getProperty("http://www.owl-ontologies.com/ECSDI.owl#Nombre")).getString());
            cm.setIDCentroMedico(resource.getProperty(model.getProperty("http://www.owl-ontologies.com/ECSDI.owl#IDCentroMedico")).getString());
            cm.setPoblacion(resource.getProperty(model.getProperty("http://www.owl-ontologies.com/ECSDI.owl#Poblacion")).getString());
            centros.add(cm);
        }
        
        return centros;
    }

    public static void main(String args[]) {
        NewWebServiceFromWSDL service = new NewWebServiceFromWSDL();
        service.printSubClasses();
        service.printCentros();
        service.printProperties();
        System.out.println(service.getCentros("Barcelona").iterator().next().getNombre());
    }
}
