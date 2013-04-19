package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.EventHandlerEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ThrowEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ValidateEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.WaitEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.WhileEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ScopeScopeCompartment7CanonicalEditPolicy extends
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
		for (Iterator it = MappingDiagramUpdater
				.getScopeScopeCompartment_7059SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
			result.add(((MappingNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = MappingVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Assign8EditPart.VISUAL_ID:
		case Compensate8EditPart.VISUAL_ID:
		case CompensateScope8EditPart.VISUAL_ID:
		case Empty8EditPart.VISUAL_ID:
		case Exit8EditPart.VISUAL_ID:
		case ExtensionActivity8EditPart.VISUAL_ID:
		case Scope2EditPart.VISUAL_ID:
		case ForEach5EditPart.VISUAL_ID:
		case Invoke5EditPart.VISUAL_ID:
		case OpaqueActivity5EditPart.VISUAL_ID:
		case PartnerActivity5EditPart.VISUAL_ID:
		case Pick5EditPart.VISUAL_ID:
		case Receive4EditPart.VISUAL_ID:
		case Reply3EditPart.VISUAL_ID:
		case Rethrow3EditPart.VISUAL_ID:
		case ThrowEditPart.VISUAL_ID:
		case ValidateEditPart.VISUAL_ID:
		case WaitEditPart.VISUAL_ID:
		case WhileEditPart.VISUAL_ID:
		case EventHandlerEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(BPELPackage.eINSTANCE
					.getScope_Activity());
			myFeaturesToSynchronize.add(BPELPackage.eINSTANCE
					.getScope_EventHandlers());
		}
		return myFeaturesToSynchronize;
	}

}
