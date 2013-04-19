package net.sf.ictalive.operetta.OM.diagram.is.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.PartialOrderEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneToTransitionArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class OperAElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private OperAElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType IS_1100 = getElementType("net.sf.ictalive.operetta.diagram.is.IS_1100"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scene_2101 = getElementType("net.sf.ictalive.operetta.diagram.is.Scene_2101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scene_2102 = getElementType("net.sf.ictalive.operetta.diagram.is.Scene_2102"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scene_2103 = getElementType("net.sf.ictalive.operetta.diagram.is.Scene_2103"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_2104 = getElementType("net.sf.ictalive.operetta.diagram.is.Transition_2104"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_2105 = getElementType("net.sf.ictalive.operetta.diagram.is.Transition_2105"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_2106 = getElementType("net.sf.ictalive.operetta.diagram.is.Transition_2106"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LandmarkPattern_3101 = getElementType("net.sf.ictalive.operetta.diagram.is.LandmarkPattern_3101"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Landmark_3102 = getElementType("net.sf.ictalive.operetta.diagram.is.Landmark_3102"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransitionToSceneArc_4101 = getElementType("net.sf.ictalive.operetta.diagram.is.TransitionToSceneArc_4101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SceneToTransitionArc_4102 = getElementType("net.sf.ictalive.operetta.diagram.is.SceneToTransitionArc_4102"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PartialOrder_4103 = getElementType("net.sf.ictalive.operetta.diagram.is.PartialOrder_4103"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return OperAISDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(IS_1100, OMPackage.eINSTANCE.getIS());

			elements.put(Scene_2101, OMPackage.eINSTANCE.getScene());

			elements.put(Scene_2102, OMPackage.eINSTANCE.getScene());

			elements.put(Scene_2103, OMPackage.eINSTANCE.getScene());

			elements.put(Transition_2104, OMPackage.eINSTANCE.getTransition());

			elements.put(Transition_2105, OMPackage.eINSTANCE.getTransition());

			elements.put(Transition_2106, OMPackage.eINSTANCE.getTransition());

			elements.put(LandmarkPattern_3101, OMPackage.eINSTANCE
					.getLandmarkPattern());

			elements.put(Landmark_3102, OMPackage.eINSTANCE.getLandmark());

			elements.put(TransitionToSceneArc_4101, OMPackage.eINSTANCE
					.getTransitionToSceneArc());

			elements.put(SceneToTransitionArc_4102, OMPackage.eINSTANCE
					.getSceneToTransitionArc());

			elements.put(PartialOrder_4103, OMPackage.eINSTANCE
					.getPartialOrder());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(IS_1100);
			KNOWN_ELEMENT_TYPES.add(Scene_2101);
			KNOWN_ELEMENT_TYPES.add(Scene_2102);
			KNOWN_ELEMENT_TYPES.add(Scene_2103);
			KNOWN_ELEMENT_TYPES.add(Transition_2104);
			KNOWN_ELEMENT_TYPES.add(Transition_2105);
			KNOWN_ELEMENT_TYPES.add(Transition_2106);
			KNOWN_ELEMENT_TYPES.add(LandmarkPattern_3101);
			KNOWN_ELEMENT_TYPES.add(Landmark_3102);
			KNOWN_ELEMENT_TYPES.add(TransitionToSceneArc_4101);
			KNOWN_ELEMENT_TYPES.add(SceneToTransitionArc_4102);
			KNOWN_ELEMENT_TYPES.add(PartialOrder_4103);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ISEditPart.VISUAL_ID:
			return IS_1100;
		case SceneEditPart.VISUAL_ID:
			return Scene_2101;
		case Scene2EditPart.VISUAL_ID:
			return Scene_2102;
		case Scene3EditPart.VISUAL_ID:
			return Scene_2103;
		case TransitionEditPart.VISUAL_ID:
			return Transition_2104;
		case Transition2EditPart.VISUAL_ID:
			return Transition_2105;
		case Transition3EditPart.VISUAL_ID:
			return Transition_2106;
		case LandmarkPatternEditPart.VISUAL_ID:
			return LandmarkPattern_3101;
		case LandmarkEditPart.VISUAL_ID:
			return Landmark_3102;
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return TransitionToSceneArc_4101;
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return SceneToTransitionArc_4102;
		case PartialOrderEditPart.VISUAL_ID:
			return PartialOrder_4103;
		}
		return null;
	}

}
