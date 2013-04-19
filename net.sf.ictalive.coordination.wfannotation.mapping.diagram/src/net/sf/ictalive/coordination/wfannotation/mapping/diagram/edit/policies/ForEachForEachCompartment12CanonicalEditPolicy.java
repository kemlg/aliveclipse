package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.IfEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.InvokeEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivityEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivityEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PickEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil4EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ForEachForEachCompartment12CanonicalEditPolicy extends
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
				.getForEachForEachCompartment_7087SemanticChildren(viewObject)
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
		case Assign3EditPart.VISUAL_ID:
		case Compensate3EditPart.VISUAL_ID:
		case CompensateScope3EditPart.VISUAL_ID:
		case Empty3EditPart.VISUAL_ID:
		case Exit3EditPart.VISUAL_ID:
		case ExtensionActivity3EditPart.VISUAL_ID:
		case ForEach2EditPart.VISUAL_ID:
		case IfEditPart.VISUAL_ID:
		case InvokeEditPart.VISUAL_ID:
		case OpaqueActivityEditPart.VISUAL_ID:
		case PartnerActivityEditPart.VISUAL_ID:
		case PickEditPart.VISUAL_ID:
		case Receive2EditPart.VISUAL_ID:
		case RepeatUntil4EditPart.VISUAL_ID:
		case Reply2EditPart.VISUAL_ID:
		case Rethrow2EditPart.VISUAL_ID:
		case Scope3EditPart.VISUAL_ID:
		case Throw2EditPart.VISUAL_ID:
		case Validate2EditPart.VISUAL_ID:
		case Wait2EditPart.VISUAL_ID:
		case While2EditPart.VISUAL_ID:
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
					.getForEach_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
