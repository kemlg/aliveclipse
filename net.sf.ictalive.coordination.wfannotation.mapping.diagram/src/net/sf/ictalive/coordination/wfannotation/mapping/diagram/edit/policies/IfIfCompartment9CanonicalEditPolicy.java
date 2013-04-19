package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ElseEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ElseIfEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class IfIfCompartment9CanonicalEditPolicy extends CanonicalEditPolicy {

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
				.getIfIfCompartment_7081SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
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
		case Assign4EditPart.VISUAL_ID:
		case Compensate4EditPart.VISUAL_ID:
		case CompensateScope4EditPart.VISUAL_ID:
		case Empty4EditPart.VISUAL_ID:
		case Exit4EditPart.VISUAL_ID:
		case ExtensionActivity4EditPart.VISUAL_ID:
		case If2EditPart.VISUAL_ID:
		case ForEach3EditPart.VISUAL_ID:
		case Invoke2EditPart.VISUAL_ID:
		case OpaqueActivity2EditPart.VISUAL_ID:
		case PartnerActivity2EditPart.VISUAL_ID:
		case Pick2EditPart.VISUAL_ID:
		case Receive5EditPart.VISUAL_ID:
		case RepeatUntil5EditPart.VISUAL_ID:
		case Reply6EditPart.VISUAL_ID:
		case Rethrow6EditPart.VISUAL_ID:
		case Scope6EditPart.VISUAL_ID:
		case Throw6EditPart.VISUAL_ID:
		case Validate6EditPart.VISUAL_ID:
		case Wait6EditPart.VISUAL_ID:
		case While6EditPart.VISUAL_ID:
		case ElseIfEditPart.VISUAL_ID:
		case ElseEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(BPELPackage.eINSTANCE.getIf_Activity());
			myFeaturesToSynchronize.add(BPELPackage.eINSTANCE.getIf_ElseIf());
			myFeaturesToSynchronize.add(BPELPackage.eINSTANCE.getIf_Else());
		}
		return myFeaturesToSynchronize;
	}

}
