package agents;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectListResult;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.RemoteWebServiceRepositoryCallback;

import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.Iterables;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.SimpleAdaptationBuilder;

/**
 * This class synchronizes the registered services of a {@link MatchMaker} using
 * the registered services of a {@link WebServiceRepository}.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class WebServiceRepositorySynchronizer {
	private final ObjectRepository repo;

	public static final String SERVICES_SECTION = "semanticservices";
	public static final String TEMPLATES_SECTION = "templates";
	public static final String ADAPTORS_SECTION = "adaptors";

	public static final DiscoverySearch DEFAULT_SERVICE_SEARCH = DiscoverySearch
			.search().inSection(SERVICES_SECTION);

	public static final DiscoverySearch DEFAULT_TEMPLATE_SEARCH = DiscoverySearch
			.search().inSection(TEMPLATES_SECTION);

	List<SyncListener> listeners = Collections
			.synchronizedList(new LinkedList<SyncListener>());

	DiscoverySearch serviceSearch;

	void notifyListners(URI uri) {
		for (SyncListener lst : listeners) {
			lst.serviceSynced(uri);
		}
	}

	public void addSyncListener(SyncListener sl) {
		listeners.add(sl);
	}

	public interface SyncListener {
		public void serviceSynced(URI uri);
	}

	/**
	 * We maintain here the adaptations that have been registered to a
	 * particular MatchMaker instance, so not to re-register these again.
	 */
	private final ConcurrentMap<MatchMaker, Set<URI>> knownAdaptationsPerMatchMaker = new MapMaker()
			.weakKeys().makeComputingMap(new Function<Object, Set<URI>>() {
				public Set<URI> apply(Object key) {
					return Collections.synchronizedSet(Sets.<URI> newHashSet());
				}
			});

	private final ConcurrentMap<MatchMaker, Set<PropertyAdaptation>> knownPropertyAdaptationsPerMatchMaker = new MapMaker()
			.weakKeys().makeComputingMap(
					new Function<Object, Set<PropertyAdaptation>>() {
						public Set<PropertyAdaptation> apply(Object key) {
							return Collections.synchronizedSet(Sets
									.<PropertyAdaptation> newHashSet());
						}
					});

	/**
	 * Creates a WebServiceRepositorySynchronizer using the supplied
	 * WebServiceRepository.
	 * 
	 * @param repo
	 *            the remote service repository
	 */
	public WebServiceRepositorySynchronizer(ObjectRepository repo) {

		this.repo = repo;
		serviceSearch = DEFAULT_SERVICE_SEARCH;
	}

	/**
	 * Returns the remote web service repository backing this object.
	 */
	public ObjectRepository getRepository() {
		return repo;
	}

	/**
	 * Returns whether this object managed to connect to the WS repository.
	 * 
	 * @return
	 */
	boolean isActive() {
		return repo != null;
	}

	/**
	 * Connects to the WebServiceRepository of this instance and registers all
	 * found services to the specified matchmaker.
	 * 
	 * @param mm
	 *            the matchmaker into which to register any found services
	 * @throws IOException
	 *             if a problem occurs when accessing a service
	 */
	public void pollAndRegister(MatchMaker mm) throws IOException {
		pollAndRegister(mm, DEFAULT_SERVICE_SEARCH, null);
	}

	public void pollAndRegister(MatchMaker mm, DiscoverySearch ds,
			WebServiceRepositorySynchronizer.SyncListener progress)
			throws IOException {
		pollServices(mm, ds, progress);
		pollAdaptations(mm, progress);
	}

	private void pollServices(MatchMaker mm, DiscoverySearch ds,
			WebServiceRepositorySynchronizer.SyncListener progress)
			throws IOException {
		ObjectListResult results = repo.search(ds);

		System.out.println("Got " + results.getObjects().size() + " results");

		Set<URI> alreadyRegistered = mm.getServices().keySet();
		for (ObjectDescriptor descr : results.getObjects()) {
			URI serviceURI = descr.getResourceURL();
			if (alreadyRegistered.contains(serviceURI)) {
				continue;
			}
			System.out.println("Attempting to register : " + serviceURI);
			try {
				mm.registerService(OwlsUtils.parseURI(serviceURI));
			} catch (IllegalArgumentException serviceAlreadyRegistered) {
				continue;
			} catch (Exception e) {
				System.out.println("Failed to register service " + serviceURI
						+ " with exception " + e);
				continue;
			}
			System.out.println("Registered service from the repository: "
					+ serviceURI);
			notifyListners(serviceURI);
			if (progress != null) {
				progress.serviceSynced(serviceURI);
			}
		}
	}

	public static class PropertyAdaptation {
		URI fromClass;
		URI toClass;
		URI viaProperty;

		URI source;
		double reliability = 1.0;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((fromClass == null) ? 0 : fromClass.hashCode());
			result = prime * result
					+ ((toClass == null) ? 0 : toClass.hashCode());
			result = prime * result
					+ ((viaProperty == null) ? 0 : viaProperty.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PropertyAdaptation other = (PropertyAdaptation) obj;
			if (fromClass == null) {
				if (other.fromClass != null)
					return false;
			} else if (!fromClass.equals(other.fromClass))
				return false;
			if (toClass == null) {
				if (other.toClass != null)
					return false;
			} else if (!toClass.equals(other.toClass))
				return false;
			if (viaProperty == null) {
				if (other.viaProperty != null)
					return false;
			} else if (!viaProperty.equals(other.viaProperty))
				return false;
			return true;
		}

	}

	public static Collection<PropertyAdaptation> parsePropertyAdaptationFile(
			Properties adaptor_properties, String baseURI) {
		Preconditions.checkNotNull(baseURI);
		Preconditions.checkNotNull(adaptor_properties);

		Map<URI, PropertyAdaptation> adaptations = Maps.newHashMap();

		for (Entry e : adaptor_properties.entrySet()) {
			Entry<String, String> te = (Entry<String, String>) e;
			String parts[] = te.getKey().split("\\.");
			String localName;
			String part;

			if (te.getValue() == null || te.getValue().isEmpty()) {
				System.err.println("Invalid property entry  entry  in adaptor"
						+ baseURI + te);
			}
			if (parts.length == 0) {
				continue;
			} else if (parts.length == 1) {
				localName = "";
				part = parts[0];
			} else if (parts.length == 2) {
				localName = "#" + parts[0];
				part = parts[1];
			} else {

				System.err.println("adaptation propertty " + te
						+ " has invalid syntax");
				continue;
			}
			URI adpURI = URI.create(baseURI + localName);
			PropertyAdaptation pa = adaptations.get(adpURI);

			if (pa == null) {
				adaptations.put(adpURI, pa = new PropertyAdaptation());
				pa.source = adpURI;
			}

			if (part.equals("reliability")) {
				pa.reliability = Double.parseDouble(te.getValue());
			} else {
				URI partURI = URI.create(te.getValue());
				if (part.equals("fromClass")) {
					pa.fromClass = partURI;
				} else if (part.equals("toClass")) {
					pa.toClass = partURI;
				} else if (part.equals("viaProperty")) {
					pa.viaProperty = partURI;
				} else {
					System.err.println("invalid property description" + te);
				}

			}

		}
		return Maps.filterValues(adaptations,
				new Predicate<PropertyAdaptation>() {
					@Override
					public boolean apply(PropertyAdaptation pa) {
						return pa.fromClass != null && pa.toClass != null
								&& pa.viaProperty != null;
					}
				}).values();
	}

	private void pollAdaptations(MatchMaker mm,
			WebServiceRepositorySynchronizer.SyncListener progress)
			throws IOException {
		ObjectListResult results = repo.listAll("adaptors");

		Set<URI> alreadyRegistered = knownAdaptationsPerMatchMaker.get(mm);

		for (final ObjectDescriptor descr : results.getObjects()) {
			URI adaptationURI = descr.getUri();

			if (descr.getMimeType().contains("rdf")) {
				if (alreadyRegistered.contains(adaptationURI)) {
					continue;
				}
				try {
					Supplier<Process> processSupplier = new Supplier<Process>() {
						public Process get() {
							try {
								OWLOntology onto = OwlsUtils.parseURI(descr
										.getResourceURL());
								List<Service> services = onto.getServices(true);
								if (services.size() != 1) {
									throw new RuntimeException(
											"Adaptation ontologies must contain exactly one service, "
													+ "services found in "
													+ descr.getResourceURL()
													+ ": " + services);
								}
								return Iterables.getOnlyElement(services)
										.getProcess();
							} catch (IOException e) {
								throw new RuntimeException(e);
							}
						}
					};
					Process process;
					try {
						process = processSupplier.get();
					} catch (RuntimeException e) {
						e.printStackTrace();
						continue;
					}
					if (process == null) {
						System.err
								.println("Adaptation without a process found: "
										+ adaptationURI);
						continue;
					}
					if (process.getInputs().size() != 1) {
						System.err.println("Adaptation " + adaptationURI
								+ " did not have a single input, but: "
								+ process.getInputs());
						continue;
					}
					if (process.getOutputs().size() != 1) {
						System.err.println("Adaptation " + adaptationURI
								+ " did not have a single output, but: "
								+ process.getOutputs());
						continue;
					}
					alreadyRegistered.add(adaptationURI);
					SimpleAdaptationBuilder.registerProcessAdaptation(mm,
							process.getInput().getParamType().getURI(), process
									.getOutput().getParamType().getURI(),
							processSupplier, 0.95);
				} catch (IllegalArgumentException serviceAlreadyRegistered) {
					continue;
				}
				System.out
						.println("Registered adaptation from the repository: "
								+ adaptationURI);
				notifyListners(adaptationURI);
				if (progress != null) {
					progress.serviceSynced(adaptationURI);
				}

			} else if (descr.getMimeType().equals("text/plain")) {
				// This is a property annotation description

				Set<PropertyAdaptation> knownPropertyAdaptations = knownPropertyAdaptationsPerMatchMaker
						.get(mm);
				try {
					Properties adaptorProperties = new Properties();
					adaptorProperties.load(descr.getResourceURL().toURL()
							.openStream());

					String baseURI = descr.getUri().toString();
					Collection<PropertyAdaptation> parsedAdaptations = parsePropertyAdaptationFile(
							adaptorProperties, baseURI);
					for (PropertyAdaptation pa : parsedAdaptations) {
						if (knownPropertyAdaptations.contains(pa)) {

							continue;

						} else {
							SimpleAdaptationBuilder.registerPropertyAdaptation(

							mm, pa.fromClass, pa.toClass, pa.viaProperty,
									pa.reliability);

							knownPropertyAdaptations.add(pa);
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
					System.err
							.println("failed to load adaptor properties from URL: "
									+ descr.getResourceURL() + "  : " + e);
				}
			}
		}
	}

	static WebServiceRepositorySynchronizer locateWebServiceRepository()
			throws IOException {
		Properties p = new Properties();
		p.load(MatchMakerAgent.class
				.getResourceAsStream("/matchmaker-agent.properties"));
		URL repoURL = new URL(p.getProperty("service-repository-ws"));
		WebServiceRepository repo = createClient(repoURL);
		WebServiceClientFactory repoFactory = new WebServiceClientFactory();
		repoFactory.setWsdlLocation(repoURL);
		AliveRepoManagerHook.setup();
		AliveRepoManagerHook
				.addLocatorCallback(new RemoteWebServiceRepositoryCallback(
						repoFactory));

		System.out.println("Will use service repository found at: " + repoURL);
		return new WebServiceRepositorySynchronizer(repo);
	}

	private static WebServiceRepository createClient(URL serviceLocation) {
		WebServiceClientFactory f = new WebServiceClientFactory();
		f.setWsdlLocation(serviceLocation);
		return f.createRepository();
	}
}
