package net.sf.ictalive.runtime.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ServicePlatformStartAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.StartServicePlatformId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return "Starting the service platform has to be done manually.";
	}

	@Override
	public void run(RuntimeDashboardState state) {
	}

}
