/*
 * 
 */
package control.diagram.edit.policies;

import java.util.Iterator;

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

import control.diagram.edit.commands.InputBindingCreateCommand;
import control.diagram.edit.commands.InputBindingReorientCommand;
import control.diagram.edit.commands.LinkBindingCreateCommand;
import control.diagram.edit.commands.LinkBindingReorientCommand;
import control.diagram.edit.commands.LocBindingCreateCommand;
import control.diagram.edit.commands.LocBindingReorientCommand;
import control.diagram.edit.commands.OutputBindingCreateCommand;
import control.diagram.edit.commands.OutputBindingReorientCommand;
import control.diagram.edit.commands.OutputBindingSourceCreateCommand;
import control.diagram.edit.commands.OutputBindingSourceReorientCommand;
import control.diagram.edit.parts.InputBindingEditPart;
import control.diagram.edit.parts.LinkBindingEditPart;
import control.diagram.edit.parts.LocBindingEditPart;
import control.diagram.edit.parts.OutputBindingEditPart;
import control.diagram.edit.parts.OutputBindingSourceEditPart;
import control.diagram.part.ControlVisualIDRegistry;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class Input2ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Input2ItemSemanticEditPolicy() {
		super(ControlElementTypes.Input_3105);
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
			if (ControlVisualIDRegistry.getVisualID(incomingLink) == InputBindingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ControlVisualIDRegistry.getVisualID(outgoingLink) == LocBindingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ControlVisualIDRegistry.getVisualID(outgoingLink) == InputBindingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ControlVisualIDRegistry.getVisualID(outgoingLink) == OutputBindingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ControlVisualIDRegistry.getVisualID(outgoingLink) == LinkBindingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ControlVisualIDRegistry.getVisualID(outgoingLink) == OutputBindingSourceEditPart.VISUAL_ID) {
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
		if (ControlElementTypes.LocBinding_4001 == req.getElementType()) {
			return getGEFWrapper(new LocBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ControlElementTypes.InputBinding_4002 == req.getElementType()) {
			return getGEFWrapper(new InputBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ControlElementTypes.OutputBinding_4003 == req.getElementType()) {
			return getGEFWrapper(new OutputBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ControlElementTypes.LinkBinding_4004 == req.getElementType()) {
			return getGEFWrapper(new LinkBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ControlElementTypes.OutputBindingSource_4005 == req
				.getElementType()) {
			return getGEFWrapper(new OutputBindingSourceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ControlElementTypes.LocBinding_4001 == req.getElementType()) {
			return null;
		}
		if (ControlElementTypes.InputBinding_4002 == req.getElementType()) {
			return getGEFWrapper(new InputBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ControlElementTypes.OutputBinding_4003 == req.getElementType()) {
			return null;
		}
		if (ControlElementTypes.LinkBinding_4004 == req.getElementType()) {
			return null;
		}
		if (ControlElementTypes.OutputBindingSource_4005 == req
				.getElementType()) {
			return null;
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
		case LocBindingEditPart.VISUAL_ID:
			return getGEFWrapper(new LocBindingReorientCommand(req));
		case InputBindingEditPart.VISUAL_ID:
			return getGEFWrapper(new InputBindingReorientCommand(req));
		case OutputBindingEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputBindingReorientCommand(req));
		case LinkBindingEditPart.VISUAL_ID:
			return getGEFWrapper(new LinkBindingReorientCommand(req));
		case OutputBindingSourceEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputBindingSourceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
