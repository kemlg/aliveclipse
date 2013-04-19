package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.AssignEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScopeEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.EmptyEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.EventHandler2EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExitEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivityEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.FlowEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

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
		for (Iterator it = MappingDiagramUpdater
				.getProcessProcessCompartment_7001SemanticChildren(viewObject)
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
		case AssignEditPart.VISUAL_ID:
		case CompensateEditPart.VISUAL_ID:
		case CompensateScopeEditPart.VISUAL_ID:
		case EmptyEditPart.VISUAL_ID:
		case ExitEditPart.VISUAL_ID:
		case ExtensionActivityEditPart.VISUAL_ID:
		case FlowEditPart.VISUAL_ID:
		case ForEach13EditPart.VISUAL_ID:
		case If11EditPart.VISUAL_ID:
		case Invoke13EditPart.VISUAL_ID:
		case OpaqueActivity13EditPart.VISUAL_ID:
		case PartnerActivity13EditPart.VISUAL_ID:
		case Pick13EditPart.VISUAL_ID:
		case Receive13EditPart.VISUAL_ID:
		case RepeatUntil13EditPart.VISUAL_ID:
		case Reply13EditPart.VISUAL_ID:
		case Rethrow13EditPart.VISUAL_ID:
		case Scope13EditPart.VISUAL_ID:
		case Sequence9EditPart.VISUAL_ID:
		case Throw13EditPart.VISUAL_ID:
		case Validate13EditPart.VISUAL_ID:
		case Wait13EditPart.VISUAL_ID:
		case While13EditPart.VISUAL_ID:
		case EventHandler2EditPart.VISUAL_ID:
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
