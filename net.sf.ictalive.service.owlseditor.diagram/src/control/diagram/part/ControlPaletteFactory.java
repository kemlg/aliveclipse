/*
 * 
 */
package control.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ControlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnyOrder1CreationTool());
		paletteContainer.add(createChoice2CreationTool());
		paletteContainer.add(createCondition3CreationTool());
		paletteContainer.add(createControlConstructBag4CreationTool());
		paletteContainer.add(createControlConstructList5CreationTool());
		paletteContainer.add(createExpr6CreationTool());
		paletteContainer.add(createIfThenElse7CreationTool());
		paletteContainer.add(createInput8CreationTool());
		paletteContainer.add(createLink9CreationTool());
		paletteContainer.add(createLoc10CreationTool());
		paletteContainer.add(createOntology11CreationTool());
		paletteContainer.add(createOutput12CreationTool());
		paletteContainer.add(createPerform13CreationTool());
		paletteContainer.add(createProduce14CreationTool());
		paletteContainer.add(createRemoteProcess15CreationTool());
		paletteContainer.add(createRepeatUntil16CreationTool());
		paletteContainer.add(createRepeatWhile17CreationTool());
		paletteContainer.add(createResult18CreationTool());
		paletteContainer.add(createResultVar19CreationTool());
		paletteContainer.add(createSequence20CreationTool());
		paletteContainer.add(createSet21CreationTool());
		paletteContainer.add(createSplit22CreationTool());
		paletteContainer.add(createSplitJoin23CreationTool());
		paletteContainer.add(createTemplateConstraint24CreationTool());
		paletteContainer.add(createTemplateProcess25CreationTool());
		paletteContainer.add(createValueForm26CreationTool());
		paletteContainer.add(createValueFunction27CreationTool());
		paletteContainer.add(createValueSource28CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInputBinding1CreationTool());
		paletteContainer.add(createLinkBinding2CreationTool());
		paletteContainer.add(createLocBinding3CreationTool());
		paletteContainer.add(createOutputBinding4CreationTool());
		paletteContainer.add(createOutputBindingSource5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnyOrder1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.AnyOrder_3007);
		types.add(ControlElementTypes.AnyOrder_3016);
		types.add(ControlElementTypes.AnyOrder_3023);
		types.add(ControlElementTypes.AnyOrder_3030);
		types.add(ControlElementTypes.AnyOrder_3053);
		types.add(ControlElementTypes.AnyOrder_3083);
		types.add(ControlElementTypes.AnyOrder_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AnyOrder1CreationTool_title,
				Messages.AnyOrder1CreationTool_desc, types);
		entry.setId("createAnyOrder1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.AnyOrder_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Choice_3003);
		types.add(ControlElementTypes.Choice_3006);
		types.add(ControlElementTypes.Choice_3015);
		types.add(ControlElementTypes.Choice_3022);
		types.add(ControlElementTypes.Choice_3029);
		types.add(ControlElementTypes.Choice_3052);
		types.add(ControlElementTypes.Choice_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Choice2CreationTool_title,
				Messages.Choice2CreationTool_desc, types);
		entry.setId("createChoice2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Choice_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Condition_3098);
		types.add(ControlElementTypes.Condition_3099);
		types.add(ControlElementTypes.Condition_3108);
		types.add(ControlElementTypes.Condition_3111);
		types.add(ControlElementTypes.Condition_3113);
		types.add(ControlElementTypes.Condition_3115);
		types.add(ControlElementTypes.Condition_2017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Condition3CreationTool_title,
				Messages.Condition3CreationTool_desc, types);
		entry.setId("createCondition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Condition_3098));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructBag4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types.add(ControlElementTypes.ControlConstructBag_3004);
		types.add(ControlElementTypes.ControlConstructBag_3008);
		types.add(ControlElementTypes.ControlConstructBag_3010);
		types.add(ControlElementTypes.ControlConstructBag_3012);
		types.add(ControlElementTypes.ControlConstructBag_3082);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlConstructBag4CreationTool_title,
				Messages.ControlConstructBag4CreationTool_desc, types);
		entry.setId("createControlConstructBag4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ControlElementTypes
						.getImageDescriptor(ControlElementTypes.ControlConstructBag_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructList5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ControlElementTypes.ControlConstructList_3001);
		types.add(ControlElementTypes.ControlConstructList_3093);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlConstructList5CreationTool_title,
				Messages.ControlConstructList5CreationTool_desc, types);
		entry.setId("createControlConstructList5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ControlElementTypes
						.getImageDescriptor(ControlElementTypes.ControlConstructList_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExpr6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Expr_3100);
		types.add(ControlElementTypes.Expr_3101);
		types.add(ControlElementTypes.Expr_3109);
		types.add(ControlElementTypes.Expr_3112);
		types.add(ControlElementTypes.Expr_3114);
		types.add(ControlElementTypes.Expr_3116);
		types.add(ControlElementTypes.Expr_2019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Expr6CreationTool_title,
				Messages.Expr6CreationTool_desc, types);
		entry.setId("createExpr6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Expr_3100));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIfThenElse7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.IfThenElse_3013);
		types.add(ControlElementTypes.IfThenElse_3019);
		types.add(ControlElementTypes.IfThenElse_3026);
		types.add(ControlElementTypes.IfThenElse_3033);
		types.add(ControlElementTypes.IfThenElse_3056);
		types.add(ControlElementTypes.IfThenElse_3086);
		types.add(ControlElementTypes.IfThenElse_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IfThenElse7CreationTool_title,
				Messages.IfThenElse7CreationTool_desc, types);
		entry.setId("createIfThenElse7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.IfThenElse_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ControlElementTypes.Input_2027);
		types.add(ControlElementTypes.Input_3105);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Input8CreationTool_title,
				Messages.Input8CreationTool_desc, types);
		entry.setId("createInput8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Input_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.Link_2015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Link9CreationTool_title,
				Messages.Link9CreationTool_desc, types);
		entry.setId("createLink9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Link_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoc10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.Loc_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Loc10CreationTool_title,
				Messages.Loc10CreationTool_desc, types);
		entry.setId("createLoc10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Loc_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOntology11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.Ontology_2029);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ontology11CreationTool_title,
				Messages.Ontology11CreationTool_desc, types);
		entry.setId("createOntology11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Ontology_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ControlElementTypes.Output_2028);
		types.add(ControlElementTypes.Output_3106);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Output12CreationTool_title,
				Messages.Output12CreationTool_desc, types);
		entry.setId("createOutput12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Output_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerform13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Perform_3034);
		types.add(ControlElementTypes.Perform_3061);
		types.add(ControlElementTypes.Perform_3066);
		types.add(ControlElementTypes.Perform_3071);
		types.add(ControlElementTypes.Perform_3078);
		types.add(ControlElementTypes.Perform_3089);
		types.add(ControlElementTypes.Perform_2012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Perform13CreationTool_title,
				Messages.Perform13CreationTool_desc, types);
		entry.setId("createPerform13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Perform_3034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProduce14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Produce_3043);
		types.add(ControlElementTypes.Produce_3062);
		types.add(ControlElementTypes.Produce_3067);
		types.add(ControlElementTypes.Produce_3072);
		types.add(ControlElementTypes.Produce_3079);
		types.add(ControlElementTypes.Produce_3090);
		types.add(ControlElementTypes.Produce_2013);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Produce14CreationTool_title,
				Messages.Produce14CreationTool_desc, types);
		entry.setId("createProduce14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Produce_3043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRemoteProcess15CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.RemoteProcess_3104);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RemoteProcess15CreationTool_title,
				Messages.RemoteProcess15CreationTool_desc, types);
		entry.setId("createRemoteProcess15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.RemoteProcess_3104));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatUntil16CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.RepeatUntil_3020);
		types.add(ControlElementTypes.RepeatUntil_3057);
		types.add(ControlElementTypes.RepeatUntil_3058);
		types.add(ControlElementTypes.RepeatUntil_3060);
		types.add(ControlElementTypes.RepeatUntil_3076);
		types.add(ControlElementTypes.RepeatUntil_3087);
		types.add(ControlElementTypes.RepeatUntil_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RepeatUntil16CreationTool_title,
				Messages.RepeatUntil16CreationTool_desc, types);
		entry.setId("createRepeatUntil16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.RepeatUntil_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatWhile17CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.RepeatWhile_3027);
		types.add(ControlElementTypes.RepeatWhile_3059);
		types.add(ControlElementTypes.RepeatWhile_3065);
		types.add(ControlElementTypes.RepeatWhile_3070);
		types.add(ControlElementTypes.RepeatWhile_3077);
		types.add(ControlElementTypes.RepeatWhile_3088);
		types.add(ControlElementTypes.RepeatWhile_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RepeatWhile17CreationTool_title,
				Messages.RepeatWhile17CreationTool_desc, types);
		entry.setId("createRepeatWhile17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.RepeatWhile_3027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResult18CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ControlElementTypes.Result_3107);
		types.add(ControlElementTypes.Result_2018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Result18CreationTool_title,
				Messages.Result18CreationTool_desc, types);
		entry.setId("createResult18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Result_3107));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResultVar19CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.ResultVar_3097);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ResultVar19CreationTool_title,
				Messages.ResultVar19CreationTool_desc, types);
		entry.setId("createResultVar19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.ResultVar_3097));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence20CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Sequence_2004);
		types.add(ControlElementTypes.Sequence_3002);
		types.add(ControlElementTypes.Sequence_3005);
		types.add(ControlElementTypes.Sequence_3014);
		types.add(ControlElementTypes.Sequence_3021);
		types.add(ControlElementTypes.Sequence_3028);
		types.add(ControlElementTypes.Sequence_3051);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence20CreationTool_title,
				Messages.Sequence20CreationTool_desc, types);
		entry.setId("createSequence20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Sequence_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSet21CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Set_3047);
		types.add(ControlElementTypes.Set_3063);
		types.add(ControlElementTypes.Set_3068);
		types.add(ControlElementTypes.Set_3073);
		types.add(ControlElementTypes.Set_3080);
		types.add(ControlElementTypes.Set_3091);
		types.add(ControlElementTypes.Set_2014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Set21CreationTool_title,
				Messages.Set21CreationTool_desc, types);
		entry.setId("createSet21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Set_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplit22CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.Split_3009);
		types.add(ControlElementTypes.Split_3017);
		types.add(ControlElementTypes.Split_3024);
		types.add(ControlElementTypes.Split_3031);
		types.add(ControlElementTypes.Split_3054);
		types.add(ControlElementTypes.Split_3084);
		types.add(ControlElementTypes.Split_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Split22CreationTool_title,
				Messages.Split22CreationTool_desc, types);
		entry.setId("createSplit22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.Split_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplitJoin23CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(ControlElementTypes.SplitJoin_3011);
		types.add(ControlElementTypes.SplitJoin_3018);
		types.add(ControlElementTypes.SplitJoin_3025);
		types.add(ControlElementTypes.SplitJoin_3032);
		types.add(ControlElementTypes.SplitJoin_3055);
		types.add(ControlElementTypes.SplitJoin_3085);
		types.add(ControlElementTypes.SplitJoin_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SplitJoin23CreationTool_title,
				Messages.SplitJoin23CreationTool_desc, types);
		entry.setId("createSplitJoin23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.SplitJoin_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateConstraint24CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.TemplateConstraint_2030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateConstraint24CreationTool_title,
				Messages.TemplateConstraint24CreationTool_desc, types);
		entry.setId("createTemplateConstraint24CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ControlElementTypes
						.getImageDescriptor(ControlElementTypes.TemplateConstraint_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateProcess25CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.TemplateProcess_3110);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateProcess25CreationTool_title,
				Messages.TemplateProcess25CreationTool_desc, types);
		entry.setId("createTemplateProcess25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.TemplateProcess_3110));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueForm26CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(ControlElementTypes.ValueForm_3095);
		types.add(ControlElementTypes.ValueForm_3045);
		types.add(ControlElementTypes.ValueForm_3049);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ValueForm26CreationTool_title,
				Messages.ValueForm26CreationTool_desc, types);
		entry.setId("createValueForm26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.ValueForm_3095));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueFunction27CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(ControlElementTypes.ValueFunction_3096);
		types.add(ControlElementTypes.ValueFunction_3046);
		types.add(ControlElementTypes.ValueFunction_3050);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ValueFunction27CreationTool_title,
				Messages.ValueFunction27CreationTool_desc, types);
		entry.setId("createValueFunction27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.ValueFunction_3096));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueSource28CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(ControlElementTypes.ValueSource_3094);
		types.add(ControlElementTypes.ValueSource_3044);
		types.add(ControlElementTypes.ValueSource_3048);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ValueSource28CreationTool_title,
				Messages.ValueSource28CreationTool_desc, types);
		entry.setId("createValueSource28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.ValueSource_3094));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputBinding1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.InputBinding_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InputBinding1CreationTool_title,
				Messages.InputBinding1CreationTool_desc, types);
		entry.setId("createInputBinding1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.InputBinding_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkBinding2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.LinkBinding_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LinkBinding2CreationTool_title,
				Messages.LinkBinding2CreationTool_desc, types);
		entry.setId("createLinkBinding2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.LinkBinding_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocBinding3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.LocBinding_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LocBinding3CreationTool_title,
				Messages.LocBinding3CreationTool_desc, types);
		entry.setId("createLocBinding3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.LocBinding_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputBinding4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.OutputBinding_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OutputBinding4CreationTool_title,
				Messages.OutputBinding4CreationTool_desc, types);
		entry.setId("createOutputBinding4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlElementTypes
				.getImageDescriptor(ControlElementTypes.OutputBinding_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputBindingSource5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ControlElementTypes.OutputBindingSource_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OutputBindingSource5CreationTool_title,
				Messages.OutputBindingSource5CreationTool_desc, types);
		entry.setId("createOutputBindingSource5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ControlElementTypes
						.getImageDescriptor(ControlElementTypes.OutputBindingSource_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
