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
package net.sf.ictalive.aliveclipse.dashboard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public final class AliveDashboardState implements net.sf.ictalive.dashboard.DashboardState {

	public static String CreateOrganisationId = "DashboardState.CreateOrganisationId";
	public static String CreateTaskId = "DashboardState.CreateTaskId";
	public static String CreateActionId = "DashboardState.CreateActionId";
	public static String CreateMASId = "DashboardState.CreateMASId";
	public static String CreatePlanId = "DashboardState.CreatePlanId";
	public static String ConfigureMatchmakerId = "DashboardState.ConfigureMatchmakerId";
	public static String DefineTemplateId = "DashboardState.DefineTemplateId";
	public static String ApplyTemplateId = "DashboardState.ApplyTemplateId";
	public static String DeriveTemplateId = "DashboardState.DeriveTemplateId";
	public static String RefineTemplateId = "DashboardState.RefineTemplateId";
	public static String ImportServiceId = "DashboardState.ImportServiceId";
	public static String ImportServiceOntologyId = "DashboardState.ImportServiceOntologyId";
	public static String ConfigureEnactmentId = "DashboardState.ConfigureEnactmentId";
	
	// Flow action id's for top-down view
	
	public static String ExportOntologyId = "DashboardState.ExportOntologyId";
	public static String ImportOntologyId = "DashboardState.ImportOntologyId";
	public static String DeriveActionFromOrganisationId = "DashboardState.DeriveActionFromOrganisationId";
	public static String DeriveTaskFromActionId = "DashboardState.DeriveTaskFromActionId";
	public static String DeriveMASFromOrganisationAndActionId = "DashboardState.DeriveMASFromOrganisationAndActionId";
	public static String DeriveAgentsFromMASId = "DashboardState.DeriveAgentsFromMASId";
	public static String CombinePlanId = "DashboardState.CombinePlanId";
	public static String VerifyServiceId = "DashboardState.VerifyServiceId";
	
	// extra flow action id's for middle-out view
	
	public static String DeriveOrganisationFromActionId = "DashboardState.DeriveOrganisationFromActionId";	
	public static String DeriveMASFromPlanId = "DashboardState.DeriveMASFromPlanId";
	public static String DeriveActionFromPlanId = "DashboardState.DeriveActionFromPlanId";	
	public static String DeriveTaskFromPlanId = "DashboardState.DeriveTaskFromPlanId";	
	
	// extra flow action id's for bottom-up view
	
//	public static String DerivePlanFromEventLogId = "DashboardState.DerivePlanFromEventLogId";
	public static String DeriveActionsFromServiceId = "DashboardState.DeriveActionsFromServiceId";
	
	
	public static final String LOCATION_Organisation = "organisation_model"; //$NON-NLS-1$

	public static final String LOCATION_Ontology = "ontology_model"; //$NON-NLS-1$

	public static final String LOCATION_Task = "task_model"; //$NON-NLS-1$

	public static final String LOCATION_Action = "action_model"; //$NON-NLS-1$

	public static final String LOCATION_MAS = "mas_model"; //$NON-NLS-1$

	public static final String LOCATION_Agents = "agents_model"; //$NON-NLS-1$

	public static final String LOCATION_Plan = "plan_model"; //$NON-NLS-1$

	
	private static final String PREF_KEY = "alive_dashboard"; //$NON-NLS-1$

	private IProject project;

	public AliveDashboardState() {
	}

	// we reuse the unique DashboardFacade Locations as the keys
	public AliveDashboardState(IProject project) {
		this();
		this.project = project;
		Preferences prefs = getPreferences();
/*
		if (prefs != null) {
			organisation = read(prefs, AliveDashboardState.LOCATION_Organisation);
			ontology = read(prefs, AliveDashboardState.LOCATION_Ontology);
			task = read(prefs, AliveDashboardState.LOCATION_Task);
			action = read(prefs, AliveDashboardState.LOCATION_Action);
			mas = read(prefs, AliveDashboardState.LOCATION_MAS);
			agents = read(prefs, AliveDashboardState.LOCATION_Agents);
			plan = read(prefs, AliveDashboardState.LOCATION_Plan);
			}
			*/
	}

	public IProject getProject() {
		return project;
	}
	
	public URI getOrganisation() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_Organisation);
			}
		else
			return null;
	}
	
	public void setOrganisation(URI uri) {
		write(AliveDashboardState.LOCATION_Organisation, uri);
	}

	public void setOrganisation(IFile file) {
		setOrganisation( getURI(file) );
	} // TODO: do we need this one for each model as well?

	public URI getOntology() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_Ontology);
			}
		else
			return null;
	}

	public void setOntology(URI uri) {
		write(AliveDashboardState.LOCATION_Ontology, uri);
	}

	public URI getTask() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_Task);
			}
		else
			return null;
	}

	public void setTask(URI uri) {
		write(AliveDashboardState.LOCATION_Task, uri);
	}

	public URI getAction() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_Action);
			}
		else
			return null;
	}

	public void setAction(URI uri) {
		write(AliveDashboardState.LOCATION_Action, uri);
	}

	public URI getMAS() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_MAS);
			}
		else
			return null;
	}

	public void setMAS(URI uri) {
		write(AliveDashboardState.LOCATION_MAS, uri);
	}

	public URI getAgents() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_Agents);
			}
		else
			return null;
	}

	public void setAgents(URI uri) {
		write(AliveDashboardState.LOCATION_Agents, uri);
	}

	public URI getPlan() {
		Preferences prefs = getPreferences();
		if (prefs != null) {
			return read(prefs, AliveDashboardState.LOCATION_Plan);
			}
		else
			return null;
	}

	public void setPlan(URI uri) {
		write(AliveDashboardState.LOCATION_Plan, uri);
	}


	private static URI getURI(IFile file) {
		if (file == null) {
			return null;
		}
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}

	public int getModelsCount() {
		return 7;
	}

	public int getSpecifiedModelsCount() {
		int count = 0;
		if (getOrganisation() != null) count++;
		if (getOntology() != null) count++;
		if (getTask()!= null) count++;
		if (getAction()!= null) count++;
		if (getMAS()!= null) count++;
		if (getAgents()!= null) count++;
		if (getPlan()!= null) count++;		
		return count;
	}

	public URI read(Preferences prefs, String key) {
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

	public void write(String key, URI uri) {
		if (project == null) {
			return;
		}
		String s = null;
		if (uri != null) {
			s = uri.toString();
		}
		Preferences prefs = getPreferences();
		if (s != null)
			prefs.put(key, s);
		else {
			prefs.remove(key);
		}
			
		savePreferences(prefs);
	}

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
