package net.sf.ictalive.eventcollector.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.eventbus.dashboard.StartEventBus;
import net.sf.ictalive.eventlog.dashboard.StartEventLog;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class StartEventCollector extends PluggedInDashboardAction<RuntimeDashboardState>
{	
	static EventCollectorComponent	ecc;

	static
	{
		ecc = null;
	}
	
	@Override
	public String dashboardActionId()
	{
		return RuntimeDashboardState.StartEventCollectorId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state)
	{	
		String res;
		
		if(StartEventLog.elc == null || !StartEventLog.elc.isRunning())
		{
			res = "Please start EventLog.";
		}
		else if(StartEventBus.ebd == null || !StartEventBus.ebd.isRunning())
		{
			res = "Please start EventBus.";
		}
		else if(ecc == null || !ecc.isRunning())
		{
			if(state.getEventCollectorLocation() == null)//collector not yet configured
				return "EventCollector location not set, run configure first.";
			res = null;
		}
		else
		{
			res = "EventCollector instance already running. Please stop before starting again.";
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
			ecc = new EventCollectorComponent("127.0.0.1", "127.0.0.1");
			ecc.start();
			state.setEventCollectorStatus(RuntimeDashboardState.STATUS_GREEN);
		}
		catch (Exception e)
		{
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"EventCollector exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			ecc = null;
			state.setEventCollectorStatus(RuntimeDashboardState.STATUS_GREY);
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
