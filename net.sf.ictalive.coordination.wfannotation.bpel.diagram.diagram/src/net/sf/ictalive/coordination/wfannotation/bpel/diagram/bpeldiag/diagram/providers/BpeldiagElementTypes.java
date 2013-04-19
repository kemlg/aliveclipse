package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.BpeldiagPackage;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramEditorPlugin;

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
import org.eclipse.wst.wsdl.WSDLPackage;

/**
 * @generated
 */
public class BpeldiagElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private BpeldiagElementTypes() {
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
	public static final IElementType ProcessContainer_1000 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ProcessContainer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Process_2001 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Process_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_2002 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_2003 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_2004 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_2005 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_2006 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_2007 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_2008 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_2009 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_2010 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_2011 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_2012 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_2014 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_2015 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_2016 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_2017 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_2018 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_2019 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_2020 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_2021 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_2022 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_2023 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_2024 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_2013 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElseIf_2025 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ElseIf_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Else_2026 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Else_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnAlarm_2027 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnAlarm_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnEvent_2028 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnEvent_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnMessage_2029 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnMessage_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventHandler_2030 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.EventHandler_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2031 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Operation_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3001 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3004 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3005 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3006 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3007 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3008 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3009 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3055 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3056 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3057 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3058 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3059 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3060 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3061 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3062 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3077 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3078 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3079 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3080 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3080"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3081 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3081"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3082 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3083 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3083"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3084 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3084"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3098 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3098"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3099 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3099"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3100 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3100"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3101 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3102 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3102"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3103 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3103"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3104 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3104"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3105 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3105"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3085 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3085"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3086 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3086"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3087 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3087"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3088 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3088"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnAlarm_3227 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnAlarm_3227"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3228 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3228"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3229 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3229"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3230 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3230"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3231 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3231"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3232 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3232"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3233 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3233"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3234 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3234"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3063 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3163 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3163"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3164 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3164"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3165 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3165"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3166 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3166"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnMessage_3235 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnMessage_3235"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3236 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3236"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3237 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3237"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3238 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3238"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3239 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3239"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3240 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3240"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3241 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3241"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3242 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3242"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3064 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3065 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3066 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3067 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3068 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3069 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3106 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3106"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3107 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3107"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3108 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3108"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3109 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3109"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3110 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3110"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3111 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3111"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3112 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3112"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3113 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3113"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3089 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3089"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3090 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3090"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3151 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3151"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3152 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3152"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3153 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3153"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3154 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3154"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3155 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3155"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3156 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3156"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3157 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3157"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3158 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3158"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3114 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3114"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3115 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3115"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3116 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3116"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3117 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3117"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3118 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3118"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3119 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3119"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3120 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3120"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3121 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3121"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3091 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3091"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3092 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3092"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3093 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3093"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3140 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3140"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3141 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3141"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3142 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3142"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3143 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3143"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3144 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3144"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3145 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3145"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3146 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3146"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3147 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3147"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3148 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3148"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3149 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3149"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3150 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3150"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3122 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3122"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3123 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3123"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3124 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3124"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3125 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3125"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3126 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3126"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3127 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3127"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3176 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3176"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3070 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3071 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3072 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventHandler_3243 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.EventHandler_3243"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnAlarm_3244 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnAlarm_3244"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3245 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3245"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3094 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3094"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3095 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3095"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3096 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3096"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3097 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3097"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3129 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3129"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3177 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3177"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3167 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3167"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3168 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3168"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3159 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3159"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3160 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3160"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3161 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3161"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3162 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3162"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3130 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3130"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3131 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3131"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3132 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3132"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3133 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3133"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3134 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3134"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3178 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3178"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3135 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3135"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3136 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3136"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3179 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3179"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3180 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3180"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3033 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3034 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3035 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3036 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3037 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3038 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3039 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3073 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3074 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3075 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3076 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3137 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3137"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3138 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3138"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3139 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3139"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3128 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3128"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3040 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3032 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3169 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3169"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3170 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3170"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3171 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3171"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3172 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3172"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3173 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3173"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3174 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3174"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3175 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3175"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElseIf_3246 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ElseIf_3246"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3181 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3181"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3182 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3182"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3183 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3183"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3184 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3184"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3185 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3185"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3186 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3186"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3187 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3187"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3188 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3188"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3189 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3189"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Else_3247 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Else_3247"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3204 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3204"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3205 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3205"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3206 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3206"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3207 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3207"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3208 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3208"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3209 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3209"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3210 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3210"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3211 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3211"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3212 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3212"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3213 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3213"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3214 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3214"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3215 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3215"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3216 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3216"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3217 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3217"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3218 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3218"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3219 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3219"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3220 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3220"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3221 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3221"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3222 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3222"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3041 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3042 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3043 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3044 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3045 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3046 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3047 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3048 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3049 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3050 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3051 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3052 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3053 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3054 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3223 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3223"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3224 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3224"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3225 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3225"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3226 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3226"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3190 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3190"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3191 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3191"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3192 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3192"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3193 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3193"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3194 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3194"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3195 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3195"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3196 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3196"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3197 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3197"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3198 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3198"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3199 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3199"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3200 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3200"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3201 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3201"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3202 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3202"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3203 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3203"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3248 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3248"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3249 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3249"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3250 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3250"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3251 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3251"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3252 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3252"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3253 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3253"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3254 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3254"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3255 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3255"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3256 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3256"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3257 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3257"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3258 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3258"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3259 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3259"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3260 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3260"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3261 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3261"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3262 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3262"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnEvent_3263 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OnEvent_3263"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assign_3264 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Assign_3264"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Compensate_3265 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Compensate_3265"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompensateScope_3266 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.CompensateScope_3266"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Empty_3267 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Empty_3267"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exit_3268 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Exit_3268"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionActivity_3269 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ExtensionActivity_3269"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Flow_3270 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Flow_3270"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3271 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3271"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3272 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3272"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3273 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3273"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3274 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3274"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3275 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3275"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3276 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3276"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3277 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3277"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3278 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3278"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3279 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3279"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3280 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3280"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3281 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3281"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3282 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3282"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3283 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3283"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3284 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3284"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3285 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3285"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3286 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3286"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3287 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3287"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3288 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3288"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3289 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3289"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3290 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3290"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3291 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3291"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3292 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3292"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3293 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3293"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3294 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3294"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3295 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3295"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3296 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3296"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3297 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3297"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3298 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3298"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3299 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3299"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3300 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3300"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3301 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3301"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3302 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3302"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForEach_3010 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.ForEach_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3011 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.If_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invoke_3012 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Invoke_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueActivity_3013 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.OpaqueActivity_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivity_3014 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivity_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pick_3015 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Pick_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Receive_3016 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Receive_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3017 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.RepeatUntil_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reply_3018 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Reply_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rethrow_3019 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Rethrow_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scope_3020 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Scope_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3002 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Sequence_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Throw_3021 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Throw_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validate_3022 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Validate_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wait_3023 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.Wait_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3024 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.While_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventHandler_3303 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.EventHandler_3303"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PartnerActivityOperation_4001 = getElementType("net.sf.ictalive.coordination.wfannotation.bpel.diagram.diagram.PartnerActivityOperation_4001"); //$NON-NLS-1$

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
				return BpeldiagDiagramEditorPlugin.getInstance()
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

			elements.put(ProcessContainer_1000, BpeldiagPackage.eINSTANCE
					.getProcessContainer());

			elements.put(Process_2001, BPELPackage.eINSTANCE.getProcess());

			elements.put(Assign_2002, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_2003, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_2004, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_2005, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_2006, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_2007, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_2008, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_2009, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_2010, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_2011, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_2012, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(Pick_2014, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_2015, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_2016, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_2017, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_2018, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_2019, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_2020, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_2021, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_2022, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_2023, BPELPackage.eINSTANCE.getWait());

			elements.put(While_2024, BPELPackage.eINSTANCE.getWhile());

			elements.put(PartnerActivity_2013, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(ElseIf_2025, BPELPackage.eINSTANCE.getElseIf());

			elements.put(Else_2026, BPELPackage.eINSTANCE.getElse());

			elements.put(OnAlarm_2027, BPELPackage.eINSTANCE.getOnAlarm());

			elements.put(OnEvent_2028, BPELPackage.eINSTANCE.getOnEvent());

			elements.put(OnMessage_2029, BPELPackage.eINSTANCE.getOnMessage());

			elements.put(EventHandler_2030, BPELPackage.eINSTANCE
					.getEventHandler());

			elements.put(Operation_2031, WSDLPackage.eINSTANCE.getOperation());

			elements.put(Assign_3001, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3004, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3005, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3006, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3007, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3008, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3009, BPELPackage.eINSTANCE.getFlow());

			elements.put(Assign_3055, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3056, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3057, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3058, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3059, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3060, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3061, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3062, BPELPackage.eINSTANCE.getForEach());

			elements.put(Assign_3077, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3078, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3079, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3080, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3081, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3082, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(ForEach_3083, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3084, BPELPackage.eINSTANCE.getIf());

			elements.put(Assign_3098, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3099, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3100, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3101, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3102, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3103, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(If_3104, BPELPackage.eINSTANCE.getIf());

			elements.put(ForEach_3105, BPELPackage.eINSTANCE.getForEach());

			elements.put(Invoke_3085, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3086, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3087, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3088, BPELPackage.eINSTANCE.getPick());

			elements.put(OnAlarm_3227, BPELPackage.eINSTANCE.getOnAlarm());

			elements.put(Assign_3228, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3229, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3230, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3231, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3232, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3233, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3234, BPELPackage.eINSTANCE.getFlow());

			elements.put(If_3063, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3163, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3164, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3165, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3166, BPELPackage.eINSTANCE.getPick());

			elements.put(OnMessage_3235, BPELPackage.eINSTANCE.getOnMessage());

			elements.put(Assign_3236, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3237, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3238, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3239, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3240, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3241, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3242, BPELPackage.eINSTANCE.getFlow());

			elements.put(Invoke_3064, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3065, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3066, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3067, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3068, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3069, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Assign_3106, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3107, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3108, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3109, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3110, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3111, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(RepeatUntil_3112, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(ForEach_3113, BPELPackage.eINSTANCE.getForEach());

			elements.put(Receive_3089, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3090, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Invoke_3151, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3152, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3153, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3154, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3155, BPELPackage.eINSTANCE.getReceive());

			elements.put(Reply_3156, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3157, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3158, BPELPackage.eINSTANCE.getScope());

			elements.put(Assign_3114, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3115, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3116, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3117, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3118, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3119, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Scope_3120, BPELPackage.eINSTANCE.getScope());

			elements.put(ForEach_3121, BPELPackage.eINSTANCE.getForEach());

			elements.put(Reply_3091, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3092, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3093, BPELPackage.eINSTANCE.getScope());

			elements.put(Invoke_3140, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3141, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3142, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3143, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3144, BPELPackage.eINSTANCE.getReceive());

			elements.put(Reply_3145, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3146, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Throw_3147, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3148, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3149, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3150, BPELPackage.eINSTANCE.getWhile());

			elements.put(Assign_3122, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3123, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3124, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3125, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3126, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3127, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3176, BPELPackage.eINSTANCE.getFlow());

			elements.put(Reply_3070, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3071, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3072, BPELPackage.eINSTANCE.getScope());

			elements.put(EventHandler_3243, BPELPackage.eINSTANCE
					.getEventHandler());

			elements.put(OnAlarm_3244, BPELPackage.eINSTANCE.getOnAlarm());

			elements.put(ForEach_3245, BPELPackage.eINSTANCE.getForEach());

			elements.put(Throw_3094, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3095, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3096, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3097, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3129, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3177, BPELPackage.eINSTANCE.getIf());

			elements.put(Receive_3167, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3168, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Throw_3159, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3160, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3161, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3162, BPELPackage.eINSTANCE.getWhile());

			elements.put(Invoke_3130, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3131, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3132, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3133, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3134, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3178, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3135, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3136, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3179, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3180, BPELPackage.eINSTANCE.getSequence());

			elements.put(Assign_3033, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3034, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3035, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3036, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3037, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3038, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3039, BPELPackage.eINSTANCE.getFlow());

			elements.put(Throw_3073, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3074, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3075, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3076, BPELPackage.eINSTANCE.getWhile());

			elements.put(Throw_3137, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3138, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3139, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3128, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3040, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3032, BPELPackage.eINSTANCE.getIf());

			elements.put(Reply_3169, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3170, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3171, BPELPackage.eINSTANCE.getScope());

			elements.put(Throw_3172, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3173, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3174, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3175, BPELPackage.eINSTANCE.getWhile());

			elements.put(ElseIf_3246, BPELPackage.eINSTANCE.getElseIf());

			elements.put(Assign_3181, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3182, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3183, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3184, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3185, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3186, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3187, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3188, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3189, BPELPackage.eINSTANCE.getIf());

			elements.put(Else_3247, BPELPackage.eINSTANCE.getElse());

			elements.put(Assign_3204, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3205, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3206, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3207, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3208, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3209, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3210, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3211, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3212, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3213, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3214, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3215, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3216, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3217, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3218, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3219, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3220, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3221, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3222, BPELPackage.eINSTANCE.getSequence());

			elements.put(Invoke_3041, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3042, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3043, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3044, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3045, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3046, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3047, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3048, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3049, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3050, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3051, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3052, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3053, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3054, BPELPackage.eINSTANCE.getWhile());

			elements.put(Throw_3223, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3224, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3225, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3226, BPELPackage.eINSTANCE.getWhile());

			elements.put(Invoke_3190, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3191, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3192, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3193, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3194, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3195, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3196, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3197, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3198, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3199, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3200, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3201, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3202, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3203, BPELPackage.eINSTANCE.getWhile());

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

			elements.put(OnEvent_3263, BPELPackage.eINSTANCE.getOnEvent());

			elements.put(Assign_3264, BPELPackage.eINSTANCE.getAssign());

			elements
					.put(Compensate_3265, BPELPackage.eINSTANCE.getCompensate());

			elements.put(CompensateScope_3266, BPELPackage.eINSTANCE
					.getCompensateScope());

			elements.put(Empty_3267, BPELPackage.eINSTANCE.getEmpty());

			elements.put(Exit_3268, BPELPackage.eINSTANCE.getExit());

			elements.put(ExtensionActivity_3269, BPELPackage.eINSTANCE
					.getExtensionActivity());

			elements.put(Flow_3270, BPELPackage.eINSTANCE.getFlow());

			elements.put(ForEach_3271, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3272, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3273, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3274, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3275, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3276, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3277, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3278, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3279, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3280, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3281, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3282, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3283, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3284, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3285, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3286, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3287, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3288, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3289, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3290, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3291, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3292, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3293, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3294, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3295, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3296, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3297, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3298, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3299, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3300, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3301, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3302, BPELPackage.eINSTANCE.getWhile());

			elements.put(ForEach_3010, BPELPackage.eINSTANCE.getForEach());

			elements.put(If_3011, BPELPackage.eINSTANCE.getIf());

			elements.put(Invoke_3012, BPELPackage.eINSTANCE.getInvoke());

			elements.put(OpaqueActivity_3013, BPELPackage.eINSTANCE
					.getOpaqueActivity());

			elements.put(PartnerActivity_3014, BPELPackage.eINSTANCE
					.getPartnerActivity());

			elements.put(Pick_3015, BPELPackage.eINSTANCE.getPick());

			elements.put(Receive_3016, BPELPackage.eINSTANCE.getReceive());

			elements.put(RepeatUntil_3017, BPELPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Reply_3018, BPELPackage.eINSTANCE.getReply());

			elements.put(Rethrow_3019, BPELPackage.eINSTANCE.getRethrow());

			elements.put(Scope_3020, BPELPackage.eINSTANCE.getScope());

			elements.put(Sequence_3002, BPELPackage.eINSTANCE.getSequence());

			elements.put(Throw_3021, BPELPackage.eINSTANCE.getThrow());

			elements.put(Validate_3022, BPELPackage.eINSTANCE.getValidate());

			elements.put(Wait_3023, BPELPackage.eINSTANCE.getWait());

			elements.put(While_3024, BPELPackage.eINSTANCE.getWhile());

			elements.put(EventHandler_3303, BPELPackage.eINSTANCE
					.getEventHandler());

			elements.put(PartnerActivityOperation_4001, BPELPackage.eINSTANCE
					.getPartnerActivity_Operation());
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
			KNOWN_ELEMENT_TYPES.add(ProcessContainer_1000);
			KNOWN_ELEMENT_TYPES.add(Process_2001);
			KNOWN_ELEMENT_TYPES.add(Assign_2002);
			KNOWN_ELEMENT_TYPES.add(Compensate_2003);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_2004);
			KNOWN_ELEMENT_TYPES.add(Empty_2005);
			KNOWN_ELEMENT_TYPES.add(Exit_2006);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_2007);
			KNOWN_ELEMENT_TYPES.add(Flow_2008);
			KNOWN_ELEMENT_TYPES.add(ForEach_2009);
			KNOWN_ELEMENT_TYPES.add(If_2010);
			KNOWN_ELEMENT_TYPES.add(Invoke_2011);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_2012);
			KNOWN_ELEMENT_TYPES.add(Pick_2014);
			KNOWN_ELEMENT_TYPES.add(Receive_2015);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_2016);
			KNOWN_ELEMENT_TYPES.add(Reply_2017);
			KNOWN_ELEMENT_TYPES.add(Rethrow_2018);
			KNOWN_ELEMENT_TYPES.add(Scope_2019);
			KNOWN_ELEMENT_TYPES.add(Sequence_2020);
			KNOWN_ELEMENT_TYPES.add(Throw_2021);
			KNOWN_ELEMENT_TYPES.add(Validate_2022);
			KNOWN_ELEMENT_TYPES.add(Wait_2023);
			KNOWN_ELEMENT_TYPES.add(While_2024);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_2013);
			KNOWN_ELEMENT_TYPES.add(ElseIf_2025);
			KNOWN_ELEMENT_TYPES.add(Else_2026);
			KNOWN_ELEMENT_TYPES.add(OnAlarm_2027);
			KNOWN_ELEMENT_TYPES.add(OnEvent_2028);
			KNOWN_ELEMENT_TYPES.add(OnMessage_2029);
			KNOWN_ELEMENT_TYPES.add(EventHandler_2030);
			KNOWN_ELEMENT_TYPES.add(Operation_2031);
			KNOWN_ELEMENT_TYPES.add(Assign_3001);
			KNOWN_ELEMENT_TYPES.add(Compensate_3004);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3005);
			KNOWN_ELEMENT_TYPES.add(Empty_3006);
			KNOWN_ELEMENT_TYPES.add(Exit_3007);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3008);
			KNOWN_ELEMENT_TYPES.add(Flow_3009);
			KNOWN_ELEMENT_TYPES.add(Assign_3055);
			KNOWN_ELEMENT_TYPES.add(Compensate_3056);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3057);
			KNOWN_ELEMENT_TYPES.add(Empty_3058);
			KNOWN_ELEMENT_TYPES.add(Exit_3059);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3060);
			KNOWN_ELEMENT_TYPES.add(Flow_3061);
			KNOWN_ELEMENT_TYPES.add(ForEach_3062);
			KNOWN_ELEMENT_TYPES.add(Assign_3077);
			KNOWN_ELEMENT_TYPES.add(Compensate_3078);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3079);
			KNOWN_ELEMENT_TYPES.add(Empty_3080);
			KNOWN_ELEMENT_TYPES.add(Exit_3081);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3082);
			KNOWN_ELEMENT_TYPES.add(ForEach_3083);
			KNOWN_ELEMENT_TYPES.add(If_3084);
			KNOWN_ELEMENT_TYPES.add(Assign_3098);
			KNOWN_ELEMENT_TYPES.add(Compensate_3099);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3100);
			KNOWN_ELEMENT_TYPES.add(Empty_3101);
			KNOWN_ELEMENT_TYPES.add(Exit_3102);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3103);
			KNOWN_ELEMENT_TYPES.add(If_3104);
			KNOWN_ELEMENT_TYPES.add(ForEach_3105);
			KNOWN_ELEMENT_TYPES.add(Invoke_3085);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3086);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3087);
			KNOWN_ELEMENT_TYPES.add(Pick_3088);
			KNOWN_ELEMENT_TYPES.add(OnAlarm_3227);
			KNOWN_ELEMENT_TYPES.add(Assign_3228);
			KNOWN_ELEMENT_TYPES.add(Compensate_3229);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3230);
			KNOWN_ELEMENT_TYPES.add(Empty_3231);
			KNOWN_ELEMENT_TYPES.add(Exit_3232);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3233);
			KNOWN_ELEMENT_TYPES.add(Flow_3234);
			KNOWN_ELEMENT_TYPES.add(If_3063);
			KNOWN_ELEMENT_TYPES.add(Invoke_3163);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3164);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3165);
			KNOWN_ELEMENT_TYPES.add(Pick_3166);
			KNOWN_ELEMENT_TYPES.add(OnMessage_3235);
			KNOWN_ELEMENT_TYPES.add(Assign_3236);
			KNOWN_ELEMENT_TYPES.add(Compensate_3237);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3238);
			KNOWN_ELEMENT_TYPES.add(Empty_3239);
			KNOWN_ELEMENT_TYPES.add(Exit_3240);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3241);
			KNOWN_ELEMENT_TYPES.add(Flow_3242);
			KNOWN_ELEMENT_TYPES.add(Invoke_3064);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3065);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3066);
			KNOWN_ELEMENT_TYPES.add(Pick_3067);
			KNOWN_ELEMENT_TYPES.add(Receive_3068);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3069);
			KNOWN_ELEMENT_TYPES.add(Assign_3106);
			KNOWN_ELEMENT_TYPES.add(Compensate_3107);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3108);
			KNOWN_ELEMENT_TYPES.add(Empty_3109);
			KNOWN_ELEMENT_TYPES.add(Exit_3110);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3111);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3112);
			KNOWN_ELEMENT_TYPES.add(ForEach_3113);
			KNOWN_ELEMENT_TYPES.add(Receive_3089);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3090);
			KNOWN_ELEMENT_TYPES.add(Invoke_3151);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3152);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3153);
			KNOWN_ELEMENT_TYPES.add(Pick_3154);
			KNOWN_ELEMENT_TYPES.add(Receive_3155);
			KNOWN_ELEMENT_TYPES.add(Reply_3156);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3157);
			KNOWN_ELEMENT_TYPES.add(Scope_3158);
			KNOWN_ELEMENT_TYPES.add(Assign_3114);
			KNOWN_ELEMENT_TYPES.add(Compensate_3115);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3116);
			KNOWN_ELEMENT_TYPES.add(Empty_3117);
			KNOWN_ELEMENT_TYPES.add(Exit_3118);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3119);
			KNOWN_ELEMENT_TYPES.add(Scope_3120);
			KNOWN_ELEMENT_TYPES.add(ForEach_3121);
			KNOWN_ELEMENT_TYPES.add(Reply_3091);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3092);
			KNOWN_ELEMENT_TYPES.add(Scope_3093);
			KNOWN_ELEMENT_TYPES.add(Invoke_3140);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3141);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3142);
			KNOWN_ELEMENT_TYPES.add(Pick_3143);
			KNOWN_ELEMENT_TYPES.add(Receive_3144);
			KNOWN_ELEMENT_TYPES.add(Reply_3145);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3146);
			KNOWN_ELEMENT_TYPES.add(Throw_3147);
			KNOWN_ELEMENT_TYPES.add(Validate_3148);
			KNOWN_ELEMENT_TYPES.add(Wait_3149);
			KNOWN_ELEMENT_TYPES.add(While_3150);
			KNOWN_ELEMENT_TYPES.add(Assign_3122);
			KNOWN_ELEMENT_TYPES.add(Compensate_3123);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3124);
			KNOWN_ELEMENT_TYPES.add(Empty_3125);
			KNOWN_ELEMENT_TYPES.add(Exit_3126);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3127);
			KNOWN_ELEMENT_TYPES.add(Flow_3176);
			KNOWN_ELEMENT_TYPES.add(Reply_3070);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3071);
			KNOWN_ELEMENT_TYPES.add(Scope_3072);
			KNOWN_ELEMENT_TYPES.add(EventHandler_3243);
			KNOWN_ELEMENT_TYPES.add(OnAlarm_3244);
			KNOWN_ELEMENT_TYPES.add(ForEach_3245);
			KNOWN_ELEMENT_TYPES.add(Throw_3094);
			KNOWN_ELEMENT_TYPES.add(Validate_3095);
			KNOWN_ELEMENT_TYPES.add(Wait_3096);
			KNOWN_ELEMENT_TYPES.add(While_3097);
			KNOWN_ELEMENT_TYPES.add(ForEach_3129);
			KNOWN_ELEMENT_TYPES.add(If_3177);
			KNOWN_ELEMENT_TYPES.add(Receive_3167);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3168);
			KNOWN_ELEMENT_TYPES.add(Throw_3159);
			KNOWN_ELEMENT_TYPES.add(Validate_3160);
			KNOWN_ELEMENT_TYPES.add(Wait_3161);
			KNOWN_ELEMENT_TYPES.add(While_3162);
			KNOWN_ELEMENT_TYPES.add(Invoke_3130);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3131);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3132);
			KNOWN_ELEMENT_TYPES.add(Pick_3133);
			KNOWN_ELEMENT_TYPES.add(Receive_3134);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3178);
			KNOWN_ELEMENT_TYPES.add(Reply_3135);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3136);
			KNOWN_ELEMENT_TYPES.add(Scope_3179);
			KNOWN_ELEMENT_TYPES.add(Sequence_3180);
			KNOWN_ELEMENT_TYPES.add(Assign_3033);
			KNOWN_ELEMENT_TYPES.add(Compensate_3034);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3035);
			KNOWN_ELEMENT_TYPES.add(Empty_3036);
			KNOWN_ELEMENT_TYPES.add(Exit_3037);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3038);
			KNOWN_ELEMENT_TYPES.add(Flow_3039);
			KNOWN_ELEMENT_TYPES.add(Throw_3073);
			KNOWN_ELEMENT_TYPES.add(Validate_3074);
			KNOWN_ELEMENT_TYPES.add(Wait_3075);
			KNOWN_ELEMENT_TYPES.add(While_3076);
			KNOWN_ELEMENT_TYPES.add(Throw_3137);
			KNOWN_ELEMENT_TYPES.add(Validate_3138);
			KNOWN_ELEMENT_TYPES.add(Wait_3139);
			KNOWN_ELEMENT_TYPES.add(While_3128);
			KNOWN_ELEMENT_TYPES.add(ForEach_3040);
			KNOWN_ELEMENT_TYPES.add(If_3032);
			KNOWN_ELEMENT_TYPES.add(Reply_3169);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3170);
			KNOWN_ELEMENT_TYPES.add(Scope_3171);
			KNOWN_ELEMENT_TYPES.add(Throw_3172);
			KNOWN_ELEMENT_TYPES.add(Validate_3173);
			KNOWN_ELEMENT_TYPES.add(Wait_3174);
			KNOWN_ELEMENT_TYPES.add(While_3175);
			KNOWN_ELEMENT_TYPES.add(ElseIf_3246);
			KNOWN_ELEMENT_TYPES.add(Assign_3181);
			KNOWN_ELEMENT_TYPES.add(Compensate_3182);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3183);
			KNOWN_ELEMENT_TYPES.add(Empty_3184);
			KNOWN_ELEMENT_TYPES.add(Exit_3185);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3186);
			KNOWN_ELEMENT_TYPES.add(Flow_3187);
			KNOWN_ELEMENT_TYPES.add(ForEach_3188);
			KNOWN_ELEMENT_TYPES.add(If_3189);
			KNOWN_ELEMENT_TYPES.add(Else_3247);
			KNOWN_ELEMENT_TYPES.add(Assign_3204);
			KNOWN_ELEMENT_TYPES.add(Compensate_3205);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3206);
			KNOWN_ELEMENT_TYPES.add(Empty_3207);
			KNOWN_ELEMENT_TYPES.add(Exit_3208);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3209);
			KNOWN_ELEMENT_TYPES.add(Flow_3210);
			KNOWN_ELEMENT_TYPES.add(ForEach_3211);
			KNOWN_ELEMENT_TYPES.add(If_3212);
			KNOWN_ELEMENT_TYPES.add(Invoke_3213);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3214);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3215);
			KNOWN_ELEMENT_TYPES.add(Pick_3216);
			KNOWN_ELEMENT_TYPES.add(Receive_3217);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3218);
			KNOWN_ELEMENT_TYPES.add(Reply_3219);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3220);
			KNOWN_ELEMENT_TYPES.add(Scope_3221);
			KNOWN_ELEMENT_TYPES.add(Sequence_3222);
			KNOWN_ELEMENT_TYPES.add(Invoke_3041);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3042);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3043);
			KNOWN_ELEMENT_TYPES.add(Pick_3044);
			KNOWN_ELEMENT_TYPES.add(Receive_3045);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3046);
			KNOWN_ELEMENT_TYPES.add(Reply_3047);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3048);
			KNOWN_ELEMENT_TYPES.add(Scope_3049);
			KNOWN_ELEMENT_TYPES.add(Sequence_3050);
			KNOWN_ELEMENT_TYPES.add(Throw_3051);
			KNOWN_ELEMENT_TYPES.add(Validate_3052);
			KNOWN_ELEMENT_TYPES.add(Wait_3053);
			KNOWN_ELEMENT_TYPES.add(While_3054);
			KNOWN_ELEMENT_TYPES.add(Throw_3223);
			KNOWN_ELEMENT_TYPES.add(Validate_3224);
			KNOWN_ELEMENT_TYPES.add(Wait_3225);
			KNOWN_ELEMENT_TYPES.add(While_3226);
			KNOWN_ELEMENT_TYPES.add(Invoke_3190);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3191);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3192);
			KNOWN_ELEMENT_TYPES.add(Pick_3193);
			KNOWN_ELEMENT_TYPES.add(Receive_3194);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3195);
			KNOWN_ELEMENT_TYPES.add(Reply_3196);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3197);
			KNOWN_ELEMENT_TYPES.add(Scope_3198);
			KNOWN_ELEMENT_TYPES.add(Sequence_3199);
			KNOWN_ELEMENT_TYPES.add(Throw_3200);
			KNOWN_ELEMENT_TYPES.add(Validate_3201);
			KNOWN_ELEMENT_TYPES.add(Wait_3202);
			KNOWN_ELEMENT_TYPES.add(While_3203);
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
			KNOWN_ELEMENT_TYPES.add(OnEvent_3263);
			KNOWN_ELEMENT_TYPES.add(Assign_3264);
			KNOWN_ELEMENT_TYPES.add(Compensate_3265);
			KNOWN_ELEMENT_TYPES.add(CompensateScope_3266);
			KNOWN_ELEMENT_TYPES.add(Empty_3267);
			KNOWN_ELEMENT_TYPES.add(Exit_3268);
			KNOWN_ELEMENT_TYPES.add(ExtensionActivity_3269);
			KNOWN_ELEMENT_TYPES.add(Flow_3270);
			KNOWN_ELEMENT_TYPES.add(ForEach_3271);
			KNOWN_ELEMENT_TYPES.add(If_3272);
			KNOWN_ELEMENT_TYPES.add(Invoke_3273);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3274);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3275);
			KNOWN_ELEMENT_TYPES.add(Pick_3276);
			KNOWN_ELEMENT_TYPES.add(Receive_3277);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3278);
			KNOWN_ELEMENT_TYPES.add(Reply_3279);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3280);
			KNOWN_ELEMENT_TYPES.add(Scope_3281);
			KNOWN_ELEMENT_TYPES.add(Sequence_3282);
			KNOWN_ELEMENT_TYPES.add(Throw_3283);
			KNOWN_ELEMENT_TYPES.add(Validate_3284);
			KNOWN_ELEMENT_TYPES.add(Wait_3285);
			KNOWN_ELEMENT_TYPES.add(While_3286);
			KNOWN_ELEMENT_TYPES.add(ForEach_3287);
			KNOWN_ELEMENT_TYPES.add(If_3288);
			KNOWN_ELEMENT_TYPES.add(Invoke_3289);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3290);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3291);
			KNOWN_ELEMENT_TYPES.add(Pick_3292);
			KNOWN_ELEMENT_TYPES.add(Receive_3293);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3294);
			KNOWN_ELEMENT_TYPES.add(Reply_3295);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3296);
			KNOWN_ELEMENT_TYPES.add(Scope_3297);
			KNOWN_ELEMENT_TYPES.add(Sequence_3298);
			KNOWN_ELEMENT_TYPES.add(Throw_3299);
			KNOWN_ELEMENT_TYPES.add(Validate_3300);
			KNOWN_ELEMENT_TYPES.add(Wait_3301);
			KNOWN_ELEMENT_TYPES.add(While_3302);
			KNOWN_ELEMENT_TYPES.add(ForEach_3010);
			KNOWN_ELEMENT_TYPES.add(If_3011);
			KNOWN_ELEMENT_TYPES.add(Invoke_3012);
			KNOWN_ELEMENT_TYPES.add(OpaqueActivity_3013);
			KNOWN_ELEMENT_TYPES.add(PartnerActivity_3014);
			KNOWN_ELEMENT_TYPES.add(Pick_3015);
			KNOWN_ELEMENT_TYPES.add(Receive_3016);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3017);
			KNOWN_ELEMENT_TYPES.add(Reply_3018);
			KNOWN_ELEMENT_TYPES.add(Rethrow_3019);
			KNOWN_ELEMENT_TYPES.add(Scope_3020);
			KNOWN_ELEMENT_TYPES.add(Sequence_3002);
			KNOWN_ELEMENT_TYPES.add(Throw_3021);
			KNOWN_ELEMENT_TYPES.add(Validate_3022);
			KNOWN_ELEMENT_TYPES.add(Wait_3023);
			KNOWN_ELEMENT_TYPES.add(While_3024);
			KNOWN_ELEMENT_TYPES.add(EventHandler_3303);
			KNOWN_ELEMENT_TYPES.add(PartnerActivityOperation_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProcessContainerEditPart.VISUAL_ID:
			return ProcessContainer_1000;
		case ProcessEditPart.VISUAL_ID:
			return Process_2001;
		case AssignEditPart.VISUAL_ID:
			return Assign_2002;
		case CompensateEditPart.VISUAL_ID:
			return Compensate_2003;
		case CompensateScopeEditPart.VISUAL_ID:
			return CompensateScope_2004;
		case EmptyEditPart.VISUAL_ID:
			return Empty_2005;
		case ExitEditPart.VISUAL_ID:
			return Exit_2006;
		case ExtensionActivityEditPart.VISUAL_ID:
			return ExtensionActivity_2007;
		case FlowEditPart.VISUAL_ID:
			return Flow_2008;
		case ForEachEditPart.VISUAL_ID:
			return ForEach_2009;
		case IfEditPart.VISUAL_ID:
			return If_2010;
		case InvokeEditPart.VISUAL_ID:
			return Invoke_2011;
		case OpaqueActivityEditPart.VISUAL_ID:
			return OpaqueActivity_2012;
		case PickEditPart.VISUAL_ID:
			return Pick_2014;
		case ReceiveEditPart.VISUAL_ID:
			return Receive_2015;
		case RepeatUntilEditPart.VISUAL_ID:
			return RepeatUntil_2016;
		case ReplyEditPart.VISUAL_ID:
			return Reply_2017;
		case RethrowEditPart.VISUAL_ID:
			return Rethrow_2018;
		case ScopeEditPart.VISUAL_ID:
			return Scope_2019;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_2020;
		case ThrowEditPart.VISUAL_ID:
			return Throw_2021;
		case ValidateEditPart.VISUAL_ID:
			return Validate_2022;
		case WaitEditPart.VISUAL_ID:
			return Wait_2023;
		case WhileEditPart.VISUAL_ID:
			return While_2024;
		case PartnerActivityEditPart.VISUAL_ID:
			return PartnerActivity_2013;
		case ElseIfEditPart.VISUAL_ID:
			return ElseIf_2025;
		case ElseEditPart.VISUAL_ID:
			return Else_2026;
		case OnAlarmEditPart.VISUAL_ID:
			return OnAlarm_2027;
		case OnEventEditPart.VISUAL_ID:
			return OnEvent_2028;
		case OnMessageEditPart.VISUAL_ID:
			return OnMessage_2029;
		case EventHandlerEditPart.VISUAL_ID:
			return EventHandler_2030;
		case OperationEditPart.VISUAL_ID:
			return Operation_2031;
		case Assign2EditPart.VISUAL_ID:
			return Assign_3001;
		case Compensate2EditPart.VISUAL_ID:
			return Compensate_3004;
		case CompensateScope2EditPart.VISUAL_ID:
			return CompensateScope_3005;
		case Empty2EditPart.VISUAL_ID:
			return Empty_3006;
		case Exit2EditPart.VISUAL_ID:
			return Exit_3007;
		case ExtensionActivity2EditPart.VISUAL_ID:
			return ExtensionActivity_3008;
		case Flow2EditPart.VISUAL_ID:
			return Flow_3009;
		case Assign3EditPart.VISUAL_ID:
			return Assign_3055;
		case Compensate3EditPart.VISUAL_ID:
			return Compensate_3056;
		case CompensateScope3EditPart.VISUAL_ID:
			return CompensateScope_3057;
		case Empty3EditPart.VISUAL_ID:
			return Empty_3058;
		case Exit3EditPart.VISUAL_ID:
			return Exit_3059;
		case ExtensionActivity3EditPart.VISUAL_ID:
			return ExtensionActivity_3060;
		case Flow3EditPart.VISUAL_ID:
			return Flow_3061;
		case ForEach2EditPart.VISUAL_ID:
			return ForEach_3062;
		case Assign4EditPart.VISUAL_ID:
			return Assign_3077;
		case Compensate4EditPart.VISUAL_ID:
			return Compensate_3078;
		case CompensateScope4EditPart.VISUAL_ID:
			return CompensateScope_3079;
		case Empty4EditPart.VISUAL_ID:
			return Empty_3080;
		case Exit4EditPart.VISUAL_ID:
			return Exit_3081;
		case ExtensionActivity4EditPart.VISUAL_ID:
			return ExtensionActivity_3082;
		case ForEach3EditPart.VISUAL_ID:
			return ForEach_3083;
		case If2EditPart.VISUAL_ID:
			return If_3084;
		case Assign5EditPart.VISUAL_ID:
			return Assign_3098;
		case Compensate5EditPart.VISUAL_ID:
			return Compensate_3099;
		case CompensateScope5EditPart.VISUAL_ID:
			return CompensateScope_3100;
		case Empty5EditPart.VISUAL_ID:
			return Empty_3101;
		case Exit5EditPart.VISUAL_ID:
			return Exit_3102;
		case ExtensionActivity5EditPart.VISUAL_ID:
			return ExtensionActivity_3103;
		case If3EditPart.VISUAL_ID:
			return If_3104;
		case ForEach4EditPart.VISUAL_ID:
			return ForEach_3105;
		case Invoke2EditPart.VISUAL_ID:
			return Invoke_3085;
		case OpaqueActivity2EditPart.VISUAL_ID:
			return OpaqueActivity_3086;
		case PartnerActivity2EditPart.VISUAL_ID:
			return PartnerActivity_3087;
		case Pick2EditPart.VISUAL_ID:
			return Pick_3088;
		case OnAlarm2EditPart.VISUAL_ID:
			return OnAlarm_3227;
		case Assign6EditPart.VISUAL_ID:
			return Assign_3228;
		case Compensate6EditPart.VISUAL_ID:
			return Compensate_3229;
		case CompensateScope6EditPart.VISUAL_ID:
			return CompensateScope_3230;
		case Empty6EditPart.VISUAL_ID:
			return Empty_3231;
		case Exit6EditPart.VISUAL_ID:
			return Exit_3232;
		case ExtensionActivity6EditPart.VISUAL_ID:
			return ExtensionActivity_3233;
		case Flow4EditPart.VISUAL_ID:
			return Flow_3234;
		case If4EditPart.VISUAL_ID:
			return If_3063;
		case Invoke3EditPart.VISUAL_ID:
			return Invoke_3163;
		case OpaqueActivity3EditPart.VISUAL_ID:
			return OpaqueActivity_3164;
		case PartnerActivity3EditPart.VISUAL_ID:
			return PartnerActivity_3165;
		case Pick3EditPart.VISUAL_ID:
			return Pick_3166;
		case OnMessage2EditPart.VISUAL_ID:
			return OnMessage_3235;
		case Assign7EditPart.VISUAL_ID:
			return Assign_3236;
		case Compensate7EditPart.VISUAL_ID:
			return Compensate_3237;
		case CompensateScope7EditPart.VISUAL_ID:
			return CompensateScope_3238;
		case Empty7EditPart.VISUAL_ID:
			return Empty_3239;
		case Exit7EditPart.VISUAL_ID:
			return Exit_3240;
		case ExtensionActivity7EditPart.VISUAL_ID:
			return ExtensionActivity_3241;
		case Flow5EditPart.VISUAL_ID:
			return Flow_3242;
		case Invoke4EditPart.VISUAL_ID:
			return Invoke_3064;
		case OpaqueActivity4EditPart.VISUAL_ID:
			return OpaqueActivity_3065;
		case PartnerActivity4EditPart.VISUAL_ID:
			return PartnerActivity_3066;
		case Pick4EditPart.VISUAL_ID:
			return Pick_3067;
		case Receive2EditPart.VISUAL_ID:
			return Receive_3068;
		case RepeatUntil2EditPart.VISUAL_ID:
			return RepeatUntil_3069;
		case Assign8EditPart.VISUAL_ID:
			return Assign_3106;
		case Compensate8EditPart.VISUAL_ID:
			return Compensate_3107;
		case CompensateScope8EditPart.VISUAL_ID:
			return CompensateScope_3108;
		case Empty8EditPart.VISUAL_ID:
			return Empty_3109;
		case Exit8EditPart.VISUAL_ID:
			return Exit_3110;
		case ExtensionActivity8EditPart.VISUAL_ID:
			return ExtensionActivity_3111;
		case RepeatUntil3EditPart.VISUAL_ID:
			return RepeatUntil_3112;
		case ForEach5EditPart.VISUAL_ID:
			return ForEach_3113;
		case Receive3EditPart.VISUAL_ID:
			return Receive_3089;
		case RepeatUntil4EditPart.VISUAL_ID:
			return RepeatUntil_3090;
		case Invoke5EditPart.VISUAL_ID:
			return Invoke_3151;
		case OpaqueActivity5EditPart.VISUAL_ID:
			return OpaqueActivity_3152;
		case PartnerActivity5EditPart.VISUAL_ID:
			return PartnerActivity_3153;
		case Pick5EditPart.VISUAL_ID:
			return Pick_3154;
		case Receive4EditPart.VISUAL_ID:
			return Receive_3155;
		case Reply2EditPart.VISUAL_ID:
			return Reply_3156;
		case Rethrow2EditPart.VISUAL_ID:
			return Rethrow_3157;
		case Scope2EditPart.VISUAL_ID:
			return Scope_3158;
		case Assign9EditPart.VISUAL_ID:
			return Assign_3114;
		case Compensate9EditPart.VISUAL_ID:
			return Compensate_3115;
		case CompensateScope9EditPart.VISUAL_ID:
			return CompensateScope_3116;
		case Empty9EditPart.VISUAL_ID:
			return Empty_3117;
		case Exit9EditPart.VISUAL_ID:
			return Exit_3118;
		case ExtensionActivity9EditPart.VISUAL_ID:
			return ExtensionActivity_3119;
		case Scope3EditPart.VISUAL_ID:
			return Scope_3120;
		case ForEach6EditPart.VISUAL_ID:
			return ForEach_3121;
		case Reply3EditPart.VISUAL_ID:
			return Reply_3091;
		case Rethrow3EditPart.VISUAL_ID:
			return Rethrow_3092;
		case Scope4EditPart.VISUAL_ID:
			return Scope_3093;
		case Invoke6EditPart.VISUAL_ID:
			return Invoke_3140;
		case OpaqueActivity6EditPart.VISUAL_ID:
			return OpaqueActivity_3141;
		case PartnerActivity6EditPart.VISUAL_ID:
			return PartnerActivity_3142;
		case Pick6EditPart.VISUAL_ID:
			return Pick_3143;
		case Receive5EditPart.VISUAL_ID:
			return Receive_3144;
		case Reply4EditPart.VISUAL_ID:
			return Reply_3145;
		case Rethrow4EditPart.VISUAL_ID:
			return Rethrow_3146;
		case Throw2EditPart.VISUAL_ID:
			return Throw_3147;
		case Validate2EditPart.VISUAL_ID:
			return Validate_3148;
		case Wait2EditPart.VISUAL_ID:
			return Wait_3149;
		case While2EditPart.VISUAL_ID:
			return While_3150;
		case Assign10EditPart.VISUAL_ID:
			return Assign_3122;
		case Compensate10EditPart.VISUAL_ID:
			return Compensate_3123;
		case CompensateScope10EditPart.VISUAL_ID:
			return CompensateScope_3124;
		case Empty10EditPart.VISUAL_ID:
			return Empty_3125;
		case Exit10EditPart.VISUAL_ID:
			return Exit_3126;
		case ExtensionActivity10EditPart.VISUAL_ID:
			return ExtensionActivity_3127;
		case Flow6EditPart.VISUAL_ID:
			return Flow_3176;
		case Reply5EditPart.VISUAL_ID:
			return Reply_3070;
		case Rethrow5EditPart.VISUAL_ID:
			return Rethrow_3071;
		case Scope5EditPart.VISUAL_ID:
			return Scope_3072;
		case EventHandler2EditPart.VISUAL_ID:
			return EventHandler_3243;
		case OnAlarm3EditPart.VISUAL_ID:
			return OnAlarm_3244;
		case ForEach7EditPart.VISUAL_ID:
			return ForEach_3245;
		case Throw3EditPart.VISUAL_ID:
			return Throw_3094;
		case Validate3EditPart.VISUAL_ID:
			return Validate_3095;
		case Wait3EditPart.VISUAL_ID:
			return Wait_3096;
		case While3EditPart.VISUAL_ID:
			return While_3097;
		case ForEach8EditPart.VISUAL_ID:
			return ForEach_3129;
		case If5EditPart.VISUAL_ID:
			return If_3177;
		case Receive6EditPart.VISUAL_ID:
			return Receive_3167;
		case RepeatUntil5EditPart.VISUAL_ID:
			return RepeatUntil_3168;
		case Throw4EditPart.VISUAL_ID:
			return Throw_3159;
		case Validate4EditPart.VISUAL_ID:
			return Validate_3160;
		case Wait4EditPart.VISUAL_ID:
			return Wait_3161;
		case While4EditPart.VISUAL_ID:
			return While_3162;
		case Invoke7EditPart.VISUAL_ID:
			return Invoke_3130;
		case OpaqueActivity7EditPart.VISUAL_ID:
			return OpaqueActivity_3131;
		case PartnerActivity7EditPart.VISUAL_ID:
			return PartnerActivity_3132;
		case Pick7EditPart.VISUAL_ID:
			return Pick_3133;
		case Receive7EditPart.VISUAL_ID:
			return Receive_3134;
		case RepeatUntil6EditPart.VISUAL_ID:
			return RepeatUntil_3178;
		case Reply6EditPart.VISUAL_ID:
			return Reply_3135;
		case Rethrow6EditPart.VISUAL_ID:
			return Rethrow_3136;
		case Scope6EditPart.VISUAL_ID:
			return Scope_3179;
		case Sequence2EditPart.VISUAL_ID:
			return Sequence_3180;
		case Assign11EditPart.VISUAL_ID:
			return Assign_3033;
		case Compensate11EditPart.VISUAL_ID:
			return Compensate_3034;
		case CompensateScope11EditPart.VISUAL_ID:
			return CompensateScope_3035;
		case Empty11EditPart.VISUAL_ID:
			return Empty_3036;
		case Exit11EditPart.VISUAL_ID:
			return Exit_3037;
		case ExtensionActivity11EditPart.VISUAL_ID:
			return ExtensionActivity_3038;
		case Flow7EditPart.VISUAL_ID:
			return Flow_3039;
		case Throw5EditPart.VISUAL_ID:
			return Throw_3073;
		case Validate5EditPart.VISUAL_ID:
			return Validate_3074;
		case Wait5EditPart.VISUAL_ID:
			return Wait_3075;
		case While5EditPart.VISUAL_ID:
			return While_3076;
		case Throw6EditPart.VISUAL_ID:
			return Throw_3137;
		case Validate6EditPart.VISUAL_ID:
			return Validate_3138;
		case Wait6EditPart.VISUAL_ID:
			return Wait_3139;
		case While6EditPart.VISUAL_ID:
			return While_3128;
		case ForEach9EditPart.VISUAL_ID:
			return ForEach_3040;
		case If6EditPart.VISUAL_ID:
			return If_3032;
		case Reply7EditPart.VISUAL_ID:
			return Reply_3169;
		case Rethrow7EditPart.VISUAL_ID:
			return Rethrow_3170;
		case Scope7EditPart.VISUAL_ID:
			return Scope_3171;
		case Throw7EditPart.VISUAL_ID:
			return Throw_3172;
		case Validate7EditPart.VISUAL_ID:
			return Validate_3173;
		case Wait7EditPart.VISUAL_ID:
			return Wait_3174;
		case While7EditPart.VISUAL_ID:
			return While_3175;
		case ElseIf2EditPart.VISUAL_ID:
			return ElseIf_3246;
		case Assign12EditPart.VISUAL_ID:
			return Assign_3181;
		case Compensate12EditPart.VISUAL_ID:
			return Compensate_3182;
		case CompensateScope12EditPart.VISUAL_ID:
			return CompensateScope_3183;
		case Empty12EditPart.VISUAL_ID:
			return Empty_3184;
		case Exit12EditPart.VISUAL_ID:
			return Exit_3185;
		case ExtensionActivity12EditPart.VISUAL_ID:
			return ExtensionActivity_3186;
		case Flow8EditPart.VISUAL_ID:
			return Flow_3187;
		case ForEach10EditPart.VISUAL_ID:
			return ForEach_3188;
		case If7EditPart.VISUAL_ID:
			return If_3189;
		case Else2EditPart.VISUAL_ID:
			return Else_3247;
		case Assign13EditPart.VISUAL_ID:
			return Assign_3204;
		case Compensate13EditPart.VISUAL_ID:
			return Compensate_3205;
		case CompensateScope13EditPart.VISUAL_ID:
			return CompensateScope_3206;
		case Empty13EditPart.VISUAL_ID:
			return Empty_3207;
		case Exit13EditPart.VISUAL_ID:
			return Exit_3208;
		case ExtensionActivity13EditPart.VISUAL_ID:
			return ExtensionActivity_3209;
		case Flow9EditPart.VISUAL_ID:
			return Flow_3210;
		case ForEach11EditPart.VISUAL_ID:
			return ForEach_3211;
		case If8EditPart.VISUAL_ID:
			return If_3212;
		case Invoke8EditPart.VISUAL_ID:
			return Invoke_3213;
		case OpaqueActivity8EditPart.VISUAL_ID:
			return OpaqueActivity_3214;
		case PartnerActivity8EditPart.VISUAL_ID:
			return PartnerActivity_3215;
		case Pick8EditPart.VISUAL_ID:
			return Pick_3216;
		case Receive8EditPart.VISUAL_ID:
			return Receive_3217;
		case RepeatUntil7EditPart.VISUAL_ID:
			return RepeatUntil_3218;
		case Reply8EditPart.VISUAL_ID:
			return Reply_3219;
		case Rethrow8EditPart.VISUAL_ID:
			return Rethrow_3220;
		case Scope8EditPart.VISUAL_ID:
			return Scope_3221;
		case Sequence3EditPart.VISUAL_ID:
			return Sequence_3222;
		case Invoke9EditPart.VISUAL_ID:
			return Invoke_3041;
		case OpaqueActivity9EditPart.VISUAL_ID:
			return OpaqueActivity_3042;
		case PartnerActivity9EditPart.VISUAL_ID:
			return PartnerActivity_3043;
		case Pick9EditPart.VISUAL_ID:
			return Pick_3044;
		case Receive9EditPart.VISUAL_ID:
			return Receive_3045;
		case RepeatUntil8EditPart.VISUAL_ID:
			return RepeatUntil_3046;
		case Reply9EditPart.VISUAL_ID:
			return Reply_3047;
		case Rethrow9EditPart.VISUAL_ID:
			return Rethrow_3048;
		case Scope9EditPart.VISUAL_ID:
			return Scope_3049;
		case Sequence4EditPart.VISUAL_ID:
			return Sequence_3050;
		case Throw8EditPart.VISUAL_ID:
			return Throw_3051;
		case Validate8EditPart.VISUAL_ID:
			return Validate_3052;
		case Wait8EditPart.VISUAL_ID:
			return Wait_3053;
		case While8EditPart.VISUAL_ID:
			return While_3054;
		case Throw9EditPart.VISUAL_ID:
			return Throw_3223;
		case Validate9EditPart.VISUAL_ID:
			return Validate_3224;
		case Wait9EditPart.VISUAL_ID:
			return Wait_3225;
		case While9EditPart.VISUAL_ID:
			return While_3226;
		case Invoke10EditPart.VISUAL_ID:
			return Invoke_3190;
		case OpaqueActivity10EditPart.VISUAL_ID:
			return OpaqueActivity_3191;
		case PartnerActivity10EditPart.VISUAL_ID:
			return PartnerActivity_3192;
		case Pick10EditPart.VISUAL_ID:
			return Pick_3193;
		case Receive10EditPart.VISUAL_ID:
			return Receive_3194;
		case RepeatUntil9EditPart.VISUAL_ID:
			return RepeatUntil_3195;
		case Reply10EditPart.VISUAL_ID:
			return Reply_3196;
		case Rethrow10EditPart.VISUAL_ID:
			return Rethrow_3197;
		case Scope10EditPart.VISUAL_ID:
			return Scope_3198;
		case Sequence5EditPart.VISUAL_ID:
			return Sequence_3199;
		case Throw10EditPart.VISUAL_ID:
			return Throw_3200;
		case Validate10EditPart.VISUAL_ID:
			return Validate_3201;
		case Wait10EditPart.VISUAL_ID:
			return Wait_3202;
		case While10EditPart.VISUAL_ID:
			return While_3203;
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
		case RepeatUntil10EditPart.VISUAL_ID:
			return RepeatUntil_3254;
		case Reply11EditPart.VISUAL_ID:
			return Reply_3255;
		case Rethrow11EditPart.VISUAL_ID:
			return Rethrow_3256;
		case Scope11EditPart.VISUAL_ID:
			return Scope_3257;
		case Sequence6EditPart.VISUAL_ID:
			return Sequence_3258;
		case Throw11EditPart.VISUAL_ID:
			return Throw_3259;
		case Validate11EditPart.VISUAL_ID:
			return Validate_3260;
		case Wait11EditPart.VISUAL_ID:
			return Wait_3261;
		case While11EditPart.VISUAL_ID:
			return While_3262;
		case OnEvent2EditPart.VISUAL_ID:
			return OnEvent_3263;
		case Assign14EditPart.VISUAL_ID:
			return Assign_3264;
		case Compensate14EditPart.VISUAL_ID:
			return Compensate_3265;
		case CompensateScope14EditPart.VISUAL_ID:
			return CompensateScope_3266;
		case Empty14EditPart.VISUAL_ID:
			return Empty_3267;
		case Exit14EditPart.VISUAL_ID:
			return Exit_3268;
		case ExtensionActivity14EditPart.VISUAL_ID:
			return ExtensionActivity_3269;
		case Flow10EditPart.VISUAL_ID:
			return Flow_3270;
		case ForEach12EditPart.VISUAL_ID:
			return ForEach_3271;
		case If10EditPart.VISUAL_ID:
			return If_3272;
		case Invoke12EditPart.VISUAL_ID:
			return Invoke_3273;
		case OpaqueActivity12EditPart.VISUAL_ID:
			return OpaqueActivity_3274;
		case PartnerActivity12EditPart.VISUAL_ID:
			return PartnerActivity_3275;
		case Pick12EditPart.VISUAL_ID:
			return Pick_3276;
		case Receive12EditPart.VISUAL_ID:
			return Receive_3277;
		case RepeatUntil11EditPart.VISUAL_ID:
			return RepeatUntil_3278;
		case Reply12EditPart.VISUAL_ID:
			return Reply_3279;
		case Rethrow12EditPart.VISUAL_ID:
			return Rethrow_3280;
		case Scope12EditPart.VISUAL_ID:
			return Scope_3281;
		case Sequence7EditPart.VISUAL_ID:
			return Sequence_3282;
		case Throw12EditPart.VISUAL_ID:
			return Throw_3283;
		case Validate12EditPart.VISUAL_ID:
			return Validate_3284;
		case Wait12EditPart.VISUAL_ID:
			return Wait_3285;
		case While12EditPart.VISUAL_ID:
			return While_3286;
		case ForEach13EditPart.VISUAL_ID:
			return ForEach_3287;
		case If11EditPart.VISUAL_ID:
			return If_3288;
		case Invoke13EditPart.VISUAL_ID:
			return Invoke_3289;
		case OpaqueActivity13EditPart.VISUAL_ID:
			return OpaqueActivity_3290;
		case PartnerActivity13EditPart.VISUAL_ID:
			return PartnerActivity_3291;
		case Pick13EditPart.VISUAL_ID:
			return Pick_3292;
		case Receive13EditPart.VISUAL_ID:
			return Receive_3293;
		case RepeatUntil12EditPart.VISUAL_ID:
			return RepeatUntil_3294;
		case Reply13EditPart.VISUAL_ID:
			return Reply_3295;
		case Rethrow13EditPart.VISUAL_ID:
			return Rethrow_3296;
		case Scope13EditPart.VISUAL_ID:
			return Scope_3297;
		case Sequence8EditPart.VISUAL_ID:
			return Sequence_3298;
		case Throw13EditPart.VISUAL_ID:
			return Throw_3299;
		case Validate13EditPart.VISUAL_ID:
			return Validate_3300;
		case Wait13EditPart.VISUAL_ID:
			return Wait_3301;
		case While13EditPart.VISUAL_ID:
			return While_3302;
		case ForEach14EditPart.VISUAL_ID:
			return ForEach_3010;
		case If12EditPart.VISUAL_ID:
			return If_3011;
		case Invoke14EditPart.VISUAL_ID:
			return Invoke_3012;
		case OpaqueActivity14EditPart.VISUAL_ID:
			return OpaqueActivity_3013;
		case PartnerActivity14EditPart.VISUAL_ID:
			return PartnerActivity_3014;
		case Pick14EditPart.VISUAL_ID:
			return Pick_3015;
		case Receive14EditPart.VISUAL_ID:
			return Receive_3016;
		case RepeatUntil13EditPart.VISUAL_ID:
			return RepeatUntil_3017;
		case Reply14EditPart.VISUAL_ID:
			return Reply_3018;
		case Rethrow14EditPart.VISUAL_ID:
			return Rethrow_3019;
		case Scope14EditPart.VISUAL_ID:
			return Scope_3020;
		case Sequence9EditPart.VISUAL_ID:
			return Sequence_3002;
		case Throw14EditPart.VISUAL_ID:
			return Throw_3021;
		case Validate14EditPart.VISUAL_ID:
			return Validate_3022;
		case Wait14EditPart.VISUAL_ID:
			return Wait_3023;
		case While14EditPart.VISUAL_ID:
			return While_3024;
		case EventHandler3EditPart.VISUAL_ID:
			return EventHandler_3303;
		case PartnerActivityOperationEditPart.VISUAL_ID:
			return PartnerActivityOperation_4001;
		}
		return null;
	}

}
