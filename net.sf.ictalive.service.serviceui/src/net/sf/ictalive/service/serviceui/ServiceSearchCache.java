package net.sf.ictalive.service.serviceui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mindswap.owls.service.Service;

import net.sf.ictalive.service.discovery.query.DiscoverySearch;

/**
 * Wrapper for caching service lists
 * 
 * @author occ
 * 
 */
public class ServiceSearchCache {

	Map<DiscoverySearch, List<Service>> serviceCache = new HashMap<DiscoverySearch, List<Service>>();

	public List<Service> get(DiscoverySearch search) {
		return serviceCache.get(search);
	}

	public List<Service> put(DiscoverySearch search, List<Service> services) {
		return serviceCache.put(search, services);
	}

}
