/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import java.io.File;

import net.sf.ictalive.coordination.agents.diagram.oaw.util.AntUtils;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.FileUtils;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

import org.apache.tools.ant.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

import sun.security.provider.MD2;

/**
 * Dashboard action for injecting the agent code into the started
 * Agent Platform
 * 
 * @author achorley
 * 
 */
public class InjectMASDashboardAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.InjectMASId;
	}

	
	@Override
	public String getProblems(RuntimeDashboardState state) {

		// TODO Auto-generated method stub
		//only active when Agentscape running
//		String status = state.getAgentPlatformStatus();
//		if(status.equals(RuntimeDashboardState.STATUS_GREEN))
//			return null;
//		else
//			return "AgentScape not running";
		
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
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		Shell shell = workbenchWindow.getShell();
		

		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				shell, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		File destDir = new File(PathUtils.getAgentScapePath()
				+ "/input/CoordinationModel");
	
		boolean reply = MessageDialog.open(MessageDialog.QUESTION_WITH_CANCEL, workbenchWindow.getShell(), 
				"Start AgentScape", "Do you want to start AgentScape with a specified task and plan?", SWT.NONE);
		if(reply == true)
			{
//start of copy task and plan		
			// ask user to select the plan file
			IFile planFile = promptForFile(dialog, "Select Plan file",
					"Select a plan file (extension .plans) containing the plan to enact");
	
			if (planFile == null) {
				return;
			}
	
			// ask user to select the task file
			IFile taskFile = promptForFile(dialog, "Select Task file",
					"Select a task file (extension .tasks) containing the task to achieve");
	
			if (taskFile == null || !FileUtils.copy(planFile, destDir) || !FileUtils.copy(taskFile, destDir)) {
				return;
		}
//end of copy task and plan
			}
		else
			{
			
			}
		
//		File buildFile = new File("/Users/alisonchorley/MINE/work/alive/code/AgentScape093/runAgentScape_build.xml");
		
		File buildFile = new File(PathUtils.getAgentScapePath() + File.separatorChar + PathUtils.getInjectAgentsBuildFileName());
System.out.println(PathUtils.getAgentScapePath() + File.separatorChar + PathUtils.getInjectAgentsBuildFileName());
		Project p = AntUtils.createAnyProject(buildFile);
		AntUtils.setAgentscapeBuildProperties(p);
		AntUtils.run(p);
	
		}

	private IFile promptForFile(ResourceListSelectionDialog dialog,
			String dialogTitle, String dialogMessage) {
		dialog.setTitle(dialogTitle);
		dialog.setMessage(dialogMessage);
		int open = dialog.open();
		if (open == ResourceListSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				IFile selectedFile = (IFile) result[0];
				return selectedFile;
			}
		}
		return null;
	}
	




}