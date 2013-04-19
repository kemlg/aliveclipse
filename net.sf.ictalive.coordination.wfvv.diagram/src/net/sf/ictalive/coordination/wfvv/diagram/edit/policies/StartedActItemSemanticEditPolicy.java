package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionCauseCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionCauseReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactDueToCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactDueToReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactEffectCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactEffectReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactRelateCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactRelateReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionCauseEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactDueToEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactEffectEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactRelateEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StartedActItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StartedActItemSemanticEditPolicy() {
		super(WfvvElementTypes.StartedAct_3003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == FactRelateEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == ActionCauseEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == FactDueToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == FactEffectEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == FactRelateEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WfvvElementTypes.FactDueTo_4001 == req.getElementType()) {
			return getGEFWrapper(new FactDueToCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.FactEffect_4002 == req.getElementType()) {
			return getGEFWrapper(new FactEffectCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.FactRelate_4003 == req.getElementType()) {
			return getGEFWrapper(new FactRelateCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionCause_4016 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WfvvElementTypes.FactDueTo_4001 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.FactEffect_4002 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.FactRelate_4003 == req.getElementType()) {
			return getGEFWrapper(new FactRelateCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionCause_4016 == req.getElementType()) {
			return getGEFWrapper(new ActionCauseCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case FactDueToEditPart.VISUAL_ID:
			return getGEFWrapper(new FactDueToReorientCommand(req));
		case FactEffectEditPart.VISUAL_ID:
			return getGEFWrapper(new FactEffectReorientCommand(req));
		case FactRelateEditPart.VISUAL_ID:
			return getGEFWrapper(new FactRelateReorientCommand(req));
		case ActionCauseEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionCauseReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
