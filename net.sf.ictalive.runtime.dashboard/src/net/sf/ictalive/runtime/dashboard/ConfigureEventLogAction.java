package net.sf.ictalive.runtime.dashboard;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ConfigureEventLogAction extends
		PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.ConfigureEventLogId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return null; //always on
	}

	@Override
	public void run(RuntimeDashboardState state) {
		InputDialog dialog = new InputDialog(null, "EventLog Location", "Input EventLog location/hostname", state.getEventLogLocation(), null);
		
		if(dialog.open() == Window.OK)
			state.setEventLogLocation(dialog.getValue());
		
	}

}
