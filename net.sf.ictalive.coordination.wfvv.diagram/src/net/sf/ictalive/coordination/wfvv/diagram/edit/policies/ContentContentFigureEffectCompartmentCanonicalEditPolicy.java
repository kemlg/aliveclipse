package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanScheduleEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramUpdater;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvNodeDescriptor;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ContentContentFigureEffectCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = WfvvDiagramUpdater
				.getContentContentFigureEffectCompartment_7003SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((WfvvNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = WfvvVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case PlanSynthesisEditPart.VISUAL_ID:
		case PlanDistributionEditPart.VISUAL_ID:
		case PlanScheduleEditPart.VISUAL_ID:
		case PlanExecutionEditPart.VISUAL_ID:
		case ServiceInvocationEditPart.VISUAL_ID:
		case ReplaceAgentEditPart.VISUAL_ID:
		case AgentReplanEditPart.VISUAL_ID:
		case NotifyStateOfWorldEditPart.VISUAL_ID:
		case CoordinationActionEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(FactPackage.eINSTANCE
					.getContent_Effect());
		}
		return myFeaturesToSynchronize;
	}

}
