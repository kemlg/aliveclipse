package net.sf.ictalive.svcrepo;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;

/**
 * very simple dummy interface to service repository
 * 
 * @author occ
 * 
 */
public interface OntologyRepository {
	/**
	 * Returns all known services
	 * 
	 * @return
	 */
	public Collection<OWLOntology> getAllOntologies();

	/**
	 * Returns all known services async version
	 * 
	 */
	public void getAllOntologies(HandlerCallBack<OWLOntology> resultHandler);

	/**
	 * Fetches a service with a given URI
	 * 
	 * @param serviceURI
	 *            the URI of the service to fetch
	 * @return the service in question, or null if the service was not found
	 */
	public OWLOntology getOWLOntologyFromURI(URI serviceURI);

	/**
	 * Performs a search on the services in the repository according to some
	 * criterias
	 * 
	 * @param srch
	 *            A search object specifying the criteria
	 * @return the collection of searched services
	 * @throws IllegalArgumentException
	 *             if the search type is not supported by this repository
	 */

	public void registerOWLOntologyRepositoryListener(
			RepositoryListener<OWLOntology> listener);

	public void unRegisterOWLOntologyRepositoryListener(
			RepositoryListener<OWLOntology> listener);
}
