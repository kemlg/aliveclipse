package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Assign12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Compensate12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompensateScope12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Empty12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Exit12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ExtensionActivity12EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Flow8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ForEach10EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.If7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Invoke7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.OpaqueActivity7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PartnerActivity7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Pick7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Receive7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntil7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Reply7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Rethrow7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Scope7EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Sequence3EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Throw8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Validate8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.Wait8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.While8EditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramUpdater;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingNodeDescriptor;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ElseElseCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

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
				.getElseElseCompartment_7053SemanticChildren(viewObject)
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
		case Assign12EditPart.VISUAL_ID:
		case Compensate12EditPart.VISUAL_ID:
		case CompensateScope12EditPart.VISUAL_ID:
		case Empty12EditPart.VISUAL_ID:
		case Exit12EditPart.VISUAL_ID:
		case ExtensionActivity12EditPart.VISUAL_ID:
		case Flow8EditPart.VISUAL_ID:
		case ForEach10EditPart.VISUAL_ID:
		case If7EditPart.VISUAL_ID:
		case Invoke7EditPart.VISUAL_ID:
		case OpaqueActivity7EditPart.VISUAL_ID:
		case PartnerActivity7EditPart.VISUAL_ID:
		case Pick7EditPart.VISUAL_ID:
		case Receive7EditPart.VISUAL_ID:
		case RepeatUntil7EditPart.VISUAL_ID:
		case Reply7EditPart.VISUAL_ID:
		case Rethrow7EditPart.VISUAL_ID:
		case Scope7EditPart.VISUAL_ID:
		case Sequence3EditPart.VISUAL_ID:
		case Throw8EditPart.VISUAL_ID:
		case Validate8EditPart.VISUAL_ID:
		case Wait8EditPart.VISUAL_ID:
		case While8EditPart.VISUAL_ID:
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
					.getElse_Activity());
		}
		return myFeaturesToSynchronize;
	}

}
