package net.sf.ictalive.coordination.agents.diagram.oaw.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for dealing with getting
 * 
 * 
 * @author David Corsar
 * 
 */
public class PreferencesUtils {

	public static final String PROXY_USER = "proxyUser";
	public static final String PROXY_PASSWORD = "proxyPassword";
	public static final String NON_PROXY_HOSTS = "nonProxyHosts";
	public static final String MAX_HEAP_SIZE = "maxHeapSize";
	public static final String PROXY_PORT = "proxyPort";
	public static final String PROXY_HOST = "proxyHost";
	public static final String AGENTSCAPE_LOCATION = "agentscapeLocation";
	public static final String AGENTSCAPE_SERVER = "agentscapeServer";
	public static final String AGENTSCAPE_PORT = "agentscapePort";
	
	private static PreferencesUtils INSTANCE = new PreferencesUtils();

	private Map<String, String> prefs;

	private PreferencesUtils() {
		super();
		prefs = new HashMap<String, String>();
	}

	public static void put(String key, String value) {
		PreferencesUtils.INSTANCE.prefs.put(key, value);
	}

	public static String get(String key) {
		String s= PreferencesUtils.INSTANCE.prefs.get(key);
		return (s==null)?"":s;
	}

}
