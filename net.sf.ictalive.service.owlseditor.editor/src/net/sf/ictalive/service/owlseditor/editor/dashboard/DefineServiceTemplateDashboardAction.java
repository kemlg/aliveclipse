package net.sf.ictalive.service.owlseditor.editor.dashboard;

import org.eclipse.jface.wizard.IWizard;

import control.presentation.ControlModelWizard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

/**
 * Use either this or the DashboardWizard, depending on whether you want to use your own methods for creating and opening the wizard widows, or
 * let the dashboard do that work.
 * 
 * Remember to edit the plugin.xml net.sf.ictalive.aliveclipse.dashboard.actions extension point to point to the appropriate class
 *
 *
 * @generated NOT
 */
public class DefineServiceTemplateDashboardAction extends
		PluggedInWizardDashboardAction<AliveDashboardState> {

	
	@Override
	public String dashboardActionId() {
		// TODO Auto-generated method stub
		return AliveDashboardState.DefineTemplateId;
		}

	@Override
	public String getProblems(AliveDashboardState state) {
		// return error message in case of problems; return null to active the link
		// Is this action always active?
		return null;
	}


	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		// TODO Auto-generated method stub
		ControlModelWizard wizard = new ControlModelWizard();
		// TODO Implement in our wizard
		//wizard.setProject(state.getProject());
		return wizard;	
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		// TODO Auto-generated method stub
		
	}

	

}
