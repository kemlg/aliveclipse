package net.sf.ictalive.coordination.tasks.diagram.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
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
		paletteRoot.add(createTask1Group());
		paletteRoot.add(createControlConstructs2Group());
		paletteRoot.add(createSWRL3Group());
	}

	/**
	 * Creates "Task" palette tool group
	 * @generated
	 */
	private PaletteContainer createTask1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Task1Group_title);
		paletteContainer.setId("createTask1Group"); //$NON-NLS-1$
		paletteContainer.add(createTask1CreationTool());
		paletteContainer.add(createPrecondition2CreationTool());
		paletteContainer.add(createInputMessageMap3CreationTool());
		paletteContainer
				.add(createInputMessageMapParameterconnection4CreationTool());
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
		paletteContainer.add(createPerform1CreationTool());
		paletteContainer.add(createPerformActionconnection2CreationTool());
		paletteContainer.add(createAnyOrder3CreationTool());
		paletteContainer.add(createControlConstructBag4CreationTool());
		paletteContainer.add(createSequence5CreationTool());
		paletteContainer.add(createControlConstructList6CreationTool());
		paletteContainer.add(createComponentsconnection7CreationTool());
		paletteContainer
				.add(createControlConstructBagListFirstconnection8CreationTool());
		paletteContainer
				.add(createControlConstructBagListRestconnection9CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "SWRL" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createSWRL3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.SWRL3Group_title);
		paletteContainer.setId("createSWRL3Group"); //$NON-NLS-1$
//		paletteContainer.setDescription(Messages.SWRL3Group_desc);
//		paletteContainer.setSmallIcon(TaskDiagramEditorPlugin
//				.findImageDescriptor("")); //$NON-NLS-1$
//		paletteContainer.setLargeIcon(TaskDiagramEditorPlugin
//				.findImageDescriptor("")); //$NON-NLS-1$
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
	private ToolEntry createTask1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Task_2021);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Task1CreationTool_title,
				Messages.Task1CreationTool_desc, types);
		entry.setId("createTask1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Task_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrecondition2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Condition_3031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Precondition2CreationTool_title,
				Messages.Precondition2CreationTool_desc, types);
		entry.setId("createPrecondition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Condition_3031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputMessageMap3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.InputMessageMap_3057);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputMessageMap3CreationTool_title,
				Messages.InputMessageMap3CreationTool_desc, types);
		entry.setId("createInputMessageMap3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.InputMessageMap_3057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputMessageMapParameterconnection4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.InputMessageMapParameter_4027);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InputMessageMapParameterconnection4CreationTool_title,
				null, types);
		entry.setId("createInputMessageMapParameterconnection4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.InputMessageMapParameter_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerform1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Perform_2028);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Perform1CreationTool_title, null, types);
		entry.setId("createPerform1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Perform_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerformActionconnection2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.ProcessPerformedBy_4019);
		types.add(CoordinationElementTypes.PerformProcess_4021);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PerformActionconnection2CreationTool_title, null,
				types);
		entry.setId("createPerformActionconnection2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ProcessPerformedBy_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnyOrder3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AnyOrder_2026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AnyOrder3CreationTool_title,
				Messages.AnyOrder3CreationTool_desc, types);
		entry.setId("createAnyOrder3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.AnyOrder_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructBag4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ControlConstructBag_2027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlConstructBag4CreationTool_title,
				Messages.ControlConstructBag4CreationTool_desc, types);
		entry.setId("createControlConstructBag4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructBag_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Sequence_2025);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence5CreationTool_title,
				Messages.Sequence5CreationTool_desc, types);
		entry.setId("createSequence5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Sequence_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructList6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ControlConstructList_2030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlConstructList6CreationTool_title, null, types);
		entry.setId("createControlConstructList6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructList_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentsconnection7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(4);
		types.add(CoordinationElementTypes.ChoiceComponents_4022);
		types.add(CoordinationElementTypes.AnyOrderComponents_4023);
		types.add(CoordinationElementTypes.SequenceComponents_4024);
		types.add(CoordinationElementTypes.TaskComponents_4025);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Componentsconnection7CreationTool_title,
				Messages.Componentsconnection7CreationTool_desc, types);
		entry.setId("createComponentsconnection7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ChoiceComponents_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructBagListFirstconnection8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.ControlConstructBagFirst_4033);
		types.add(CoordinationElementTypes.ControlConstructListFirst_4034);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ControlConstructBagListFirstconnection8CreationTool_title,
				null, types);
		entry
				.setId("createControlConstructBagListFirstconnection8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructBagFirst_4033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlConstructBagListRestconnection9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.ControlConstructBagRest_4026);
		types.add(CoordinationElementTypes.ControlConstructListRest_4028);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ControlConstructBagListRestconnection9CreationTool_title,
				null, types);
		entry.setId("createControlConstructBagListRestconnection9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ControlConstructBagRest_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomList1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AtomList_3032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomList1CreationTool_title,
				Messages.AtomList1CreationTool_desc, types);
		entry.setId("createAtomList1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.AtomList_3032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassAtom2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ClassAtom_3033);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClassAtom2CreationTool_title, null, types);
		entry.setId("createClassAtom2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.ClassAtom_3033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividualID3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(CoordinationElementTypes.IndividualID_3034);
		types.add(CoordinationElementTypes.IndividualID_3037);
		types.add(CoordinationElementTypes.IndividualID_3039);
		types.add(CoordinationElementTypes.IndividualID_3042);
		types.add(CoordinationElementTypes.IndividualID_3045);
		types.add(CoordinationElementTypes.IndividualID_3054);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndividualID3CreationTool_title, null, types);
		entry.setId("createIndividualID3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IndividualID_3034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividualVariable4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(CoordinationElementTypes.IndividualVariable_3035);
		types.add(CoordinationElementTypes.IndividualVariable_3038);
		types.add(CoordinationElementTypes.IndividualVariable_3040);
		types.add(CoordinationElementTypes.IndividualVariable_3043);
		types.add(CoordinationElementTypes.IndividualVariable_3046);
		types.add(CoordinationElementTypes.IndividualVariable_3053);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndividualVariable4CreationTool_title, null, types);
		entry.setId("createIndividualVariable4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IndividualVariable_3035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividualPropertyAtom5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.IndividualPropertyAtom_3036);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndividualPropertyAtom5CreationTool_title, null, types);
		entry.setId("createIndividualPropertyAtom5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.IndividualPropertyAtom_3036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSameAsAtom6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.SameIndividualAtom_3041);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SameAsAtom6CreationTool_title, null, types);
		entry.setId("createSameAsAtom6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.SameIndividualAtom_3041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDifferentFromAtom7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.DifferentIndividualsAtom_3044);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DifferentFromAtom7CreationTool_title, null, types);
		entry.setId("createDifferentFromAtom7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DifferentIndividualsAtom_3044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBuiltInAtom8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.BuiltInAtom_3047);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BuiltInAtom8CreationTool_title,
				Messages.BuiltInAtom8CreationTool_desc, types);
		entry.setId("createBuiltInAtom8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.BuiltInAtom_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataRangeAtom9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.DataRangeAtom_3048);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataRangeAtom9CreationTool_title, null, types);
		entry.setId("createDataRangeAtom9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DataRangeAtom_3048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataLiteral10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.DataLiteral_3049);
		types.add(CoordinationElementTypes.DataLiteral_3055);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataLiteral10CreationTool_title, null, types);
		entry.setId("createDataLiteral10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.DataLiteral_3049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataValue11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.DataValue_3050);
		types.add(CoordinationElementTypes.DataValue_3058);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataValue11CreationTool_title, null, types);
		entry.setId("createDataValue11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.DataValue_3050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataVariable12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoordinationElementTypes.DataVariable_3051);
		types.add(CoordinationElementTypes.DataVariable_3056);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataVariable12CreationTool_title, null, types);
		entry.setId("createDataVariable12CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DataVariable_3051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataValuedPropertyAtom13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.DatavaluedPropertyAtom_3052);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataValuedPropertyAtom13CreationTool_title, null,
				types);
		entry.setId("createDataValuedPropertyAtom13CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.DatavaluedPropertyAtom_3052));
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
