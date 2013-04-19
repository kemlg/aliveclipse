package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompositeProcessComposedOfCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompositeProcessComposedOfReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagFirstCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagFirstReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructListFirstCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructListFirstReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ElseIfToIfThenElseMappingCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ElseIfToIfThenElseMappingReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ElseToElseMappingCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ElseToElseMappingReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfThenElseElseCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfThenElseElseReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfThenElseThenCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfThenElseThenReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfToIfThenElseMappingCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfToIfThenElseMappingReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntilUntilProcessCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntilUntilProcessReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatWhileWhileProcessCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatWhileWhileProcessReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ElseIfToIfThenElseMappingEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ElseToElseMappingEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.IfThenElseIfThenElseCompartmentEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.IfToIfThenElseMappingEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatWhileWhileProcessEditPart;
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
public class IfThenElseItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IfThenElseItemSemanticEditPolicy() {
		super(MappingElementTypes.IfThenElse_2012);
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == IfToIfThenElseMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ElseIfToIfThenElseMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ElseToElseMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == CompositeProcessComposedOfEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == IfThenElseThenEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == IfThenElseElseEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == RepeatUntilUntilProcessEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == RepeatWhileWhileProcessEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ControlConstructBagFirstEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ControlConstructListFirstEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(outgoingLink) == IfThenElseThenEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(outgoingLink) == IfThenElseElseEditPart.VISUAL_ID) {
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
			case IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID:
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
		if (MappingElementTypes.IfToIfThenElseMapping_4017 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.ElseIfToIfThenElseMapping_4023 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.ElseToElseMapping_4024 == req.getElementType()) {
			return null;
		}
		if (MappingElementTypes.CompositeProcessComposedOf_4003 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.IfThenElseThen_4010 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseThenCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.IfThenElseElse_4011 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseElseCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.RepeatUntilUntilProcess_4012 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.RepeatWhileWhileProcess_4013 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.ControlConstructBagFirst_4014 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.ControlConstructListFirst_4015 == req
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
		if (MappingElementTypes.IfToIfThenElseMapping_4017 == req
				.getElementType()) {
			return getGEFWrapper(new IfToIfThenElseMappingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ElseIfToIfThenElseMapping_4023 == req
				.getElementType()) {
			return getGEFWrapper(new ElseIfToIfThenElseMappingCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ElseToElseMapping_4024 == req.getElementType()) {
			return getGEFWrapper(new ElseToElseMappingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.CompositeProcessComposedOf_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeProcessComposedOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.IfThenElseThen_4010 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseThenCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.IfThenElseElse_4011 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseElseCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.RepeatUntilUntilProcess_4012 == req
				.getElementType()) {
			return getGEFWrapper(new RepeatUntilUntilProcessCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.RepeatWhileWhileProcess_4013 == req
				.getElementType()) {
			return getGEFWrapper(new RepeatWhileWhileProcessCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ControlConstructBagFirst_4014 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagFirstCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ControlConstructListFirst_4015 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructListFirstCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new IfToIfThenElseMappingReorientCommand(req));
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new ElseIfToIfThenElseMappingReorientCommand(
					req));
		case ElseToElseMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new ElseToElseMappingReorientCommand(req));
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
		case IfThenElseThenEditPart.VISUAL_ID:
			return getGEFWrapper(new IfThenElseThenReorientCommand(req));
		case IfThenElseElseEditPart.VISUAL_ID:
			return getGEFWrapper(new IfThenElseElseReorientCommand(req));
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getGEFWrapper(new RepeatUntilUntilProcessReorientCommand(req));
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return getGEFWrapper(new RepeatWhileWhileProcessReorientCommand(req));
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlConstructBagFirstReorientCommand(
					req));
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlConstructListFirstReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
