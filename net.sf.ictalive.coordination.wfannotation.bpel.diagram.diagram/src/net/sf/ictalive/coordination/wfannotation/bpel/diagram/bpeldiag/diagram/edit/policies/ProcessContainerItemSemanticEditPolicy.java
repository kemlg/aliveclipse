package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.AssignCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScopeCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ElseCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ElseIfCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.EmptyCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.EventHandlerCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExitCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivityCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.FlowCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEachCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.IfCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.InvokeCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnAlarmCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnEventCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnMessageCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivityCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OperationCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivityCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PickCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ProcessCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ReceiveCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntilCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ReplyCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RethrowCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ScopeCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.SequenceCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ThrowCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ValidateCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.WaitCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.WhileCreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ProcessContainerItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessContainerItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.ProcessContainer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Process_2001 == req.getElementType()) {
			return getGEFWrapper(new ProcessCreateCommand(req));
		}
		if (BpeldiagElementTypes.Assign_2002 == req.getElementType()) {
			return getGEFWrapper(new AssignCreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_2003 == req.getElementType()) {
			return getGEFWrapper(new CompensateCreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_2004 == req.getElementType()) {
			return getGEFWrapper(new CompensateScopeCreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_2005 == req.getElementType()) {
			return getGEFWrapper(new EmptyCreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_2006 == req.getElementType()) {
			return getGEFWrapper(new ExitCreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_2007 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivityCreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_2008 == req.getElementType()) {
			return getGEFWrapper(new FlowCreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_2009 == req.getElementType()) {
			return getGEFWrapper(new ForEachCreateCommand(req));
		}
		if (BpeldiagElementTypes.If_2010 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_2011 == req.getElementType()) {
			return getGEFWrapper(new InvokeCreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_2012 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivityCreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_2014 == req.getElementType()) {
			return getGEFWrapper(new PickCreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_2015 == req.getElementType()) {
			return getGEFWrapper(new ReceiveCreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_2016 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntilCreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_2017 == req.getElementType()) {
			return getGEFWrapper(new ReplyCreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_2018 == req.getElementType()) {
			return getGEFWrapper(new RethrowCreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_2019 == req.getElementType()) {
			return getGEFWrapper(new ScopeCreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_2020 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_2021 == req.getElementType()) {
			return getGEFWrapper(new ThrowCreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_2022 == req.getElementType()) {
			return getGEFWrapper(new ValidateCreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_2023 == req.getElementType()) {
			return getGEFWrapper(new WaitCreateCommand(req));
		}
		if (BpeldiagElementTypes.While_2024 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_2013 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivityCreateCommand(req));
		}
		if (BpeldiagElementTypes.ElseIf_2025 == req.getElementType()) {
			return getGEFWrapper(new ElseIfCreateCommand(req));
		}
		if (BpeldiagElementTypes.Else_2026 == req.getElementType()) {
			return getGEFWrapper(new ElseCreateCommand(req));
		}
		if (BpeldiagElementTypes.OnAlarm_2027 == req.getElementType()) {
			return getGEFWrapper(new OnAlarmCreateCommand(req));
		}
		if (BpeldiagElementTypes.OnEvent_2028 == req.getElementType()) {
			return getGEFWrapper(new OnEventCreateCommand(req));
		}
		if (BpeldiagElementTypes.OnMessage_2029 == req.getElementType()) {
			return getGEFWrapper(new OnMessageCreateCommand(req));
		}
		if (BpeldiagElementTypes.EventHandler_2030 == req.getElementType()) {
			return getGEFWrapper(new EventHandlerCreateCommand(req));
		}
		if (BpeldiagElementTypes.Operation_2031 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
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
