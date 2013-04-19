package net.sf.ictalive.coordination.agents.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasRoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.MasModelEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.part.AgentsDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.OMPackage;

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
public class CoordinationElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private CoordinationElementTypes() {
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
	public static final IElementType MasModel_1000 = getElementType("net.sf.ictalive.coordination.agents.diagram.MasModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Agent_2004 = getElementType("net.sf.ictalive.coordination.agents.diagram.Agent_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2005 = getElementType("net.sf.ictalive.coordination.agents.diagram.Role_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicAction_2006 = getElementType("net.sf.ictalive.coordination.agents.diagram.AtomicAction_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAction_2007 = getElementType("net.sf.ictalive.coordination.agents.diagram.CompositeAction_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AgentHasAction_4003 = getElementType("net.sf.ictalive.coordination.agents.diagram.AgentHasAction_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AgentHasRole_4004 = getElementType("net.sf.ictalive.coordination.agents.diagram.AgentHasRole_4004"); //$NON-NLS-1$

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
				return AgentsDiagramEditorPlugin.getInstance()
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

			elements.put(MasModel_1000, AgentsPackage.eINSTANCE.getMasModel());

			elements.put(Agent_2004, AgentsPackage.eINSTANCE.getAgent());

			elements.put(Role_2005, OMPackage.eINSTANCE.getRole());

			elements.put(AtomicAction_2006, ActionsPackage.eINSTANCE
					.getAtomicAction());

			elements.put(CompositeAction_2007, ActionsPackage.eINSTANCE
					.getCompositeAction());

			elements.put(AgentHasAction_4003, AgentsPackage.eINSTANCE
					.getAgent_HasAction());

			elements.put(AgentHasRole_4004, AgentsPackage.eINSTANCE
					.getAgent_HasRole());
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
			KNOWN_ELEMENT_TYPES.add(MasModel_1000);
			KNOWN_ELEMENT_TYPES.add(Agent_2004);
			KNOWN_ELEMENT_TYPES.add(Role_2005);
			KNOWN_ELEMENT_TYPES.add(AtomicAction_2006);
			KNOWN_ELEMENT_TYPES.add(CompositeAction_2007);
			KNOWN_ELEMENT_TYPES.add(AgentHasAction_4003);
			KNOWN_ELEMENT_TYPES.add(AgentHasRole_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MasModelEditPart.VISUAL_ID:
			return MasModel_1000;
		case AgentEditPart.VISUAL_ID:
			return Agent_2004;
		case RoleEditPart.VISUAL_ID:
			return Role_2005;
		case AtomicActionEditPart.VISUAL_ID:
			return AtomicAction_2006;
		case CompositeActionEditPart.VISUAL_ID:
			return CompositeAction_2007;
		case AgentHasActionEditPart.VISUAL_ID:
			return AgentHasAction_4003;
		case AgentHasRoleEditPart.VISUAL_ID:
			return AgentHasRole_4004;
		}
		return null;
	}

}
