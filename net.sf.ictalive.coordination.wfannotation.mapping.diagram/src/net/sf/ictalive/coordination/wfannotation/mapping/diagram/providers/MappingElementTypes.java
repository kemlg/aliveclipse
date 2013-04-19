package net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramEditorPlugin;
import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.bpel.model.BPELPackage;
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
public class MappingElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private MappingElementTypes() {
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
	public static final IElementType MappingContainer_1000 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.MappingContainer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Process_2002 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Process_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicAction_2001 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.AtomicAction_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAction_2014 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompositeAction_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_2004 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_2005 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.AnyOrder_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_2006 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ControlConstructBag_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_2007 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Perform_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_2008 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Choice_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructList_2009 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ControlConstructList_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_2010 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_2011 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatWhile_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_2012 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.IfThenElse_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_2015 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Split_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_2016 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.SplitJoin_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3001 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3002 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3003 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3004 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3005 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3006 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3007 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3008 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3009 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3010 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3011 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3012 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3013 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3014 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3015 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3016 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3017 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3018 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3019 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3020 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3021 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3022 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3023 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3024 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3025 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3026 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3027 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3028 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3029 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3030 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3031 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3032 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3033 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3034 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3035 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnAlarm_3036 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OnAlarm_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3037 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3038 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3039 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3040 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3041 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3042 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3043 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3044 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3045 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3046 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3047 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3048 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnMessage_3049 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OnMessage_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3050 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3051 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3052 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3053 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3054 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3055 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3056 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3057 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3058 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3059 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3060 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3061 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3062 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3063 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3064 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3065 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3066 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3067 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3068 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3069 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3070 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3071 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3072 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3073 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3074 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3075 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3076 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3077 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3078 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3079 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3080 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3080"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3081 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3081"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3082 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3083 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3083"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3084 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3084"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3085 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3085"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3086 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3086"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3087 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3087"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3088 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3088"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3089 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3089"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3090 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3090"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3091 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3091"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3092 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3092"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3093 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3093"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3094 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3094"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3095 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3095"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3096 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3096"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3097 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3097"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3098 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3098"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3099 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3099"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3100 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3100"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3101 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3102 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3102"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3103 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3103"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3104 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3104"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3105 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3105"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3106 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3106"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3107 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3107"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3108 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3108"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3109 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3109"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3110 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3110"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3111 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3111"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3112 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3112"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventHandler_3113 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.EventHandler_3113"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnAlarm_3114 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OnAlarm_3114"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3115 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3115"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3116 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3116"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3117 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3117"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3118 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3118"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3119 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3119"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3120 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3120"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3121 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3121"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3122 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3122"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3123 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3123"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3124 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3124"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3125 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3125"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3126 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3126"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3127 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3127"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3128 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3128"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3129 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3129"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3130 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3130"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3131 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3131"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3132 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3132"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3133 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3133"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3134 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3134"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3135 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3135"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3136 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3136"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3137 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3137"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3138 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3138"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3139 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3139"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3140 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3140"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3141 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3141"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3142 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3142"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3143 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3143"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3144 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3144"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3145 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3145"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3146 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3146"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3147 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3147"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3148 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3148"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3149 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3149"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3150 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3150"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3151 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3151"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3152 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3152"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3153 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3153"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3154 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3154"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3155 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3155"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3156 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3156"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3157 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3157"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3158 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3158"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3159 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3159"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3160 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3160"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3161 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3161"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElseIf_3162 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ElseIf_3162"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3163 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3163"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3164 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3164"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3165 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3165"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3166 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3166"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3167 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3167"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3168 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3168"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3169 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3169"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3170 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3170"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3171 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3171"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Else_3172 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Else_3172"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3173 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3173"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3174 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3174"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3175 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3175"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3176 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3176"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3177 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3177"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3178 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3178"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3179 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3179"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3180 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3180"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3181 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3181"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3182 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3182"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3183 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3183"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3184 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3184"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3185 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3185"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3186 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3186"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3187 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3187"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3188 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3188"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3189 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3189"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3190 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3190"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3191 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3191"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3192 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3192"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3193 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3193"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3194 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3194"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3195 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3195"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3196 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3196"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3197 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3197"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3198 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3198"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3199 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3199"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3200 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3200"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3201 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3201"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3202 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3202"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3203 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3203"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3204 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3204"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3205 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3205"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3206 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3206"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3207 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3207"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3208 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3208"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3209 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3209"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3210 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3210"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3211 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3211"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3212 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3212"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3213 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3213"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3214 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3214"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3215 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3215"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3216 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3216"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3217 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3217"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3218 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3218"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3219 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3219"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3220 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3220"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3221 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3221"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3222 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3222"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3223 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3223"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3224 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3224"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3225 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3225"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3226 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3226"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3227 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3227"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3228 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3228"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3229 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3229"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3230 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3230"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3231 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3231"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3232 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3232"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3233 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3233"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3234 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3234"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3235 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3235"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3236 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3236"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3237 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3237"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3238 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3238"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnEvent_3239 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OnEvent_3239"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3240 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Assign_3240"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3241 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Compensate_3241"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3242 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompensateScope_3242"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3243 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Empty_3243"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3244 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Exit_3244"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3245 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ExtensionActivity_3245"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3246 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Flow_3246"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3247 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3247"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3248 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3248"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3249 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3249"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3250 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3250"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3251 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3251"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3252 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3252"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3253 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3253"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3254 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3254"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3255 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3255"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3256 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3256"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3257 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3257"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3258 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3258"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3259 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3259"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3260 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3260"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3261 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3261"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3262 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3262"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3263 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3263"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3264 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3264"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3265 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3265"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3266 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3266"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3267 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3267"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3268 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3268"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3269 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3269"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3270 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3270"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3271 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3271"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3272 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3272"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3273 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3273"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3274 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3274"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3275 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3275"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3276 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3276"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3277 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3277"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3278 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3278"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3279 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForEach_3279"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3280 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.If_3280"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3281 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Invoke_3281"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3282 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.OpaqueActivity_3282"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3283 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivity_3283"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3284 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Pick_3284"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3285 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Receive_3285"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3286 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntil_3286"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3287 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Reply_3287"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3288 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Rethrow_3288"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3289 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Scope_3289"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3290 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Sequence_3290"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3291 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Throw_3291"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3292 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Validate_3292"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3293 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.Wait_3293"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3294 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.While_3294"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventHandler_3295 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.EventHandler_3295"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivityToAtomicActionMapping_4001 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PartnerActivityToAtomicActionMapping_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessToCompositeActionMapping_4002 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ProcessToCompositeActionMapping_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceToSequenceMapping_4016 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.SequenceToSequenceMapping_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfToIfThenElseMapping_4017 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.IfToIfThenElseMapping_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WhileToRepeatWhileMapping_4018 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.WhileToRepeatWhileMapping_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntilToRepeatUntilMapping_4019 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntilToRepeatUntilMapping_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FlowToSplitJoinMapping_4020 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.FlowToSplitJoinMapping_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForToRepeatWhileMapping_4021 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ForToRepeatWhileMapping_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ScopeToCompositeActionMapping_4022 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ScopeToCompositeActionMapping_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElseIfToIfThenElseMapping_4023 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ElseIfToIfThenElseMapping_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElseToElseMapping_4024 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ElseToElseMapping_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeProcessComposedOf_4003 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.CompositeProcessComposedOf_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PerformProcess_4004 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.PerformProcess_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ChoiceComponents_4005 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ChoiceComponents_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrderComponents_4006 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.AnyOrderComponents_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceComponents_4007 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.SequenceComponents_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBagRest_4008 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ControlConstructBagRest_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructListRest_4009 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ControlConstructListRest_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElseThen_4010 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.IfThenElseThen_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElseElse_4011 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.IfThenElseElse_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntilUntilProcess_4012 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatUntilUntilProcess_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhileWhileProcess_4013 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.RepeatWhileWhileProcess_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBagFirst_4014 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ControlConstructBagFirst_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructListFirst_4015 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.ControlConstructListFirst_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitComponents_4025 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.SplitComponents_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoinComponents_4026 = getElementType("net.sf.ictalive.coordination.wfannotation.mapping.diagram.SplitJoinComponents_4026"); //$NON-NLS-1$

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
				return MappingDiagramEditorPlugin.getInstance()
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

			elements.put(MappingContainer_1000, MappingPackage.eINSTANCE
					.getMappingContainer());

			elements.put(Process_2002, BPELPackage.eINSTANCE.getProcess());

			elements.put(AtomicAction_2001, ActionsPackage.eINSTANCE
					.getAtomicAction());

			elements.put(CompositeAction_2014, ActionsPackage.eINSTANCE
					.getCompositeAction());

			elements.put(Sequence_2004, ProcessPackage.eINSTANCE.getSequence());

			elements.put(AnyOrder_2005, ProcessPackage.eINSTANCE.getAnyOrder());

			elements.put(ControlConstructBag_2006, ProcessPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(Perform_2007, ProcessPackage.eINSTANCE.getPerform());

			elements.put(Choice_2008, ProcessPackage.eINSTANCE.getChoice());

			elements.put(ControlConstructList_2009, ProcessPackage.eINSTANCE
					.getControlConstructList());

			elements.put(RepeatUntil_2010, ProcessPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatWhile_2011, ProcessPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(IfThenElse_2012, ProcessPackage.eINSTANCE
					.getIfThenElse());

			elements.put(Split_2015, ProcessPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_2016, ProcessPackage.eINSTANCE
					.getSplitJoin());

			elements.put(Assign_3001, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3002, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3003, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3004, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3005, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3006, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3007, BPELPackage.eINSTANCE.getFlow());

			elements.put(Assign_3008, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3009, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3010, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3011, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3012, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3013, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3014, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3015, BPELPackage.eINSTANCE.getForEach());

			elements.put(Assign_3016, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3017, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3018, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3019, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3020, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3021, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(ForEach_3022, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3023, BPELPackage.eINSTANCE.getIf());

			elements.put(Assign_3024, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3025, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3026, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3027, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3028, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3029, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(If_3030, BPELPackage.eINSTANCE.getIf());

			elements.put(ForEach_3031, BPELPackage.eINSTANCE.getForEach());

			elements.put(Invoke_3032, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3033, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3034, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3035, BPELPackage.eINSTANCE.getPick());

			elements.put(OnAlarm_3036, BPELPackage.eINSTANCE.getOnAlarm());

			elements.put(Assign_3037, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3038, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3039, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3040, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3041, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3042, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3043, BPELPackage.eINSTANCE.getFlow());

			elements.put(If_3044, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3045, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3046, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3047, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3048, BPELPackage.eINSTANCE.getPick());

			elements.put(OnMessage_3049, BPELPackage.eINSTANCE.getOnMessage());

			elements.put(Assign_3050, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3051, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3052, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3053, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3054, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3055, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3056, BPELPackage.eINSTANCE.getFlow());

			elements.put(Invoke_3057, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3058, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3059, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3060, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3061, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3062, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Assign_3063, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3064, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3065, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3066, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3067, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3068, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(RepeatUntil_3069, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(ForEach_3070, BPELPackage.eINSTANCE.getForEach());

			elements.put(Receive_3071, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3072, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Invoke_3073, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3074, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3075, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3076, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3077, BPELPackage.eINSTANCE.getReceive());

			elements.put(Reply_3078, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3079, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3080, BPELPackage.eINSTANCE.getScope());

			elements.put(Assign_3081, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3082, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3083, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3084, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3085, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3086, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Scope_3087, BPELPackage.eINSTANCE.getScope());

			elements.put(ForEach_3088, BPELPackage.eINSTANCE.getForEach());

			elements.put(Reply_3089, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3090, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3091, BPELPackage.eINSTANCE.getScope());

			elements.put(Invoke_3092, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3093, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3094, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3095, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3096, BPELPackage.eINSTANCE.getReceive());

			elements.put(Reply_3097, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3098, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Throw_3099, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3100, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3101, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3102, BPELPackage.eINSTANCE.getWhile());

			elements.put(Assign_3103, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3104, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3105, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3106, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3107, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3108, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3109, BPELPackage.eINSTANCE.getFlow());

			elements.put(Reply_3110, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3111, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3112, BPELPackage.eINSTANCE.getScope());

			elements.put(EventHandler_3113, BPELPackage.eINSTANCE
					.getEventHandler());

			elements.put(OnAlarm_3114, BPELPackage.eINSTANCE.getOnAlarm());

			elements.put(ForEach_3115, BPELPackage.eINSTANCE.getForEach());

			elements.put(Throw_3116, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3117, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3118, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3119, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3120, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3121, BPELPackage.eINSTANCE.getIf());

			elements.put(Receive_3122, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3123, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Throw_3124, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3125, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3126, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3127, BPELPackage.eINSTANCE.getWhile());

			elements.put(Invoke_3128, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3129, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3130, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3131, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3132, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3133, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3134, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3135, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3136, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3137, BPELPackage.eINSTANCE.getSequence());

			elements.put(Assign_3138, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3139, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3140, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3141, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3142, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3143, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3144, BPELPackage.eINSTANCE.getFlow());

			elements.put(Throw_3145, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3146, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3147, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3148, BPELPackage.eINSTANCE.getWhile());

			elements.put(Throw_3149, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3150, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3151, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3152, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3153, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3154, BPELPackage.eINSTANCE.getIf());

			elements.put(Reply_3155, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3156, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3157, BPELPackage.eINSTANCE.getScope());

			elements.put(Throw_3158, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3159, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3160, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3161, BPELPackage.eINSTANCE.getWhile());

			elements.put(ElseIf_3162, BPELPackage.eINSTANCE.getElseIf());

			elements.put(Assign_3163, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3164, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3165, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3166, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3167, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3168, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3169, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3170, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3171, BPELPackage.eINSTANCE.getIf());

			elements.put(Else_3172, BPELPackage.eINSTANCE.getElse());

			elements.put(Assign_3173, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3174, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3175, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3176, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3177, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3178, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3179, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3180, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3181, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3182, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3183, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3184, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3185, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3186, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3187, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3188, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3189, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3190, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3191, BPELPackage.eINSTANCE.getSequence());

			elements.put(Invoke_3192, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3193, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3194, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3195, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3196, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3197, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3198, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3199, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3200, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3201, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3202, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3203, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3204, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3205, BPELPackage.eINSTANCE.getWhile());

			elements.put(Throw_3206, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3207, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3208, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3209, BPELPackage.eINSTANCE.getWhile());

			elements.put(Invoke_3210, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3211, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3212, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3213, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3214, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3215, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3216, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3217, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3218, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3219, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3220, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3221, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3222, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3223, BPELPackage.eINSTANCE.getWhile());

			elements.put(If_3224, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3225, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3226, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3227, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3228, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3229, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3230, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3231, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3232, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3233, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3234, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3235, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3236, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3237, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3238, BPELPackage.eINSTANCE.getWhile());

			elements.put(OnEvent_3239, BPELPackage.eINSTANCE.getOnEvent());

			elements.put(Assign_3240, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3241, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3242, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3243, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3244, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3245, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3246, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3247, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3248, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3249, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3250, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3251, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3252, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3253, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3254, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3255, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3256, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3257, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3258, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3259, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3260, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3261, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3262, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3263, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3264, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3265, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3266, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3267, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3268, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3269, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3270, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3271, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3272, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3273, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3274, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3275, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3276, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3277, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3278, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3279, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3280, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3281, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3282, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3283, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3284, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3285, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3286, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3287, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3288, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3289, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3290, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3291, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3292, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3293, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3294, BPELPackage.eINSTANCE.getWhile());

			elements.put(EventHandler_3295, BPELPackage.eINSTANCE
					.getEventHandler());

			elements.put(PartnerActivityToAtomicActionMapping_4001,
					MappingPackage.eINSTANCE
							.getPartnerActivityToAtomicActionMapping());

			elements.put(ProcessToCompositeActionMapping_4002,
					MappingPackage.eINSTANCE
							.getProcessToCompositeActionMapping());

			elements.put(SequenceToSequenceMapping_4016,
					MappingPackage.eINSTANCE.getSequenceToSequenceMapping());

			elements.put(IfToIfThenElseMapping_4017, MappingPackage.eINSTANCE
					.getIfToIfThenElseMapping());

			elements.put(WhileToRepeatWhileMapping_4018,
					MappingPackage.eINSTANCE.getWhileToRepeatWhileMapping());

			elements.put(RepeatUntilToRepeatUntilMapping_4019,
					MappingPackage.eINSTANCE
							.getRepeatUntilToRepeatUntilMapping());

			elements.put(FlowToSplitJoinMapping_4020, MappingPackage.eINSTANCE
					.getFlowToSplitJoinMapping());

			elements.put(ForToRepeatWhileMapping_4021, MappingPackage.eINSTANCE
					.getForToRepeatWhileMapping());

			elements
					.put(ScopeToCompositeActionMapping_4022,
							MappingPackage.eINSTANCE
									.getScopeToCompositeActionMapping());

			elements.put(ElseIfToIfThenElseMapping_4023,
					MappingPackage.eINSTANCE.getElseIfToIfThenElseMapping());

			elements.put(ElseToElseMapping_4024, MappingPackage.eINSTANCE
					.getElseToElseMapping());

			elements.put(CompositeProcessComposedOf_4003,
					ProcessPackage.eINSTANCE.getCompositeProcess_ComposedOf());

			elements.put(PerformProcess_4004, ProcessPackage.eINSTANCE
					.getPerform_Process());

			elements.put(ChoiceComponents_4005, ProcessPackage.eINSTANCE
					.getChoice_Components());

			elements.put(AnyOrderComponents_4006, ProcessPackage.eINSTANCE
					.getAnyOrder_Components());

			elements.put(SequenceComponents_4007, ProcessPackage.eINSTANCE
					.getSequence_Components());

			elements.put(ControlConstructBagRest_4008, ProcessPackage.eINSTANCE
					.getControlConstructBag_Rest());

			elements.put(ControlConstructListRest_4009,
					ProcessPackage.eINSTANCE.getControlConstructList_Rest());

			elements.put(IfThenElseThen_4010, ProcessPackage.eINSTANCE
					.getIfThenElse_Then());

			elements.put(IfThenElseElse_4011, ProcessPackage.eINSTANCE
					.getIfThenElse_Else());

			elements.put(RepeatUntilUntilProcess_4012, ProcessPackage.eINSTANCE
					.getRepeatUntil_UntilProcess());

			elements.put(RepeatWhileWhileProcess_4013, ProcessPackage.eINSTANCE
					.getRepeatWhile_WhileProcess());

			elements.put(ControlConstructBagFirst_4014,
					ProcessPackage.eINSTANCE.getControlConstructBag_First());

			elements.put(ControlConstructListFirst_4015,
					ProcessPackage.eINSTANCE.getControlConstructList_First());

			elements.put(SplitComponents_4025, ProcessPackage.eINSTANCE
					.getSplit_Components());

			elements.put(SplitJoinComponents_4026, ProcessPackage.eINSTANCE
					.getSplitJoin_Components());
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
			KNOWN_ELEMENT_TYPES.add(MappingContainer_1000);
			KNOWN_ELEMENT_TYPES.add(Process_2002);
			KNOWN_ELEMENT_TYPES.add(AtomicAction_2001);
			KNOWN_ELEMENT_TYPES.add(CompositeAction_2014);
			KNOWN_ELEMENT_TYPES.add(Sequence_2004);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_2005);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_2006);
			KNOWN_ELEMENT_TYPES.add(Perform_2007);
			KNOWN_ELEMENT_TYPES.add(Choice_2008);
			KNOWN_ELEMENT_TYPES.add(ControlConstructList_2009);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_2010);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_2011);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_2012);
			KNOWN_ELEMENT_TYPES.add(Split_2015);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_2016);
			KNOWN_ELEMENT_TYPES.add(Assign_3001);
			KNOWN_ELEMENT_TYPES.add(Compensate_3002);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3003);
			KNOWN_ELEMENT_TYPES.add(Empty_3004);
			KNOWN_ELEMENT_TYPES.add(Exit_3005);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3006);
			KNOWN_ELEMENT_TYPES.add(Flow_3007);
			KNOWN_ELEMENT_TYPES.add(Assign_3008);
			KNOWN_ELEMENT_TYPES.add(Compensate_3009);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3010);
			KNOWN_ELEMENT_TYPES.add(Empty_3011);
			KNOWN_ELEMENT_TYPES.add(Exit_3012);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3013);
			KNOWN_ELEMENT_TYPES.add(Flow_3014);
			KNOWN_ELEMENT_TYPES.add(ForEach_3015);
			KNOWN_ELEMENT_TYPES.add(Assign_3016);
			KNOWN_ELEMENT_TYPES.add(Compensate_3017);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3018);
			KNOWN_ELEMENT_TYPES.add(Empty_3019);
			KNOWN_ELEMENT_TYPES.add(Exit_3020);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3021);
			KNOWN_ELEMENT_TYPES.add(ForEach_3022);
			KNOWN_ELEMENT_TYPES.add(If_3023);
			KNOWN_ELEMENT_TYPES.add(Assign_3024);
			KNOWN_ELEMENT_TYPES.add(Compensate_3025);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3026);
			KNOWN_ELEMENT_TYPES.add(Empty_3027);
			KNOWN_ELEMENT_TYPES.add(Exit_3028);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3029);
			KNOWN_ELEMENT_TYPES.add(If_3030);
			KNOWN_ELEMENT_TYPES.add(ForEach_3031);
			KNOWN_ELEMENT_TYPES.add(Invoke_3032);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3033);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3034);
			KNOWN_ELEMENT_TYPES.add(Pick_3035);
			KNOWN_ELEMENT_TYPES.add(OnAlarm_3036);
			KNOWN_ELEMENT_TYPES.add(Assign_3037);
			KNOWN_ELEMENT_TYPES.add(Compensate_3038);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3039);
			KNOWN_ELEMENT_TYPES.add(Empty_3040);
			KNOWN_ELEMENT_TYPES.add(Exit_3041);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3042);
			KNOWN_ELEMENT_TYPES.add(Flow_3043);
			KNOWN_ELEMENT_TYPES.add(If_3044);
			KNOWN_ELEMENT_TYPES.add(Invoke_3045);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3046);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3047);
			KNOWN_ELEMENT_TYPES.add(Pick_3048);
			KNOWN_ELEMENT_TYPES.add(OnMessage_3049);
			KNOWN_ELEMENT_TYPES.add(Assign_3050);
			KNOWN_ELEMENT_TYPES.add(Compensate_3051);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3052);
			KNOWN_ELEMENT_TYPES.add(Empty_3053);
			KNOWN_ELEMENT_TYPES.add(Exit_3054);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3055);
			KNOWN_ELEMENT_TYPES.add(Flow_3056);
			KNOWN_ELEMENT_TYPES.add(Invoke_3057);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3058);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3059);
			KNOWN_ELEMENT_TYPES.add(Pick_3060);
			KNOWN_ELEMENT_TYPES.add(Receive_3061);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3062);
			KNOWN_ELEMENT_TYPES.add(Assign_3063);
			KNOWN_ELEMENT_TYPES.add(Compensate_3064);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3065);
			KNOWN_ELEMENT_TYPES.add(Empty_3066);
			KNOWN_ELEMENT_TYPES.add(Exit_3067);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3068);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3069);
			KNOWN_ELEMENT_TYPES.add(ForEach_3070);
			KNOWN_ELEMENT_TYPES.add(Receive_3071);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3072);
			KNOWN_ELEMENT_TYPES.add(Invoke_3073);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3074);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3075);
			KNOWN_ELEMENT_TYPES.add(Pick_3076);
			KNOWN_ELEMENT_TYPES.add(Receive_3077);
			KNOWN_ELEMENT_TYPES.add(Reply_3078);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3079);
			KNOWN_ELEMENT_TYPES.add(Scope_3080);
			KNOWN_ELEMENT_TYPES.add(Assign_3081);
			KNOWN_ELEMENT_TYPES.add(Compensate_3082);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3083);
			KNOWN_ELEMENT_TYPES.add(Empty_3084);
			KNOWN_ELEMENT_TYPES.add(Exit_3085);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3086);
			KNOWN_ELEMENT_TYPES.add(Scope_3087);
			KNOWN_ELEMENT_TYPES.add(ForEach_3088);
			KNOWN_ELEMENT_TYPES.add(Reply_3089);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3090);
			KNOWN_ELEMENT_TYPES.add(Scope_3091);
			KNOWN_ELEMENT_TYPES.add(Invoke_3092);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3093);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3094);
			KNOWN_ELEMENT_TYPES.add(Pick_3095);
			KNOWN_ELEMENT_TYPES.add(Receive_3096);
			KNOWN_ELEMENT_TYPES.add(Reply_3097);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3098);
			KNOWN_ELEMENT_TYPES.add(Throw_3099);
			KNOWN_ELEMENT_TYPES.add(Validate_3100);
			KNOWN_ELEMENT_TYPES.add(Wait_3101);
			KNOWN_ELEMENT_TYPES.add(While_3102);
			KNOWN_ELEMENT_TYPES.add(Assign_3103);
			KNOWN_ELEMENT_TYPES.add(Compensate_3104);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3105);
			KNOWN_ELEMENT_TYPES.add(Empty_3106);
			KNOWN_ELEMENT_TYPES.add(Exit_3107);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3108);
			KNOWN_ELEMENT_TYPES.add(Flow_3109);
			KNOWN_ELEMENT_TYPES.add(Reply_3110);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3111);
			KNOWN_ELEMENT_TYPES.add(Scope_3112);
			KNOWN_ELEMENT_TYPES.add(EventHandler_3113);
			KNOWN_ELEMENT_TYPES.add(OnAlarm_3114);
			KNOWN_ELEMENT_TYPES.add(ForEach_3115);
			KNOWN_ELEMENT_TYPES.add(Throw_3116);
			KNOWN_ELEMENT_TYPES.add(Validate_3117);
			KNOWN_ELEMENT_TYPES.add(Wait_3118);
			KNOWN_ELEMENT_TYPES.add(While_3119);
			KNOWN_ELEMENT_TYPES.add(ForEach_3120);
			KNOWN_ELEMENT_TYPES.add(If_3121);
			KNOWN_ELEMENT_TYPES.add(Receive_3122);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3123);
			KNOWN_ELEMENT_TYPES.add(Throw_3124);
			KNOWN_ELEMENT_TYPES.add(Validate_3125);
			KNOWN_ELEMENT_TYPES.add(Wait_3126);
			KNOWN_ELEMENT_TYPES.add(While_3127);
			KNOWN_ELEMENT_TYPES.add(Invoke_3128);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3129);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3130);
			KNOWN_ELEMENT_TYPES.add(Pick_3131);
			KNOWN_ELEMENT_TYPES.add(Receive_3132);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3133);
			KNOWN_ELEMENT_TYPES.add(Reply_3134);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3135);
			KNOWN_ELEMENT_TYPES.add(Scope_3136);
			KNOWN_ELEMENT_TYPES.add(Sequence_3137);
			KNOWN_ELEMENT_TYPES.add(Assign_3138);
			KNOWN_ELEMENT_TYPES.add(Compensate_3139);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3140);
			KNOWN_ELEMENT_TYPES.add(Empty_3141);
			KNOWN_ELEMENT_TYPES.add(Exit_3142);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3143);
			KNOWN_ELEMENT_TYPES.add(Flow_3144);
			KNOWN_ELEMENT_TYPES.add(Throw_3145);
			KNOWN_ELEMENT_TYPES.add(Validate_3146);
			KNOWN_ELEMENT_TYPES.add(Wait_3147);
			KNOWN_ELEMENT_TYPES.add(While_3148);
			KNOWN_ELEMENT_TYPES.add(Throw_3149);
			KNOWN_ELEMENT_TYPES.add(Validate_3150);
			KNOWN_ELEMENT_TYPES.add(Wait_3151);
			KNOWN_ELEMENT_TYPES.add(While_3152);
			KNOWN_ELEMENT_TYPES.add(ForEach_3153);
			KNOWN_ELEMENT_TYPES.add(If_3154);
			KNOWN_ELEMENT_TYPES.add(Reply_3155);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3156);
			KNOWN_ELEMENT_TYPES.add(Scope_3157);
			KNOWN_ELEMENT_TYPES.add(Throw_3158);
			KNOWN_ELEMENT_TYPES.add(Validate_3159);
			KNOWN_ELEMENT_TYPES.add(Wait_3160);
			KNOWN_ELEMENT_TYPES.add(While_3161);
			KNOWN_ELEMENT_TYPES.add(ElseIf_3162);
			KNOWN_ELEMENT_TYPES.add(Assign_3163);
			KNOWN_ELEMENT_TYPES.add(Compensate_3164);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3165);
			KNOWN_ELEMENT_TYPES.add(Empty_3166);
			KNOWN_ELEMENT_TYPES.add(Exit_3167);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3168);
			KNOWN_ELEMENT_TYPES.add(Flow_3169);
			KNOWN_ELEMENT_TYPES.add(ForEach_3170);
			KNOWN_ELEMENT_TYPES.add(If_3171);
			KNOWN_ELEMENT_TYPES.add(Else_3172);
			KNOWN_ELEMENT_TYPES.add(Assign_3173);
			KNOWN_ELEMENT_TYPES.add(Compensate_3174);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3175);
			KNOWN_ELEMENT_TYPES.add(Empty_3176);
			KNOWN_ELEMENT_TYPES.add(Exit_3177);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3178);
			KNOWN_ELEMENT_TYPES.add(Flow_3179);
			KNOWN_ELEMENT_TYPES.add(ForEach_3180);
			KNOWN_ELEMENT_TYPES.add(If_3181);
			KNOWN_ELEMENT_TYPES.add(Invoke_3182);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3183);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3184);
			KNOWN_ELEMENT_TYPES.add(Pick_3185);
			KNOWN_ELEMENT_TYPES.add(Receive_3186);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3187);
			KNOWN_ELEMENT_TYPES.add(Reply_3188);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3189);
			KNOWN_ELEMENT_TYPES.add(Scope_3190);
			KNOWN_ELEMENT_TYPES.add(Sequence_3191);
			KNOWN_ELEMENT_TYPES.add(Invoke_3192);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3193);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3194);
			KNOWN_ELEMENT_TYPES.add(Pick_3195);
			KNOWN_ELEMENT_TYPES.add(Receive_3196);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3197);
			KNOWN_ELEMENT_TYPES.add(Reply_3198);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3199);
			KNOWN_ELEMENT_TYPES.add(Scope_3200);
			KNOWN_ELEMENT_TYPES.add(Sequence_3201);
			KNOWN_ELEMENT_TYPES.add(Throw_3202);
			KNOWN_ELEMENT_TYPES.add(Validate_3203);
			KNOWN_ELEMENT_TYPES.add(Wait_3204);
			KNOWN_ELEMENT_TYPES.add(While_3205);
			KNOWN_ELEMENT_TYPES.add(Throw_3206);
			KNOWN_ELEMENT_TYPES.add(Validate_3207);
			KNOWN_ELEMENT_TYPES.add(Wait_3208);
			KNOWN_ELEMENT_TYPES.add(While_3209);
			KNOWN_ELEMENT_TYPES.add(Invoke_3210);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3211);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3212);
			KNOWN_ELEMENT_TYPES.add(Pick_3213);
			KNOWN_ELEMENT_TYPES.add(Receive_3214);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3215);
			KNOWN_ELEMENT_TYPES.add(Reply_3216);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3217);
			KNOWN_ELEMENT_TYPES.add(Scope_3218);
			KNOWN_ELEMENT_TYPES.add(Sequence_3219);
			KNOWN_ELEMENT_TYPES.add(Throw_3220);
			KNOWN_ELEMENT_TYPES.add(Validate_3221);
			KNOWN_ELEMENT_TYPES.add(Wait_3222);
			KNOWN_ELEMENT_TYPES.add(While_3223);
			KNOWN_ELEMENT_TYPES.add(If_3224);
			KNOWN_ELEMENT_TYPES.add(Invoke_3225);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3226);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3227);
			KNOWN_ELEMENT_TYPES.add(Pick_3228);
			KNOWN_ELEMENT_TYPES.add(Receive_3229);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3230);
			KNOWN_ELEMENT_TYPES.add(Reply_3231);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3232);
			KNOWN_ELEMENT_TYPES.add(Scope_3233);
			KNOWN_ELEMENT_TYPES.add(Sequence_3234);
			KNOWN_ELEMENT_TYPES.add(Throw_3235);
			KNOWN_ELEMENT_TYPES.add(Validate_3236);
			KNOWN_ELEMENT_TYPES.add(Wait_3237);
			KNOWN_ELEMENT_TYPES.add(While_3238);
			KNOWN_ELEMENT_TYPES.add(OnEvent_3239);
			KNOWN_ELEMENT_TYPES.add(Assign_3240);
			KNOWN_ELEMENT_TYPES.add(Compensate_3241);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3242);
			KNOWN_ELEMENT_TYPES.add(Empty_3243);
			KNOWN_ELEMENT_TYPES.add(Exit_3244);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3245);
			KNOWN_ELEMENT_TYPES.add(Flow_3246);
			KNOWN_ELEMENT_TYPES.add(ForEach_3247);
			KNOWN_ELEMENT_TYPES.add(If_3248);
			KNOWN_ELEMENT_TYPES.add(Invoke_3249);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3250);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3251);
			KNOWN_ELEMENT_TYPES.add(Pick_3252);
			KNOWN_ELEMENT_TYPES.add(Receive_3253);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3254);
			KNOWN_ELEMENT_TYPES.add(Reply_3255);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3256);
			KNOWN_ELEMENT_TYPES.add(Scope_3257);
			KNOWN_ELEMENT_TYPES.add(Sequence_3258);
			KNOWN_ELEMENT_TYPES.add(Throw_3259);
			KNOWN_ELEMENT_TYPES.add(Validate_3260);
			KNOWN_ELEMENT_TYPES.add(Wait_3261);
			KNOWN_ELEMENT_TYPES.add(While_3262);
			KNOWN_ELEMENT_TYPES.add(ForEach_3263);
			KNOWN_ELEMENT_TYPES.add(If_3264);
			KNOWN_ELEMENT_TYPES.add(Invoke_3265);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3266);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3267);
			KNOWN_ELEMENT_TYPES.add(Pick_3268);
			KNOWN_ELEMENT_TYPES.add(Receive_3269);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3270);
			KNOWN_ELEMENT_TYPES.add(Reply_3271);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3272);
			KNOWN_ELEMENT_TYPES.add(Scope_3273);
			KNOWN_ELEMENT_TYPES.add(Sequence_3274);
			KNOWN_ELEMENT_TYPES.add(Throw_3275);
			KNOWN_ELEMENT_TYPES.add(Validate_3276);
			KNOWN_ELEMENT_TYPES.add(Wait_3277);
			KNOWN_ELEMENT_TYPES.add(While_3278);
			KNOWN_ELEMENT_TYPES.add(ForEach_3279);
			KNOWN_ELEMENT_TYPES.add(If_3280);
			KNOWN_ELEMENT_TYPES.add(Invoke_3281);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3282);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3283);
			KNOWN_ELEMENT_TYPES.add(Pick_3284);
			KNOWN_ELEMENT_TYPES.add(Receive_3285);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3286);
			KNOWN_ELEMENT_TYPES.add(Reply_3287);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3288);
			KNOWN_ELEMENT_TYPES.add(Scope_3289);
			KNOWN_ELEMENT_TYPES.add(Sequence_3290);
			KNOWN_ELEMENT_TYPES.add(Throw_3291);
			KNOWN_ELEMENT_TYPES.add(Validate_3292);
			KNOWN_ELEMENT_TYPES.add(Wait_3293);
			KNOWN_ELEMENT_TYPES.add(While_3294);
			KNOWN_ELEMENT_TYPES.add(EventHandler_3295);
			KNOWN_ELEMENT_TYPES.add(PartnerActivityToAtomicActionMapping_4001);
			KNOWN_ELEMENT_TYPES.add(ProcessToCompositeActionMapping_4002);
			KNOWN_ELEMENT_TYPES.add(SequenceToSequenceMapping_4016);
			KNOWN_ELEMENT_TYPES.add(IfToIfThenElseMapping_4017);
			KNOWN_ELEMENT_TYPES.add(WhileToRepeatWhileMapping_4018);
			KNOWN_ELEMENT_TYPES.add(RepeatUntilToRepeatUntilMapping_4019);
			KNOWN_ELEMENT_TYPES.add(FlowToSplitJoinMapping_4020);
			KNOWN_ELEMENT_TYPES.add(ForToRepeatWhileMapping_4021);
			KNOWN_ELEMENT_TYPES.add(ScopeToCompositeActionMapping_4022);
			KNOWN_ELEMENT_TYPES.add(ElseIfToIfThenElseMapping_4023);
			KNOWN_ELEMENT_TYPES.add(ElseToElseMapping_4024);
			KNOWN_ELEMENT_TYPES.add(CompositeProcessComposedOf_4003);
			KNOWN_ELEMENT_TYPES.add(PerformProcess_4004);
			KNOWN_ELEMENT_TYPES.add(ChoiceComponents_4005);
			KNOWN_ELEMENT_TYPES.add(AnyOrderComponents_4006);
			KNOWN_ELEMENT_TYPES.add(SequenceComponents_4007);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBagRest_4008);
			KNOWN_ELEMENT_TYPES.add(ControlConstructListRest_4009);
			KNOWN_ELEMENT_TYPES.add(IfThenElseThen_4010);
			KNOWN_ELEMENT_TYPES.add(IfThenElseElse_4011);
			KNOWN_ELEMENT_TYPES.add(RepeatUntilUntilProcess_4012);
			KNOWN_ELEMENT_TYPES.add(RepeatWhileWhileProcess_4013);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBagFirst_4014);
			KNOWN_ELEMENT_TYPES.add(ControlConstructListFirst_4015);
			KNOWN_ELEMENT_TYPES.add(SplitComponents_4025);
			KNOWN_ELEMENT_TYPES.add(SplitJoinComponents_4026);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MappingContainerEditPart.VISUAL_ID:
			return MappingContainer_1000;
		case ProcessEditPart.VISUAL_ID:
			return Process_2002;
		case AtomicActionEditPart.VISUAL_ID:
			return AtomicAction_2001;
		case CompositeActionEditPart.VISUAL_ID:
			return CompositeAction_2014;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_2004;
		case AnyOrderEditPart.VISUAL_ID:
			return AnyOrder_2005;
		case ControlConstructBagEditPart.VISUAL_ID:
			return ControlConstructBag_2006;
		case PerformEditPart.VISUAL_ID:
			return Perform_2007;
		case ChoiceEditPart.VISUAL_ID:
			return Choice_2008;
		case ControlConstructListEditPart.VISUAL_ID:
			return ControlConstructList_2009;
		case RepeatUntilEditPart.VISUAL_ID:
			return RepeatUntil_2010;
		case RepeatWhileEditPart.VISUAL_ID:
			return RepeatWhile_2011;
		case IfThenElseEditPart.VISUAL_ID:
			return IfThenElse_2012;
		case SplitEditPart.VISUAL_ID:
			return Split_2015;
		case SplitJoinEditPart.VISUAL_ID:
			return SplitJoin_2016;
		case AssignEditPart.VISUAL_ID:
			return Assign_3001;
		case CompensateEditPart.VISUAL_ID:
			return Compensate_3002;
		case CompensateScopeEditPart.VISUAL_ID:
			return CompensateScope_3003;
		case EmptyEditPart.VISUAL_ID:
			return Empty_3004;
		case ExitEditPart.VISUAL_ID:
			return Exit_3005;
		case ExtensionActivityEditPart.VISUAL_ID:
			return ExtensionActivity_3006;
		case FlowEditPart.VISUAL_ID:
			return Flow_3007;
		case Assign2EditPart.VISUAL_ID:
			return Assign_3008;
		case Compensate2EditPart.VISUAL_ID:
			return Compensate_3009;
		case CompensateScope2EditPart.VISUAL_ID:
			return CompensateScope_3010;
		case Empty2EditPart.VISUAL_ID:
			return Empty_3011;
		case Exit2EditPart.VISUAL_ID:
			return Exit_3012;
		case ExtensionActivity2EditPart.VISUAL_ID:
			return ExtensionActivity_3013;
		case Flow2EditPart.VISUAL_ID:
			return Flow_3014;
		case ForEachEditPart.VISUAL_ID:
			return ForEach_3015;
		case Assign3EditPart.VISUAL_ID:
			return Assign_3016;
		case Compensate3EditPart.VISUAL_ID:
			return Compensate_3017;
		case CompensateScope3EditPart.VISUAL_ID:
			return CompensateScope_3018;
		case Empty3EditPart.VISUAL_ID:
			return Empty_3019;
		case Exit3EditPart.VISUAL_ID:
			return Exit_3020;
		case ExtensionActivity3EditPart.VISUAL_ID:
			return ExtensionActivity_3021;
		case ForEach2EditPart.VISUAL_ID:
			return ForEach_3022;
		case IfEditPart.VISUAL_ID:
			return If_3023;
		case Assign4EditPart.VISUAL_ID:
			return Assign_3024;
		case Compensate4EditPart.VISUAL_ID:
			return Compensate_3025;
		case CompensateScope4EditPart.VISUAL_ID:
			return CompensateScope_3026;
		case Empty4EditPart.VISUAL_ID:
			return Empty_3027;
		case Exit4EditPart.VISUAL_ID:
			return Exit_3028;
		case ExtensionActivity4EditPart.VISUAL_ID:
			return ExtensionActivity_3029;
		case If2EditPart.VISUAL_ID:
			return If_3030;
		case ForEach3EditPart.VISUAL_ID:
			return ForEach_3031;
		case InvokeEditPart.VISUAL_ID:
			return Invoke_3032;
		case OpaqueActivityEditPart.VISUAL_ID:
			return OpaqueActivity_3033;
		case PartnerActivityEditPart.VISUAL_ID:
			return PartnerActivity_3034;
		case PickEditPart.VISUAL_ID:
			return Pick_3035;
		case OnAlarmEditPart.VISUAL_ID:
			return OnAlarm_3036;
		case Assign5EditPart.VISUAL_ID:
			return Assign_3037;
		case Compensate5EditPart.VISUAL_ID:
			return Compensate_3038;
		case CompensateScope5EditPart.VISUAL_ID:
			return CompensateScope_3039;
		case Empty5EditPart.VISUAL_ID:
			return Empty_3040;
		case Exit5EditPart.VISUAL_ID:
			return Exit_3041;
		case ExtensionActivity5EditPart.VISUAL_ID:
			return ExtensionActivity_3042;
		case Flow3EditPart.VISUAL_ID:
			return Flow_3043;
		case If3EditPart.VISUAL_ID:
			return If_3044;
		case Invoke2EditPart.VISUAL_ID:
			return Invoke_3045;
		case OpaqueActivity2EditPart.VISUAL_ID:
			return OpaqueActivity_3046;
		case PartnerActivity2EditPart.VISUAL_ID:
			return PartnerActivity_3047;
		case Pick2EditPart.VISUAL_ID:
			return Pick_3048;
		case OnMessageEditPart.VISUAL_ID:
			return OnMessage_3049;
		case Assign6EditPart.VISUAL_ID:
			return Assign_3050;
		case Compensate6EditPart.VISUAL_ID:
			return Compensate_3051;
		case CompensateScope6EditPart.VISUAL_ID:
			return CompensateScope_3052;
		case Empty6EditPart.VISUAL_ID:
			return Empty_3053;
		case Exit6EditPart.VISUAL_ID:
			return Exit_3054;
		case ExtensionActivity6EditPart.VISUAL_ID:
			return ExtensionActivity_3055;
		case Flow4EditPart.VISUAL_ID:
			return Flow_3056;
		case Invoke3EditPart.VISUAL_ID:
			return Invoke_3057;
		case OpaqueActivity3EditPart.VISUAL_ID:
			return OpaqueActivity_3058;
		case PartnerActivity3EditPart.VISUAL_ID:
			return PartnerActivity_3059;
		case Pick3EditPart.VISUAL_ID:
			return Pick_3060;
		case ReceiveEditPart.VISUAL_ID:
			return Receive_3061;
		case RepeatUntil2EditPart.VISUAL_ID:
			return RepeatUntil_3062;
		case Assign7EditPart.VISUAL_ID:
			return Assign_3063;
		case Compensate7EditPart.VISUAL_ID:
			return Compensate_3064;
		case CompensateScope7EditPart.VISUAL_ID:
			return CompensateScope_3065;
		case Empty7EditPart.VISUAL_ID:
			return Empty_3066;
		case Exit7EditPart.VISUAL_ID:
			return Exit_3067;
		case ExtensionActivity7EditPart.VISUAL_ID:
			return ExtensionActivity_3068;
		case RepeatUntil3EditPart.VISUAL_ID:
			return RepeatUntil_3069;
		case ForEach4EditPart.VISUAL_ID:
			return ForEach_3070;
		case Receive2EditPart.VISUAL_ID:
			return Receive_3071;
		case RepeatUntil4EditPart.VISUAL_ID:
			return RepeatUntil_3072;
		case Invoke4EditPart.VISUAL_ID:
			return Invoke_3073;
		case OpaqueActivity4EditPart.VISUAL_ID:
			return OpaqueActivity_3074;
		case PartnerActivity4EditPart.VISUAL_ID:
			return PartnerActivity_3075;
		case Pick4EditPart.VISUAL_ID:
			return Pick_3076;
		case Receive3EditPart.VISUAL_ID:
			return Receive_3077;
		case ReplyEditPart.VISUAL_ID:
			return Reply_3078;
		case RethrowEditPart.VISUAL_ID:
			return Rethrow_3079;
		case ScopeEditPart.VISUAL_ID:
			return Scope_3080;
		case Assign8EditPart.VISUAL_ID:
			return Assign_3081;
		case Compensate8EditPart.VISUAL_ID:
			return Compensate_3082;
		case CompensateScope8EditPart.VISUAL_ID:
			return CompensateScope_3083;
		case Empty8EditPart.VISUAL_ID:
			return Empty_3084;
		case Exit8EditPart.VISUAL_ID:
			return Exit_3085;
		case ExtensionActivity8EditPart.VISUAL_ID:
			return ExtensionActivity_3086;
		case Scope2EditPart.VISUAL_ID:
			return Scope_3087;
		case ForEach5EditPart.VISUAL_ID:
			return ForEach_3088;
		case Reply2EditPart.VISUAL_ID:
			return Reply_3089;
		case Rethrow2EditPart.VISUAL_ID:
			return Rethrow_3090;
		case Scope3EditPart.VISUAL_ID:
			return Scope_3091;
		case Invoke5EditPart.VISUAL_ID:
			return Invoke_3092;
		case OpaqueActivity5EditPart.VISUAL_ID:
			return OpaqueActivity_3093;
		case PartnerActivity5EditPart.VISUAL_ID:
			return PartnerActivity_3094;
		case Pick5EditPart.VISUAL_ID:
			return Pick_3095;
		case Receive4EditPart.VISUAL_ID:
			return Receive_3096;
		case Reply3EditPart.VISUAL_ID:
			return Reply_3097;
		case Rethrow3EditPart.VISUAL_ID:
			return Rethrow_3098;
		case ThrowEditPart.VISUAL_ID:
			return Throw_3099;
		case ValidateEditPart.VISUAL_ID:
			return Validate_3100;
		case WaitEditPart.VISUAL_ID:
			return Wait_3101;
		case WhileEditPart.VISUAL_ID:
			return While_3102;
		case Assign9EditPart.VISUAL_ID:
			return Assign_3103;
		case Compensate9EditPart.VISUAL_ID:
			return Compensate_3104;
		case CompensateScope9EditPart.VISUAL_ID:
			return CompensateScope_3105;
		case Empty9EditPart.VISUAL_ID:
			return Empty_3106;
		case Exit9EditPart.VISUAL_ID:
			return Exit_3107;
		case ExtensionActivity9EditPart.VISUAL_ID:
			return ExtensionActivity_3108;
		case Flow5EditPart.VISUAL_ID:
			return Flow_3109;
		case Reply4EditPart.VISUAL_ID:
			return Reply_3110;
		case Rethrow4EditPart.VISUAL_ID:
			return Rethrow_3111;
		case Scope4EditPart.VISUAL_ID:
			return Scope_3112;
		case EventHandlerEditPart.VISUAL_ID:
			return EventHandler_3113;
		case OnAlarm2EditPart.VISUAL_ID:
			return OnAlarm_3114;
		case ForEach6EditPart.VISUAL_ID:
			return ForEach_3115;
		case Throw2EditPart.VISUAL_ID:
			return Throw_3116;
		case Validate2EditPart.VISUAL_ID:
			return Validate_3117;
		case Wait2EditPart.VISUAL_ID:
			return Wait_3118;
		case While2EditPart.VISUAL_ID:
			return While_3119;
		case ForEach7EditPart.VISUAL_ID:
			return ForEach_3120;
		case If4EditPart.VISUAL_ID:
			return If_3121;
		case Receive5EditPart.VISUAL_ID:
			return Receive_3122;
		case RepeatUntil5EditPart.VISUAL_ID:
			return RepeatUntil_3123;
		case Throw3EditPart.VISUAL_ID:
			return Throw_3124;
		case Validate3EditPart.VISUAL_ID:
			return Validate_3125;
		case Wait3EditPart.VISUAL_ID:
			return Wait_3126;
		case While3EditPart.VISUAL_ID:
			return While_3127;
		case Invoke6EditPart.VISUAL_ID:
			return Invoke_3128;
		case OpaqueActivity6EditPart.VISUAL_ID:
			return OpaqueActivity_3129;
		case PartnerActivity6EditPart.VISUAL_ID:
			return PartnerActivity_3130;
		case Pick6EditPart.VISUAL_ID:
			return Pick_3131;
		case Receive6EditPart.VISUAL_ID:
			return Receive_3132;
		case RepeatUntil6EditPart.VISUAL_ID:
			return RepeatUntil_3133;
		case Reply5EditPart.VISUAL_ID:
			return Reply_3134;
		case Rethrow5EditPart.VISUAL_ID:
			return Rethrow_3135;
		case Scope5EditPart.VISUAL_ID:
			return Scope_3136;
		case Sequence2EditPart.VISUAL_ID:
			return Sequence_3137;
		case Assign10EditPart.VISUAL_ID:
			return Assign_3138;
		case Compensate10EditPart.VISUAL_ID:
			return Compensate_3139;
		case CompensateScope10EditPart.VISUAL_ID:
			return CompensateScope_3140;
		case Empty10EditPart.VISUAL_ID:
			return Empty_3141;
		case Exit10EditPart.VISUAL_ID:
			return Exit_3142;
		case ExtensionActivity10EditPart.VISUAL_ID:
			return ExtensionActivity_3143;
		case Flow6EditPart.VISUAL_ID:
			return Flow_3144;
		case Throw4EditPart.VISUAL_ID:
			return Throw_3145;
		case Validate4EditPart.VISUAL_ID:
			return Validate_3146;
		case Wait4EditPart.VISUAL_ID:
			return Wait_3147;
		case While4EditPart.VISUAL_ID:
			return While_3148;
		case Throw5EditPart.VISUAL_ID:
			return Throw_3149;
		case Validate5EditPart.VISUAL_ID:
			return Validate_3150;
		case Wait5EditPart.VISUAL_ID:
			return Wait_3151;
		case While5EditPart.VISUAL_ID:
			return While_3152;
		case ForEach8EditPart.VISUAL_ID:
			return ForEach_3153;
		case If5EditPart.VISUAL_ID:
			return If_3154;
		case Reply6EditPart.VISUAL_ID:
			return Reply_3155;
		case Rethrow6EditPart.VISUAL_ID:
			return Rethrow_3156;
		case Scope6EditPart.VISUAL_ID:
			return Scope_3157;
		case Throw6EditPart.VISUAL_ID:
			return Throw_3158;
		case Validate6EditPart.VISUAL_ID:
			return Validate_3159;
		case Wait6EditPart.VISUAL_ID:
			return Wait_3160;
		case While6EditPart.VISUAL_ID:
			return While_3161;
		case ElseIfEditPart.VISUAL_ID:
			return ElseIf_3162;
		case Assign11EditPart.VISUAL_ID:
			return Assign_3163;
		case Compensate11EditPart.VISUAL_ID:
			return Compensate_3164;
		case CompensateScope11EditPart.VISUAL_ID:
			return CompensateScope_3165;
		case Empty11EditPart.VISUAL_ID:
			return Empty_3166;
		case Exit11EditPart.VISUAL_ID:
			return Exit_3167;
		case ExtensionActivity11EditPart.VISUAL_ID:
			return ExtensionActivity_3168;
		case Flow7EditPart.VISUAL_ID:
			return Flow_3169;
		case ForEach9EditPart.VISUAL_ID:
			return ForEach_3170;
		case If6EditPart.VISUAL_ID:
			return If_3171;
		case ElseEditPart.VISUAL_ID:
			return Else_3172;
		case Assign12EditPart.VISUAL_ID:
			return Assign_3173;
		case Compensate12EditPart.VISUAL_ID:
			return Compensate_3174;
		case CompensateScope12EditPart.VISUAL_ID:
			return CompensateScope_3175;
		case Empty12EditPart.VISUAL_ID:
			return Empty_3176;
		case Exit12EditPart.VISUAL_ID:
			return Exit_3177;
		case ExtensionActivity12EditPart.VISUAL_ID:
			return ExtensionActivity_3178;
		case Flow8EditPart.VISUAL_ID:
			return Flow_3179;
		case ForEach10EditPart.VISUAL_ID:
			return ForEach_3180;
		case If7EditPart.VISUAL_ID:
			return If_3181;
		case Invoke7EditPart.VISUAL_ID:
			return Invoke_3182;
		case OpaqueActivity7EditPart.VISUAL_ID:
			return OpaqueActivity_3183;
		case PartnerActivity7EditPart.VISUAL_ID:
			return PartnerActivity_3184;
		case Pick7EditPart.VISUAL_ID:
			return Pick_3185;
		case Receive7EditPart.VISUAL_ID:
			return Receive_3186;
		case RepeatUntil7EditPart.VISUAL_ID:
			return RepeatUntil_3187;
		case Reply7EditPart.VISUAL_ID:
			return Reply_3188;
		case Rethrow7EditPart.VISUAL_ID:
			return Rethrow_3189;
		case Scope7EditPart.VISUAL_ID:
			return Scope_3190;
		case Sequence3EditPart.VISUAL_ID:
			return Sequence_3191;
		case Invoke8EditPart.VISUAL_ID:
			return Invoke_3192;
		case OpaqueActivity8EditPart.VISUAL_ID:
			return OpaqueActivity_3193;
		case PartnerActivity8EditPart.VISUAL_ID:
			return PartnerActivity_3194;
		case Pick8EditPart.VISUAL_ID:
			return Pick_3195;
		case Receive8EditPart.VISUAL_ID:
			return Receive_3196;
		case RepeatUntil8EditPart.VISUAL_ID:
			return RepeatUntil_3197;
		case Reply8EditPart.VISUAL_ID:
			return Reply_3198;
		case Rethrow8EditPart.VISUAL_ID:
			return Rethrow_3199;
		case Scope8EditPart.VISUAL_ID:
			return Scope_3200;
		case Sequence4EditPart.VISUAL_ID:
			return Sequence_3201;
		case Throw7EditPart.VISUAL_ID:
			return Throw_3202;
		case Validate7EditPart.VISUAL_ID:
			return Validate_3203;
		case Wait7EditPart.VISUAL_ID:
			return Wait_3204;
		case While7EditPart.VISUAL_ID:
			return While_3205;
		case Throw8EditPart.VISUAL_ID:
			return Throw_3206;
		case Validate8EditPart.VISUAL_ID:
			return Validate_3207;
		case Wait8EditPart.VISUAL_ID:
			return Wait_3208;
		case While8EditPart.VISUAL_ID:
			return While_3209;
		case Invoke9EditPart.VISUAL_ID:
			return Invoke_3210;
		case OpaqueActivity9EditPart.VISUAL_ID:
			return OpaqueActivity_3211;
		case PartnerActivity9EditPart.VISUAL_ID:
			return PartnerActivity_3212;
		case Pick9EditPart.VISUAL_ID:
			return Pick_3213;
		case Receive9EditPart.VISUAL_ID:
			return Receive_3214;
		case RepeatUntil9EditPart.VISUAL_ID:
			return RepeatUntil_3215;
		case Reply9EditPart.VISUAL_ID:
			return Reply_3216;
		case Rethrow9EditPart.VISUAL_ID:
			return Rethrow_3217;
		case Scope9EditPart.VISUAL_ID:
			return Scope_3218;
		case Sequence5EditPart.VISUAL_ID:
			return Sequence_3219;
		case Throw9EditPart.VISUAL_ID:
			return Throw_3220;
		case Validate9EditPart.VISUAL_ID:
			return Validate_3221;
		case Wait9EditPart.VISUAL_ID:
			return Wait_3222;
		case While9EditPart.VISUAL_ID:
			return While_3223;
		case If8EditPart.VISUAL_ID:
			return If_3224;
		case Invoke10EditPart.VISUAL_ID:
			return Invoke_3225;
		case OpaqueActivity10EditPart.VISUAL_ID:
			return OpaqueActivity_3226;
		case PartnerActivity10EditPart.VISUAL_ID:
			return PartnerActivity_3227;
		case Pick10EditPart.VISUAL_ID:
			return Pick_3228;
		case Receive10EditPart.VISUAL_ID:
			return Receive_3229;
		case RepeatUntil10EditPart.VISUAL_ID:
			return RepeatUntil_3230;
		case Reply10EditPart.VISUAL_ID:
			return Reply_3231;
		case Rethrow10EditPart.VISUAL_ID:
			return Rethrow_3232;
		case Scope10EditPart.VISUAL_ID:
			return Scope_3233;
		case Sequence6EditPart.VISUAL_ID:
			return Sequence_3234;
		case Throw10EditPart.VISUAL_ID:
			return Throw_3235;
		case Validate10EditPart.VISUAL_ID:
			return Validate_3236;
		case Wait10EditPart.VISUAL_ID:
			return Wait_3237;
		case While10EditPart.VISUAL_ID:
			return While_3238;
		case OnEventEditPart.VISUAL_ID:
			return OnEvent_3239;
		case Assign13EditPart.VISUAL_ID:
			return Assign_3240;
		case Compensate13EditPart.VISUAL_ID:
			return Compensate_3241;
		case CompensateScope13EditPart.VISUAL_ID:
			return CompensateScope_3242;
		case Empty13EditPart.VISUAL_ID:
			return Empty_3243;
		case Exit13EditPart.VISUAL_ID:
			return Exit_3244;
		case ExtensionActivity13EditPart.VISUAL_ID:
			return ExtensionActivity_3245;
		case Flow9EditPart.VISUAL_ID:
			return Flow_3246;
		case ForEach11EditPart.VISUAL_ID:
			return ForEach_3247;
		case If9EditPart.VISUAL_ID:
			return If_3248;
		case Invoke11EditPart.VISUAL_ID:
			return Invoke_3249;
		case OpaqueActivity11EditPart.VISUAL_ID:
			return OpaqueActivity_3250;
		case PartnerActivity11EditPart.VISUAL_ID:
			return PartnerActivity_3251;
		case Pick11EditPart.VISUAL_ID:
			return Pick_3252;
		case Receive11EditPart.VISUAL_ID:
			return Receive_3253;
		case RepeatUntil11EditPart.VISUAL_ID:
			return RepeatUntil_3254;
		case Reply11EditPart.VISUAL_ID:
			return Reply_3255;
		case Rethrow11EditPart.VISUAL_ID:
			return Rethrow_3256;
		case Scope11EditPart.VISUAL_ID:
			return Scope_3257;
		case Sequence7EditPart.VISUAL_ID:
			return Sequence_3258;
		case Throw11EditPart.VISUAL_ID:
			return Throw_3259;
		case Validate11EditPart.VISUAL_ID:
			return Validate_3260;
		case Wait11EditPart.VISUAL_ID:
			return Wait_3261;
		case While11EditPart.VISUAL_ID:
			return While_3262;
		case ForEach12EditPart.VISUAL_ID:
			return ForEach_3263;
		case If10EditPart.VISUAL_ID:
			return If_3264;
		case Invoke12EditPart.VISUAL_ID:
			return Invoke_3265;
		case OpaqueActivity12EditPart.VISUAL_ID:
			return OpaqueActivity_3266;
		case PartnerActivity12EditPart.VISUAL_ID:
			return PartnerActivity_3267;
		case Pick12EditPart.VISUAL_ID:
			return Pick_3268;
		case Receive12EditPart.VISUAL_ID:
			return Receive_3269;
		case RepeatUntil12EditPart.VISUAL_ID:
			return RepeatUntil_3270;
		case Reply12EditPart.VISUAL_ID:
			return Reply_3271;
		case Rethrow12EditPart.VISUAL_ID:
			return Rethrow_3272;
		case Scope12EditPart.VISUAL_ID:
			return Scope_3273;
		case Sequence8EditPart.VISUAL_ID:
			return Sequence_3274;
		case Throw12EditPart.VISUAL_ID:
			return Throw_3275;
		case Validate12EditPart.VISUAL_ID:
			return Validate_3276;
		case Wait12EditPart.VISUAL_ID:
			return Wait_3277;
		case While12EditPart.VISUAL_ID:
			return While_3278;
		case ForEach13EditPart.VISUAL_ID:
			return ForEach_3279;
		case If11EditPart.VISUAL_ID:
			return If_3280;
		case Invoke13EditPart.VISUAL_ID:
			return Invoke_3281;
		case OpaqueActivity13EditPart.VISUAL_ID:
			return OpaqueActivity_3282;
		case PartnerActivity13EditPart.VISUAL_ID:
			return PartnerActivity_3283;
		case Pick13EditPart.VISUAL_ID:
			return Pick_3284;
		case Receive13EditPart.VISUAL_ID:
			return Receive_3285;
		case RepeatUntil13EditPart.VISUAL_ID:
			return RepeatUntil_3286;
		case Reply13EditPart.VISUAL_ID:
			return Reply_3287;
		case Rethrow13EditPart.VISUAL_ID:
			return Rethrow_3288;
		case Scope13EditPart.VISUAL_ID:
			return Scope_3289;
		case Sequence9EditPart.VISUAL_ID:
			return Sequence_3290;
		case Throw13EditPart.VISUAL_ID:
			return Throw_3291;
		case Validate13EditPart.VISUAL_ID:
			return Validate_3292;
		case Wait13EditPart.VISUAL_ID:
			return Wait_3293;
		case While13EditPart.VISUAL_ID:
			return While_3294;
		case EventHandler2EditPart.VISUAL_ID:
			return EventHandler_3295;
		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
			return PartnerActivityToAtomicActionMapping_4001;
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return ProcessToCompositeActionMapping_4002;
		case SequenceToSequenceMappingEditPart.VISUAL_ID:
			return SequenceToSequenceMapping_4016;
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return IfToIfThenElseMapping_4017;
		case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
			return WhileToRepeatWhileMapping_4018;
		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
			return RepeatUntilToRepeatUntilMapping_4019;
		case FlowToSplitJoinMappingEditPart.VISUAL_ID:
			return FlowToSplitJoinMapping_4020;
		case ForToRepeatWhileMappingEditPart.VISUAL_ID:
			return ForToRepeatWhileMapping_4021;
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return ScopeToCompositeActionMapping_4022;
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return ElseIfToIfThenElseMapping_4023;
		case ElseToElseMappingEditPart.VISUAL_ID:
			return ElseToElseMapping_4024;
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return CompositeProcessComposedOf_4003;
		case PerformProcessEditPart.VISUAL_ID:
			return PerformProcess_4004;
		case ChoiceComponentsEditPart.VISUAL_ID:
			return ChoiceComponents_4005;
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return AnyOrderComponents_4006;
		case SequenceComponentsEditPart.VISUAL_ID:
			return SequenceComponents_4007;
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return ControlConstructBagRest_4008;
		case ControlConstructListRestEditPart.VISUAL_ID:
			return ControlConstructListRest_4009;
		case IfThenElseThenEditPart.VISUAL_ID:
			return IfThenElseThen_4010;
		case IfThenElseElseEditPart.VISUAL_ID:
			return IfThenElseElse_4011;
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return RepeatUntilUntilProcess_4012;
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return RepeatWhileWhileProcess_4013;
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return ControlConstructBagFirst_4014;
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return ControlConstructListFirst_4015;
		case SplitComponentsEditPart.VISUAL_ID:
			return SplitComponents_4025;
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return SplitJoinComponents_4026;
		}
		return null;
	}

}
