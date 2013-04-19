package net.sf.ictalive.service.owlseditor.diagram.dashboard;

import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

/**
 * Use either this or the DashboardAction, depending on whether you want the dashboard to create and open the wizard windows, or
 * when your own methods do that work.
 * 
 * Remember to edit the plugin.xml net.sf.ictalive.aliveclipse.dashboard.actions extension point to point to the appropriate class
 */
public class DefineServiceTemplateDashboardWizard extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		// TODO creates and runs the wizard on the dashboard click
		//e.g: return new ControlModelWizard();
		return null;
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		// TODO methods to be invoked after the wizard ends
		
	}

	@Override
	public String dashboardActionId() {
		// links this action to the correct link on the dashboard
		return AliveDashboardState.DefineTemplateId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		// return error message in case of problems; return null to active the link
		// Is this action always active?
		return null;
	}

}
