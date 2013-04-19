package net.sf.ictalive.operetta.OM.diagram.is.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.SceneToTransitionArcCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.SceneToTransitionArcReorientCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.TransitionToSceneArcCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.TransitionToSceneArcReorientCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneSceneCompartmentEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneToTransitionArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SceneItemSemanticEditPolicy extends
		OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SceneItemSemanticEditPolicy() {
		super(OperAElementTypes.Scene_2101);
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
			if (OperAVisualIDRegistry.getVisualID(incomingLink) == TransitionToSceneArcEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (OperAVisualIDRegistry.getVisualID(outgoingLink) == SceneToTransitionArcEditPart.VISUAL_ID) {
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
			switch (OperAVisualIDRegistry.getVisualID(node)) {
			case SceneSceneCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (OperAVisualIDRegistry.getVisualID(cnode)) {
					case LandmarkPatternEditPart.VISUAL_ID:
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
		if (OperAElementTypes.TransitionToSceneArc_4101 == req.getElementType()) {
			return null;
		}
		if (OperAElementTypes.SceneToTransitionArc_4102 == req.getElementType()) {
			return getGEFWrapper(new SceneToTransitionArcCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OperAElementTypes.TransitionToSceneArc_4101 == req.getElementType()) {
			return getGEFWrapper(new TransitionToSceneArcCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OperAElementTypes.SceneToTransitionArc_4102 == req.getElementType()) {
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
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return getGEFWrapper(new TransitionToSceneArcReorientCommand(req));
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return getGEFWrapper(new SceneToTransitionArcReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
