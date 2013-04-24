
import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.MutableSubsumption;
import edu.bath.matchmaker.ServiceDescriptor;
import java.io.StringWriter;
import java.net.URI;
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

//        onto.write(System.out);
        mm.registerService(onto);

//        System.out.println(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));

        MutableSubsumption<URI> subs = (MutableSubsumption<URI>)mm.getSubsumption();
        subs.addSubsumes(URI.create("typeA"), URI.create("typeB"));
//        System.out.println(subs);

    }

}
