package net.sf.ictalive.coordination.tasks.diagram.navigator;

import net.sf.ictalive.coordination.tasks.TasksCollection;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.BuiltInAtomBuiltInEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionNameEditPart;
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
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueLiteral2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueLiteralEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableName2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableNameEditPart;
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
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapMessagePartEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputNameEditPart;
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
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TasksCollectionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.diagram.part.TaskDiagramEditorPlugin;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationParserProvider;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.Sequence;

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
		TaskDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TaskDiagramEditorPlugin
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
			return TaskDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem navigatorItem = (CoordinationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case TasksCollectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/coordination/tasks?TasksCollection", CoordinationElementTypes.TasksCollection_1000); //$NON-NLS-1$
		case CompositeActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?CompositeAction", CoordinationElementTypes.CompositeAction_2020); //$NON-NLS-1$
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/tasks?Task", CoordinationElementTypes.Task_2021); //$NON-NLS-1$
		case AtomicActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?AtomicAction", CoordinationElementTypes.AtomicAction_2022); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Input", CoordinationElementTypes.Input_2023); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Output", CoordinationElementTypes.Output_2024); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Sequence", CoordinationElementTypes.Sequence_2025); //$NON-NLS-1$
		case AnyOrderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?AnyOrder", CoordinationElementTypes.AnyOrder_2026); //$NON-NLS-1$
		case ControlConstructBagEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag", CoordinationElementTypes.ControlConstructBag_2027); //$NON-NLS-1$
		case PerformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Perform", CoordinationElementTypes.Perform_2028); //$NON-NLS-1$
		case ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Choice", CoordinationElementTypes.Choice_2029); //$NON-NLS-1$
		case ControlConstructListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?ControlConstructList", CoordinationElementTypes.ControlConstructList_2030); //$NON-NLS-1$
		case ConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/owls/expr?Condition", CoordinationElementTypes.Condition_3031); //$NON-NLS-1$
		case AtomListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?AtomList", CoordinationElementTypes.AtomList_3032); //$NON-NLS-1$
		case ClassAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?ClassAtom", CoordinationElementTypes.ClassAtom_3033); //$NON-NLS-1$
		case IndividualIDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3034); //$NON-NLS-1$
		case IndividualVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3035); //$NON-NLS-1$
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualPropertyAtom", CoordinationElementTypes.IndividualPropertyAtom_3036); //$NON-NLS-1$
		case IndividualID2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3037); //$NON-NLS-1$
		case IndividualVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3038); //$NON-NLS-1$
		case IndividualID3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3039); //$NON-NLS-1$
		case IndividualVariable3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3040); //$NON-NLS-1$
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?SameIndividualAtom", CoordinationElementTypes.SameIndividualAtom_3041); //$NON-NLS-1$
		case IndividualID4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3042); //$NON-NLS-1$
		case IndividualVariable4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3043); //$NON-NLS-1$
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DifferentIndividualsAtom", CoordinationElementTypes.DifferentIndividualsAtom_3044); //$NON-NLS-1$
		case IndividualID5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3045); //$NON-NLS-1$
		case IndividualVariable5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3046); //$NON-NLS-1$
		case BuiltInAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?BuiltInAtom", CoordinationElementTypes.BuiltInAtom_3047); //$NON-NLS-1$
		case DataRangeAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataRangeAtom", CoordinationElementTypes.DataRangeAtom_3048); //$NON-NLS-1$
		case DataLiteralEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataLiteral", CoordinationElementTypes.DataLiteral_3049); //$NON-NLS-1$
		case DataValueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataValue", CoordinationElementTypes.DataValue_3050); //$NON-NLS-1$
		case DataVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataVariable", CoordinationElementTypes.DataVariable_3051); //$NON-NLS-1$
		case DataValue2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataValue", CoordinationElementTypes.DataValue_3058); //$NON-NLS-1$
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DatavaluedPropertyAtom", CoordinationElementTypes.DatavaluedPropertyAtom_3052); //$NON-NLS-1$
		case IndividualVariable6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualVariable", CoordinationElementTypes.IndividualVariable_3053); //$NON-NLS-1$
		case IndividualID6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?IndividualID", CoordinationElementTypes.IndividualID_3054); //$NON-NLS-1$
		case DataLiteral2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataLiteral", CoordinationElementTypes.DataLiteral_3055); //$NON-NLS-1$
		case DataVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/swrl?DataVariable", CoordinationElementTypes.DataVariable_3056); //$NON-NLS-1$
		case InputMessageMapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/tasks?InputMessageMap", CoordinationElementTypes.InputMessageMap_3057); //$NON-NLS-1$
		case ProcessPerformedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Process?performedBy", CoordinationElementTypes.ProcessPerformedBy_4019); //$NON-NLS-1$
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?CompositeProcess?composedOf", CoordinationElementTypes.CompositeProcessComposedOf_4020); //$NON-NLS-1$
		case PerformProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Perform?process", CoordinationElementTypes.PerformProcess_4021); //$NON-NLS-1$
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Choice?components", CoordinationElementTypes.ChoiceComponents_4022); //$NON-NLS-1$
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?AnyOrder?components", CoordinationElementTypes.AnyOrderComponents_4023); //$NON-NLS-1$
		case SequenceComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Sequence?components", CoordinationElementTypes.SequenceComponents_4024); //$NON-NLS-1$
		case TaskComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?Task?components", CoordinationElementTypes.TaskComponents_4025); //$NON-NLS-1$
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag?rest", CoordinationElementTypes.ControlConstructBagRest_4026); //$NON-NLS-1$
		case InputMessageMapParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?InputMessageMap?parameter", CoordinationElementTypes.InputMessageMapParameter_4027); //$NON-NLS-1$
		case ControlConstructListRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructList?rest", CoordinationElementTypes.ControlConstructListRest_4028); //$NON-NLS-1$
		case IfThenElseThenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?IfThenElse?then", CoordinationElementTypes.IfThenElseThen_4029); //$NON-NLS-1$
		case IfThenElseElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?IfThenElse?else", CoordinationElementTypes.IfThenElseElse_4030); //$NON-NLS-1$
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?RepeatUntil?untilProcess", CoordinationElementTypes.RepeatUntilUntilProcess_4031); //$NON-NLS-1$
		case RepeatWhileWhileConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?RepeatWhile?whileCondition", CoordinationElementTypes.RepeatWhileWhileCondition_4032); //$NON-NLS-1$
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag?first", CoordinationElementTypes.ControlConstructBagFirst_4033); //$NON-NLS-1$
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructList?first", CoordinationElementTypes.ControlConstructListFirst_4034); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TaskDiagramEditorPlugin.getInstance()
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
		case TasksCollectionEditPart.VISUAL_ID:
			return getTasksCollection_1000Text(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2020Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2021Text(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2022Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2023Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2024Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2025Text(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2026Text(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2027Text(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2028Text(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2029Text(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2030Text(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3031Text(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3032Text(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3033Text(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3034Text(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3035Text(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3036Text(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3037Text(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3038Text(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3039Text(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3040Text(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3041Text(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3042Text(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3043Text(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3044Text(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3045Text(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3046Text(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3047Text(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3048Text(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3049Text(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3050Text(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3051Text(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3058Text(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3052Text(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3053Text(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3054Text(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3055Text(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3056Text(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3057Text(view);
		case ProcessPerformedByEditPart.VISUAL_ID:
			return getProcessPerformedBy_4019Text(view);
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getCompositeProcessComposedOf_4020Text(view);
		case PerformProcessEditPart.VISUAL_ID:
			return getPerformProcess_4021Text(view);
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getChoiceComponents_4022Text(view);
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getAnyOrderComponents_4023Text(view);
		case SequenceComponentsEditPart.VISUAL_ID:
			return getSequenceComponents_4024Text(view);
		case TaskComponentsEditPart.VISUAL_ID:
			return getTaskComponents_4025Text(view);
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getControlConstructBagRest_4026Text(view);
		case InputMessageMapParameterEditPart.VISUAL_ID:
			return getInputMessageMapParameter_4027Text(view);
		case ControlConstructListRestEditPart.VISUAL_ID:
			return getControlConstructListRest_4028Text(view);
		case IfThenElseThenEditPart.VISUAL_ID:
			return getIfThenElseThen_4029Text(view);
		case IfThenElseElseEditPart.VISUAL_ID:
			return getIfThenElseElse_4030Text(view);
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getRepeatUntilUntilProcess_4031Text(view);
		case RepeatWhileWhileConditionEditPart.VISUAL_ID:
			return getRepeatWhileWhileCondition_4032Text(view);
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getControlConstructBagFirst_4033Text(view);
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getControlConstructListFirst_4034Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTasksCollection_1000Text(View view) {
		TasksCollection domainModelElement = (TasksCollection) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAction_2020Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.CompositeAction_2020, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(CompositeActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2021Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Task_2021,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(TaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicAction_2022Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.AtomicAction_2022,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(AtomicActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_2023Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Input_2023,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_2024Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Output_2024,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_2025Text(View view) {
		Sequence domainModelElement = (Sequence) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_2026Text(View view) {
		AnyOrder domainModelElement = (AnyOrder) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_2027Text(View view) {
		ControlConstructBag domainModelElement = (ControlConstructBag) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_2028Text(View view) {
		Perform domainModelElement = (Perform) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_2029Text(View view) {
		Choice domainModelElement = (Choice) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructList_2030Text(View view) {
		ControlConstructList domainModelElement = (ControlConstructList) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3031Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Condition_3031,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(ConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomList_3032Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassAtom_3033Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ClassAtom_3033,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3034Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3034,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3035Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3035, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualPropertyAtom_3036Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualPropertyAtom_3036, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3037Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3037,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3038Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3038, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3039Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3039,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3040Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3040, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSameIndividualAtom_3041Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.SameIndividualAtom_3041, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3042Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3042,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3043Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3043, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDifferentIndividualsAtom_3044Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DifferentIndividualsAtom_3044, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3045Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3045,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3046Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3046, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBuiltInAtom_3047Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.BuiltInAtom_3047,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(BuiltInAtomBuiltInEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataRangeAtom_3048Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDataLiteral_3049Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDataValue_3050Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataValue_3050,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataValueLiteralEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataVariable_3051Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataVariable_3051,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataValue_3058Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataValue_3058,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataValueLiteral2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDatavaluedPropertyAtom_3052Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DatavaluedPropertyAtom_3052, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualVariable_3053Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualVariable_3053, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(IndividualVariableName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualID_3054Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IndividualID_3054,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataLiteral_3055Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDataVariable_3056Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.DataVariable_3056,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(DataVariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputMessageMap_3057Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.InputMessageMap_3057, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(InputMessageMapMessagePartEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessPerformedBy_4019Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ProcessPerformedBy_4019, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeProcessComposedOf_4020Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.CompositeProcessComposedOf_4020, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerformProcess_4021Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.PerformProcess_4021,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoiceComponents_4022Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ChoiceComponents_4022, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrderComponents_4023Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.AnyOrderComponents_4023, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceComponents_4024Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.SequenceComponents_4024, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskComponents_4025Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.TaskComponents_4025,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBagRest_4026Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructBagRest_4026, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputMessageMapParameter_4027Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.InputMessageMapParameter_4027, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructListRest_4028Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructListRest_4028, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElseThen_4029Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IfThenElseThen_4029,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElseElse_4030Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.IfThenElseElse_4030,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntilUntilProcess_4031Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.RepeatUntilUntilProcess_4031, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhileWhileCondition_4032Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.RepeatWhileWhileCondition_4032, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBagFirst_4033Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructBagFirst_4033, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructListFirst_4034Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ControlConstructListFirst_4034, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6034); //$NON-NLS-1$
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
		return TasksCollectionEditPart.MODEL_ID
				.equals(CoordinationVisualIDRegistry.getModelID(view));
	}

}
