package net.sf.ictalive.coordination.agents.diagram.part;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.MasModel;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.MasModelEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleNameEditPart;
import net.sf.ictalive.operetta.OM.OMPackage;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CoordinationVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.coordination.agents.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MasModelEditPart.MODEL_ID.equals(view.getType())) {
				return MasModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				AgentsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AgentsPackage.eINSTANCE.getMasModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MasModel) domainElement)) {
			return MasModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry
				.getModelID(containerView);
		if (!MasModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MasModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MasModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MasModelEditPart.VISUAL_ID:
			if (AgentsPackage.eINSTANCE.getAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return AgentEditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getAtomicAction().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicActionEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getCompositeAction().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeActionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry
				.getModelID(containerView);
		if (!MasModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MasModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MasModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case AgentEditPart.VISUAL_ID:
			if (AgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionEditPart.VISUAL_ID:
			if (AtomicActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeActionEditPart.VISUAL_ID:
			if (CompositeActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MasModelEditPart.VISUAL_ID:
			if (AgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MasModel element) {
		return true;
	}

}
