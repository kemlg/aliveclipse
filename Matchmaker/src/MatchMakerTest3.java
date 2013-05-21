
import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.*;
import edu.bath.matchmaker.ws.MatchMakerWS;
import edu.bath.matchmaker.ws.MatchMakerWS.MatchResult;
import edu.bath.matchmaker.ws.MatchMakerWSEndpoint;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import org.mindswap.owl.OWLOntology;

/**
 *
 * @author Jim
 */
public class MatchMakerTest3 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        MatchMaker mm = new MatchMaker();

//        OWLOntology onto = ServiceDescriptor.fromInputsOutputs(URI.create("myService"),
//                ImmutableMap.of(
//                    URI.create("input1"), URI.create("typeA")),
//                ImmutableMap.of(
//                    URI.create("output1"), URI.create("typeB"))).toOwls("").getOntology();
//
//        onto.lockForWrite();
//        onto.lockForWrite();
//
//        onto.write(System.out, null);
//        mm.registerService(onto);
//        
//        onto = ServiceDescriptor.fromInputsOutputs(URI.create("myService"),
//                ImmutableMap.of(
//                    URI.create("input2"), URI.create("typeD")),
//                ImmutableMap.of(
//                    URI.create("output2"), URI.create("typeC"))).toOwls("").getOntology();
//
//        System.out.println(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));

//        MutableSubsumption<URI> subs = (MutableSubsumption<URI>)mm.getSubsumption();
//        subs.addSubsumes(URI.create("typeA"), URI.create("typeB"));
//        //System.out.println(subs);
//
//        MatchMakerWS client = MatchMakerWSEndpoint.createClient("http://localhost:8080/MatchmakerWS/MatchMaker");
//        String owlsText = OwlsUtils.toString(onto, URI.create("http://baseURI/for/the/generated/rdfxml/string"));
//        System.out.println(owlsText);
//        client.registerService(owlsText);
//        System.out.println(client.performMatch(owlsText)[0].getService());
        
        OwlsUtils.mapURI(new URI("http://www.owl-ontologies.com/ECSDI.owl"), MatchMakerTest3.class.getResource("/ECSDIOntology.owl").toURI());

        OWLOntology onto = OwlsUtils.parseURI(MatchMakerTest3.class.getResource("/ECSDIOntology.owl").toURI());
        System.out.println(onto.getURI());
        onto = OwlsUtils.parseStream(new FileInputStream("/Users/sergio/Documents/Research/ecsdi/aliveclipse/ExampleOntology/ECSDIServices.owl"), null);
        mm.registerService(onto);
        
        onto = ServiceDescriptor.fromInputsOutputs(URI.create("myService"),
                ImmutableMap.of(
                    URI.create("input1"), URI.create("http://www.owl-ontologies.com/ECSDI.owl#MRI")).of(
                URI.create("input2"), URI.create("http://www.owl-ontologies.com/ECSDI.owl#Paciente")),
                ImmutableMap.of(
                    URI.create("output1"), URI.create("http://www.owl-ontologies.com/ECSDI.owl#Cita"))).toOwls("").getOntology();

        
        System.out.println(mm.match(onto, InputMatchers.EXACT, OutputMatchers.SUPERCLASSES));        
    }
}
