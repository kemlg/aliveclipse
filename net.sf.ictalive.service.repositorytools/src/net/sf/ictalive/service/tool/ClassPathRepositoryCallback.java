package net.sf.ictalive.service.tool;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

/**
 * Loads imports from the classpath
 * 
 * @author occ
 * 
 */
public class ClassPathRepositoryCallback implements AliveOntRepoCallback {

	Map<ClassLoader, List<String>> resourcePaths = new HashMap<ClassLoader, List<String>>();

	Logger log = Logger.getLogger(ClassPathRepositoryCallback.class);

	public ClassPathRepositoryCallback() {
	}

	public ClassPathRepositoryCallback(String[] paths) {
		addClassResourcePaths(paths);
	}

	public ClassPathRepositoryCallback(ClassLoader cl, String[] paths) {
		addClassResourcePaths(cl, paths);
	}

	public void addClassResourcePaths(ClassLoader cl, String[] paths) {

		List<String> curpaths = resourcePaths.get(cl);
		if (curpaths == null) {
			curpaths = new LinkedList<String>();
			resourcePaths.put(cl, curpaths);

		}
		for (String path : paths) {
			// if (path.startsWith("/")) {
			// throw new IllegalArgumentException(path + " is not absolute ");
			//
			// }
			curpaths.add(path);

		}
	}

	public void addClassResourcePaths(String[] paths) {
		addClassResourcePaths(Thread.currentThread().getContextClassLoader(),
				paths);
	}

	public void addClassResourcePath(String paths) {
		addClassResourcePaths(Thread.currentThread().getContextClassLoader(),
				new String[] { paths });

	}

	public void addClassResourcePath(ClassLoader cl, String path) {
		addClassResourcePaths(cl, new String[] { path });
	}

	@Override
	public String getLocation(String uri) {
		URI ontology;
		try {
			ontology = URI.create(uri);
		} catch (IllegalArgumentException e) {
			return null;
		}
		if (ontology.getScheme().equals("http")) {
			String filePart = ontology.getPath().substring(
					ontology.getPath().lastIndexOf("/") + 1);
			log.debug("in import, got file part " + filePart);

			for (Entry<ClassLoader, List<String>> entry : resourcePaths
					.entrySet()) {

				ClassLoader cl = entry.getKey();
				for (String path : entry.getValue()) {

					String fullPath = path;
					if (!fullPath.endsWith("/")) {
						fullPath = fullPath + "/";
					}
					fullPath += filePart;
					log.debug("checking cl " + cl + " for " + fullPath);

					URL fileURL = cl.getResource(fullPath);
					if (fileURL != null) {
						return fullPath;
					}

				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ClassPathRepositoryCallback [resourcePaths=" + resourcePaths
				+ "]";
	}

}
