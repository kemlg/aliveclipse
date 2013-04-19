package agents;

import java.io.File;
import java.io.IOException;
import org.iids.aos.agent.Agent;
import org.iids.aos.systemservices.communicator.structs.AgentHandle;
import org.iids.aos.messagecenter.Envelope;
import org.iids.aos.exception.AgentScapeException;

import agents.Message.*;
import agents.qos.QoSRemoteSynchonizer;
import agents.ws.MatchMakerWSEndpoint;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.Preferences;
import edu.bath.matchmaker.ServiceDescriptor;
import edu.bath.matchmaker.SimpleAdaptationBuilder;
import java.io.StringWriter;
import java.net.URI;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.process.Process;

/**
 * The matchmaker agent.
 * 
 * <p>
 * This agent registers its primary handle to the {@linkplain #AGENT_KEY} key
 * with the lookup service. It then enters an infinite loop responding to
 * messages (of type {@link Message}) to be sent to it.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 * @author A Chorley
 * 
 */
public class MatchMakerAgent extends Agent {
	private static final long serialVersionUID = 0L;

	public static final String AGENT_KEY = "matchMakerAgent";

	private final QualityOfServiceAggregator qosAggregator = new QualityOfServiceAggregator();
	QoSRemoteSynchonizer qosSynchronizer;
	private volatile MatchMaker mm = createMatchMaker();
	private final ReloadableMatchMaker reloadableMatchMaker = new ReloadableMatchMaker() {
		@Override
		public MatchMaker getMatchMaker() {
			return mm;
		}

		@Override
		public void reload() {
			mm = createMatchMaker();
			pollServices();
		}
	};

	private final ScheduledExecutorService threadPool = Executors
			.newScheduledThreadPool(2, new ThreadFactory() {
				public Thread newThread(Runnable r) {
					Thread t = new Thread(r);
					t.setName(MatchMakerAgent.class.getName() + "#Worker");
					t.setDaemon(true);
					return t;
				}
			});

	private final SessionManager sessionManager = new SessionManager();

	private final EventManager eventManager = new EventManager(threadPool,
			getPrimaryHandle() != null ? getPrimaryHandle().getHandle()
					: "MatchMakerAgent");

	private final WebServiceRepositorySynchronizer wsRepoSynchronizer;

	public final MatchMakerWSEndpoint.Proxy proxy;
	{
		MatchMakerWSEndpoint.Proxy tmpProxy = null;
		try {
			tmpProxy = MatchMakerWSEndpoint.deploy(
					MatchMakerService.DEFAULT_SERVICE_PORT,
					reloadableMatchMaker);
			System.out.println("Deployed matchmaker service on port "
					+ tmpProxy.getServiceLocation());
		} catch (Exception e) {
			System.err
					.println("Failed to deploy matchmaker service, probably running in Java version earlier than 1.6.0_14. Exception: "
							+ e.getMessage());
			throw new RuntimeException(e);
		} finally {
			proxy = tmpProxy;
		}
	}

	public MatchMakerAgent() throws IOException {
		wsRepoSynchronizer = WebServiceRepositorySynchronizer
				.locateWebServiceRepository();
		tryPreloadServices();
		if (wsRepoSynchronizer.isActive()) {
			pollServices();
			tryStartPolling();
		}
	}

	private void setupQosData() {
		Properties p = new Properties();
		try {
			p.load(MatchMakerAgent.class
					.getResourceAsStream("/matchmaker-agent.properties"));
		} catch (IOException e) {
			System.err
					.println("cannot load properties - not setting up QoS Sync");
			return;
		}

		String qosFile = (String) p.get("qos-file");
		if (qosFile == null) {
			System.err.println("no QoS file specified not synching");
			return;
		}

		File f = new File(qosFile);
		if ((f.exists() && !f.canWrite())) {
			System.err.println("QoS file is not writable - no way forward");
			return;
		}

		QoSRemoteSynchonizer syncer = new QoSRemoteSynchonizer(f);

		int period;

		try {
			period = Integer.parseInt(p.getProperty("qos-period", "30000"));
		} catch (NumberFormatException e) {
			System.err
					.println("qos sync period not parsable, setting it to 30 seconds");
			period = 30000;
		}

		if (f.exists()) {
			try {
				syncer.initializeMap(qosAggregator.getMap());
			} catch (Exception e) {
				System.err.println("Unable to read " + f.toString() + " : " + e
						+ " continuing none the less");
			}
		}

		syncer.startSynchronizer(qosAggregator.getMap(), period);
		qosSynchronizer = syncer;

	}

	private void tryPreloadServices() {
		try {
			MatchMaker mm = this.mm;
			ServicePreloader.preloadServices(mm);
			System.out.println("Preloaded services: ("
					+ mm.getServices().size() + ") "
					+ mm.getServices().values());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void tryStartPolling() {
		threadPool.scheduleWithFixedDelay(new Runnable() {
			public void run() {
				pollServices();
			}
		}, 120, 120, TimeUnit.SECONDS);
	}

	private void pollServices() {
		try {
			wsRepoSynchronizer.pollAndRegister(mm);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public MatchMaker getMatchMaker() {
		return mm;
	}

	private MatchMaker createMatchMaker() {
		return new MatchMaker(QualityOfServicePreferences
				.createMatchDecorator(qosAggregator),
				new Preferences.ParamExactnessDecorator());
	}

	public void run() {
		qosAggregator.startQoSEventProcessing(eventManager, threadPool, 100,
				TimeUnit.MILLISECONDS);
		setupQosData();
		// Publish the agent's primary handle. This is used for the CL agent to
		// find the matchmaker
		try {
			register(getPrimaryHandle(), AGENT_KEY);
		} catch (AgentScapeException ex) {
			ex.printStackTrace();
		}

		while (true) {
			try {
				// keep waiting for messages to arrive
				Envelope envelope = receiveMessage(true);

				// spurious wake-ups are apparently allowed
				if (envelope != null) {
					handleEnvelope(envelope);
				}
			} catch (AgentScapeException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void handleEnvelope(Envelope envReceived)
			throws AgentScapeException {
		if (envReceived == null) {
			return;
		}

		AgentHandle otherAgent = envReceived.getFromHandle();
		Object data = envReceived.getData();
		if (!(data instanceof Message)) {
			System.err.println("Message received of the wrong type: " + data);
			return;
		}
		Message receivedMessage = (Message) data;

		sendMessage(new Envelope(otherAgent, getPrimaryHandle(),
				handle(receivedMessage)));
	}

	@Override
	public void cleanUp() {
		shutdown();
	}

	private Message handle(Message msg) {
		if (msg instanceof Message.ServiceQuery) {
			return handleQuery((Message.ServiceQuery) msg);
		} else if (msg instanceof Message.SessionDone) {
			return handleDone((Message.SessionDone) msg);
		} else if (msg instanceof Message.MoreResultsQuery) {
			return handleMoreResults((Message.MoreResultsQuery) msg);
		} else {
			throw new AssertionError("Unexpected message: " + msg);
		}
	}

	private Message handleQuery(ServiceQuery serviceQuery) {
		String sessionId = sessionManager.addSession(serviceQuery);

		return handleQuery(serviceQuery, sessionId);
	}

	private Message handleDone(SessionDone sessionDone) {
		sessionManager.removeSession(sessionDone.sessionId);
		return null;
	}

	private Message handleMoreResults(MoreResultsQuery moreResultsQuery) {
		ServiceQuery query = sessionManager
				.lookupSession(moreResultsQuery.sessionID);
		if (query == null) {
			return Message.SessionTimeout.INSTANCE;
		}
		return handleQuery(query, moreResultsQuery.sessionID);
	}

	private Message handleQuery(ServiceQuery query, String sessionId) {

		OWLOntology queryOnto = owlsFromSignature(query.inputTypes
				.toArray(new String[0]), query.outputTypes
				.toArray(new String[0]));
		eventManager.publishQueryEvent(query, queryOnto);

		// actual invocation, ordered by preferences
		List<Match> matches = ServicePrefs.DEFAULT.getPreference().sortedCopy(
				mm.match(queryOnto, InputMatcher.SUPERCLASSES,
						OutputMatcher.SUBCLASSES));

		// translating results
		List<URI> matchedURIs = Lists.newArrayList();
		for (Match match : matches) {
			matchedURIs.add(match.getService().getURI());
		}

		eventManager.publishResponseEvent(matches);

		switch (query.queryType) {
		case NORMAL:
			return new Message.ServiceResponse(sessionId, matchedURIs);
		case ADAPTED:
			return constructAdaptedServices(sessionId, matches);
		default:
			throw new AssertionError();
		}
	}

	private Message.AdaptedServiceResponse constructAdaptedServices(
			String sessionId, List<Match> matches) {
		List<Message.AdaptedServiceResponse.AdaptedService> adaptedServices = Lists
				.newArrayList();
		for (Match match : matches) {
			URI serviceURI = match.getService().getURI();
			try {
				OWLOntology onto = OwlsUtils.parseURI(serviceURI);
				Service service = onto.getService(serviceURI);
				if (service == null) {
					System.err.println("Could not find service " + serviceURI
							+ ", using this URI these were " + "found only: "
							+ onto.getServices(true));
					continue;
				}
				Process process = SimpleAdaptationBuilder.buildAdaptedProcess(
						match, service, null);
				service.setProcess(process);
				StringWriter sw = new StringWriter(512);
				onto.write(sw, serviceURI);
				adaptedServices
						.add(new Message.AdaptedServiceResponse.AdaptedService(
								serviceURI, sw.toString()));
			} catch (Exception e) {
				System.err.println("Could not adapt service: " + serviceURI
						+ ", reason: " + e.getMessage());
			}
		}
		return new Message.AdaptedServiceResponse(sessionId, adaptedServices);
	}

	private static OWLOntology owlsFromSignature(String[] inputTypes,
			String[] outputTypes) {
		return ServiceDescriptor.query(toURIs(inputTypes), toURIs(outputTypes))
				.toOwls("").getOntology();
	}

	private static Set<URI> toURIs(String[] paramTypes) {
		Set<URI> uris = Sets.newHashSetWithExpectedSize(paramTypes.length);
		for (String paramType : paramTypes) {
			uris.add(URI.create(paramType));
		}
		return uris;
	}

	public void shutdown() {
		if (proxy != null) {
			proxy.getEndpoint().stop();
		}
		threadPool.shutdown();
	}

	public static void main(String[] args) throws IOException {
		new MatchMakerAgent();
	}
}