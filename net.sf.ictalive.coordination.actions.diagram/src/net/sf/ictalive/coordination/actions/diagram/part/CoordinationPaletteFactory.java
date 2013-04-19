package net.sf.ictalive.coordination.actions.diagram.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class CoordinationPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createActions1Group());
		paletteRoot.add(createControlConstructs2Group());
		paletteRoot.add(createSWRL3Group());
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private PaletteContainer createActions1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Actions1Group_title);
		paletteContainer.setId("createActions1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtomicAction1CreationTool());
		paletteContainer.add(createCompositeAction2CreationTool());
		paletteContainer.add(createIsperformedbyrelationship3CreationTool());
		paletteContainer.add(createInput4CreationTool());
		paletteContainer.add(createOutput5CreationTool());
		paletteContainer.add(createHasinputrelationship6CreationTool());
		paletteContainer.add(createHasoutputrelationship7CreationTool());
		paletteContainer.add(createPrecondition8CreationTool());
		paletteContainer.add(createAtomicActionResult9CreationTool());
		paletteContainer.add(createCostDistribution10CreationTool());
		paletteContainer.add(createDurationDistribution11CreationTool());
		paletteContainer.add(createQualityDistribution12CreationTool());
		paletteContainer.add(createAtomicActionResultAddEffect13CreationTool());
		paletteContainer
				.add(createAtomicActionResultDeleteEffect14CreationTool());
		paletteContainer.add(createInputBinding15CreationTool());
		paletteContainer.add(createHasinputbindingrelationship16CreationTool());
		paletteContainer.add(createToparamrelationship17CreationTool());
		paletteContainer.add(createValuefromrelationship18CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Control Constructs" palette tool group
	 * @generated
	 */
	private PaletteContainer createControlConstructs2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ControlConstructs2Group_title);
		paletteContainer.setId("createControlConstructs2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.ControlConstructs2Group_desc);
		paletteContainer.add(createComposedofrelationship1CreationTool());
		paletteContainer.add(createPerform2CreationTool());
		paletteContainer.add(createPerformactionrelationship3CreationTool());
		paletteContainer.add(createAnyOrder4CreationTool());
		paletteContainer.add(createChoice5CreationTool());
		paletteContainer.add(createSplit6CreationTool());
		paletteContainer.add(createSplitJoin7CreationTool());
		paletteContainer.add(createControlConstructBag8CreationTool());
		paletteContainer.add(createSequence9CreationTool());
		paletteContainer.add(createControlConstructList10CreationTool());
		paletteContainer.add(createComponentsrelationship11CreationTool());
		paletteContainer
				.add(createControlconstructbaglistrestrelationship12CreationTool());
		paletteContainer
				.add(createControlconstructbaglistfirstrelationship13CreationTool());
		paletteContainer.add(createIfThenElse14CreationTool());
		paletteContainer.add(createRepeatUntil15CreationTool());
		paletteContainer.add(createCondition16CreationTool());
		paletteContainer.add(createThenrelationship17CreationTool());
		paletteContainer.add(createElserelationship18CreationTool());
		paletteContainer.add(createRepeatWhile19CreationTool());
		paletteContainer.add(createRepeatconnection20CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "SWRL" palette tool group
	 * @generated
	 */
	private PaletteContainer createSWRL3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.SWRL3Group_title);
		paletteContainer.setId("createSWRL3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.SWRL3Group_desc);
		paletteContainer.add(createAtomList1CreationTool());
		paletteContainer.add(createClassAtom2CreationTool());
		paletteContainer.add(createIndividualID3CreationTool());
		paletteContainer.add(createIndividualVariable4CreationTool());
		paletteContainer.add(createIndividualPropertyAtom5CreationTool());
		paletteContainer.add(createSameAsAtom6CreationTool());
		paletteContainer.add(createDifferentFromAtom7CreationTool());
		paletteContainer.add(createBuiltInAtom8CreationTool());
		paletteContainer.add(createDataRangeAtom9CreationTool());
		paletteContainer.add(createDataLiteral10CreationTool());
		paletteContainer.add(createDataValue11CreationTool());
		paletteContainer.add(createDataVariable12CreationTool());
		paletteContainer.add(createDataValuedPropertyAtom13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicAction1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AtomicAction_2025);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomicAction1CreationTool_title,
				Messages.AtomicAction1CreationTool_desc, types);
		entry.setId("createAtomicAction1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.AtomicAction_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeAction2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.CompositeAction_2024);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeAction2CreationTool_title,
				Messages.CompositeAction2CreationTool_desc, types);
		entry.setId("createCompositeAction2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.CompositeAction_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsperformedbyrelationship3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ProcessPerformedBy_4028);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Isperformedbyrelationship3CreationTool_title, null,
				types);
		entry.setId("createIsperformedbyrelationship3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ProcessPerformedBy_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Input_2026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Input4CreationTool_title,
				Messages.Input4CreationTool_desc, types);
		entry.setId("createInput4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Input_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Output_2027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Output5CreationTool_title,
				Messages.Output5CreationTool_desc, types);
		entry.setId("createOutput5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Output_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHasinputrelationship6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ProcessHasInput_4026);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Hasinputrelationship6CreationTool_title, null, types);
		entry.setId("createHasinputrelationship6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ProcessHasInput_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHasoutputrelationship7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ProcessHasOutput_4027);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Hasoutputrelationship7CreationTool_title, null, types);
		entry.setId("createHasoutputrelationship7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ProcessHasOutput_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrecondition8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.Condition_3054);
		types.add(CoordinationElementTypes.Condition_3080);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Precondition8CreationTool_title, null, types);
		entry.setId("createPrecondition8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Condition_3054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicActionResult9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AtomicActionResult_3081);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomicActionResult9CreationTool_title, null, types);
		entry.setId("createAtomicActionResult9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.AtomicActionResult_3081));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCostDistribution10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Distribution_3084);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CostDistribution10CreationTool_title, null, types);
		entry.setId("createCostDistribution10CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.Distribution_3084));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDurationDistribution11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Distribution_3085);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DurationDistribution11CreationTool_title, null, types);
		entry.setId("createDurationDistribution11CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.Distribution_3085));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQualityDistribution12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Distribution_3086);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.QualityDistribution12CreationTool_title, null, types);
		entry.setId("createQualityDistribution12CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.Distribution_3086));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicActionResultAddEffect13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Expression_3082);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomicActionResultAddEffect13CreationTool_title, null,
				types);
		entry.setId("createAtomicActionResultAddEffect13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Expression_3082));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicActionResultDeleteEffect14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Expression_3083);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomicActionResultDeleteEffect14CreationTool_title,
				Messages.AtomicActionResultDeleteEffect14CreationTool_desc,
				types);
		entry.setId("createAtomicActionResultDeleteEffect14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Expression_3083));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputBinding15CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.InputBinding_2038);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputBinding15CreationTool_title, null, types);
		entry.setId("createInputBinding15CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.InputBinding_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHasinputbindingrelationship16CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.PerformHasDataFrom_4042);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Hasinputbindingrelationship16CreationTool_title, null,
				types);
		entry.setId("createHasinputbindingrelationship16CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.PerformHasDataFrom_4042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToparamrelationship17CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.BindingToParam_4044);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Toparamrelationship17CreationTool_title, null, types);
		entry.setId("createToparamrelationship17CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.BindingToParam_4044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValuefromrelationship18CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.BindingValueFrom_4043);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Valuefromrelationship18CreationTool_title, null, types);
		entry.setId("createValuefromrelationship18CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.BindingValueFrom_4043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposedofrelationship1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.CompositeProcessComposedOf_4029);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Composedofrelationship1CreationTool_title,
				Messages.Composedofrelationship1CreationTool_desc, types);
		entry.setId("createComposedofrelationship1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.CompositeProcessComposedOf_4029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerform2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Perform_2032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Perform2CreationTool_title, null, types);
		entry.setId("createPerform2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Perform_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerformactionrelationship3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.PerformProcess_4030);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Performactionrelationship3CreationTool_title, null,
				types);
		entry.setId("createPerformactionrelationship3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.PerformProcess_4030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnyOrder4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AnyOrder_2030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AnyOrder4CreationTool_title,
				Messages.AnyOrder4CreationTool_desc, types);
		entry.setId("createAnyOrder4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.AnyOrder_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Choice_2033);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Choice5CreationTool_title, null, types);
		entry.setId("createChoice5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Choice_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplit6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Split_2039);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Split6CreationTool_title,
				Messages.Split6CreationTool_desc, types);
		entry.setId("createSplit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Split_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplitJoin7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.SplitJoin_2040);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SplitJoin7CreationTool_title, null, types);
		entry.setId("createSplitJoin7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.SplitJoin_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructBag8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ControlConstructBag_2031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlConstructBag8CreationTool_title,
				Messages.ControlConstructBag8CreationTool_desc, types);
		entry.setId("createControlConstructBag8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructBag_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Sequence_2029);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence9CreationTool_title,
				Messages.Sequence9CreationTool_desc, types);
		entry.setId("createSequence9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Sequence_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructList10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ControlConstructList_2034);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlConstructList10CreationTool_title, null, types);
		entry.setId("createControlConstructList10CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructList_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentsrelationship11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types.add(CoordinationElementTypes.ChoiceComponents_4031);
		types.add(CoordinationElementTypes.AnyOrderComponents_4032);
		types.add(CoordinationElementTypes.SequenceComponents_4033);
		types.add(CoordinationElementTypes.SplitComponents_4045);
		types.add(CoordinationElementTypes.SplitJoinComponents_4046);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Componentsrelationship11CreationTool_title,
				Messages.Componentsrelationship11CreationTool_desc, types);
		entry.setId("createComponentsrelationship11CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ChoiceComponents_4031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlconstructbaglistrestrelationship12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.ControlConstructBagRest_4034);
		types.add(CoordinationElementTypes.ControlConstructListRest_4035);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Controlconstructbaglistrestrelationship12CreationTool_title,
				null, types);
		entry
				.setId("createControlconstructbaglistrestrelationship12CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructBagRest_4034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlconstructbaglistfirstrelationship13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.ControlConstructBagFirst_4040);
		types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Controlconstructbaglistfirstrelationship13CreationTool_title,
				null, types);
		entry
				.setId("createControlconstructbaglistfirstrelationship13CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructBagFirst_4040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIfThenElse14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.IfThenElse_2037);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IfThenElse14CreationTool_title,
				Messages.IfThenElse14CreationTool_desc, types);
		entry.setId("createIfThenElse14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.IfThenElse_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatUntil15CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.RepeatUntil_2035);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RepeatUntil15CreationTool_title, null, types);
		entry.setId("createRepeatUntil15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.RepeatUntil_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition16CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(CoordinationElementTypes.Condition_3087);
		types.add(CoordinationElementTypes.Condition_3088);
		types.add(CoordinationElementTypes.Condition_3089);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Condition16CreationTool_title, null, types);
		entry.setId("createCondition16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Condition_3087));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThenrelationship17CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.IfThenElseThen_4036);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Thenrelationship17CreationTool_title, null, types);
		entry.setId("createThenrelationship17CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IfThenElseThen_4036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElserelationship18CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.IfThenElseElse_4037);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Elserelationship18CreationTool_title, null, types);
		entry.setId("createElserelationship18CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IfThenElseElse_4037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatWhile19CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.RepeatWhile_2036);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RepeatWhile19CreationTool_title,
				Messages.RepeatWhile19CreationTool_desc, types);
		entry.setId("createRepeatWhile19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.RepeatWhile_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatconnection20CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.RepeatUntilUntilProcess_4038);
		types.add(CoordinationElementTypes.RepeatWhileWhileProcess_4039);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Repeatconnection20CreationTool_title, null, types);
		entry.setId("createRepeatconnection20CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.RepeatUntilUntilProcess_4038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomList1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AtomList_3055);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomList1CreationTool_title,
				Messages.AtomList1CreationTool_desc, types);
		entry.setId("createAtomList1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.AtomList_3055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassAtom2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ClassAtom_3056);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClassAtom2CreationTool_title, null, types);
		entry.setId("createClassAtom2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.ClassAtom_3056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividualID3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(CoordinationElementTypes.IndividualID_3057);
		types.add(CoordinationElementTypes.IndividualID_3060);
		types.add(CoordinationElementTypes.IndividualID_3062);
		types.add(CoordinationElementTypes.IndividualID_3065);
		types.add(CoordinationElementTypes.IndividualID_3068);
		types.add(CoordinationElementTypes.IndividualID_3077);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndividualID3CreationTool_title, null, types);
		entry.setId("createIndividualID3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IndividualID_3057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividualVariable4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(CoordinationElementTypes.IndividualVariable_3058);
		types.add(CoordinationElementTypes.IndividualVariable_3061);
		types.add(CoordinationElementTypes.IndividualVariable_3063);
		types.add(CoordinationElementTypes.IndividualVariable_3066);
		types.add(CoordinationElementTypes.IndividualVariable_3069);
		types.add(CoordinationElementTypes.IndividualVariable_3076);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndividualVariable4CreationTool_title, null, types);
		entry.setId("createIndividualVariable4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IndividualVariable_3058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividualPropertyAtom5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.IndividualPropertyAtom_3059);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndividualPropertyAtom5CreationTool_title, null, types);
		entry.setId("createIndividualPropertyAtom5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IndividualPropertyAtom_3059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSameAsAtom6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.SameIndividualAtom_3064);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SameAsAtom6CreationTool_title, null, types);
		entry.setId("createSameAsAtom6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.SameIndividualAtom_3064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDifferentFromAtom7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.DifferentIndividualsAtom_3067);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DifferentFromAtom7CreationTool_title, null, types);
		entry.setId("createDifferentFromAtom7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DifferentIndividualsAtom_3067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBuiltInAtom8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.BuiltInAtom_3070);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BuiltInAtom8CreationTool_title,
				Messages.BuiltInAtom8CreationTool_desc, types);
		entry.setId("createBuiltInAtom8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.BuiltInAtom_3070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataRangeAtom9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.DataRangeAtom_3071);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataRangeAtom9CreationTool_title, null, types);
		entry.setId("createDataRangeAtom9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DataRangeAtom_3071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataLiteral10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.DataLiteral_3072);
		types.add(CoordinationElementTypes.DataLiteral_3078);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataLiteral10CreationTool_title, null, types);
		entry.setId("createDataLiteral10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.DataLiteral_3072));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataValue11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.DataValue_3073);
		types.add(CoordinationElementTypes.DataValue_3090);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataValue11CreationTool_title, null, types);
		entry.setId("createDataValue11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.DataValue_3073));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataVariable12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.DataVariable_3074);
		types.add(CoordinationElementTypes.DataVariable_3079);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataVariable12CreationTool_title, null, types);
		entry.setId("createDataVariable12CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DataVariable_3074));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataValuedPropertyAtom13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.DatavaluedPropertyAtom_3075);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataValuedPropertyAtom13CreationTool_title, null,
				types);
		entry.setId("createDataValuedPropertyAtom13CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DatavaluedPropertyAtom_3075));
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
