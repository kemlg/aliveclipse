package net.sf.ictalive.log.analysis_v2.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.log.analysis_v2.AnalyseLogWizard;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

public class OfflineAnalysisDashboardAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	String problem = "Error in Offline Analysis.";
	
	
	@Override
	public String dashboardActionId() {
		// Links this action to the correct runtime-dashboard button
		return RuntimeDashboardState.OfflineAnalysisId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		if(state == null) return "Error in Run time Dashboard State (state is null)";
		
		// Returns null to set the button to "active", otherwise, clicking the greyed button will display the returned message
		return null; 
	}

	@Override
	public void run(RuntimeDashboardState state) {
		// TODO fill with calls to load/start the offline analysis tool(s).
		
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		Shell shell = workbenchWindow.getShell();
		
		/*
		final AnalyseLogWizard wizard = new AnalyseLogWizard();
		if (wizard instanceof IWorkbenchWizard) {
			((IWorkbenchWizard) wizard).init(PlatformUI.getWorkbench(), getSelection());
		}
		WizardDialog dialog = new WizardDialog(shell, wizard) {

			protected void finishPressed() {
				wizardFinished(wizard);
				super.finishPressed();
			}
		};
		dialog.create();
		dialog.getShell().setSize(Math.max(SIZING_WIZARD_WIDTH, dialog.getShell().getSize().x), SIZING_WIZARD_HEIGHT);
		dialog.open();*/
		
		// Instantiates and initializes the wizard
		final AnalyseLogWizard wizard  = new AnalyseLogWizard();
		if(wizard == null) problem = "NULL wizard";
		wizard.init(PlatformUI.getWorkbench(), new StructuredSelection());
		WizardDialog dialog = new WizardDialog(shell, wizard) { //HandlerUtil.getActiveShell(event), wizard);
			protected void finishPressed() {
				wizardFinished(wizard);
				super.finishPressed();
			}
		};
		if(dialog == null) problem = "NULL dialog";
		dialog.create();
		dialog.open();
		
	}
	protected void wizardFinished(IWizard wizard) {
	}
	
	protected IStructuredSelection getSelection() {
		List<IFile> selection = new ArrayList<IFile>();
		return new StructuredSelection(selection);
	}
}
