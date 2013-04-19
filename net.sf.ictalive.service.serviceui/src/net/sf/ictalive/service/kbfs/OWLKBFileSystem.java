package net.sf.ictalive.service.kbfs;

import impl.jena.OWLKnowledgeBaseImpl;

import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import net.sf.ictalive.service.serviceui.Activator;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileInfo;
import org.eclipse.core.filesystem.provider.FileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.rdf.listeners.ObjectListener;

public class OWLKBFileSystem extends
		org.eclipse.core.filesystem.provider.FileSystem {
	Logger log = LoggerFactory.getLogger(OWLKBFileStore.class);

	public OWLKBFileSystem() {
		log.debug("OWLKBFileSystem created");
	}

	public OWLKnowledgeBase getOWLKB() {
		return Activator.getDefault().getDefaultOWLKB();
	}

	class OntologyFileStore extends FileStore {

		OWLOntology ont;
		OWLKBFileStore parent;

		OntologyFileStore(OWLKBFileStore parent, OWLOntology ont) {
			log.debug("Ontology filestore created for" + ont);
			this.parent = parent;
			this.ont = ont;
		}

		@Override
		public String[] childNames(int arg0, IProgressMonitor arg1)
				throws CoreException {
			return EMPTY_STRING_ARRAY;
		}

		FileInfo fileInfo;

		@Override
		public IFileInfo fetchInfo(int flags, IProgressMonitor pm)
				throws CoreException {

			if (fileInfo == null) {
				fileInfo = new FileInfo(ont == null ? null : ont.getURI()
						.toString());
				fileInfo.setDirectory(false);
				fileInfo.setExists(ont != null);
			}
			return fileInfo;
		}

		@Override
		public InputStream openInputStream(int arg0, IProgressMonitor arg1)
				throws CoreException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IFileStore getChild(String arg0) {
			return null;

		}

		@Override
		public String getName() {

			log.debug("gettin name : " + ont.getURI().toString());
			return ont.getURI().toString();
		}

		@Override
		public Object getAdapter(Class adapter) {
			log.debug("adaptor requested to " + adapter);
			if (adapter.equals(OWLOntology.class))
				return ont;
			return super.getAdapter(adapter);
		}

		@Override
		public IFileStore getParent() {

			return parent;
		}

		@Override
		public URI toURI() {
			log.debug("getting URI of {}", ont);
			if (ont != null)
				return URI.create(getScheme() + ont.getURI());
			return null;
		}
	}

	class OWLKBFileStore extends FileStore {

		List<OWLOntology> _ontologies;

		void modelChanged() {
			_ontologies = null;
		}

		public OWLKBFileStore() {

			((OWLKnowledgeBaseImpl) getOWLKB()).getImplementation().register(
					new ObjectListener() {
						@Override
						public void added(Object x) {
							modelChanged();
						}

						@Override
						public void removed(Object x) {
							modelChanged();
						}
					});
		}

		List<OWLOntology> getOntologies() {
			if (_ontologies != null)
				return _ontologies;
			_ontologies = new LinkedList<OWLOntology>();
			_ontologies.addAll(getOWLKB().getOntologies(false));

			Collections.sort(_ontologies, new Comparator<OWLOntology>() {
				@Override
				public int compare(OWLOntology o1, OWLOntology o2) {
					return o1.getURI().compareTo(o2.getURI());
				}
			});

			return _ontologies;
		}

		@Override
		public IFileStore getChild(String name) {
			log.debug("Getting child:" + name);
			OWLOntology owlo = getOWLKB().getOntology(URI.create(name));
			if (owlo == null) {
				log.debug(" Ontology {} not found", name);
			}
			return new OntologyFileStore(this, owlo);
		}

		@Override
		public String[] childNames(int arg0, IProgressMonitor arg1)
				throws CoreException {

			List<OWLOntology> ontologies = getOntologies();
			List<String> ontNames = new LinkedList<String>();
			for (OWLOntology ont : ontologies) {
				ontNames.add(ont.getURI().toString());
			}
			log.debug("Children " + ontNames);
			return ontNames.toArray(new String[0]);
			// return new String[] { "foo", "bar", "baz" };

		}

		@Override
		public IFileInfo fetchInfo(int info, IProgressMonitor pm)
				throws CoreException {
			log.debug("Fetching info for " + getName());
			FileInfo fi = new FileInfo(getName());
			fi.setAttribute(EFS.ATTRIBUTE_HIDDEN, false);
			fi.setDirectory(true);
			fi.setAttribute(EFS.ATTRIBUTE_READ_ONLY, true);
			fi.setExists(true);
			return fi;
		}

		@Override
		public String getName() {

			return "root";
		}

		@Override
		public IFileStore getParent() {

			log.debug("Fetching parent for " + getName());

			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream openInputStream(int arg0, IProgressMonitor arg1)
				throws CoreException {
			log.debug("input stream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public URI toURI() {
			log.debug("getting URI of root:");
			return URI.create(getScheme() + ":root");
		}

	}

	@Override
	public int attributes() {
		return EFS.ATTRIBUTE_READ_ONLY;
	}

	@Override
	public IFileStore getStore(URI uri) {
		log.debug("Fetching store for " + uri);

		if (uri.toString().equals("owlkb:root")) {
			System.err.println("");
			return new OWLKBFileStore();
		}
		log.debug("Store {} not found", uri);
		return null;
	};
}
