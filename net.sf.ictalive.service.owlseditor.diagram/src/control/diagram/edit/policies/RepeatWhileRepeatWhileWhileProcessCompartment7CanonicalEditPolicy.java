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
import control.diagram.edit.parts.AnyOrder5EditPart;
import control.diagram.edit.parts.Choice6EditPart;
import control.diagram.edit.parts.IfThenElse5EditPart;
import control.diagram.edit.parts.Perform4EditPart;
import control.diagram.edit.parts.Produce4EditPart;
import control.diagram.edit.parts.RepeatUntil5EditPart;
import control.diagram.edit.parts.RepeatWhile4EditPart;
import control.diagram.edit.parts.Sequence6EditPart;
import control.diagram.edit.parts.Set4EditPart;
import control.diagram.edit.parts.Split5EditPart;
import control.diagram.edit.parts.SplitJoin5EditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class RepeatWhileRepeatWhileWhileProcessCompartment7CanonicalEditPolicy
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
				.getRepeatWhileRepeatWhileWhileProcessCompartment_7155SemanticChildren(
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
		case Sequence6EditPart.VISUAL_ID:
		case Choice6EditPart.VISUAL_ID:
		case AnyOrder5EditPart.VISUAL_ID:
		case Split5EditPart.VISUAL_ID:
		case SplitJoin5EditPart.VISUAL_ID:
		case IfThenElse5EditPart.VISUAL_ID:
		case RepeatUntil5EditPart.VISUAL_ID:
		case RepeatWhile4EditPart.VISUAL_ID:
		case Perform4EditPart.VISUAL_ID:
		case Produce4EditPart.VISUAL_ID:
		case Set4EditPart.VISUAL_ID:
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
					.getRepeatWhile_WhileProcess());
		}
		return myFeaturesToSynchronize;
	}

}
