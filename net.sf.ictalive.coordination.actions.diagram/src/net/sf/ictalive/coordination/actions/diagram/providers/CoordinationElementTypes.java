package net.sf.ictalive.coordination.actions.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ActionsCollectionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingToParamEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingValueFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListRestEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValue2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DistributionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Expression2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ExpressionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualIDEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputBindingEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ParticipantEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformHasDataFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasInputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasOutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileWhileProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.ActionDiagramEditorPlugin;
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
	public static final IElementType ActionsCollection_1000 = getElementType("net.sf.ictalive.coordination.actions.diagram.ActionsCollection_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAction_2024 = getElementType("net.sf.ictalive.coordination.actions.diagram.CompositeAction_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicAction_2025 = getElementType("net.sf.ictalive.coordination.actions.diagram.AtomicAction_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_2026 = getElementType("net.sf.ictalive.coordination.actions.diagram.Input_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_2027 = getElementType("net.sf.ictalive.coordination.actions.diagram.Output_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Participant_2028 = getElementType("net.sf.ictalive.coordination.actions.diagram.Participant_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_2029 = getElementType("net.sf.ictalive.coordination.actions.diagram.Sequence_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_2030 = getElementType("net.sf.ictalive.coordination.actions.diagram.AnyOrder_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_2031 = getElementType("net.sf.ictalive.coordination.actions.diagram.ControlConstructBag_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_2032 = getElementType("net.sf.ictalive.coordination.actions.diagram.Perform_2032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_2033 = getElementType("net.sf.ictalive.coordination.actions.diagram.Choice_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructList_2034 = getElementType("net.sf.ictalive.coordination.actions.diagram.ControlConstructList_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_2035 = getElementType("net.sf.ictalive.coordination.actions.diagram.RepeatUntil_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_2036 = getElementType("net.sf.ictalive.coordination.actions.diagram.RepeatWhile_2036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_2037 = getElementType("net.sf.ictalive.coordination.actions.diagram.IfThenElse_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputBinding_2038 = getElementType("net.sf.ictalive.coordination.actions.diagram.InputBinding_2038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_2039 = getElementType("net.sf.ictalive.coordination.actions.diagram.Split_2039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_2040 = getElementType("net.sf.ictalive.coordination.actions.diagram.SplitJoin_2040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3054 = getElementType("net.sf.ictalive.coordination.actions.diagram.Condition_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomList_3055 = getElementType("net.sf.ictalive.coordination.actions.diagram.AtomList_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassAtom_3056 = getElementType("net.sf.ictalive.coordination.actions.diagram.ClassAtom_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3057 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualID_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3058 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualVariable_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualPropertyAtom_3059 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualPropertyAtom_3059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3060 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualID_3060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3061 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualVariable_3061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3062 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualID_3062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3063 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualVariable_3063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SameIndividualAtom_3064 = getElementType("net.sf.ictalive.coordination.actions.diagram.SameIndividualAtom_3064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3065 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualID_3065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3066 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualVariable_3066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DifferentIndividualsAtom_3067 = getElementType("net.sf.ictalive.coordination.actions.diagram.DifferentIndividualsAtom_3067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3068 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualID_3068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3069 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualVariable_3069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BuiltInAtom_3070 = getElementType("net.sf.ictalive.coordination.actions.diagram.BuiltInAtom_3070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataRangeAtom_3071 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataRangeAtom_3071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataLiteral_3072 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataLiteral_3072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataValue_3073 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataValue_3073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataVariable_3074 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataVariable_3074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataValue_3090 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataValue_3090"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DatavaluedPropertyAtom_3075 = getElementType("net.sf.ictalive.coordination.actions.diagram.DatavaluedPropertyAtom_3075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualVariable_3076 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualVariable_3076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualID_3077 = getElementType("net.sf.ictalive.coordination.actions.diagram.IndividualID_3077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataLiteral_3078 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataLiteral_3078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataVariable_3079 = getElementType("net.sf.ictalive.coordination.actions.diagram.DataVariable_3079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3080 = getElementType("net.sf.ictalive.coordination.actions.diagram.Condition_3080"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicActionResult_3081 = getElementType("net.sf.ictalive.coordination.actions.diagram.AtomicActionResult_3081"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Expression_3082 = getElementType("net.sf.ictalive.coordination.actions.diagram.Expression_3082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Expression_3083 = getElementType("net.sf.ictalive.coordination.actions.diagram.Expression_3083"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Distribution_3084 = getElementType("net.sf.ictalive.coordination.actions.diagram.Distribution_3084"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Distribution_3085 = getElementType("net.sf.ictalive.coordination.actions.diagram.Distribution_3085"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Distribution_3086 = getElementType("net.sf.ictalive.coordination.actions.diagram.Distribution_3086"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3087 = getElementType("net.sf.ictalive.coordination.actions.diagram.Condition_3087"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3088 = getElementType("net.sf.ictalive.coordination.actions.diagram.Condition_3088"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3089 = getElementType("net.sf.ictalive.coordination.actions.diagram.Condition_3089"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessHasInput_4026 = getElementType("net.sf.ictalive.coordination.actions.diagram.ProcessHasInput_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessHasOutput_4027 = getElementType("net.sf.ictalive.coordination.actions.diagram.ProcessHasOutput_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessPerformedBy_4028 = getElementType("net.sf.ictalive.coordination.actions.diagram.ProcessPerformedBy_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeProcessComposedOf_4029 = getElementType("net.sf.ictalive.coordination.actions.diagram.CompositeProcessComposedOf_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PerformProcess_4030 = getElementType("net.sf.ictalive.coordination.actions.diagram.PerformProcess_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ChoiceComponents_4031 = getElementType("net.sf.ictalive.coordination.actions.diagram.ChoiceComponents_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrderComponents_4032 = getElementType("net.sf.ictalive.coordination.actions.diagram.AnyOrderComponents_4032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceComponents_4033 = getElementType("net.sf.ictalive.coordination.actions.diagram.SequenceComponents_4033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitComponents_4045 = getElementType("net.sf.ictalive.coordination.actions.diagram.SplitComponents_4045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoinComponents_4046 = getElementType("net.sf.ictalive.coordination.actions.diagram.SplitJoinComponents_4046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBagRest_4034 = getElementType("net.sf.ictalive.coordination.actions.diagram.ControlConstructBagRest_4034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructListRest_4035 = getElementType("net.sf.ictalive.coordination.actions.diagram.ControlConstructListRest_4035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElseThen_4036 = getElementType("net.sf.ictalive.coordination.actions.diagram.IfThenElseThen_4036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElseElse_4037 = getElementType("net.sf.ictalive.coordination.actions.diagram.IfThenElseElse_4037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntilUntilProcess_4038 = getElementType("net.sf.ictalive.coordination.actions.diagram.RepeatUntilUntilProcess_4038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhileWhileProcess_4039 = getElementType("net.sf.ictalive.coordination.actions.diagram.RepeatWhileWhileProcess_4039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBagFirst_4040 = getElementType("net.sf.ictalive.coordination.actions.diagram.ControlConstructBagFirst_4040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructListFirst_4041 = getElementType("net.sf.ictalive.coordination.actions.diagram.ControlConstructListFirst_4041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PerformHasDataFrom_4042 = getElementType("net.sf.ictalive.coordination.actions.diagram.PerformHasDataFrom_4042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BindingValueFrom_4043 = getElementType("net.sf.ictalive.coordination.actions.diagram.BindingValueFrom_4043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BindingToParam_4044 = getElementType("net.sf.ictalive.coordination.actions.diagram.BindingToParam_4044"); //$NON-NLS-1$

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
				return ActionDiagramEditorPlugin.getInstance()
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

			elements.put(ActionsCollection_1000, ActionsPackage.eINSTANCE
					.getActionsCollection());

			elements.put(CompositeAction_2024, ActionsPackage.eINSTANCE
					.getCompositeAction());

			elements.put(AtomicAction_2025, ActionsPackage.eINSTANCE
					.getAtomicAction());

			elements.put(Input_2026, ProcessPackage.eINSTANCE.getInput());

			elements.put(Output_2027, ProcessPackage.eINSTANCE.getOutput());

			elements.put(Participant_2028, ProcessPackage.eINSTANCE
					.getParticipant());

			elements.put(Sequence_2029, ProcessPackage.eINSTANCE.getSequence());

			elements.put(AnyOrder_2030, ProcessPackage.eINSTANCE.getAnyOrder());

			elements.put(ControlConstructBag_2031, ProcessPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(Perform_2032, ProcessPackage.eINSTANCE.getPerform());

			elements.put(Choice_2033, ProcessPackage.eINSTANCE.getChoice());

			elements.put(ControlConstructList_2034, ProcessPackage.eINSTANCE
					.getControlConstructList());

			elements.put(RepeatUntil_2035, ProcessPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatWhile_2036, ProcessPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(IfThenElse_2037, ProcessPackage.eINSTANCE
					.getIfThenElse());

			elements.put(InputBinding_2038, ProcessPackage.eINSTANCE
					.getInputBinding());

			elements.put(Split_2039, ProcessPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_2040, ProcessPackage.eINSTANCE
					.getSplitJoin());

			elements.put(Condition_3054, ExprPackage.eINSTANCE.getCondition());

			elements.put(AtomList_3055, SwrlPackage.eINSTANCE.getAtomList());

			elements.put(ClassAtom_3056, SwrlPackage.eINSTANCE.getClassAtom());

			elements.put(IndividualID_3057, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3058, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(IndividualPropertyAtom_3059, SwrlPackage.eINSTANCE
					.getIndividualPropertyAtom());

			elements.put(IndividualID_3060, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3061, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(IndividualID_3062, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3063, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(SameIndividualAtom_3064, SwrlPackage.eINSTANCE
					.getSameIndividualAtom());

			elements.put(IndividualID_3065, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3066, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(DifferentIndividualsAtom_3067, SwrlPackage.eINSTANCE
					.getDifferentIndividualsAtom());

			elements.put(IndividualID_3068, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(IndividualVariable_3069, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(BuiltInAtom_3070, SwrlPackage.eINSTANCE
					.getBuiltInAtom());

			elements.put(DataRangeAtom_3071, SwrlPackage.eINSTANCE
					.getDataRangeAtom());

			elements.put(DataLiteral_3072, SwrlPackage.eINSTANCE
					.getDataLiteral());

			elements.put(DataValue_3073, SwrlPackage.eINSTANCE.getDataValue());

			elements.put(DataVariable_3074, SwrlPackage.eINSTANCE
					.getDataVariable());

			elements.put(DataValue_3090, SwrlPackage.eINSTANCE.getDataValue());

			elements.put(DatavaluedPropertyAtom_3075, SwrlPackage.eINSTANCE
					.getDatavaluedPropertyAtom());

			elements.put(IndividualVariable_3076, SwrlPackage.eINSTANCE
					.getIndividualVariable());

			elements.put(IndividualID_3077, SwrlPackage.eINSTANCE
					.getIndividualID());

			elements.put(DataLiteral_3078, SwrlPackage.eINSTANCE
					.getDataLiteral());

			elements.put(DataVariable_3079, SwrlPackage.eINSTANCE
					.getDataVariable());

			elements.put(Condition_3080, ExprPackage.eINSTANCE.getCondition());

			elements.put(AtomicActionResult_3081, ActionsPackage.eINSTANCE
					.getAtomicActionResult());

			elements
					.put(Expression_3082, ExprPackage.eINSTANCE.getExpression());

			elements
					.put(Expression_3083, ExprPackage.eINSTANCE.getExpression());

			elements.put(Distribution_3084, ActionsPackage.eINSTANCE
					.getDistribution());

			elements.put(Distribution_3085, ActionsPackage.eINSTANCE
					.getDistribution());

			elements.put(Distribution_3086, ActionsPackage.eINSTANCE
					.getDistribution());

			elements.put(Condition_3087, ExprPackage.eINSTANCE.getCondition());

			elements.put(Condition_3088, ExprPackage.eINSTANCE.getCondition());

			elements.put(Condition_3089, ExprPackage.eINSTANCE.getCondition());

			elements.put(ProcessHasInput_4026, ProcessPackage.eINSTANCE
					.getProcess_HasInput());

			elements.put(ProcessHasOutput_4027, ProcessPackage.eINSTANCE
					.getProcess_HasOutput());

			elements.put(ProcessPerformedBy_4028, ProcessPackage.eINSTANCE
					.getProcess_PerformedBy());

			elements.put(CompositeProcessComposedOf_4029,
					ProcessPackage.eINSTANCE.getCompositeProcess_ComposedOf());

			elements.put(PerformProcess_4030, ProcessPackage.eINSTANCE
					.getPerform_Process());

			elements.put(ChoiceComponents_4031, ProcessPackage.eINSTANCE
					.getChoice_Components());

			elements.put(AnyOrderComponents_4032, ProcessPackage.eINSTANCE
					.getAnyOrder_Components());

			elements.put(SequenceComponents_4033, ProcessPackage.eINSTANCE
					.getSequence_Components());

			elements.put(SplitComponents_4045, ProcessPackage.eINSTANCE
					.getSplit_Components());

			elements.put(SplitJoinComponents_4046, ProcessPackage.eINSTANCE
					.getSplitJoin_Components());

			elements.put(ControlConstructBagRest_4034, ProcessPackage.eINSTANCE
					.getControlConstructBag_Rest());

			elements.put(ControlConstructListRest_4035,
					ProcessPackage.eINSTANCE.getControlConstructList_Rest());

			elements.put(IfThenElseThen_4036, ProcessPackage.eINSTANCE
					.getIfThenElse_Then());

			elements.put(IfThenElseElse_4037, ProcessPackage.eINSTANCE
					.getIfThenElse_Else());

			elements.put(RepeatUntilUntilProcess_4038, ProcessPackage.eINSTANCE
					.getRepeatUntil_UntilProcess());

			elements.put(RepeatWhileWhileProcess_4039, ProcessPackage.eINSTANCE
					.getRepeatWhile_WhileProcess());

			elements.put(ControlConstructBagFirst_4040,
					ProcessPackage.eINSTANCE.getControlConstructBag_First());

			elements.put(ControlConstructListFirst_4041,
					ProcessPackage.eINSTANCE.getControlConstructList_First());

			elements.put(PerformHasDataFrom_4042, ProcessPackage.eINSTANCE
					.getPerform_HasDataFrom());

			elements.put(BindingValueFrom_4043, ProcessPackage.eINSTANCE
					.getBinding_ValueFrom());

			elements.put(BindingToParam_4044, ProcessPackage.eINSTANCE
					.getBinding_ToParam());
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
			KNOWN_ELEMENT_TYPES.add(ActionsCollection_1000);
			KNOWN_ELEMENT_TYPES.add(CompositeAction_2024);
			KNOWN_ELEMENT_TYPES.add(AtomicAction_2025);
			KNOWN_ELEMENT_TYPES.add(Input_2026);
			KNOWN_ELEMENT_TYPES.add(Output_2027);
			KNOWN_ELEMENT_TYPES.add(Participant_2028);
			KNOWN_ELEMENT_TYPES.add(Sequence_2029);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_2030);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_2031);
			KNOWN_ELEMENT_TYPES.add(Perform_2032);
			KNOWN_ELEMENT_TYPES.add(Choice_2033);
			KNOWN_ELEMENT_TYPES.add(ControlConstructList_2034);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_2035);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_2036);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_2037);
			KNOWN_ELEMENT_TYPES.add(InputBinding_2038);
			KNOWN_ELEMENT_TYPES.add(Split_2039);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_2040);
			KNOWN_ELEMENT_TYPES.add(Condition_3054);
			KNOWN_ELEMENT_TYPES.add(AtomList_3055);
			KNOWN_ELEMENT_TYPES.add(ClassAtom_3056);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3057);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3058);
			KNOWN_ELEMENT_TYPES.add(IndividualPropertyAtom_3059);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3060);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3061);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3062);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3063);
			KNOWN_ELEMENT_TYPES.add(SameIndividualAtom_3064);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3065);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3066);
			KNOWN_ELEMENT_TYPES.add(DifferentIndividualsAtom_3067);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3068);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3069);
			KNOWN_ELEMENT_TYPES.add(BuiltInAtom_3070);
			KNOWN_ELEMENT_TYPES.add(DataRangeAtom_3071);
			KNOWN_ELEMENT_TYPES.add(DataLiteral_3072);
			KNOWN_ELEMENT_TYPES.add(DataValue_3073);
			KNOWN_ELEMENT_TYPES.add(DataVariable_3074);
			KNOWN_ELEMENT_TYPES.add(DataValue_3090);
			KNOWN_ELEMENT_TYPES.add(DatavaluedPropertyAtom_3075);
			KNOWN_ELEMENT_TYPES.add(IndividualVariable_3076);
			KNOWN_ELEMENT_TYPES.add(IndividualID_3077);
			KNOWN_ELEMENT_TYPES.add(DataLiteral_3078);
			KNOWN_ELEMENT_TYPES.add(DataVariable_3079);
			KNOWN_ELEMENT_TYPES.add(Condition_3080);
			KNOWN_ELEMENT_TYPES.add(AtomicActionResult_3081);
			KNOWN_ELEMENT_TYPES.add(Expression_3082);
			KNOWN_ELEMENT_TYPES.add(Expression_3083);
			KNOWN_ELEMENT_TYPES.add(Distribution_3084);
			KNOWN_ELEMENT_TYPES.add(Distribution_3085);
			KNOWN_ELEMENT_TYPES.add(Distribution_3086);
			KNOWN_ELEMENT_TYPES.add(Condition_3087);
			KNOWN_ELEMENT_TYPES.add(Condition_3088);
			KNOWN_ELEMENT_TYPES.add(Condition_3089);
			KNOWN_ELEMENT_TYPES.add(ProcessHasInput_4026);
			KNOWN_ELEMENT_TYPES.add(ProcessHasOutput_4027);
			KNOWN_ELEMENT_TYPES.add(ProcessPerformedBy_4028);
			KNOWN_ELEMENT_TYPES.add(CompositeProcessComposedOf_4029);
			KNOWN_ELEMENT_TYPES.add(PerformProcess_4030);
			KNOWN_ELEMENT_TYPES.add(ChoiceComponents_4031);
			KNOWN_ELEMENT_TYPES.add(AnyOrderComponents_4032);
			KNOWN_ELEMENT_TYPES.add(SequenceComponents_4033);
			KNOWN_ELEMENT_TYPES.add(SplitComponents_4045);
			KNOWN_ELEMENT_TYPES.add(SplitJoinComponents_4046);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBagRest_4034);
			KNOWN_ELEMENT_TYPES.add(ControlConstructListRest_4035);
			KNOWN_ELEMENT_TYPES.add(IfThenElseThen_4036);
			KNOWN_ELEMENT_TYPES.add(IfThenElseElse_4037);
			KNOWN_ELEMENT_TYPES.add(RepeatUntilUntilProcess_4038);
			KNOWN_ELEMENT_TYPES.add(RepeatWhileWhileProcess_4039);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBagFirst_4040);
			KNOWN_ELEMENT_TYPES.add(ControlConstructListFirst_4041);
			KNOWN_ELEMENT_TYPES.add(PerformHasDataFrom_4042);
			KNOWN_ELEMENT_TYPES.add(BindingValueFrom_4043);
			KNOWN_ELEMENT_TYPES.add(BindingToParam_4044);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActionsCollectionEditPart.VISUAL_ID:
			return ActionsCollection_1000;
		case CompositeActionEditPart.VISUAL_ID:
			return CompositeAction_2024;
		case AtomicActionEditPart.VISUAL_ID:
			return AtomicAction_2025;
		case InputEditPart.VISUAL_ID:
			return Input_2026;
		case OutputEditPart.VISUAL_ID:
			return Output_2027;
		case ParticipantEditPart.VISUAL_ID:
			return Participant_2028;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_2029;
		case AnyOrderEditPart.VISUAL_ID:
			return AnyOrder_2030;
		case ControlConstructBagEditPart.VISUAL_ID:
			return ControlConstructBag_2031;
		case PerformEditPart.VISUAL_ID:
			return Perform_2032;
		case ChoiceEditPart.VISUAL_ID:
			return Choice_2033;
		case ControlConstructListEditPart.VISUAL_ID:
			return ControlConstructList_2034;
		case RepeatUntilEditPart.VISUAL_ID:
			return RepeatUntil_2035;
		case RepeatWhileEditPart.VISUAL_ID:
			return RepeatWhile_2036;
		case IfThenElseEditPart.VISUAL_ID:
			return IfThenElse_2037;
		case InputBindingEditPart.VISUAL_ID:
			return InputBinding_2038;
		case SplitEditPart.VISUAL_ID:
			return Split_2039;
		case SplitJoinEditPart.VISUAL_ID:
			return SplitJoin_2040;
		case ConditionEditPart.VISUAL_ID:
			return Condition_3054;
		case AtomListEditPart.VISUAL_ID:
			return AtomList_3055;
		case ClassAtomEditPart.VISUAL_ID:
			return ClassAtom_3056;
		case IndividualIDEditPart.VISUAL_ID:
			return IndividualID_3057;
		case IndividualVariableEditPart.VISUAL_ID:
			return IndividualVariable_3058;
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return IndividualPropertyAtom_3059;
		case IndividualID2EditPart.VISUAL_ID:
			return IndividualID_3060;
		case IndividualVariable2EditPart.VISUAL_ID:
			return IndividualVariable_3061;
		case IndividualID3EditPart.VISUAL_ID:
			return IndividualID_3062;
		case IndividualVariable3EditPart.VISUAL_ID:
			return IndividualVariable_3063;
		case SameIndividualAtomEditPart.VISUAL_ID:
			return SameIndividualAtom_3064;
		case IndividualID4EditPart.VISUAL_ID:
			return IndividualID_3065;
		case IndividualVariable4EditPart.VISUAL_ID:
			return IndividualVariable_3066;
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return DifferentIndividualsAtom_3067;
		case IndividualID5EditPart.VISUAL_ID:
			return IndividualID_3068;
		case IndividualVariable5EditPart.VISUAL_ID:
			return IndividualVariable_3069;
		case BuiltInAtomEditPart.VISUAL_ID:
			return BuiltInAtom_3070;
		case DataRangeAtomEditPart.VISUAL_ID:
			return DataRangeAtom_3071;
		case DataLiteralEditPart.VISUAL_ID:
			return DataLiteral_3072;
		case DataValueEditPart.VISUAL_ID:
			return DataValue_3073;
		case DataVariableEditPart.VISUAL_ID:
			return DataVariable_3074;
		case DataValue2EditPart.VISUAL_ID:
			return DataValue_3090;
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return DatavaluedPropertyAtom_3075;
		case IndividualVariable6EditPart.VISUAL_ID:
			return IndividualVariable_3076;
		case IndividualID6EditPart.VISUAL_ID:
			return IndividualID_3077;
		case DataLiteral2EditPart.VISUAL_ID:
			return DataLiteral_3078;
		case DataVariable2EditPart.VISUAL_ID:
			return DataVariable_3079;
		case Condition2EditPart.VISUAL_ID:
			return Condition_3080;
		case AtomicActionResultEditPart.VISUAL_ID:
			return AtomicActionResult_3081;
		case ExpressionEditPart.VISUAL_ID:
			return Expression_3082;
		case Expression2EditPart.VISUAL_ID:
			return Expression_3083;
		case DistributionEditPart.VISUAL_ID:
			return Distribution_3084;
		case Distribution2EditPart.VISUAL_ID:
			return Distribution_3085;
		case Distribution3EditPart.VISUAL_ID:
			return Distribution_3086;
		case Condition3EditPart.VISUAL_ID:
			return Condition_3087;
		case Condition4EditPart.VISUAL_ID:
			return Condition_3088;
		case Condition5EditPart.VISUAL_ID:
			return Condition_3089;
		case ProcessHasInputEditPart.VISUAL_ID:
			return ProcessHasInput_4026;
		case ProcessHasOutputEditPart.VISUAL_ID:
			return ProcessHasOutput_4027;
		case ProcessPerformedByEditPart.VISUAL_ID:
			return ProcessPerformedBy_4028;
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return CompositeProcessComposedOf_4029;
		case PerformProcessEditPart.VISUAL_ID:
			return PerformProcess_4030;
		case ChoiceComponentsEditPart.VISUAL_ID:
			return ChoiceComponents_4031;
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return AnyOrderComponents_4032;
		case SequenceComponentsEditPart.VISUAL_ID:
			return SequenceComponents_4033;
		case SplitComponentsEditPart.VISUAL_ID:
			return SplitComponents_4045;
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return SplitJoinComponents_4046;
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return ControlConstructBagRest_4034;
		case ControlConstructListRestEditPart.VISUAL_ID:
			return ControlConstructListRest_4035;
		case IfThenElseThenEditPart.VISUAL_ID:
			return IfThenElseThen_4036;
		case IfThenElseElseEditPart.VISUAL_ID:
			return IfThenElseElse_4037;
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return RepeatUntilUntilProcess_4038;
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return RepeatWhileWhileProcess_4039;
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return ControlConstructBagFirst_4040;
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return ControlConstructListFirst_4041;
		case PerformHasDataFromEditPart.VISUAL_ID:
			return PerformHasDataFrom_4042;
		case BindingValueFromEditPart.VISUAL_ID:
			return BindingValueFrom_4043;
		case BindingToParamEditPart.VISUAL_ID:
			return BindingToParam_4044;
		}
		return null;
	}

}
