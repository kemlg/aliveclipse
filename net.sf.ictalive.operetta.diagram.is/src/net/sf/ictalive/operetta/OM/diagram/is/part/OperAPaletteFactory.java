package net.sf.ictalive.operetta.OM.diagram.is.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
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
		paletteContainer.add(createScene1CreationTool());
		paletteContainer.add(createAND2CreationTool());
		paletteContainer.add(createOR3CreationTool());
		paletteContainer.add(createXOR4CreationTool());
		paletteContainer.add(createArc5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createLandmark7CreationTool());
		paletteContainer.add(createPartialOrder8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScene1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.Scene_2101);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Scene1CreationTool_title,
				Messages.Scene1CreationTool_desc, types);
		entry.setId("createScene1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OperAElementTypes
				.getImageDescriptor(OperAElementTypes.Scene_2101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAND2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.Transition_2104);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AND2CreationTool_title,
				Messages.AND2CreationTool_desc, types);
		entry.setId("createAND2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperAISDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/And.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOR3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.Transition_2105);
		NodeToolEntry entry = new NodeToolEntry(Messages.OR3CreationTool_title,
				Messages.OR3CreationTool_desc, types);
		entry.setId("createOR3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperAISDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/Or.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXOR4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.Transition_2106);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XOR4CreationTool_title,
				Messages.XOR4CreationTool_desc, types);
		entry.setId("createXOR4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperAISDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/Xor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArc5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(OperAElementTypes.TransitionToSceneArc_4101);
		types.add(OperAElementTypes.SceneToTransitionArc_4102);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Arc5CreationTool_title,
				Messages.Arc5CreationTool_desc, types);
		entry.setId("createArc5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperAElementTypes
						.getImageDescriptor(OperAElementTypes.TransitionToSceneArc_4101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLandmark7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.Landmark_3102);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Landmark7CreationTool_title,
				Messages.Landmark7CreationTool_desc, types);
		entry.setId("createLandmark7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperAISDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/Landmark.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartialOrder8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OperAElementTypes.PartialOrder_4103);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PartialOrder8CreationTool_title,
				Messages.PartialOrder8CreationTool_desc, types);
		entry.setId("createPartialOrder8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(OperAISDiagramEditorPlugin
						.findImageDescriptor("/net.sf.ictalive.operetta.edit/icons/full/obj16/PartialOrder.gif")); //$NON-NLS-1$
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
