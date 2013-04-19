package net.sf.ictalive.runtime.dashboard;

import org.eclipse.jface.dialogs.MessageDialog;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ServicePlatformConfigureAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.ConfigureServicePlatformId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return null;
	}

	@Override
	public void run(RuntimeDashboardState state) {
		// TODO implement tomcat connection
		MessageDialog.openInformation(null, "Configure Service Platform", "Deploying and configuring the service platform has to be done manually; please see http://tomcat.apache.org/ for download locations, installation and run tutorials.");
	}

}
