package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramUpdater;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvNodeDescriptor;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EventGroupEventGroupCompartmentCanonicalEditPolicy extends
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
		for (Iterator it = WfvvDiagramUpdater
				.getEventGroupEventGroupCompartment_7021SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((WfvvNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = WfvvVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Event3EditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(WfvvPackage.eINSTANCE
					.getEventGroup_Events());
		}
		return myFeaturesToSynchronize;
	}

}
