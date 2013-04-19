/*
 * 
 */
package control.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import control.InputBinding;
import control.LinkBinding;
import control.LocBinding;
import control.OuterProcess;
import control.OutputBinding;
import control.diagram.edit.parts.*;
import control.diagram.part.ControlDiagramEditorPlugin;
import control.diagram.part.ControlVisualIDRegistry;
import control.diagram.providers.ControlElementTypes;
import control.diagram.providers.ControlParserProvider;

/**
 * @generated
 */
public class ControlNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ControlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ControlDiagramEditorPlugin
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
		if (element instanceof ControlNavigatorItem
				&& !isOwnView(((ControlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ControlNavigatorGroup) {
			ControlNavigatorGroup group = (ControlNavigatorGroup) element;
			return ControlDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ControlNavigatorItem) {
			ControlNavigatorItem navigatorItem = (ControlNavigatorItem) element;
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
		switch (ControlVisualIDRegistry.getVisualID(view)) {
		case OuterProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.example.org?OuterProcess", ControlElementTypes.OuterProcess_1000); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Input", ControlElementTypes.Input_2027); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Output", ControlElementTypes.Output_2028); //$NON-NLS-1$
		case LocEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Loc", ControlElementTypes.Loc_2003); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Sequence", ControlElementTypes.Sequence_2004); //$NON-NLS-1$
		case ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Choice", ControlElementTypes.Choice_2005); //$NON-NLS-1$
		case AnyOrderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_2006); //$NON-NLS-1$
		case SplitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Split", ControlElementTypes.Split_2007); //$NON-NLS-1$
		case SplitJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_2008); //$NON-NLS-1$
		case IfThenElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_2009); //$NON-NLS-1$
		case RepeatUntilEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_2010); //$NON-NLS-1$
		case RepeatWhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_2011); //$NON-NLS-1$
		case PerformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Perform", ControlElementTypes.Perform_2012); //$NON-NLS-1$
		case ProduceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Produce", ControlElementTypes.Produce_2013); //$NON-NLS-1$
		case SetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Set", ControlElementTypes.Set_2014); //$NON-NLS-1$
		case LinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Link", ControlElementTypes.Link_2015); //$NON-NLS-1$
		case ConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Condition", ControlElementTypes.Condition_2017); //$NON-NLS-1$
		case ResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Result", ControlElementTypes.Result_2018); //$NON-NLS-1$
		case OntologyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Ontology", ControlElementTypes.Ontology_2029); //$NON-NLS-1$
		case TemplateConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?TemplateConstraint", ControlElementTypes.TemplateConstraint_2030); //$NON-NLS-1$
		case ExprEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org?Expr", ControlElementTypes.Expr_2019); //$NON-NLS-1$
		case ControlConstructListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructList", ControlElementTypes.ControlConstructList_3001); //$NON-NLS-1$
		case Sequence2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Sequence", ControlElementTypes.Sequence_3002); //$NON-NLS-1$
		case Choice2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Choice", ControlElementTypes.Choice_3003); //$NON-NLS-1$
		case ControlConstructBagEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructBag", ControlElementTypes.ControlConstructBag_3004); //$NON-NLS-1$
		case Sequence3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Sequence", ControlElementTypes.Sequence_3005); //$NON-NLS-1$
		case Choice3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Choice", ControlElementTypes.Choice_3006); //$NON-NLS-1$
		case AnyOrder2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_3007); //$NON-NLS-1$
		case ControlConstructBag2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructBag", ControlElementTypes.ControlConstructBag_3008); //$NON-NLS-1$
		case Split2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Split", ControlElementTypes.Split_3009); //$NON-NLS-1$
		case ControlConstructBag3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructBag", ControlElementTypes.ControlConstructBag_3010); //$NON-NLS-1$
		case SplitJoin2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_3011); //$NON-NLS-1$
		case ControlConstructBag4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructBag", ControlElementTypes.ControlConstructBag_3012); //$NON-NLS-1$
		case IfThenElse2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_3013); //$NON-NLS-1$
		case Sequence4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Sequence", ControlElementTypes.Sequence_3014); //$NON-NLS-1$
		case Choice4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Choice", ControlElementTypes.Choice_3015); //$NON-NLS-1$
		case AnyOrder3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_3016); //$NON-NLS-1$
		case Split3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Split", ControlElementTypes.Split_3017); //$NON-NLS-1$
		case SplitJoin3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_3018); //$NON-NLS-1$
		case IfThenElse3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_3019); //$NON-NLS-1$
		case RepeatUntil2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_3020); //$NON-NLS-1$
		case Sequence5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Sequence", ControlElementTypes.Sequence_3021); //$NON-NLS-1$
		case Choice5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Choice", ControlElementTypes.Choice_3022); //$NON-NLS-1$
		case AnyOrder4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_3023); //$NON-NLS-1$
		case Split4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Split", ControlElementTypes.Split_3024); //$NON-NLS-1$
		case SplitJoin4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_3025); //$NON-NLS-1$
		case IfThenElse4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_3026); //$NON-NLS-1$
		case RepeatWhile2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_3027); //$NON-NLS-1$
		case Sequence6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Sequence", ControlElementTypes.Sequence_3028); //$NON-NLS-1$
		case Choice6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Choice", ControlElementTypes.Choice_3029); //$NON-NLS-1$
		case AnyOrder5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_3030); //$NON-NLS-1$
		case Split5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Split", ControlElementTypes.Split_3031); //$NON-NLS-1$
		case SplitJoin5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_3032); //$NON-NLS-1$
		case IfThenElse5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_3033); //$NON-NLS-1$
		case Perform2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Perform", ControlElementTypes.Perform_3034); //$NON-NLS-1$
		case RemoteProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RemoteProcess", ControlElementTypes.RemoteProcess_3104); //$NON-NLS-1$
		case Input2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Input", ControlElementTypes.Input_3105); //$NON-NLS-1$
		case Output2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Output", ControlElementTypes.Output_3106); //$NON-NLS-1$
		case Result2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Result", ControlElementTypes.Result_3107); //$NON-NLS-1$
		case ValueSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueSource", ControlElementTypes.ValueSource_3094); //$NON-NLS-1$
		case ValueFormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueForm", ControlElementTypes.ValueForm_3095); //$NON-NLS-1$
		case ValueFunctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueFunction", ControlElementTypes.ValueFunction_3096); //$NON-NLS-1$
		case ResultVarEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ResultVar", ControlElementTypes.ResultVar_3097); //$NON-NLS-1$
		case Condition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Condition", ControlElementTypes.Condition_3098); //$NON-NLS-1$
		case Condition3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Condition", ControlElementTypes.Condition_3099); //$NON-NLS-1$
		case Expr2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Expr", ControlElementTypes.Expr_3100); //$NON-NLS-1$
		case Expr3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Expr", ControlElementTypes.Expr_3101); //$NON-NLS-1$
		case Condition4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Condition", ControlElementTypes.Condition_3108); //$NON-NLS-1$
		case Expr4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Expr", ControlElementTypes.Expr_3109); //$NON-NLS-1$
		case TemplateProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?TemplateProcess", ControlElementTypes.TemplateProcess_3110); //$NON-NLS-1$
		case Produce2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Produce", ControlElementTypes.Produce_3043); //$NON-NLS-1$
		case ValueSource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueSource", ControlElementTypes.ValueSource_3044); //$NON-NLS-1$
		case ValueForm2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueForm", ControlElementTypes.ValueForm_3045); //$NON-NLS-1$
		case ValueFunction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueFunction", ControlElementTypes.ValueFunction_3046); //$NON-NLS-1$
		case Set2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Set", ControlElementTypes.Set_3047); //$NON-NLS-1$
		case ValueSource3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueSource", ControlElementTypes.ValueSource_3048); //$NON-NLS-1$
		case ValueForm3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueForm", ControlElementTypes.ValueForm_3049); //$NON-NLS-1$
		case ValueFunction3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ValueFunction", ControlElementTypes.ValueFunction_3050); //$NON-NLS-1$
		case Sequence7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Sequence", ControlElementTypes.Sequence_3051); //$NON-NLS-1$
		case Choice7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Choice", ControlElementTypes.Choice_3052); //$NON-NLS-1$
		case AnyOrder6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_3053); //$NON-NLS-1$
		case Split6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Split", ControlElementTypes.Split_3054); //$NON-NLS-1$
		case SplitJoin6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_3055); //$NON-NLS-1$
		case IfThenElse6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_3056); //$NON-NLS-1$
		case RepeatUntil3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_3057); //$NON-NLS-1$
		case RepeatUntil4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_3058); //$NON-NLS-1$
		case RepeatWhile3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_3059); //$NON-NLS-1$
		case RepeatUntil5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_3060); //$NON-NLS-1$
		case Perform3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Perform", ControlElementTypes.Perform_3061); //$NON-NLS-1$
		case Produce3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Produce", ControlElementTypes.Produce_3062); //$NON-NLS-1$
		case Set3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Set", ControlElementTypes.Set_3063); //$NON-NLS-1$
		case Condition5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Condition", ControlElementTypes.Condition_3111); //$NON-NLS-1$
		case Expr5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Expr", ControlElementTypes.Expr_3112); //$NON-NLS-1$
		case RepeatWhile4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_3065); //$NON-NLS-1$
		case Perform4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Perform", ControlElementTypes.Perform_3066); //$NON-NLS-1$
		case Produce4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Produce", ControlElementTypes.Produce_3067); //$NON-NLS-1$
		case Set4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Set", ControlElementTypes.Set_3068); //$NON-NLS-1$
		case Condition6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Condition", ControlElementTypes.Condition_3113); //$NON-NLS-1$
		case Expr6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Expr", ControlElementTypes.Expr_3114); //$NON-NLS-1$
		case RepeatWhile5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_3070); //$NON-NLS-1$
		case Perform5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Perform", ControlElementTypes.Perform_3071); //$NON-NLS-1$
		case Produce5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Produce", ControlElementTypes.Produce_3072); //$NON-NLS-1$
		case Set5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Set", ControlElementTypes.Set_3073); //$NON-NLS-1$
		case Condition7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Condition", ControlElementTypes.Condition_3115); //$NON-NLS-1$
		case Expr7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Expr", ControlElementTypes.Expr_3116); //$NON-NLS-1$
		case RepeatUntil6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_3076); //$NON-NLS-1$
		case RepeatWhile6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_3077); //$NON-NLS-1$
		case Perform6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Perform", ControlElementTypes.Perform_3078); //$NON-NLS-1$
		case Produce6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Produce", ControlElementTypes.Produce_3079); //$NON-NLS-1$
		case Set6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Set", ControlElementTypes.Set_3080); //$NON-NLS-1$
		case ControlConstructBag5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructBag", ControlElementTypes.ControlConstructBag_3082); //$NON-NLS-1$
		case AnyOrder7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?AnyOrder", ControlElementTypes.AnyOrder_3083); //$NON-NLS-1$
		case Split7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Split", ControlElementTypes.Split_3084); //$NON-NLS-1$
		case SplitJoin7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?SplitJoin", ControlElementTypes.SplitJoin_3085); //$NON-NLS-1$
		case IfThenElse7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?IfThenElse", ControlElementTypes.IfThenElse_3086); //$NON-NLS-1$
		case RepeatUntil7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatUntil", ControlElementTypes.RepeatUntil_3087); //$NON-NLS-1$
		case RepeatWhile7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?RepeatWhile", ControlElementTypes.RepeatWhile_3088); //$NON-NLS-1$
		case Perform7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Perform", ControlElementTypes.Perform_3089); //$NON-NLS-1$
		case Produce7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Produce", ControlElementTypes.Produce_3090); //$NON-NLS-1$
		case Set7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?Set", ControlElementTypes.Set_3091); //$NON-NLS-1$
		case ControlConstructList2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org?ControlConstructList", ControlElementTypes.ControlConstructList_3093); //$NON-NLS-1$
		case LocBindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org?LocBinding", ControlElementTypes.LocBinding_4001); //$NON-NLS-1$
		case InputBindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org?InputBinding", ControlElementTypes.InputBinding_4002); //$NON-NLS-1$
		case OutputBindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org?OutputBinding", ControlElementTypes.OutputBinding_4003); //$NON-NLS-1$
		case LinkBindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org?LinkBinding", ControlElementTypes.LinkBinding_4004); //$NON-NLS-1$
		case OutputBindingSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org?outputBindingSource", ControlElementTypes.OutputBindingSource_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ControlDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ControlElementTypes.isKnownElementType(elementType)) {
			image = ControlElementTypes.getImage(elementType);
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
		if (element instanceof ControlNavigatorGroup) {
			ControlNavigatorGroup group = (ControlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ControlNavigatorItem) {
			ControlNavigatorItem navigatorItem = (ControlNavigatorItem) element;
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
		switch (ControlVisualIDRegistry.getVisualID(view)) {
		case OuterProcessEditPart.VISUAL_ID:
			return getOuterProcess_1000Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2027Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2028Text(view);
		case LocEditPart.VISUAL_ID:
			return getLoc_2003Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004Text(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2005Text(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2006Text(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2007Text(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2008Text(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2009Text(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010Text(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011Text(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2012Text(view);
		case ProduceEditPart.VISUAL_ID:
			return getProduce_2013Text(view);
		case SetEditPart.VISUAL_ID:
			return getSet_2014Text(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_2015Text(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2017Text(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2018Text(view);
		case OntologyEditPart.VISUAL_ID:
			return getOntology_2029Text(view);
		case TemplateConstraintEditPart.VISUAL_ID:
			return getTemplateConstraint_2030Text(view);
		case ExprEditPart.VISUAL_ID:
			return getExpr_2019Text(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_3001Text(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3002Text(view);
		case Choice2EditPart.VISUAL_ID:
			return getChoice_3003Text(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_3004Text(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3005Text(view);
		case Choice3EditPart.VISUAL_ID:
			return getChoice_3006Text(view);
		case AnyOrder2EditPart.VISUAL_ID:
			return getAnyOrder_3007Text(view);
		case ControlConstructBag2EditPart.VISUAL_ID:
			return getControlConstructBag_3008Text(view);
		case Split2EditPart.VISUAL_ID:
			return getSplit_3009Text(view);
		case ControlConstructBag3EditPart.VISUAL_ID:
			return getControlConstructBag_3010Text(view);
		case SplitJoin2EditPart.VISUAL_ID:
			return getSplitJoin_3011Text(view);
		case ControlConstructBag4EditPart.VISUAL_ID:
			return getControlConstructBag_3012Text(view);
		case IfThenElse2EditPart.VISUAL_ID:
			return getIfThenElse_3013Text(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3014Text(view);
		case Choice4EditPart.VISUAL_ID:
			return getChoice_3015Text(view);
		case AnyOrder3EditPart.VISUAL_ID:
			return getAnyOrder_3016Text(view);
		case Split3EditPart.VISUAL_ID:
			return getSplit_3017Text(view);
		case SplitJoin3EditPart.VISUAL_ID:
			return getSplitJoin_3018Text(view);
		case IfThenElse3EditPart.VISUAL_ID:
			return getIfThenElse_3019Text(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3020Text(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3021Text(view);
		case Choice5EditPart.VISUAL_ID:
			return getChoice_3022Text(view);
		case AnyOrder4EditPart.VISUAL_ID:
			return getAnyOrder_3023Text(view);
		case Split4EditPart.VISUAL_ID:
			return getSplit_3024Text(view);
		case SplitJoin4EditPart.VISUAL_ID:
			return getSplitJoin_3025Text(view);
		case IfThenElse4EditPart.VISUAL_ID:
			return getIfThenElse_3026Text(view);
		case RepeatWhile2EditPart.VISUAL_ID:
			return getRepeatWhile_3027Text(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3028Text(view);
		case Choice6EditPart.VISUAL_ID:
			return getChoice_3029Text(view);
		case AnyOrder5EditPart.VISUAL_ID:
			return getAnyOrder_3030Text(view);
		case Split5EditPart.VISUAL_ID:
			return getSplit_3031Text(view);
		case SplitJoin5EditPart.VISUAL_ID:
			return getSplitJoin_3032Text(view);
		case IfThenElse5EditPart.VISUAL_ID:
			return getIfThenElse_3033Text(view);
		case Perform2EditPart.VISUAL_ID:
			return getPerform_3034Text(view);
		case RemoteProcessEditPart.VISUAL_ID:
			return getRemoteProcess_3104Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3105Text(view);
		case Output2EditPart.VISUAL_ID:
			return getOutput_3106Text(view);
		case Result2EditPart.VISUAL_ID:
			return getResult_3107Text(view);
		case ValueSourceEditPart.VISUAL_ID:
			return getValueSource_3094Text(view);
		case ValueFormEditPart.VISUAL_ID:
			return getValueForm_3095Text(view);
		case ValueFunctionEditPart.VISUAL_ID:
			return getValueFunction_3096Text(view);
		case ResultVarEditPart.VISUAL_ID:
			return getResultVar_3097Text(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3098Text(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3099Text(view);
		case Expr2EditPart.VISUAL_ID:
			return getExpr_3100Text(view);
		case Expr3EditPart.VISUAL_ID:
			return getExpr_3101Text(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3108Text(view);
		case Expr4EditPart.VISUAL_ID:
			return getExpr_3109Text(view);
		case TemplateProcessEditPart.VISUAL_ID:
			return getTemplateProcess_3110Text(view);
		case Produce2EditPart.VISUAL_ID:
			return getProduce_3043Text(view);
		case ValueSource2EditPart.VISUAL_ID:
			return getValueSource_3044Text(view);
		case ValueForm2EditPart.VISUAL_ID:
			return getValueForm_3045Text(view);
		case ValueFunction2EditPart.VISUAL_ID:
			return getValueFunction_3046Text(view);
		case Set2EditPart.VISUAL_ID:
			return getSet_3047Text(view);
		case ValueSource3EditPart.VISUAL_ID:
			return getValueSource_3048Text(view);
		case ValueForm3EditPart.VISUAL_ID:
			return getValueForm_3049Text(view);
		case ValueFunction3EditPart.VISUAL_ID:
			return getValueFunction_3050Text(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3051Text(view);
		case Choice7EditPart.VISUAL_ID:
			return getChoice_3052Text(view);
		case AnyOrder6EditPart.VISUAL_ID:
			return getAnyOrder_3053Text(view);
		case Split6EditPart.VISUAL_ID:
			return getSplit_3054Text(view);
		case SplitJoin6EditPart.VISUAL_ID:
			return getSplitJoin_3055Text(view);
		case IfThenElse6EditPart.VISUAL_ID:
			return getIfThenElse_3056Text(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3057Text(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3058Text(view);
		case RepeatWhile3EditPart.VISUAL_ID:
			return getRepeatWhile_3059Text(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3060Text(view);
		case Perform3EditPart.VISUAL_ID:
			return getPerform_3061Text(view);
		case Produce3EditPart.VISUAL_ID:
			return getProduce_3062Text(view);
		case Set3EditPart.VISUAL_ID:
			return getSet_3063Text(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3111Text(view);
		case Expr5EditPart.VISUAL_ID:
			return getExpr_3112Text(view);
		case RepeatWhile4EditPart.VISUAL_ID:
			return getRepeatWhile_3065Text(view);
		case Perform4EditPart.VISUAL_ID:
			return getPerform_3066Text(view);
		case Produce4EditPart.VISUAL_ID:
			return getProduce_3067Text(view);
		case Set4EditPart.VISUAL_ID:
			return getSet_3068Text(view);
		case Condition6EditPart.VISUAL_ID:
			return getCondition_3113Text(view);
		case Expr6EditPart.VISUAL_ID:
			return getExpr_3114Text(view);
		case RepeatWhile5EditPart.VISUAL_ID:
			return getRepeatWhile_3070Text(view);
		case Perform5EditPart.VISUAL_ID:
			return getPerform_3071Text(view);
		case Produce5EditPart.VISUAL_ID:
			return getProduce_3072Text(view);
		case Set5EditPart.VISUAL_ID:
			return getSet_3073Text(view);
		case Condition7EditPart.VISUAL_ID:
			return getCondition_3115Text(view);
		case Expr7EditPart.VISUAL_ID:
			return getExpr_3116Text(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3076Text(view);
		case RepeatWhile6EditPart.VISUAL_ID:
			return getRepeatWhile_3077Text(view);
		case Perform6EditPart.VISUAL_ID:
			return getPerform_3078Text(view);
		case Produce6EditPart.VISUAL_ID:
			return getProduce_3079Text(view);
		case Set6EditPart.VISUAL_ID:
			return getSet_3080Text(view);
		case ControlConstructBag5EditPart.VISUAL_ID:
			return getControlConstructBag_3082Text(view);
		case AnyOrder7EditPart.VISUAL_ID:
			return getAnyOrder_3083Text(view);
		case Split7EditPart.VISUAL_ID:
			return getSplit_3084Text(view);
		case SplitJoin7EditPart.VISUAL_ID:
			return getSplitJoin_3085Text(view);
		case IfThenElse7EditPart.VISUAL_ID:
			return getIfThenElse_3086Text(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3087Text(view);
		case RepeatWhile7EditPart.VISUAL_ID:
			return getRepeatWhile_3088Text(view);
		case Perform7EditPart.VISUAL_ID:
			return getPerform_3089Text(view);
		case Produce7EditPart.VISUAL_ID:
			return getProduce_3090Text(view);
		case Set7EditPart.VISUAL_ID:
			return getSet_3091Text(view);
		case ControlConstructList2EditPart.VISUAL_ID:
			return getControlConstructList_3093Text(view);
		case LocBindingEditPart.VISUAL_ID:
			return getLocBinding_4001Text(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_4002Text(view);
		case OutputBindingEditPart.VISUAL_ID:
			return getOutputBinding_4003Text(view);
		case LinkBindingEditPart.VISUAL_ID:
			return getLinkBinding_4004Text(view);
		case OutputBindingSourceEditPart.VISUAL_ID:
			return getOutputBindingSource_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOuterProcess_1000Text(View view) {
		OuterProcess domainModelElement = (OuterProcess) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_2027Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Input_2027,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5129); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_2028Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Output_2028,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5130); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoc_2003Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Loc_2003, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(LocNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_2004Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Sequence_2004,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(SequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_2005Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_2005,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_2006Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.AnyOrder_2006,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(AnyOrderNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_2007Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_2007,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_2008Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_2008,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_2009Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_2009,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_2010Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_2010,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_2011Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_2011,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_2012Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Perform_2012,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(PerformNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_2013Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Produce_2013,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ProduceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_2014Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_2014, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_2015Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Link_2015, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(LinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_2017Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_2017,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5110); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResult_2018Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Result_2018,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ResultNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5119); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOntology_2029Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Ontology_2029,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(OntologyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5145); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateConstraint_2030Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.TemplateConstraint_2030,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(TemplateConstraintNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5146); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_2019Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_2019, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5120); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructList_3001Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructList_3001, view
						.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructListNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3002Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Sequence_3002,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SequenceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3003Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_3003,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_3004Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructBag_3004,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructBagNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3005Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Sequence_3005,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SequenceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3006Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_3006,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_3007Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.AnyOrder_3007,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(AnyOrderName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_3008Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructBag_3008,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructBagName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_3009Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_3009,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_3010Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructBag_3010,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructBagName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_3011Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_3011,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_3012Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructBag_3012,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructBagName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_3013Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_3013,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3014Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Sequence_3014,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SequenceName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3015Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_3015,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_3016Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.AnyOrder_3016,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(AnyOrderName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_3017Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_3017,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_3018Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_3018,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_3019Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_3019,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3020Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_3020,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3021Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Sequence_3021,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SequenceName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3022Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_3022,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_3023Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.AnyOrder_3023,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(AnyOrderName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_3024Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_3024,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_3025Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_3025,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_3026Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_3026,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_3027Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_3027,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3028Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Sequence_3028,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SequenceName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3029Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_3029,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_3030Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.AnyOrder_3030,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(AnyOrderName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_3031Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_3031,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_3032Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_3032,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_3033Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_3033,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_3034Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Perform_3034,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(PerformName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRemoteProcess_3104Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RemoteProcess_3104,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RemoteProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5137); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_3105Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Input_3105,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(InputName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5132); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_3106Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Output_3106,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(OutputName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResult_3107Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Result_3107,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ResultName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5134); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueSource_3094Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueSource_3094,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueSourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueForm_3095Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueForm_3095,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueFormNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5112); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueFunction_3096Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueFunction_3096,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueFunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5113); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResultVar_3097Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ResultVar_3097,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ResultVarNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3098Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_3098,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5115); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3099Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_3099,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_3100Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_3100, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_3101Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_3101, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5118); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3108Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_3108,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5135); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_3109Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_3109, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5136); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateProcess_3110Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.TemplateProcess_3110,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(TemplateProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5138); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_3043Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Produce_3043,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(ProduceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueSource_3044Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueSource_3044,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueSourceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueForm_3045Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueForm_3045,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueFormName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueFunction_3046Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueFunction_3046,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueFunctionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_3047Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_3047, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueSource_3048Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueSource_3048,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueSourceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueForm_3049Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueForm_3049,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueFormName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueFunction_3050Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ValueFunction_3050,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ValueFunctionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3051Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Sequence_3051,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SequenceName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3052Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Choice_3052,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(ChoiceName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_3053Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.AnyOrder_3053,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(AnyOrderName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_3054Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_3054,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_3055Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_3055,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_3056Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_3056,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3057Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_3057,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3058Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_3058,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_3059Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_3059,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3060Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_3060,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_3061Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Perform_3061,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(PerformName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_3062Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Produce_3062,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(ProduceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_3063Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_3063, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3111Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_3111,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5139); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_3112Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_3112, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5140); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_3065Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_3065,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_3066Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Perform_3066,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(PerformName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_3067Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Produce_3067,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(ProduceName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_3068Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_3068, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3113Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_3113,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5141); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_3114Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_3114, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_3070Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_3070,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_3071Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Perform_3071,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(PerformName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_3072Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Produce_3072,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(ProduceName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_3073Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_3073, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_3115Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Condition_3115,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ConditionName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5143); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpr_3116Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Expr_3116, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(ExprName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5144); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3076Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_3076,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_3077Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_3077,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_3078Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Perform_3078,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(PerformName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_3079Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Produce_3079,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(ProduceName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_3080Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_3080, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_3082Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructBag_3082,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructBagName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_3083Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.AnyOrder_3083,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(AnyOrderName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_3084Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Split_3084,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry.getType(SplitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_3085Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.SplitJoin_3085,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(SplitJoinName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_3086Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.IfThenElse_3086,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(IfThenElseName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3087Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatUntil_3087,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatUntilName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_3088Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.RepeatWhile_3088,
				view.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(RepeatWhileName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_3089Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Perform_3089,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(PerformName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduce_3090Text(View view) {
		IParser parser = ControlParserProvider
				.getParser(ControlElementTypes.Produce_3090,
						view.getElement() != null ? view.getElement() : view,
						ControlVisualIDRegistry
								.getType(ProduceName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSet_3091Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.Set_3091, view.getElement() != null ? view
						.getElement() : view, ControlVisualIDRegistry
						.getType(SetName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructList_3093Text(View view) {
		IParser parser = ControlParserProvider.getParser(
				ControlElementTypes.ControlConstructList_3093, view
						.getElement() != null ? view.getElement() : view,
				ControlVisualIDRegistry
						.getType(ControlConstructListName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocBinding_4001Text(View view) {
		LocBinding domainModelElement = (LocBinding) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputBinding_4002Text(View view) {
		InputBinding domainModelElement = (InputBinding) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputBinding_4003Text(View view) {
		OutputBinding domainModelElement = (OutputBinding) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkBinding_4004Text(View view) {
		LinkBinding domainModelElement = (LinkBinding) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputBindingSource_4005Text(View view) {
		control.outputBindingSource domainModelElement = (control.outputBindingSource) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
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
		return OuterProcessEditPart.MODEL_ID.equals(ControlVisualIDRegistry
				.getModelID(view));
	}

}
