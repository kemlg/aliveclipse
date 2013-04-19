package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Assign8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Compensate8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.CompensateScope8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Empty8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Exit8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ExtensionActivity8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ForEach5EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Invoke5EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.OpaqueActivity5EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.PartnerActivity5EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Pick5EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Receive4EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.RepeatUntil3EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Reply2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Rethrow2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Scope2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Throw4EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Validate4EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Wait4EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.While4EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilCompartment3CanonicalEditPolicy extends
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
		for (Iterator it = BpeldiagDiagramUpdater
				.getRepeatUntilRepeatUntilCompartment_7018SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((BpeldiagNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = BpeldiagVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Assign8EditPart.VISUAL_ID:
		case Compensate8EditPart.VISUAL_ID:
		case CompensateScope8EditPart.VISUAL_ID:
		case Empty8EditPart.VISUAL_ID:
		case Exit8EditPart.VISUAL_ID:
		case ExtensionActivity8EditPart.VISUAL_ID:
		case RepeatUntil3EditPart.VISUAL_ID:
		case ForEach5EditPart.VISUAL_ID:
		case Invoke5EditPart.VISUAL_ID:
		case OpaqueActivity5EditPart.VISUAL_ID:
		case PartnerActivity5EditPart.VISUAL_ID:
		case Pick5EditPart.VISUAL_ID:
		case Receive4EditPart.VISUAL_ID:
		case Reply2EditPart.VISUAL_ID:
		case Rethrow2EditPart.VISUAL_ID:
		case Scope2EditPart.VISUAL_ID:
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
					.getRepeatUntil_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
