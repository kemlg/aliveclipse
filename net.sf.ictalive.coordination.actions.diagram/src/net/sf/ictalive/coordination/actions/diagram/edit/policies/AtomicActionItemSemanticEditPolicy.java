package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.PerformProcessCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.PerformProcessReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ProcessHasInputCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ProcessHasInputReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ProcessHasOutputCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ProcessHasOutputReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ProcessPerformedByCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ProcessPerformedByReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionAtomicActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasInputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasOutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

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
public class AtomicActionItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicAction_2025);
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == PerformProcessEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == ProcessHasInputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == ProcessHasOutputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == ProcessPerformedByEditPart.VISUAL_ID) {
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
			switch (CoordinationVisualIDRegistry.getVisualID(node)) {
			case AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoordinationVisualIDRegistry.getVisualID(cnode)) {
					case Condition2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case AtomicActionResultEditPart.VISUAL_ID:
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
		if (CoordinationElementTypes.ProcessHasInput_4026 == req
				.getElementType()) {
			return getGEFWrapper(new ProcessHasInputCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ProcessHasOutput_4027 == req
				.getElementType()) {
			return getGEFWrapper(new ProcessHasOutputCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ProcessPerformedBy_4028 == req
				.getElementType()) {
			return getGEFWrapper(new ProcessPerformedByCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.PerformProcess_4030 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CoordinationElementTypes.ProcessHasInput_4026 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ProcessHasOutput_4027 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ProcessPerformedBy_4028 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.PerformProcess_4030 == req
				.getElementType()) {
			return getGEFWrapper(new PerformProcessCreateCommand(req, req
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
		case ProcessHasInputEditPart.VISUAL_ID:
			return getGEFWrapper(new ProcessHasInputReorientCommand(req));
		case ProcessHasOutputEditPart.VISUAL_ID:
			return getGEFWrapper(new ProcessHasOutputReorientCommand(req));
		case ProcessPerformedByEditPart.VISUAL_ID:
			return getGEFWrapper(new ProcessPerformedByReorientCommand(req));
		case PerformProcessEditPart.VISUAL_ID:
			return getGEFWrapper(new PerformProcessReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
