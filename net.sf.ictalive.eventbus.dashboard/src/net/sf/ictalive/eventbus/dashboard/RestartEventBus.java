package net.sf.ictalive.eventbus.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class RestartEventBus extends PluggedInDashboardAction<RuntimeDashboardState>
{	
	@Override
	public String dashboardActionId()
	{
		return RuntimeDashboardState.RestartEventBusId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state)
	{
		String res;
		
		if(StartEventBus.ebd == null || !StartEventBus.ebd.isRunning())
		{
			res = "EventBus instance not running. Please start before restarting.";
		}
		else
		{
			res = null;
		}
		
		return res;
	}

	@Override
	public void run(RuntimeDashboardState state)
	{
		ProgressMonitorDialog	pmd;
		
		pmd = new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		pmd.setCancelable(false);
		pmd.open();
		try
		{
			StartEventBus.ebd.stop();
			state.setEventBusStatus(RuntimeDashboardState.STATUS_RED);
			StartEventBus.ebd.start();
			state.setEventBusStatus(RuntimeDashboardState.STATUS_GREEN);
		}
		catch (Exception e)
		{
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"EventBus exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			StartEventBus.ebd = null;
			state.setEventBusStatus(RuntimeDashboardState.STATUS_GREY);
		}
		pmd.close();
	}

	protected void errorDialog(String message)
	{
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		MessageDialog.openError(workbenchWindow.getShell(), "Error", message);
	}
}
