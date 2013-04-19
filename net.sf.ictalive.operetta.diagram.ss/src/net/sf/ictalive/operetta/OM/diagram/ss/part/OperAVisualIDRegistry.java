package net.sf.ictalive.operetta.OM.diagram.ss.part;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleRoleTypeEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;

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
public class OperAVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.operetta.diagram.ss/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SSEditPart.MODEL_ID.equals(view.getType())) {
				return SSEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry
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
				OperASSDiagramEditorPlugin.getInstance().logError(
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
		if (OMPackage.eINSTANCE.getSS().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((net.sf.ictalive.operetta.OM.SS) domainElement)) {
			return SSEditPart.VISUAL_ID;
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
		String containerModelID = net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry
				.getModelID(containerView);
		if (!SSEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SSEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SSEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SSEditPart.VISUAL_ID:
			if (OMPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry
				.getModelID(containerView);
		if (!SSEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SSEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SSEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleRoleTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SSEditPart.VISUAL_ID:
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NetworkDependencyEditPart.VISUAL_ID:
			if (NetworkDependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MarketDependencyEditPart.VISUAL_ID:
			if (MarketDependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HierarchyDependencyEditPart.VISUAL_ID:
			if (HierarchyDependencyNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (OMPackage.eINSTANCE.getNetworkDependency().isSuperTypeOf(
				domainElement.eClass())) {
			return NetworkDependencyEditPart.VISUAL_ID;
		}
		if (OMPackage.eINSTANCE.getMarketDependency().isSuperTypeOf(
				domainElement.eClass())) {
			return MarketDependencyEditPart.VISUAL_ID;
		}
		if (OMPackage.eINSTANCE.getHierarchyDependency().isSuperTypeOf(
				domainElement.eClass())) {
			return HierarchyDependencyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(net.sf.ictalive.operetta.OM.SS element) {
		return true;
	}

}
