package agents;

import agents.ws.MatchMakerWS;
import agents.ws.MatchMakerWS.MatchResult;
import agents.ws.MatchMakerWSEndpoint;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.ServiceDescriptor;
import edu.bath.matchmaker.SimpleAdaptationBuilder;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.client.ClientUtils;

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.vocabulary.OWL;
import org.mindswap.owl.vocabulary.RDFS;
import org.mindswap.owl.vocabulary.XSD;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

public class UsecaseTools {
	private static final ObjectRepository repo;

	private static final URI textToAudioURI = URI
			.create("http://tts.cj.usecases.istalive.eu/TTSWrapperServiceImpl#translateText");

	static {
		try {
			repo = WebServiceRepositorySynchronizer
					.locateWebServiceRepository().getRepository();
		} catch (IOException e) {
			throw new IOError(e);
		}
	}

	private static final URI textMessageURI = URI
			.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#TextMessage");
	private static final URI subscriptionURI = URI
			.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Subscription");

	public static void main(String[] args) {
		try {
			// unregisterAllAdaptations();
			// registerTextToAudioAdaptation();
			MatchMakerAgent agent = new MatchMakerAgent();
			// tryTextToAudioAdaptationThroughAPI(agent);
			// tryFunctionalAdaptationThroughWS(agent);
			OWLOntology cj = OWLFactory
					.createKB()
					.read(URI
							.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl"));
			OWLOntology tmt = OWLFactory
					.createKB()
					.read(URI
							.create("http://ict-alive.svn.sourceforge.net/viewvc/ict-alive/UseCases/TMT/trunk/Demo/Model/TMTOntology/TMT.owl"));
			registerFunctionalPropertiesAsAdaptations(cj, agent.getMatchMaker());
			registerFunctionalPropertiesAsAdaptations(tmt,
					agent.getMatchMaker());
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

	private static void tryTextToAudioAdaptationThroughAPI(MatchMakerAgent agent)
			throws IOException {
		ServiceDescriptor query = ServiceDescriptor.query(
				ImmutableSet.of(textMessageURI, subscriptionURI),
				ImmutableSet.<URI> of());

		Collection<Match> matches = agent.getMatchMaker().match(
				query.toOwls("").getOntology(), InputMatcher.SUPERCLASSES,
				OutputMatcher.SUBCLASSES);

		Match match = Iterables.find(matches, new Predicate<Match>() {
			final URI expected = URI
					.create("http://deliver.cj.usecases.istalive.eu/ESendexDeliverVoice#deliverMessage");

			public boolean apply(Match match) {
				return match.getService().getURI().equals(expected);
			}
		});

		Service matchedService = serviceForMatch(match);

		Process process = SimpleAdaptationBuilder.buildAdaptedProcess(match,
				matchedService, null);
		System.out.println(process);
	}

	private static void tryFunctionalAdaptationThroughWS(MatchMakerAgent agent)
			throws IOException {
		ServiceDescriptor fakeService = ServiceDescriptor
				.fromInputsOutputs(
						URI.create("http://fake"),
						ImmutableMap.of(
								URI.create("in"),
								URI.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Channel")),
						ImmutableMap.of(
								URI.create("out"),
								URI.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Participants")));
		try {
			agent.getMatchMaker().registerService(
					fakeService.toOwls("").getOntology());

			ServiceDescriptor query = ServiceDescriptor
					.query(ImmutableSet
							.of(URI.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Preference")),
							ImmutableSet.of(URI
									.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Context")));

			MatchMakerWS ws = MatchMakerWSEndpoint.createClient(agent.proxy
					.getServiceLocation());
			MatchResult[] results = ws.performMatch(
					OwlsUtils.toString(query.toOwls("").getOntology(), null),
					ServicePrefs.DEFAULT, 1);

			for (MatchResult result : results) {
				System.out.println("***");
				System.out.println(result.getService());
				System.out.println(result.getServiceInputs());
				System.out.println(result.getServiceOutputs());
				System.out.println(result.getServiceInputAdaptations());
				System.out.println(result.getQueryOutputAdaptations());
			}

		} finally {
			agent.getMatchMaker().deregisterService(fakeService.getURI());
		}
	}

	static void unregisterAllAdaptations() {
		for (ObjectDescriptor descr : repo.listAll("adaptors").getObjects()) {
			repo.removeObject(descr.getUri());
		}
	}

	static void registerTextToAudioAdaptation() {
		repo.storeObject(textToAudioURI, URI
				.create("http://why_do_I_have_to_type_this"), "adaptors", null,
				null, "text/xml",
				ClientUtils.encodeFromStream(UsecaseTools.class
						.getResourceAsStream("/example-services/TTS.owls")));

		// new DataHandler(new DataSource() {
		// public InputStream getInputStream() throws IOException {
		//
		// }
		//
		// public OutputStream getOutputStream() { throw new
		// UnsupportedOperationException(); }
		// public String getContentType() { return "text/xml"; }
		// public String getName() { return textToAudioURI.toString(); }
		// }));
	}

	static void printAdaptations() {
		for (ObjectDescriptor descr : repo.listAll("adaptors").getObjects()) {
			System.out.println(descr.getUri());
		}
	}

	static Service serviceForMatch(Match match) throws IOException {
		URI serviceURI = match.getService().getURI();
		URI ontoURI = null;
		try {
			ontoURI = new URI(serviceURI.getScheme(),
					serviceURI.getSchemeSpecificPart(), null);
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		URI location = repo.fetchObjectDescriptor(ontoURI).getResourceURL();
		return OwlsUtils.parseURI(location).getService(
				match.getService().getURI());
	}

	static void registerFunctionalPropertiesAsAdaptations(OWLOntology onto,
			MatchMaker mm) {
		System.out.println(onto.getURI());
		OWLObjectProperty domain = onto.createObjectProperty(RDFS.domain);
		OWLObjectProperty range = onto.createObjectProperty(RDFS.range);
		for (OWLIndividual fp : onto.getInstances(OWL.FunctionalProperty, true)) {
			for (OWLIndividual dom : fp.getProperties(domain)) {
				if (dom.isAnon())
					continue;
				for (OWLIndividual ran : fp.getProperties(range)) {
					if (ran.isAnon())
						continue;

					URI domainURI = dom.getURI();
					URI rangeURI = ran.getURI();

					if (domainURI.equals(rangeURI))
						continue;
					if (rangeURI.toString().startsWith(XSD.ns))
						continue;

					System.out.println(dom.getURI().getFragment() + " --> "
							+ ran.getURI().getFragment());
					SimpleAdaptationBuilder.registerPropertyAdaptation(mm,
							dom.getURI(), ran.getURI(), fp.getURI(), 0.95);
				}
			}
		}
	}
}
