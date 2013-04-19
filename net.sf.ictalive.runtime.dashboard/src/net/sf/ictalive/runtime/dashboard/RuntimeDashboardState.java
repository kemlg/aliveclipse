/*
 * Copyright (c) 2006, 2007 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package net.sf.ictalive.runtime.dashboard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public final class RuntimeDashboardState implements net.sf.ictalive.dashboard.DashboardState {

	public static String DeployServicesId = "RuntimeDashboardState.DeployServices";
	public static String InjectMASId = "RuntimeDashboardState.InjectMAS";
	public static String InspectAgentPlatformId = "RuntimeDashboardState.InspectAgentPlatform";
	public static String RuntimeMonitoringId = "RuntimeDashboardState.RuntimeMonitoring";
	public static String OfflineAnalysisId = "RuntimeDashboardState.OfflineAnalysis";
	

	public static String ConfigureServicePlatformId = "RuntimeDashboardState.ConfigureServicePlatform";
	public static String StartServicePlatformId = "RuntimeDashboardState.StartServicePlatform";
	public static String RestartServicePlatformId = "RuntimeDashboardState.RestartServicePlatform";
	public static String StopServicePlatformId = "RuntimeDashboardState.StopServicePlatform";
	public static String ConfigureAgentPlatformId = "RuntimeDashboardState.ConfigureAgentPlatform";
	public static String StartAgentPlatformId = "RuntimeDashboardState.StartAgentPlatform";
	public static String RestartAgentPlatformId = "RuntimeDashboardState.RestartAgentPlatform";
	public static String StopAgentPlatformId = "RuntimeDashboardState.StopAgentPlatform";
	public static String ConfigureEventBusId = "RuntimeDashboardState.ConfigureEventBus";
	public static String StartEventBusId = "RuntimeDashboardState.StartEventBus";
	public static String RestartEventBusId = "RuntimeDashboardState.RestartEventBus";
	public static String StopEventBusId = "RuntimeDashboardState.StopEventBus";
	public static String ConfigureEventCollectorId = "RuntimeDashboardState.ConfigureEventCollector";
	public static String StartEventCollectorId = "RuntimeDashboardState.StartEventCollector";
	public static String RestartEventCollectorId = "RuntimeDashboardState.RestartEventCollector";
	public static String StopEventCollectorId = "RuntimeDashboardState.StopEventCollector";
	public static String ConfigureEventLogId = "RuntimeDashboardState.ConfigureEventLog";
	public static String StartEventLogId = "RuntimeDashboardState.StartEventLog";
	public static String RestartEventLogId = "RuntimeDashboardState.RestartEventLog";
	public static String StopEventLogId = "RuntimeDashboardState.StopEventLog";

	public static String STATUS_GREEN = "StatusGreen";
	public static String STATUS_RED = "StatusRed";
	public static String STATUS_GREY = "StatusGrey";

	public static final String LOCATION_ServicePlatform = "servicePlatform"; //$NON-NLS-1$
	
	public static final String LOCATION_AgentPlatform = "agentPlatform"; //$NON-NLS-1$
	
	public static final String LOCATION_EventBus = "eventBus"; //$NON-NLS-1$
	
	public static final String LOCATION_EventCollector = "eventCollector"; //$NON-NLS-1$
	
	public static final String LOCATION_EventLog = "eventLog"; //$NON-NLS-1$

	private static final String PREF_KEY = "runtime_dashboard"; //$NON-NLS-1$
	
	public static final String LOCATION_EventBus_Location = "eventBus_location"; //$NON-NLS-1$
	
	public static final String LOCATION_EventLog_Location = "eventLog_location"; //$NON-NLS-1$
	
	public static final String LOCATION_EventCollector_location = "eventCollector_location"; //$NON-NLS-1$
	
	public static final String PROXY_USER = "proxyUser";
    public static final String PROXY_PASSWORD = "proxyPassword";
    public static final String NON_PROXY_HOSTS = "nonProxyHosts";
    public static final String MAX_HEAP_SIZE = "maxHeapSize";
    public static final String PROXY_PORT = "proxyPort";
    public static final String PROXY_HOST = "proxyHost";
    public static final String AGENTSCAPE_LOCATION = "agentscapeLocation";
    public static final String AGENTSCAPE_SERVER = "agentscapeServer";
    public static final String AGENTSCAPE_PORT = "agentscapePort"; 

	private String servicePlatformStatus;
	private String agentPlatformStatus;
	private String eventBusStatus;
	private String eventCollectorStatus;
	private String eventLogStatus;

	private IProject project;

	public RuntimeDashboardState() {
	}

	public IProject getProject() {
		return project;
	}
	
	// we reuse the unique DashboardFacade Locations as the keys
	public RuntimeDashboardState(IProject project) {
		this();
		this.project = project;
		Preferences prefs = getPreferences();
		if (prefs != null) {
/*			servicePlatformStatus = read(prefs, RuntimeDashboardState.LOCATION_ServicePlatform);
			agentPlatformStatus = read(prefs, RuntimeDashboardState.LOCATION_AgentPlatform);
			eventBusStatus = read(prefs, RuntimeDashboardState.LOCATION_EventBus);
			eventCollectorStatus = read(prefs, RuntimeDashboardState.LOCATION_EventCollector);
			eventLogStatus = read(prefs, RuntimeDashboardState.LOCATION_EventLog);
*/
			servicePlatformStatus = STATUS_GREY;
			agentPlatformStatus = STATUS_GREY;
			eventBusStatus = STATUS_GREY;
			eventCollectorStatus = STATUS_GREY;
			eventLogStatus = STATUS_GREY;
			}
	}

	public String getServicePlatformStatus() {
		return servicePlatformStatus;
	}
	
	public void setServicePlatformStatus(String status) {
		servicePlatformStatus = status;
		write(RuntimeDashboardState.LOCATION_ServicePlatform, status);
	}

	public String getAgentPlatformStatus() {
		return agentPlatformStatus;
	}
	
	public void setAgentPlatformStatus(String status) {
		agentPlatformStatus = status;
		write(RuntimeDashboardState.LOCATION_AgentPlatform, status);
	}

	public String getEventBusStatus() {
		return eventBusStatus;
	}
	
	public void setEventBusStatus(String status) {
		eventBusStatus = status;
		write(RuntimeDashboardState.LOCATION_EventBus, status);
	}

	public String getEventCollectorStatus() {
		return eventCollectorStatus;
	}
	
	public void setEventCollectorStatus(String status) {
		eventCollectorStatus = status;
		write(RuntimeDashboardState.LOCATION_EventCollector, status);
	}

	public String getEventLogStatus() {
		return eventLogStatus;
	}
	
	public void setEventLogStatus(String status) {
		eventLogStatus = status;
		write(RuntimeDashboardState.LOCATION_EventLog, status);
	}
	
	public String getEventBusLocation() {
		Preferences prefs = getPreferences();
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.LOCATION_EventBus_Location);
		}
		else
			return "127.0.0.1";
	}
	
	public void setEventBusLocation(String location) {
		write(RuntimeDashboardState.LOCATION_EventBus_Location, location);
	}
	
	public String getEventLogLocation() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.LOCATION_EventLog_Location);
		}
		else 
			return "127.0.0.1";
	}
	
	public void setEventLogLocation(String location) {
		write(RuntimeDashboardState.LOCATION_EventLog_Location, location);
	}
	
	public String getEventCollectorLocation() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.LOCATION_EventCollector_location);
		}
		else 
			return "127.0.0.1";
	}
	
	public void setEventCollectorLocation(String location) {
		write(RuntimeDashboardState.LOCATION_EventCollector_location, location);
	} 
	
    public String getProxyUser() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.PROXY_USER);
		}
		else 
			return null;
    }
    
    public void setProxyUser(String user) {
    	write(RuntimeDashboardState.PROXY_USER, user);
    }
    
    public String getProxyPassword() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.PROXY_PASSWORD);
		}
		else 
			return null;
    }
    
    public void setProxyPassword(String password) {
    	write(RuntimeDashboardState.PROXY_PASSWORD, password);
    }
	
    public String getNonProxyHosts() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.NON_PROXY_HOSTS);
		}
		else 
			return null;
    }
    
    public void setNonProxyHosts(String nonProxyHost) {
    	write(RuntimeDashboardState.NON_PROXY_HOSTS, nonProxyHost);
    }
    
    public String getMaxHeapSize() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.MAX_HEAP_SIZE);
		}
		else 
			return null;
    }
    
    public void setMaxHeapSize(String heapSize) {
    	write(RuntimeDashboardState.MAX_HEAP_SIZE, heapSize);
    }
    
    public String getProxyPort() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.PROXY_PORT);
		}
		else 
			return null;
    }
    
    public void setProxyPort(String port) {
    	write(RuntimeDashboardState.PROXY_PORT, port);
    }
    
    public String getProxyHost() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.PROXY_HOST);
		}
		else 
			return null;
    }
    
    public void setProxyHost(String host) {
    	write(RuntimeDashboardState.PROXY_HOST, host);
    }
    
    public String getAgentScapeLocation() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.AGENTSCAPE_LOCATION);
		}
		else 
			return null;
    }
    
    public void setAgentScapeLocation(String location) {
    	write(RuntimeDashboardState.AGENTSCAPE_LOCATION, location);
    }
    
    public String getAgentScapeServer() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.AGENTSCAPE_SERVER);
		}
		else 
			return null;
    }
    
    public void setAgentScapeServer(String server) {
    	write(RuntimeDashboardState.AGENTSCAPE_SERVER, server);
    }
    
    public String getAgentScapePort() {
		Preferences prefs = getPreferences();
		
		if(prefs != null) {
			return read(prefs, RuntimeDashboardState.AGENTSCAPE_PORT);
		}
		else 
			return null;
    }
    
    public void setAgentScapePort(String port) {
    	write(RuntimeDashboardState.AGENTSCAPE_PORT, port);
    }
    
	
	

	/*
	public int getModelsCount() {
		return 10;
	}

	public int getSpecifiedModelsCount() {
		int count = 0;
		if (organisation != null) count++;
		if (ontology != null) count++;
		if (task!= null) count++;
		if (action!= null) count++;
		if (agent!= null) count++;
		if (agents!= null) count++;
		if (plan!= null) count++;
		if (service!= null) count++;
		if (descriptions!= null) count++;
		if (enactment!= null) count++;
		
		return count;
	}
*/
	public String read(Preferences prefs, String key) {
		return prefs.get(key, null);
	}
/*
 	private URI read(Preferences prefs, String key) {
		String s = prefs.get(key, null);
		if (s == null) {
			return null;
		}
		try {
			return URI.createURI(s);
		} catch (IllegalArgumentException e) {
			IStatus status = Plugin.createError("Invalid URI", e);
			Plugin.getDefault().getLog().log(status);
		}
		return null;
	}
*/
	public void write(String key, String value) {
		if (project == null) {
			return;
		}
		Preferences prefs = getPreferences();
		
		if (value != null)
			prefs.put(key, value);
		else {
			prefs.remove(key);
		}
		savePreferences(prefs);
	}	
/*	private void write(String key, URI uri) {
		if (project == null) {
			return;
		}
		String s = null;
		if (uri != null) {
			s = uri.toString();
		}
		Preferences prefs = getPreferences();
		prefs.put(key, s);
		savePreferences(prefs);
	}
*/
	private void savePreferences(Preferences prefs) {
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			IStatus status = Plugin.createError("Unable to update state", e);
			Plugin.getDefault().getLog().log(status);
		}
	}

	public Preferences getPreferences() {
		if (project == null) {
			return null;
		}
		Preferences node = getExistingPreferences();
		if (node != null) {
			return node;
		}
		return new ProjectScope(project).getNode(Plugin.getPluginID()).node(PREF_KEY);
	}

	private Preferences getExistingPreferences() {
		if (project == null) {
			return null;
		}
		Preferences node = Platform.getPreferencesService().getRootNode().node(ProjectScope.SCOPE);
		try {
			if (!node.nodeExists(project.getName())) {
				return null;
			}
			node = node.node(project.getName());
			if (!node.nodeExists(Plugin.getPluginID())) {
				return null;
			}
			node = node.node(Plugin.getPluginID());
			if (!node.nodeExists(PREF_KEY)) {
				return null;
			}
			return node.node(PREF_KEY);
		} catch (BackingStoreException e) {
			IStatus status = Plugin.createError("Unable to read state", e);
			Plugin.getDefault().getLog().log(status);
		}
		return null;
	}
}
