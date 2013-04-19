package net.sf.ictalive.runtime.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ServicePlatformRestartAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.RestartServicePlatformId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return "Restarting the service platform has to be done manually.";
	}

	@Override
	public void run(RuntimeDashboardState state) {
	}

}
