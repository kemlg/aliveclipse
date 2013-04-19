/**
 * 
 */
package net.sf.ictalive.service.matchmakertab.dashboard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.IWizard;

/**
 * @author dcorsar
 * 
 */
public class ValidatePlanTasksAction extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		return AliveDashboardState.VerifyServiceId;
	}

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		URI actionURI = state.getAction();
		if (actionURI == null)
			return null;
		return new InvokeMatchmakerValidationDashboardWizard(actionURI);
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if (state.getAction() == null)
			return "No actions defined";
		return null;
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		// TODO Auto-generated method stub

	}

}
