package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity5EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence6EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

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
		for (Iterator it = MappingDiagramUpdater
				.getOnAlarmOnAlarmCompartment_7031SemanticChildren(viewObject)
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
		case Assign5EditPart.VISUAL_ID:
		case Compensate5EditPart.VISUAL_ID:
		case CompensateScope5EditPart.VISUAL_ID:
		case Empty5EditPart.VISUAL_ID:
		case Exit5EditPart.VISUAL_ID:
		case ExtensionActivity5EditPart.VISUAL_ID:
		case Flow3EditPart.VISUAL_ID:
		case ForEach6EditPart.VISUAL_ID:
		case If8EditPart.VISUAL_ID:
		case Invoke10EditPart.VISUAL_ID:
		case OpaqueActivity10EditPart.VISUAL_ID:
		case PartnerActivity10EditPart.VISUAL_ID:
		case Pick10EditPart.VISUAL_ID:
		case Receive10EditPart.VISUAL_ID:
		case RepeatUntil10EditPart.VISUAL_ID:
		case Reply10EditPart.VISUAL_ID:
		case Rethrow10EditPart.VISUAL_ID:
		case Scope10EditPart.VISUAL_ID:
		case Sequence6EditPart.VISUAL_ID:
		case Throw10EditPart.VISUAL_ID:
		case Validate10EditPart.VISUAL_ID:
		case Wait10EditPart.VISUAL_ID:
		case While10EditPart.VISUAL_ID:
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
