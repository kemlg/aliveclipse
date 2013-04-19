package net.sf.ictalive.coordination.wfannotation.mapping.diagram.part;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;

/**
 * @generated
 */
public class MappingPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMappings1Group());
	}

	/**
	 * Creates "Mappings" palette tool group
	 * @generated
	 */
	private PaletteContainer createMappings1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Mappings1Group_title);
		paletteContainer.setId("createMappings1Group"); //$NON-NLS-1$
		paletteContainer
				.add(createPartnerActivityToAtomicAction1CreationTool());
		paletteContainer.add(createProcessToCompositeAction2CreationTool());
		paletteContainer.add(createSequencetoSequence3CreationTool());
		paletteContainer.add(createIftoIfThenElse4CreationTool());
		paletteContainer.add(createWhiletoRepeatWhile5CreationTool());
		paletteContainer.add(createRepeatUntiltoRepeatUntil6CreationTool());
		paletteContainer.add(createFlowtoSplitJoin7CreationTool());
		paletteContainer.add(createFortoRepeatWhile8CreationTool());
		paletteContainer.add(createScopetoCompositeAction9CreationTool());
		paletteContainer.add(createElseIftoIfThenElse10CreationTool());
		paletteContainer.add(createElsetoControlConstruct11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartnerActivityToAtomicAction1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(MappingElementTypes.PartnerActivityToAtomicActionMapping_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PartnerActivityToAtomicAction1CreationTool_title,
				Messages.PartnerActivityToAtomicAction1CreationTool_desc, types);
		entry.setId("createPartnerActivityToAtomicAction1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.PartnerActivityToAtomicActionMapping_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessToCompositeAction2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.ProcessToCompositeActionMapping_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ProcessToCompositeAction2CreationTool_title,
				Messages.ProcessToCompositeAction2CreationTool_desc, types);
		entry.setId("createProcessToCompositeAction2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.ProcessToCompositeActionMapping_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequencetoSequence3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.SequenceToSequenceMapping_4016);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SequencetoSequence3CreationTool_title,
				Messages.SequencetoSequence3CreationTool_desc, types);
		entry.setId("createSequencetoSequence3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.SequenceToSequenceMapping_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIftoIfThenElse4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.IfToIfThenElseMapping_4017);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.IftoIfThenElse4CreationTool_title,
				Messages.IftoIfThenElse4CreationTool_desc, types);
		entry.setId("createIftoIfThenElse4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.IfToIfThenElseMapping_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWhiletoRepeatWhile5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.WhileToRepeatWhileMapping_4018);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.WhiletoRepeatWhile5CreationTool_title,
				Messages.WhiletoRepeatWhile5CreationTool_desc, types);
		entry.setId("createWhiletoRepeatWhile5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.WhileToRepeatWhileMapping_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatUntiltoRepeatUntil6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RepeatUntiltoRepeatUntil6CreationTool_title,
				Messages.RepeatUntiltoRepeatUntil6CreationTool_desc, types);
		entry.setId("createRepeatUntiltoRepeatUntil6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowtoSplitJoin7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.FlowToSplitJoinMapping_4020);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FlowtoSplitJoin7CreationTool_title,
				Messages.FlowtoSplitJoin7CreationTool_desc, types);
		entry.setId("createFlowtoSplitJoin7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.FlowToSplitJoinMapping_4020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFortoRepeatWhile8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.ForToRepeatWhileMapping_4021);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FortoRepeatWhile8CreationTool_title,
				Messages.FortoRepeatWhile8CreationTool_desc, types);
		entry.setId("createFortoRepeatWhile8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.ForToRepeatWhileMapping_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScopetoCompositeAction9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.ScopeToCompositeActionMapping_4022);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ScopetoCompositeAction9CreationTool_title,
				Messages.ScopetoCompositeAction9CreationTool_desc, types);
		entry.setId("createScopetoCompositeAction9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.ScopeToCompositeActionMapping_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElseIftoIfThenElse10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.ElseIfToIfThenElseMapping_4023);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ElseIftoIfThenElse10CreationTool_title,
				Messages.ElseIftoIfThenElse10CreationTool_desc, types);
		entry.setId("createElseIftoIfThenElse10CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.ElseIfToIfThenElseMapping_4023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElsetoControlConstruct11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MappingElementTypes.ElseToElseMapping_4024);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ElsetoControlConstruct11CreationTool_title,
				Messages.ElsetoControlConstruct11CreationTool_desc, types);
		entry.setId("createElsetoControlConstruct11CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MappingElementTypes
						.getImageDescriptor(MappingElementTypes.ElseToElseMapping_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
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
