package net.sf.ictalive.eventlog.dashboard;

import java.io.File;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class StartEventLog extends PluggedInDashboardAction<RuntimeDashboardState>
{	
	public static EventLogComponent	elc;

	static
	{
		elc = null;
	}
	
	@Override
	public String dashboardActionId()
	{
		return RuntimeDashboardState.StartEventLogId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state)
	{
		if(state.getEventLogLocation() == null)
			return "EventLog location not set, run configure first.";
		
		String res;
		
		if(elc == null || !elc.isRunning())
		{
			res = null;
		}
		else
		{
			res = "EventLog instance already running. Please stop before starting again.";
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
			elc = new EventLogComponent(File.createTempFile("test", "test").getParentFile().getAbsolutePath());
			elc.start();
			state.setEventLogStatus(RuntimeDashboardState.STATUS_GREEN);
		}
		catch (Exception e)
		{
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"EventLog exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			elc = null;
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
