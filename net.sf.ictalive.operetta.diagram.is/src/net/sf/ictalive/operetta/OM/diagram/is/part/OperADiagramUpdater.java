package net.sf.ictalive.operetta.OM.diagram.is.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.LandmarkPattern;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialOrder;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternLandmarkPatternCompartmentEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.PartialOrderEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneSceneCompartmentEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneToTransitionArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

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
		case SceneSceneCompartmentEditPart.VISUAL_ID:
			return getSceneSceneCompartment_7101SemanticChildren(view);
		case LandmarkPatternLandmarkPatternCompartmentEditPart.VISUAL_ID:
			return getLandmarkPatternLandmarkPatternCompartment_7102SemanticChildren(view);
		case ISEditPart.VISUAL_ID:
			return getIS_1100SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSceneSceneCompartment_7101SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scene modelElement = (Scene) containerView.getElement();
		List result = new LinkedList();
		{
			LandmarkPattern childElement = modelElement.getInteractionPattern();
			int visualID = OperAVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LandmarkPatternEditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLandmarkPatternLandmarkPatternCompartment_7102SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LandmarkPattern modelElement = (LandmarkPattern) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getLandmarks().iterator(); it.hasNext();) {
			Landmark childElement = (Landmark) it.next();
			int visualID = OperAVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LandmarkEditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIS_1100SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		net.sf.ictalive.operetta.OM.IS modelElement = (net.sf.ictalive.operetta.OM.IS) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getScenes().iterator(); it.hasNext();) {
			Scene childElement = (Scene) it.next();
			int visualID = OperAVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SceneEditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scene2EditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scene3EditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getTransitions().iterator(); it
				.hasNext();) {
			Transition childElement = (Transition) it.next();
			int visualID = OperAVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Transition2EditPart.VISUAL_ID) {
				result.add(new OperANodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Transition3EditPart.VISUAL_ID) {
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
		case ISEditPart.VISUAL_ID:
			return getIS_1100ContainedLinks(view);
		case SceneEditPart.VISUAL_ID:
			return getScene_2101ContainedLinks(view);
		case Scene2EditPart.VISUAL_ID:
			return getScene_2102ContainedLinks(view);
		case Scene3EditPart.VISUAL_ID:
			return getScene_2103ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2104ContainedLinks(view);
		case Transition2EditPart.VISUAL_ID:
			return getTransition_2105ContainedLinks(view);
		case Transition3EditPart.VISUAL_ID:
			return getTransition_2106ContainedLinks(view);
		case LandmarkPatternEditPart.VISUAL_ID:
			return getLandmarkPattern_3101ContainedLinks(view);
		case LandmarkEditPart.VISUAL_ID:
			return getLandmark_3102ContainedLinks(view);
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return getTransitionToSceneArc_4101ContainedLinks(view);
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return getSceneToTransitionArc_4102ContainedLinks(view);
		case PartialOrderEditPart.VISUAL_ID:
			return getPartialOrder_4103ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case SceneEditPart.VISUAL_ID:
			return getScene_2101IncomingLinks(view);
		case Scene2EditPart.VISUAL_ID:
			return getScene_2102IncomingLinks(view);
		case Scene3EditPart.VISUAL_ID:
			return getScene_2103IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2104IncomingLinks(view);
		case Transition2EditPart.VISUAL_ID:
			return getTransition_2105IncomingLinks(view);
		case Transition3EditPart.VISUAL_ID:
			return getTransition_2106IncomingLinks(view);
		case LandmarkPatternEditPart.VISUAL_ID:
			return getLandmarkPattern_3101IncomingLinks(view);
		case LandmarkEditPart.VISUAL_ID:
			return getLandmark_3102IncomingLinks(view);
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return getTransitionToSceneArc_4101IncomingLinks(view);
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return getSceneToTransitionArc_4102IncomingLinks(view);
		case PartialOrderEditPart.VISUAL_ID:
			return getPartialOrder_4103IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case SceneEditPart.VISUAL_ID:
			return getScene_2101OutgoingLinks(view);
		case Scene2EditPart.VISUAL_ID:
			return getScene_2102OutgoingLinks(view);
		case Scene3EditPart.VISUAL_ID:
			return getScene_2103OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2104OutgoingLinks(view);
		case Transition2EditPart.VISUAL_ID:
			return getTransition_2105OutgoingLinks(view);
		case Transition3EditPart.VISUAL_ID:
			return getTransition_2106OutgoingLinks(view);
		case LandmarkPatternEditPart.VISUAL_ID:
			return getLandmarkPattern_3101OutgoingLinks(view);
		case LandmarkEditPart.VISUAL_ID:
			return getLandmark_3102OutgoingLinks(view);
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return getTransitionToSceneArc_4101OutgoingLinks(view);
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return getSceneToTransitionArc_4102OutgoingLinks(view);
		case PartialOrderEditPart.VISUAL_ID:
			return getPartialOrder_4103OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIS_1100ContainedLinks(View view) {
		net.sf.ictalive.operetta.OM.IS modelElement = (net.sf.ictalive.operetta.OM.IS) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_TransitionToSceneArc_4101(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SceneToTransitionArc_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScene_2101ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScene_2102ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScene_2103ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2104ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2105ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2106ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLandmarkPattern_3101ContainedLinks(View view) {
		LandmarkPattern modelElement = (LandmarkPattern) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_PartialOrder_4103(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLandmark_3102ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransitionToSceneArc_4101ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSceneToTransitionArc_4102ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartialOrder_4103ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScene_2101IncomingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionToSceneArc_4101(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScene_2102IncomingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionToSceneArc_4101(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScene_2103IncomingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionToSceneArc_4101(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2104IncomingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_SceneToTransitionArc_4102(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2105IncomingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_SceneToTransitionArc_4102(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2106IncomingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_SceneToTransitionArc_4102(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLandmarkPattern_3101IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLandmark_3102IncomingLinks(View view) {
		Landmark modelElement = (Landmark) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_PartialOrder_4103(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransitionToSceneArc_4101IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSceneToTransitionArc_4102IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartialOrder_4103IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScene_2101OutgoingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SceneToTransitionArc_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScene_2102OutgoingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SceneToTransitionArc_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScene_2103OutgoingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SceneToTransitionArc_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2104OutgoingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionToSceneArc_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2105OutgoingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionToSceneArc_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransition_2106OutgoingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionToSceneArc_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLandmarkPattern_3101OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLandmark_3102OutgoingLinks(View view) {
		Landmark modelElement = (Landmark) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartialOrder_4103(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransitionToSceneArc_4101OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSceneToTransitionArc_4102OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartialOrder_4103OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_TransitionToSceneArc_4101(
			net.sf.ictalive.operetta.OM.IS container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TransitionToSceneArc) {
				continue;
			}
			TransitionToSceneArc link = (TransitionToSceneArc) linkObject;
			if (TransitionToSceneArcEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Scene dst = link.getTo();
			Transition src = link.getFrom();
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.TransitionToSceneArc_4101,
					TransitionToSceneArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SceneToTransitionArc_4102(
			net.sf.ictalive.operetta.OM.IS container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SceneToTransitionArc) {
				continue;
			}
			SceneToTransitionArc link = (SceneToTransitionArc) linkObject;
			if (SceneToTransitionArcEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Transition dst = link.getTo();
			Scene src = link.getFrom();
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.SceneToTransitionArc_4102,
					SceneToTransitionArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_PartialOrder_4103(
			LandmarkPattern container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getLandmarkOrder().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PartialOrder) {
				continue;
			}
			PartialOrder link = (PartialOrder) linkObject;
			if (PartialOrderEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Landmark dst = link.getTo();
			Landmark src = link.getFrom();
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.PartialOrder_4103,
					PartialOrderEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_TransitionToSceneArc_4101(
			Scene target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OMPackage.eINSTANCE
					.getTransitionToSceneArc_To()
					|| false == setting.getEObject() instanceof TransitionToSceneArc) {
				continue;
			}
			TransitionToSceneArc link = (TransitionToSceneArc) setting
					.getEObject();
			if (TransitionToSceneArcEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Transition src = link.getFrom();
			result.add(new OperALinkDescriptor(src, target, link,
					OperAElementTypes.TransitionToSceneArc_4101,
					TransitionToSceneArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SceneToTransitionArc_4102(
			Transition target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OMPackage.eINSTANCE
					.getSceneToTransitionArc_To()
					|| false == setting.getEObject() instanceof SceneToTransitionArc) {
				continue;
			}
			SceneToTransitionArc link = (SceneToTransitionArc) setting
					.getEObject();
			if (SceneToTransitionArcEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Scene src = link.getFrom();
			result.add(new OperALinkDescriptor(src, target, link,
					OperAElementTypes.SceneToTransitionArc_4102,
					SceneToTransitionArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_PartialOrder_4103(
			Landmark target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OMPackage.eINSTANCE
					.getPartialOrder_To()
					|| false == setting.getEObject() instanceof PartialOrder) {
				continue;
			}
			PartialOrder link = (PartialOrder) setting.getEObject();
			if (PartialOrderEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Landmark src = link.getFrom();
			result.add(new OperALinkDescriptor(src, target, link,
					OperAElementTypes.PartialOrder_4103,
					PartialOrderEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_TransitionToSceneArc_4101(
			Transition source) {
		net.sf.ictalive.operetta.OM.IS container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof net.sf.ictalive.operetta.OM.IS) {
				container = (net.sf.ictalive.operetta.OM.IS) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TransitionToSceneArc) {
				continue;
			}
			TransitionToSceneArc link = (TransitionToSceneArc) linkObject;
			if (TransitionToSceneArcEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Scene dst = link.getTo();
			Transition src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.TransitionToSceneArc_4101,
					TransitionToSceneArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SceneToTransitionArc_4102(
			Scene source) {
		net.sf.ictalive.operetta.OM.IS container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof net.sf.ictalive.operetta.OM.IS) {
				container = (net.sf.ictalive.operetta.OM.IS) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SceneToTransitionArc) {
				continue;
			}
			SceneToTransitionArc link = (SceneToTransitionArc) linkObject;
			if (SceneToTransitionArcEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Transition dst = link.getTo();
			Scene src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.SceneToTransitionArc_4102,
					SceneToTransitionArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_PartialOrder_4103(
			Landmark source) {
		LandmarkPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof LandmarkPattern) {
				container = (LandmarkPattern) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getLandmarkOrder().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PartialOrder) {
				continue;
			}
			PartialOrder link = (PartialOrder) linkObject;
			if (PartialOrderEditPart.VISUAL_ID != OperAVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Landmark dst = link.getTo();
			Landmark src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new OperALinkDescriptor(src, dst, link,
					OperAElementTypes.PartialOrder_4103,
					PartialOrderEditPart.VISUAL_ID));
		}
		return result;
	}

}
