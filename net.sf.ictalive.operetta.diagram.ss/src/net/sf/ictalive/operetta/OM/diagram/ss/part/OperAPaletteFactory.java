package net.sf.ictalive.operetta.OM.diagram.ss.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.operetta.OM.diagram.ss.providers.OperAElementTypes;

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
public class OperAPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOpera1Group());
	}

	/**
	 * Creates "opera" palette tool group
	 * @generated
	 */
	private PaletteContainer createOpera1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Opera1Group_title);
		paletteContainer.setId("createOpera1Group"); //$NON-NLS-1$
		paletteContainer.add(createRole1CreationTool());
		paletteContainer.add(createHierarchyDependency2CreationTool());
		paletteContainer.add(createMarketDependency3CreationTool());
		paletteContainer.add(createNetworkDependency4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.Role_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role1CreationTool_title,
				Messages.Role1CreationTool_desc, types);
		entry.setId("createRole1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OperAElementTypes
				.getImageDescriptor(OperAElementTypes.Role_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHierarchyDependency2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.HierarchyDependency_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HierarchyDependency2CreationTool_title,
				Messages.HierarchyDependency2CreationTool_desc, types);
		entry.setId("createHierarchyDependency2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperASSDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/Dependency.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMarketDependency3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.MarketDependency_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MarketDependency3CreationTool_title,
				Messages.MarketDependency3CreationTool_desc, types);
		entry.setId("createMarketDependency3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperASSDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/Dependency.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkDependency4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.NetworkDependency_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NetworkDependency4CreationTool_title,
				Messages.NetworkDependency4CreationTool_desc, types);
		entry.setId("createNetworkDependency4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperASSDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/Dependency.gif")); //$NON-NLS-1$
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
