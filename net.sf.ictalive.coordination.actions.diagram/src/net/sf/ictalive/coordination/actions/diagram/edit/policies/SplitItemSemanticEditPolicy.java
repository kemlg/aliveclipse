package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.CompositeProcessComposedOfCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.CompositeProcessComposedOfReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ControlConstructBagFirstCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ControlConstructBagFirstReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ControlConstructListFirstCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ControlConstructListFirstReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IfThenElseElseCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IfThenElseElseReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IfThenElseThenCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IfThenElseThenReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.RepeatUntilUntilProcessCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.RepeatUntilUntilProcessReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.RepeatWhileWhileProcessCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.RepeatWhileWhileProcessReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.SplitComponentsCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.SplitComponentsReorientCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileWhileProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitComponentsEditPart;
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
public class SplitItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SplitItemSemanticEditPolicy() {
		super(CoordinationElementTypes.Split_2039);
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
			if (CoordinationVisualIDRegistry.getVisualID(incomingLink) == RepeatWhileWhileProcessEditPart.VISUAL_ID) {
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
			if (CoordinationVisualIDRegistry.getVisualID(outgoingLink) == SplitComponentsEditPart.VISUAL_ID) {
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
		if (CoordinationElementTypes.CompositeProcessComposedOf_4029 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.SplitComponents_4045 == req
				.getElementType()) {
			return getGEFWrapper(new SplitComponentsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.IfThenElseThen_4036 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.IfThenElseElse_4037 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.RepeatUntilUntilProcess_4038 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.RepeatWhileWhileProcess_4039 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ControlConstructBagFirst_4040 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.ControlConstructListFirst_4041 == req
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
		if (CoordinationElementTypes.CompositeProcessComposedOf_4029 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeProcessComposedOfCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.SplitComponents_4045 == req
				.getElementType()) {
			return null;
		}
		if (CoordinationElementTypes.IfThenElseThen_4036 == req
				.getElementType()) {
			return getGEFWrapper(new IfThenElseThenCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.IfThenElseElse_4037 == req
				.getElementType()) {
			return getGEFWrapper(new IfThenElseElseCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.RepeatUntilUntilProcess_4038 == req
				.getElementType()) {
			return getGEFWrapper(new RepeatUntilUntilProcessCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.RepeatWhileWhileProcess_4039 == req
				.getElementType()) {
			return getGEFWrapper(new RepeatWhileWhileProcessCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ControlConstructBagFirst_4040 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagFirstCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CoordinationElementTypes.ControlConstructListFirst_4041 == req
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
		case SplitComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SplitComponentsReorientCommand(req));
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
