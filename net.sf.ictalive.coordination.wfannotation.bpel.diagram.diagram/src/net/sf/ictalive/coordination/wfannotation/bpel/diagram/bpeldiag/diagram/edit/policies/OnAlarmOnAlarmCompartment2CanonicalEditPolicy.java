package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Assign6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Compensate6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.CompensateScope6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Empty6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Exit6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ExtensionActivity6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Flow4EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ForEach7EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.If9EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Invoke11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.OpaqueActivity11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.PartnerActivity11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Pick11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Receive11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.RepeatUntil10EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Reply11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Rethrow11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Scope11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Sequence6EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Throw11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Validate11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Wait11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.While11EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OnAlarmOnAlarmCompartment2CanonicalEditPolicy extends
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
				.getOnAlarmOnAlarmCompartment_7080SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
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
		case Assign6EditPart.VISUAL_ID:
		case Compensate6EditPart.VISUAL_ID:
		case CompensateScope6EditPart.VISUAL_ID:
		case Empty6EditPart.VISUAL_ID:
		case Exit6EditPart.VISUAL_ID:
		case ExtensionActivity6EditPart.VISUAL_ID:
		case Flow4EditPart.VISUAL_ID:
		case ForEach7EditPart.VISUAL_ID:
		case If9EditPart.VISUAL_ID:
		case Invoke11EditPart.VISUAL_ID:
		case OpaqueActivity11EditPart.VISUAL_ID:
		case PartnerActivity11EditPart.VISUAL_ID:
		case Pick11EditPart.VISUAL_ID:
		case Receive11EditPart.VISUAL_ID:
		case RepeatUntil10EditPart.VISUAL_ID:
		case Reply11EditPart.VISUAL_ID:
		case Rethrow11EditPart.VISUAL_ID:
		case Scope11EditPart.VISUAL_ID:
		case Sequence6EditPart.VISUAL_ID:
		case Throw11EditPart.VISUAL_ID:
		case Validate11EditPart.VISUAL_ID:
		case Wait11EditPart.VISUAL_ID:
		case While11EditPart.VISUAL_ID:
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
					.getOnAlarm_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
