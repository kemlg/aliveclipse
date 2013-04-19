/*
 * 
 */
package control.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import control.ControlPackage;
import control.diagram.edit.parts.AnyOrder2EditPart;
import control.diagram.edit.parts.Choice3EditPart;
import control.diagram.edit.parts.IfThenElse2EditPart;
import control.diagram.edit.parts.Perform6EditPart;
import control.diagram.edit.parts.Produce6EditPart;
import control.diagram.edit.parts.RepeatUntil6EditPart;
import control.diagram.edit.parts.RepeatWhile6EditPart;
import control.diagram.edit.parts.Sequence3EditPart;
import control.diagram.edit.parts.Set6EditPart;
import control.diagram.edit.parts.Split2EditPart;
import control.diagram.edit.parts.SplitJoin2EditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlConstructBagControlConstructBagFirstCompartmentCanonicalEditPolicy
		extends CanonicalEditPolicy {

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
		for (Iterator it = ControlDiagramUpdater
				.getControlConstructBagControlConstructBagFirstCompartment_7006SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((ControlNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = ControlVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Sequence3EditPart.VISUAL_ID:
		case Choice3EditPart.VISUAL_ID:
		case AnyOrder2EditPart.VISUAL_ID:
		case Split2EditPart.VISUAL_ID:
		case SplitJoin2EditPart.VISUAL_ID:
		case IfThenElse2EditPart.VISUAL_ID:
		case RepeatUntil6EditPart.VISUAL_ID:
		case RepeatWhile6EditPart.VISUAL_ID:
		case Perform6EditPart.VISUAL_ID:
		case Produce6EditPart.VISUAL_ID:
		case Set6EditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(ControlPackage.eINSTANCE
					.getControlConstructBag_First());
		}
		return myFeaturesToSynchronize;
	}

}
