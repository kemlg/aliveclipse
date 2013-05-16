
import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.*;
import edu.bath.matchmaker.ws.MatchMakerWS;
import edu.bath.matchmaker.ws.MatchMakerWSImpl;
import edu.bath.matchmaker.ws.client.MatchMakerWSFactory;
import edu.bath.matchmaker.ws.client.MatchMakerWSFactory_Service;
import java.net.URI;
import javax.xml.ws.Service;
import javax.xml.ws.wsaddressing.W3CEndpointReference;
import org.mindswap.owl.OWLOntology;

public class MatchMakerTest {
    public static void main(String[] args) {
        MatchMaker mm = new MatchMaker();

        OWLOntology onto = ServiceDescriptor.fromInputsOutputs(URI.create("myService"),
                ImmutableMap.of(
                    URI.create("input1"), URI.create("typeA")),
                ImmutableMap.of(
                    URI.create("output1"), URI.create("typeB"))).toOwls("").getOntology();

        onto.lockForWrite();
        onto.lockForWrite();

        onto.write(System.out);
        mm.registerService(onto);

        System.out.println(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));

        MutableSubsumption<URI> subs = (MutableSubsumption<URI>)mm.getSubsumption();
        subs.addSubsumes(URI.create("typeA"), URI.create("typeB"));
        //System.out.println(subs);

        MatchMakerWSFactory_Service factory = new MatchMakerWSFactory_Service();
        MatchMakerWSFactory f = factory.getMatchMakerWSFactoryPort();
        W3CEndpointReference session = f.startSession();
        edu.bath.matchmaker.ws.endpointclient.MatchMaker service = new edu.bath.matchmaker.ws.endpointclient.MatchMaker();
        edu.bath.matchmaker.ws.endpointclient.MatchMakerWSImpl client = service.getPort(session, edu.bath.matchmaker.ws.endpointclient.MatchMakerWSImpl.class);
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
        System.out.println(client.giveCount());
    }

}
