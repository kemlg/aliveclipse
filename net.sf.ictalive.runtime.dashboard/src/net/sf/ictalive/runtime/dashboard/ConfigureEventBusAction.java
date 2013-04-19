package net.sf.ictalive.runtime.dashboard;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ConfigureEventBusAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.ConfigureEventBusId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return null; // always on
		
	}

	@Override
	public void run(RuntimeDashboardState state) {
		InputDialog dialog = new InputDialog(null, "EventBus Location", "Input EventBus location/hostname.", state.getEventBusLocation(), null);
		if(dialog.open() == Window.OK) {
			state.setEventBusLocation(dialog.getValue());
		}
	}

}
