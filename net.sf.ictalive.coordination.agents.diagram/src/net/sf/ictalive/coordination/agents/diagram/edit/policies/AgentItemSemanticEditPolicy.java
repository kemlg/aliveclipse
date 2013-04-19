package net.sf.ictalive.coordination.agents.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.agents.diagram.edit.commands.AgentHasActionCreateCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.commands.AgentHasActionReorientCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.commands.AgentHasRoleCreateCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.commands.AgentHasRoleReorientCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasRoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.agents.diagram.providers.CoordinationElementTypes;

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
public class AgentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AgentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.Agent_2004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == AgentHasActionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == AgentHasRoleEditPart.VISUAL_ID) {
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
		if (CoordinationElementTypes.AgentHasAction_4003 == req
				.getElementType()) {
			return getGEFWrapper(new AgentHasActionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.AgentHasRole_4004 == req.getElementType()) {
			return getGEFWrapper(new AgentHasRoleCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CoordinationElementTypes.AgentHasAction_4003 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.AgentHasRole_4004 == req.getElementType()) {
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
		case AgentHasActionEditPart.VISUAL_ID:
			return getGEFWrapper(new AgentHasActionReorientCommand(req));
		case AgentHasRoleEditPart.VISUAL_ID:
			return getGEFWrapper(new AgentHasRoleReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
