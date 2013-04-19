package net.sf.ictalive.coordination.plans.diagram.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
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
		paletteRoot.add(createTasks1Group());
	}

	/**
	 * Creates "tasks" palette tool group
	 * @generated
	 */
	private PaletteContainer createTasks1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Tasks1Group_title);
		paletteContainer.setId("createTasks1Group"); //$NON-NLS-1$
		paletteContainer.add(createInputMessageMap1CreationTool());
		paletteContainer
				.add(createInputMessageMapParameterconnection2CreationTool());
		paletteContainer.add(createActionGroundingList3CreationTool());
		paletteContainer
				.add(createActionGroundingListRestconnection4CreationTool());
		paletteContainer.add(createActionGrounding5CreationTool());
		paletteContainer.add(createActionGroundingOwlsProcess6CreationTool());
		paletteContainer.add(createPlan7CreationTool());
		paletteContainer.add(createPlanGroundingListconnection8CreationTool());
		paletteContainer.add(createPlanForTaskconnection9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputMessageMap1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.InputMessageMap_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputMessageMap1CreationTool_title,
				Messages.InputMessageMap1CreationTool_desc, types);
		entry.setId("createInputMessageMap1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.InputMessageMap_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputMessageMapParameterconnection2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.InputMessageMapParameter_4007);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InputMessageMapParameterconnection2CreationTool_title,
				Messages.InputMessageMapParameterconnection2CreationTool_desc,
				types);
		entry.setId("createInputMessageMapParameterconnection2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.InputMessageMapParameter_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionGroundingList3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ActionGroundingList_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ActionGroundingList3CreationTool_title,
				Messages.ActionGroundingList3CreationTool_desc, types);
		entry.setId("createActionGroundingList3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ActionGroundingList_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionGroundingListRestconnection4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ActionGroundingListRest_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActionGroundingListRestconnection4CreationTool_title,
				Messages.ActionGroundingListRestconnection4CreationTool_desc,
				types);
		entry.setId("createActionGroundingListRestconnection4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ActionGroundingListRest_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionGrounding5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ActionGrounding_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ActionGrounding5CreationTool_title,
				Messages.ActionGrounding5CreationTool_desc, types);
		entry.setId("createActionGrounding5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ActionGrounding_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionGroundingOwlsProcess6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.ActionGroundingOwlsProcess_4008);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActionGroundingOwlsProcess6CreationTool_title,
				Messages.ActionGroundingOwlsProcess6CreationTool_desc, types);
		entry.setId("createActionGroundingOwlsProcess6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.ActionGroundingOwlsProcess_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlan7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Plan_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Plan7CreationTool_title,
				Messages.Plan7CreationTool_desc, types);
		entry.setId("createPlan7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Plan_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlanGroundingListconnection8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(CoordinationElementTypes.PlanHasAtomicProcessGroundingList_4010);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PlanGroundingListconnection8CreationTool_title, null,
				types);
		entry.setId("createPlanGroundingListconnection8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.PlanHasAtomicProcessGroundingList_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlanForTaskconnection9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.PlanForTask_4009);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PlanForTaskconnection9CreationTool_title, null, types);
		entry.setId("createPlanForTaskconnection9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.PlanForTask_4009));
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
