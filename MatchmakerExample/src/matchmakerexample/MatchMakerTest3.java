package matchmakerexample;


import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.ServiceDescriptor;
import edu.bath.matchmaker.ws.MatchMakerWS;
import edu.bath.matchmaker.ws.MatchMakerWS.MatchResult;
import edu.bath.matchmaker.ws.MatchMakerWSEndpoint;
import java.io.StringWriter;
import java.net.URI;
import org.mindswap.owl.OWLOntology;

/**
 *
 * @author Jim
 */
public class MatchMakerTest3 {
    public static void main(String[] args) {
        MatchMakerWS ws = MatchMakerWSEndpoint.createClient("http://localhost:8080/AliveMatchmaker/MatchMaker");
        registerService("myService3", ws);

        //System.out.println(toString("test"));

        for (MatchResult result : ws.performMatch(toString("test"))) {
            System.out.println("Result: " + result.getService());
        }
    }

    private static void registerService(String serviceName, MatchMakerWS ws) {
        ws.registerService(toString(serviceName));
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
