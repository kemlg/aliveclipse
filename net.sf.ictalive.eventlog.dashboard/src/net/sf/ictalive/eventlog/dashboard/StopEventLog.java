package net.sf.ictalive.eventlog.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class StopEventLog extends PluggedInDashboardAction<RuntimeDashboardState>
{	
	@Override
	public String dashboardActionId()
	{
		return RuntimeDashboardState.StopEventLogId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state)
	{
		String res;
		
		if(StartEventLog.elc == null || !StartEventLog.elc.isRunning())
		{
			res = "EventLog instance not running. Please start before stopping.";
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
			StartEventLog.elc.stop();
			state.setEventLogStatus(RuntimeDashboardState.STATUS_RED);
		}
		catch (Exception e)
		{
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"EventLog exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			StartEventLog.elc = null;
			state.setEventLogStatus(RuntimeDashboardState.STATUS_GREY);
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
