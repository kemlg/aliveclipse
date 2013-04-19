package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity13EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If9EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While11EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OnEventOnEventCompartmentCanonicalEditPolicy extends
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
				.getOnEventOnEventCompartment_7078SemanticChildren(viewObject)
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
		case Assign13EditPart.VISUAL_ID:
		case Compensate13EditPart.VISUAL_ID:
		case CompensateScope13EditPart.VISUAL_ID:
		case Empty13EditPart.VISUAL_ID:
		case Exit13EditPart.VISUAL_ID:
		case ExtensionActivity13EditPart.VISUAL_ID:
		case Flow9EditPart.VISUAL_ID:
		case ForEach11EditPart.VISUAL_ID:
		case If9EditPart.VISUAL_ID:
		case Invoke11EditPart.VISUAL_ID:
		case OpaqueActivity11EditPart.VISUAL_ID:
		case PartnerActivity11EditPart.VISUAL_ID:
		case Pick11EditPart.VISUAL_ID:
		case Receive11EditPart.VISUAL_ID:
		case RepeatUntil11EditPart.VISUAL_ID:
		case Reply11EditPart.VISUAL_ID:
		case Rethrow11EditPart.VISUAL_ID:
		case Scope11EditPart.VISUAL_ID:
		case Sequence7EditPart.VISUAL_ID:
		case Throw11EditPart.VISUAL_ID:
		case Validate11EditPart.VISUAL_ID:
		case Wait11EditPart.VISUAL_ID:
		case While11EditPart.VISUAL_ID:
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
					.getOnEvent_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
