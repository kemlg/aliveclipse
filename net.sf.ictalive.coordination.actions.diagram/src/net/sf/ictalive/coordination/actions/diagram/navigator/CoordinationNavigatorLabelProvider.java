package net.sf.ictalive.coordination.actions.diagram.navigator;

import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.*;
import net.sf.ictalive.coordination.actions.diagram.part.ActionDiagramEditorPlugin;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationParserProvider;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.InputBinding;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.RepeatUntil;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Sequence;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class CoordinationNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ActionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ActionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CoordinationNavigatorItem
				&& !isOwnView(((CoordinationNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CoordinationNavigatorGroup) {
			CoordinationNavigatorGroup group = (CoordinationNavigatorGroup) element;
			return ActionDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem navigatorItem = (CoordinationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case ActionsCollectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/coordination/actions?ActionsCollection", CoordinationElementTypes.ActionsCollection_1000); //$NON-NLS-1$
		case CompositeActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?CompositeAction", CoordinationElementTypes.CompositeAction_2024); //$NON-NLS-1$
		case AtomicActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?AtomicAction", CoordinationElementTypes.AtomicAction_2025); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Input", CoordinationElementTypes.Input_2026); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Output", CoordinationElementTypes.Output_2027); //$NON-NLS-1$
		case ParticipantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Participant", CoordinationElementTypes.Participant_2028); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Sequence", CoordinationElementTypes.Sequence_2029); //$NON-NLS-1$
		case AnyOrderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?AnyOrder", CoordinationElementTypes.AnyOrder_2030); //$NON-NLS-1$
		case ControlConstructBagEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag", CoordinationElementTypes.ControlConstructBag_2031); //$NON-NLS-1$
		case PerformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Perform", CoordinationElementTypes.Perform_2032); //$NON-NLS-1$
		case ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Choice", CoordinationElementTypes.Choice_2033); //$NON-NLS-1$
		case ControlConstructListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?ControlConstructList", CoordinationElementTypes.ControlConstructList_2034); //$NON-NLS-1$
		case RepeatUntilEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?RepeatUntil", CoordinationElementTypes.RepeatUntil_2035); //$NON-NLS-1$
		case RepeatWhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?RepeatWhile", CoordinationElementTypes.RepeatWhile_2036); //$NON-NLS-1$
		case IfThenElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?IfThenElse", CoordinationElementTypes.IfThenElse_2037); //$NON-NLS-1$
		case InputBindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?InputBinding", CoordinationElementTypes.InputBinding_2038); //$NON-NLS-1$
		case SplitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Split", CoordinationElementTypes.Split_2039); //$NON-NLS-1$
		case SplitJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?SplitJoin", CoordinationElementTypes.SplitJoin_2040); //$NON-NLS-1$
		case ConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Condition", CoordinationElementTypes.Condition_3054); //$NON-NLS-1$
		case AtomListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?AtomList", CoordinationElementTypes.AtomList_3055); //$NON-NLS-1$
		case ClassAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?ClassAtom", CoordinationElementTypes.ClassAtom_3056); //$NON-NLS-1$
		case IndividualIDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3057); //$NON-NLS-1$
		case IndividualVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3058); //$NON-NLS-1$
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualPropertyAtom", CoordinationElementTypes.IndividualPropertyAtom_3059); //$NON-NLS-1$
		case IndividualID2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3060); //$NON-NLS-1$
		case IndividualVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3061); //$NON-NLS-1$
		case IndividualID3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3062); //$NON-NLS-1$
		case IndividualVariable3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3063); //$NON-NLS-1$
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?SameIndividualAtom", CoordinationElementTypes.SameIndividualAtom_3064); //$NON-NLS-1$
		case IndividualID4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3065); //$NON-NLS-1$
		case IndividualVariable4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3066); //$NON-NLS-1$
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DifferentIndividualsAtom", CoordinationElementTypes.DifferentIndividualsAtom_3067); //$NON-NLS-1$
		case IndividualID5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3068); //$NON-NLS-1$
		case IndividualVariable5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3069); //$NON-NLS-1$
		case BuiltInAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?BuiltInAtom", CoordinationElementTypes.BuiltInAtom_3070); //$NON-NLS-1$
		case DataRangeAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataRangeAtom", CoordinationElementTypes.DataRangeAtom_3071); //$NON-NLS-1$
		case DataLiteralEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataLiteral", CoordinationElementTypes.DataLiteral_3072); //$NON-NLS-1$
		case DataValueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataValue", CoordinationElementTypes.DataValue_3073); //$NON-NLS-1$
		case DataVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataVariable", CoordinationElementTypes.DataVariable_3074); //$NON-NLS-1$
		case DataValue2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataValue", CoordinationElementTypes.DataValue_3090); //$NON-NLS-1$
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DatavaluedPropertyAtom", CoordinationElementTypes.DatavaluedPropertyAtom_3075); //$NON-NLS-1$
		case IndividualVariable6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3076); //$NON-NLS-1$
		case IndividualID6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3077); //$NON-NLS-1$
		case DataLiteral2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataLiteral", CoordinationElementTypes.DataLiteral_3078); //$NON-NLS-1$
		case DataVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataVariable", CoordinationElementTypes.DataVariable_3079); //$NON-NLS-1$
		case Condition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Condition", CoordinationElementTypes.Condition_3080); //$NON-NLS-1$
		case AtomicActionResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/actions?AtomicActionResult", CoordinationElementTypes.AtomicActionResult_3081); //$NON-NLS-1$
		case ExpressionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Expression", CoordinationElementTypes.Expression_3082); //$NON-NLS-1$
		case Expression2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Expression", CoordinationElementTypes.Expression_3083); //$NON-NLS-1$
		case DistributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/actions?Distribution", CoordinationElementTypes.Distribution_3084); //$NON-NLS-1$
		case Distribution2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/actions?Distribution", CoordinationElementTypes.Distribution_3085); //$NON-NLS-1$
		case Distribution3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/actions?Distribution", CoordinationElementTypes.Distribution_3086); //$NON-NLS-1$
		case Condition3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Condition", CoordinationElementTypes.Condition_3087); //$NON-NLS-1$
		case Condition4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Condition", CoordinationElementTypes.Condition_3088); //$NON-NLS-1$
		case Condition5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Condition", CoordinationElementTypes.Condition_3089); //$NON-NLS-1$
		case ProcessHasInputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Process?hasInput", CoordinationElementTypes.ProcessHasInput_4026); //$NON-NLS-1$
		case ProcessHasOutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Process?hasOutput", CoordinationElementTypes.ProcessHasOutput_4027); //$NON-NLS-1$
		case ProcessPerformedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Process?performedBy", CoordinationElementTypes.ProcessPerformedBy_4028); //$NON-NLS-1$
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?CompositeProcess?composedOf", CoordinationElementTypes.CompositeProcessComposedOf_4029); //$NON-NLS-1$
		case PerformProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Perform?process", CoordinationElementTypes.PerformProcess_4030); //$NON-NLS-1$
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Choice?components", CoordinationElementTypes.ChoiceComponents_4031); //$NON-NLS-1$
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?AnyOrder?components", CoordinationElementTypes.AnyOrderComponents_4032); //$NON-NLS-1$
		case SequenceComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Sequence?components", CoordinationElementTypes.SequenceComponents_4033); //$NON-NLS-1$
		case SplitComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Split?components", CoordinationElementTypes.SplitComponents_4045); //$NON-NLS-1$
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?SplitJoin?components", CoordinationElementTypes.SplitJoinComponents_4046); //$NON-NLS-1$
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag?rest", CoordinationElementTypes.ControlConstructBagRest_4034); //$NON-NLS-1$
		case ControlConstructListRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructList?rest", CoordinationElementTypes.ControlConstructListRest_4035); //$NON-NLS-1$
		case IfThenElseThenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?IfThenElse?then", CoordinationElementTypes.IfThenElseThen_4036); //$NON-NLS-1$
		case IfThenElseElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?IfThenElse?else", CoordinationElementTypes.IfThenElseElse_4037); //$NON-NLS-1$
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?RepeatUntil?untilProcess", CoordinationElementTypes.RepeatUntilUntilProcess_4038); //$NON-NLS-1$
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?RepeatWhile?whileProcess", CoordinationElementTypes.RepeatWhileWhileProcess_4039); //$NON-NLS-1$
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag?first", CoordinationElementTypes.ControlConstructBagFirst_4040); //$NON-NLS-1$
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructList?first", CoordinationElementTypes.ControlConstructListFirst_4041); //$NON-NLS-1$
		case PerformHasDataFromEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Perform?hasDataFrom", CoordinationElementTypes.PerformHasDataFrom_4042); //$NON-NLS-1$
		case BindingValueFromEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Binding?valueFrom", CoordinationElementTypes.BindingValueFrom_4043); //$NON-NLS-1$
		case BindingToParamEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Binding?toParam", CoordinationElementTypes.BindingToParam_4044); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ActionDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CoordinationElementTypes.isKnownElementType(elementType)) {
			image = CoordinationElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CoordinationNavigatorGroup) {
			CoordinationNavigatorGroup group = (CoordinationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem navigatorItem = (CoordinationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case ActionsCollectionEditPart.VISUAL_ID:
			return getActionsCollection_1000Text(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2024Text(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2025Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2026Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2027Text(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2028Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2029Text(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2030Text(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2031Text(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2032Text(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2033Text(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2034Text(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2035Text(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2036Text(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2037Text(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_2038Text(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2039Text(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2040Text(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3054Text(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3055Text(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3056Text(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3057Text(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3058Text(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3059Text(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3060Text(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3061Text(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3062Text(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3063Text(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3064Text(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3065Text(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3066Text(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3067Text(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3068Text(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3069Text(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3070Text(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3071Text(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3072Text(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3073Text(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3074Text(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3090Text(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3075Text(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3076Text(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3077Text(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3078Text(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3079Text(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3080Text(view);
		case AtomicActionResultEditPart.VISUAL_ID:
			return getAtomicActionResult_3081Text(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3082Text(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3083Text(view);
		case DistributionEditPart.VISUAL_ID:
			return getDistribution_3084Text(view);
		case Distribution2EditPart.VISUAL_ID:
			return getDistribution_3085Text(view);
		case Distribution3EditPart.VISUAL_ID:
			return getDistribution_3086Text(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3087Text(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3088Text(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3089Text(view);
		case ProcessHasInputEditPart.VISUAL_ID:
			return getProcessHasInput_4026Text(view);
		case ProcessHasOutputEditPart.VISUAL_ID:
			return getProcessHasOutput_4027Text(view);
		case ProcessPerformedByEditPart.VISUAL_ID:
			return getProcessPerformedBy_4028Text(view);
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getCompositeProcessComposedOf_4029Text(view);
		case PerformProcessEditPart.VISUAL_ID:
			return getPerformProcess_4030Text(view);
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getChoiceComponents_4031Text(view);
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getAnyOrderComponents_4032Text(view);
		case SequenceComponentsEditPart.VISUAL_ID:
			return getSequenceComponents_4033Text(view);
		case SplitComponentsEditPart.VISUAL_ID:
			return getSplitComponents_4045Text(view);
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return getSplitJoinComponents_4046Text(view);
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getControlConstructBagRest_4034Text(view);
		case ControlConstructListRestEditPart.VISUAL_ID:
			return getControlConstructListRest_4035Text(view);
		case IfThenElseThenEditPart.VISUAL_ID:
			return getIfThenElseThen_4036Text(view);
		case IfThenElseElseEditPart.VISUAL_ID:
			return getIfThenElseElse_4037Text(view);
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getRepeatUntilUntilProcess_4038Text(view);
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return getRepeatWhileWhileProcess_4039Text(view);
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getControlConstructBagFirst_4040Text(view);
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getControlConstructListFirst_4041Text(view);
		case PerformHasDataFromEditPart.VISUAL_ID:
			return getPerformHasDataFrom_4042Text(view);
		case BindingValueFromEditPart.VISUAL_ID:
			return getBindingValueFrom_4043Text(view);
		case BindingToParamEditPart.VISUAL_ID:
			return getBindingToParam_4044Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getActionsCollection_1000Text(View view) {
		ActionsCollection domainModelElement = (ActionsCollection) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAction_2024Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.CompositeAction_2024, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(CompositeActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicAction_2025Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.AtomicAction_2025,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(AtomicActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_2026Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Input_2026,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_2027Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Output_2027,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParticipant_2028Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Participant_2028,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_2029Text(View view) {
		Sequence domainModelElement = (Sequence) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_2030Text(View view) {
		AnyOrder domainModelElement = (AnyOrder) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_2031Text(View view) {
		ControlConstructBag domainModelElement = (ControlConstructBag) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_2032Text(View view) {
		Perform domainModelElement = (Perform) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_2033Text(View view) {
		Choice domainModelElement = (Choice) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructList_2034Text(View view) {
		ControlConstructList domainModelElement = (ControlConstructList) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_2035Text(View view) {
		RepeatUntil domainModelElement = (RepeatUntil) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_2036Text(View view) {
		RepeatWhile domainModelElement = (RepeatWhile) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_2037Text(View view) {
		IfThenElse domainModelElement = (IfThenElse) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputBinding_2038Text(View view) {
		InputBinding domainModelElement = (InputBinding) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getValueSpecifier();
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_2039Text(View view) {
		Split domainModelElement = (Split) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_2040Text(View view) {
		SplitJoin domainModelElement = (SplitJoin) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3054Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Condition_3054,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomList_3055Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassAtom_3056Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ClassAtom_3056,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3057Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3057,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3058Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3058, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualPropertyAtom_3059Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualPropertyAtom_3059, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3060Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3060,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3061Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3061, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3062Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3062,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3063Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3063, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSameIndividualAtom_3064Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.SameIndividualAtom_3064, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3065Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3065,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3066Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3066, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDifferentIndividualsAtom_3067Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DifferentIndividualsAtom_3067, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3068Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3068,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3069Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3069, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBuiltInAtom_3070Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.BuiltInAtom_3070,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(BuiltInAtomBuiltInEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataRangeAtom_3071Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDataLiteral_3072Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDataValue_3073Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataValue_3073,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataValueLiteralEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataVariable_3074Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataVariable_3074,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataValue_3090Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataValue_3090,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataValueLiteral2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDatavaluedPropertyAtom_3075Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DatavaluedPropertyAtom_3075, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3076Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3076, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3077Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3077,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataLiteral_3078Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDataVariable_3079Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataVariable_3079,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataVariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3080Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Condition_3080,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ConditionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicActionResult_3081Text(View view) {
		IParser parser = CoordinationParserProvider
				.getParser(
						CoordinationElementTypes.AtomicActionResult_3081,
						view.getElement() != null ? view.getElement() : view,
						CoordinationVisualIDRegistry
								.getType(AtomicActionResultHasDensityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpression_3082Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Expression_3082,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ExpressionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpression_3083Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Expression_3083,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ExpressionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDistribution_3084Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Distribution_3084,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DistributionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDistribution_3085Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Distribution_3085,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(Distribution2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDistribution_3086Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Distribution_3086,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(Distribution3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3087Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Condition_3087,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ConditionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3088Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Condition_3088,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ConditionName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3089Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Condition_3089,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ConditionName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessHasInput_4026Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ProcessHasInput_4026, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessHasOutput_4027Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ProcessHasOutput_4027, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessPerformedBy_4028Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ProcessPerformedBy_4028, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeProcessComposedOf_4029Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.CompositeProcessComposedOf_4029, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerformProcess_4030Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.PerformProcess_4030,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoiceComponents_4031Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ChoiceComponents_4031, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrderComponents_4032Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.AnyOrderComponents_4032, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceComponents_4033Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.SequenceComponents_4033, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitComponents_4045Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.SplitComponents_4045, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoinComponents_4046Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.SplitJoinComponents_4046, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBagRest_4034Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructBagRest_4034, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructListRest_4035Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructListRest_4035, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElseThen_4036Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IfThenElseThen_4036,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElseElse_4037Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IfThenElseElse_4037,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntilUntilProcess_4038Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.RepeatUntilUntilProcess_4038, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhileWhileProcess_4039Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.RepeatWhileWhileProcess_4039, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBagFirst_4040Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructBagFirst_4040, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructListFirst_4041Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructListFirst_4041, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerformHasDataFrom_4042Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.PerformHasDataFrom_4042, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBindingValueFrom_4043Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.BindingValueFrom_4043, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBindingToParam_4044Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.BindingToParam_4044,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActionsCollectionEditPart.MODEL_ID
				.equals(CoordinationVisualIDRegistry.getModelID(view));
	}

}
