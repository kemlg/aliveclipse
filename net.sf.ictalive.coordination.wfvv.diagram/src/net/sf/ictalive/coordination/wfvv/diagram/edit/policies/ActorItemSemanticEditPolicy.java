package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionByActorCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionByActorReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActorAgentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActorAgentReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.CommunicativeActReceiverCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.CommunicativeActReceiverReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.CommunicativeActSenderCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.CommunicativeActSenderReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.EventAsserterCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.EventAsserterReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionByActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActReceiverEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActSenderEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventAsserterEditPart;
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
public class ActorItemSemanticEditPolicy extends WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActorItemSemanticEditPolicy() {
		super(WfvvElementTypes.Actor_2026);
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
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == CommunicativeActReceiverEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == CommunicativeActSenderEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == ActionByActorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == EventAsserterEditPart.VISUAL_ID) {
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
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ActorAgentEditPart.VISUAL_ID) {
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
		if (WfvvElementTypes.CommunicativeActReceiver_4011 == req
				.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.CommunicativeActSender_4012 == req
				.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ActionByActor_4014 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.EventAsserter_4019 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ActorAgent_4020 == req.getElementType()) {
			return getGEFWrapper(new ActorAgentCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WfvvElementTypes.CommunicativeActReceiver_4011 == req
				.getElementType()) {
			return getGEFWrapper(new CommunicativeActReceiverCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.CommunicativeActSender_4012 == req
				.getElementType()) {
			return getGEFWrapper(new CommunicativeActSenderCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionByActor_4014 == req.getElementType()) {
			return getGEFWrapper(new ActionByActorCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.EventAsserter_4019 == req.getElementType()) {
			return getGEFWrapper(new EventAsserterCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActorAgent_4020 == req.getElementType()) {
			return null;
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
		case CommunicativeActReceiverEditPart.VISUAL_ID:
			return getGEFWrapper(new CommunicativeActReceiverReorientCommand(
					req));
		case CommunicativeActSenderEditPart.VISUAL_ID:
			return getGEFWrapper(new CommunicativeActSenderReorientCommand(req));
		case ActionByActorEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionByActorReorientCommand(req));
		case EventAsserterEditPart.VISUAL_ID:
			return getGEFWrapper(new EventAsserterReorientCommand(req));
		case ActorAgentEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorAgentReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
