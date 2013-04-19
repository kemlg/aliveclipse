package net.sf.ictalive.dashboard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.PlatformUI;

// This is the superclass of the abstract classes PluggedInDashboardAction and PluggedInWizardDashboardAction, which are
// extended to provide the actual plugins for the dashboard.
public class PluginDashboardAction<S> extends InternalDashboardAction<S> {
	
	private PluggedInDashboardAction<S> pluggedInAction;
	
	private String actionId;
	
	private boolean promptToSaveResources; // denotes whether the action should prompt to save any modified resources before running.
	
	// todo: it would be better to add an abstract boolean shouldPromptToSaveResources() in PluggedInDashboardAction
	//       this way, each plugin needs to specify whether or not it should prompt to save the resources.
	//       However, this means that all dashboard plugins will need to be updated.
	
	public PluginDashboardAction( String actionId, boolean promptToSaveResources ) {
		this.actionId = actionId;
		this.promptToSaveResources = promptToSaveResources;
	}
		
	public void init(DashboardFacade<S> context) {
		super.init(context);
		pluggedInAction = this.context.getPluggedInDashboardActions().get(actionId);
		if (pluggedInAction == null)
			System.err.println("No plugin for dashboard action: "+actionId);
	}

	public String getProblems() {
		if (pluggedInAction == null)
			return "No plugin has been registered for dashboard action:\n\n"+actionId;
		else	
			if (context.getProject() == null)
				return "No project has been selected.";
			else {
				boolean isAliveProject = false;
				try {
					if (context.getProject().getNature("net.sf.ictalive.aliveclipse.projectNature") != null)
						isAliveProject = true;
				} catch (CoreException e) {
				}
				
				if (!isAliveProject)
					return "The selected project \""+context.getProject().getName()+"\" is not an ALIVE project.";
				else
					return pluggedInAction.getProblems(context.getState());
			}
	}

	public void unguardedRun() {
		if (!promptToSaveResources || PlatformUI.getWorkbench().saveAllEditors(true)) {
			pluggedInAction.run(context.getState());
			context.updateStatus();
		}
	}
}