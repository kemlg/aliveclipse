package net.sf.ictalive.coordination.plans.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanForTaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlansCollectionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.part.PlanDiagramEditorPlugin;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.owls.process.ProcessPackage;

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
	public static final IElementType PlansCollection_1000 = getElementType("net.sf.ictalive.coordination.plans.diagram.PlansCollection_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plan_2009 = getElementType("net.sf.ictalive.coordination.plans.diagram.Plan_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_2010 = getElementType("net.sf.ictalive.coordination.plans.diagram.Task_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGroundingList_2011 = getElementType("net.sf.ictalive.coordination.plans.diagram.ActionGroundingList_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicAction_2012 = getElementType("net.sf.ictalive.coordination.plans.diagram.AtomicAction_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAction_2013 = getElementType("net.sf.ictalive.coordination.plans.diagram.CompositeAction_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_2014 = getElementType("net.sf.ictalive.coordination.plans.diagram.Input_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_2015 = getElementType("net.sf.ictalive.coordination.plans.diagram.Output_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGrounding_3003 = getElementType("net.sf.ictalive.coordination.plans.diagram.ActionGrounding_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputMessageMap_3004 = getElementType("net.sf.ictalive.coordination.plans.diagram.InputMessageMap_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGroundingListRest_4006 = getElementType("net.sf.ictalive.coordination.plans.diagram.ActionGroundingListRest_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputMessageMapParameter_4007 = getElementType("net.sf.ictalive.coordination.plans.diagram.InputMessageMapParameter_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGroundingOwlsProcess_4008 = getElementType("net.sf.ictalive.coordination.plans.diagram.ActionGroundingOwlsProcess_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanForTask_4009 = getElementType("net.sf.ictalive.coordination.plans.diagram.PlanForTask_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanHasAtomicProcessGroundingList_4010 = getElementType("net.sf.ictalive.coordination.plans.diagram.PlanHasAtomicProcessGroundingList_4010"); //$NON-NLS-1$

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
				return PlanDiagramEditorPlugin.getInstance()
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

			elements.put(PlansCollection_1000, TasksPackage.eINSTANCE
					.getPlansCollection());

			elements.put(Plan_2009, TasksPackage.eINSTANCE.getPlan());

			elements.put(Task_2010, TasksPackage.eINSTANCE.getTask());

			elements.put(ActionGroundingList_2011, TasksPackage.eINSTANCE
					.getActionGroundingList());

			elements.put(AtomicAction_2012, ActionsPackage.eINSTANCE
					.getAtomicAction());

			elements.put(CompositeAction_2013, ActionsPackage.eINSTANCE
					.getCompositeAction());

			elements.put(Input_2014, ProcessPackage.eINSTANCE.getInput());

			elements.put(Output_2015, ProcessPackage.eINSTANCE.getOutput());

			elements.put(ActionGrounding_3003, TasksPackage.eINSTANCE
					.getActionGrounding());

			elements.put(InputMessageMap_3004, TasksPackage.eINSTANCE
					.getInputMessageMap());

			elements.put(ActionGroundingListRest_4006, TasksPackage.eINSTANCE
					.getActionGroundingList_Rest());

			elements.put(InputMessageMapParameter_4007, TasksPackage.eINSTANCE
					.getInputMessageMap_Parameter());

			elements.put(ActionGroundingOwlsProcess_4008,
					TasksPackage.eINSTANCE.getActionGrounding_OwlsProcess());

			elements.put(PlanForTask_4009, TasksPackage.eINSTANCE
					.getPlan_ForTask());

			elements.put(PlanHasAtomicProcessGroundingList_4010,
					TasksPackage.eINSTANCE
							.getPlan_HasAtomicProcessGroundingList());
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
			KNOWN_ELEMENT_TYPES.add(PlansCollection_1000);
			KNOWN_ELEMENT_TYPES.add(Plan_2009);
			KNOWN_ELEMENT_TYPES.add(Task_2010);
			KNOWN_ELEMENT_TYPES.add(ActionGroundingList_2011);
			KNOWN_ELEMENT_TYPES.add(AtomicAction_2012);
			KNOWN_ELEMENT_TYPES.add(CompositeAction_2013);
			KNOWN_ELEMENT_TYPES.add(Input_2014);
			KNOWN_ELEMENT_TYPES.add(Output_2015);
			KNOWN_ELEMENT_TYPES.add(ActionGrounding_3003);
			KNOWN_ELEMENT_TYPES.add(InputMessageMap_3004);
			KNOWN_ELEMENT_TYPES.add(ActionGroundingListRest_4006);
			KNOWN_ELEMENT_TYPES.add(InputMessageMapParameter_4007);
			KNOWN_ELEMENT_TYPES.add(ActionGroundingOwlsProcess_4008);
			KNOWN_ELEMENT_TYPES.add(PlanForTask_4009);
			KNOWN_ELEMENT_TYPES.add(PlanHasAtomicProcessGroundingList_4010);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PlansCollectionEditPart.VISUAL_ID:
			return PlansCollection_1000;
		case PlanEditPart.VISUAL_ID:
			return Plan_2009;
		case TaskEditPart.VISUAL_ID:
			return Task_2010;
		case ActionGroundingListEditPart.VISUAL_ID:
			return ActionGroundingList_2011;
		case AtomicActionEditPart.VISUAL_ID:
			return AtomicAction_2012;
		case CompositeActionEditPart.VISUAL_ID:
			return CompositeAction_2013;
		case InputEditPart.VISUAL_ID:
			return Input_2014;
		case OutputEditPart.VISUAL_ID:
			return Output_2015;
		case ActionGroundingEditPart.VISUAL_ID:
			return ActionGrounding_3003;
		case InputMessageMapEditPart.VISUAL_ID:
			return InputMessageMap_3004;
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return ActionGroundingListRest_4006;
		case InputMessageMapParameterEditPart.VISUAL_ID:
			return InputMessageMapParameter_4007;
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			return ActionGroundingOwlsProcess_4008;
		case PlanForTaskEditPart.VISUAL_ID:
			return PlanForTask_4009;
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return PlanHasAtomicProcessGroundingList_4010;
		}
		return null;
	}

}
