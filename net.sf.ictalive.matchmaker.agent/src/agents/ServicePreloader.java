package agents;

import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.SimpleAdaptationBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.iids.aos.AsStartup;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;

import org.iids.aos.AsStartup;

class ServicePreloader {
	private static boolean preloadServices;

	static void preloadServices(MatchMaker mm) throws Exception {
		LoaderHelper loader = new LoaderHelper();

		// loader.loadResource("/example-services/ContextService.owls");
		// loader.loadResource("/example-services/DeliverEmail.owls");
		// loader.loadResource("/example-services/DeliverVoice.owls");
		// loader.loadResource("/example-services/PreferencesService.owls");
		// loader.loadResource("/example-services/CalculateAppropriateChannelService.owls");
		// loader.loadResource("/example-services/CalculatePossibleService.owls");
		// loader.loadResource("/example-services/SubscriptionsService.owls");
		// loader.loadResource("/example-services/TTS.owls");
		//
		// loader.loadResource("/example-services/TMTContentAdaptorService.owl");
		// loader.loadResource("/example-services/TMTEnvironmentalContextService.owl");
		// loader.loadResource("/example-services/TMTFoodContentService.owl");
		// loader.loadResource("/example-services/TMTInteractionTaskManagerService.owl");
		// loader.loadResource("/example-services/TMTInterfaceService_getPetitions.owl");
		// loader.loadResource("/example-services/TMTInterfaceService_getTime.owl");
		// loader.loadResource("/example-services/TMTInterfaceService_getUserLocation.owl");
		// loader.loadResource("/example-services/TMTInterfaceService_showContent.owl");
		// loader.loadResource("/example-services/TMTLegalInfoManagerService.owl");
		// loader.loadResource("/example-services/TMTMovieCinemaContentService.owl");
		// loader.loadResource("/example-services/TMTNightContentService.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getIsFoodTime.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getIsNightTime.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getUserAge.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getUserFoodPreferences.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getUserMovieCinemaPreferences.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getUserNightPreferences.owl");
		// loader.loadResource("/example-services/TMTUserModellerService_getUserRequirements.owl");

		if (preloadServices) {
			String exampleServiceLocation = AsStartup.getTopDir() + "/"
					+ "input/example-services/";
			File exampleServiceFolder = new File(exampleServiceLocation);
			String[] services = exampleServiceFolder.list();
			if (services != null) {
				for (int i = 0; i < services.length; i++) {
					String serviceName = services[i];
					loader.loadResource(serviceName);
				}
			}
		}

		loader.registerInto(mm);

		SimpleAdaptationBuilder
				.registerPropertyAdaptation(
						mm,
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Message"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Participants"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#initiator"),
						0.99);
		SimpleAdaptationBuilder
				.registerPropertyAdaptation(
						mm,
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#SuccessfullyDeliveredMessage"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Channel"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#viaChannel"),
						0.99);
		SimpleAdaptationBuilder
				.registerPropertyAdaptation(
						mm,
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Preference"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Channel"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#hasChannel"),
						0.99);
		SimpleAdaptationBuilder
				.registerPropertyAdaptation(
						mm,
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Message"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Participants"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#recipient"),
						0.99);
		SimpleAdaptationBuilder
				.registerPropertyAdaptation(
						mm,
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Participants"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Context"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#context"),
						0.99);
		SimpleAdaptationBuilder
				.registerPropertyAdaptation(
						mm,
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Preference"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Context"),
						URI
								.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#hasContext"),
						0.99);
	}

	private static class LoaderHelper {
		private final OWLKnowledgeBase owlKB = OWLFactory.createKB();

		void loadResource(String resource) throws IOException {
			owlKB.readService(MatchMakerAgent.class
					.getResourceAsStream(resource), URI.create(resource));
		}

		void registerInto(MatchMaker mm) {
			for (OWLOntology onto : owlKB.getOntologies(false)) {
				if (!onto.getServices(true).isEmpty()) {
					mm.registerService(onto);
				}
			}
		}
	}
}
