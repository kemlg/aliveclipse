package net.sf.ictalive.actions2opera.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.actions2opera.ui.wizards.Actions2OperaTransformationWizard;
import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;

import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

public class Actions2OperaDashboardAction extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.DeriveOrganisationFromActionId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if(state.getAction() != null) return null;//no error reporting, activate the button
		
		return "No action model selected.";
	}

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		if(uriToFile(state.getAction()) == null) { //handle exceptions
			MessageDialog.openError(null, "Project error", "The requested action could not locate the appropriate Action Model.");
		}
		
		Actions2OperaTransformationWizard wizard = new Actions2OperaTransformationWizard(uriToFile(state.getAction()).getFullPath());
		return wizard;
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		state.setOrganisation(URI.createPlatformResourceURI(((Actions2OperaTransformationWizard)wizard).getFileName(), false));
		
	}
}
