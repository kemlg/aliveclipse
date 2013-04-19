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
import control.diagram.edit.parts.AnyOrder4EditPart;
import control.diagram.edit.parts.Choice5EditPart;
import control.diagram.edit.parts.IfThenElse4EditPart;
import control.diagram.edit.parts.Perform3EditPart;
import control.diagram.edit.parts.Produce3EditPart;
import control.diagram.edit.parts.RepeatUntil4EditPart;
import control.diagram.edit.parts.RepeatWhile3EditPart;
import control.diagram.edit.parts.Sequence5EditPart;
import control.diagram.edit.parts.Set3EditPart;
import control.diagram.edit.parts.Split4EditPart;
import control.diagram.edit.parts.SplitJoin4EditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilUntilProcessCompartment4CanonicalEditPolicy
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
				.getRepeatUntilRepeatUntilUntilProcessCompartment_7139SemanticChildren(
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
		case Sequence5EditPart.VISUAL_ID:
		case Choice5EditPart.VISUAL_ID:
		case AnyOrder4EditPart.VISUAL_ID:
		case Split4EditPart.VISUAL_ID:
		case SplitJoin4EditPart.VISUAL_ID:
		case IfThenElse4EditPart.VISUAL_ID:
		case RepeatUntil4EditPart.VISUAL_ID:
		case RepeatWhile3EditPart.VISUAL_ID:
		case Perform3EditPart.VISUAL_ID:
		case Produce3EditPart.VISUAL_ID:
		case Set3EditPart.VISUAL_ID:
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
					.getRepeatUntil_UntilProcess());
		}
		return myFeaturesToSynchronize;
	}

}
