package net.sf.ictalive.svcrepo;

import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectListResult;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.ObjectNotFound;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;

import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@link ServiceRepository} implementation which preferentially retrieves
 * objects from the service repository
 * 
 * @author occ
 * 
 */
public class RemoteWebserviceRepository extends RepositoryBase implements
		ServiceRepository, OntologyRepository {

	Logger log = LoggerFactory.getLogger(getClass());
	static final String SERVICE_SECTION = "semanticservices";

	DiscoverySearch serviceSearch = DiscoverySearch.search().inSection(
			SERVICE_SECTION);
	static final String ONTOLOGY_SECTION = "ontologies";

	static class CachedObject {
		long fetched = System.currentTimeMillis();
		ObjectDescriptor obj;

		public CachedObject(ObjectDescriptor obj) {
			this.obj = obj;
		}

		public long getFetched() {
			return fetched;
		}

		public void setFetched(long fetched) {
			this.fetched = fetched;
		}

		public ObjectDescriptor getObj() {
			return obj;
		}

		public void setObj(ObjectDescriptor obj) {
			this.obj = obj;
		}
	}

	long cacheMillis = 60000;
	Map<URI, CachedObject> objectCache = new HashMap<URI, CachedObject>();

	ObjectRepository webServiceRepository;
	private boolean ignoreSerivceLoadErrors;

	public RemoteWebserviceRepository(ObjectRepository repo,
			DiscoverySearch serviceSearch, OWLKnowledgeBase kb) {
		this(repo, kb);

		if (serviceSearch != null) {
			this.serviceSearch = serviceSearch;
		}
	}

	public RemoteWebserviceRepository(ObjectRepository repo, OWLKnowledgeBase kb) {
		super(kb);
		this.webServiceRepository = repo;

	}

	/**
	 * Returns a (possibly cached) object descriptor from the repository
	 * 
	 * caches the result
	 * 
	 * @param uri
	 * @return
	 */
	public ObjectDescriptor getObjectDescriptorFromURI(URI uri) {
		assert (uri != null);
		CachedObject co = objectCache.get(uri);
		log.debug("getting object descriptor {} ", uri);
		ObjectDescriptor od;
		if (co == null) {
			log.debug("object descriptor {} not in cache,  fetching from repo",
					uri);

			try {
				od = webServiceRepository.fetchObjectDescriptor(uri);
				co = new CachedObject(od);
				objectCache.put(uri, co);
				log.debug("Object {}  retrieved from repo", uri);

			} catch (ObjectNotFound e) {
				log.error("unable to find object {}", uri);
				return null;
			}
		} else {
			log.debug("Cached object descriptor {} found", uri);

			od = co.getObj();
		}
		return od;
	}

	/**
	 * Naively removes a local part from the service description to give what we
	 * hope is an ontology URI
	 */
	public static URI serviceURItoOntologyURI(URI svcURI) {
		return URIUtils.standardURI(svcURI);

	}

	@Override
	public Service getServiceFromURI(URI serviceURI) {
		log.debug("Retreiving service {}", serviceURI);
		Service svc = super.getServiceFromURI(serviceURI);
		if (svc != null) {
			log.debug("service {} is already in KB, returning that version",
					serviceURI);
			return svc;

		}
		URI repoURI = serviceURItoOntologyURI(serviceURI);

		ObjectDescriptor od = getObjectDescriptorFromURI(repoURI);
		log.debug("found cached ontology object descriptor {} for service {} ",
				repoURI, serviceURI);
		try {
			OWLOntology owlo = getOwlKB().read(
					od.getResourceURL().toURL().openStream(), repoURI);

			log.debug("Successfully opened ontology {} ", repoURI);
			svc = owlo.getService(serviceURI);
			if (svc == null) {
				log.error("Unable to find service {} in ontology {}",
						serviceURI, repoURI);
			}
			return svc; // maybe return null here if no service
		} catch (IOException e) {
			log.error("Failed to load ontlogy {}  from repository ", repoURI);
			return null;
		}
	}

	@Override
	public void getAllServices(HandlerCallBack<Service> resultHandler) {
		ObjectListResult result = webServiceRepository.search(serviceSearch);
		mapServices(result.getObjects(), resultHandler);
	}

	/**
	 * Translates an object Description into a service, optionally uses the
	 * cache where possible
	 * 
	 * @param od
	 * @return
	 */
	List<Service> mapService(ObjectDescriptor od) {
		assert (od != null);
		List<Service> services = new LinkedList<Service>();

		OWLOntology svcOnt = owlKB.getOntology(od.getUri());
		if (svcOnt == null) {

			log.debug("(re-)reading services from {} ", od.getUri(), od
					.getResourceURL());

			try {
				svcOnt = owlKB.read(od.getResourceURL().toURL().openStream(),
						od.getUri());
			} catch (Exception e) {
				log.error("Failed to read services from {} : {} ", od, e);
				throw new RepositoryException("Failed to load services from "
						+ od, e);
			}

		}
		return svcOnt.getServices(true);
	}

	public void clearCache() {
		objectCache.clear();
	}

	void mapServices(Collection<ObjectDescriptor> ods,
			HandlerCallBack<Service> cb) {
		for (ObjectDescriptor od : ods) {
			List<Service> services;

			try {
				services = mapService(od);
				if (services.size() > 0) {
					cb.gotResults(services, true);
				}
			} catch (RepositoryException e) {
				if (!ignoreSerivceLoadErrors) {
					throw e;
				} else {
					log.debug("error loading service {} : {}", od.getUri(), e);
				}
			}

		}
	}

	OWLOntology mapOntology(ObjectDescriptor od) {
		assert (od != null);
		OWLOntology ontology = owlKB.getOntology(od.getUri());
		if (ontology == null) {
			log.debug("(re-)reading service {} from {} ", od.getUri(), od
					.getResourceURL());
			try {
				ontology = owlKB.read(od.getResourceURL().toURL().openStream(),
						od.getUri());
			} catch (Exception e) {
				throw new RepositoryException("Failed to read ontology from "
						+ od, e);
			}
		}
		return ontology;

	}

	@Override
	public OWLOntology getOWLOntologyFromURI(URI ontURI) {
		OWLOntology owlo = super.getOWLOntologyFromURI(ontURI);
		if (owlo != null)
			return owlo;
		try {
			ObjectDescriptor od = webServiceRepository
					.fetchObjectDescriptor(ontURI);

			return mapOntology(od);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void getAllOntologies(HandlerCallBack<OWLOntology> resultHandler) {

		ObjectListResult result = webServiceRepository
				.listAll(ONTOLOGY_SECTION);
		for (ObjectDescriptor od : result.getObjects()) {
			OWLOntology ont = mapOntology(od);
			if (ont != null) {
				resultHandler.gotResults(Collections.singletonList(ont), true);
			}
		}

	}

	public Collection<URI> getAllServiceURIs() {
		ObjectListResult result = webServiceRepository.listAll(SERVICE_SECTION);
		List<URI> urilist = new LinkedList<URI>();
		for (ObjectDescriptor od : result.getObjects())
			urilist.add(od.getUri());
		return urilist;
	};

	@Override
	public Collection<Service> searchServices(DiscoverySearch srch) {
		final List<Service> services = new LinkedList<Service>();
		searchServices(srch, cbMap(services));
		return services;
	}

	@Override
	public void searchServices(DiscoverySearch srch,
			HandlerCallBack<Service> resultHandler) {
		try {
			mapServices(webServiceRepository.search(srch).getObjects(),
					resultHandler);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

}
