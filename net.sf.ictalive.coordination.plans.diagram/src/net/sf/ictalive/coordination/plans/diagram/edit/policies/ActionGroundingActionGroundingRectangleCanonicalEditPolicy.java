package net.sf.ictalive.coordination.plans.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.plans.diagram.part.CoordinationDiagramUpdater;
import net.sf.ictalive.coordination.plans.diagram.part.CoordinationNodeDescriptor;
import net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.TasksPackage;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActionGroundingActionGroundingRectangleCanonicalEditPolicy extends
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
		for (Iterator it = CoordinationDiagramUpdater
				.getActionGroundingActionGroundingRectangle_7004SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((CoordinationNodeDescriptor) it.next())
					.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = CoordinationVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case InputMessageMapEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(TasksPackage.eINSTANCE
					.getActionGrounding_Input());
		}
		return myFeaturesToSynchronize;
	}

}
