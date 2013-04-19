package net.sf.ictalive.service.tool;

import java.io.File;

/**
 * 
 * Concrete version of {@link AbstractFileSystemRepositoryCallback} which
 * maintains its own list of directories
 * 
 * Static filesystem repository callback for use with
 * {@link RepositoryOWLReaderImpl}.
 * 
 * To use this class create an instance, set the service directories you want to
 * be searched and then set it as the callback on the owlreader (this must also
 * be set on the knowledgebase)
 * 
 * 
 * The reader intercepts calls to load external ontologies, and then passes them
 * to the location callback, this searches the specified set of directoreis for
 * a file which matches the import.
 * 
 * If no import is found then the ontology is resolved in the usual way (http)
 * 
 * Where a file is imported the file in the specified directory must have the
 * same local part name as the URI of the ontology (possibly suffixecd with
 * ".owl")
 * 
 * e.g.
 * 
 * if the URI is http://www.foo.org/ontologies/bar-ontology.owl
 * 
 * then the file which will be used will be :
 * 
 * example-services/bar-ontology.owl
 * 
 * likewise for: http://www.w3c.org/srwl/swrl
 * 
 * the file will be
 * 
 * example-services/swrl.owl e.g. :
 * 
 * 
 * <code> 
    OWLKnowledgeBase kb = OWLFactory.createKB();

		// construct the callback object
		FileSystemRepositoryCallbackImpl callback = new FileSystemRepositoryCallbackImpl();
		
		// Set the static set of search directo
		callback.setServiceDirectories(new File[] { new File(
				"example-services/") });
		
		//Construct the custom OWL reader
		RepositoryOWLReaderImpl reader = new RepositoryOWLReaderImpl();
		reader.setLocationCallback(callback);

		//Set the Reader as the knowledgebase's default reader. 
		kb.setReader(reader);
		
		kb.readService(....)
  </code>
 * 
 * @author occ
 * 
 */
public class FileSystemRepositoryCallbackImpl extends
		AbstractFileSystemRepositoryCallback {

	public FileSystemRepositoryCallbackImpl() {

	}

	public FileSystemRepositoryCallbackImpl(File[] serviceDirectories) {
		this.serviceDirectories = serviceDirectories;
	}

	File serviceDirectories[];

	public void setServiceDirectories(File[] serviceDirectories) {
		this.serviceDirectories = serviceDirectories;
	}

	public File[] getServiceDirectories() {
		return serviceDirectories;
	}

}
