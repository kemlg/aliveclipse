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
import control.diagram.edit.parts.AnyOrder3EditPart;
import control.diagram.edit.parts.Choice4EditPart;
import control.diagram.edit.parts.IfThenElse3EditPart;
import control.diagram.edit.parts.Perform2EditPart;
import control.diagram.edit.parts.Produce2EditPart;
import control.diagram.edit.parts.RepeatUntil2EditPart;
import control.diagram.edit.parts.RepeatWhile2EditPart;
import control.diagram.edit.parts.Sequence4EditPart;
import control.diagram.edit.parts.Set2EditPart;
import control.diagram.edit.parts.Split3EditPart;
import control.diagram.edit.parts.SplitJoin3EditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class IfThenElseIfThenElseThenCompartment4CanonicalEditPolicy extends
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
				.getIfThenElseIfThenElseThenCompartment_7043SemanticChildren(
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
		case Sequence4EditPart.VISUAL_ID:
		case Choice4EditPart.VISUAL_ID:
		case AnyOrder3EditPart.VISUAL_ID:
		case Split3EditPart.VISUAL_ID:
		case SplitJoin3EditPart.VISUAL_ID:
		case IfThenElse3EditPart.VISUAL_ID:
		case RepeatUntil2EditPart.VISUAL_ID:
		case RepeatWhile2EditPart.VISUAL_ID:
		case Perform2EditPart.VISUAL_ID:
		case Produce2EditPart.VISUAL_ID:
		case Set2EditPart.VISUAL_ID:
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
					.getIfThenElse_Then());
		}
		return myFeaturesToSynchronize;
	}

}
