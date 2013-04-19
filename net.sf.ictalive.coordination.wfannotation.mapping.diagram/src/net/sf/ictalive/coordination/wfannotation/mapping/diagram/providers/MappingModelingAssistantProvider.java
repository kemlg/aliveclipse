package net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramEditorPlugin;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.Messages;

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
public class MappingModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ProcessProcessCompartmentEditPart) {
			ArrayList types = new ArrayList(24);
			types.add(MappingElementTypes.Assign_3001);
			types.add(MappingElementTypes.Compensate_3002);
			types.add(MappingElementTypes.CompensateScope_3003);
			types.add(MappingElementTypes.Empty_3004);
			types.add(MappingElementTypes.Exit_3005);
			types.add(MappingElementTypes.ExtensionActivity_3006);
			types.add(MappingElementTypes.Flow_3007);
			types.add(MappingElementTypes.ForEach_3279);
			types.add(MappingElementTypes.If_3280);
			types.add(MappingElementTypes.Invoke_3281);
			types.add(MappingElementTypes.OpaqueActivity_3282);
			types.add(MappingElementTypes.PartnerActivity_3283);
			types.add(MappingElementTypes.Pick_3284);
			types.add(MappingElementTypes.Receive_3285);
			types.add(MappingElementTypes.RepeatUntil_3286);
			types.add(MappingElementTypes.Reply_3287);
			types.add(MappingElementTypes.Rethrow_3288);
			types.add(MappingElementTypes.Scope_3289);
			types.add(MappingElementTypes.Sequence_3290);
			types.add(MappingElementTypes.Throw_3291);
			types.add(MappingElementTypes.Validate_3292);
			types.add(MappingElementTypes.Wait_3293);
			types.add(MappingElementTypes.While_3294);
			types.add(MappingElementTypes.EventHandler_3295);
			return types;
		}
		if (editPart instanceof FlowFlowCompartmentEditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment2EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartmentEditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment2EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof IfIfCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment3EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof PickPickCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof OnAlarmOnAlarmCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3037);
			types.add(MappingElementTypes.Compensate_3038);
			types.add(MappingElementTypes.CompensateScope_3039);
			types.add(MappingElementTypes.Empty_3040);
			types.add(MappingElementTypes.Exit_3041);
			types.add(MappingElementTypes.ExtensionActivity_3042);
			types.add(MappingElementTypes.Flow_3043);
			types.add(MappingElementTypes.ForEach_3115);
			types.add(MappingElementTypes.If_3224);
			types.add(MappingElementTypes.Invoke_3225);
			types.add(MappingElementTypes.OpaqueActivity_3226);
			types.add(MappingElementTypes.PartnerActivity_3227);
			types.add(MappingElementTypes.Pick_3228);
			types.add(MappingElementTypes.Receive_3229);
			types.add(MappingElementTypes.RepeatUntil_3230);
			types.add(MappingElementTypes.Reply_3231);
			types.add(MappingElementTypes.Rethrow_3232);
			types.add(MappingElementTypes.Scope_3233);
			types.add(MappingElementTypes.Sequence_3234);
			types.add(MappingElementTypes.Throw_3235);
			types.add(MappingElementTypes.Validate_3236);
			types.add(MappingElementTypes.Wait_3237);
			types.add(MappingElementTypes.While_3238);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment3EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof IfIfCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof PickPickCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof OnMessageOnMessageCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3050);
			types.add(MappingElementTypes.Compensate_3051);
			types.add(MappingElementTypes.CompensateScope_3052);
			types.add(MappingElementTypes.Empty_3053);
			types.add(MappingElementTypes.Exit_3054);
			types.add(MappingElementTypes.ExtensionActivity_3055);
			types.add(MappingElementTypes.Flow_3056);
			types.add(MappingElementTypes.ForEach_3263);
			types.add(MappingElementTypes.If_3264);
			types.add(MappingElementTypes.Invoke_3265);
			types.add(MappingElementTypes.OpaqueActivity_3266);
			types.add(MappingElementTypes.PartnerActivity_3267);
			types.add(MappingElementTypes.Pick_3268);
			types.add(MappingElementTypes.Receive_3269);
			types.add(MappingElementTypes.RepeatUntil_3270);
			types.add(MappingElementTypes.Reply_3271);
			types.add(MappingElementTypes.Rethrow_3272);
			types.add(MappingElementTypes.Scope_3273);
			types.add(MappingElementTypes.Sequence_3274);
			types.add(MappingElementTypes.Throw_3275);
			types.add(MappingElementTypes.Validate_3276);
			types.add(MappingElementTypes.Wait_3277);
			types.add(MappingElementTypes.While_3278);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment4EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof PickPickCompartment3EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartmentEditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment2EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment4EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment3EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof PickPickCompartment4EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartmentEditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment2EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment5EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment3EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof PickPickCompartment5EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof WhileWhileCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment5EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment4EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof EventHandlerEventHandlerCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3114);
			types.add(MappingElementTypes.OnEvent_3239);
			return types;
		}
		if (editPart instanceof OnAlarmOnAlarmCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3037);
			types.add(MappingElementTypes.Compensate_3038);
			types.add(MappingElementTypes.CompensateScope_3039);
			types.add(MappingElementTypes.Empty_3040);
			types.add(MappingElementTypes.Exit_3041);
			types.add(MappingElementTypes.ExtensionActivity_3042);
			types.add(MappingElementTypes.Flow_3043);
			types.add(MappingElementTypes.ForEach_3115);
			types.add(MappingElementTypes.If_3224);
			types.add(MappingElementTypes.Invoke_3225);
			types.add(MappingElementTypes.OpaqueActivity_3226);
			types.add(MappingElementTypes.PartnerActivity_3227);
			types.add(MappingElementTypes.Pick_3228);
			types.add(MappingElementTypes.Receive_3229);
			types.add(MappingElementTypes.RepeatUntil_3230);
			types.add(MappingElementTypes.Reply_3231);
			types.add(MappingElementTypes.Rethrow_3232);
			types.add(MappingElementTypes.Scope_3233);
			types.add(MappingElementTypes.Sequence_3234);
			types.add(MappingElementTypes.Throw_3235);
			types.add(MappingElementTypes.Validate_3236);
			types.add(MappingElementTypes.Wait_3237);
			types.add(MappingElementTypes.While_3238);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment6EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment7EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment4EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment4EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof PickPickCompartment6EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment5EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment5EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment6EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment4EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment5EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment8EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment5EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment6EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment6EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof ElseIfEliseIfCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3163);
			types.add(MappingElementTypes.Compensate_3164);
			types.add(MappingElementTypes.CompensateScope_3165);
			types.add(MappingElementTypes.Empty_3166);
			types.add(MappingElementTypes.Exit_3167);
			types.add(MappingElementTypes.ExtensionActivity_3168);
			types.add(MappingElementTypes.Flow_3169);
			types.add(MappingElementTypes.ForEach_3170);
			types.add(MappingElementTypes.If_3171);
			types.add(MappingElementTypes.Invoke_3210);
			types.add(MappingElementTypes.OpaqueActivity_3211);
			types.add(MappingElementTypes.PartnerActivity_3212);
			types.add(MappingElementTypes.Pick_3213);
			types.add(MappingElementTypes.Receive_3214);
			types.add(MappingElementTypes.RepeatUntil_3215);
			types.add(MappingElementTypes.Reply_3216);
			types.add(MappingElementTypes.Rethrow_3217);
			types.add(MappingElementTypes.Scope_3218);
			types.add(MappingElementTypes.Sequence_3219);
			types.add(MappingElementTypes.Throw_3220);
			types.add(MappingElementTypes.Validate_3221);
			types.add(MappingElementTypes.Wait_3222);
			types.add(MappingElementTypes.While_3223);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment7EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment9EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment6EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof ElseElseCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3173);
			types.add(MappingElementTypes.Compensate_3174);
			types.add(MappingElementTypes.CompensateScope_3175);
			types.add(MappingElementTypes.Empty_3176);
			types.add(MappingElementTypes.Exit_3177);
			types.add(MappingElementTypes.ExtensionActivity_3178);
			types.add(MappingElementTypes.Flow_3179);
			types.add(MappingElementTypes.ForEach_3180);
			types.add(MappingElementTypes.If_3181);
			types.add(MappingElementTypes.Invoke_3182);
			types.add(MappingElementTypes.OpaqueActivity_3183);
			types.add(MappingElementTypes.PartnerActivity_3184);
			types.add(MappingElementTypes.Pick_3185);
			types.add(MappingElementTypes.Receive_3186);
			types.add(MappingElementTypes.RepeatUntil_3187);
			types.add(MappingElementTypes.Reply_3188);
			types.add(MappingElementTypes.Rethrow_3189);
			types.add(MappingElementTypes.Scope_3190);
			types.add(MappingElementTypes.Sequence_3191);
			types.add(MappingElementTypes.Throw_3206);
			types.add(MappingElementTypes.Validate_3207);
			types.add(MappingElementTypes.Wait_3208);
			types.add(MappingElementTypes.While_3209);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment8EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment10EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment7EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof PickPickCompartment7EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment6EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment7EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment2EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof PickPickCompartment8EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment7EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment8EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment3EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment7EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment8EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof PickPickCompartment9EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment8EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment9EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment4EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment9EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof IfIfCompartment8EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof PickPickCompartment10EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment9EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment10EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment5EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment10EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof OnEventOnEventCompartmentEditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3240);
			types.add(MappingElementTypes.Compensate_3241);
			types.add(MappingElementTypes.CompensateScope_3242);
			types.add(MappingElementTypes.Empty_3243);
			types.add(MappingElementTypes.Exit_3244);
			types.add(MappingElementTypes.ExtensionActivity_3245);
			types.add(MappingElementTypes.Flow_3246);
			types.add(MappingElementTypes.ForEach_3247);
			types.add(MappingElementTypes.If_3248);
			types.add(MappingElementTypes.Invoke_3249);
			types.add(MappingElementTypes.OpaqueActivity_3250);
			types.add(MappingElementTypes.PartnerActivity_3251);
			types.add(MappingElementTypes.Pick_3252);
			types.add(MappingElementTypes.Receive_3253);
			types.add(MappingElementTypes.RepeatUntil_3254);
			types.add(MappingElementTypes.Reply_3255);
			types.add(MappingElementTypes.Rethrow_3256);
			types.add(MappingElementTypes.Scope_3257);
			types.add(MappingElementTypes.Sequence_3258);
			types.add(MappingElementTypes.Throw_3259);
			types.add(MappingElementTypes.Validate_3260);
			types.add(MappingElementTypes.Wait_3261);
			types.add(MappingElementTypes.While_3262);
			return types;
		}
		if (editPart instanceof FlowFlowCompartment9EditPart) {
			ArrayList types = new ArrayList(22);
			types.add(MappingElementTypes.Assign_3008);
			types.add(MappingElementTypes.Compensate_3009);
			types.add(MappingElementTypes.CompensateScope_3010);
			types.add(MappingElementTypes.Empty_3011);
			types.add(MappingElementTypes.Exit_3012);
			types.add(MappingElementTypes.ExtensionActivity_3013);
			types.add(MappingElementTypes.Flow_3014);
			types.add(MappingElementTypes.ForEach_3015);
			types.add(MappingElementTypes.If_3044);
			types.add(MappingElementTypes.Invoke_3057);
			types.add(MappingElementTypes.OpaqueActivity_3058);
			types.add(MappingElementTypes.PartnerActivity_3059);
			types.add(MappingElementTypes.Pick_3060);
			types.add(MappingElementTypes.Receive_3061);
			types.add(MappingElementTypes.RepeatUntil_3062);
			types.add(MappingElementTypes.Reply_3110);
			types.add(MappingElementTypes.Rethrow_3111);
			types.add(MappingElementTypes.Scope_3112);
			types.add(MappingElementTypes.Throw_3145);
			types.add(MappingElementTypes.Validate_3146);
			types.add(MappingElementTypes.Wait_3147);
			types.add(MappingElementTypes.While_3148);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment11EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment9EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof PickPickCompartment11EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment10EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment11EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment6EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment11EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment12EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment10EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof PickPickCompartment12EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment11EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment12EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment7EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment12EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof ForEachForEachCompartment13EditPart) {
			ArrayList types = new ArrayList(21);
			types.add(MappingElementTypes.Assign_3016);
			types.add(MappingElementTypes.Compensate_3017);
			types.add(MappingElementTypes.CompensateScope_3018);
			types.add(MappingElementTypes.Empty_3019);
			types.add(MappingElementTypes.Exit_3020);
			types.add(MappingElementTypes.ExtensionActivity_3021);
			types.add(MappingElementTypes.ForEach_3022);
			types.add(MappingElementTypes.If_3023);
			types.add(MappingElementTypes.Invoke_3032);
			types.add(MappingElementTypes.OpaqueActivity_3033);
			types.add(MappingElementTypes.PartnerActivity_3034);
			types.add(MappingElementTypes.Pick_3035);
			types.add(MappingElementTypes.Receive_3071);
			types.add(MappingElementTypes.RepeatUntil_3072);
			types.add(MappingElementTypes.Reply_3089);
			types.add(MappingElementTypes.Rethrow_3090);
			types.add(MappingElementTypes.Scope_3091);
			types.add(MappingElementTypes.Throw_3116);
			types.add(MappingElementTypes.Validate_3117);
			types.add(MappingElementTypes.Wait_3118);
			types.add(MappingElementTypes.While_3119);
			return types;
		}
		if (editPart instanceof IfIfCompartment11EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3024);
			types.add(MappingElementTypes.Compensate_3025);
			types.add(MappingElementTypes.CompensateScope_3026);
			types.add(MappingElementTypes.Empty_3027);
			types.add(MappingElementTypes.Exit_3028);
			types.add(MappingElementTypes.ExtensionActivity_3029);
			types.add(MappingElementTypes.If_3030);
			types.add(MappingElementTypes.ForEach_3031);
			types.add(MappingElementTypes.Invoke_3045);
			types.add(MappingElementTypes.OpaqueActivity_3046);
			types.add(MappingElementTypes.PartnerActivity_3047);
			types.add(MappingElementTypes.Pick_3048);
			types.add(MappingElementTypes.Receive_3122);
			types.add(MappingElementTypes.RepeatUntil_3123);
			types.add(MappingElementTypes.Reply_3155);
			types.add(MappingElementTypes.Rethrow_3156);
			types.add(MappingElementTypes.Scope_3157);
			types.add(MappingElementTypes.Throw_3158);
			types.add(MappingElementTypes.Validate_3159);
			types.add(MappingElementTypes.Wait_3160);
			types.add(MappingElementTypes.While_3161);
			types.add(MappingElementTypes.ElseIf_3162);
			types.add(MappingElementTypes.Else_3172);
			return types;
		}
		if (editPart instanceof PickPickCompartment13EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3036);
			types.add(MappingElementTypes.OnMessage_3049);
			return types;
		}
		if (editPart instanceof RepeatUntilRepeatUntilCompartment12EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3063);
			types.add(MappingElementTypes.Compensate_3064);
			types.add(MappingElementTypes.CompensateScope_3065);
			types.add(MappingElementTypes.Empty_3066);
			types.add(MappingElementTypes.Exit_3067);
			types.add(MappingElementTypes.ExtensionActivity_3068);
			types.add(MappingElementTypes.RepeatUntil_3069);
			types.add(MappingElementTypes.ForEach_3070);
			types.add(MappingElementTypes.Invoke_3073);
			types.add(MappingElementTypes.OpaqueActivity_3074);
			types.add(MappingElementTypes.PartnerActivity_3075);
			types.add(MappingElementTypes.Pick_3076);
			types.add(MappingElementTypes.Receive_3077);
			types.add(MappingElementTypes.Reply_3078);
			types.add(MappingElementTypes.Rethrow_3079);
			types.add(MappingElementTypes.Scope_3080);
			types.add(MappingElementTypes.Throw_3124);
			types.add(MappingElementTypes.Validate_3125);
			types.add(MappingElementTypes.Wait_3126);
			types.add(MappingElementTypes.While_3127);
			return types;
		}
		if (editPart instanceof ScopeScopeCompartment13EditPart) {
			ArrayList types = new ArrayList(20);
			types.add(MappingElementTypes.Assign_3081);
			types.add(MappingElementTypes.Compensate_3082);
			types.add(MappingElementTypes.CompensateScope_3083);
			types.add(MappingElementTypes.Empty_3084);
			types.add(MappingElementTypes.Exit_3085);
			types.add(MappingElementTypes.ExtensionActivity_3086);
			types.add(MappingElementTypes.Scope_3087);
			types.add(MappingElementTypes.ForEach_3088);
			types.add(MappingElementTypes.Invoke_3092);
			types.add(MappingElementTypes.OpaqueActivity_3093);
			types.add(MappingElementTypes.PartnerActivity_3094);
			types.add(MappingElementTypes.Pick_3095);
			types.add(MappingElementTypes.Receive_3096);
			types.add(MappingElementTypes.Reply_3097);
			types.add(MappingElementTypes.Rethrow_3098);
			types.add(MappingElementTypes.Throw_3099);
			types.add(MappingElementTypes.Validate_3100);
			types.add(MappingElementTypes.Wait_3101);
			types.add(MappingElementTypes.While_3102);
			types.add(MappingElementTypes.EventHandler_3113);
			return types;
		}
		if (editPart instanceof SequenceSequenceCompartment8EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3138);
			types.add(MappingElementTypes.Compensate_3139);
			types.add(MappingElementTypes.CompensateScope_3140);
			types.add(MappingElementTypes.Empty_3141);
			types.add(MappingElementTypes.Exit_3142);
			types.add(MappingElementTypes.ExtensionActivity_3143);
			types.add(MappingElementTypes.Flow_3144);
			types.add(MappingElementTypes.ForEach_3153);
			types.add(MappingElementTypes.If_3154);
			types.add(MappingElementTypes.Invoke_3192);
			types.add(MappingElementTypes.OpaqueActivity_3193);
			types.add(MappingElementTypes.PartnerActivity_3194);
			types.add(MappingElementTypes.Pick_3195);
			types.add(MappingElementTypes.Receive_3196);
			types.add(MappingElementTypes.RepeatUntil_3197);
			types.add(MappingElementTypes.Reply_3198);
			types.add(MappingElementTypes.Rethrow_3199);
			types.add(MappingElementTypes.Scope_3200);
			types.add(MappingElementTypes.Sequence_3201);
			types.add(MappingElementTypes.Throw_3202);
			types.add(MappingElementTypes.Validate_3203);
			types.add(MappingElementTypes.Wait_3204);
			types.add(MappingElementTypes.While_3205);
			return types;
		}
		if (editPart instanceof WhileWhileCompartment13EditPart) {
			ArrayList types = new ArrayList(23);
			types.add(MappingElementTypes.Assign_3103);
			types.add(MappingElementTypes.Compensate_3104);
			types.add(MappingElementTypes.CompensateScope_3105);
			types.add(MappingElementTypes.Empty_3106);
			types.add(MappingElementTypes.Exit_3107);
			types.add(MappingElementTypes.ExtensionActivity_3108);
			types.add(MappingElementTypes.Flow_3109);
			types.add(MappingElementTypes.ForEach_3120);
			types.add(MappingElementTypes.If_3121);
			types.add(MappingElementTypes.Invoke_3128);
			types.add(MappingElementTypes.OpaqueActivity_3129);
			types.add(MappingElementTypes.PartnerActivity_3130);
			types.add(MappingElementTypes.Pick_3131);
			types.add(MappingElementTypes.Receive_3132);
			types.add(MappingElementTypes.RepeatUntil_3133);
			types.add(MappingElementTypes.Reply_3134);
			types.add(MappingElementTypes.Rethrow_3135);
			types.add(MappingElementTypes.Scope_3136);
			types.add(MappingElementTypes.Sequence_3137);
			types.add(MappingElementTypes.Throw_3149);
			types.add(MappingElementTypes.Validate_3150);
			types.add(MappingElementTypes.Wait_3151);
			types.add(MappingElementTypes.While_3152);
			return types;
		}
		if (editPart instanceof EventHandlerEventHandlerCompartment2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(MappingElementTypes.OnAlarm_3114);
			types.add(MappingElementTypes.OnEvent_3239);
			return types;
		}
		if (editPart instanceof MappingContainerEditPart) {
			ArrayList types = new ArrayList(14);
			types.add(MappingElementTypes.Process_2002);
			types.add(MappingElementTypes.AtomicAction_2001);
			types.add(MappingElementTypes.CompositeAction_2014);
			types.add(MappingElementTypes.Sequence_2004);
			types.add(MappingElementTypes.AnyOrder_2005);
			types.add(MappingElementTypes.ControlConstructBag_2006);
			types.add(MappingElementTypes.Perform_2007);
			types.add(MappingElementTypes.Choice_2008);
			types.add(MappingElementTypes.ControlConstructList_2009);
			types.add(MappingElementTypes.RepeatUntil_2010);
			types.add(MappingElementTypes.RepeatWhile_2011);
			types.add(MappingElementTypes.IfThenElse_2012);
			types.add(MappingElementTypes.Split_2015);
			types.add(MappingElementTypes.SplitJoin_2016);
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
		if (sourceEditPart instanceof ProcessEditPart) {
			return ((ProcessEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FlowEditPart) {
			return ((FlowEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow2EditPart) {
			return ((Flow2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEachEditPart) {
			return ((ForEachEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach2EditPart) {
			return ((ForEach2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IfEditPart) {
			return ((IfEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If2EditPart) {
			return ((If2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach3EditPart) {
			return ((ForEach3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InvokeEditPart) {
			return ((InvokeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivityEditPart) {
			return ((PartnerActivityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow3EditPart) {
			return ((Flow3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If3EditPart) {
			return ((If3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke2EditPart) {
			return ((Invoke2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity2EditPart) {
			return ((PartnerActivity2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow4EditPart) {
			return ((Flow4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke3EditPart) {
			return ((Invoke3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity3EditPart) {
			return ((PartnerActivity3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReceiveEditPart) {
			return ((ReceiveEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatUntil2EditPart) {
			return ((RepeatUntil2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatUntil3EditPart) {
			return ((RepeatUntil3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach4EditPart) {
			return ((ForEach4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive2EditPart) {
			return ((Receive2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatUntil4EditPart) {
			return ((RepeatUntil4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke4EditPart) {
			return ((Invoke4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity4EditPart) {
			return ((PartnerActivity4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive3EditPart) {
			return ((Receive3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReplyEditPart) {
			return ((ReplyEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScopeEditPart) {
			return ((ScopeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope2EditPart) {
			return ((Scope2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach5EditPart) {
			return ((ForEach5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply2EditPart) {
			return ((Reply2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope3EditPart) {
			return ((Scope3EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof Reply3EditPart) {
			return ((Reply3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow5EditPart) {
			return ((Flow5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply4EditPart) {
			return ((Reply4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope4EditPart) {
			return ((Scope4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach6EditPart) {
			return ((ForEach6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While2EditPart) {
			return ((While2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach7EditPart) {
			return ((ForEach7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If4EditPart) {
			return ((If4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive5EditPart) {
			return ((Receive5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatUntil5EditPart) {
			return ((RepeatUntil5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While3EditPart) {
			return ((While3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invoke6EditPart) {
			return ((Invoke6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PartnerActivity6EditPart) {
			return ((PartnerActivity6EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Receive6EditPart) {
			return ((Receive6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatUntil6EditPart) {
			return ((RepeatUntil6EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply5EditPart) {
			return ((Reply5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope5EditPart) {
			return ((Scope5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence2EditPart) {
			return ((Sequence2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow6EditPart) {
			return ((Flow6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While4EditPart) {
			return ((While4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While5EditPart) {
			return ((While5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach8EditPart) {
			return ((ForEach8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If5EditPart) {
			return ((If5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply6EditPart) {
			return ((Reply6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope6EditPart) {
			return ((Scope6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While6EditPart) {
			return ((While6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ElseIfEditPart) {
			return ((ElseIfEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow7EditPart) {
			return ((Flow7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach9EditPart) {
			return ((ForEach9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If6EditPart) {
			return ((If6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ElseEditPart) {
			return ((ElseEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow8EditPart) {
			return ((Flow8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach10EditPart) {
			return ((ForEach10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If7EditPart) {
			return ((If7EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil7EditPart) {
			return ((RepeatUntil7EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply7EditPart) {
			return ((Reply7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope7EditPart) {
			return ((Scope7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence3EditPart) {
			return ((Sequence3EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil8EditPart) {
			return ((RepeatUntil8EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply8EditPart) {
			return ((Reply8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope8EditPart) {
			return ((Scope8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence4EditPart) {
			return ((Sequence4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While7EditPart) {
			return ((While7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While8EditPart) {
			return ((While8EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil9EditPart) {
			return ((RepeatUntil9EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply9EditPart) {
			return ((Reply9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope9EditPart) {
			return ((Scope9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence5EditPart) {
			return ((Sequence5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While9EditPart) {
			return ((While9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If8EditPart) {
			return ((If8EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil10EditPart) {
			return ((RepeatUntil10EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply10EditPart) {
			return ((Reply10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope10EditPart) {
			return ((Scope10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence6EditPart) {
			return ((Sequence6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While10EditPart) {
			return ((While10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Flow9EditPart) {
			return ((Flow9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach11EditPart) {
			return ((ForEach11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If9EditPart) {
			return ((If9EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil11EditPart) {
			return ((RepeatUntil11EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply11EditPart) {
			return ((Reply11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope11EditPart) {
			return ((Scope11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence7EditPart) {
			return ((Sequence7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While11EditPart) {
			return ((While11EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach12EditPart) {
			return ((ForEach12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If10EditPart) {
			return ((If10EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil12EditPart) {
			return ((RepeatUntil12EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply12EditPart) {
			return ((Reply12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope12EditPart) {
			return ((Scope12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence8EditPart) {
			return ((Sequence8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While12EditPart) {
			return ((While12EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForEach13EditPart) {
			return ((ForEach13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof If11EditPart) {
			return ((If11EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntil13EditPart) {
			return ((RepeatUntil13EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Reply13EditPart) {
			return ((Reply13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Scope13EditPart) {
			return ((Scope13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sequence9EditPart) {
			return ((Sequence9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While13EditPart) {
			return ((While13EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof ProcessEditPart) {
			return ((ProcessEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FlowEditPart) {
			return ((FlowEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow2EditPart) {
			return ((Flow2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEachEditPart) {
			return ((ForEachEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach2EditPart) {
			return ((ForEach2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IfEditPart) {
			return ((IfEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If2EditPart) {
			return ((If2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach3EditPart) {
			return ((ForEach3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InvokeEditPart) {
			return ((InvokeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PartnerActivityEditPart) {
			return ((PartnerActivityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow3EditPart) {
			return ((Flow3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If3EditPart) {
			return ((If3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Flow4EditPart) {
			return ((Flow4EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof ReceiveEditPart) {
			return ((ReceiveEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatUntil2EditPart) {
			return ((RepeatUntil2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatUntil3EditPart) {
			return ((RepeatUntil3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach4EditPart) {
			return ((ForEach4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive2EditPart) {
			return ((Receive2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatUntil4EditPart) {
			return ((RepeatUntil4EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Receive3EditPart) {
			return ((Receive3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ReplyEditPart) {
			return ((ReplyEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScopeEditPart) {
			return ((ScopeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope2EditPart) {
			return ((Scope2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach5EditPart) {
			return ((ForEach5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply2EditPart) {
			return ((Reply2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope3EditPart) {
			return ((Scope3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Reply3EditPart) {
			return ((Reply3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow5EditPart) {
			return ((Flow5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply4EditPart) {
			return ((Reply4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope4EditPart) {
			return ((Scope4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach6EditPart) {
			return ((ForEach6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While2EditPart) {
			return ((While2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach7EditPart) {
			return ((ForEach7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If4EditPart) {
			return ((If4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Receive5EditPart) {
			return ((Receive5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatUntil5EditPart) {
			return ((RepeatUntil5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While3EditPart) {
			return ((While3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Receive6EditPart) {
			return ((Receive6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatUntil6EditPart) {
			return ((RepeatUntil6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply5EditPart) {
			return ((Reply5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope5EditPart) {
			return ((Scope5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence2EditPart) {
			return ((Sequence2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow6EditPart) {
			return ((Flow6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While4EditPart) {
			return ((While4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While5EditPart) {
			return ((While5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach8EditPart) {
			return ((ForEach8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If5EditPart) {
			return ((If5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply6EditPart) {
			return ((Reply6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope6EditPart) {
			return ((Scope6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While6EditPart) {
			return ((While6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ElseIfEditPart) {
			return ((ElseIfEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow7EditPart) {
			return ((Flow7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach9EditPart) {
			return ((ForEach9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If6EditPart) {
			return ((If6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ElseEditPart) {
			return ((ElseEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow8EditPart) {
			return ((Flow8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach10EditPart) {
			return ((ForEach10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If7EditPart) {
			return ((If7EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil7EditPart) {
			return ((RepeatUntil7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply7EditPart) {
			return ((Reply7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope7EditPart) {
			return ((Scope7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence3EditPart) {
			return ((Sequence3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil8EditPart) {
			return ((RepeatUntil8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply8EditPart) {
			return ((Reply8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope8EditPart) {
			return ((Scope8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence4EditPart) {
			return ((Sequence4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While7EditPart) {
			return ((While7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While8EditPart) {
			return ((While8EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil9EditPart) {
			return ((RepeatUntil9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply9EditPart) {
			return ((Reply9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope9EditPart) {
			return ((Scope9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence5EditPart) {
			return ((Sequence5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While9EditPart) {
			return ((While9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If8EditPart) {
			return ((If8EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil10EditPart) {
			return ((RepeatUntil10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply10EditPart) {
			return ((Reply10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope10EditPart) {
			return ((Scope10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence6EditPart) {
			return ((Sequence6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While10EditPart) {
			return ((While10EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Flow9EditPart) {
			return ((Flow9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach11EditPart) {
			return ((ForEach11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If9EditPart) {
			return ((If9EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil11EditPart) {
			return ((RepeatUntil11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply11EditPart) {
			return ((Reply11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope11EditPart) {
			return ((Scope11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence7EditPart) {
			return ((Sequence7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While11EditPart) {
			return ((While11EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach12EditPart) {
			return ((ForEach12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If10EditPart) {
			return ((If10EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil12EditPart) {
			return ((RepeatUntil12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply12EditPart) {
			return ((Reply12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope12EditPart) {
			return ((Scope12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence8EditPart) {
			return ((Sequence8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While12EditPart) {
			return ((While12EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForEach13EditPart) {
			return ((ForEach13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof If11EditPart) {
			return ((If11EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil13EditPart) {
			return ((RepeatUntil13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Reply13EditPart) {
			return ((Reply13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Scope13EditPart) {
			return ((Scope13EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sequence9EditPart) {
			return ((Sequence9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While13EditPart) {
			return ((While13EditPart) sourceEditPart)
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
		if (targetEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) targetEditPart)
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
		if (sourceEditPart instanceof ProcessEditPart) {
			return ((ProcessEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FlowEditPart) {
			return ((FlowEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow2EditPart) {
			return ((Flow2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEachEditPart) {
			return ((ForEachEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach2EditPart) {
			return ((ForEach2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IfEditPart) {
			return ((IfEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If2EditPart) {
			return ((If2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach3EditPart) {
			return ((ForEach3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InvokeEditPart) {
			return ((InvokeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PartnerActivityEditPart) {
			return ((PartnerActivityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow3EditPart) {
			return ((Flow3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If3EditPart) {
			return ((If3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Flow4EditPart) {
			return ((Flow4EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof ReceiveEditPart) {
			return ((ReceiveEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatUntil2EditPart) {
			return ((RepeatUntil2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatUntil3EditPart) {
			return ((RepeatUntil3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach4EditPart) {
			return ((ForEach4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive2EditPart) {
			return ((Receive2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatUntil4EditPart) {
			return ((RepeatUntil4EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Receive3EditPart) {
			return ((Receive3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ReplyEditPart) {
			return ((ReplyEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScopeEditPart) {
			return ((ScopeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope2EditPart) {
			return ((Scope2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach5EditPart) {
			return ((ForEach5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply2EditPart) {
			return ((Reply2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope3EditPart) {
			return ((Scope3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Reply3EditPart) {
			return ((Reply3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow5EditPart) {
			return ((Flow5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply4EditPart) {
			return ((Reply4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope4EditPart) {
			return ((Scope4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach6EditPart) {
			return ((ForEach6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While2EditPart) {
			return ((While2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach7EditPart) {
			return ((ForEach7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If4EditPart) {
			return ((If4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Receive5EditPart) {
			return ((Receive5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatUntil5EditPart) {
			return ((RepeatUntil5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While3EditPart) {
			return ((While3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof Receive6EditPart) {
			return ((Receive6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatUntil6EditPart) {
			return ((RepeatUntil6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply5EditPart) {
			return ((Reply5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope5EditPart) {
			return ((Scope5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence2EditPart) {
			return ((Sequence2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow6EditPart) {
			return ((Flow6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While4EditPart) {
			return ((While4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While5EditPart) {
			return ((While5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach8EditPart) {
			return ((ForEach8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If5EditPart) {
			return ((If5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply6EditPart) {
			return ((Reply6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope6EditPart) {
			return ((Scope6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While6EditPart) {
			return ((While6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ElseIfEditPart) {
			return ((ElseIfEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow7EditPart) {
			return ((Flow7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach9EditPart) {
			return ((ForEach9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If6EditPart) {
			return ((If6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ElseEditPart) {
			return ((ElseEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow8EditPart) {
			return ((Flow8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach10EditPart) {
			return ((ForEach10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If7EditPart) {
			return ((If7EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil7EditPart) {
			return ((RepeatUntil7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply7EditPart) {
			return ((Reply7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope7EditPart) {
			return ((Scope7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence3EditPart) {
			return ((Sequence3EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil8EditPart) {
			return ((RepeatUntil8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply8EditPart) {
			return ((Reply8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope8EditPart) {
			return ((Scope8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence4EditPart) {
			return ((Sequence4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While7EditPart) {
			return ((While7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While8EditPart) {
			return ((While8EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil9EditPart) {
			return ((RepeatUntil9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply9EditPart) {
			return ((Reply9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope9EditPart) {
			return ((Scope9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence5EditPart) {
			return ((Sequence5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While9EditPart) {
			return ((While9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If8EditPart) {
			return ((If8EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil10EditPart) {
			return ((RepeatUntil10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply10EditPart) {
			return ((Reply10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope10EditPart) {
			return ((Scope10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence6EditPart) {
			return ((Sequence6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While10EditPart) {
			return ((While10EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Flow9EditPart) {
			return ((Flow9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach11EditPart) {
			return ((ForEach11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If9EditPart) {
			return ((If9EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil11EditPart) {
			return ((RepeatUntil11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply11EditPart) {
			return ((Reply11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope11EditPart) {
			return ((Scope11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence7EditPart) {
			return ((Sequence7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While11EditPart) {
			return ((While11EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach12EditPart) {
			return ((ForEach12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If10EditPart) {
			return ((If10EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil12EditPart) {
			return ((RepeatUntil12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply12EditPart) {
			return ((Reply12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope12EditPart) {
			return ((Scope12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence8EditPart) {
			return ((Sequence8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While12EditPart) {
			return ((While12EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForEach13EditPart) {
			return ((ForEach13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof If11EditPart) {
			return ((If11EditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntil13EditPart) {
			return ((RepeatUntil13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Reply13EditPart) {
			return ((Reply13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Scope13EditPart) {
			return ((Scope13EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sequence9EditPart) {
			return ((Sequence9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While13EditPart) {
			return ((While13EditPart) sourceEditPart)
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
				MappingDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.MappingModelingAssistantProviderMessage);
		dialog.setTitle(Messages.MappingModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
