package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.AnyOrderCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.AtomicActionCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ChoiceCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompositeActionCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructBagCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ControlConstructListCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfThenElseCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PerformCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ProcessCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntilCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatWhileCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SequenceCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SplitCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.SplitJoinCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MappingContainerItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MappingContainerItemSemanticEditPolicy() {
		super(MappingElementTypes.MappingContainer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Process_2002 == req.getElementType()) {
			return getGEFWrapper(new ProcessCreateCommand(req));
		}
		if (MappingElementTypes.AtomicAction_2001 == req.getElementType()) {
			return getGEFWrapper(new AtomicActionCreateCommand(req));
		}
		if (MappingElementTypes.CompositeAction_2014 == req.getElementType()) {
			return getGEFWrapper(new CompositeActionCreateCommand(req));
		}
		if (MappingElementTypes.Sequence_2004 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (MappingElementTypes.AnyOrder_2005 == req.getElementType()) {
			return getGEFWrapper(new AnyOrderCreateCommand(req));
		}
		if (MappingElementTypes.ControlConstructBag_2006 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagCreateCommand(req));
		}
		if (MappingElementTypes.Perform_2007 == req.getElementType()) {
			return getGEFWrapper(new PerformCreateCommand(req));
		}
		if (MappingElementTypes.Choice_2008 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req));
		}
		if (MappingElementTypes.ControlConstructList_2009 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructListCreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_2010 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntilCreateCommand(req));
		}
		if (MappingElementTypes.RepeatWhile_2011 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhileCreateCommand(req));
		}
		if (MappingElementTypes.IfThenElse_2012 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseCreateCommand(req));
		}
		if (MappingElementTypes.Split_2015 == req.getElementType()) {
			return getGEFWrapper(new SplitCreateCommand(req));
		}
		if (MappingElementTypes.SplitJoin_2016 == req.getElementType()) {
			return getGEFWrapper(new SplitJoinCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
