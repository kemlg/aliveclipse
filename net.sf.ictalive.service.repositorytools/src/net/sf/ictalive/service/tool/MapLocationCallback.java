/**
 * 
 */
package net.sf.ictalive.service.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.hp.hpl.jena.util.Locator;
import com.hp.hpl.jena.util.TypedStream;

public class MapLocationCallback implements Locator {
	Map<URI, File> fileRepositoryLocations = new HashMap<URI, File>();

	/**
	 * Adds a repository location to the local map based on the URI of the
	 * ontology.
	 * 
	 * When ontologies are loaded via this OWLReader (including imports) the
	 * locations stored in the map are consulted and where necessary, local
	 * files are used.
	 * 
	 * @param uri
	 *            The URI of the ontology to add
	 * @param file
	 *            The File location of the ontology to use
	 */
	public void addFileRepositoryLocation(URI uri, File file) {
		fileRepositoryLocations.put(uri, file);
	}

	@Override
	public String getName() {
		return "ALIVE Map locator";
	}

	@Override
	public TypedStream open(String filenameOrURI) {
		URI ontology = URI.create(filenameOrURI);

		if (fileRepositoryLocations.containsKey(ontology)) {
			try {
				return new TypedStream(new FileInputStream(
						fileRepositoryLocations.get(ontology)));
			} catch (IOException ioe) {
				throw new RuntimeException(ioe);
			}
		}
		return null;
	}
}