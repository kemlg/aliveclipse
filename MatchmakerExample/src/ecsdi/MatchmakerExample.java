/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.*;
import edu.bath.matchmaker.ws.MatchMakerWS;
import edu.bath.matchmaker.ws.MatchMakerWSEndpoint;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import org.mindswap.owl.OWLOntology;

/**
 *
 * @author sergio
 */
public class MatchmakerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MatchMaker mm = new MatchMaker();
//
//        OWLOntology onto = ServiceDescriptor.fromInputsOutputs(URI.create("myService"),
//                ImmutableMap.of(
//                    URI.create("input1"), URI.create("typeA")),
//                ImmutableMap.of(
//                    URI.create("output1"), URI.create("typeB"))).toOwls("").getOntology();
//
//        onto.lockForWrite();
//        onto.lockForWrite();
//
//        onto.write(System.out);
//        mm.registerService(onto);
//
//        System.out.println(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));
//
//        MutableSubsumption<URI> subs = (MutableSubsumption<URI>)mm.getSubsumption();
//        subs.addSubsumes(URI.create("typeA"), URI.create("typeB"));
//        //System.out.println(subs);
//
//        MatchMakerWS client = MatchMakerWSEndpoint.createClient("http://localhost:8080/MatchmakerWS/MatchMaker");
//        String owlsText = OwlsUtils.toString(onto, URI.create("http://baseURI/for/the/generated/rdfxml/string"));
//        System.out.println(owlsText);
//        client.registerService(owlsText);
//        System.out.println(client.performMatch(owlsText)[0].getService());
        
        OWLOntology onto = OwlsUtils.parseStream(new FileInputStream("src/ECSDIOntology.owl"), null);
        onto = OwlsUtils.parseStream(new FileInputStream("src/ECSDIServices.owl"), null);
//        mm.registerService(onto);
    }
}
