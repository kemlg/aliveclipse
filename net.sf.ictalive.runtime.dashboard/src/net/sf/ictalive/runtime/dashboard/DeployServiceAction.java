package net.sf.ictalive.runtime.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class DeployServiceAction extends
		PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.DeployServicesId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return "Deploy the services manually. See http://tomcat.apache.org/ for tutorials on service deployment.";
	}

	@Override
	public void run(RuntimeDashboardState state) {
	}

}
