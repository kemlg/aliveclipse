package net.sf.ictalive.operetta.OM.diagram.ss.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.MarketDependency;
import net.sf.ictalive.operetta.OM.NetworkDependency;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.providers.OperAElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OperADiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case SSEditPart.VISUAL_ID:
			return getSS_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSS_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		net.sf.ictalive.operetta.OM.SS modelElement = (net.sf.ictalive.operetta.OM.SS) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = OperAVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case SSEditPart.VISUAL_ID:
			return getSS_1000ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2001ContainedLinks(view);
		case NetworkDependencyEditPart.VISUAL_ID:
			return getNetworkDependency_4001ContainedLinks(view);
		case MarketDependencyEditPart.VISUAL_ID:
			return getMarketDependency_4002ContainedLinks(view);
		case HierarchyDependencyEditPart.VISUAL_ID:
			return getHierarchyDependency_4003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case RoleEditPart.VISUAL_ID:
			return getRole_2001IncomingLinks(view);
		case NetworkDependencyEditPart.VISUAL_ID:
			return getNetworkDependency_4001IncomingLinks(view);
		case MarketDependencyEditPart.VISUAL_ID:
			return getMarketDependency_4002IncomingLinks(view);
		case HierarchyDependencyEditPart.VISUAL_ID:
			return getHierarchyDependency_4003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case RoleEditPart.VISUAL_ID:
			return getRole_2001OutgoingLinks(view);
		case NetworkDependencyEditPart.VISUAL_ID:
			return getNetworkDependency_4001OutgoingLinks(view);
		case MarketDependencyEditPart.VISUAL_ID:
			return getMarketDependency_4002OutgoingLinks(view);
		case HierarchyDependencyEditPart.VISUAL_ID:
			return getHierarchyDependency_4003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSS_1000ContainedLinks(View view) {
		net.sf.ictalive.operetta.OM.SS modelElement = (net.sf.ictalive.operetta.OM.SS) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_NetworkDependency_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MarketDependency_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HierarchyDependency_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNetworkDependency_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMarketDependency_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHierarchyDependency_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_2001IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_NetworkDependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MarketDependency_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HierarchyDependency_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetworkDependency_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMarketDependency_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHierarchyDependency_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_2001OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_NetworkDependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MarketDependency_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HierarchyDependency_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetworkDependency_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMarketDependency_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHierarchyDependency_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_NetworkDependency_4001(
			net.sf.ictalive.operetta.OM.SS container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NetworkDependency) {
				continue;
			}
			NetworkDependency link = (NetworkDependency) linkObject;
			if (NetworkDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getDependant2();
			Role src = link.getDependant1();
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.NetworkDependency_4001,
					NetworkDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_MarketDependency_4002(
			net.sf.ictalive.operetta.OM.SS container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MarketDependency) {
				continue;
			}
			MarketDependency link = (MarketDependency) linkObject;
			if (MarketDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getDependee();
			Role src = link.getDependant();
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.MarketDependency_4002,
					MarketDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HierarchyDependency_4003(
			net.sf.ictalive.operetta.OM.SS container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof HierarchyDependency) {
				continue;
			}
			HierarchyDependency link = (HierarchyDependency) linkObject;
			if (HierarchyDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getDependee();
			Role src = link.getDependant();
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.HierarchyDependency_4003,
					HierarchyDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_NetworkDependency_4001(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OMPackage.eINSTANCE
					.getNetworkDependency_Dependant2()
					|| false == setting.getEObject() instanceof NetworkDependency) {
				continue;
			}
			NetworkDependency link = (NetworkDependency) setting.getEObject();
			if (NetworkDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getDependant1();
			result.add(new OperALinkDescriptor(src, target, link,
					OperAElementTypes.NetworkDependency_4001,
					NetworkDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_MarketDependency_4002(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OMPackage.eINSTANCE
					.getMarketDependency_Dependee()
					|| false == setting.getEObject() instanceof MarketDependency) {
				continue;
			}
			MarketDependency link = (MarketDependency) setting.getEObject();
			if (MarketDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getDependant();
			result.add(new OperALinkDescriptor(src, target, link,
					OperAElementTypes.MarketDependency_4002,
					MarketDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HierarchyDependency_4003(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OMPackage.eINSTANCE
					.getHierarchyDependency_Dependee()
					|| false == setting.getEObject() instanceof HierarchyDependency) {
				continue;
			}
			HierarchyDependency link = (HierarchyDependency) setting
					.getEObject();
			if (HierarchyDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getDependant();
			result.add(new OperALinkDescriptor(src, target, link,
					OperAElementTypes.HierarchyDependency_4003,
					HierarchyDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_NetworkDependency_4001(
			Role source) {
		net.sf.ictalive.operetta.OM.SS container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof net.sf.ictalive.operetta.OM.SS) {
				container = (net.sf.ictalive.operetta.OM.SS) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NetworkDependency) {
				continue;
			}
			NetworkDependency link = (NetworkDependency) linkObject;
			if (NetworkDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getDependant2();
			Role src = link.getDependant1();
			if (src != source) {
				continue;
			}
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.NetworkDependency_4001,
					NetworkDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_MarketDependency_4002(
			Role source) {
		net.sf.ictalive.operetta.OM.SS container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof net.sf.ictalive.operetta.OM.SS) {
				container = (net.sf.ictalive.operetta.OM.SS) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MarketDependency) {
				continue;
			}
			MarketDependency link = (MarketDependency) linkObject;
			if (MarketDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getDependee();
			Role src = link.getDependant();
			if (src != source) {
				continue;
			}
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.MarketDependency_4002,
					MarketDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HierarchyDependency_4003(
			Role source) {
		net.sf.ictalive.operetta.OM.SS container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof net.sf.ictalive.operetta.OM.SS) {
				container = (net.sf.ictalive.operetta.OM.SS) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof HierarchyDependency) {
				continue;
			}
			HierarchyDependency link = (HierarchyDependency) linkObject;
			if (HierarchyDependencyEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getDependee();
			Role src = link.getDependant();
			if (src != source) {
				continue;
			}
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.HierarchyDependency_4003,
					HierarchyDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

}
