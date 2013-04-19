package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.PerformProcessCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.PerformProcessReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ProcessPerformedByCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ProcessPerformedByReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

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
public class AtomicActionItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicAction_2022);
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
		if (CoordinationElementTypes.ProcessPerformedBy_4019 == req
				.getElementType()) {
			return getGEFWrapper(new ProcessPerformedByCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.PerformProcess_4021 == req
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
		if (CoordinationElementTypes.ProcessPerformedBy_4019 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.PerformProcess_4021 == req
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
		case ProcessPerformedByEditPart.VISUAL_ID:
			return getGEFWrapper(new ProcessPerformedByReorientCommand(req));
		case PerformProcessEditPart.VISUAL_ID:
			return getGEFWrapper(new PerformProcessReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
