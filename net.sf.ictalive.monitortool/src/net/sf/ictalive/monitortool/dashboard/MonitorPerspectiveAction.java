package net.sf.ictalive.monitortool.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;

@SuppressWarnings("restriction")
public class MonitorPerspectiveAction extends PluggedInDashboardAction<RuntimeDashboardState>
{

	@Override
	public String dashboardActionId()
	{
		return RuntimeDashboardState.RuntimeMonitoringId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state)
	{
		return null;
	}

	@Override
	public void run(RuntimeDashboardState state)
	{
		// Check the active window first
		final IWorkbench workBench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workBench.getActiveWorkbenchWindow();
		String rtPerspectiveId = "monitortool.perspectives.RelEngPerspective";

		// Get the perspective 'X's descriptor.
		IPerspectiveRegistry reg = WorkbenchPlugin.getDefault().getPerspectiveRegistry();
		PerspectiveDescriptor rtPerspectiveDesc = (PerspectiveDescriptor) reg.findPerspectiveWithId(rtPerspectiveId);

		// Now set it as the active perspective.
		// Set the perspective
		if (window != null)
		{
			IWorkbenchPage page = window.getActivePage();
			page.setPerspective(rtPerspectiveDesc);

			// Do again
			window = workBench.getActiveWorkbenchWindow();
		}
	}
}
