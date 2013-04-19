package net.sf.ictalive.operetta.editor.dashboard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;
import net.sf.ictalive.operetta.OM.presentation.OMModelWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class CreateOrganisationDashboardAction extends PluggedInWizardDashboardAction<AliveDashboardState> {

	public String dashboardActionId() {
		return AliveDashboardState.CreateOrganisationId;
	}
	
	public String getProblems(AliveDashboardState state) {
		return null;
	}

	protected IWizard createWizard(AliveDashboardState state) {
		OMModelWizard wizard = new OMModelWizard();
	
		wizard.setProject(state.getProject());
		return wizard;	
	}
	
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		IFile newOrganisationFile = ((OMModelWizard) wizard).getModelFile();
		if (newOrganisationFile != null)
			state.setOrganisation( fileToURI(newOrganisationFile) );		
	}
}
