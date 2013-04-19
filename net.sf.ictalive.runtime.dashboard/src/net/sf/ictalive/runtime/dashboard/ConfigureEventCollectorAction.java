package net.sf.ictalive.runtime.dashboard;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ConfigureEventCollectorAction extends
		PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.ConfigureEventCollectorId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return null; //always on
	}

	@Override
	public void run(RuntimeDashboardState state) {
		InputDialog dialog = new InputDialog(null, "EventCollector Location", "Input EventCollector location/hostname", state.getEventCollectorLocation(), null);
		if(dialog.open() == Window.OK)
			state.setEventCollectorLocation(dialog.getValue());
	}

}
