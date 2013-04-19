package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionByActorCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionByActorReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionCauseCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionCauseReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionEnactmentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionEnactmentReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactDueToCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactDueToReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactEffectCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FactEffectReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ServiceInvocationEnactingAgentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ServiceInvocationEnactingAgentReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionByActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionCauseEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactDueToEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactEffectEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ParameterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResultEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEnactingAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationServiceInvocationCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ServiceInvocationItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceInvocationItemSemanticEditPolicy() {
		super(WfvvElementTypes.ServiceInvocation_3021);
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
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == FactDueToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == FactEffectEditPart.VISUAL_ID) {
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
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ServiceInvocationEnactingAgentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ActionByActorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ActionEnactmentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ActionCauseEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (WfvvVisualIDRegistry.getVisualID(node)) {
			case ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (WfvvVisualIDRegistry.getVisualID(cnode)) {
					case ParameterEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ResultEditPart.VISUAL_ID:
						for (Iterator it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (WfvvVisualIDRegistry.getVisualID(incomingLink) == FailureActReasonEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (WfvvVisualIDRegistry.getVisualID(incomingLink) == DisasterReasonEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
			return null;
		}
		if (WfvvElementTypes.FactEffect_4002 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ServiceInvocationEnactingAgent_4006 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceInvocationEnactingAgentCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionByActor_4014 == req.getElementType()) {
			return getGEFWrapper(new ActionByActorCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionEnactment_4015 == req.getElementType()) {
			return getGEFWrapper(new ActionEnactmentCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionCause_4016 == req.getElementType()) {
			return getGEFWrapper(new ActionCauseCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WfvvElementTypes.FactDueTo_4001 == req.getElementType()) {
			return getGEFWrapper(new FactDueToCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.FactEffect_4002 == req.getElementType()) {
			return getGEFWrapper(new FactEffectCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ServiceInvocationEnactingAgent_4006 == req
				.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ActionByActor_4014 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ActionEnactment_4015 == req.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ActionCause_4016 == req.getElementType()) {
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
		case FactDueToEditPart.VISUAL_ID:
			return getGEFWrapper(new FactDueToReorientCommand(req));
		case FactEffectEditPart.VISUAL_ID:
			return getGEFWrapper(new FactEffectReorientCommand(req));
		case ServiceInvocationEnactingAgentEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceInvocationEnactingAgentReorientCommand(
					req));
		case ActionByActorEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionByActorReorientCommand(req));
		case ActionEnactmentEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionEnactmentReorientCommand(req));
		case ActionCauseEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionCauseReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
