package net.sf.ictalive.operetta.OM.diagram.ss.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperASSDiagramEditorPlugin;

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
	public static final IElementType SS_1000 = getElementType("net.sf.ictalive.operetta.diagram.ss.SS_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2001 = getElementType("net.sf.ictalive.operetta.diagram.ss.Role_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NetworkDependency_4001 = getElementType("net.sf.ictalive.operetta.diagram.ss.NetworkDependency_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MarketDependency_4002 = getElementType("net.sf.ictalive.operetta.diagram.ss.MarketDependency_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HierarchyDependency_4003 = getElementType("net.sf.ictalive.operetta.diagram.ss.HierarchyDependency_4003"); //$NON-NLS-1$

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
				return OperASSDiagramEditorPlugin.getInstance()
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

			elements.put(SS_1000, OMPackage.eINSTANCE.getSS());

			elements.put(Role_2001, OMPackage.eINSTANCE.getRole());

			elements.put(NetworkDependency_4001, OMPackage.eINSTANCE
					.getNetworkDependency());

			elements.put(MarketDependency_4002, OMPackage.eINSTANCE
					.getMarketDependency());

			elements.put(HierarchyDependency_4003, OMPackage.eINSTANCE
					.getHierarchyDependency());
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
			KNOWN_ELEMENT_TYPES.add(SS_1000);
			KNOWN_ELEMENT_TYPES.add(Role_2001);
			KNOWN_ELEMENT_TYPES.add(NetworkDependency_4001);
			KNOWN_ELEMENT_TYPES.add(MarketDependency_4002);
			KNOWN_ELEMENT_TYPES.add(HierarchyDependency_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SSEditPart.VISUAL_ID:
			return SS_1000;
		case RoleEditPart.VISUAL_ID:
			return Role_2001;
		case NetworkDependencyEditPart.VISUAL_ID:
			return NetworkDependency_4001;
		case MarketDependencyEditPart.VISUAL_ID:
			return MarketDependency_4002;
		case HierarchyDependencyEditPart.VISUAL_ID:
			return HierarchyDependency_4003;
		}
		return null;
	}

}
