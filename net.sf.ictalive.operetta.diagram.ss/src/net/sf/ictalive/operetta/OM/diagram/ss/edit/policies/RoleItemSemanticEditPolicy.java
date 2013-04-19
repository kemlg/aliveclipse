package net.sf.ictalive.operetta.OM.diagram.ss.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.operetta.OM.diagram.ss.edit.commands.HierarchyDependencyCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.commands.HierarchyDependencyReorientCommand;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.commands.MarketDependencyCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.commands.MarketDependencyReorientCommand;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.commands.NetworkDependencyCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.commands.NetworkDependencyReorientCommand;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry;
import net.sf.ictalive.operetta.OM.diagram.ss.providers.OperAElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoleItemSemanticEditPolicy extends OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleItemSemanticEditPolicy() {
		super(OperAElementTypes.Role_2001);
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
			if (OperAVisualIDRegistry.getVisualID(incomingLink) == NetworkDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (OperAVisualIDRegistry.getVisualID(incomingLink) == MarketDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (OperAVisualIDRegistry.getVisualID(incomingLink) == HierarchyDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (OperAVisualIDRegistry.getVisualID(outgoingLink) == NetworkDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (OperAVisualIDRegistry.getVisualID(outgoingLink) == MarketDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (OperAVisualIDRegistry.getVisualID(outgoingLink) == HierarchyDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
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
		if (OperAElementTypes.NetworkDependency_4001 == req.getElementType()) {
			return getGEFWrapper(new NetworkDependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OperAElementTypes.MarketDependency_4002 == req.getElementType()) {
			return getGEFWrapper(new MarketDependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OperAElementTypes.HierarchyDependency_4003 == req.getElementType()) {
			return getGEFWrapper(new HierarchyDependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OperAElementTypes.NetworkDependency_4001 == req.getElementType()) {
			return getGEFWrapper(new NetworkDependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OperAElementTypes.MarketDependency_4002 == req.getElementType()) {
			return getGEFWrapper(new MarketDependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OperAElementTypes.HierarchyDependency_4003 == req.getElementType()) {
			return getGEFWrapper(new HierarchyDependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case NetworkDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new NetworkDependencyReorientCommand(req));
		case MarketDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new MarketDependencyReorientCommand(req));
		case HierarchyDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new HierarchyDependencyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
