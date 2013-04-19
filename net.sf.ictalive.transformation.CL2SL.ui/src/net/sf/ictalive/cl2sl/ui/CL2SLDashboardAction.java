package net.sf.ictalive.cl2sl.ui;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.cl2sl.ui.wizards.CL2SLTransformationWizard;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

public class CL2SLDashboardAction extends PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		if(uriToFile(state.getAction()) == null) { //handle exceptions
			MessageDialog.openError(null, "Project error", "The requested action could not locate the appropriate Action Model.");
		}
		
		return new CL2SLTransformationWizard(uriToFile(state.getPlan()).getFullPath());
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dashboardActionId() {
		// attach to the correct link on dashboard
		return AliveDashboardState.DeriveTemplateId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		//report problems
		if(state.getPlan() == null)
			return "No Plan model available for derivation. \nCreate/Set the Coordination Level Plan Model first.";
		return null;
	}

}
