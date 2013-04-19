/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import java.io.File;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.IWizard;

/**
 * Dashboard action for generating the Multi-Agent System (MAS) Model from the selected
 * OperettA and Action models.
 * 
 * @author dcorsar
 * 
 */
public class GenerateMasDashboardAction extends PluggedInWizardDashboardAction<AliveDashboardState> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	@Override
	public String dashboardActionId() {
		return AliveDashboardState.DeriveMASFromOrganisationAndActionId;
	}

	// @Override
	protected IWizard createWizard(AliveDashboardState state) {
		return new GenerateAgentsModelWizard();
	}

	// @Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		GenerateAgentsModelWizard w = (GenerateAgentsModelWizard)wizard;
		w.setDashboardState(state);
	}

	private File getFile(URI uri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile f = root.getFile(new Path(uri.toPlatformString(true)));
		return f.getLocation().toFile();
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if(null!=state.getOrganisation() && null!=state.getAction()) return null;//no problems, activate button
		
		if(state.getOrganisation() == null) return "No Organisation Model selected.";
		if(state.getAction() == null) return "No Action Model selected.";
		
		return "Error in initialising MAS generation.";//catch others
	}


//	@Override
//	public void run(DashboardState state) {
//		URI opera = state.getOrganisation();
//		if (opera == null) {
//			MessageDialog
//					.openError(null, "Derive Agent Model",
//							"Please select an Organisation Model before deriving an Agent Model");
//			return;
//		}
//		URI actions = state.getAction();
//		if (actions == null) {
//			MessageDialog
//					.openError(null, "Derive Agent Model",
//							"Please select an Action§ Model before deriving an Agent Model");
//			return;
//		}
//
//		IWorkbenchWindow w = Activator.getDefault().getWorkbench()
//				.getActiveWorkbenchWindow();
//
//		AgentsModelWizard wizard = new AgentsModelWizard();
//		WizardDialog dialog = new WizardDialog(new Shell(), wizard);
//		dialog.create();
//		if (dialog.open() == SWT.OK) {
//			IFile masFile = ((AgentsModelWizard) wizard).getModelFile();
//
//			OperaLoaderHandler generator = new OperaLoaderHandler();
//			generator.generateMas(getFile(opera), getFile(actions), masFile,
//					wizard.getContainer().getShell(), true);
//
//			URI newTarget = URI.createPlatformResourceURI(masFile.getFullPath()
//					.toOSString(), true);
//			if (newTarget != null) {
//				state.setAgent(newTarget);
//			}
//		}
//
//	}

}
