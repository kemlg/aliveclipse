package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Assign2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Compensate2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.CompensateScope2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Empty2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.EventHandler3EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Exit2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ExtensionActivity2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Flow2EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.ForEach14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.If12EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Invoke14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.OpaqueActivity14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.PartnerActivity14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Pick14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Receive14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.RepeatUntil13EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Reply14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Rethrow14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Scope14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Sequence9EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Throw14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Validate14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.Wait14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.While14EditPart;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ProcessProcessCompartmentCanonicalEditPolicy extends
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
				.getProcessProcessCompartment_7001SemanticChildren(viewObject)
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
		case Assign2EditPart.VISUAL_ID:
		case Compensate2EditPart.VISUAL_ID:
		case CompensateScope2EditPart.VISUAL_ID:
		case Empty2EditPart.VISUAL_ID:
		case Exit2EditPart.VISUAL_ID:
		case ExtensionActivity2EditPart.VISUAL_ID:
		case Flow2EditPart.VISUAL_ID:
		case ForEach14EditPart.VISUAL_ID:
		case If12EditPart.VISUAL_ID:
		case Invoke14EditPart.VISUAL_ID:
		case OpaqueActivity14EditPart.VISUAL_ID:
		case PartnerActivity14EditPart.VISUAL_ID:
		case Pick14EditPart.VISUAL_ID:
		case Receive14EditPart.VISUAL_ID:
		case RepeatUntil13EditPart.VISUAL_ID:
		case Reply14EditPart.VISUAL_ID:
		case Rethrow14EditPart.VISUAL_ID:
		case Scope14EditPart.VISUAL_ID:
		case Sequence9EditPart.VISUAL_ID:
		case Throw14EditPart.VISUAL_ID:
		case Validate14EditPart.VISUAL_ID:
		case Wait14EditPart.VISUAL_ID:
		case While14EditPart.VISUAL_ID:
		case EventHandler3EditPart.VISUAL_ID:
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
					.getProcess_Activity());
			myFeaturesToSynchronize.add(BPELPackage.eINSTANCE
					.getProcess_EventHandlers());
		}
		return myFeaturesToSynchronize;
	}

}
