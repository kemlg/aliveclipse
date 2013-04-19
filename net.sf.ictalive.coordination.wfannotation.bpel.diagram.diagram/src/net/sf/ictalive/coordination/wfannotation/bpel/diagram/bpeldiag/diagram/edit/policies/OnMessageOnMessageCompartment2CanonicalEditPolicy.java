package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Assign7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Compensate7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.CompensateScope7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Empty7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Exit7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ExtensionActivity7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Flow5EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ForEach13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.If11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Invoke13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.OpaqueActivity13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.PartnerActivity13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Pick13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Receive13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.RepeatUntil12EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Reply13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Rethrow13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Scope13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Sequence8EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Throw13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Validate13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Wait13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.While13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OnMessageOnMessageCompartment2CanonicalEditPolicy extends
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
				.getOnMessageOnMessageCompartment_7115SemanticChildren(
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
		case Assign7EditPart.VISUAL_ID:
		case Compensate7EditPart.VISUAL_ID:
		case CompensateScope7EditPart.VISUAL_ID:
		case Empty7EditPart.VISUAL_ID:
		case Exit7EditPart.VISUAL_ID:
		case ExtensionActivity7EditPart.VISUAL_ID:
		case Flow5EditPart.VISUAL_ID:
		case ForEach13EditPart.VISUAL_ID:
		case If11EditPart.VISUAL_ID:
		case Invoke13EditPart.VISUAL_ID:
		case OpaqueActivity13EditPart.VISUAL_ID:
		case PartnerActivity13EditPart.VISUAL_ID:
		case Pick13EditPart.VISUAL_ID:
		case Receive13EditPart.VISUAL_ID:
		case RepeatUntil12EditPart.VISUAL_ID:
		case Reply13EditPart.VISUAL_ID:
		case Rethrow13EditPart.VISUAL_ID:
		case Scope13EditPart.VISUAL_ID:
		case Sequence8EditPart.VISUAL_ID:
		case Throw13EditPart.VISUAL_ID:
		case Validate13EditPart.VISUAL_ID:
		case Wait13EditPart.VISUAL_ID:
		case While13EditPart.VISUAL_ID:
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
					.getOnMessage_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
