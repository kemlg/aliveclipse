/*
 * 
 */
package control.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

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

import control.ControlPackage;
import control.diagram.edit.parts.*;
import control.diagram.part.ControlDiagramEditorPlugin;

/**
 * @generated
 */
public class ControlElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private ControlElementTypes() {
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
	public static final IElementType OuterProcess_1000 = getElementType("net.sf.ictalive.service.owlseditor.diagram.OuterProcess_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_2027 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Input_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_2028 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Output_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Loc_2003 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Loc_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_2004 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_2005 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_2006 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_2007 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_2008 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_2009 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_2010 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_2011 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_2012 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produce_2013 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_2014 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_2015 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Link_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_2017 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Result_2018 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Result_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ontology_2029 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Ontology_2029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TemplateConstraint_2030 = getElementType("net.sf.ictalive.service.owlseditor.diagram.TemplateConstraint_2030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Expr_2019 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructList_3001 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructList_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3002 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_3003 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_3004 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructBag_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3005 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_3006 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_3007 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_3008 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructBag_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_3009 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_3010 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructBag_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_3011 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_3012 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructBag_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_3013 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3014 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_3015 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_3016 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_3017 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_3018 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_3019 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3020 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3021 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_3022 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_3023 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_3024 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_3025 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_3026 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_3027 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3028 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_3029 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_3030 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_3031 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_3032 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_3033 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_3034 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RemoteProcess_3104 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RemoteProcess_3104"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Input_3105 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Input_3105"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Output_3106 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Output_3106"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Result_3107 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Result_3107"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValueSource_3094 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueSource_3094"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueForm_3095 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueForm_3095"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueFunction_3096 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueFunction_3096"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ResultVar_3097 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ResultVar_3097"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3098 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_3098"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3099 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_3099"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Expr_3100 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_3100"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Expr_3101 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_3101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3108 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_3108"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Expr_3109 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_3109"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TemplateProcess_3110 = getElementType("net.sf.ictalive.service.owlseditor.diagram.TemplateProcess_3110"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Produce_3043 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueSource_3044 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueSource_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueForm_3045 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueForm_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueFunction_3046 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueFunction_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_3047 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueSource_3048 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueSource_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueForm_3049 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueForm_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueFunction_3050 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ValueFunction_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequence_3051 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Sequence_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_3052 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Choice_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_3053 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_3054 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_3055 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_3056 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3057 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3058 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_3059 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_3059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3060 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_3060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_3061 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_3061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produce_3062 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_3062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_3063 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_3063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3111 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_3111"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Expr_3112 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_3112"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_3065 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_3065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_3066 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_3066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produce_3067 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_3067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_3068 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_3068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3113 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_3113"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Expr_3114 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_3114"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_3070 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_3070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_3071 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_3071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produce_3072 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_3072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_3073 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_3073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_3115 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Condition_3115"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Expr_3116 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Expr_3116"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3076 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_3076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_3077 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_3077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_3078 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_3078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produce_3079 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_3079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_3080 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_3080"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructBag_3082 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructBag_3082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOrder_3083 = getElementType("net.sf.ictalive.service.owlseditor.diagram.AnyOrder_3083"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Split_3084 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Split_3084"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitJoin_3085 = getElementType("net.sf.ictalive.service.owlseditor.diagram.SplitJoin_3085"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IfThenElse_3086 = getElementType("net.sf.ictalive.service.owlseditor.diagram.IfThenElse_3086"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatUntil_3087 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatUntil_3087"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatWhile_3088 = getElementType("net.sf.ictalive.service.owlseditor.diagram.RepeatWhile_3088"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Perform_3089 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Perform_3089"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produce_3090 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Produce_3090"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Set_3091 = getElementType("net.sf.ictalive.service.owlseditor.diagram.Set_3091"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlConstructList_3093 = getElementType("net.sf.ictalive.service.owlseditor.diagram.ControlConstructList_3093"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocBinding_4001 = getElementType("net.sf.ictalive.service.owlseditor.diagram.LocBinding_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputBinding_4002 = getElementType("net.sf.ictalive.service.owlseditor.diagram.InputBinding_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputBinding_4003 = getElementType("net.sf.ictalive.service.owlseditor.diagram.OutputBinding_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkBinding_4004 = getElementType("net.sf.ictalive.service.owlseditor.diagram.LinkBinding_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputBindingSource_4005 = getElementType("net.sf.ictalive.service.owlseditor.diagram.OutputBindingSource_4005"); //$NON-NLS-1$

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
				return ControlDiagramEditorPlugin.getInstance()
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

			elements.put(OuterProcess_1000, ControlPackage.eINSTANCE
					.getOuterProcess());

			elements.put(Input_2027, ControlPackage.eINSTANCE.getInput());

			elements.put(Output_2028, ControlPackage.eINSTANCE.getOutput());

			elements.put(Loc_2003, ControlPackage.eINSTANCE.getLoc());

			elements.put(Sequence_2004, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_2005, ControlPackage.eINSTANCE.getChoice());

			elements.put(AnyOrder_2006, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(Split_2007, ControlPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_2008, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(IfThenElse_2009, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(RepeatUntil_2010, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatWhile_2011, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(Perform_2012, ControlPackage.eINSTANCE.getPerform());

			elements.put(Produce_2013, ControlPackage.eINSTANCE.getProduce());

			elements.put(Set_2014, ControlPackage.eINSTANCE.getSet());

			elements.put(Link_2015, ControlPackage.eINSTANCE.getLink());

			elements.put(Condition_2017, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Result_2018, ControlPackage.eINSTANCE.getResult());

			elements.put(Ontology_2029, ControlPackage.eINSTANCE.getOntology());

			elements.put(TemplateConstraint_2030, ControlPackage.eINSTANCE
					.getTemplateConstraint());

			elements.put(Expr_2019, ControlPackage.eINSTANCE.getExpr());

			elements.put(ControlConstructList_3001, ControlPackage.eINSTANCE
					.getControlConstructList());

			elements.put(Sequence_3002, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_3003, ControlPackage.eINSTANCE.getChoice());

			elements.put(ControlConstructBag_3004, ControlPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(Sequence_3005, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_3006, ControlPackage.eINSTANCE.getChoice());

			elements.put(AnyOrder_3007, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(ControlConstructBag_3008, ControlPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(Split_3009, ControlPackage.eINSTANCE.getSplit());

			elements.put(ControlConstructBag_3010, ControlPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(SplitJoin_3011, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(ControlConstructBag_3012, ControlPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(IfThenElse_3013, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(Sequence_3014, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_3015, ControlPackage.eINSTANCE.getChoice());

			elements.put(AnyOrder_3016, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(Split_3017, ControlPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_3018, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(IfThenElse_3019, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(RepeatUntil_3020, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Sequence_3021, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_3022, ControlPackage.eINSTANCE.getChoice());

			elements.put(AnyOrder_3023, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(Split_3024, ControlPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_3025, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(IfThenElse_3026, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(RepeatWhile_3027, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(Sequence_3028, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_3029, ControlPackage.eINSTANCE.getChoice());

			elements.put(AnyOrder_3030, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(Split_3031, ControlPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_3032, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(IfThenElse_3033, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(Perform_3034, ControlPackage.eINSTANCE.getPerform());

			elements.put(RemoteProcess_3104, ControlPackage.eINSTANCE
					.getRemoteProcess());

			elements.put(Input_3105, ControlPackage.eINSTANCE.getInput());

			elements.put(Output_3106, ControlPackage.eINSTANCE.getOutput());

			elements.put(Result_3107, ControlPackage.eINSTANCE.getResult());

			elements.put(ValueSource_3094, ControlPackage.eINSTANCE
					.getValueSource());

			elements.put(ValueForm_3095, ControlPackage.eINSTANCE
					.getValueForm());

			elements.put(ValueFunction_3096, ControlPackage.eINSTANCE
					.getValueFunction());

			elements.put(ResultVar_3097, ControlPackage.eINSTANCE
					.getResultVar());

			elements.put(Condition_3098, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Condition_3099, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Expr_3100, ControlPackage.eINSTANCE.getExpr());

			elements.put(Expr_3101, ControlPackage.eINSTANCE.getExpr());

			elements.put(Condition_3108, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Expr_3109, ControlPackage.eINSTANCE.getExpr());

			elements.put(TemplateProcess_3110, ControlPackage.eINSTANCE
					.getTemplateProcess());

			elements.put(Produce_3043, ControlPackage.eINSTANCE.getProduce());

			elements.put(ValueSource_3044, ControlPackage.eINSTANCE
					.getValueSource());

			elements.put(ValueForm_3045, ControlPackage.eINSTANCE
					.getValueForm());

			elements.put(ValueFunction_3046, ControlPackage.eINSTANCE
					.getValueFunction());

			elements.put(Set_3047, ControlPackage.eINSTANCE.getSet());

			elements.put(ValueSource_3048, ControlPackage.eINSTANCE
					.getValueSource());

			elements.put(ValueForm_3049, ControlPackage.eINSTANCE
					.getValueForm());

			elements.put(ValueFunction_3050, ControlPackage.eINSTANCE
					.getValueFunction());

			elements.put(Sequence_3051, ControlPackage.eINSTANCE.getSequence());

			elements.put(Choice_3052, ControlPackage.eINSTANCE.getChoice());

			elements.put(AnyOrder_3053, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(Split_3054, ControlPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_3055, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(IfThenElse_3056, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(RepeatUntil_3057, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatUntil_3058, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatWhile_3059, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(RepeatUntil_3060, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(Perform_3061, ControlPackage.eINSTANCE.getPerform());

			elements.put(Produce_3062, ControlPackage.eINSTANCE.getProduce());

			elements.put(Set_3063, ControlPackage.eINSTANCE.getSet());

			elements.put(Condition_3111, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Expr_3112, ControlPackage.eINSTANCE.getExpr());

			elements.put(RepeatWhile_3065, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(Perform_3066, ControlPackage.eINSTANCE.getPerform());

			elements.put(Produce_3067, ControlPackage.eINSTANCE.getProduce());

			elements.put(Set_3068, ControlPackage.eINSTANCE.getSet());

			elements.put(Condition_3113, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Expr_3114, ControlPackage.eINSTANCE.getExpr());

			elements.put(RepeatWhile_3070, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(Perform_3071, ControlPackage.eINSTANCE.getPerform());

			elements.put(Produce_3072, ControlPackage.eINSTANCE.getProduce());

			elements.put(Set_3073, ControlPackage.eINSTANCE.getSet());

			elements.put(Condition_3115, ControlPackage.eINSTANCE
					.getCondition());

			elements.put(Expr_3116, ControlPackage.eINSTANCE.getExpr());

			elements.put(RepeatUntil_3076, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatWhile_3077, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(Perform_3078, ControlPackage.eINSTANCE.getPerform());

			elements.put(Produce_3079, ControlPackage.eINSTANCE.getProduce());

			elements.put(Set_3080, ControlPackage.eINSTANCE.getSet());

			elements.put(ControlConstructBag_3082, ControlPackage.eINSTANCE
					.getControlConstructBag());

			elements.put(AnyOrder_3083, ControlPackage.eINSTANCE.getAnyOrder());

			elements.put(Split_3084, ControlPackage.eINSTANCE.getSplit());

			elements.put(SplitJoin_3085, ControlPackage.eINSTANCE
					.getSplitJoin());

			elements.put(IfThenElse_3086, ControlPackage.eINSTANCE
					.getIfThenElse());

			elements.put(RepeatUntil_3087, ControlPackage.eINSTANCE
					.getRepeatUntil());

			elements.put(RepeatWhile_3088, ControlPackage.eINSTANCE
					.getRepeatWhile());

			elements.put(Perform_3089, ControlPackage.eINSTANCE.getPerform());

			elements.put(Produce_3090, ControlPackage.eINSTANCE.getProduce());

			elements.put(Set_3091, ControlPackage.eINSTANCE.getSet());

			elements.put(ControlConstructList_3093, ControlPackage.eINSTANCE
					.getControlConstructList());

			elements.put(LocBinding_4001, ControlPackage.eINSTANCE
					.getLocBinding());

			elements.put(InputBinding_4002, ControlPackage.eINSTANCE
					.getInputBinding());

			elements.put(OutputBinding_4003, ControlPackage.eINSTANCE
					.getOutputBinding());

			elements.put(LinkBinding_4004, ControlPackage.eINSTANCE
					.getLinkBinding());

			elements.put(OutputBindingSource_4005, ControlPackage.eINSTANCE
					.getoutputBindingSource());
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
			KNOWN_ELEMENT_TYPES.add(OuterProcess_1000);
			KNOWN_ELEMENT_TYPES.add(Input_2027);
			KNOWN_ELEMENT_TYPES.add(Output_2028);
			KNOWN_ELEMENT_TYPES.add(Loc_2003);
			KNOWN_ELEMENT_TYPES.add(Sequence_2004);
			KNOWN_ELEMENT_TYPES.add(Choice_2005);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_2006);
			KNOWN_ELEMENT_TYPES.add(Split_2007);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_2008);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_2009);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_2010);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_2011);
			KNOWN_ELEMENT_TYPES.add(Perform_2012);
			KNOWN_ELEMENT_TYPES.add(Produce_2013);
			KNOWN_ELEMENT_TYPES.add(Set_2014);
			KNOWN_ELEMENT_TYPES.add(Link_2015);
			KNOWN_ELEMENT_TYPES.add(Condition_2017);
			KNOWN_ELEMENT_TYPES.add(Result_2018);
			KNOWN_ELEMENT_TYPES.add(Ontology_2029);
			KNOWN_ELEMENT_TYPES.add(TemplateConstraint_2030);
			KNOWN_ELEMENT_TYPES.add(Expr_2019);
			KNOWN_ELEMENT_TYPES.add(ControlConstructList_3001);
			KNOWN_ELEMENT_TYPES.add(Sequence_3002);
			KNOWN_ELEMENT_TYPES.add(Choice_3003);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_3004);
			KNOWN_ELEMENT_TYPES.add(Sequence_3005);
			KNOWN_ELEMENT_TYPES.add(Choice_3006);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_3007);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_3008);
			KNOWN_ELEMENT_TYPES.add(Split_3009);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_3010);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_3011);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_3012);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_3013);
			KNOWN_ELEMENT_TYPES.add(Sequence_3014);
			KNOWN_ELEMENT_TYPES.add(Choice_3015);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_3016);
			KNOWN_ELEMENT_TYPES.add(Split_3017);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_3018);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_3019);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3020);
			KNOWN_ELEMENT_TYPES.add(Sequence_3021);
			KNOWN_ELEMENT_TYPES.add(Choice_3022);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_3023);
			KNOWN_ELEMENT_TYPES.add(Split_3024);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_3025);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_3026);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_3027);
			KNOWN_ELEMENT_TYPES.add(Sequence_3028);
			KNOWN_ELEMENT_TYPES.add(Choice_3029);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_3030);
			KNOWN_ELEMENT_TYPES.add(Split_3031);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_3032);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_3033);
			KNOWN_ELEMENT_TYPES.add(Perform_3034);
			KNOWN_ELEMENT_TYPES.add(RemoteProcess_3104);
			KNOWN_ELEMENT_TYPES.add(Input_3105);
			KNOWN_ELEMENT_TYPES.add(Output_3106);
			KNOWN_ELEMENT_TYPES.add(Result_3107);
			KNOWN_ELEMENT_TYPES.add(ValueSource_3094);
			KNOWN_ELEMENT_TYPES.add(ValueForm_3095);
			KNOWN_ELEMENT_TYPES.add(ValueFunction_3096);
			KNOWN_ELEMENT_TYPES.add(ResultVar_3097);
			KNOWN_ELEMENT_TYPES.add(Condition_3098);
			KNOWN_ELEMENT_TYPES.add(Condition_3099);
			KNOWN_ELEMENT_TYPES.add(Expr_3100);
			KNOWN_ELEMENT_TYPES.add(Expr_3101);
			KNOWN_ELEMENT_TYPES.add(Condition_3108);
			KNOWN_ELEMENT_TYPES.add(Expr_3109);
			KNOWN_ELEMENT_TYPES.add(TemplateProcess_3110);
			KNOWN_ELEMENT_TYPES.add(Produce_3043);
			KNOWN_ELEMENT_TYPES.add(ValueSource_3044);
			KNOWN_ELEMENT_TYPES.add(ValueForm_3045);
			KNOWN_ELEMENT_TYPES.add(ValueFunction_3046);
			KNOWN_ELEMENT_TYPES.add(Set_3047);
			KNOWN_ELEMENT_TYPES.add(ValueSource_3048);
			KNOWN_ELEMENT_TYPES.add(ValueForm_3049);
			KNOWN_ELEMENT_TYPES.add(ValueFunction_3050);
			KNOWN_ELEMENT_TYPES.add(Sequence_3051);
			KNOWN_ELEMENT_TYPES.add(Choice_3052);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_3053);
			KNOWN_ELEMENT_TYPES.add(Split_3054);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_3055);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_3056);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3057);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3058);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_3059);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3060);
			KNOWN_ELEMENT_TYPES.add(Perform_3061);
			KNOWN_ELEMENT_TYPES.add(Produce_3062);
			KNOWN_ELEMENT_TYPES.add(Set_3063);
			KNOWN_ELEMENT_TYPES.add(Condition_3111);
			KNOWN_ELEMENT_TYPES.add(Expr_3112);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_3065);
			KNOWN_ELEMENT_TYPES.add(Perform_3066);
			KNOWN_ELEMENT_TYPES.add(Produce_3067);
			KNOWN_ELEMENT_TYPES.add(Set_3068);
			KNOWN_ELEMENT_TYPES.add(Condition_3113);
			KNOWN_ELEMENT_TYPES.add(Expr_3114);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_3070);
			KNOWN_ELEMENT_TYPES.add(Perform_3071);
			KNOWN_ELEMENT_TYPES.add(Produce_3072);
			KNOWN_ELEMENT_TYPES.add(Set_3073);
			KNOWN_ELEMENT_TYPES.add(Condition_3115);
			KNOWN_ELEMENT_TYPES.add(Expr_3116);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3076);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_3077);
			KNOWN_ELEMENT_TYPES.add(Perform_3078);
			KNOWN_ELEMENT_TYPES.add(Produce_3079);
			KNOWN_ELEMENT_TYPES.add(Set_3080);
			KNOWN_ELEMENT_TYPES.add(ControlConstructBag_3082);
			KNOWN_ELEMENT_TYPES.add(AnyOrder_3083);
			KNOWN_ELEMENT_TYPES.add(Split_3084);
			KNOWN_ELEMENT_TYPES.add(SplitJoin_3085);
			KNOWN_ELEMENT_TYPES.add(IfThenElse_3086);
			KNOWN_ELEMENT_TYPES.add(RepeatUntil_3087);
			KNOWN_ELEMENT_TYPES.add(RepeatWhile_3088);
			KNOWN_ELEMENT_TYPES.add(Perform_3089);
			KNOWN_ELEMENT_TYPES.add(Produce_3090);
			KNOWN_ELEMENT_TYPES.add(Set_3091);
			KNOWN_ELEMENT_TYPES.add(ControlConstructList_3093);
			KNOWN_ELEMENT_TYPES.add(LocBinding_4001);
			KNOWN_ELEMENT_TYPES.add(InputBinding_4002);
			KNOWN_ELEMENT_TYPES.add(OutputBinding_4003);
			KNOWN_ELEMENT_TYPES.add(LinkBinding_4004);
			KNOWN_ELEMENT_TYPES.add(OutputBindingSource_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case OuterProcessEditPart.VISUAL_ID:
			return OuterProcess_1000;
		case InputEditPart.VISUAL_ID:
			return Input_2027;
		case OutputEditPart.VISUAL_ID:
			return Output_2028;
		case LocEditPart.VISUAL_ID:
			return Loc_2003;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_2004;
		case ChoiceEditPart.VISUAL_ID:
			return Choice_2005;
		case AnyOrderEditPart.VISUAL_ID:
			return AnyOrder_2006;
		case SplitEditPart.VISUAL_ID:
			return Split_2007;
		case SplitJoinEditPart.VISUAL_ID:
			return SplitJoin_2008;
		case IfThenElseEditPart.VISUAL_ID:
			return IfThenElse_2009;
		case RepeatUntilEditPart.VISUAL_ID:
			return RepeatUntil_2010;
		case RepeatWhileEditPart.VISUAL_ID:
			return RepeatWhile_2011;
		case PerformEditPart.VISUAL_ID:
			return Perform_2012;
		case ProduceEditPart.VISUAL_ID:
			return Produce_2013;
		case SetEditPart.VISUAL_ID:
			return Set_2014;
		case LinkEditPart.VISUAL_ID:
			return Link_2015;
		case ConditionEditPart.VISUAL_ID:
			return Condition_2017;
		case ResultEditPart.VISUAL_ID:
			return Result_2018;
		case OntologyEditPart.VISUAL_ID:
			return Ontology_2029;
		case TemplateConstraintEditPart.VISUAL_ID:
			return TemplateConstraint_2030;
		case ExprEditPart.VISUAL_ID:
			return Expr_2019;
		case ControlConstructListEditPart.VISUAL_ID:
			return ControlConstructList_3001;
		case Sequence2EditPart.VISUAL_ID:
			return Sequence_3002;
		case Choice2EditPart.VISUAL_ID:
			return Choice_3003;
		case ControlConstructBagEditPart.VISUAL_ID:
			return ControlConstructBag_3004;
		case Sequence3EditPart.VISUAL_ID:
			return Sequence_3005;
		case Choice3EditPart.VISUAL_ID:
			return Choice_3006;
		case AnyOrder2EditPart.VISUAL_ID:
			return AnyOrder_3007;
		case ControlConstructBag2EditPart.VISUAL_ID:
			return ControlConstructBag_3008;
		case Split2EditPart.VISUAL_ID:
			return Split_3009;
		case ControlConstructBag3EditPart.VISUAL_ID:
			return ControlConstructBag_3010;
		case SplitJoin2EditPart.VISUAL_ID:
			return SplitJoin_3011;
		case ControlConstructBag4EditPart.VISUAL_ID:
			return ControlConstructBag_3012;
		case IfThenElse2EditPart.VISUAL_ID:
			return IfThenElse_3013;
		case Sequence4EditPart.VISUAL_ID:
			return Sequence_3014;
		case Choice4EditPart.VISUAL_ID:
			return Choice_3015;
		case AnyOrder3EditPart.VISUAL_ID:
			return AnyOrder_3016;
		case Split3EditPart.VISUAL_ID:
			return Split_3017;
		case SplitJoin3EditPart.VISUAL_ID:
			return SplitJoin_3018;
		case IfThenElse3EditPart.VISUAL_ID:
			return IfThenElse_3019;
		case RepeatUntil2EditPart.VISUAL_ID:
			return RepeatUntil_3020;
		case Sequence5EditPart.VISUAL_ID:
			return Sequence_3021;
		case Choice5EditPart.VISUAL_ID:
			return Choice_3022;
		case AnyOrder4EditPart.VISUAL_ID:
			return AnyOrder_3023;
		case Split4EditPart.VISUAL_ID:
			return Split_3024;
		case SplitJoin4EditPart.VISUAL_ID:
			return SplitJoin_3025;
		case IfThenElse4EditPart.VISUAL_ID:
			return IfThenElse_3026;
		case RepeatWhile2EditPart.VISUAL_ID:
			return RepeatWhile_3027;
		case Sequence6EditPart.VISUAL_ID:
			return Sequence_3028;
		case Choice6EditPart.VISUAL_ID:
			return Choice_3029;
		case AnyOrder5EditPart.VISUAL_ID:
			return AnyOrder_3030;
		case Split5EditPart.VISUAL_ID:
			return Split_3031;
		case SplitJoin5EditPart.VISUAL_ID:
			return SplitJoin_3032;
		case IfThenElse5EditPart.VISUAL_ID:
			return IfThenElse_3033;
		case Perform2EditPart.VISUAL_ID:
			return Perform_3034;
		case RemoteProcessEditPart.VISUAL_ID:
			return RemoteProcess_3104;
		case Input2EditPart.VISUAL_ID:
			return Input_3105;
		case Output2EditPart.VISUAL_ID:
			return Output_3106;
		case Result2EditPart.VISUAL_ID:
			return Result_3107;
		case ValueSourceEditPart.VISUAL_ID:
			return ValueSource_3094;
		case ValueFormEditPart.VISUAL_ID:
			return ValueForm_3095;
		case ValueFunctionEditPart.VISUAL_ID:
			return ValueFunction_3096;
		case ResultVarEditPart.VISUAL_ID:
			return ResultVar_3097;
		case Condition2EditPart.VISUAL_ID:
			return Condition_3098;
		case Condition3EditPart.VISUAL_ID:
			return Condition_3099;
		case Expr2EditPart.VISUAL_ID:
			return Expr_3100;
		case Expr3EditPart.VISUAL_ID:
			return Expr_3101;
		case Condition4EditPart.VISUAL_ID:
			return Condition_3108;
		case Expr4EditPart.VISUAL_ID:
			return Expr_3109;
		case TemplateProcessEditPart.VISUAL_ID:
			return TemplateProcess_3110;
		case Produce2EditPart.VISUAL_ID:
			return Produce_3043;
		case ValueSource2EditPart.VISUAL_ID:
			return ValueSource_3044;
		case ValueForm2EditPart.VISUAL_ID:
			return ValueForm_3045;
		case ValueFunction2EditPart.VISUAL_ID:
			return ValueFunction_3046;
		case Set2EditPart.VISUAL_ID:
			return Set_3047;
		case ValueSource3EditPart.VISUAL_ID:
			return ValueSource_3048;
		case ValueForm3EditPart.VISUAL_ID:
			return ValueForm_3049;
		case ValueFunction3EditPart.VISUAL_ID:
			return ValueFunction_3050;
		case Sequence7EditPart.VISUAL_ID:
			return Sequence_3051;
		case Choice7EditPart.VISUAL_ID:
			return Choice_3052;
		case AnyOrder6EditPart.VISUAL_ID:
			return AnyOrder_3053;
		case Split6EditPart.VISUAL_ID:
			return Split_3054;
		case SplitJoin6EditPart.VISUAL_ID:
			return SplitJoin_3055;
		case IfThenElse6EditPart.VISUAL_ID:
			return IfThenElse_3056;
		case RepeatUntil3EditPart.VISUAL_ID:
			return RepeatUntil_3057;
		case RepeatUntil4EditPart.VISUAL_ID:
			return RepeatUntil_3058;
		case RepeatWhile3EditPart.VISUAL_ID:
			return RepeatWhile_3059;
		case RepeatUntil5EditPart.VISUAL_ID:
			return RepeatUntil_3060;
		case Perform3EditPart.VISUAL_ID:
			return Perform_3061;
		case Produce3EditPart.VISUAL_ID:
			return Produce_3062;
		case Set3EditPart.VISUAL_ID:
			return Set_3063;
		case Condition5EditPart.VISUAL_ID:
			return Condition_3111;
		case Expr5EditPart.VISUAL_ID:
			return Expr_3112;
		case RepeatWhile4EditPart.VISUAL_ID:
			return RepeatWhile_3065;
		case Perform4EditPart.VISUAL_ID:
			return Perform_3066;
		case Produce4EditPart.VISUAL_ID:
			return Produce_3067;
		case Set4EditPart.VISUAL_ID:
			return Set_3068;
		case Condition6EditPart.VISUAL_ID:
			return Condition_3113;
		case Expr6EditPart.VISUAL_ID:
			return Expr_3114;
		case RepeatWhile5EditPart.VISUAL_ID:
			return RepeatWhile_3070;
		case Perform5EditPart.VISUAL_ID:
			return Perform_3071;
		case Produce5EditPart.VISUAL_ID:
			return Produce_3072;
		case Set5EditPart.VISUAL_ID:
			return Set_3073;
		case Condition7EditPart.VISUAL_ID:
			return Condition_3115;
		case Expr7EditPart.VISUAL_ID:
			return Expr_3116;
		case RepeatUntil6EditPart.VISUAL_ID:
			return RepeatUntil_3076;
		case RepeatWhile6EditPart.VISUAL_ID:
			return RepeatWhile_3077;
		case Perform6EditPart.VISUAL_ID:
			return Perform_3078;
		case Produce6EditPart.VISUAL_ID:
			return Produce_3079;
		case Set6EditPart.VISUAL_ID:
			return Set_3080;
		case ControlConstructBag5EditPart.VISUAL_ID:
			return ControlConstructBag_3082;
		case AnyOrder7EditPart.VISUAL_ID:
			return AnyOrder_3083;
		case Split7EditPart.VISUAL_ID:
			return Split_3084;
		case SplitJoin7EditPart.VISUAL_ID:
			return SplitJoin_3085;
		case IfThenElse7EditPart.VISUAL_ID:
			return IfThenElse_3086;
		case RepeatUntil7EditPart.VISUAL_ID:
			return RepeatUntil_3087;
		case RepeatWhile7EditPart.VISUAL_ID:
			return RepeatWhile_3088;
		case Perform7EditPart.VISUAL_ID:
			return Perform_3089;
		case Produce7EditPart.VISUAL_ID:
			return Produce_3090;
		case Set7EditPart.VISUAL_ID:
			return Set_3091;
		case ControlConstructList2EditPart.VISUAL_ID:
			return ControlConstructList_3093;
		case LocBindingEditPart.VISUAL_ID:
			return LocBinding_4001;
		case InputBindingEditPart.VISUAL_ID:
			return InputBinding_4002;
		case OutputBindingEditPart.VISUAL_ID:
			return OutputBinding_4003;
		case LinkBindingEditPart.VISUAL_ID:
			return LinkBinding_4004;
		case OutputBindingSourceEditPart.VISUAL_ID:
			return OutputBindingSource_4005;
		}
		return null;
	}

}
