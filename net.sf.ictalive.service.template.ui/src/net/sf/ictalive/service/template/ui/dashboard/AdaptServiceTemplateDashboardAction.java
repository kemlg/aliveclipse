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
public class AdaptServiceTemplateDashboardAction extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	public String dashboardActionId() {
		// links this action to the correct link on the dashboard
		return AliveDashboardState.ApplyTemplateId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		// return error message in case of problems; return null to active the
		// link
		// Is this action always active?
		return null;
	}

	@Override
	protected IWizard createWizard(AliveDashboardState state) {

		
		 AdaptServiceTemplateDashboardWizard wiz = new
		 AdaptServiceTemplateDashboardWizard(
		 state);
		 return wiz;
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {


	}

}
