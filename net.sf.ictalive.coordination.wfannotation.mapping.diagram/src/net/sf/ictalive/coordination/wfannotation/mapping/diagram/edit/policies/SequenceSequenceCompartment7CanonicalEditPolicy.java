package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SequenceSequenceCompartment7CanonicalEditPolicy extends
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
				.getSequenceSequenceCompartment_7092SemanticChildren(viewObject)
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
		case Assign10EditPart.VISUAL_ID:
		case Compensate10EditPart.VISUAL_ID:
		case CompensateScope10EditPart.VISUAL_ID:
		case Empty10EditPart.VISUAL_ID:
		case Exit10EditPart.VISUAL_ID:
		case ExtensionActivity10EditPart.VISUAL_ID:
		case Flow6EditPart.VISUAL_ID:
		case ForEach8EditPart.VISUAL_ID:
		case If5EditPart.VISUAL_ID:
		case Invoke8EditPart.VISUAL_ID:
		case OpaqueActivity8EditPart.VISUAL_ID:
		case PartnerActivity8EditPart.VISUAL_ID:
		case Pick8EditPart.VISUAL_ID:
		case Receive8EditPart.VISUAL_ID:
		case RepeatUntil8EditPart.VISUAL_ID:
		case Reply8EditPart.VISUAL_ID:
		case Rethrow8EditPart.VISUAL_ID:
		case Scope8EditPart.VISUAL_ID:
		case Sequence4EditPart.VISUAL_ID:
		case Throw7EditPart.VISUAL_ID:
		case Validate7EditPart.VISUAL_ID:
		case Wait7EditPart.VISUAL_ID:
		case While7EditPart.VISUAL_ID:
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
					.getSequence_Activities());
		}
		return myFeaturesToSynchronize;
	}

}
