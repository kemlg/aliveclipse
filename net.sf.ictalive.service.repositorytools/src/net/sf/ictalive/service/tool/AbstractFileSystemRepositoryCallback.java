package net.sf.ictalive.service.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.util.Locator;
import com.hp.hpl.jena.util.TypedStream;

/**
 * Callback for the custom {@link RepositoryOWLReaderImpl}
 * 
 * Given an ontology (with an HTTP uri) it checks a given set of directories
 * (returned by {@link #getServiceDirectories()} for the existance of a file
 * which matches the suffix of the ontology.
 * 
 * This class is abstract, a concrete version exists in
 * {@link FileSystemRepositoryCallbackImpl}
 * 
 * @author occ
 * 
 */
public abstract class AbstractFileSystemRepositoryCallback implements
		AliveOntRepoCallback {
	Logger log = Logger.getLogger(AbstractFileSystemRepositoryCallback.class);

	public abstract File[] getServiceDirectories();

	
	@Override
	public String getLocation(String filenameOrURI) {
		URI ontology;
		try {
			ontology = URI.create(filenameOrURI);
		} catch (IllegalArgumentException e) {
			return null;
		}
		if (ontology.getScheme().equals("http")) {
			String filePart = ontology.getPath().substring(
					ontology.getPath().lastIndexOf("/"));
			log.debug("in import, got file part " + filePart);
			DIR: for (File dir : getServiceDirectories()) {
				File gotFile = null;

				File ontFile = new File(dir + File.separator + filePart);
				log.trace("trying " + ontFile);
				if (ontFile.exists()) {
					log.debug("found ontology file " + ontFile);
					gotFile = ontFile;

				} else {
					ontFile = new File(dir + File.separator + filePart + ".owl");
					log.trace("trying " + ontFile);
					if (ontFile.exists()) {
						log.debug("found ontology file " + ontFile);
						gotFile = ontFile;
					}else{
						ontFile = new File(dir + File.separator + filePart + ".owls");
						log.trace("trying " + ontFile);
						if (ontFile.exists()) {
							log.debug("found ontology file " + ontFile);
							gotFile = ontFile;
						}
					}
				}
				if (gotFile == null) {
					log.debug("failed to find a candidate for " + ontology);
					continue DIR;
				}
				return ontFile.toURI().toString();

			}
		}
		return null;
	}

}
