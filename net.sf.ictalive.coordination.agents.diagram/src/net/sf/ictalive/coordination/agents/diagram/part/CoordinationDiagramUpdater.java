package net.sf.ictalive.coordination.agents.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.MasModel;
import net.sf.ictalive.coordination.agents.diagram.custom.CreateMissingShortcuts;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasRoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.MasModelEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.operetta.OM.Role;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CoordinationDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case MasModelEditPart.VISUAL_ID:
			return getMasModel_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMasModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MasModel modelElement = (MasModel) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAgents().iterator(); it.hasNext();) {
			Agent childElement = (Agent) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AgentEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == RoleEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						RoleEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == AtomicActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						AtomicActionEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == CompositeActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						CompositeActionEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case MasModelEditPart.VISUAL_ID:
			return getMasModel_1000ContainedLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2004ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005ContainedLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2006ContainedLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2007ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case AgentEditPart.VISUAL_ID:
			return getAgent_2004IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005IncomingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2006IncomingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2007IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case AgentEditPart.VISUAL_ID:
			return getAgent_2004OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005OutgoingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2006OutgoingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2007OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMasModel_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2004ContainedLinks(View view) {
		Agent modelElement = (Agent) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Agent_HasAction_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Agent_HasRole_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_2005IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_HasRole_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2006IncomingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_HasAction_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2007IncomingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Agent_HasAction_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2004OutgoingLinks(View view) {
		Agent modelElement = (Agent) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Agent_HasAction_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Agent_HasRole_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Agent_HasAction_4003(
			Action target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == AgentsPackage.eINSTANCE
					.getAgent_HasAction()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.AgentHasAction_4003,
						AgentHasActionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Agent_HasRole_4004(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == AgentsPackage.eINSTANCE
					.getAgent_HasRole()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.AgentHasRole_4004,
						AgentHasRoleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Agent_HasAction_4003(
			Agent source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHasAction().iterator(); destinations
				.hasNext();) {
			Action destination = (Action) destinations.next();
			result.add(new CoordinationLinkDescriptor(source, destination,
					CoordinationElementTypes.AgentHasAction_4003,
					AgentHasActionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Agent_HasRole_4004(
			Agent source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHasRole().iterator(); destinations
				.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new CoordinationLinkDescriptor(source, destination,
					CoordinationElementTypes.AgentHasRole_4004,
					AgentHasRoleEditPart.VISUAL_ID));
		}
		return result;
	}

}
