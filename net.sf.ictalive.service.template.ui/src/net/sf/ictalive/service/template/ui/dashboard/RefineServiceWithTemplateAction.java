package net.sf.ictalive.service.template.ui.dashboard;

import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

/**
 * Use either this or the DashboardWizard, depending on whether you want to use
 * your own methods for creating and opening the wizard widows, or let the
 * dashboard do that work.
 * 
 * Remember to edit the plugin.xml net.sf.ictalive.aliveclipse.dashboard.actions
 * extension point to point to the appropriate class
 */
public class RefineServiceWithTemplateAction extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		// links this action to the correct link on the dashboard
		return AliveDashboardState.RefineTemplateId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {

		return null;
	}

	@Override
	protected IWizard createWizard(AliveDashboardState state) {

		RefineServiceWithTemplateWizard wiz = new RefineServiceWithTemplateWizard();
		return wiz;
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		// TODO Auto-generated method stub

	}

}
