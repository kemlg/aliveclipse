package net.sf.ictalive.coordination.agents.diagram.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.agents.diagram.providers.CoordinationElementTypes;

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
		paletteRoot.add(createMas1Group());
	}

	/**
	 * Creates "mas" palette tool group
	 * @generated
	 */
	private PaletteContainer createMas1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Mas1Group_title);
		paletteContainer.setId("createMas1Group"); //$NON-NLS-1$
		paletteContainer.add(createAgent1CreationTool());
		paletteContainer.add(createAgenthasRole2CreationTool());
		paletteContainer.add(createAgenthasAction3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.Agent_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Agent1CreationTool_title,
				Messages.Agent1CreationTool_desc, types);
		entry.setId("createAgent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CoordinationElementTypes
				.getImageDescriptor(CoordinationElementTypes.Agent_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgenthasRole2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AgentHasRole_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AgenthasRole2CreationTool_title,
				Messages.AgenthasRole2CreationTool_desc, types);
		entry.setId("createAgenthasRole2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.AgentHasRole_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgenthasAction3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoordinationElementTypes.AgentHasAction_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AgenthasAction3CreationTool_title,
				Messages.AgenthasAction3CreationTool_desc, types);
		entry.setId("createAgenthasAction3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(CoordinationElementTypes
						.getImageDescriptor(CoordinationElementTypes.AgentHasAction_4003));
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
