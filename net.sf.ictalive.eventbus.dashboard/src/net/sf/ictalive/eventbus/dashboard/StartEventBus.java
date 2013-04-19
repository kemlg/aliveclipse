package net.sf.ictalive.eventbus.dashboard;

import java.io.File;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class StartEventBus extends PluggedInDashboardAction<RuntimeDashboardState>
{	
	public static EventBusDaemon	ebd;

	static
	{
		ebd = null;
	}
	
	@Override
	public String dashboardActionId()
	{
		return RuntimeDashboardState.StartEventBusId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state)
	{
		if(state.getEventBusLocation() == null)//the eventbus is not configured
			return "EventBus location not set, run configure first.";
		
		String res;
		
		if(ebd == null || !ebd.isRunning())
		{
			res = null;
		}
		else
		{
			res = "EventBus instance already running. Please stop before starting again.";
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
			ebd = new EventBusDaemon(File.createTempFile("test", "test").getParentFile().getAbsolutePath());
			ebd.start();
			state.setEventBusStatus(RuntimeDashboardState.STATUS_GREEN);
		}
		catch (Exception e)
		{
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"EventBus exception", e.getCause().getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			ebd = null;
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
