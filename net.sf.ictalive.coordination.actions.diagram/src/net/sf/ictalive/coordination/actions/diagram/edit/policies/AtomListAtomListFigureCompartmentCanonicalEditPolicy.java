package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.actions.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationDiagramUpdater;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationNodeDescriptor;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AtomListAtomListFigureCompartmentCanonicalEditPolicy extends
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
				.getAtomListAtomListFigureCompartment_7034SemanticChildren(
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
		case ClassAtomEditPart.VISUAL_ID:
		case IndividualPropertyAtomEditPart.VISUAL_ID:
		case SameIndividualAtomEditPart.VISUAL_ID:
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
		case BuiltInAtomEditPart.VISUAL_ID:
		case DataRangeAtomEditPart.VISUAL_ID:
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(SwrlPackage.eINSTANCE
					.getAtomList_Atom());
		}
		return myFeaturesToSynchronize;
	}

}
