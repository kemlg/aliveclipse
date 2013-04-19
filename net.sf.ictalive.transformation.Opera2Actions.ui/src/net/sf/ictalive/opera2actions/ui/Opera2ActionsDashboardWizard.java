package net.sf.ictalive.opera2actions.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;
import net.sf.ictalive.opera2actions.ui.wizards.Opera2ActionsTransformationWizard;

public class Opera2ActionsDashboardWizard extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.DeriveActionFromOrganisationId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if (state.getOrganisation() != null) return null;//no error to report, activate the button
		
		return "No organisation model selected.";
	}

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		if(uriToFile(state.getAction()) == null) { //handle exceptions
			MessageDialog.openError(null, "Project error", "The requested action could not locate the appropriate Action Model.");
		}
		
		return new Opera2ActionsTransformationWizard(uriToFile(state.getOrganisation()).getFullPath());
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		state.setAction(URI.createPlatformResourceURI((((Opera2ActionsTransformationWizard) wizard).getFileName()),false));
		
	}
	
}
