/*
 * 
 */
package control.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import control.diagram.edit.parts.*;
import control.diagram.part.ControlDiagramEditorPlugin;
import control.diagram.part.Messages;

/**
 * @generated
 */
public class ControlModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof RemoteProcessEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(ControlElementTypes.Input_3105);
			types.add(ControlElementTypes.Output_3106);
			types.add(ControlElementTypes.Result_3107);
			types.add(ControlElementTypes.Condition_3108);
			types.add(ControlElementTypes.Expr_3109);
			return types;
		}
		if (editPart instanceof TemplateProcessEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Input_3105);
			types.add(ControlElementTypes.Output_3106);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ControlConstructListControlConstructListFirstCompartmentEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3002);
			types.add(ControlElementTypes.Choice_3003);
			types.add(ControlElementTypes.AnyOrder_3083);
			types.add(ControlElementTypes.Split_3084);
			types.add(ControlElementTypes.SplitJoin_3085);
			types.add(ControlElementTypes.IfThenElse_3086);
			types.add(ControlElementTypes.RepeatUntil_3087);
			types.add(ControlElementTypes.RepeatWhile_3088);
			types.add(ControlElementTypes.Perform_3089);
			types.add(ControlElementTypes.Produce_3090);
			types.add(ControlElementTypes.Set_3091);
			return types;
		}
		if (editPart instanceof ControlConstructListControlConstructListRestCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3093);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagFirstCompartmentEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3005);
			types.add(ControlElementTypes.Choice_3006);
			types.add(ControlElementTypes.AnyOrder_3007);
			types.add(ControlElementTypes.Split_3009);
			types.add(ControlElementTypes.SplitJoin_3011);
			types.add(ControlElementTypes.IfThenElse_3013);
			types.add(ControlElementTypes.RepeatUntil_3076);
			types.add(ControlElementTypes.RepeatWhile_3077);
			types.add(ControlElementTypes.Perform_3078);
			types.add(ControlElementTypes.Produce_3079);
			types.add(ControlElementTypes.Set_3080);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagRestCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3082);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartment3EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagFirstCompartment2EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3005);
			types.add(ControlElementTypes.Choice_3006);
			types.add(ControlElementTypes.AnyOrder_3007);
			types.add(ControlElementTypes.Split_3009);
			types.add(ControlElementTypes.SplitJoin_3011);
			types.add(ControlElementTypes.IfThenElse_3013);
			types.add(ControlElementTypes.RepeatUntil_3076);
			types.add(ControlElementTypes.RepeatWhile_3077);
			types.add(ControlElementTypes.Perform_3078);
			types.add(ControlElementTypes.Produce_3079);
			types.add(ControlElementTypes.Set_3080);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagRestCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3082);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagFirstCompartment3EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3005);
			types.add(ControlElementTypes.Choice_3006);
			types.add(ControlElementTypes.AnyOrder_3007);
			types.add(ControlElementTypes.Split_3009);
			types.add(ControlElementTypes.SplitJoin_3011);
			types.add(ControlElementTypes.IfThenElse_3013);
			types.add(ControlElementTypes.RepeatUntil_3076);
			types.add(ControlElementTypes.RepeatWhile_3077);
			types.add(ControlElementTypes.Perform_3078);
			types.add(ControlElementTypes.Produce_3079);
			types.add(ControlElementTypes.Set_3080);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagRestCompartment3EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3082);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagFirstCompartment4EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3005);
			types.add(ControlElementTypes.Choice_3006);
			types.add(ControlElementTypes.AnyOrder_3007);
			types.add(ControlElementTypes.Split_3009);
			types.add(ControlElementTypes.SplitJoin_3011);
			types.add(ControlElementTypes.IfThenElse_3013);
			types.add(ControlElementTypes.RepeatUntil_3076);
			types.add(ControlElementTypes.RepeatWhile_3077);
			types.add(ControlElementTypes.Perform_3078);
			types.add(ControlElementTypes.Produce_3079);
			types.add(ControlElementTypes.Set_3080);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagRestCompartment4EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3082);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartmentEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartmentEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartment4EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartment3EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartment2EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartment2EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartmentEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartment5EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartment4EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartment3EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartment3EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartment3EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartment3EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartment3EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartmentEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartment6EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartment5EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartment4EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartment4EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartment4EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartment4EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartment4EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartment4EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ResultResultInConditionCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3098);
			types.add(ControlElementTypes.Expr_3100);
			return types;
		}
		if (editPart instanceof ResultResultHasResultVarCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ResultVar_3097);
			return types;
		}
		if (editPart instanceof ResultResultHasEffectCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3099);
			types.add(ControlElementTypes.Expr_3101);
			return types;
		}
		if (editPart instanceof ResultResultBindingSourceCompartmentEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3094);
			types.add(ControlElementTypes.ValueForm_3095);
			types.add(ControlElementTypes.ValueFunction_3096);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartmentEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartmentEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof SequenceSequenceComponentsCompartment7EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3001);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartment6EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartment5EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartment5EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartment5EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartment5EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartment5EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartment5EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment2EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment3EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment2EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment4EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment4EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartment2EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartment2EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment3EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartment3EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartment3EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment4EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment4EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartment4EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartment4EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartment4EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment5EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment5EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment5EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment5EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartment5EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartment5EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartment5EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagFirstCompartment5EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3005);
			types.add(ControlElementTypes.Choice_3006);
			types.add(ControlElementTypes.AnyOrder_3007);
			types.add(ControlElementTypes.Split_3009);
			types.add(ControlElementTypes.SplitJoin_3011);
			types.add(ControlElementTypes.IfThenElse_3013);
			types.add(ControlElementTypes.RepeatUntil_3076);
			types.add(ControlElementTypes.RepeatWhile_3077);
			types.add(ControlElementTypes.Perform_3078);
			types.add(ControlElementTypes.Produce_3079);
			types.add(ControlElementTypes.Set_3080);
			return types;
		}
		if (editPart instanceof ControlConstructBagControlConstructBagRestCompartment5EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3082);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartment6EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartment6EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartment6EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartment6EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartment6EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartment6EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment6EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment6EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment6EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment6EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartment6EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartment6EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartment6EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof ControlConstructListControlConstructListFirstCompartment2EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3002);
			types.add(ControlElementTypes.Choice_3003);
			types.add(ControlElementTypes.AnyOrder_3083);
			types.add(ControlElementTypes.Split_3084);
			types.add(ControlElementTypes.SplitJoin_3085);
			types.add(ControlElementTypes.IfThenElse_3086);
			types.add(ControlElementTypes.RepeatUntil_3087);
			types.add(ControlElementTypes.RepeatWhile_3088);
			types.add(ControlElementTypes.Perform_3089);
			types.add(ControlElementTypes.Produce_3090);
			types.add(ControlElementTypes.Set_3091);
			return types;
		}
		if (editPart instanceof ControlConstructListControlConstructListRestCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructList_3093);
			return types;
		}
		if (editPart instanceof ChoiceChoiceComponentsCompartment7EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3004);
			return types;
		}
		if (editPart instanceof AnyOrderAnyOrderComponentsCompartment7EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3008);
			return types;
		}
		if (editPart instanceof SplitSplitComponentsCompartment7EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3010);
			return types;
		}
		if (editPart instanceof SplitJoinSplitJoinComponentsCompartment7EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ControlConstructBag_3012);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseIfConditionCompartment7EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3115);
			types.add(ControlElementTypes.Expr_3116);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseThenCompartment7EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3014);
			types.add(ControlElementTypes.Choice_3015);
			types.add(ControlElementTypes.AnyOrder_3016);
			types.add(ControlElementTypes.Split_3017);
			types.add(ControlElementTypes.SplitJoin_3018);
			types.add(ControlElementTypes.IfThenElse_3019);
			types.add(ControlElementTypes.RepeatUntil_3020);
			types.add(ControlElementTypes.RepeatWhile_3027);
			types.add(ControlElementTypes.Perform_3034);
			types.add(ControlElementTypes.Produce_3043);
			types.add(ControlElementTypes.Set_3047);
			return types;
		}
		if (editPart instanceof IfThenElseIfThenElseElseCompartment7EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3051);
			types.add(ControlElementTypes.Choice_3052);
			types.add(ControlElementTypes.AnyOrder_3053);
			types.add(ControlElementTypes.Split_3054);
			types.add(ControlElementTypes.SplitJoin_3055);
			types.add(ControlElementTypes.IfThenElse_3056);
			types.add(ControlElementTypes.RepeatUntil_3057);
			types.add(ControlElementTypes.RepeatWhile_3070);
			types.add(ControlElementTypes.Perform_3071);
			types.add(ControlElementTypes.Produce_3072);
			types.add(ControlElementTypes.Set_3073);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment7EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3111);
			types.add(ControlElementTypes.Expr_3112);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment7EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3021);
			types.add(ControlElementTypes.Choice_3022);
			types.add(ControlElementTypes.AnyOrder_3023);
			types.add(ControlElementTypes.Split_3024);
			types.add(ControlElementTypes.SplitJoin_3025);
			types.add(ControlElementTypes.IfThenElse_3026);
			types.add(ControlElementTypes.RepeatUntil_3058);
			types.add(ControlElementTypes.RepeatWhile_3059);
			types.add(ControlElementTypes.Perform_3061);
			types.add(ControlElementTypes.Produce_3062);
			types.add(ControlElementTypes.Set_3063);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment7EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3113);
			types.add(ControlElementTypes.Expr_3114);
			return types;
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment7EditPart) {
			ArrayList types = new ArrayList(11);
			types.add(ControlElementTypes.Sequence_3028);
			types.add(ControlElementTypes.Choice_3029);
			types.add(ControlElementTypes.AnyOrder_3030);
			types.add(ControlElementTypes.Split_3031);
			types.add(ControlElementTypes.SplitJoin_3032);
			types.add(ControlElementTypes.IfThenElse_3033);
			types.add(ControlElementTypes.RepeatUntil_3060);
			types.add(ControlElementTypes.RepeatWhile_3065);
			types.add(ControlElementTypes.Perform_3066);
			types.add(ControlElementTypes.Produce_3067);
			types.add(ControlElementTypes.Set_3068);
			return types;
		}
		if (editPart instanceof PerformPerformTheProcessCompartment7EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.RemoteProcess_3104);
			types.add(ControlElementTypes.TemplateProcess_3110);
			return types;
		}
		if (editPart instanceof ProduceProduceProducedBindingValueSpecifierCompartment7EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3044);
			types.add(ControlElementTypes.ValueForm_3045);
			types.add(ControlElementTypes.ValueFunction_3046);
			return types;
		}
		if (editPart instanceof SetSetProducedBindingValueSpecifierCompartment7EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3048);
			types.add(ControlElementTypes.ValueForm_3049);
			types.add(ControlElementTypes.ValueFunction_3050);
			return types;
		}
		if (editPart instanceof ResultResultInConditionCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3098);
			types.add(ControlElementTypes.Expr_3100);
			return types;
		}
		if (editPart instanceof ResultResultHasResultVarCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(ControlElementTypes.ResultVar_3097);
			return types;
		}
		if (editPart instanceof ResultResultHasEffectCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(ControlElementTypes.Condition_3099);
			types.add(ControlElementTypes.Expr_3101);
			return types;
		}
		if (editPart instanceof ResultResultBindingSourceCompartment2EditPart) {
			ArrayList types = new ArrayList(3);
			types.add(ControlElementTypes.ValueSource_3094);
			types.add(ControlElementTypes.ValueForm_3095);
			types.add(ControlElementTypes.ValueFunction_3096);
			return types;
		}
		if (editPart instanceof OuterProcessEditPart) {
			ArrayList types = new ArrayList(20);
			types.add(ControlElementTypes.Input_2027);
			types.add(ControlElementTypes.Output_2028);
			types.add(ControlElementTypes.Loc_2003);
			types.add(ControlElementTypes.Sequence_2004);
			types.add(ControlElementTypes.Choice_2005);
			types.add(ControlElementTypes.AnyOrder_2006);
			types.add(ControlElementTypes.Split_2007);
			types.add(ControlElementTypes.SplitJoin_2008);
			types.add(ControlElementTypes.IfThenElse_2009);
			types.add(ControlElementTypes.RepeatUntil_2010);
			types.add(ControlElementTypes.RepeatWhile_2011);
			types.add(ControlElementTypes.Perform_2012);
			types.add(ControlElementTypes.Produce_2013);
			types.add(ControlElementTypes.Set_2014);
			types.add(ControlElementTypes.Link_2015);
			types.add(ControlElementTypes.Condition_2017);
			types.add(ControlElementTypes.Result_2018);
			types.add(ControlElementTypes.Ontology_2029);
			types.add(ControlElementTypes.TemplateConstraint_2030);
			types.add(ControlElementTypes.Expr_2019);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InputEditPart) {
			return ((InputEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Input2EditPart) {
			return ((Input2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Output2EditPart) {
			return ((Output2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueSourceEditPart) {
			return ((ValueSourceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueFormEditPart) {
			return ((ValueFormEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueFunctionEditPart) {
			return ((ValueFunctionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueSource2EditPart) {
			return ((ValueSource2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueForm2EditPart) {
			return ((ValueForm2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueFunction2EditPart) {
			return ((ValueFunction2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueSource3EditPart) {
			return ((ValueSource3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueForm3EditPart) {
			return ((ValueForm3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueFunction3EditPart) {
			return ((ValueFunction3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InputEditPart) {
			return ((InputEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LocEditPart) {
			return ((LocEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LinkEditPart) {
			return ((LinkEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Input2EditPart) {
			return ((Input2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Output2EditPart) {
			return ((Output2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueSourceEditPart) {
			return ((ValueSourceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueFormEditPart) {
			return ((ValueFormEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueFunctionEditPart) {
			return ((ValueFunctionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueSource2EditPart) {
			return ((ValueSource2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueForm2EditPart) {
			return ((ValueForm2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueFunction2EditPart) {
			return ((ValueFunction2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueSource3EditPart) {
			return ((ValueSource3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueForm3EditPart) {
			return ((ValueForm3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueFunction3EditPart) {
			return ((ValueFunction3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InputEditPart) {
			return ((InputEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Input2EditPart) {
			return ((Input2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Output2EditPart) {
			return ((Output2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueSourceEditPart) {
			return ((ValueSourceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueFormEditPart) {
			return ((ValueFormEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueFunctionEditPart) {
			return ((ValueFunctionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueSource2EditPart) {
			return ((ValueSource2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueForm2EditPart) {
			return ((ValueForm2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueFunction2EditPart) {
			return ((ValueFunction2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueSource3EditPart) {
			return ((ValueSource3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueForm3EditPart) {
			return ((ValueForm3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueFunction3EditPart) {
			return ((ValueFunction3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InputEditPart) {
			return ((InputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LocEditPart) {
			return ((LocEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LinkEditPart) {
			return ((LinkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Input2EditPart) {
			return ((Input2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Output2EditPart) {
			return ((Output2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueSourceEditPart) {
			return ((ValueSourceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueFormEditPart) {
			return ((ValueFormEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueFunctionEditPart) {
			return ((ValueFunctionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueSource2EditPart) {
			return ((ValueSource2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueForm2EditPart) {
			return ((ValueForm2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueFunction2EditPart) {
			return ((ValueFunction2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueSource3EditPart) {
			return ((ValueSource3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueForm3EditPart) {
			return ((ValueForm3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueFunction3EditPart) {
			return ((ValueFunction3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InputEditPart) {
			return ((InputEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Input2EditPart) {
			return ((Input2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Output2EditPart) {
			return ((Output2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueSourceEditPart) {
			return ((ValueSourceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueFormEditPart) {
			return ((ValueFormEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueFunctionEditPart) {
			return ((ValueFunctionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueSource2EditPart) {
			return ((ValueSource2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueForm2EditPart) {
			return ((ValueForm2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueFunction2EditPart) {
			return ((ValueFunction2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueSource3EditPart) {
			return ((ValueSource3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueForm3EditPart) {
			return ((ValueForm3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueFunction3EditPart) {
			return ((ValueFunction3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ControlDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ControlModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ControlModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
