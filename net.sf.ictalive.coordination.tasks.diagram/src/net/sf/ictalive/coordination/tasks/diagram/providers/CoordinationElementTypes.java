package net.sf.ictalive.coordination.tasks.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListRestEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValue2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualIDEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatWhileWhileConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TasksCollectionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.part.TaskDiagramEditorPlugin;
import net.sf.ictalive.owls.expr.ExprPackage;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.rules.swrl.SwrlPackage;

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
	public static final IElementType TasksCollection_1000 = getElementType("net.sf.ictalive.coordination.tasks.diagram.TasksCollection_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAction_2020 = getElementType("net.sf.ictalive.coordination.tasks.diagram.CompositeAction_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_2021 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Task_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicAction_2022 = getElementType("net.sf.ictalive.coordination.tasks.diagram.AtomicAction_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_2023 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Input_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_2024 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Output_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_2025 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Sequence_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_2026 = getElementType("net.sf.ictalive.coordination.tasks.diagram.AnyOrder_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_2027 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ControlConstructBag_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_2028 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Perform_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_2029 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Choice_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructList_2030 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ControlConstructList_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3031 = getElementType("net.sf.ictalive.coordination.tasks.diagram.Condition_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomList_3032 = getElementType("net.sf.ictalive.coordination.tasks.diagram.AtomList_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassAtom_3033 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ClassAtom_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3034 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualID_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3035 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualVariable_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualPropertyAtom_3036 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualPropertyAtom_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3037 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualID_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3038 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualVariable_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3039 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualID_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3040 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualVariable_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SameIndividualAtom_3041 = getElementType("net.sf.ictalive.coordination.tasks.diagram.SameIndividualAtom_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3042 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualID_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3043 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualVariable_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DifferentIndividualsAtom_3044 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DifferentIndividualsAtom_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3045 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualID_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3046 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualVariable_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BuiltInAtom_3047 = getElementType("net.sf.ictalive.coordination.tasks.diagram.BuiltInAtom_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataRangeAtom_3048 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataRangeAtom_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataLiteral_3049 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataLiteral_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataValue_3050 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataValue_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataVariable_3051 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataVariable_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataValue_3058 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataValue_3058"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DatavaluedPropertyAtom_3052 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DatavaluedPropertyAtom_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3053 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualVariable_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3054 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IndividualID_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataLiteral_3055 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataLiteral_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataVariable_3056 = getElementType("net.sf.ictalive.coordination.tasks.diagram.DataVariable_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputMessageMap_3057 = getElementType("net.sf.ictalive.coordination.tasks.diagram.InputMessageMap_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessPerformedBy_4019 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ProcessPerformedBy_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeProcessComposedOf_4020 = getElementType("net.sf.ictalive.coordination.tasks.diagram.CompositeProcessComposedOf_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PerformProcess_4021 = getElementType("net.sf.ictalive.coordination.tasks.diagram.PerformProcess_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ChoiceComponents_4022 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ChoiceComponents_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrderComponents_4023 = getElementType("net.sf.ictalive.coordination.tasks.diagram.AnyOrderComponents_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceComponents_4024 = getElementType("net.sf.ictalive.coordination.tasks.diagram.SequenceComponents_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskComponents_4025 = getElementType("net.sf.ictalive.coordination.tasks.diagram.TaskComponents_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBagRest_4026 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ControlConstructBagRest_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputMessageMapParameter_4027 = getElementType("net.sf.ictalive.coordination.tasks.diagram.InputMessageMapParameter_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructListRest_4028 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ControlConstructListRest_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElseThen_4029 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IfThenElseThen_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElseElse_4030 = getElementType("net.sf.ictalive.coordination.tasks.diagram.IfThenElseElse_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntilUntilProcess_4031 = getElementType("net.sf.ictalive.coordination.tasks.diagram.RepeatUntilUntilProcess_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhileWhileCondition_4032 = getElementType("net.sf.ictalive.coordination.tasks.diagram.RepeatWhileWhileCondition_4032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBagFirst_4033 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ControlConstructBagFirst_4033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructListFirst_4034 = getElementType("net.sf.ictalive.coordination.tasks.diagram.ControlConstructListFirst_4034"); //$NON-NLS-1$

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
				return TaskDiagramEditorPlugin.getInstance()
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

			elements.put(TasksCollection_1000, TasksPackage.eINSTANCE
					.getTasksCollection());

			elements.put(CompositeAction_2020, ActionsPackage.eINSTANCE
					.getCompositeAction());

			elements.put(Task_2021, TasksPackage.eINSTANCE.getTask());

			elements.put(AtomicAction_2022, ActionsPackage.eINSTANCE
					.getAtomicAction());

			elements.put(Input_2023, ProcessPackage.eINSTANCE.getInput());

			elements.put(Output_2024, ProcessPackage.eINSTANCE.getOutput());

			elements.put(Sequence_2025, ProcessPackage.eINSTANCE.getSequence());

			elements.put(AnyOrder_2026, ProcessPackage.eINSTANCE.getAnyOrder());

			elements.put(ControlConstructBag_2027, ProcessPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(Perform_2028, ProcessPackage.eINSTANCE.getPerform());

			elements.put(Choice_2029, ProcessPackage.eINSTANCE.getChoice());

			elements.put(ControlConstructList_2030, ProcessPackage.eINSTANCE
					.getControlConstructList());

			elements.put(Condition_3031, ExprPackage.eINSTANCE.getCondition());

			elements.put(AtomList_3032, SwrlPackage.eINSTANCE.getAtomList());

			elements.put(ClassAtom_3033, SwrlPackage.eINSTANCE.getClassAtom());

			elements.put(IndividualID_3034, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3035, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(IndividualPropertyAtom_3036, SwrlPackage.eINSTANCE
					.getIndividualPropertyAtom());

			elements.put(IndividualID_3037, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3038, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(IndividualID_3039, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3040, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(SameIndividualAtom_3041, SwrlPackage.eINSTANCE
					.getSameIndividualAtom());

			elements.put(IndividualID_3042, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3043, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(DifferentIndividualsAtom_3044, SwrlPackage.eINSTANCE
					.getDifferentIndividualsAtom());

			elements.put(IndividualID_3045, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3046, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(BuiltInAtom_3047, SwrlPackage.eINSTANCE
					.getBuiltInAtom());

			elements.put(DataRangeAtom_3048, SwrlPackage.eINSTANCE
					.getDataRangeAtom());

			elements.put(DataLiteral_3049, SwrlPackage.eINSTANCE
					.getDataLiteral());

			elements.put(DataValue_3050, SwrlPackage.eINSTANCE.getDataValue());

			elements.put(DataVariable_3051, SwrlPackage.eINSTANCE
					.getDataVariable());

			elements.put(DataValue_3058, SwrlPackage.eINSTANCE.getDataValue());

			elements.put(DatavaluedPropertyAtom_3052, SwrlPackage.eINSTANCE
					.getDatavaluedPropertyAtom());

			elements.put(IndividualVariable_3053, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(IndividualID_3054, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(DataLiteral_3055, SwrlPackage.eINSTANCE
					.getDataLiteral());

			elements.put(DataVariable_3056, SwrlPackage.eINSTANCE
					.getDataVariable());

			elements.put(InputMessageMap_3057, TasksPackage.eINSTANCE
					.getInputMessageMap());

			elements.put(ProcessPerformedBy_4019, ProcessPackage.eINSTANCE
					.getProcess_PerformedBy());

			elements.put(CompositeProcessComposedOf_4020,
					ProcessPackage.eINSTANCE.getCompositeProcess_ComposedOf());

			elements.put(PerformProcess_4021, ProcessPackage.eINSTANCE
					.getPerform_Process());

			elements.put(ChoiceComponents_4022, ProcessPackage.eINSTANCE
					.getChoice_Components());

			elements.put(AnyOrderComponents_4023, ProcessPackage.eINSTANCE
					.getAnyOrder_Components());

			elements.put(SequenceComponents_4024, ProcessPackage.eINSTANCE
					.getSequence_Components());

			elements.put(TaskComponents_4025, TasksPackage.eINSTANCE
					.getTask_Components());

			elements.put(ControlConstructBagRest_4026, ProcessPackage.eINSTANCE
					.getControlConstructBag_Rest());

			elements.put(InputMessageMapParameter_4027, TasksPackage.eINSTANCE
					.getInputMessageMap_Parameter());

			elements.put(ControlConstructListRest_4028,
					ProcessPackage.eINSTANCE.getControlConstructList_Rest());

			elements.put(IfThenElseThen_4029, ProcessPackage.eINSTANCE
					.getIfThenElse_Then());

			elements.put(IfThenElseElse_4030, ProcessPackage.eINSTANCE
					.getIfThenElse_Else());

			elements.put(RepeatUntilUntilProcess_4031, ProcessPackage.eINSTANCE
					.getRepeatUntil_UntilProcess());

			elements.put(RepeatWhileWhileCondition_4032,
					ProcessPackage.eINSTANCE.getRepeatWhile_WhileCondition());

			elements.put(ControlConstructBagFirst_4033,
					ProcessPackage.eINSTANCE.getControlConstructBag_First());

			elements.put(ControlConstructListFirst_4034,
					ProcessPackage.eINSTANCE.getControlConstructList_First());
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
			KNOWN_ELEMENT_TYPES.add(TasksCollection_1000);
			KNOWN_ELEMENT_TYPES.add(CompositeAction_2020);
			KNOWN_ELEMENT_TYPES.add(Task_2021);
			KNOWN_ELEMENT_TYPES.add(AtomicAction_2022);
			KNOWN_ELEMENT_TYPES.add(Input_2023);
			KNOWN_ELEMENT_TYPES.add(Output_2024);
			KNOWN_ELEMENT_TYPES.add(Sequence_2025);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_2026);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_2027);
			KNOWN_ELEMENT_TYPES.add(Perform_2028);
			KNOWN_ELEMENT_TYPES.add(Choice_2029);
			KNOWN_ELEMENT_TYPES.add(ControlConstructList_2030);
			KNOWN_ELEMENT_TYPES.add(Condition_3031);
			KNOWN_ELEMENT_TYPES.add(AtomList_3032);
			KNOWN_ELEMENT_TYPES.add(ClassAtom_3033);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3034);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3035);
			KNOWN_ELEMENT_TYPES.add(IndividualPropertyAtom_3036);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3037);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3038);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3039);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3040);
			KNOWN_ELEMENT_TYPES.add(SameIndividualAtom_3041);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3042);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3043);
			KNOWN_ELEMENT_TYPES.add(DifferentIndividualsAtom_3044);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3045);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3046);
			KNOWN_ELEMENT_TYPES.add(BuiltInAtom_3047);
			KNOWN_ELEMENT_TYPES.add(DataRangeAtom_3048);
			KNOWN_ELEMENT_TYPES.add(DataLiteral_3049);
			KNOWN_ELEMENT_TYPES.add(DataValue_3050);
			KNOWN_ELEMENT_TYPES.add(DataVariable_3051);
			KNOWN_ELEMENT_TYPES.add(DataValue_3058);
			KNOWN_ELEMENT_TYPES.add(DatavaluedPropertyAtom_3052);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3053);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3054);
			KNOWN_ELEMENT_TYPES.add(DataLiteral_3055);
			KNOWN_ELEMENT_TYPES.add(DataVariable_3056);
			KNOWN_ELEMENT_TYPES.add(InputMessageMap_3057);
			KNOWN_ELEMENT_TYPES.add(ProcessPerformedBy_4019);
			KNOWN_ELEMENT_TYPES.add(CompositeProcessComposedOf_4020);
			KNOWN_ELEMENT_TYPES.add(PerformProcess_4021);
			KNOWN_ELEMENT_TYPES.add(ChoiceComponents_4022);
			KNOWN_ELEMENT_TYPES.add(AnyOrderComponents_4023);
			KNOWN_ELEMENT_TYPES.add(SequenceComponents_4024);
			KNOWN_ELEMENT_TYPES.add(TaskComponents_4025);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBagRest_4026);
			KNOWN_ELEMENT_TYPES.add(InputMessageMapParameter_4027);
			KNOWN_ELEMENT_TYPES.add(ControlConstructListRest_4028);
			KNOWN_ELEMENT_TYPES.add(IfThenElseThen_4029);
			KNOWN_ELEMENT_TYPES.add(IfThenElseElse_4030);
			KNOWN_ELEMENT_TYPES.add(RepeatUntilUntilProcess_4031);
			KNOWN_ELEMENT_TYPES.add(RepeatWhileWhileCondition_4032);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBagFirst_4033);
			KNOWN_ELEMENT_TYPES.add(ControlConstructListFirst_4034);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TasksCollectionEditPart.VISUAL_ID:
			return TasksCollection_1000;
		case CompositeActionEditPart.VISUAL_ID:
			return CompositeAction_2020;
		case TaskEditPart.VISUAL_ID:
			return Task_2021;
		case AtomicActionEditPart.VISUAL_ID:
			return AtomicAction_2022;
		case InputEditPart.VISUAL_ID:
			return Input_2023;
		case OutputEditPart.VISUAL_ID:
			return Output_2024;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_2025;
		case AnyOrderEditPart.VISUAL_ID:
			return AnyOrder_2026;
		case ControlConstructBagEditPart.VISUAL_ID:
			return ControlConstructBag_2027;
		case PerformEditPart.VISUAL_ID:
			return Perform_2028;
		case ChoiceEditPart.VISUAL_ID:
			return Choice_2029;
		case ControlConstructListEditPart.VISUAL_ID:
			return ControlConstructList_2030;
		case ConditionEditPart.VISUAL_ID:
			return Condition_3031;
		case AtomListEditPart.VISUAL_ID:
			return AtomList_3032;
		case ClassAtomEditPart.VISUAL_ID:
			return ClassAtom_3033;
		case IndividualIDEditPart.VISUAL_ID:
			return IndividualID_3034;
		case IndividualVariableEditPart.VISUAL_ID:
			return IndividualVariable_3035;
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return IndividualPropertyAtom_3036;
		case IndividualID2EditPart.VISUAL_ID:
			return IndividualID_3037;
		case IndividualVariable2EditPart.VISUAL_ID:
			return IndividualVariable_3038;
		case IndividualID3EditPart.VISUAL_ID:
			return IndividualID_3039;
		case IndividualVariable3EditPart.VISUAL_ID:
			return IndividualVariable_3040;
		case SameIndividualAtomEditPart.VISUAL_ID:
			return SameIndividualAtom_3041;
		case IndividualID4EditPart.VISUAL_ID:
			return IndividualID_3042;
		case IndividualVariable4EditPart.VISUAL_ID:
			return IndividualVariable_3043;
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return DifferentIndividualsAtom_3044;
		case IndividualID5EditPart.VISUAL_ID:
			return IndividualID_3045;
		case IndividualVariable5EditPart.VISUAL_ID:
			return IndividualVariable_3046;
		case BuiltInAtomEditPart.VISUAL_ID:
			return BuiltInAtom_3047;
		case DataRangeAtomEditPart.VISUAL_ID:
			return DataRangeAtom_3048;
		case DataLiteralEditPart.VISUAL_ID:
			return DataLiteral_3049;
		case DataValueEditPart.VISUAL_ID:
			return DataValue_3050;
		case DataVariableEditPart.VISUAL_ID:
			return DataVariable_3051;
		case DataValue2EditPart.VISUAL_ID:
			return DataValue_3058;
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return DatavaluedPropertyAtom_3052;
		case IndividualVariable6EditPart.VISUAL_ID:
			return IndividualVariable_3053;
		case IndividualID6EditPart.VISUAL_ID:
			return IndividualID_3054;
		case DataLiteral2EditPart.VISUAL_ID:
			return DataLiteral_3055;
		case DataVariable2EditPart.VISUAL_ID:
			return DataVariable_3056;
		case InputMessageMapEditPart.VISUAL_ID:
			return InputMessageMap_3057;
		case ProcessPerformedByEditPart.VISUAL_ID:
			return ProcessPerformedBy_4019;
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return CompositeProcessComposedOf_4020;
		case PerformProcessEditPart.VISUAL_ID:
			return PerformProcess_4021;
		case ChoiceComponentsEditPart.VISUAL_ID:
			return ChoiceComponents_4022;
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return AnyOrderComponents_4023;
		case SequenceComponentsEditPart.VISUAL_ID:
			return SequenceComponents_4024;
		case TaskComponentsEditPart.VISUAL_ID:
			return TaskComponents_4025;
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return ControlConstructBagRest_4026;
		case InputMessageMapParameterEditPart.VISUAL_ID:
			return InputMessageMapParameter_4027;
		case ControlConstructListRestEditPart.VISUAL_ID:
			return ControlConstructListRest_4028;
		case IfThenElseThenEditPart.VISUAL_ID:
			return IfThenElseThen_4029;
		case IfThenElseElseEditPart.VISUAL_ID:
			return IfThenElseElse_4030;
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return RepeatUntilUntilProcess_4031;
		case RepeatWhileWhileConditionEditPart.VISUAL_ID:
			return RepeatWhileWhileCondition_4032;
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return ControlConstructBagFirst_4033;
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return ControlConstructListFirst_4034;
		}
		return null;
	}

}
