package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramEditorPlugin;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.Messages;

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

/**
 * @generated
 */
public class BpeldiagModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ProcessProcessCompartmentEditPart) {
			ArrayList types = new ArrayList(24);
			types.add(BpeldiagElementTypes.Assign_3001);
			types.add(BpeldiagElementTypes.Compensate_3004);
			types.add(BpeldiagElementTypes.CompensateScope_3005);
			types.add(BpeldiagElementTypes.Empty_3006);
			types.add(BpeldiagElementTypes.Exit_3007);
			types.add(BpeldiagElementTypes.ExtensionActivity_3008);
			types.add(BpeldiagElementTypes.Flow_3009);
			types.add(BpeldiagElementTypes.ForEach_3010);
			types.add(BpeldiagElementTypes.If_3011);
			types.add(BpeldiagElementTypes.Invoke_3012);
			types.add(BpeldiagElementTypes.OpaqueActivity_3013);
			types.add(BpeldiagElementTypes.PartnerActivity_3014);
			types.add(BpeldiagElementTypes.Pick_3015);
			types.add(BpeldiagElementTypes.Receive_3016);
			types.add(BpeldiagElementTypes.RepeatUntil_3017);
			types.add(BpeldiagElementTypes.Reply_3018);
			types.add(BpeldiagElementTypes.Rethrow_3019);
			types.add(BpeldiagElementTypes.Scope_3020);
			types.add(BpeldiagElementTypes.Sequence_3002);
			types.add(BpeldiagElementTypes.Throw_3021);
			types.add(BpeldiagElementTypes.Validate_3022);
			types.add(BpeldiagElementTypes.Wait_3023);
			types.add(BpeldiagElementTypes.While_3024);
			types.add(BpeldiagElementTypes.EventHandler_3303);
			return types;
		}
		if (editPart instanceof FlowFlowCompartmentEditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment2EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartmentEditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment2EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof IfIfCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment3EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof PickPickCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof OnAlarmOnAlarmCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3228);
			types.add(BpeldiagElementTypes.Compensate_3229);
			types.add(BpeldiagElementTypes.CompensateScope_3230);
			types.add(BpeldiagElementTypes.Empty_3231);
			types.add(BpeldiagElementTypes.Exit_3232);
			types.add(BpeldiagElementTypes.ExtensionActivity_3233);
			types.add(BpeldiagElementTypes.Flow_3234);
			types.add(BpeldiagElementTypes.ForEach_3245);
			types.add(BpeldiagElementTypes.If_3248);
			types.add(BpeldiagElementTypes.Invoke_3249);
			types.add(BpeldiagElementTypes.OpaqueActivity_3250);
			types.add(BpeldiagElementTypes.PartnerActivity_3251);
			types.add(BpeldiagElementTypes.Pick_3252);
			types.add(BpeldiagElementTypes.Receive_3253);
			types.add(BpeldiagElementTypes.RepeatUntil_3254);
			types.add(BpeldiagElementTypes.Reply_3255);
			types.add(BpeldiagElementTypes.Rethrow_3256);
			types.add(BpeldiagElementTypes.Scope_3257);
			types.add(BpeldiagElementTypes.Sequence_3258);
			types.add(BpeldiagElementTypes.Throw_3259);
			types.add(BpeldiagElementTypes.Validate_3260);
			types.add(BpeldiagElementTypes.Wait_3261);
			types.add(BpeldiagElementTypes.While_3262);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment3EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof IfIfCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof OnMessageOnMessageCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3236);
			types.add(BpeldiagElementTypes.Compensate_3237);
			types.add(BpeldiagElementTypes.CompensateScope_3238);
			types.add(BpeldiagElementTypes.Empty_3239);
			types.add(BpeldiagElementTypes.Exit_3240);
			types.add(BpeldiagElementTypes.ExtensionActivity_3241);
			types.add(BpeldiagElementTypes.Flow_3242);
			types.add(BpeldiagElementTypes.ForEach_3287);
			types.add(BpeldiagElementTypes.If_3288);
			types.add(BpeldiagElementTypes.Invoke_3289);
			types.add(BpeldiagElementTypes.OpaqueActivity_3290);
			types.add(BpeldiagElementTypes.PartnerActivity_3291);
			types.add(BpeldiagElementTypes.Pick_3292);
			types.add(BpeldiagElementTypes.Receive_3293);
			types.add(BpeldiagElementTypes.RepeatUntil_3294);
			types.add(BpeldiagElementTypes.Reply_3295);
			types.add(BpeldiagElementTypes.Rethrow_3296);
			types.add(BpeldiagElementTypes.Scope_3297);
			types.add(BpeldiagElementTypes.Sequence_3298);
			types.add(BpeldiagElementTypes.Throw_3299);
			types.add(BpeldiagElementTypes.Validate_3300);
			types.add(BpeldiagElementTypes.Wait_3301);
			types.add(BpeldiagElementTypes.While_3302);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment4EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof PickPickCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartmentEditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment2EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment4EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment3EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof PickPickCompartment4EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartmentEditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment2EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment5EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment3EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof PickPickCompartment5EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof WhileWhileCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment5EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment4EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof EventHandlerEventHandlerCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3244);
			types.add(BpeldiagElementTypes.OnEvent_3263);
			return types;
		}
		if (editPart instanceof OnAlarmOnAlarmCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3228);
			types.add(BpeldiagElementTypes.Compensate_3229);
			types.add(BpeldiagElementTypes.CompensateScope_3230);
			types.add(BpeldiagElementTypes.Empty_3231);
			types.add(BpeldiagElementTypes.Exit_3232);
			types.add(BpeldiagElementTypes.ExtensionActivity_3233);
			types.add(BpeldiagElementTypes.Flow_3234);
			types.add(BpeldiagElementTypes.ForEach_3245);
			types.add(BpeldiagElementTypes.If_3248);
			types.add(BpeldiagElementTypes.Invoke_3249);
			types.add(BpeldiagElementTypes.OpaqueActivity_3250);
			types.add(BpeldiagElementTypes.PartnerActivity_3251);
			types.add(BpeldiagElementTypes.Pick_3252);
			types.add(BpeldiagElementTypes.Receive_3253);
			types.add(BpeldiagElementTypes.RepeatUntil_3254);
			types.add(BpeldiagElementTypes.Reply_3255);
			types.add(BpeldiagElementTypes.Rethrow_3256);
			types.add(BpeldiagElementTypes.Scope_3257);
			types.add(BpeldiagElementTypes.Sequence_3258);
			types.add(BpeldiagElementTypes.Throw_3259);
			types.add(BpeldiagElementTypes.Validate_3260);
			types.add(BpeldiagElementTypes.Wait_3261);
			types.add(BpeldiagElementTypes.While_3262);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment6EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment7EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment4EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment4EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof PickPickCompartment6EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment5EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment5EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment6EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment4EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment5EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment8EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment5EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment6EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment6EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof ElseIfEliseIfCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3181);
			types.add(BpeldiagElementTypes.Compensate_3182);
			types.add(BpeldiagElementTypes.CompensateScope_3183);
			types.add(BpeldiagElementTypes.Empty_3184);
			types.add(BpeldiagElementTypes.Exit_3185);
			types.add(BpeldiagElementTypes.ExtensionActivity_3186);
			types.add(BpeldiagElementTypes.Flow_3187);
			types.add(BpeldiagElementTypes.ForEach_3188);
			types.add(BpeldiagElementTypes.If_3189);
			types.add(BpeldiagElementTypes.Invoke_3190);
			types.add(BpeldiagElementTypes.OpaqueActivity_3191);
			types.add(BpeldiagElementTypes.PartnerActivity_3192);
			types.add(BpeldiagElementTypes.Pick_3193);
			types.add(BpeldiagElementTypes.Receive_3194);
			types.add(BpeldiagElementTypes.RepeatUntil_3195);
			types.add(BpeldiagElementTypes.Reply_3196);
			types.add(BpeldiagElementTypes.Rethrow_3197);
			types.add(BpeldiagElementTypes.Scope_3198);
			types.add(BpeldiagElementTypes.Sequence_3199);
			types.add(BpeldiagElementTypes.Throw_3200);
			types.add(BpeldiagElementTypes.Validate_3201);
			types.add(BpeldiagElementTypes.Wait_3202);
			types.add(BpeldiagElementTypes.While_3203);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment7EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment9EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment6EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof ElseElseCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3204);
			types.add(BpeldiagElementTypes.Compensate_3205);
			types.add(BpeldiagElementTypes.CompensateScope_3206);
			types.add(BpeldiagElementTypes.Empty_3207);
			types.add(BpeldiagElementTypes.Exit_3208);
			types.add(BpeldiagElementTypes.ExtensionActivity_3209);
			types.add(BpeldiagElementTypes.Flow_3210);
			types.add(BpeldiagElementTypes.ForEach_3211);
			types.add(BpeldiagElementTypes.If_3212);
			types.add(BpeldiagElementTypes.Invoke_3213);
			types.add(BpeldiagElementTypes.OpaqueActivity_3214);
			types.add(BpeldiagElementTypes.PartnerActivity_3215);
			types.add(BpeldiagElementTypes.Pick_3216);
			types.add(BpeldiagElementTypes.Receive_3217);
			types.add(BpeldiagElementTypes.RepeatUntil_3218);
			types.add(BpeldiagElementTypes.Reply_3219);
			types.add(BpeldiagElementTypes.Rethrow_3220);
			types.add(BpeldiagElementTypes.Scope_3221);
			types.add(BpeldiagElementTypes.Sequence_3222);
			types.add(BpeldiagElementTypes.Throw_3223);
			types.add(BpeldiagElementTypes.Validate_3224);
			types.add(BpeldiagElementTypes.Wait_3225);
			types.add(BpeldiagElementTypes.While_3226);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment8EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment10EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment7EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment7EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment6EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment7EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof PickPickCompartment8EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment7EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment8EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment7EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment8EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof PickPickCompartment9EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment8EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment9EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment4EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment9EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof IfIfCompartment8EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment10EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment9EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment10EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment5EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment10EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof OnEventOnEventCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3264);
			types.add(BpeldiagElementTypes.Compensate_3265);
			types.add(BpeldiagElementTypes.CompensateScope_3266);
			types.add(BpeldiagElementTypes.Empty_3267);
			types.add(BpeldiagElementTypes.Exit_3268);
			types.add(BpeldiagElementTypes.ExtensionActivity_3269);
			types.add(BpeldiagElementTypes.Flow_3270);
			types.add(BpeldiagElementTypes.ForEach_3271);
			types.add(BpeldiagElementTypes.If_3272);
			types.add(BpeldiagElementTypes.Invoke_3273);
			types.add(BpeldiagElementTypes.OpaqueActivity_3274);
			types.add(BpeldiagElementTypes.PartnerActivity_3275);
			types.add(BpeldiagElementTypes.Pick_3276);
			types.add(BpeldiagElementTypes.Receive_3277);
			types.add(BpeldiagElementTypes.RepeatUntil_3278);
			types.add(BpeldiagElementTypes.Reply_3279);
			types.add(BpeldiagElementTypes.Rethrow_3280);
			types.add(BpeldiagElementTypes.Scope_3281);
			types.add(BpeldiagElementTypes.Sequence_3282);
			types.add(BpeldiagElementTypes.Throw_3283);
			types.add(BpeldiagElementTypes.Validate_3284);
			types.add(BpeldiagElementTypes.Wait_3285);
			types.add(BpeldiagElementTypes.While_3286);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment9EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment11EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment9EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment11EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment10EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment11EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment6EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment11EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment12EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment10EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment12EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment11EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment12EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment7EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment12EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment13EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment11EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment13EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment12EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment13EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment8EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment13EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof EventHandlerEventHandlerCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3244);
			types.add(BpeldiagElementTypes.OnEvent_3263);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment10EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(BpeldiagElementTypes.Assign_3055);
			types.add(BpeldiagElementTypes.Compensate_3056);
			types.add(BpeldiagElementTypes.CompensateScope_3057);
			types.add(BpeldiagElementTypes.Empty_3058);
			types.add(BpeldiagElementTypes.Exit_3059);
			types.add(BpeldiagElementTypes.ExtensionActivity_3060);
			types.add(BpeldiagElementTypes.Flow_3061);
			types.add(BpeldiagElementTypes.ForEach_3062);
			types.add(BpeldiagElementTypes.If_3063);
			types.add(BpeldiagElementTypes.Invoke_3064);
			types.add(BpeldiagElementTypes.OpaqueActivity_3065);
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
			types.add(BpeldiagElementTypes.Pick_3067);
			types.add(BpeldiagElementTypes.Receive_3068);
			types.add(BpeldiagElementTypes.RepeatUntil_3069);
			types.add(BpeldiagElementTypes.Reply_3070);
			types.add(BpeldiagElementTypes.Rethrow_3071);
			types.add(BpeldiagElementTypes.Scope_3072);
			types.add(BpeldiagElementTypes.Throw_3073);
			types.add(BpeldiagElementTypes.Validate_3074);
			types.add(BpeldiagElementTypes.Wait_3075);
			types.add(BpeldiagElementTypes.While_3076);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment14EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(BpeldiagElementTypes.Assign_3077);
			types.add(BpeldiagElementTypes.Compensate_3078);
			types.add(BpeldiagElementTypes.CompensateScope_3079);
			types.add(BpeldiagElementTypes.Empty_3080);
			types.add(BpeldiagElementTypes.Exit_3081);
			types.add(BpeldiagElementTypes.ExtensionActivity_3082);
			types.add(BpeldiagElementTypes.ForEach_3083);
			types.add(BpeldiagElementTypes.If_3084);
			types.add(BpeldiagElementTypes.Invoke_3085);
			types.add(BpeldiagElementTypes.OpaqueActivity_3086);
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
			types.add(BpeldiagElementTypes.Pick_3088);
			types.add(BpeldiagElementTypes.Receive_3089);
			types.add(BpeldiagElementTypes.RepeatUntil_3090);
			types.add(BpeldiagElementTypes.Reply_3091);
			types.add(BpeldiagElementTypes.Rethrow_3092);
			types.add(BpeldiagElementTypes.Scope_3093);
			types.add(BpeldiagElementTypes.Throw_3094);
			types.add(BpeldiagElementTypes.Validate_3095);
			types.add(BpeldiagElementTypes.Wait_3096);
			types.add(BpeldiagElementTypes.While_3097);
			return types;
		}
		if (editPart instanceof IfIfCompartment12EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3098);
			types.add(BpeldiagElementTypes.Compensate_3099);
			types.add(BpeldiagElementTypes.CompensateScope_3100);
			types.add(BpeldiagElementTypes.Empty_3101);
			types.add(BpeldiagElementTypes.Exit_3102);
			types.add(BpeldiagElementTypes.ExtensionActivity_3103);
			types.add(BpeldiagElementTypes.If_3104);
			types.add(BpeldiagElementTypes.ForEach_3105);
			types.add(BpeldiagElementTypes.Invoke_3163);
			types.add(BpeldiagElementTypes.OpaqueActivity_3164);
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
			types.add(BpeldiagElementTypes.Pick_3166);
			types.add(BpeldiagElementTypes.Receive_3167);
			types.add(BpeldiagElementTypes.RepeatUntil_3168);
			types.add(BpeldiagElementTypes.Reply_3169);
			types.add(BpeldiagElementTypes.Rethrow_3170);
			types.add(BpeldiagElementTypes.Scope_3171);
			types.add(BpeldiagElementTypes.Throw_3172);
			types.add(BpeldiagElementTypes.Validate_3173);
			types.add(BpeldiagElementTypes.Wait_3174);
			types.add(BpeldiagElementTypes.While_3175);
			types.add(BpeldiagElementTypes.ElseIf_3246);
			types.add(BpeldiagElementTypes.Else_3247);
			return types;
		}
		if (editPart instanceof PickPickCompartment14EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3227);
			types.add(BpeldiagElementTypes.OnMessage_3235);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment13EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3106);
			types.add(BpeldiagElementTypes.Compensate_3107);
			types.add(BpeldiagElementTypes.CompensateScope_3108);
			types.add(BpeldiagElementTypes.Empty_3109);
			types.add(BpeldiagElementTypes.Exit_3110);
			types.add(BpeldiagElementTypes.ExtensionActivity_3111);
			types.add(BpeldiagElementTypes.RepeatUntil_3112);
			types.add(BpeldiagElementTypes.ForEach_3113);
			types.add(BpeldiagElementTypes.Invoke_3151);
			types.add(BpeldiagElementTypes.OpaqueActivity_3152);
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
			types.add(BpeldiagElementTypes.Pick_3154);
			types.add(BpeldiagElementTypes.Receive_3155);
			types.add(BpeldiagElementTypes.Reply_3156);
			types.add(BpeldiagElementTypes.Rethrow_3157);
			types.add(BpeldiagElementTypes.Scope_3158);
			types.add(BpeldiagElementTypes.Throw_3159);
			types.add(BpeldiagElementTypes.Validate_3160);
			types.add(BpeldiagElementTypes.Wait_3161);
			types.add(BpeldiagElementTypes.While_3162);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment14EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(BpeldiagElementTypes.Assign_3114);
			types.add(BpeldiagElementTypes.Compensate_3115);
			types.add(BpeldiagElementTypes.CompensateScope_3116);
			types.add(BpeldiagElementTypes.Empty_3117);
			types.add(BpeldiagElementTypes.Exit_3118);
			types.add(BpeldiagElementTypes.ExtensionActivity_3119);
			types.add(BpeldiagElementTypes.Scope_3120);
			types.add(BpeldiagElementTypes.ForEach_3121);
			types.add(BpeldiagElementTypes.Invoke_3140);
			types.add(BpeldiagElementTypes.OpaqueActivity_3141);
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
			types.add(BpeldiagElementTypes.Pick_3143);
			types.add(BpeldiagElementTypes.Receive_3144);
			types.add(BpeldiagElementTypes.Reply_3145);
			types.add(BpeldiagElementTypes.Rethrow_3146);
			types.add(BpeldiagElementTypes.Throw_3147);
			types.add(BpeldiagElementTypes.Validate_3148);
			types.add(BpeldiagElementTypes.Wait_3149);
			types.add(BpeldiagElementTypes.While_3150);
			types.add(BpeldiagElementTypes.EventHandler_3243);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment9EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3033);
			types.add(BpeldiagElementTypes.Compensate_3034);
			types.add(BpeldiagElementTypes.CompensateScope_3035);
			types.add(BpeldiagElementTypes.Empty_3036);
			types.add(BpeldiagElementTypes.Exit_3037);
			types.add(BpeldiagElementTypes.ExtensionActivity_3038);
			types.add(BpeldiagElementTypes.Flow_3039);
			types.add(BpeldiagElementTypes.ForEach_3040);
			types.add(BpeldiagElementTypes.If_3032);
			types.add(BpeldiagElementTypes.Invoke_3041);
			types.add(BpeldiagElementTypes.OpaqueActivity_3042);
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
			types.add(BpeldiagElementTypes.Pick_3044);
			types.add(BpeldiagElementTypes.Receive_3045);
			types.add(BpeldiagElementTypes.RepeatUntil_3046);
			types.add(BpeldiagElementTypes.Reply_3047);
			types.add(BpeldiagElementTypes.Rethrow_3048);
			types.add(BpeldiagElementTypes.Scope_3049);
			types.add(BpeldiagElementTypes.Sequence_3050);
			types.add(BpeldiagElementTypes.Throw_3051);
			types.add(BpeldiagElementTypes.Validate_3052);
			types.add(BpeldiagElementTypes.Wait_3053);
			types.add(BpeldiagElementTypes.While_3054);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment14EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3122);
			types.add(BpeldiagElementTypes.Compensate_3123);
			types.add(BpeldiagElementTypes.CompensateScope_3124);
			types.add(BpeldiagElementTypes.Empty_3125);
			types.add(BpeldiagElementTypes.Exit_3126);
			types.add(BpeldiagElementTypes.ExtensionActivity_3127);
			types.add(BpeldiagElementTypes.Flow_3176);
			types.add(BpeldiagElementTypes.ForEach_3129);
			types.add(BpeldiagElementTypes.If_3177);
			types.add(BpeldiagElementTypes.Invoke_3130);
			types.add(BpeldiagElementTypes.OpaqueActivity_3131);
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
			types.add(BpeldiagElementTypes.Pick_3133);
			types.add(BpeldiagElementTypes.Receive_3134);
			types.add(BpeldiagElementTypes.RepeatUntil_3178);
			types.add(BpeldiagElementTypes.Reply_3135);
			types.add(BpeldiagElementTypes.Rethrow_3136);
			types.add(BpeldiagElementTypes.Scope_3179);
			types.add(BpeldiagElementTypes.Sequence_3180);
			types.add(BpeldiagElementTypes.Throw_3137);
			types.add(BpeldiagElementTypes.Validate_3138);
			types.add(BpeldiagElementTypes.Wait_3139);
			types.add(BpeldiagElementTypes.While_3128);
			return types;
		}
		if (editPart instanceof ElseIfEliseIfCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3181);
			types.add(BpeldiagElementTypes.Compensate_3182);
			types.add(BpeldiagElementTypes.CompensateScope_3183);
			types.add(BpeldiagElementTypes.Empty_3184);
			types.add(BpeldiagElementTypes.Exit_3185);
			types.add(BpeldiagElementTypes.ExtensionActivity_3186);
			types.add(BpeldiagElementTypes.Flow_3187);
			types.add(BpeldiagElementTypes.ForEach_3188);
			types.add(BpeldiagElementTypes.If_3189);
			types.add(BpeldiagElementTypes.Invoke_3190);
			types.add(BpeldiagElementTypes.OpaqueActivity_3191);
			types.add(BpeldiagElementTypes.PartnerActivity_3192);
			types.add(BpeldiagElementTypes.Pick_3193);
			types.add(BpeldiagElementTypes.Receive_3194);
			types.add(BpeldiagElementTypes.RepeatUntil_3195);
			types.add(BpeldiagElementTypes.Reply_3196);
			types.add(BpeldiagElementTypes.Rethrow_3197);
			types.add(BpeldiagElementTypes.Scope_3198);
			types.add(BpeldiagElementTypes.Sequence_3199);
			types.add(BpeldiagElementTypes.Throw_3200);
			types.add(BpeldiagElementTypes.Validate_3201);
			types.add(BpeldiagElementTypes.Wait_3202);
			types.add(BpeldiagElementTypes.While_3203);
			return types;
		}
		if (editPart instanceof ElseElseCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3204);
			types.add(BpeldiagElementTypes.Compensate_3205);
			types.add(BpeldiagElementTypes.CompensateScope_3206);
			types.add(BpeldiagElementTypes.Empty_3207);
			types.add(BpeldiagElementTypes.Exit_3208);
			types.add(BpeldiagElementTypes.ExtensionActivity_3209);
			types.add(BpeldiagElementTypes.Flow_3210);
			types.add(BpeldiagElementTypes.ForEach_3211);
			types.add(BpeldiagElementTypes.If_3212);
			types.add(BpeldiagElementTypes.Invoke_3213);
			types.add(BpeldiagElementTypes.OpaqueActivity_3214);
			types.add(BpeldiagElementTypes.PartnerActivity_3215);
			types.add(BpeldiagElementTypes.Pick_3216);
			types.add(BpeldiagElementTypes.Receive_3217);
			types.add(BpeldiagElementTypes.RepeatUntil_3218);
			types.add(BpeldiagElementTypes.Reply_3219);
			types.add(BpeldiagElementTypes.Rethrow_3220);
			types.add(BpeldiagElementTypes.Scope_3221);
			types.add(BpeldiagElementTypes.Sequence_3222);
			types.add(BpeldiagElementTypes.Throw_3223);
			types.add(BpeldiagElementTypes.Validate_3224);
			types.add(BpeldiagElementTypes.Wait_3225);
			types.add(BpeldiagElementTypes.While_3226);
			return types;
		}
		if (editPart instanceof OnAlarmOnAlarmCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3228);
			types.add(BpeldiagElementTypes.Compensate_3229);
			types.add(BpeldiagElementTypes.CompensateScope_3230);
			types.add(BpeldiagElementTypes.Empty_3231);
			types.add(BpeldiagElementTypes.Exit_3232);
			types.add(BpeldiagElementTypes.ExtensionActivity_3233);
			types.add(BpeldiagElementTypes.Flow_3234);
			types.add(BpeldiagElementTypes.ForEach_3245);
			types.add(BpeldiagElementTypes.If_3248);
			types.add(BpeldiagElementTypes.Invoke_3249);
			types.add(BpeldiagElementTypes.OpaqueActivity_3250);
			types.add(BpeldiagElementTypes.PartnerActivity_3251);
			types.add(BpeldiagElementTypes.Pick_3252);
			types.add(BpeldiagElementTypes.Receive_3253);
			types.add(BpeldiagElementTypes.RepeatUntil_3254);
			types.add(BpeldiagElementTypes.Reply_3255);
			types.add(BpeldiagElementTypes.Rethrow_3256);
			types.add(BpeldiagElementTypes.Scope_3257);
			types.add(BpeldiagElementTypes.Sequence_3258);
			types.add(BpeldiagElementTypes.Throw_3259);
			types.add(BpeldiagElementTypes.Validate_3260);
			types.add(BpeldiagElementTypes.Wait_3261);
			types.add(BpeldiagElementTypes.While_3262);
			return types;
		}
		if (editPart instanceof OnEventOnEventCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3264);
			types.add(BpeldiagElementTypes.Compensate_3265);
			types.add(BpeldiagElementTypes.CompensateScope_3266);
			types.add(BpeldiagElementTypes.Empty_3267);
			types.add(BpeldiagElementTypes.Exit_3268);
			types.add(BpeldiagElementTypes.ExtensionActivity_3269);
			types.add(BpeldiagElementTypes.Flow_3270);
			types.add(BpeldiagElementTypes.ForEach_3271);
			types.add(BpeldiagElementTypes.If_3272);
			types.add(BpeldiagElementTypes.Invoke_3273);
			types.add(BpeldiagElementTypes.OpaqueActivity_3274);
			types.add(BpeldiagElementTypes.PartnerActivity_3275);
			types.add(BpeldiagElementTypes.Pick_3276);
			types.add(BpeldiagElementTypes.Receive_3277);
			types.add(BpeldiagElementTypes.RepeatUntil_3278);
			types.add(BpeldiagElementTypes.Reply_3279);
			types.add(BpeldiagElementTypes.Rethrow_3280);
			types.add(BpeldiagElementTypes.Scope_3281);
			types.add(BpeldiagElementTypes.Sequence_3282);
			types.add(BpeldiagElementTypes.Throw_3283);
			types.add(BpeldiagElementTypes.Validate_3284);
			types.add(BpeldiagElementTypes.Wait_3285);
			types.add(BpeldiagElementTypes.While_3286);
			return types;
		}
		if (editPart instanceof OnMessageOnMessageCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(BpeldiagElementTypes.Assign_3236);
			types.add(BpeldiagElementTypes.Compensate_3237);
			types.add(BpeldiagElementTypes.CompensateScope_3238);
			types.add(BpeldiagElementTypes.Empty_3239);
			types.add(BpeldiagElementTypes.Exit_3240);
			types.add(BpeldiagElementTypes.ExtensionActivity_3241);
			types.add(BpeldiagElementTypes.Flow_3242);
			types.add(BpeldiagElementTypes.ForEach_3287);
			types.add(BpeldiagElementTypes.If_3288);
			types.add(BpeldiagElementTypes.Invoke_3289);
			types.add(BpeldiagElementTypes.OpaqueActivity_3290);
			types.add(BpeldiagElementTypes.PartnerActivity_3291);
			types.add(BpeldiagElementTypes.Pick_3292);
			types.add(BpeldiagElementTypes.Receive_3293);
			types.add(BpeldiagElementTypes.RepeatUntil_3294);
			types.add(BpeldiagElementTypes.Reply_3295);
			types.add(BpeldiagElementTypes.Rethrow_3296);
			types.add(BpeldiagElementTypes.Scope_3297);
			types.add(BpeldiagElementTypes.Sequence_3298);
			types.add(BpeldiagElementTypes.Throw_3299);
			types.add(BpeldiagElementTypes.Validate_3300);
			types.add(BpeldiagElementTypes.Wait_3301);
			types.add(BpeldiagElementTypes.While_3302);
			return types;
		}
		if (editPart instanceof EventHandlerEventHandlerCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(BpeldiagElementTypes.OnAlarm_3244);
			types.add(BpeldiagElementTypes.OnEvent_3263);
			return types;
		}
		if (editPart instanceof ProcessContainerEditPart) {
			ArrayList types = new ArrayList(31);
			types.add(BpeldiagElementTypes.Process_2001);
			types.add(BpeldiagElementTypes.Assign_2002);
			types.add(BpeldiagElementTypes.Compensate_2003);
			types.add(BpeldiagElementTypes.CompensateScope_2004);
			types.add(BpeldiagElementTypes.Empty_2005);
			types.add(BpeldiagElementTypes.Exit_2006);
			types.add(BpeldiagElementTypes.ExtensionActivity_2007);
			types.add(BpeldiagElementTypes.Flow_2008);
			types.add(BpeldiagElementTypes.ForEach_2009);
			types.add(BpeldiagElementTypes.If_2010);
			types.add(BpeldiagElementTypes.Invoke_2011);
			types.add(BpeldiagElementTypes.OpaqueActivity_2012);
			types.add(BpeldiagElementTypes.Pick_2014);
			types.add(BpeldiagElementTypes.Receive_2015);
			types.add(BpeldiagElementTypes.RepeatUntil_2016);
			types.add(BpeldiagElementTypes.Reply_2017);
			types.add(BpeldiagElementTypes.Rethrow_2018);
			types.add(BpeldiagElementTypes.Scope_2019);
			types.add(BpeldiagElementTypes.Sequence_2020);
			types.add(BpeldiagElementTypes.Throw_2021);
			types.add(BpeldiagElementTypes.Validate_2022);
			types.add(BpeldiagElementTypes.Wait_2023);
			types.add(BpeldiagElementTypes.While_2024);
			types.add(BpeldiagElementTypes.PartnerActivity_2013);
			types.add(BpeldiagElementTypes.ElseIf_2025);
			types.add(BpeldiagElementTypes.Else_2026);
			types.add(BpeldiagElementTypes.OnAlarm_2027);
			types.add(BpeldiagElementTypes.OnEvent_2028);
			types.add(BpeldiagElementTypes.OnMessage_2029);
			types.add(BpeldiagElementTypes.EventHandler_2030);
			types.add(BpeldiagElementTypes.Operation_2031);
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
		if (sourceEditPart instanceof InvokeEditPart) {
			return ((InvokeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReceiveEditPart) {
			return ((ReceiveEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReplyEditPart) {
			return ((ReplyEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivityEditPart) {
			return ((PartnerActivityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke2EditPart) {
			return ((Invoke2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity2EditPart) {
			return ((PartnerActivity2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke3EditPart) {
			return ((Invoke3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity3EditPart) {
			return ((PartnerActivity3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke4EditPart) {
			return ((Invoke4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity4EditPart) {
			return ((PartnerActivity4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive2EditPart) {
			return ((Receive2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive3EditPart) {
			return ((Receive3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke5EditPart) {
			return ((Invoke5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity5EditPart) {
			return ((PartnerActivity5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive4EditPart) {
			return ((Receive4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply2EditPart) {
			return ((Reply2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply3EditPart) {
			return ((Reply3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke6EditPart) {
			return ((Invoke6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity6EditPart) {
			return ((PartnerActivity6EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive5EditPart) {
			return ((Receive5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply4EditPart) {
			return ((Reply4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply5EditPart) {
			return ((Reply5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive6EditPart) {
			return ((Receive6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke7EditPart) {
			return ((Invoke7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity7EditPart) {
			return ((PartnerActivity7EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive7EditPart) {
			return ((Receive7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply6EditPart) {
			return ((Reply6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply7EditPart) {
			return ((Reply7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke8EditPart) {
			return ((Invoke8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity8EditPart) {
			return ((PartnerActivity8EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive8EditPart) {
			return ((Receive8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply8EditPart) {
			return ((Reply8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke9EditPart) {
			return ((Invoke9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity9EditPart) {
			return ((PartnerActivity9EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive9EditPart) {
			return ((Receive9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply9EditPart) {
			return ((Reply9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke10EditPart) {
			return ((Invoke10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity10EditPart) {
			return ((PartnerActivity10EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive10EditPart) {
			return ((Receive10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply10EditPart) {
			return ((Reply10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke11EditPart) {
			return ((Invoke11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity11EditPart) {
			return ((PartnerActivity11EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive11EditPart) {
			return ((Receive11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply11EditPart) {
			return ((Reply11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke12EditPart) {
			return ((Invoke12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity12EditPart) {
			return ((PartnerActivity12EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive12EditPart) {
			return ((Receive12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply12EditPart) {
			return ((Reply12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke13EditPart) {
			return ((Invoke13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity13EditPart) {
			return ((PartnerActivity13EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive13EditPart) {
			return ((Receive13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply13EditPart) {
			return ((Reply13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke14EditPart) {
			return ((Invoke14EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity14EditPart) {
			return ((PartnerActivity14EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive14EditPart) {
			return ((Receive14EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply14EditPart) {
			return ((Reply14EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof InvokeEditPart) {
			return ((InvokeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ReceiveEditPart) {
			return ((ReceiveEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ReplyEditPart) {
			return ((ReplyEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivityEditPart) {
			return ((PartnerActivityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke2EditPart) {
			return ((Invoke2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity2EditPart) {
			return ((PartnerActivity2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke3EditPart) {
			return ((Invoke3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity3EditPart) {
			return ((PartnerActivity3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke4EditPart) {
			return ((Invoke4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity4EditPart) {
			return ((PartnerActivity4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive2EditPart) {
			return ((Receive2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive3EditPart) {
			return ((Receive3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke5EditPart) {
			return ((Invoke5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity5EditPart) {
			return ((PartnerActivity5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive4EditPart) {
			return ((Receive4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply2EditPart) {
			return ((Reply2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply3EditPart) {
			return ((Reply3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke6EditPart) {
			return ((Invoke6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity6EditPart) {
			return ((PartnerActivity6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive5EditPart) {
			return ((Receive5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply4EditPart) {
			return ((Reply4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply5EditPart) {
			return ((Reply5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive6EditPart) {
			return ((Receive6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke7EditPart) {
			return ((Invoke7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity7EditPart) {
			return ((PartnerActivity7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive7EditPart) {
			return ((Receive7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply6EditPart) {
			return ((Reply6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply7EditPart) {
			return ((Reply7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke8EditPart) {
			return ((Invoke8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity8EditPart) {
			return ((PartnerActivity8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive8EditPart) {
			return ((Receive8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply8EditPart) {
			return ((Reply8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke9EditPart) {
			return ((Invoke9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity9EditPart) {
			return ((PartnerActivity9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive9EditPart) {
			return ((Receive9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply9EditPart) {
			return ((Reply9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke10EditPart) {
			return ((Invoke10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity10EditPart) {
			return ((PartnerActivity10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive10EditPart) {
			return ((Receive10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply10EditPart) {
			return ((Reply10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke11EditPart) {
			return ((Invoke11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity11EditPart) {
			return ((PartnerActivity11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive11EditPart) {
			return ((Receive11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply11EditPart) {
			return ((Reply11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke12EditPart) {
			return ((Invoke12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity12EditPart) {
			return ((PartnerActivity12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive12EditPart) {
			return ((Receive12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply12EditPart) {
			return ((Reply12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke13EditPart) {
			return ((Invoke13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity13EditPart) {
			return ((PartnerActivity13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive13EditPart) {
			return ((Receive13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply13EditPart) {
			return ((Reply13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invoke14EditPart) {
			return ((Invoke14EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivity14EditPart) {
			return ((PartnerActivity14EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive14EditPart) {
			return ((Receive14EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply14EditPart) {
			return ((Reply14EditPart) sourceEditPart)
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
		if (targetEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) targetEditPart)
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
		if (sourceEditPart instanceof InvokeEditPart) {
			return ((InvokeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ReceiveEditPart) {
			return ((ReceiveEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ReplyEditPart) {
			return ((ReplyEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivityEditPart) {
			return ((PartnerActivityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke2EditPart) {
			return ((Invoke2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity2EditPart) {
			return ((PartnerActivity2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke3EditPart) {
			return ((Invoke3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity3EditPart) {
			return ((PartnerActivity3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke4EditPart) {
			return ((Invoke4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity4EditPart) {
			return ((PartnerActivity4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive2EditPart) {
			return ((Receive2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive3EditPart) {
			return ((Receive3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke5EditPart) {
			return ((Invoke5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity5EditPart) {
			return ((PartnerActivity5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive4EditPart) {
			return ((Receive4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply2EditPart) {
			return ((Reply2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply3EditPart) {
			return ((Reply3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke6EditPart) {
			return ((Invoke6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity6EditPart) {
			return ((PartnerActivity6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive5EditPart) {
			return ((Receive5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply4EditPart) {
			return ((Reply4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply5EditPart) {
			return ((Reply5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive6EditPart) {
			return ((Receive6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke7EditPart) {
			return ((Invoke7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity7EditPart) {
			return ((PartnerActivity7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive7EditPart) {
			return ((Receive7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply6EditPart) {
			return ((Reply6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply7EditPart) {
			return ((Reply7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke8EditPart) {
			return ((Invoke8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity8EditPart) {
			return ((PartnerActivity8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive8EditPart) {
			return ((Receive8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply8EditPart) {
			return ((Reply8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke9EditPart) {
			return ((Invoke9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity9EditPart) {
			return ((PartnerActivity9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive9EditPart) {
			return ((Receive9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply9EditPart) {
			return ((Reply9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke10EditPart) {
			return ((Invoke10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity10EditPart) {
			return ((PartnerActivity10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive10EditPart) {
			return ((Receive10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply10EditPart) {
			return ((Reply10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke11EditPart) {
			return ((Invoke11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity11EditPart) {
			return ((PartnerActivity11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive11EditPart) {
			return ((Receive11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply11EditPart) {
			return ((Reply11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke12EditPart) {
			return ((Invoke12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity12EditPart) {
			return ((PartnerActivity12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive12EditPart) {
			return ((Receive12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply12EditPart) {
			return ((Reply12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke13EditPart) {
			return ((Invoke13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity13EditPart) {
			return ((PartnerActivity13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive13EditPart) {
			return ((Receive13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply13EditPart) {
			return ((Reply13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invoke14EditPart) {
			return ((Invoke14EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivity14EditPart) {
			return ((PartnerActivity14EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive14EditPart) {
			return ((Receive14EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply14EditPart) {
			return ((Reply14EditPart) sourceEditPart)
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
				BpeldiagDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.BpeldiagModelingAssistantProviderMessage);
		dialog.setTitle(Messages.BpeldiagModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
