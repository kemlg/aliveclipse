package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WhileWhileCompartment11CanonicalEditPolicy extends
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
				.getWhileWhileCompartment_7086SemanticChildren(viewObject)
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
		case Assign9EditPart.VISUAL_ID:
		case Compensate9EditPart.VISUAL_ID:
		case CompensateScope9EditPart.VISUAL_ID:
		case Empty9EditPart.VISUAL_ID:
		case Exit9EditPart.VISUAL_ID:
		case ExtensionActivity9EditPart.VISUAL_ID:
		case Flow5EditPart.VISUAL_ID:
		case ForEach7EditPart.VISUAL_ID:
		case If4EditPart.VISUAL_ID:
		case Invoke6EditPart.VISUAL_ID:
		case OpaqueActivity6EditPart.VISUAL_ID:
		case PartnerActivity6EditPart.VISUAL_ID:
		case Pick6EditPart.VISUAL_ID:
		case Receive6EditPart.VISUAL_ID:
		case RepeatUntil6EditPart.VISUAL_ID:
		case Reply5EditPart.VISUAL_ID:
		case Rethrow5EditPart.VISUAL_ID:
		case Scope5EditPart.VISUAL_ID:
		case Sequence2EditPart.VISUAL_ID:
		case Throw5EditPart.VISUAL_ID:
		case Validate5EditPart.VISUAL_ID:
		case Wait5EditPart.VISUAL_ID:
		case While5EditPart.VISUAL_ID:
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
					.getWhile_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
