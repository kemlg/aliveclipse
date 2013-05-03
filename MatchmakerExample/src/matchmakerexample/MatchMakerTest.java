package matchmakerexample;

import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.ServiceDescriptor;
import edu.bath.matchmaker.ws.MatchMakerWS;
import edu.bath.matchmaker.ws.MatchMakerWSEndpoint;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import javax.xml.ws.soap.AddressingFeature;
import org.mindswap.owl.OWLOntology;

public class MatchMakerTest {

    public static void main(String[] args) throws IOException {
        MatchMakerWS ws = MatchMakerWSEndpoint.createClient("http://localhost:8080/AliveMatchmaker/MatchMaker");
        
        System.out.println(ws.startSession());
        System.out.println(ws.startSession());
        System.out.println(ws.startSession());
        System.out.println(ws.startSession());
        System.out.println(ws.startSession());
        String onto;
        onto = toString("lala2");
        ws.registerService(onto);
        onto = toString("lala3");
        ws.registerService(onto);
        onto = toString("lala4");
        ws.registerService(onto);
        onto = toString("lala5");
        ws.registerService(onto);
        onto = toString("lala6");
        ws.registerService(onto);
        onto = toString("lala7");
        ws.registerService(onto);
        onto = toString("lala8");
        ws.registerService(onto);
        // System.out.println(onto);
        System.out.println("End of test.");
        System.out.println(ws.performMatch(onto).length);
        //System.out.println(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));
    }
    
        private static String toString(String serviceName) {
        OWLOntology onto = ServiceDescriptor.fromInputsOutputs(
                URI.create(serviceName),
                ImmutableMap.of(URI.create("input1"), URI.create("typeA")),
                ImmutableMap.of(URI.create("output1"), URI.create("typeB")))
                .toOwls("").getOntology();
        StringWriter sw = new StringWriter();
        onto.write(sw);
        return sw.toString();
    }
}
