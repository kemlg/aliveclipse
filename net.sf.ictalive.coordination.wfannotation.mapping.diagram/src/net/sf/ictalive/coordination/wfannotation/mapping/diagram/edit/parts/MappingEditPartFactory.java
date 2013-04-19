package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class MappingEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MappingVisualIDRegistry.getVisualID(view)) {

			case MappingContainerEditPart.VISUAL_ID:
				return new MappingContainerEditPart(view);

			case ProcessEditPart.VISUAL_ID:
				return new ProcessEditPart(view);

			case ProcessNameEditPart.VISUAL_ID:
				return new ProcessNameEditPart(view);

			case AtomicActionEditPart.VISUAL_ID:
				return new AtomicActionEditPart(view);

			case AtomicActionNameEditPart.VISUAL_ID:
				return new AtomicActionNameEditPart(view);

			case CompositeActionEditPart.VISUAL_ID:
				return new CompositeActionEditPart(view);

			case CompositeActionNameEditPart.VISUAL_ID:
				return new CompositeActionNameEditPart(view);

			case SequenceEditPart.VISUAL_ID:
				return new SequenceEditPart(view);

			case AnyOrderEditPart.VISUAL_ID:
				return new AnyOrderEditPart(view);

			case ControlConstructBagEditPart.VISUAL_ID:
				return new ControlConstructBagEditPart(view);

			case PerformEditPart.VISUAL_ID:
				return new PerformEditPart(view);

			case ChoiceEditPart.VISUAL_ID:
				return new ChoiceEditPart(view);

			case ControlConstructListEditPart.VISUAL_ID:
				return new ControlConstructListEditPart(view);

			case RepeatUntilEditPart.VISUAL_ID:
				return new RepeatUntilEditPart(view);

			case RepeatWhileEditPart.VISUAL_ID:
				return new RepeatWhileEditPart(view);

			case IfThenElseEditPart.VISUAL_ID:
				return new IfThenElseEditPart(view);

			case SplitEditPart.VISUAL_ID:
				return new SplitEditPart(view);

			case SplitJoinEditPart.VISUAL_ID:
				return new SplitJoinEditPart(view);

			case AssignEditPart.VISUAL_ID:
				return new AssignEditPart(view);

			case AssignNameEditPart.VISUAL_ID:
				return new AssignNameEditPart(view);

			case CompensateEditPart.VISUAL_ID:
				return new CompensateEditPart(view);

			case CompensateNameEditPart.VISUAL_ID:
				return new CompensateNameEditPart(view);

			case CompensateScopeEditPart.VISUAL_ID:
				return new CompensateScopeEditPart(view);

			case CompensateScopeNameEditPart.VISUAL_ID:
				return new CompensateScopeNameEditPart(view);

			case EmptyEditPart.VISUAL_ID:
				return new EmptyEditPart(view);

			case EmptyNameEditPart.VISUAL_ID:
				return new EmptyNameEditPart(view);

			case ExitEditPart.VISUAL_ID:
				return new ExitEditPart(view);

			case ExitNameEditPart.VISUAL_ID:
				return new ExitNameEditPart(view);

			case ExtensionActivityEditPart.VISUAL_ID:
				return new ExtensionActivityEditPart(view);

			case ExtensionActivityNameEditPart.VISUAL_ID:
				return new ExtensionActivityNameEditPart(view);

			case FlowEditPart.VISUAL_ID:
				return new FlowEditPart(view);

			case FlowNameEditPart.VISUAL_ID:
				return new FlowNameEditPart(view);

			case Assign2EditPart.VISUAL_ID:
				return new Assign2EditPart(view);

			case AssignName2EditPart.VISUAL_ID:
				return new AssignName2EditPart(view);

			case Compensate2EditPart.VISUAL_ID:
				return new Compensate2EditPart(view);

			case CompensateName2EditPart.VISUAL_ID:
				return new CompensateName2EditPart(view);

			case CompensateScope2EditPart.VISUAL_ID:
				return new CompensateScope2EditPart(view);

			case CompensateScopeName2EditPart.VISUAL_ID:
				return new CompensateScopeName2EditPart(view);

			case Empty2EditPart.VISUAL_ID:
				return new Empty2EditPart(view);

			case EmptyName2EditPart.VISUAL_ID:
				return new EmptyName2EditPart(view);

			case Exit2EditPart.VISUAL_ID:
				return new Exit2EditPart(view);

			case ExitName2EditPart.VISUAL_ID:
				return new ExitName2EditPart(view);

			case ExtensionActivity2EditPart.VISUAL_ID:
				return new ExtensionActivity2EditPart(view);

			case ExtensionActivityName2EditPart.VISUAL_ID:
				return new ExtensionActivityName2EditPart(view);

			case Flow2EditPart.VISUAL_ID:
				return new Flow2EditPart(view);

			case FlowName2EditPart.VISUAL_ID:
				return new FlowName2EditPart(view);

			case ForEachEditPart.VISUAL_ID:
				return new ForEachEditPart(view);

			case ForEachNameEditPart.VISUAL_ID:
				return new ForEachNameEditPart(view);

			case Assign3EditPart.VISUAL_ID:
				return new Assign3EditPart(view);

			case AssignName3EditPart.VISUAL_ID:
				return new AssignName3EditPart(view);

			case Compensate3EditPart.VISUAL_ID:
				return new Compensate3EditPart(view);

			case CompensateName3EditPart.VISUAL_ID:
				return new CompensateName3EditPart(view);

			case CompensateScope3EditPart.VISUAL_ID:
				return new CompensateScope3EditPart(view);

			case CompensateScopeName3EditPart.VISUAL_ID:
				return new CompensateScopeName3EditPart(view);

			case Empty3EditPart.VISUAL_ID:
				return new Empty3EditPart(view);

			case EmptyName3EditPart.VISUAL_ID:
				return new EmptyName3EditPart(view);

			case Exit3EditPart.VISUAL_ID:
				return new Exit3EditPart(view);

			case ExitName3EditPart.VISUAL_ID:
				return new ExitName3EditPart(view);

			case ExtensionActivity3EditPart.VISUAL_ID:
				return new ExtensionActivity3EditPart(view);

			case ExtensionActivityName3EditPart.VISUAL_ID:
				return new ExtensionActivityName3EditPart(view);

			case ForEach2EditPart.VISUAL_ID:
				return new ForEach2EditPart(view);

			case ForEachName2EditPart.VISUAL_ID:
				return new ForEachName2EditPart(view);

			case IfEditPart.VISUAL_ID:
				return new IfEditPart(view);

			case IfNameEditPart.VISUAL_ID:
				return new IfNameEditPart(view);

			case Assign4EditPart.VISUAL_ID:
				return new Assign4EditPart(view);

			case AssignName4EditPart.VISUAL_ID:
				return new AssignName4EditPart(view);

			case Compensate4EditPart.VISUAL_ID:
				return new Compensate4EditPart(view);

			case CompensateName4EditPart.VISUAL_ID:
				return new CompensateName4EditPart(view);

			case CompensateScope4EditPart.VISUAL_ID:
				return new CompensateScope4EditPart(view);

			case CompensateScopeName4EditPart.VISUAL_ID:
				return new CompensateScopeName4EditPart(view);

			case Empty4EditPart.VISUAL_ID:
				return new Empty4EditPart(view);

			case EmptyName4EditPart.VISUAL_ID:
				return new EmptyName4EditPart(view);

			case Exit4EditPart.VISUAL_ID:
				return new Exit4EditPart(view);

			case ExitName4EditPart.VISUAL_ID:
				return new ExitName4EditPart(view);

			case ExtensionActivity4EditPart.VISUAL_ID:
				return new ExtensionActivity4EditPart(view);

			case ExtensionActivityName4EditPart.VISUAL_ID:
				return new ExtensionActivityName4EditPart(view);

			case If2EditPart.VISUAL_ID:
				return new If2EditPart(view);

			case IfName2EditPart.VISUAL_ID:
				return new IfName2EditPart(view);

			case ForEach3EditPart.VISUAL_ID:
				return new ForEach3EditPart(view);

			case ForEachName3EditPart.VISUAL_ID:
				return new ForEachName3EditPart(view);

			case InvokeEditPart.VISUAL_ID:
				return new InvokeEditPart(view);

			case InvokeNameEditPart.VISUAL_ID:
				return new InvokeNameEditPart(view);

			case OpaqueActivityEditPart.VISUAL_ID:
				return new OpaqueActivityEditPart(view);

			case OpaqueActivityNameEditPart.VISUAL_ID:
				return new OpaqueActivityNameEditPart(view);

			case PartnerActivityEditPart.VISUAL_ID:
				return new PartnerActivityEditPart(view);

			case PartnerActivityNameEditPart.VISUAL_ID:
				return new PartnerActivityNameEditPart(view);

			case PickEditPart.VISUAL_ID:
				return new PickEditPart(view);

			case PickNameEditPart.VISUAL_ID:
				return new PickNameEditPart(view);

			case OnAlarmEditPart.VISUAL_ID:
				return new OnAlarmEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case Assign5EditPart.VISUAL_ID:
				return new Assign5EditPart(view);

			case AssignName5EditPart.VISUAL_ID:
				return new AssignName5EditPart(view);

			case Compensate5EditPart.VISUAL_ID:
				return new Compensate5EditPart(view);

			case CompensateName5EditPart.VISUAL_ID:
				return new CompensateName5EditPart(view);

			case CompensateScope5EditPart.VISUAL_ID:
				return new CompensateScope5EditPart(view);

			case CompensateScopeName5EditPart.VISUAL_ID:
				return new CompensateScopeName5EditPart(view);

			case Empty5EditPart.VISUAL_ID:
				return new Empty5EditPart(view);

			case EmptyName5EditPart.VISUAL_ID:
				return new EmptyName5EditPart(view);

			case Exit5EditPart.VISUAL_ID:
				return new Exit5EditPart(view);

			case ExitName5EditPart.VISUAL_ID:
				return new ExitName5EditPart(view);

			case ExtensionActivity5EditPart.VISUAL_ID:
				return new ExtensionActivity5EditPart(view);

			case ExtensionActivityName5EditPart.VISUAL_ID:
				return new ExtensionActivityName5EditPart(view);

			case Flow3EditPart.VISUAL_ID:
				return new Flow3EditPart(view);

			case FlowName3EditPart.VISUAL_ID:
				return new FlowName3EditPart(view);

			case If3EditPart.VISUAL_ID:
				return new If3EditPart(view);

			case IfName3EditPart.VISUAL_ID:
				return new IfName3EditPart(view);

			case Invoke2EditPart.VISUAL_ID:
				return new Invoke2EditPart(view);

			case InvokeName2EditPart.VISUAL_ID:
				return new InvokeName2EditPart(view);

			case OpaqueActivity2EditPart.VISUAL_ID:
				return new OpaqueActivity2EditPart(view);

			case OpaqueActivityName2EditPart.VISUAL_ID:
				return new OpaqueActivityName2EditPart(view);

			case PartnerActivity2EditPart.VISUAL_ID:
				return new PartnerActivity2EditPart(view);

			case PartnerActivityName2EditPart.VISUAL_ID:
				return new PartnerActivityName2EditPart(view);

			case Pick2EditPart.VISUAL_ID:
				return new Pick2EditPart(view);

			case PickName2EditPart.VISUAL_ID:
				return new PickName2EditPart(view);

			case OnMessageEditPart.VISUAL_ID:
				return new OnMessageEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case Assign6EditPart.VISUAL_ID:
				return new Assign6EditPart(view);

			case AssignName6EditPart.VISUAL_ID:
				return new AssignName6EditPart(view);

			case Compensate6EditPart.VISUAL_ID:
				return new Compensate6EditPart(view);

			case CompensateName6EditPart.VISUAL_ID:
				return new CompensateName6EditPart(view);

			case CompensateScope6EditPart.VISUAL_ID:
				return new CompensateScope6EditPart(view);

			case CompensateScopeName6EditPart.VISUAL_ID:
				return new CompensateScopeName6EditPart(view);

			case Empty6EditPart.VISUAL_ID:
				return new Empty6EditPart(view);

			case EmptyName6EditPart.VISUAL_ID:
				return new EmptyName6EditPart(view);

			case Exit6EditPart.VISUAL_ID:
				return new Exit6EditPart(view);

			case ExitName6EditPart.VISUAL_ID:
				return new ExitName6EditPart(view);

			case ExtensionActivity6EditPart.VISUAL_ID:
				return new ExtensionActivity6EditPart(view);

			case ExtensionActivityName6EditPart.VISUAL_ID:
				return new ExtensionActivityName6EditPart(view);

			case Flow4EditPart.VISUAL_ID:
				return new Flow4EditPart(view);

			case FlowName4EditPart.VISUAL_ID:
				return new FlowName4EditPart(view);

			case Invoke3EditPart.VISUAL_ID:
				return new Invoke3EditPart(view);

			case InvokeName3EditPart.VISUAL_ID:
				return new InvokeName3EditPart(view);

			case OpaqueActivity3EditPart.VISUAL_ID:
				return new OpaqueActivity3EditPart(view);

			case OpaqueActivityName3EditPart.VISUAL_ID:
				return new OpaqueActivityName3EditPart(view);

			case PartnerActivity3EditPart.VISUAL_ID:
				return new PartnerActivity3EditPart(view);

			case PartnerActivityName3EditPart.VISUAL_ID:
				return new PartnerActivityName3EditPart(view);

			case Pick3EditPart.VISUAL_ID:
				return new Pick3EditPart(view);

			case PickName3EditPart.VISUAL_ID:
				return new PickName3EditPart(view);

			case ReceiveEditPart.VISUAL_ID:
				return new ReceiveEditPart(view);

			case ReceiveNameEditPart.VISUAL_ID:
				return new ReceiveNameEditPart(view);

			case RepeatUntil2EditPart.VISUAL_ID:
				return new RepeatUntil2EditPart(view);

			case RepeatUntilNameEditPart.VISUAL_ID:
				return new RepeatUntilNameEditPart(view);

			case Assign7EditPart.VISUAL_ID:
				return new Assign7EditPart(view);

			case AssignName7EditPart.VISUAL_ID:
				return new AssignName7EditPart(view);

			case Compensate7EditPart.VISUAL_ID:
				return new Compensate7EditPart(view);

			case CompensateName7EditPart.VISUAL_ID:
				return new CompensateName7EditPart(view);

			case CompensateScope7EditPart.VISUAL_ID:
				return new CompensateScope7EditPart(view);

			case CompensateScopeName7EditPart.VISUAL_ID:
				return new CompensateScopeName7EditPart(view);

			case Empty7EditPart.VISUAL_ID:
				return new Empty7EditPart(view);

			case EmptyName7EditPart.VISUAL_ID:
				return new EmptyName7EditPart(view);

			case Exit7EditPart.VISUAL_ID:
				return new Exit7EditPart(view);

			case ExitName7EditPart.VISUAL_ID:
				return new ExitName7EditPart(view);

			case ExtensionActivity7EditPart.VISUAL_ID:
				return new ExtensionActivity7EditPart(view);

			case ExtensionActivityName7EditPart.VISUAL_ID:
				return new ExtensionActivityName7EditPart(view);

			case RepeatUntil3EditPart.VISUAL_ID:
				return new RepeatUntil3EditPart(view);

			case RepeatUntilName2EditPart.VISUAL_ID:
				return new RepeatUntilName2EditPart(view);

			case ForEach4EditPart.VISUAL_ID:
				return new ForEach4EditPart(view);

			case ForEachName4EditPart.VISUAL_ID:
				return new ForEachName4EditPart(view);

			case Receive2EditPart.VISUAL_ID:
				return new Receive2EditPart(view);

			case ReceiveName2EditPart.VISUAL_ID:
				return new ReceiveName2EditPart(view);

			case RepeatUntil4EditPart.VISUAL_ID:
				return new RepeatUntil4EditPart(view);

			case RepeatUntilName3EditPart.VISUAL_ID:
				return new RepeatUntilName3EditPart(view);

			case Invoke4EditPart.VISUAL_ID:
				return new Invoke4EditPart(view);

			case InvokeName4EditPart.VISUAL_ID:
				return new InvokeName4EditPart(view);

			case OpaqueActivity4EditPart.VISUAL_ID:
				return new OpaqueActivity4EditPart(view);

			case OpaqueActivityName4EditPart.VISUAL_ID:
				return new OpaqueActivityName4EditPart(view);

			case PartnerActivity4EditPart.VISUAL_ID:
				return new PartnerActivity4EditPart(view);

			case PartnerActivityName4EditPart.VISUAL_ID:
				return new PartnerActivityName4EditPart(view);

			case Pick4EditPart.VISUAL_ID:
				return new Pick4EditPart(view);

			case PickName4EditPart.VISUAL_ID:
				return new PickName4EditPart(view);

			case Receive3EditPart.VISUAL_ID:
				return new Receive3EditPart(view);

			case ReceiveName3EditPart.VISUAL_ID:
				return new ReceiveName3EditPart(view);

			case ReplyEditPart.VISUAL_ID:
				return new ReplyEditPart(view);

			case ReplyNameEditPart.VISUAL_ID:
				return new ReplyNameEditPart(view);

			case RethrowEditPart.VISUAL_ID:
				return new RethrowEditPart(view);

			case RethrowNameEditPart.VISUAL_ID:
				return new RethrowNameEditPart(view);

			case ScopeEditPart.VISUAL_ID:
				return new ScopeEditPart(view);

			case ScopeNameEditPart.VISUAL_ID:
				return new ScopeNameEditPart(view);

			case Assign8EditPart.VISUAL_ID:
				return new Assign8EditPart(view);

			case AssignName8EditPart.VISUAL_ID:
				return new AssignName8EditPart(view);

			case Compensate8EditPart.VISUAL_ID:
				return new Compensate8EditPart(view);

			case CompensateName8EditPart.VISUAL_ID:
				return new CompensateName8EditPart(view);

			case CompensateScope8EditPart.VISUAL_ID:
				return new CompensateScope8EditPart(view);

			case CompensateScopeName8EditPart.VISUAL_ID:
				return new CompensateScopeName8EditPart(view);

			case Empty8EditPart.VISUAL_ID:
				return new Empty8EditPart(view);

			case EmptyName8EditPart.VISUAL_ID:
				return new EmptyName8EditPart(view);

			case Exit8EditPart.VISUAL_ID:
				return new Exit8EditPart(view);

			case ExitName8EditPart.VISUAL_ID:
				return new ExitName8EditPart(view);

			case ExtensionActivity8EditPart.VISUAL_ID:
				return new ExtensionActivity8EditPart(view);

			case ExtensionActivityName8EditPart.VISUAL_ID:
				return new ExtensionActivityName8EditPart(view);

			case Scope2EditPart.VISUAL_ID:
				return new Scope2EditPart(view);

			case ScopeName2EditPart.VISUAL_ID:
				return new ScopeName2EditPart(view);

			case ForEach5EditPart.VISUAL_ID:
				return new ForEach5EditPart(view);

			case ForEachName5EditPart.VISUAL_ID:
				return new ForEachName5EditPart(view);

			case Reply2EditPart.VISUAL_ID:
				return new Reply2EditPart(view);

			case ReplyName2EditPart.VISUAL_ID:
				return new ReplyName2EditPart(view);

			case Rethrow2EditPart.VISUAL_ID:
				return new Rethrow2EditPart(view);

			case RethrowName2EditPart.VISUAL_ID:
				return new RethrowName2EditPart(view);

			case Scope3EditPart.VISUAL_ID:
				return new Scope3EditPart(view);

			case ScopeName3EditPart.VISUAL_ID:
				return new ScopeName3EditPart(view);

			case Invoke5EditPart.VISUAL_ID:
				return new Invoke5EditPart(view);

			case InvokeName5EditPart.VISUAL_ID:
				return new InvokeName5EditPart(view);

			case OpaqueActivity5EditPart.VISUAL_ID:
				return new OpaqueActivity5EditPart(view);

			case OpaqueActivityName5EditPart.VISUAL_ID:
				return new OpaqueActivityName5EditPart(view);

			case PartnerActivity5EditPart.VISUAL_ID:
				return new PartnerActivity5EditPart(view);

			case PartnerActivityName5EditPart.VISUAL_ID:
				return new PartnerActivityName5EditPart(view);

			case Pick5EditPart.VISUAL_ID:
				return new Pick5EditPart(view);

			case PickName5EditPart.VISUAL_ID:
				return new PickName5EditPart(view);

			case Receive4EditPart.VISUAL_ID:
				return new Receive4EditPart(view);

			case ReceiveName4EditPart.VISUAL_ID:
				return new ReceiveName4EditPart(view);

			case Reply3EditPart.VISUAL_ID:
				return new Reply3EditPart(view);

			case ReplyName3EditPart.VISUAL_ID:
				return new ReplyName3EditPart(view);

			case Rethrow3EditPart.VISUAL_ID:
				return new Rethrow3EditPart(view);

			case RethrowName3EditPart.VISUAL_ID:
				return new RethrowName3EditPart(view);

			case ThrowEditPart.VISUAL_ID:
				return new ThrowEditPart(view);

			case ThrowNameEditPart.VISUAL_ID:
				return new ThrowNameEditPart(view);

			case ValidateEditPart.VISUAL_ID:
				return new ValidateEditPart(view);

			case ValidateNameEditPart.VISUAL_ID:
				return new ValidateNameEditPart(view);

			case WaitEditPart.VISUAL_ID:
				return new WaitEditPart(view);

			case WaitNameEditPart.VISUAL_ID:
				return new WaitNameEditPart(view);

			case WhileEditPart.VISUAL_ID:
				return new WhileEditPart(view);

			case WhileNameEditPart.VISUAL_ID:
				return new WhileNameEditPart(view);

			case Assign9EditPart.VISUAL_ID:
				return new Assign9EditPart(view);

			case AssignName9EditPart.VISUAL_ID:
				return new AssignName9EditPart(view);

			case Compensate9EditPart.VISUAL_ID:
				return new Compensate9EditPart(view);

			case CompensateName9EditPart.VISUAL_ID:
				return new CompensateName9EditPart(view);

			case CompensateScope9EditPart.VISUAL_ID:
				return new CompensateScope9EditPart(view);

			case CompensateScopeName9EditPart.VISUAL_ID:
				return new CompensateScopeName9EditPart(view);

			case Empty9EditPart.VISUAL_ID:
				return new Empty9EditPart(view);

			case EmptyName9EditPart.VISUAL_ID:
				return new EmptyName9EditPart(view);

			case Exit9EditPart.VISUAL_ID:
				return new Exit9EditPart(view);

			case ExitName9EditPart.VISUAL_ID:
				return new ExitName9EditPart(view);

			case ExtensionActivity9EditPart.VISUAL_ID:
				return new ExtensionActivity9EditPart(view);

			case ExtensionActivityName9EditPart.VISUAL_ID:
				return new ExtensionActivityName9EditPart(view);

			case Flow5EditPart.VISUAL_ID:
				return new Flow5EditPart(view);

			case FlowName5EditPart.VISUAL_ID:
				return new FlowName5EditPart(view);

			case Reply4EditPart.VISUAL_ID:
				return new Reply4EditPart(view);

			case ReplyName4EditPart.VISUAL_ID:
				return new ReplyName4EditPart(view);

			case Rethrow4EditPart.VISUAL_ID:
				return new Rethrow4EditPart(view);

			case RethrowName4EditPart.VISUAL_ID:
				return new RethrowName4EditPart(view);

			case Scope4EditPart.VISUAL_ID:
				return new Scope4EditPart(view);

			case ScopeName4EditPart.VISUAL_ID:
				return new ScopeName4EditPart(view);

			case EventHandlerEditPart.VISUAL_ID:
				return new EventHandlerEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case OnAlarm2EditPart.VISUAL_ID:
				return new OnAlarm2EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ForEach6EditPart.VISUAL_ID:
				return new ForEach6EditPart(view);

			case ForEachName6EditPart.VISUAL_ID:
				return new ForEachName6EditPart(view);

			case Throw2EditPart.VISUAL_ID:
				return new Throw2EditPart(view);

			case ThrowName2EditPart.VISUAL_ID:
				return new ThrowName2EditPart(view);

			case Validate2EditPart.VISUAL_ID:
				return new Validate2EditPart(view);

			case ValidateName2EditPart.VISUAL_ID:
				return new ValidateName2EditPart(view);

			case Wait2EditPart.VISUAL_ID:
				return new Wait2EditPart(view);

			case WaitName2EditPart.VISUAL_ID:
				return new WaitName2EditPart(view);

			case While2EditPart.VISUAL_ID:
				return new While2EditPart(view);

			case WhileName2EditPart.VISUAL_ID:
				return new WhileName2EditPart(view);

			case ForEach7EditPart.VISUAL_ID:
				return new ForEach7EditPart(view);

			case ForEachName7EditPart.VISUAL_ID:
				return new ForEachName7EditPart(view);

			case If4EditPart.VISUAL_ID:
				return new If4EditPart(view);

			case IfName4EditPart.VISUAL_ID:
				return new IfName4EditPart(view);

			case Receive5EditPart.VISUAL_ID:
				return new Receive5EditPart(view);

			case ReceiveName5EditPart.VISUAL_ID:
				return new ReceiveName5EditPart(view);

			case RepeatUntil5EditPart.VISUAL_ID:
				return new RepeatUntil5EditPart(view);

			case RepeatUntilName4EditPart.VISUAL_ID:
				return new RepeatUntilName4EditPart(view);

			case Throw3EditPart.VISUAL_ID:
				return new Throw3EditPart(view);

			case ThrowName3EditPart.VISUAL_ID:
				return new ThrowName3EditPart(view);

			case Validate3EditPart.VISUAL_ID:
				return new Validate3EditPart(view);

			case ValidateName3EditPart.VISUAL_ID:
				return new ValidateName3EditPart(view);

			case Wait3EditPart.VISUAL_ID:
				return new Wait3EditPart(view);

			case WaitName3EditPart.VISUAL_ID:
				return new WaitName3EditPart(view);

			case While3EditPart.VISUAL_ID:
				return new While3EditPart(view);

			case WhileName3EditPart.VISUAL_ID:
				return new WhileName3EditPart(view);

			case Invoke6EditPart.VISUAL_ID:
				return new Invoke6EditPart(view);

			case InvokeName6EditPart.VISUAL_ID:
				return new InvokeName6EditPart(view);

			case OpaqueActivity6EditPart.VISUAL_ID:
				return new OpaqueActivity6EditPart(view);

			case OpaqueActivityName6EditPart.VISUAL_ID:
				return new OpaqueActivityName6EditPart(view);

			case PartnerActivity6EditPart.VISUAL_ID:
				return new PartnerActivity6EditPart(view);

			case PartnerActivityName6EditPart.VISUAL_ID:
				return new PartnerActivityName6EditPart(view);

			case Pick6EditPart.VISUAL_ID:
				return new Pick6EditPart(view);

			case PickName6EditPart.VISUAL_ID:
				return new PickName6EditPart(view);

			case Receive6EditPart.VISUAL_ID:
				return new Receive6EditPart(view);

			case ReceiveName6EditPart.VISUAL_ID:
				return new ReceiveName6EditPart(view);

			case RepeatUntil6EditPart.VISUAL_ID:
				return new RepeatUntil6EditPart(view);

			case RepeatUntilName5EditPart.VISUAL_ID:
				return new RepeatUntilName5EditPart(view);

			case Reply5EditPart.VISUAL_ID:
				return new Reply5EditPart(view);

			case ReplyName5EditPart.VISUAL_ID:
				return new ReplyName5EditPart(view);

			case Rethrow5EditPart.VISUAL_ID:
				return new Rethrow5EditPart(view);

			case RethrowName5EditPart.VISUAL_ID:
				return new RethrowName5EditPart(view);

			case Scope5EditPart.VISUAL_ID:
				return new Scope5EditPart(view);

			case ScopeName5EditPart.VISUAL_ID:
				return new ScopeName5EditPart(view);

			case Sequence2EditPart.VISUAL_ID:
				return new Sequence2EditPart(view);

			case SequenceNameEditPart.VISUAL_ID:
				return new SequenceNameEditPart(view);

			case Assign10EditPart.VISUAL_ID:
				return new Assign10EditPart(view);

			case AssignName10EditPart.VISUAL_ID:
				return new AssignName10EditPart(view);

			case Compensate10EditPart.VISUAL_ID:
				return new Compensate10EditPart(view);

			case CompensateName10EditPart.VISUAL_ID:
				return new CompensateName10EditPart(view);

			case CompensateScope10EditPart.VISUAL_ID:
				return new CompensateScope10EditPart(view);

			case CompensateScopeName10EditPart.VISUAL_ID:
				return new CompensateScopeName10EditPart(view);

			case Empty10EditPart.VISUAL_ID:
				return new Empty10EditPart(view);

			case EmptyName10EditPart.VISUAL_ID:
				return new EmptyName10EditPart(view);

			case Exit10EditPart.VISUAL_ID:
				return new Exit10EditPart(view);

			case ExitName10EditPart.VISUAL_ID:
				return new ExitName10EditPart(view);

			case ExtensionActivity10EditPart.VISUAL_ID:
				return new ExtensionActivity10EditPart(view);

			case ExtensionActivityName10EditPart.VISUAL_ID:
				return new ExtensionActivityName10EditPart(view);

			case Flow6EditPart.VISUAL_ID:
				return new Flow6EditPart(view);

			case FlowName6EditPart.VISUAL_ID:
				return new FlowName6EditPart(view);

			case Throw4EditPart.VISUAL_ID:
				return new Throw4EditPart(view);

			case ThrowName4EditPart.VISUAL_ID:
				return new ThrowName4EditPart(view);

			case Validate4EditPart.VISUAL_ID:
				return new Validate4EditPart(view);

			case ValidateName4EditPart.VISUAL_ID:
				return new ValidateName4EditPart(view);

			case Wait4EditPart.VISUAL_ID:
				return new Wait4EditPart(view);

			case WaitName4EditPart.VISUAL_ID:
				return new WaitName4EditPart(view);

			case While4EditPart.VISUAL_ID:
				return new While4EditPart(view);

			case WhileName4EditPart.VISUAL_ID:
				return new WhileName4EditPart(view);

			case Throw5EditPart.VISUAL_ID:
				return new Throw5EditPart(view);

			case ThrowName5EditPart.VISUAL_ID:
				return new ThrowName5EditPart(view);

			case Validate5EditPart.VISUAL_ID:
				return new Validate5EditPart(view);

			case ValidateName5EditPart.VISUAL_ID:
				return new ValidateName5EditPart(view);

			case Wait5EditPart.VISUAL_ID:
				return new Wait5EditPart(view);

			case WaitName5EditPart.VISUAL_ID:
				return new WaitName5EditPart(view);

			case While5EditPart.VISUAL_ID:
				return new While5EditPart(view);

			case WhileName5EditPart.VISUAL_ID:
				return new WhileName5EditPart(view);

			case ForEach8EditPart.VISUAL_ID:
				return new ForEach8EditPart(view);

			case ForEachName8EditPart.VISUAL_ID:
				return new ForEachName8EditPart(view);

			case If5EditPart.VISUAL_ID:
				return new If5EditPart(view);

			case IfName5EditPart.VISUAL_ID:
				return new IfName5EditPart(view);

			case Reply6EditPart.VISUAL_ID:
				return new Reply6EditPart(view);

			case ReplyName6EditPart.VISUAL_ID:
				return new ReplyName6EditPart(view);

			case Rethrow6EditPart.VISUAL_ID:
				return new Rethrow6EditPart(view);

			case RethrowName6EditPart.VISUAL_ID:
				return new RethrowName6EditPart(view);

			case Scope6EditPart.VISUAL_ID:
				return new Scope6EditPart(view);

			case ScopeName6EditPart.VISUAL_ID:
				return new ScopeName6EditPart(view);

			case Throw6EditPart.VISUAL_ID:
				return new Throw6EditPart(view);

			case ThrowName6EditPart.VISUAL_ID:
				return new ThrowName6EditPart(view);

			case Validate6EditPart.VISUAL_ID:
				return new Validate6EditPart(view);

			case ValidateName6EditPart.VISUAL_ID:
				return new ValidateName6EditPart(view);

			case Wait6EditPart.VISUAL_ID:
				return new Wait6EditPart(view);

			case WaitName6EditPart.VISUAL_ID:
				return new WaitName6EditPart(view);

			case While6EditPart.VISUAL_ID:
				return new While6EditPart(view);

			case WhileName6EditPart.VISUAL_ID:
				return new WhileName6EditPart(view);

			case ElseIfEditPart.VISUAL_ID:
				return new ElseIfEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case Assign11EditPart.VISUAL_ID:
				return new Assign11EditPart(view);

			case AssignName11EditPart.VISUAL_ID:
				return new AssignName11EditPart(view);

			case Compensate11EditPart.VISUAL_ID:
				return new Compensate11EditPart(view);

			case CompensateName11EditPart.VISUAL_ID:
				return new CompensateName11EditPart(view);

			case CompensateScope11EditPart.VISUAL_ID:
				return new CompensateScope11EditPart(view);

			case CompensateScopeName11EditPart.VISUAL_ID:
				return new CompensateScopeName11EditPart(view);

			case Empty11EditPart.VISUAL_ID:
				return new Empty11EditPart(view);

			case EmptyName11EditPart.VISUAL_ID:
				return new EmptyName11EditPart(view);

			case Exit11EditPart.VISUAL_ID:
				return new Exit11EditPart(view);

			case ExitName11EditPart.VISUAL_ID:
				return new ExitName11EditPart(view);

			case ExtensionActivity11EditPart.VISUAL_ID:
				return new ExtensionActivity11EditPart(view);

			case ExtensionActivityName11EditPart.VISUAL_ID:
				return new ExtensionActivityName11EditPart(view);

			case Flow7EditPart.VISUAL_ID:
				return new Flow7EditPart(view);

			case FlowName7EditPart.VISUAL_ID:
				return new FlowName7EditPart(view);

			case ForEach9EditPart.VISUAL_ID:
				return new ForEach9EditPart(view);

			case ForEachName9EditPart.VISUAL_ID:
				return new ForEachName9EditPart(view);

			case If6EditPart.VISUAL_ID:
				return new If6EditPart(view);

			case IfName6EditPart.VISUAL_ID:
				return new IfName6EditPart(view);

			case ElseEditPart.VISUAL_ID:
				return new ElseEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case Assign12EditPart.VISUAL_ID:
				return new Assign12EditPart(view);

			case AssignName12EditPart.VISUAL_ID:
				return new AssignName12EditPart(view);

			case Compensate12EditPart.VISUAL_ID:
				return new Compensate12EditPart(view);

			case CompensateName12EditPart.VISUAL_ID:
				return new CompensateName12EditPart(view);

			case CompensateScope12EditPart.VISUAL_ID:
				return new CompensateScope12EditPart(view);

			case CompensateScopeName12EditPart.VISUAL_ID:
				return new CompensateScopeName12EditPart(view);

			case Empty12EditPart.VISUAL_ID:
				return new Empty12EditPart(view);

			case EmptyName12EditPart.VISUAL_ID:
				return new EmptyName12EditPart(view);

			case Exit12EditPart.VISUAL_ID:
				return new Exit12EditPart(view);

			case ExitName12EditPart.VISUAL_ID:
				return new ExitName12EditPart(view);

			case ExtensionActivity12EditPart.VISUAL_ID:
				return new ExtensionActivity12EditPart(view);

			case ExtensionActivityName12EditPart.VISUAL_ID:
				return new ExtensionActivityName12EditPart(view);

			case Flow8EditPart.VISUAL_ID:
				return new Flow8EditPart(view);

			case FlowName8EditPart.VISUAL_ID:
				return new FlowName8EditPart(view);

			case ForEach10EditPart.VISUAL_ID:
				return new ForEach10EditPart(view);

			case ForEachName10EditPart.VISUAL_ID:
				return new ForEachName10EditPart(view);

			case If7EditPart.VISUAL_ID:
				return new If7EditPart(view);

			case IfName7EditPart.VISUAL_ID:
				return new IfName7EditPart(view);

			case Invoke7EditPart.VISUAL_ID:
				return new Invoke7EditPart(view);

			case InvokeName7EditPart.VISUAL_ID:
				return new InvokeName7EditPart(view);

			case OpaqueActivity7EditPart.VISUAL_ID:
				return new OpaqueActivity7EditPart(view);

			case OpaqueActivityName7EditPart.VISUAL_ID:
				return new OpaqueActivityName7EditPart(view);

			case PartnerActivity7EditPart.VISUAL_ID:
				return new PartnerActivity7EditPart(view);

			case PartnerActivityName7EditPart.VISUAL_ID:
				return new PartnerActivityName7EditPart(view);

			case Pick7EditPart.VISUAL_ID:
				return new Pick7EditPart(view);

			case PickName7EditPart.VISUAL_ID:
				return new PickName7EditPart(view);

			case Receive7EditPart.VISUAL_ID:
				return new Receive7EditPart(view);

			case ReceiveName7EditPart.VISUAL_ID:
				return new ReceiveName7EditPart(view);

			case RepeatUntil7EditPart.VISUAL_ID:
				return new RepeatUntil7EditPart(view);

			case RepeatUntilName6EditPart.VISUAL_ID:
				return new RepeatUntilName6EditPart(view);

			case Reply7EditPart.VISUAL_ID:
				return new Reply7EditPart(view);

			case ReplyName7EditPart.VISUAL_ID:
				return new ReplyName7EditPart(view);

			case Rethrow7EditPart.VISUAL_ID:
				return new Rethrow7EditPart(view);

			case RethrowName7EditPart.VISUAL_ID:
				return new RethrowName7EditPart(view);

			case Scope7EditPart.VISUAL_ID:
				return new Scope7EditPart(view);

			case ScopeName7EditPart.VISUAL_ID:
				return new ScopeName7EditPart(view);

			case Sequence3EditPart.VISUAL_ID:
				return new Sequence3EditPart(view);

			case SequenceName2EditPart.VISUAL_ID:
				return new SequenceName2EditPart(view);

			case Invoke8EditPart.VISUAL_ID:
				return new Invoke8EditPart(view);

			case InvokeName8EditPart.VISUAL_ID:
				return new InvokeName8EditPart(view);

			case OpaqueActivity8EditPart.VISUAL_ID:
				return new OpaqueActivity8EditPart(view);

			case OpaqueActivityName8EditPart.VISUAL_ID:
				return new OpaqueActivityName8EditPart(view);

			case PartnerActivity8EditPart.VISUAL_ID:
				return new PartnerActivity8EditPart(view);

			case PartnerActivityName8EditPart.VISUAL_ID:
				return new PartnerActivityName8EditPart(view);

			case Pick8EditPart.VISUAL_ID:
				return new Pick8EditPart(view);

			case PickName8EditPart.VISUAL_ID:
				return new PickName8EditPart(view);

			case Receive8EditPart.VISUAL_ID:
				return new Receive8EditPart(view);

			case ReceiveName8EditPart.VISUAL_ID:
				return new ReceiveName8EditPart(view);

			case RepeatUntil8EditPart.VISUAL_ID:
				return new RepeatUntil8EditPart(view);

			case RepeatUntilName7EditPart.VISUAL_ID:
				return new RepeatUntilName7EditPart(view);

			case Reply8EditPart.VISUAL_ID:
				return new Reply8EditPart(view);

			case ReplyName8EditPart.VISUAL_ID:
				return new ReplyName8EditPart(view);

			case Rethrow8EditPart.VISUAL_ID:
				return new Rethrow8EditPart(view);

			case RethrowName8EditPart.VISUAL_ID:
				return new RethrowName8EditPart(view);

			case Scope8EditPart.VISUAL_ID:
				return new Scope8EditPart(view);

			case ScopeName8EditPart.VISUAL_ID:
				return new ScopeName8EditPart(view);

			case Sequence4EditPart.VISUAL_ID:
				return new Sequence4EditPart(view);

			case SequenceName3EditPart.VISUAL_ID:
				return new SequenceName3EditPart(view);

			case Throw7EditPart.VISUAL_ID:
				return new Throw7EditPart(view);

			case ThrowName7EditPart.VISUAL_ID:
				return new ThrowName7EditPart(view);

			case Validate7EditPart.VISUAL_ID:
				return new Validate7EditPart(view);

			case ValidateName7EditPart.VISUAL_ID:
				return new ValidateName7EditPart(view);

			case Wait7EditPart.VISUAL_ID:
				return new Wait7EditPart(view);

			case WaitName7EditPart.VISUAL_ID:
				return new WaitName7EditPart(view);

			case While7EditPart.VISUAL_ID:
				return new While7EditPart(view);

			case WhileName7EditPart.VISUAL_ID:
				return new WhileName7EditPart(view);

			case Throw8EditPart.VISUAL_ID:
				return new Throw8EditPart(view);

			case ThrowName8EditPart.VISUAL_ID:
				return new ThrowName8EditPart(view);

			case Validate8EditPart.VISUAL_ID:
				return new Validate8EditPart(view);

			case ValidateName8EditPart.VISUAL_ID:
				return new ValidateName8EditPart(view);

			case Wait8EditPart.VISUAL_ID:
				return new Wait8EditPart(view);

			case WaitName8EditPart.VISUAL_ID:
				return new WaitName8EditPart(view);

			case While8EditPart.VISUAL_ID:
				return new While8EditPart(view);

			case WhileName8EditPart.VISUAL_ID:
				return new WhileName8EditPart(view);

			case Invoke9EditPart.VISUAL_ID:
				return new Invoke9EditPart(view);

			case InvokeName9EditPart.VISUAL_ID:
				return new InvokeName9EditPart(view);

			case OpaqueActivity9EditPart.VISUAL_ID:
				return new OpaqueActivity9EditPart(view);

			case OpaqueActivityName9EditPart.VISUAL_ID:
				return new OpaqueActivityName9EditPart(view);

			case PartnerActivity9EditPart.VISUAL_ID:
				return new PartnerActivity9EditPart(view);

			case PartnerActivityName9EditPart.VISUAL_ID:
				return new PartnerActivityName9EditPart(view);

			case Pick9EditPart.VISUAL_ID:
				return new Pick9EditPart(view);

			case PickName9EditPart.VISUAL_ID:
				return new PickName9EditPart(view);

			case Receive9EditPart.VISUAL_ID:
				return new Receive9EditPart(view);

			case ReceiveName9EditPart.VISUAL_ID:
				return new ReceiveName9EditPart(view);

			case RepeatUntil9EditPart.VISUAL_ID:
				return new RepeatUntil9EditPart(view);

			case RepeatUntilName8EditPart.VISUAL_ID:
				return new RepeatUntilName8EditPart(view);

			case Reply9EditPart.VISUAL_ID:
				return new Reply9EditPart(view);

			case ReplyName9EditPart.VISUAL_ID:
				return new ReplyName9EditPart(view);

			case Rethrow9EditPart.VISUAL_ID:
				return new Rethrow9EditPart(view);

			case RethrowName9EditPart.VISUAL_ID:
				return new RethrowName9EditPart(view);

			case Scope9EditPart.VISUAL_ID:
				return new Scope9EditPart(view);

			case ScopeName9EditPart.VISUAL_ID:
				return new ScopeName9EditPart(view);

			case Sequence5EditPart.VISUAL_ID:
				return new Sequence5EditPart(view);

			case SequenceName4EditPart.VISUAL_ID:
				return new SequenceName4EditPart(view);

			case Throw9EditPart.VISUAL_ID:
				return new Throw9EditPart(view);

			case ThrowName9EditPart.VISUAL_ID:
				return new ThrowName9EditPart(view);

			case Validate9EditPart.VISUAL_ID:
				return new Validate9EditPart(view);

			case ValidateName9EditPart.VISUAL_ID:
				return new ValidateName9EditPart(view);

			case Wait9EditPart.VISUAL_ID:
				return new Wait9EditPart(view);

			case WaitName9EditPart.VISUAL_ID:
				return new WaitName9EditPart(view);

			case While9EditPart.VISUAL_ID:
				return new While9EditPart(view);

			case WhileName9EditPart.VISUAL_ID:
				return new WhileName9EditPart(view);

			case If8EditPart.VISUAL_ID:
				return new If8EditPart(view);

			case IfName8EditPart.VISUAL_ID:
				return new IfName8EditPart(view);

			case Invoke10EditPart.VISUAL_ID:
				return new Invoke10EditPart(view);

			case InvokeName10EditPart.VISUAL_ID:
				return new InvokeName10EditPart(view);

			case OpaqueActivity10EditPart.VISUAL_ID:
				return new OpaqueActivity10EditPart(view);

			case OpaqueActivityName10EditPart.VISUAL_ID:
				return new OpaqueActivityName10EditPart(view);

			case PartnerActivity10EditPart.VISUAL_ID:
				return new PartnerActivity10EditPart(view);

			case PartnerActivityName10EditPart.VISUAL_ID:
				return new PartnerActivityName10EditPart(view);

			case Pick10EditPart.VISUAL_ID:
				return new Pick10EditPart(view);

			case PickName10EditPart.VISUAL_ID:
				return new PickName10EditPart(view);

			case Receive10EditPart.VISUAL_ID:
				return new Receive10EditPart(view);

			case ReceiveName10EditPart.VISUAL_ID:
				return new ReceiveName10EditPart(view);

			case RepeatUntil10EditPart.VISUAL_ID:
				return new RepeatUntil10EditPart(view);

			case RepeatUntilName9EditPart.VISUAL_ID:
				return new RepeatUntilName9EditPart(view);

			case Reply10EditPart.VISUAL_ID:
				return new Reply10EditPart(view);

			case ReplyName10EditPart.VISUAL_ID:
				return new ReplyName10EditPart(view);

			case Rethrow10EditPart.VISUAL_ID:
				return new Rethrow10EditPart(view);

			case RethrowName10EditPart.VISUAL_ID:
				return new RethrowName10EditPart(view);

			case Scope10EditPart.VISUAL_ID:
				return new Scope10EditPart(view);

			case ScopeName10EditPart.VISUAL_ID:
				return new ScopeName10EditPart(view);

			case Sequence6EditPart.VISUAL_ID:
				return new Sequence6EditPart(view);

			case SequenceName5EditPart.VISUAL_ID:
				return new SequenceName5EditPart(view);

			case Throw10EditPart.VISUAL_ID:
				return new Throw10EditPart(view);

			case ThrowName10EditPart.VISUAL_ID:
				return new ThrowName10EditPart(view);

			case Validate10EditPart.VISUAL_ID:
				return new Validate10EditPart(view);

			case ValidateName10EditPart.VISUAL_ID:
				return new ValidateName10EditPart(view);

			case Wait10EditPart.VISUAL_ID:
				return new Wait10EditPart(view);

			case WaitName10EditPart.VISUAL_ID:
				return new WaitName10EditPart(view);

			case While10EditPart.VISUAL_ID:
				return new While10EditPart(view);

			case WhileName10EditPart.VISUAL_ID:
				return new WhileName10EditPart(view);

			case OnEventEditPart.VISUAL_ID:
				return new OnEventEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case Assign13EditPart.VISUAL_ID:
				return new Assign13EditPart(view);

			case AssignName13EditPart.VISUAL_ID:
				return new AssignName13EditPart(view);

			case Compensate13EditPart.VISUAL_ID:
				return new Compensate13EditPart(view);

			case CompensateName13EditPart.VISUAL_ID:
				return new CompensateName13EditPart(view);

			case CompensateScope13EditPart.VISUAL_ID:
				return new CompensateScope13EditPart(view);

			case CompensateScopeName13EditPart.VISUAL_ID:
				return new CompensateScopeName13EditPart(view);

			case Empty13EditPart.VISUAL_ID:
				return new Empty13EditPart(view);

			case EmptyName13EditPart.VISUAL_ID:
				return new EmptyName13EditPart(view);

			case Exit13EditPart.VISUAL_ID:
				return new Exit13EditPart(view);

			case ExitName13EditPart.VISUAL_ID:
				return new ExitName13EditPart(view);

			case ExtensionActivity13EditPart.VISUAL_ID:
				return new ExtensionActivity13EditPart(view);

			case ExtensionActivityName13EditPart.VISUAL_ID:
				return new ExtensionActivityName13EditPart(view);

			case Flow9EditPart.VISUAL_ID:
				return new Flow9EditPart(view);

			case FlowName9EditPart.VISUAL_ID:
				return new FlowName9EditPart(view);

			case ForEach11EditPart.VISUAL_ID:
				return new ForEach11EditPart(view);

			case ForEachName11EditPart.VISUAL_ID:
				return new ForEachName11EditPart(view);

			case If9EditPart.VISUAL_ID:
				return new If9EditPart(view);

			case IfName9EditPart.VISUAL_ID:
				return new IfName9EditPart(view);

			case Invoke11EditPart.VISUAL_ID:
				return new Invoke11EditPart(view);

			case InvokeName11EditPart.VISUAL_ID:
				return new InvokeName11EditPart(view);

			case OpaqueActivity11EditPart.VISUAL_ID:
				return new OpaqueActivity11EditPart(view);

			case OpaqueActivityName11EditPart.VISUAL_ID:
				return new OpaqueActivityName11EditPart(view);

			case PartnerActivity11EditPart.VISUAL_ID:
				return new PartnerActivity11EditPart(view);

			case PartnerActivityName11EditPart.VISUAL_ID:
				return new PartnerActivityName11EditPart(view);

			case Pick11EditPart.VISUAL_ID:
				return new Pick11EditPart(view);

			case PickName11EditPart.VISUAL_ID:
				return new PickName11EditPart(view);

			case Receive11EditPart.VISUAL_ID:
				return new Receive11EditPart(view);

			case ReceiveName11EditPart.VISUAL_ID:
				return new ReceiveName11EditPart(view);

			case RepeatUntil11EditPart.VISUAL_ID:
				return new RepeatUntil11EditPart(view);

			case RepeatUntilName10EditPart.VISUAL_ID:
				return new RepeatUntilName10EditPart(view);

			case Reply11EditPart.VISUAL_ID:
				return new Reply11EditPart(view);

			case ReplyName11EditPart.VISUAL_ID:
				return new ReplyName11EditPart(view);

			case Rethrow11EditPart.VISUAL_ID:
				return new Rethrow11EditPart(view);

			case RethrowName11EditPart.VISUAL_ID:
				return new RethrowName11EditPart(view);

			case Scope11EditPart.VISUAL_ID:
				return new Scope11EditPart(view);

			case ScopeName11EditPart.VISUAL_ID:
				return new ScopeName11EditPart(view);

			case Sequence7EditPart.VISUAL_ID:
				return new Sequence7EditPart(view);

			case SequenceName6EditPart.VISUAL_ID:
				return new SequenceName6EditPart(view);

			case Throw11EditPart.VISUAL_ID:
				return new Throw11EditPart(view);

			case ThrowName11EditPart.VISUAL_ID:
				return new ThrowName11EditPart(view);

			case Validate11EditPart.VISUAL_ID:
				return new Validate11EditPart(view);

			case ValidateName11EditPart.VISUAL_ID:
				return new ValidateName11EditPart(view);

			case Wait11EditPart.VISUAL_ID:
				return new Wait11EditPart(view);

			case WaitName11EditPart.VISUAL_ID:
				return new WaitName11EditPart(view);

			case While11EditPart.VISUAL_ID:
				return new While11EditPart(view);

			case WhileName11EditPart.VISUAL_ID:
				return new WhileName11EditPart(view);

			case ForEach12EditPart.VISUAL_ID:
				return new ForEach12EditPart(view);

			case ForEachName12EditPart.VISUAL_ID:
				return new ForEachName12EditPart(view);

			case If10EditPart.VISUAL_ID:
				return new If10EditPart(view);

			case IfName10EditPart.VISUAL_ID:
				return new IfName10EditPart(view);

			case Invoke12EditPart.VISUAL_ID:
				return new Invoke12EditPart(view);

			case InvokeName12EditPart.VISUAL_ID:
				return new InvokeName12EditPart(view);

			case OpaqueActivity12EditPart.VISUAL_ID:
				return new OpaqueActivity12EditPart(view);

			case OpaqueActivityName12EditPart.VISUAL_ID:
				return new OpaqueActivityName12EditPart(view);

			case PartnerActivity12EditPart.VISUAL_ID:
				return new PartnerActivity12EditPart(view);

			case PartnerActivityName12EditPart.VISUAL_ID:
				return new PartnerActivityName12EditPart(view);

			case Pick12EditPart.VISUAL_ID:
				return new Pick12EditPart(view);

			case PickName12EditPart.VISUAL_ID:
				return new PickName12EditPart(view);

			case Receive12EditPart.VISUAL_ID:
				return new Receive12EditPart(view);

			case ReceiveName12EditPart.VISUAL_ID:
				return new ReceiveName12EditPart(view);

			case RepeatUntil12EditPart.VISUAL_ID:
				return new RepeatUntil12EditPart(view);

			case RepeatUntilName11EditPart.VISUAL_ID:
				return new RepeatUntilName11EditPart(view);

			case Reply12EditPart.VISUAL_ID:
				return new Reply12EditPart(view);

			case ReplyName12EditPart.VISUAL_ID:
				return new ReplyName12EditPart(view);

			case Rethrow12EditPart.VISUAL_ID:
				return new Rethrow12EditPart(view);

			case RethrowName12EditPart.VISUAL_ID:
				return new RethrowName12EditPart(view);

			case Scope12EditPart.VISUAL_ID:
				return new Scope12EditPart(view);

			case ScopeName12EditPart.VISUAL_ID:
				return new ScopeName12EditPart(view);

			case Sequence8EditPart.VISUAL_ID:
				return new Sequence8EditPart(view);

			case SequenceName7EditPart.VISUAL_ID:
				return new SequenceName7EditPart(view);

			case Throw12EditPart.VISUAL_ID:
				return new Throw12EditPart(view);

			case ThrowName12EditPart.VISUAL_ID:
				return new ThrowName12EditPart(view);

			case Validate12EditPart.VISUAL_ID:
				return new Validate12EditPart(view);

			case ValidateName12EditPart.VISUAL_ID:
				return new ValidateName12EditPart(view);

			case Wait12EditPart.VISUAL_ID:
				return new Wait12EditPart(view);

			case WaitName12EditPart.VISUAL_ID:
				return new WaitName12EditPart(view);

			case While12EditPart.VISUAL_ID:
				return new While12EditPart(view);

			case WhileName12EditPart.VISUAL_ID:
				return new WhileName12EditPart(view);

			case ForEach13EditPart.VISUAL_ID:
				return new ForEach13EditPart(view);

			case ForEachName13EditPart.VISUAL_ID:
				return new ForEachName13EditPart(view);

			case If11EditPart.VISUAL_ID:
				return new If11EditPart(view);

			case IfName11EditPart.VISUAL_ID:
				return new IfName11EditPart(view);

			case Invoke13EditPart.VISUAL_ID:
				return new Invoke13EditPart(view);

			case InvokeName13EditPart.VISUAL_ID:
				return new InvokeName13EditPart(view);

			case OpaqueActivity13EditPart.VISUAL_ID:
				return new OpaqueActivity13EditPart(view);

			case OpaqueActivityName13EditPart.VISUAL_ID:
				return new OpaqueActivityName13EditPart(view);

			case PartnerActivity13EditPart.VISUAL_ID:
				return new PartnerActivity13EditPart(view);

			case PartnerActivityName13EditPart.VISUAL_ID:
				return new PartnerActivityName13EditPart(view);

			case Pick13EditPart.VISUAL_ID:
				return new Pick13EditPart(view);

			case PickName13EditPart.VISUAL_ID:
				return new PickName13EditPart(view);

			case Receive13EditPart.VISUAL_ID:
				return new Receive13EditPart(view);

			case ReceiveName13EditPart.VISUAL_ID:
				return new ReceiveName13EditPart(view);

			case RepeatUntil13EditPart.VISUAL_ID:
				return new RepeatUntil13EditPart(view);

			case RepeatUntilName12EditPart.VISUAL_ID:
				return new RepeatUntilName12EditPart(view);

			case Reply13EditPart.VISUAL_ID:
				return new Reply13EditPart(view);

			case ReplyName13EditPart.VISUAL_ID:
				return new ReplyName13EditPart(view);

			case Rethrow13EditPart.VISUAL_ID:
				return new Rethrow13EditPart(view);

			case RethrowName13EditPart.VISUAL_ID:
				return new RethrowName13EditPart(view);

			case Scope13EditPart.VISUAL_ID:
				return new Scope13EditPart(view);

			case ScopeName13EditPart.VISUAL_ID:
				return new ScopeName13EditPart(view);

			case Sequence9EditPart.VISUAL_ID:
				return new Sequence9EditPart(view);

			case SequenceName8EditPart.VISUAL_ID:
				return new SequenceName8EditPart(view);

			case Throw13EditPart.VISUAL_ID:
				return new Throw13EditPart(view);

			case ThrowName13EditPart.VISUAL_ID:
				return new ThrowName13EditPart(view);

			case Validate13EditPart.VISUAL_ID:
				return new Validate13EditPart(view);

			case ValidateName13EditPart.VISUAL_ID:
				return new ValidateName13EditPart(view);

			case Wait13EditPart.VISUAL_ID:
				return new Wait13EditPart(view);

			case WaitName13EditPart.VISUAL_ID:
				return new WaitName13EditPart(view);

			case While13EditPart.VISUAL_ID:
				return new While13EditPart(view);

			case WhileName13EditPart.VISUAL_ID:
				return new WhileName13EditPart(view);

			case EventHandler2EditPart.VISUAL_ID:
				return new EventHandler2EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case ProcessProcessCompartmentEditPart.VISUAL_ID:
				return new ProcessProcessCompartmentEditPart(view);

			case FlowFlowCompartmentEditPart.VISUAL_ID:
				return new FlowFlowCompartmentEditPart(view);

			case FlowFlowCompartment2EditPart.VISUAL_ID:
				return new FlowFlowCompartment2EditPart(view);

			case ForEachForEachCompartmentEditPart.VISUAL_ID:
				return new ForEachForEachCompartmentEditPart(view);

			case ForEachForEachCompartment2EditPart.VISUAL_ID:
				return new ForEachForEachCompartment2EditPart(view);

			case IfIfCompartmentEditPart.VISUAL_ID:
				return new IfIfCompartmentEditPart(view);

			case IfIfCompartment2EditPart.VISUAL_ID:
				return new IfIfCompartment2EditPart(view);

			case ForEachForEachCompartment3EditPart.VISUAL_ID:
				return new ForEachForEachCompartment3EditPart(view);

			case PickPickCompartmentEditPart.VISUAL_ID:
				return new PickPickCompartmentEditPart(view);

			case OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID:
				return new OnAlarmOnAlarmCompartmentEditPart(view);

			case FlowFlowCompartment3EditPart.VISUAL_ID:
				return new FlowFlowCompartment3EditPart(view);

			case IfIfCompartment3EditPart.VISUAL_ID:
				return new IfIfCompartment3EditPart(view);

			case PickPickCompartment2EditPart.VISUAL_ID:
				return new PickPickCompartment2EditPart(view);

			case OnMessageOnMessageCompartmentEditPart.VISUAL_ID:
				return new OnMessageOnMessageCompartmentEditPart(view);

			case FlowFlowCompartment4EditPart.VISUAL_ID:
				return new FlowFlowCompartment4EditPart(view);

			case PickPickCompartment3EditPart.VISUAL_ID:
				return new PickPickCompartment3EditPart(view);

			case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartmentEditPart(view);

			case RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment2EditPart(view);

			case ForEachForEachCompartment4EditPart.VISUAL_ID:
				return new ForEachForEachCompartment4EditPart(view);

			case RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment3EditPart(view);

			case PickPickCompartment4EditPart.VISUAL_ID:
				return new PickPickCompartment4EditPart(view);

			case ScopeScopeCompartmentEditPart.VISUAL_ID:
				return new ScopeScopeCompartmentEditPart(view);

			case ScopeScopeCompartment2EditPart.VISUAL_ID:
				return new ScopeScopeCompartment2EditPart(view);

			case ForEachForEachCompartment5EditPart.VISUAL_ID:
				return new ForEachForEachCompartment5EditPart(view);

			case ScopeScopeCompartment3EditPart.VISUAL_ID:
				return new ScopeScopeCompartment3EditPart(view);

			case PickPickCompartment5EditPart.VISUAL_ID:
				return new PickPickCompartment5EditPart(view);

			case WhileWhileCompartmentEditPart.VISUAL_ID:
				return new WhileWhileCompartmentEditPart(view);

			case FlowFlowCompartment5EditPart.VISUAL_ID:
				return new FlowFlowCompartment5EditPart(view);

			case ScopeScopeCompartment4EditPart.VISUAL_ID:
				return new ScopeScopeCompartment4EditPart(view);

			case EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID:
				return new EventHandlerEventHandlerCompartmentEditPart(view);

			case OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID:
				return new OnAlarmOnAlarmCompartment2EditPart(view);

			case ForEachForEachCompartment6EditPart.VISUAL_ID:
				return new ForEachForEachCompartment6EditPart(view);

			case WhileWhileCompartment2EditPart.VISUAL_ID:
				return new WhileWhileCompartment2EditPart(view);

			case ForEachForEachCompartment7EditPart.VISUAL_ID:
				return new ForEachForEachCompartment7EditPart(view);

			case IfIfCompartment4EditPart.VISUAL_ID:
				return new IfIfCompartment4EditPart(view);

			case RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment4EditPart(view);

			case WhileWhileCompartment3EditPart.VISUAL_ID:
				return new WhileWhileCompartment3EditPart(view);

			case PickPickCompartment6EditPart.VISUAL_ID:
				return new PickPickCompartment6EditPart(view);

			case RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment5EditPart(view);

			case ScopeScopeCompartment5EditPart.VISUAL_ID:
				return new ScopeScopeCompartment5EditPart(view);

			case SequenceSequenceCompartmentEditPart.VISUAL_ID:
				return new SequenceSequenceCompartmentEditPart(view);

			case FlowFlowCompartment6EditPart.VISUAL_ID:
				return new FlowFlowCompartment6EditPart(view);

			case WhileWhileCompartment4EditPart.VISUAL_ID:
				return new WhileWhileCompartment4EditPart(view);

			case WhileWhileCompartment5EditPart.VISUAL_ID:
				return new WhileWhileCompartment5EditPart(view);

			case ForEachForEachCompartment8EditPart.VISUAL_ID:
				return new ForEachForEachCompartment8EditPart(view);

			case IfIfCompartment5EditPart.VISUAL_ID:
				return new IfIfCompartment5EditPart(view);

			case ScopeScopeCompartment6EditPart.VISUAL_ID:
				return new ScopeScopeCompartment6EditPart(view);

			case WhileWhileCompartment6EditPart.VISUAL_ID:
				return new WhileWhileCompartment6EditPart(view);

			case ElseIfEliseIfCompartmentEditPart.VISUAL_ID:
				return new ElseIfEliseIfCompartmentEditPart(view);

			case FlowFlowCompartment7EditPart.VISUAL_ID:
				return new FlowFlowCompartment7EditPart(view);

			case ForEachForEachCompartment9EditPart.VISUAL_ID:
				return new ForEachForEachCompartment9EditPart(view);

			case IfIfCompartment6EditPart.VISUAL_ID:
				return new IfIfCompartment6EditPart(view);

			case ElseElseCompartmentEditPart.VISUAL_ID:
				return new ElseElseCompartmentEditPart(view);

			case FlowFlowCompartment8EditPart.VISUAL_ID:
				return new FlowFlowCompartment8EditPart(view);

			case ForEachForEachCompartment10EditPart.VISUAL_ID:
				return new ForEachForEachCompartment10EditPart(view);

			case IfIfCompartment7EditPart.VISUAL_ID:
				return new IfIfCompartment7EditPart(view);

			case PickPickCompartment7EditPart.VISUAL_ID:
				return new PickPickCompartment7EditPart(view);

			case RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment6EditPart(view);

			case ScopeScopeCompartment7EditPart.VISUAL_ID:
				return new ScopeScopeCompartment7EditPart(view);

			case SequenceSequenceCompartment2EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment2EditPart(view);

			case PickPickCompartment8EditPart.VISUAL_ID:
				return new PickPickCompartment8EditPart(view);

			case RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment7EditPart(view);

			case ScopeScopeCompartment8EditPart.VISUAL_ID:
				return new ScopeScopeCompartment8EditPart(view);

			case SequenceSequenceCompartment3EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment3EditPart(view);

			case WhileWhileCompartment7EditPart.VISUAL_ID:
				return new WhileWhileCompartment7EditPart(view);

			case WhileWhileCompartment8EditPart.VISUAL_ID:
				return new WhileWhileCompartment8EditPart(view);

			case PickPickCompartment9EditPart.VISUAL_ID:
				return new PickPickCompartment9EditPart(view);

			case RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment8EditPart(view);

			case ScopeScopeCompartment9EditPart.VISUAL_ID:
				return new ScopeScopeCompartment9EditPart(view);

			case SequenceSequenceCompartment4EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment4EditPart(view);

			case WhileWhileCompartment9EditPart.VISUAL_ID:
				return new WhileWhileCompartment9EditPart(view);

			case IfIfCompartment8EditPart.VISUAL_ID:
				return new IfIfCompartment8EditPart(view);

			case PickPickCompartment10EditPart.VISUAL_ID:
				return new PickPickCompartment10EditPart(view);

			case RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment9EditPart(view);

			case ScopeScopeCompartment10EditPart.VISUAL_ID:
				return new ScopeScopeCompartment10EditPart(view);

			case SequenceSequenceCompartment5EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment5EditPart(view);

			case WhileWhileCompartment10EditPart.VISUAL_ID:
				return new WhileWhileCompartment10EditPart(view);

			case OnEventOnEventCompartmentEditPart.VISUAL_ID:
				return new OnEventOnEventCompartmentEditPart(view);

			case FlowFlowCompartment9EditPart.VISUAL_ID:
				return new FlowFlowCompartment9EditPart(view);

			case ForEachForEachCompartment11EditPart.VISUAL_ID:
				return new ForEachForEachCompartment11EditPart(view);

			case IfIfCompartment9EditPart.VISUAL_ID:
				return new IfIfCompartment9EditPart(view);

			case PickPickCompartment11EditPart.VISUAL_ID:
				return new PickPickCompartment11EditPart(view);

			case RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment10EditPart(view);

			case ScopeScopeCompartment11EditPart.VISUAL_ID:
				return new ScopeScopeCompartment11EditPart(view);

			case SequenceSequenceCompartment6EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment6EditPart(view);

			case WhileWhileCompartment11EditPart.VISUAL_ID:
				return new WhileWhileCompartment11EditPart(view);

			case ForEachForEachCompartment12EditPart.VISUAL_ID:
				return new ForEachForEachCompartment12EditPart(view);

			case IfIfCompartment10EditPart.VISUAL_ID:
				return new IfIfCompartment10EditPart(view);

			case PickPickCompartment12EditPart.VISUAL_ID:
				return new PickPickCompartment12EditPart(view);

			case RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment11EditPart(view);

			case ScopeScopeCompartment12EditPart.VISUAL_ID:
				return new ScopeScopeCompartment12EditPart(view);

			case SequenceSequenceCompartment7EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment7EditPart(view);

			case WhileWhileCompartment12EditPart.VISUAL_ID:
				return new WhileWhileCompartment12EditPart(view);

			case ForEachForEachCompartment13EditPart.VISUAL_ID:
				return new ForEachForEachCompartment13EditPart(view);

			case IfIfCompartment11EditPart.VISUAL_ID:
				return new IfIfCompartment11EditPart(view);

			case PickPickCompartment13EditPart.VISUAL_ID:
				return new PickPickCompartment13EditPart(view);

			case RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment12EditPart(view);

			case ScopeScopeCompartment13EditPart.VISUAL_ID:
				return new ScopeScopeCompartment13EditPart(view);

			case SequenceSequenceCompartment8EditPart.VISUAL_ID:
				return new SequenceSequenceCompartment8EditPart(view);

			case WhileWhileCompartment13EditPart.VISUAL_ID:
				return new WhileWhileCompartment13EditPart(view);

			case EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID:
				return new EventHandlerEventHandlerCompartment2EditPart(view);

			case CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID:
				return new CompositeActionCompositeActionCompartmentEditPart(
						view);

			case RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartment13EditPart(view);

			case RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileCompartmentEditPart(view);

			case IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID:
				return new IfThenElseIfThenElseCompartmentEditPart(view);

			case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
				return new PartnerActivityToAtomicActionMappingEditPart(view);

			case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
				return new ProcessToCompositeActionMappingEditPart(view);

			case SequenceToSequenceMappingEditPart.VISUAL_ID:
				return new SequenceToSequenceMappingEditPart(view);

			case IfToIfThenElseMappingEditPart.VISUAL_ID:
				return new IfToIfThenElseMappingEditPart(view);

			case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
				return new WhileToRepeatWhileMappingEditPart(view);

			case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
				return new RepeatUntilToRepeatUntilMappingEditPart(view);

			case FlowToSplitJoinMappingEditPart.VISUAL_ID:
				return new FlowToSplitJoinMappingEditPart(view);

			case ForToRepeatWhileMappingEditPart.VISUAL_ID:
				return new ForToRepeatWhileMappingEditPart(view);

			case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
				return new ScopeToCompositeActionMappingEditPart(view);

			case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
				return new ElseIfToIfThenElseMappingEditPart(view);

			case ElseToElseMappingEditPart.VISUAL_ID:
				return new ElseToElseMappingEditPart(view);

			case CompositeProcessComposedOfEditPart.VISUAL_ID:
				return new CompositeProcessComposedOfEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case PerformProcessEditPart.VISUAL_ID:
				return new PerformProcessEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ChoiceComponentsEditPart.VISUAL_ID:
				return new ChoiceComponentsEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case AnyOrderComponentsEditPart.VISUAL_ID:
				return new AnyOrderComponentsEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case SequenceComponentsEditPart.VISUAL_ID:
				return new SequenceComponentsEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case ControlConstructBagRestEditPart.VISUAL_ID:
				return new ControlConstructBagRestEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case ControlConstructListRestEditPart.VISUAL_ID:
				return new ControlConstructListRestEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case IfThenElseThenEditPart.VISUAL_ID:
				return new IfThenElseThenEditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case IfThenElseElseEditPart.VISUAL_ID:
				return new IfThenElseElseEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case RepeatUntilUntilProcessEditPart.VISUAL_ID:
				return new RepeatUntilUntilProcessEditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case RepeatWhileWhileProcessEditPart.VISUAL_ID:
				return new RepeatWhileWhileProcessEditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case ControlConstructBagFirstEditPart.VISUAL_ID:
				return new ControlConstructBagFirstEditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

			case ControlConstructListFirstEditPart.VISUAL_ID:
				return new ControlConstructListFirstEditPart(view);

			case WrappingLabel21EditPart.VISUAL_ID:
				return new WrappingLabel21EditPart(view);

			case SplitComponentsEditPart.VISUAL_ID:
				return new SplitComponentsEditPart(view);

			case WrappingLabel22EditPart.VISUAL_ID:
				return new WrappingLabel22EditPart(view);

			case SplitJoinComponentsEditPart.VISUAL_ID:
				return new SplitJoinComponentsEditPart(view);

			case WrappingLabel23EditPart.VISUAL_ID:
				return new WrappingLabel23EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
