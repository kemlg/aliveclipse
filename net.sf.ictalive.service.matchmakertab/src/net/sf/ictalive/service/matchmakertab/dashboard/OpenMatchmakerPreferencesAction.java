package net.sf.ictalive.service.matchmakertab.dashboard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.service.serviceui.preferences.ServiceSetupPreferencesPage;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Opens the matchmaker configuration dialog
 * 
 * @author occ
 * 
 */
public class OpenMatchmakerPreferencesAction extends
		PluggedInDashboardAction<AliveDashboardState> {
	AliveDashboardState state;
	Shell shell;

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.ConfigureMatchmakerId;
	}

	@Override
	public void run(AliveDashboardState state) {
		ServiceSetupPreferencesPage page = new ServiceSetupPreferencesPage();
		page.setTitle("Services Setup");
		PreferenceManager mgr = new PreferenceManager();
		IPreferenceNode node = new PreferenceNode("1", page);
		mgr.addToRoot(node);
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		PreferenceDialog dialog = new PreferenceDialog(win.getShell(), mgr);
		dialog.create();
		dialog.setMessage(page.getTitle());
		dialog.open();
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		return null;
	}
}
