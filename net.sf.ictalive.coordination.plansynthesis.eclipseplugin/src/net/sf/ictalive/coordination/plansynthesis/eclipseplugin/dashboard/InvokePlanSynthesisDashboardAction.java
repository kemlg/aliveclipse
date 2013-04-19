/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.dashboard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.Activator;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

/**
 * @author dcorsar
 *
 */
public class InvokePlanSynthesisDashboardAction extends PluggedInWizardDashboardAction<AliveDashboardState> {

	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	@Override
	public String dashboardActionId() {
		return AliveDashboardState.CombinePlanId;
	}

	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#run(net.sf.ictalive.dashboard.DashboardState)
	 */
//	@Override
//	public void run(DashboardState state) {
//		IContainer initialRoot = ResourcesPlugin.getWorkspace().getRoot();
//		Shell shell = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
//		ContainerSelectionDialog c = new ContainerSelectionDialog(shell, initialRoot, true, "Select directory to store new plans in");
//		if (c.open()==ContainerSelectionDialog.OK){
//			Object[] results = c.getResult();
//			if (results!=null && results.length==1){
//				IPath location = null;
//				if (results[0] instanceof IPath){
//					location  = (IPath)results[0];
//				} else if (results[0] instanceof IResource){
//					location = ((IResource)results[0]).getLocation();
//				}
//				
//			}
//		}
//	}

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		return new InvokePlanSynthesisComponentDashboardWizard(state);
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if(state.getAction() != null && state.getTask()!=null) return null;//no problems, active button
		
		if(state.getAction() == null) return "No Action Model selected.";
		if(state.getTask() == null) return "No Task Model selected.";
		
		return "Error initialising Plan Synthesis.";//catch others
	}
}
