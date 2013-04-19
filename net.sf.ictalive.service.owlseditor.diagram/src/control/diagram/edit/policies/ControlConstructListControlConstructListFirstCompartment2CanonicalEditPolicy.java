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
import control.diagram.edit.parts.AnyOrder7EditPart;
import control.diagram.edit.parts.Choice2EditPart;
import control.diagram.edit.parts.IfThenElse7EditPart;
import control.diagram.edit.parts.Perform7EditPart;
import control.diagram.edit.parts.Produce7EditPart;
import control.diagram.edit.parts.RepeatUntil7EditPart;
import control.diagram.edit.parts.RepeatWhile7EditPart;
import control.diagram.edit.parts.Sequence2EditPart;
import control.diagram.edit.parts.Set7EditPart;
import control.diagram.edit.parts.Split7EditPart;
import control.diagram.edit.parts.SplitJoin7EditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlConstructListControlConstructListFirstCompartment2CanonicalEditPolicy
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
				.getControlConstructListControlConstructListFirstCompartment_7088SemanticChildren(
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
		case Sequence2EditPart.VISUAL_ID:
		case Choice2EditPart.VISUAL_ID:
		case AnyOrder7EditPart.VISUAL_ID:
		case Split7EditPart.VISUAL_ID:
		case SplitJoin7EditPart.VISUAL_ID:
		case IfThenElse7EditPart.VISUAL_ID:
		case RepeatUntil7EditPart.VISUAL_ID:
		case RepeatWhile7EditPart.VISUAL_ID:
		case Perform7EditPart.VISUAL_ID:
		case Produce7EditPart.VISUAL_ID:
		case Set7EditPart.VISUAL_ID:
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
					.getControlConstructList_First());
		}
		return myFeaturesToSynchronize;
	}

}
