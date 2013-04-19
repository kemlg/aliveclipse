/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import control.diagram.edit.commands.AnyOrderCreateCommand;
import control.diagram.edit.commands.ChoiceCreateCommand;
import control.diagram.edit.commands.ConditionCreateCommand;
import control.diagram.edit.commands.ExprCreateCommand;
import control.diagram.edit.commands.IfThenElseCreateCommand;
import control.diagram.edit.commands.InputCreateCommand;
import control.diagram.edit.commands.LinkCreateCommand;
import control.diagram.edit.commands.LocCreateCommand;
import control.diagram.edit.commands.OntologyCreateCommand;
import control.diagram.edit.commands.OutputCreateCommand;
import control.diagram.edit.commands.PerformCreateCommand;
import control.diagram.edit.commands.ProduceCreateCommand;
import control.diagram.edit.commands.RepeatUntilCreateCommand;
import control.diagram.edit.commands.RepeatWhileCreateCommand;
import control.diagram.edit.commands.ResultCreateCommand;
import control.diagram.edit.commands.SequenceCreateCommand;
import control.diagram.edit.commands.SetCreateCommand;
import control.diagram.edit.commands.SplitCreateCommand;
import control.diagram.edit.commands.SplitJoinCreateCommand;
import control.diagram.edit.commands.TemplateConstraintCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class OuterProcessItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OuterProcessItemSemanticEditPolicy() {
		super(ControlElementTypes.OuterProcess_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Input_2027 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (ControlElementTypes.Output_2028 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
		}
		if (ControlElementTypes.Loc_2003 == req.getElementType()) {
			return getGEFWrapper(new LocCreateCommand(req));
		}
		if (ControlElementTypes.Sequence_2004 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (ControlElementTypes.Choice_2005 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_2006 == req.getElementType()) {
			return getGEFWrapper(new AnyOrderCreateCommand(req));
		}
		if (ControlElementTypes.Split_2007 == req.getElementType()) {
			return getGEFWrapper(new SplitCreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_2008 == req.getElementType()) {
			return getGEFWrapper(new SplitJoinCreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_2009 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseCreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_2010 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntilCreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_2011 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhileCreateCommand(req));
		}
		if (ControlElementTypes.Perform_2012 == req.getElementType()) {
			return getGEFWrapper(new PerformCreateCommand(req));
		}
		if (ControlElementTypes.Produce_2013 == req.getElementType()) {
			return getGEFWrapper(new ProduceCreateCommand(req));
		}
		if (ControlElementTypes.Set_2014 == req.getElementType()) {
			return getGEFWrapper(new SetCreateCommand(req));
		}
		if (ControlElementTypes.Link_2015 == req.getElementType()) {
			return getGEFWrapper(new LinkCreateCommand(req));
		}
		if (ControlElementTypes.Condition_2017 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		if (ControlElementTypes.Result_2018 == req.getElementType()) {
			return getGEFWrapper(new ResultCreateCommand(req));
		}
		if (ControlElementTypes.Ontology_2029 == req.getElementType()) {
			return getGEFWrapper(new OntologyCreateCommand(req));
		}
		if (ControlElementTypes.TemplateConstraint_2030 == req.getElementType()) {
			return getGEFWrapper(new TemplateConstraintCreateCommand(req));
		}
		if (ControlElementTypes.Expr_2019 == req.getElementType()) {
			return getGEFWrapper(new ExprCreateCommand(req));
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
