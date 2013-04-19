package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OnMessageOnMessageCompartmentCanonicalEditPolicy extends
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
				.getOnMessageOnMessageCompartment_7014SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
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
		case Assign6EditPart.VISUAL_ID:
		case Compensate6EditPart.VISUAL_ID:
		case CompensateScope6EditPart.VISUAL_ID:
		case Empty6EditPart.VISUAL_ID:
		case Exit6EditPart.VISUAL_ID:
		case ExtensionActivity6EditPart.VISUAL_ID:
		case Flow4EditPart.VISUAL_ID:
		case ForEach12EditPart.VISUAL_ID:
		case If10EditPart.VISUAL_ID:
		case Invoke12EditPart.VISUAL_ID:
		case OpaqueActivity12EditPart.VISUAL_ID:
		case PartnerActivity12EditPart.VISUAL_ID:
		case Pick12EditPart.VISUAL_ID:
		case Receive12EditPart.VISUAL_ID:
		case RepeatUntil12EditPart.VISUAL_ID:
		case Reply12EditPart.VISUAL_ID:
		case Rethrow12EditPart.VISUAL_ID:
		case Scope12EditPart.VISUAL_ID:
		case Sequence8EditPart.VISUAL_ID:
		case Throw12EditPart.VISUAL_ID:
		case Validate12EditPart.VISUAL_ID:
		case Wait12EditPart.VISUAL_ID:
		case While12EditPart.VISUAL_ID:
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
