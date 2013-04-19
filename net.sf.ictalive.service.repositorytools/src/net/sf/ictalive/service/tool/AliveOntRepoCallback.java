package net.sf.ictalive.service.tool;

import java.net.URI;

public interface AliveOntRepoCallback {

	
	/**
	 * returns a fileManager location (e.g file URI or cp URI) for a given public URI, 
	 * 
	 * returns nul if none is specified
	 * @param uri
	 * @return
	 */
	String getLocation(String uri);
}
