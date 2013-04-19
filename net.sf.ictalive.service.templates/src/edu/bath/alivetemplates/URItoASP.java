package edu.bath.alivetemplates;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

class URItoASP {
	Logger log = LoggerFactory.getLogger(URItoASP.class);
	
	private BiMap<String, URI> lookupMap = HashBiMap.create();
		
	/**
	 * Hashes a URI and adds it to the map
	 * @param key
	 * @param uri
	 */
	public String put(URI u) {
		return put(u, null);
	}
	
	/**
	 * Stores a pair against a specified key.
	 * @param pair
	 * @param key
	 * @return
	 */
	public String put(URI u, String key) {
		if(key == null) {
			if((key = getKeyFromURI(u)) != null)
				return key;
			
			// NOTE: Could just use the size as the hash, but it'll be easier to debug if we can see 
			// something resembling a URI
			key = u.toString().replaceAll("(?![A-Za-z_]).", "_").replaceAll("___*", "_")
				+lookupMap.size();
			key = key.substring(0, 1).toLowerCase() + key.substring(1);
		}
		lookupMap.put(key, u);
		return key;
	}
	
	/**
	 * Finds the key for a particular URI.
	 * @param u
	 * @return
	 */
	public String getKeyFromURI(URI u) {
		return lookupMap.inverse().get(u);
	}
	
	/**
	 * Returns a URI from a key.
	 * @param key
	 * @return
	 */
	public URI get(String key) {
		return lookupMap.get(key);
	}
}
