package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ElseIfEliseIfCompartmentCanonicalEditPolicy extends
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
				.getElseIfEliseIfCompartment_7049SemanticChildren(viewObject)
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
		case Assign11EditPart.VISUAL_ID:
		case Compensate11EditPart.VISUAL_ID:
		case CompensateScope11EditPart.VISUAL_ID:
		case Empty11EditPart.VISUAL_ID:
		case Exit11EditPart.VISUAL_ID:
		case ExtensionActivity11EditPart.VISUAL_ID:
		case Flow7EditPart.VISUAL_ID:
		case ForEach9EditPart.VISUAL_ID:
		case If6EditPart.VISUAL_ID:
		case Invoke9EditPart.VISUAL_ID:
		case OpaqueActivity9EditPart.VISUAL_ID:
		case PartnerActivity9EditPart.VISUAL_ID:
		case Pick9EditPart.VISUAL_ID:
		case Receive9EditPart.VISUAL_ID:
		case RepeatUntil9EditPart.VISUAL_ID:
		case Reply9EditPart.VISUAL_ID:
		case Rethrow9EditPart.VISUAL_ID:
		case Scope9EditPart.VISUAL_ID:
		case Sequence5EditPart.VISUAL_ID:
		case Throw9EditPart.VISUAL_ID:
		case Validate9EditPart.VISUAL_ID:
		case Wait9EditPart.VISUAL_ID:
		case While9EditPart.VISUAL_ID:
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
					.getElseIf_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
