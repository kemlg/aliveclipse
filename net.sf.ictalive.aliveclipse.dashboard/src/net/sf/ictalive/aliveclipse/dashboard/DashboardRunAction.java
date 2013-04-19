package net.sf.ictalive.aliveclipse.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;

public class DashboardRunAction extends PluggedInDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.ConfigureEnactmentId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if(state.getAgents() != null)
			return null;
		else 
			return "Agent generation not completed.";
	}

	@Override
	public void run(AliveDashboardState state) {
		// Check the active window first
		final IWorkbench workBench = PlatformUI.getWorkbench();
		Display display = workBench.getDisplay();

		IWorkbenchPage[] pages = null;
		IWorkbenchWindow window = workBench.getActiveWorkbenchWindow();
//		String rtPerspectiveId = "monitortool.perspectives.RelEngPerspective";
		String rtDashboardView = "net.sf.ictalive.runtime.dashboard.DashboardPart";
		
		
		try {
			window.getActivePage().showView(rtDashboardView);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
		
	}

}
