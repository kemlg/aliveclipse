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
import control.diagram.edit.parts.AnyOrder6EditPart;
import control.diagram.edit.parts.Choice7EditPart;
import control.diagram.edit.parts.IfThenElse6EditPart;
import control.diagram.edit.parts.Perform5EditPart;
import control.diagram.edit.parts.Produce5EditPart;
import control.diagram.edit.parts.RepeatUntil3EditPart;
import control.diagram.edit.parts.RepeatWhile5EditPart;
import control.diagram.edit.parts.Sequence7EditPart;
import control.diagram.edit.parts.Set5EditPart;
import control.diagram.edit.parts.Split6EditPart;
import control.diagram.edit.parts.SplitJoin6EditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class IfThenElseIfThenElseElseCompartment3CanonicalEditPolicy extends
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
		for (Iterator it = ControlDiagramUpdater
				.getIfThenElseIfThenElseElseCompartment_7132SemanticChildren(
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
		case Sequence7EditPart.VISUAL_ID:
		case Choice7EditPart.VISUAL_ID:
		case AnyOrder6EditPart.VISUAL_ID:
		case Split6EditPart.VISUAL_ID:
		case SplitJoin6EditPart.VISUAL_ID:
		case IfThenElse6EditPart.VISUAL_ID:
		case RepeatUntil3EditPart.VISUAL_ID:
		case RepeatWhile5EditPart.VISUAL_ID:
		case Perform5EditPart.VISUAL_ID:
		case Produce5EditPart.VISUAL_ID:
		case Set5EditPart.VISUAL_ID:
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
					.getIfThenElse_Else());
		}
		return myFeaturesToSynchronize;
	}

}
