package net.sf.ictalive.SL2Actions.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.SL2Actions.ui.wizards.SL2ActionsTransformationWizard;
import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

public class SL2ActionsDashboardWizard extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		return new SL2ActionsTransformationWizard(state.getProject().getFullPath());
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		state.setAction(URI.createPlatformResourceURI((((SL2ActionsTransformationWizard)wizard).getActionFile()),true));
		
	}

	@Override
	public String dashboardActionId() {
		// Link to dashboard action
		return AliveDashboardState.DeriveActionsFromServiceId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		// When should this be activated?
		return null;
	}

}
