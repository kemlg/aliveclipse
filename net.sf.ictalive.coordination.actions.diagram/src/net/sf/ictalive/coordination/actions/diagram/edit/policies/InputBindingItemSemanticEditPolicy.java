package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.BindingToParamCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.BindingToParamReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.BindingValueFromCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.BindingValueFromReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.PerformHasDataFromCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.PerformHasDataFromReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingToParamEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingValueFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformHasDataFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
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
public class InputBindingItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputBindingItemSemanticEditPolicy() {
		super(CoordinationElementTypes.InputBinding_2038);
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == PerformHasDataFromEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == BindingValueFromEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == BindingToParamEditPart.VISUAL_ID) {
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
		if (CoordinationElementTypes.PerformHasDataFrom_4042 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.BindingValueFrom_4043 == req
				.getElementType()) {
			return getGEFWrapper(new BindingValueFromCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.BindingToParam_4044 == req
				.getElementType()) {
			return getGEFWrapper(new BindingToParamCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CoordinationElementTypes.PerformHasDataFrom_4042 == req
				.getElementType()) {
			return getGEFWrapper(new PerformHasDataFromCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.BindingValueFrom_4043 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.BindingToParam_4044 == req
				.getElementType()) {
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
		case PerformHasDataFromEditPart.VISUAL_ID:
			return getGEFWrapper(new PerformHasDataFromReorientCommand(req));
		case BindingValueFromEditPart.VISUAL_ID:
			return getGEFWrapper(new BindingValueFromReorientCommand(req));
		case BindingToParamEditPart.VISUAL_ID:
			return getGEFWrapper(new BindingToParamReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
