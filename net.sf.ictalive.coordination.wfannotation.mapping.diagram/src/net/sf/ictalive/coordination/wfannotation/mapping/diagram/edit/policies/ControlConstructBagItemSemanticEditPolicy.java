package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.AnyOrderComponentsCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.AnyOrderComponentsReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ChoiceComponentsCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ChoiceComponentsReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagFirstCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagFirstReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagRestCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagRestReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SplitComponentsCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SplitComponentsReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SplitJoinComponentsCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SplitJoinComponentsReorientCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.SplitComponentsEditPart;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.SplitJoinComponentsEditPart;
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
public class ControlConstructBagItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlConstructBagItemSemanticEditPolicy() {
		super(MappingElementTypes.ControlConstructBag_2006);
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ChoiceComponentsEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == AnyOrderComponentsEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == ControlConstructBagRestEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == SplitComponentsEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(incomingLink) == SplitJoinComponentsEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(outgoingLink) == ControlConstructBagRestEditPart.VISUAL_ID) {
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
			if (MappingVisualIDRegistry.getVisualID(outgoingLink) == ControlConstructBagFirstEditPart.VISUAL_ID) {
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
		if (MappingElementTypes.ChoiceComponents_4005 == req.getElementType()) {
			return null;
		}
		if (MappingElementTypes.AnyOrderComponents_4006 == req.getElementType()) {
			return null;
		}
		if (MappingElementTypes.ControlConstructBagRest_4008 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagRestCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ControlConstructBagFirst_4014 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagFirstCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.SplitComponents_4025 == req.getElementType()) {
			return null;
		}
		if (MappingElementTypes.SplitJoinComponents_4026 == req
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
		if (MappingElementTypes.ChoiceComponents_4005 == req.getElementType()) {
			return getGEFWrapper(new ChoiceComponentsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.AnyOrderComponents_4006 == req.getElementType()) {
			return getGEFWrapper(new AnyOrderComponentsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ControlConstructBagRest_4008 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagRestCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.ControlConstructBagFirst_4014 == req
				.getElementType()) {
			return null;
		}
		if (MappingElementTypes.SplitComponents_4025 == req.getElementType()) {
			return getGEFWrapper(new SplitComponentsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MappingElementTypes.SplitJoinComponents_4026 == req
				.getElementType()) {
			return getGEFWrapper(new SplitJoinComponentsCreateCommand(req, req
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
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ChoiceComponentsReorientCommand(req));
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new AnyOrderComponentsReorientCommand(req));
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlConstructBagRestReorientCommand(req));
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlConstructBagFirstReorientCommand(
					req));
		case SplitComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SplitComponentsReorientCommand(req));
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SplitJoinComponentsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
