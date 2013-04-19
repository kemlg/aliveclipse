package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ChoiceComponentsCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ChoiceComponentsReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.CompositeProcessComposedOfCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.CompositeProcessComposedOfReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ControlConstructBagFirstCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ControlConstructBagFirstReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ControlConstructListFirstCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ControlConstructListFirstReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IfThenElseElseCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IfThenElseElseReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IfThenElseThenCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IfThenElseThenReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.RepeatUntilUntilProcessCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.RepeatUntilUntilProcessReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.TaskComponentsCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.TaskComponentsReorientCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

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
public class ChoiceItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ChoiceItemSemanticEditPolicy() {
		super(CoordinationElementTypes.Choice_2029);
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == CompositeProcessComposedOfEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == TaskComponentsEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == IfThenElseThenEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == IfThenElseElseEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == RepeatUntilUntilProcessEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == ControlConstructBagFirstEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == ControlConstructListFirstEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == ChoiceComponentsEditPart.VISUAL_ID) {
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
		if (CoordinationElementTypes.CompositeProcessComposedOf_4020 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ChoiceComponents_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ChoiceComponentsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.TaskComponents_4025 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.IfThenElseThen_4029 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.IfThenElseElse_4030 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.RepeatUntilUntilProcess_4031 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ControlConstructBagFirst_4033 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ControlConstructListFirst_4034 == req
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
		if (CoordinationElementTypes.CompositeProcessComposedOf_4020 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeProcessComposedOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ChoiceComponents_4022 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.TaskComponents_4025 == req
				.getElementType()) {
			return getGEFWrapper(new TaskComponentsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.IfThenElseThen_4029 == req
				.getElementType()) {
			return getGEFWrapper(new IfThenElseThenCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.IfThenElseElse_4030 == req
				.getElementType()) {
			return getGEFWrapper(new IfThenElseElseCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.RepeatUntilUntilProcess_4031 == req
				.getElementType()) {
			return getGEFWrapper(new RepeatUntilUntilProcessCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ControlConstructBagFirst_4033 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagFirstCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ControlConstructListFirst_4034 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructListFirstCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeProcessComposedOfReorientCommand(
					req));
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ChoiceComponentsReorientCommand(req));
		case TaskComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskComponentsReorientCommand(req));
		case IfThenElseThenEditPart.VISUAL_ID:
			return getGEFWrapper(new IfThenElseThenReorientCommand(req));
		case IfThenElseElseEditPart.VISUAL_ID:
			return getGEFWrapper(new IfThenElseElseReorientCommand(req));
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getGEFWrapper(new RepeatUntilUntilProcessReorientCommand(req));
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
