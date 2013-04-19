package net.sf.ictalive.svcrepo;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import net.sf.ictalive.service.discovery.query.DiscoverySearch;

import org.mindswap.owls.service.Service;

/**
 * very simple dummy interface to service repository
 * 
 * @author occ
 * 
 */
public interface ServiceRepository {
	/**
	 * Returns all known services
	 * 
	 * @return
	 */
	public Collection<Service> getAllServices();

	/**
	 * Returns all known services
	 * 
	 * @return
	 */
	public Collection<URI> getAllServiceURIs();

	/**
	 * Returns all known services async version
	 * 
	 */
	public void getAllServices(HandlerCallBack<Service> resultHandler);

	/**
	 * Fetches a service with a given URI
	 * 
	 * @param serviceURI
	 *            the URI of the service to fetch
	 * @return the service in question, or null if the service was not found
	 */
	public Service getServiceFromURI(URI serviceURI);

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
	public Collection<Service> searchServices(DiscoverySearch srch);

	public void searchServices(DiscoverySearch srch,
			HandlerCallBack<Service> resultHandler);

	public void registerServiceRepositoryListener(RepositoryListener listener);

	public void unRegisterServiceRepositoryListener(RepositoryListener listener);
}
