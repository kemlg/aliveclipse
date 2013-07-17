package net.sf.ictalive.service.tool;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.hp.hpl.jena.ontology.OntDocumentManager;
import com.hp.hpl.jena.ontology.OntDocumentManager.ReadHook;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * A jena LocationMapper Hook which can be installed to allow
 * ontologies/files/uris to be resolved to alternate paths via a plu
 * 
 * @author occ
 * 
 */
public class AliveRepoManagerHook implements ReadHook {

	List<AliveOntRepoCallback> callbacks = new LinkedList<AliveOntRepoCallback>();
	Logger log = LoggerFactory.getLogger(AliveRepoManagerHook.class);
	ReadHook next;

	public AliveRepoManagerHook() {
	}

	public void removeCallback(AliveOntRepoCallback cb) {
		callbacks.remove(cb);
	}

	@Override
	public String beforeRead(Model model, String source, OntDocumentManager odm) {
		// log.trace("resolving {}", source);
		for (AliveOntRepoCallback cb : callbacks) {
			log.trace("resolving {} in {}", source, cb);
			String rv = cb.getLocation(source);
			if (rv != null) {
				log.trace("resolved {}  to {} in {}", new Object[] { source,
						rv, cb });

				return rv;
			}
			log.trace("failed to resolve {} in {}", source, cb);
		}
		if (next != null) {
			return next.beforeRead(model, source, odm);
		}
		return null;

	}

	@Override
	public void afterRead(Model model, String source, OntDocumentManager odm) {

	}

	static AliveRepoManagerHook aliveMapper;

	public static void setup() {
		setup(true);
	}

	static ClassPathRepositoryCallback cpCallback;

	/**
	 * 
	 */
	public static void setup(boolean includeDefaults) {

		if (aliveMapper == null) {
			ReadHook next = OntDocumentManager.getInstance().getReadHook();
			aliveMapper = new AliveRepoManagerHook();
			aliveMapper.next = next;
			OntDocumentManager.getInstance().setReadHook(aliveMapper);
		}

		if (!includeDefaults && null != cpCallback) {
			aliveMapper.removeCallback(cpCallback);
		}
		if (includeDefaults && null == cpCallback) {
			addLocatorCallback(cpCallback = new ClassPathRepositoryCallback(
					AliveRepoManagerHook.class.getClassLoader(),
					new String[] { "net/sf/ictalive/svcrepo/ontologies_owls_1_2" }));
			OntDocumentManager.getInstance().getFileManager()
					.addLocatorClassLoader(
							AliveRepoManagerHook.class.getClassLoader());

		}
	}

	public static void reset() {

		if (aliveMapper != null) {
			aliveMapper.callbacks.clear();
			OntDocumentManager.getInstance().setReadHook(aliveMapper.next);
			aliveMapper = null;
			cpCallback = null;
		}
	}

	/**
	 * Removes a locator callback from the repository locator
	 * 
	 * @param cb
	 */
	public static void removeLocatorCallback(AliveOntRepoCallback cb) {
		aliveMapper.callbacks.remove(cb);
	}

	/**
	 * Adds an ontology locator callback to the currently configured repository
	 * locator
	 * 
	 * @param cb
	 *            the callback to add
	 * @throws IllegalStateException
	 *             if the repository manager has not been set up
	 */
	public static void addLocatorCallback(AliveOntRepoCallback cb) {
		if (aliveMapper == null)
			throw new IllegalStateException(
					"Location mapper has not been set up");
		aliveMapper.callbacks.add(cb);
	}

	public static void addClassPathEntry(String string) {

		ClassPathRepositoryCallback cb = new ClassPathRepositoryCallback(
				AliveRepoManagerHook.class.getClassLoader(),
				new String[] { string });
		addLocatorCallback(cb);
	}

	public static void addFilePathEntry(String string) {
		FileSystemRepositoryCallbackImpl cb = new FileSystemRepositoryCallbackImpl(
				new File[] { new File(string) });
		addLocatorCallback(cb);
	}

	public static void addWebServiceRepositoryEntry(String wsdlLocation)
			throws MalformedURLException {
		URL url = new URL(wsdlLocation);
		WebServiceClientFactory wscf = new WebServiceClientFactory();
		wscf.setWsdlLocation(url);
		RemoteWebServiceRepositoryCallback wsc = new RemoteWebServiceRepositoryCallback(
				wscf);
		addLocatorCallback(wsc);

	}

	public static String getBaseURIFromOntFile(InputStream _iStream) {

		Document xmlDoc = null;
		try {
			xmlDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(_iStream);
		} catch (SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (xmlDoc == null)
			return null;

		Element elem = xmlDoc.getDocumentElement();
		return elem.getBaseURI();

	}
}
