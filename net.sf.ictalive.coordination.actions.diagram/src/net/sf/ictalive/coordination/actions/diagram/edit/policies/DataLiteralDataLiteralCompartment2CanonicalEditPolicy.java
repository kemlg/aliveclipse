package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationDiagramUpdater;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationNodeDescriptor;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataLiteralDataLiteralCompartment2CanonicalEditPolicy extends
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
				.getDataLiteralDataLiteralCompartment_7044SemanticChildren(
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
		case DataValueEditPart.VISUAL_ID:
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
					.getDataLiteral_DataValue());
		}
		return myFeaturesToSynchronize;
	}

}
