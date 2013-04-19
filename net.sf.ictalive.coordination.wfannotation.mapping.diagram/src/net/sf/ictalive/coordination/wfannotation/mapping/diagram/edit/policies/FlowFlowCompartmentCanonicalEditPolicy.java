package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEachEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ReceiveEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FlowFlowCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

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
				.getFlowFlowCompartment_7002SemanticChildren(viewObject)
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
		case Assign2EditPart.VISUAL_ID:
		case Compensate2EditPart.VISUAL_ID:
		case CompensateScope2EditPart.VISUAL_ID:
		case Empty2EditPart.VISUAL_ID:
		case Exit2EditPart.VISUAL_ID:
		case ExtensionActivity2EditPart.VISUAL_ID:
		case Flow2EditPart.VISUAL_ID:
		case ForEachEditPart.VISUAL_ID:
		case If3EditPart.VISUAL_ID:
		case Invoke3EditPart.VISUAL_ID:
		case OpaqueActivity3EditPart.VISUAL_ID:
		case PartnerActivity3EditPart.VISUAL_ID:
		case Pick3EditPart.VISUAL_ID:
		case ReceiveEditPart.VISUAL_ID:
		case RepeatUntil2EditPart.VISUAL_ID:
		case Reply4EditPart.VISUAL_ID:
		case Rethrow4EditPart.VISUAL_ID:
		case Scope4EditPart.VISUAL_ID:
		case Throw4EditPart.VISUAL_ID:
		case Validate4EditPart.VISUAL_ID:
		case Wait4EditPart.VISUAL_ID:
		case While4EditPart.VISUAL_ID:
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
					.getFlow_Activities());
		}
		return myFeaturesToSynchronize;
	}

}
