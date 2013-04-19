/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.MessageFormat;

import net.sf.ictalive.runtime.dashboard.Plugin;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;
import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;
import net.sf.ictalive.coordination.agents.diagram.oaw.handlers.GeneratorHandler;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.FileUtils;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Dashboard action for stopping AgentScape 
 * 
 * @author achorley
 * 
 */
public class StopAgentPlatformDashboardAction extends PluggedInDashboardAction<RuntimeDashboardState> {
	
	IWorkbench workbench = PlatformUI.getWorkbench();
	IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
	String titleMsg = "Stop AgentScape Platform";
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	
	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.StopAgentPlatformId;
	}

	
	@Override
	public String getProblems(RuntimeDashboardState state) {

		// TODO Auto-generated method stub
		//only active when Agentscape running
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 *
	 */
	
	@Override
	public void run(RuntimeDashboardState state) {

		//get os and make instructions for each one
		
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		

		if(System.getProperty("os.name").startsWith("Mac"))
			{
			macInstructions();
			}
		else if(System.getProperty("os.name").startsWith("Linux"))
			{
			linuxInstructions();
			}
		else //windows
			{
			windowsInstructions();
			}
		}


	private void windowsInstructions() {
//		In windows install virtual box and use linux
		String msg = "Open the Task Monitor \n\n" +
		"Find the two java processes that were created when starting AgentScape \n\n" +
		"Click \"Quit Process\"  and then \"Quit\" for each process.";

		MessageDialog.openInformation(workbenchWindow.getShell(), titleMsg, msg);		
	}


	private void linuxInstructions() {
//		In Linux, right click the process and select “Kill Process”
		String msg = "Open the System Monitor \n\n" +
		"Find the two java processes that were created when starting AgentScape \n" +
		"Hover the mouse over the process to find the ones labelled \"aslookup.jar\" and \"asstartup.jar\"\n\n"+
		"Right click and select \"Kill Process\" for each process.";

		MessageDialog.openInformation(workbenchWindow.getShell(), titleMsg, msg);
	}


	private void macInstructions() {
	
//		In MacOSX, select the process and click ”Quit Process”.
		String msg = "Open the Activity Monitor \n\n" +
					"Find the two java processes that were created when starting AgentScape \n" +
					"One of them may have changed its name to \"org.iids.aos.AsStartup\" \n\n" +
					"Click \"Quit Process\"  and then \"Quit\" for each process.";
		
		MessageDialog.openInformation(workbenchWindow.getShell(), titleMsg, msg);
	}
	
}