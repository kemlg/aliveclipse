package net.sf.ictalive.operetta.OM.diagram.is.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperADiagramUpdater;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperANodeDescriptor;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LandmarkPatternLandmarkPatternCompartmentCanonicalEditPolicy
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
		for (Iterator it = OperADiagramUpdater
				.getLandmarkPatternLandmarkPatternCompartment_7102SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((OperANodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = OperAVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case LandmarkEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(OMPackage.eINSTANCE
					.getLandmarkPattern_Landmarks());
		}
		return myFeaturesToSynchronize;
	}

}
