package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompositeProcessComposedOfCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompositeProcessComposedOfReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PerformProcessCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PerformProcessReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ProcessToCompositeActionMappingCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ProcessToCompositeActionMappingReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ScopeToCompositeActionMappingCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ScopeToCompositeActionMappingReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompositeActionCompositeActionCompartmentEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ProcessToCompositeActionMappingEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ScopeToCompositeActionMappingEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CompositeActionItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeActionItemSemanticEditPolicy() {
		super(MappingElementTypes.CompositeAction_2014);
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ProcessToCompositeActionMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ScopeToCompositeActionMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == PerformProcessEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(outgoingLink) == CompositeProcessComposedOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
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
			switch (MappingVisualIDRegistry.getVisualID(node)) {
			case CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (MappingVisualIDRegistry.getVisualID(cnode)) {
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
		if (MappingElementTypes.ProcessToCompositeActionMapping_4002 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.ScopeToCompositeActionMapping_4022 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.CompositeProcessComposedOf_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeProcessComposedOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.PerformProcess_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MappingElementTypes.ProcessToCompositeActionMapping_4002 == req
				.getElementType()) {
			return getGEFWrapper(new ProcessToCompositeActionMappingCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ScopeToCompositeActionMapping_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ScopeToCompositeActionMappingCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.CompositeProcessComposedOf_4003 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.PerformProcess_4004 == req.getElementType()) {
			return getGEFWrapper(new PerformProcessCreateCommand(req, req
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
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new ProcessToCompositeActionMappingReorientCommand(
					req));
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new ScopeToCompositeActionMappingReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
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
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeProcessComposedOfReorientCommand(
					req));
		case PerformProcessEditPart.VISUAL_ID:
			return getGEFWrapper(new PerformProcessReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
