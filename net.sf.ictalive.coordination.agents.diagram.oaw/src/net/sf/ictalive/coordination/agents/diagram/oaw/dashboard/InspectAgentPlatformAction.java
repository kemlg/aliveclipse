package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

public class InspectAgentPlatformAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.InspectAgentPlatformId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		// TODO implement, and set message
		return "Inspect Agent Platform not yet implemented.";
	}

	@Override
	public void run(RuntimeDashboardState state) {
		// TODO Implement
		
	}

}
