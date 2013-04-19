package net.sf.ictalive.svcrepo;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.service.tool.AliveOntRepoCallback;

import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class RepositoryBase implements OntologyRepository,
		ServiceRepository {
	Logger log = LoggerFactory.getLogger(StaticFileSystemServiceRepo.class);
	boolean useLocalImportReader = true;
	protected OWLKnowledgeBase owlKB;
	protected Set<RepositoryListener> listeners = new HashSet<RepositoryListener>();

	public RepositoryBase() {
		// TODO Auto-generated constructor stub
	}

	public RepositoryBase(OWLKnowledgeBase owlKB) {
		this.owlKB = owlKB;
	}

	/**
	 * 
	 * 
	 * Should ontology imports be resolved from the local directory if they
	 * exist there, uses
	 * 
	 * @return
	 */
	public boolean isUseLocalImportReader() {
		return useLocalImportReader;
	}

	public void setUseLocalImportReader(boolean useLocalImportReader) {
		this.useLocalImportReader = useLocalImportReader;
	}

	public OWLKnowledgeBase getOwlKB() {
		return owlKB;
	}

	public void setOwlKB(OWLKnowledgeBase owlKB) {
		this.owlKB = owlKB;

	}

	@Override
	final public Collection<Service> getAllServices() {
		List<Service> services = new LinkedList<Service>();
		getAllServices(cbMap(services));
		return services;
	}

	@Override
	public void getAllServices(HandlerCallBack<Service> resultHandler) {
		resultHandler.gotResults(owlKB.getServices(false), false);
	}

	@Override
	public Service getServiceFromURI(URI serviceURI) {
		return owlKB.getService(serviceURI);
	}

	@Override
	public void registerServiceRepositoryListener(RepositoryListener listener) {
		listeners.add(listener);
	}

	@Override
	public void unRegisterServiceRepositoryListener(RepositoryListener listener) {
		listeners.remove(listener);
	}

	@Override
	public final Collection<OWLOntology> getAllOntologies() {
		List<OWLOntology> ontologies = new LinkedList<OWLOntology>();
		getAllOntologies(cbMap(ontologies));
		return ontologies;
	}

	@Override
	public void getAllOntologies(HandlerCallBack<OWLOntology> resultHandler) {
		resultHandler.gotResults(owlKB.getOntologies(false), false);
	}

	@Override
	public OWLOntology getOWLOntologyFromURI(URI ontURI) {
		if (owlKB == null)
			return null;
		return owlKB.getOntology(ontURI);
	}

	@Override
	public void registerOWLOntologyRepositoryListener(
			RepositoryListener<OWLOntology> listener) {
		listeners.add(listener);

	}

	@Override
	public void unRegisterOWLOntologyRepositoryListener(
			RepositoryListener<OWLOntology> listener) {
		listeners.remove(listener);

	}

	protected <T> HandlerCallBack<T> cbMap(final Collection<T> outcol) {
		return new HandlerCallBack<T>() {
			@Override
			public void gotResults(Collection<T> results, boolean hasMore) {
				outcol.addAll(results);
			}
		};
	}

}
