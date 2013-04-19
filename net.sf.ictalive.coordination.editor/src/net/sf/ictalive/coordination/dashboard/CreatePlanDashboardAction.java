/**
 * 
 */
package net.sf.ictalive.coordination.dashboard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.tasks.presentation.PlansModelWizard;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.IWizard;

/**
 * @author dcorsar
 *
 */
public class CreatePlanDashboardAction extends PluggedInWizardDashboardAction<AliveDashboardState> {

	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.WizardDashboardAction#createWizard(net.sf.ictalive.dashboard.DashboardState)
	 */
	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		return new PlansModelWizard();
	}

	
	
	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.WizardDashboardAction#wizardFinished(org.eclipse.jface.wizard.IWizard, net.sf.ictalive.dashboard.DashboardState)
	 */
	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		URI newTarget = URI.createPlatformResourceURI(((PlansModelWizard)wizard).getModelFile().getFullPath().toOSString(), true);
		if (newTarget!=null){
			state.setPlan(newTarget);
		}
	}

	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	@Override
	public String dashboardActionId() {
		return AliveDashboardState.CreatePlanId;
	}
	
	@Override
	public String getProblems(AliveDashboardState state) {
		return null;//always active
	}
}
