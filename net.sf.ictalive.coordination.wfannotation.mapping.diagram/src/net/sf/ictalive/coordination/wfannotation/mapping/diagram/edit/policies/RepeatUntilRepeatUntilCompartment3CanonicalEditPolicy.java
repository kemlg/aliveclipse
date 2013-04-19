package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ReplyEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RethrowEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ScopeEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

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
		for (Iterator it = MappingDiagramUpdater
				.getRepeatUntilRepeatUntilCompartment_7020SemanticChildren(
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
		case Assign7EditPart.VISUAL_ID:
		case Compensate7EditPart.VISUAL_ID:
		case CompensateScope7EditPart.VISUAL_ID:
		case Empty7EditPart.VISUAL_ID:
		case Exit7EditPart.VISUAL_ID:
		case ExtensionActivity7EditPart.VISUAL_ID:
		case RepeatUntil3EditPart.VISUAL_ID:
		case ForEach4EditPart.VISUAL_ID:
		case Invoke4EditPart.VISUAL_ID:
		case OpaqueActivity4EditPart.VISUAL_ID:
		case PartnerActivity4EditPart.VISUAL_ID:
		case Pick4EditPart.VISUAL_ID:
		case Receive3EditPart.VISUAL_ID:
		case ReplyEditPart.VISUAL_ID:
		case RethrowEditPart.VISUAL_ID:
		case ScopeEditPart.VISUAL_ID:
		case Throw3EditPart.VISUAL_ID:
		case Validate3EditPart.VISUAL_ID:
		case Wait3EditPart.VISUAL_ID:
		case While3EditPart.VISUAL_ID:
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
