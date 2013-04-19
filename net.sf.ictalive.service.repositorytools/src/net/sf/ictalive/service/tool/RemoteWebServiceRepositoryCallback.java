package net.sf.ictalive.service.tool;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectNotFound;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.client.RepositoryFactory;

/**
 * Simple non-caching object fetcher
 * 
 * @author occ
 * 
 */
public class RemoteWebServiceRepositoryCallback implements AliveOntRepoCallback {

	RepositoryFactory remoteFactory;
	ObjectRepository remote;
	Logger log = LoggerFactory
			.getLogger(RemoteWebServiceRepositoryCallback.class);

	public RemoteWebServiceRepositoryCallback(RepositoryFactory remote) {
		assert (remote != null);
		this.remoteFactory = remote;
	}

	@Override
	public String getLocation(String uri) {
		log.debug("Resolving URI {} ", uri);
		try {

			if (remote == null) {
				log
						.debug(
								"Web service client does not exist, creating from factory {} ",
								remoteFactory);
				remote = remoteFactory.createRepository();
			}
			log.debug("Fetching resource {} from repo", uri);
			ObjectDescriptor od = remote.fetchObjectDescriptor(URI.create(uri));
			log.debug("Resolved {}  to URL {}", uri, od.getResourceURL());
			return od.getResourceURL().toString();
		} catch (Exception onf) {
			log.warn("Failed to fetch {} from repo with exception {} ", uri,
					onf);
			return null;
		}
	}
}
