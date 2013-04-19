package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Else;
import org.eclipse.bpel.model.ElseIf;
import org.eclipse.bpel.model.EventHandler;
import org.eclipse.bpel.model.Flow;
import org.eclipse.bpel.model.ForEach;
import org.eclipse.bpel.model.If;
import org.eclipse.bpel.model.Invoke;
import org.eclipse.bpel.model.OnAlarm;
import org.eclipse.bpel.model.OnEvent;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Receive;
import org.eclipse.bpel.model.RepeatUntil;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.While;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.wst.wsdl.Operation;

/**
 * @generated
 */
public class BpeldiagDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case ProcessProcessCompartmentEditPart.VISUAL_ID:
			return getProcessProcessCompartment_7001SemanticChildren(view);
		case FlowFlowCompartmentEditPart.VISUAL_ID:
			return getFlowFlowCompartment_7006SemanticChildren(view);
		case FlowFlowCompartment2EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7007SemanticChildren(view);
		case ForEachForEachCompartmentEditPart.VISUAL_ID:
			return getForEachForEachCompartment_7010SemanticChildren(view);
		case ForEachForEachCompartment2EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7011SemanticChildren(view);
		case IfIfCompartmentEditPart.VISUAL_ID:
			return getIfIfCompartment_7015SemanticChildren(view);
		case IfIfCompartment2EditPart.VISUAL_ID:
			return getIfIfCompartment_7016SemanticChildren(view);
		case ForEachForEachCompartment3EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7017SemanticChildren(view);
		case PickPickCompartmentEditPart.VISUAL_ID:
			return getPickPickCompartment_7070SemanticChildren(view);
		case OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID:
			return getOnAlarmOnAlarmCompartment_7071SemanticChildren(view);
		case FlowFlowCompartment3EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7072SemanticChildren(view);
		case IfIfCompartment3EditPart.VISUAL_ID:
			return getIfIfCompartment_7033SemanticChildren(view);
		case PickPickCompartment2EditPart.VISUAL_ID:
			return getPickPickCompartment_7073SemanticChildren(view);
		case OnMessageOnMessageCompartmentEditPart.VISUAL_ID:
			return getOnMessageOnMessageCompartment_7074SemanticChildren(view);
		case FlowFlowCompartment4EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7075SemanticChildren(view);
		case PickPickCompartment3EditPart.VISUAL_ID:
			return getPickPickCompartment_7076SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7034SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7019SemanticChildren(view);
		case ForEachForEachCompartment4EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7020SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7018SemanticChildren(view);
		case PickPickCompartment4EditPart.VISUAL_ID:
			return getPickPickCompartment_7077SemanticChildren(view);
		case ScopeScopeCompartmentEditPart.VISUAL_ID:
			return getScopeScopeCompartment_7028SemanticChildren(view);
		case ScopeScopeCompartment2EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7022SemanticChildren(view);
		case ForEachForEachCompartment5EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7023SemanticChildren(view);
		case ScopeScopeCompartment3EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7021SemanticChildren(view);
		case PickPickCompartment5EditPart.VISUAL_ID:
			return getPickPickCompartment_7078SemanticChildren(view);
		case WhileWhileCompartmentEditPart.VISUAL_ID:
			return getWhileWhileCompartment_7027SemanticChildren(view);
		case FlowFlowCompartment5EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7049SemanticChildren(view);
		case ScopeScopeCompartment4EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7035SemanticChildren(view);
		case EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID:
			return getEventHandlerEventHandlerCompartment_7079SemanticChildren(view);
		case OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID:
			return getOnAlarmOnAlarmCompartment_7080SemanticChildren(view);
		case ForEachForEachCompartment6EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7081SemanticChildren(view);
		case WhileWhileCompartment2EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7024SemanticChildren(view);
		case ForEachForEachCompartment7EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7026SemanticChildren(view);
		case IfIfCompartment4EditPart.VISUAL_ID:
			return getIfIfCompartment_7050SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7030SemanticChildren(view);
		case WhileWhileCompartment3EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7029SemanticChildren(view);
		case PickPickCompartment6EditPart.VISUAL_ID:
			return getPickPickCompartment_7082SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7051SemanticChildren(view);
		case ScopeScopeCompartment5EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7052SemanticChildren(view);
		case SequenceSequenceCompartmentEditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7053SemanticChildren(view);
		case FlowFlowCompartment6EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7008SemanticChildren(view);
		case WhileWhileCompartment4EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7036SemanticChildren(view);
		case WhileWhileCompartment5EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7025SemanticChildren(view);
		case ForEachForEachCompartment8EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7013SemanticChildren(view);
		case IfIfCompartment5EditPart.VISUAL_ID:
			return getIfIfCompartment_7040SemanticChildren(view);
		case ScopeScopeCompartment6EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7031SemanticChildren(view);
		case WhileWhileCompartment6EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7032SemanticChildren(view);
		case ElseIfEliseIfCompartmentEditPart.VISUAL_ID:
			return getElseIfEliseIfCompartment_7083SemanticChildren(view);
		case FlowFlowCompartment7EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7055SemanticChildren(view);
		case ForEachForEachCompartment9EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7056SemanticChildren(view);
		case IfIfCompartment6EditPart.VISUAL_ID:
			return getIfIfCompartment_7057SemanticChildren(view);
		case ElseElseCompartmentEditPart.VISUAL_ID:
			return getElseElseCompartment_7084SemanticChildren(view);
		case FlowFlowCompartment8EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7063SemanticChildren(view);
		case ForEachForEachCompartment10EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7064SemanticChildren(view);
		case IfIfCompartment7EditPart.VISUAL_ID:
			return getIfIfCompartment_7065SemanticChildren(view);
		case PickPickCompartment7EditPart.VISUAL_ID:
			return getPickPickCompartment_7085SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7066SemanticChildren(view);
		case ScopeScopeCompartment7EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7067SemanticChildren(view);
		case SequenceSequenceCompartment2EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7068SemanticChildren(view);
		case PickPickCompartment8EditPart.VISUAL_ID:
			return getPickPickCompartment_7086SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7041SemanticChildren(view);
		case ScopeScopeCompartment8EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7042SemanticChildren(view);
		case SequenceSequenceCompartment3EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7005SemanticChildren(view);
		case WhileWhileCompartment7EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7043SemanticChildren(view);
		case WhileWhileCompartment8EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7069SemanticChildren(view);
		case PickPickCompartment9EditPart.VISUAL_ID:
			return getPickPickCompartment_7087SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7058SemanticChildren(view);
		case ScopeScopeCompartment9EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7059SemanticChildren(view);
		case SequenceSequenceCompartment4EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7060SemanticChildren(view);
		case WhileWhileCompartment9EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7061SemanticChildren(view);
		case IfIfCompartment8EditPart.VISUAL_ID:
			return getIfIfCompartment_7088SemanticChildren(view);
		case PickPickCompartment10EditPart.VISUAL_ID:
			return getPickPickCompartment_7089SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7090SemanticChildren(view);
		case ScopeScopeCompartment10EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7091SemanticChildren(view);
		case SequenceSequenceCompartment5EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7092SemanticChildren(view);
		case WhileWhileCompartment10EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7093SemanticChildren(view);
		case OnEventOnEventCompartmentEditPart.VISUAL_ID:
			return getOnEventOnEventCompartment_7094SemanticChildren(view);
		case FlowFlowCompartment9EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7095SemanticChildren(view);
		case ForEachForEachCompartment11EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7096SemanticChildren(view);
		case IfIfCompartment9EditPart.VISUAL_ID:
			return getIfIfCompartment_7097SemanticChildren(view);
		case PickPickCompartment11EditPart.VISUAL_ID:
			return getPickPickCompartment_7098SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7099SemanticChildren(view);
		case ScopeScopeCompartment11EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7100SemanticChildren(view);
		case SequenceSequenceCompartment6EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7101SemanticChildren(view);
		case WhileWhileCompartment11EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7102SemanticChildren(view);
		case ForEachForEachCompartment12EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7103SemanticChildren(view);
		case IfIfCompartment10EditPart.VISUAL_ID:
			return getIfIfCompartment_7104SemanticChildren(view);
		case PickPickCompartment12EditPart.VISUAL_ID:
			return getPickPickCompartment_7105SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7106SemanticChildren(view);
		case ScopeScopeCompartment12EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7107SemanticChildren(view);
		case SequenceSequenceCompartment7EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7108SemanticChildren(view);
		case WhileWhileCompartment12EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7109SemanticChildren(view);
		case ForEachForEachCompartment13EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7012SemanticChildren(view);
		case IfIfCompartment11EditPart.VISUAL_ID:
			return getIfIfCompartment_7037SemanticChildren(view);
		case PickPickCompartment13EditPart.VISUAL_ID:
			return getPickPickCompartment_7110SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7038SemanticChildren(view);
		case ScopeScopeCompartment13EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7039SemanticChildren(view);
		case SequenceSequenceCompartment8EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7002SemanticChildren(view);
		case WhileWhileCompartment13EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7044SemanticChildren(view);
		case EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID:
			return getEventHandlerEventHandlerCompartment_7111SemanticChildren(view);
		case FlowFlowCompartment10EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7009SemanticChildren(view);
		case ForEachForEachCompartment14EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7014SemanticChildren(view);
		case IfIfCompartment12EditPart.VISUAL_ID:
			return getIfIfCompartment_7045SemanticChildren(view);
		case PickPickCompartment14EditPart.VISUAL_ID:
			return getPickPickCompartment_7112SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7046SemanticChildren(view);
		case ScopeScopeCompartment14EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7047SemanticChildren(view);
		case SequenceSequenceCompartment9EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7004SemanticChildren(view);
		case WhileWhileCompartment14EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7048SemanticChildren(view);
		case ElseIfEliseIfCompartment2EditPart.VISUAL_ID:
			return getElseIfEliseIfCompartment_7054SemanticChildren(view);
		case ElseElseCompartment2EditPart.VISUAL_ID:
			return getElseElseCompartment_7062SemanticChildren(view);
		case OnAlarmOnAlarmCompartment3EditPart.VISUAL_ID:
			return getOnAlarmOnAlarmCompartment_7113SemanticChildren(view);
		case OnEventOnEventCompartment2EditPart.VISUAL_ID:
			return getOnEventOnEventCompartment_7114SemanticChildren(view);
		case OnMessageOnMessageCompartment2EditPart.VISUAL_ID:
			return getOnMessageOnMessageCompartment_7115SemanticChildren(view);
		case EventHandlerEventHandlerCompartment3EditPart.VISUAL_ID:
			return getEventHandlerEventHandlerCompartment_7116SemanticChildren(view);
		case ProcessContainerEditPart.VISUAL_ID:
			return getProcessContainer_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessProcessCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Process modelElement = (Process) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7015SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7016SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7070SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarmOnAlarmCompartment_7071SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnAlarm modelElement = (OnAlarm) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7072SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7033SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7073SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnMessageOnMessageCompartment_7074SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnMessage modelElement = (OnMessage) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7075SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7076SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7077SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7028SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7078SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7027SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7049SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7035SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandlerEventHandlerCompartment_7079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventHandler modelElement = (EventHandler) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			OnEvent childElement = (OnEvent) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnEvent2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarmOnAlarmCompartment_7080SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnAlarm modelElement = (OnAlarm) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7081SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7050SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7029SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7082SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7051SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7052SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7053SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7036SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7040SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7031SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7032SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseIfEliseIfCompartment_7083SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ElseIf modelElement = (ElseIf) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7055SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7056SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7057SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseElseCompartment_7084SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Else modelElement = (Else) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7063SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7064SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7065SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7085SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7066SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7067SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7068SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7086SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7042SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7043SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7069SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7087SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7058SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7059SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7060SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7061SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7088SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7089SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7090SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7091SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7092SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7093SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnEventOnEventCompartment_7094SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnEvent modelElement = (OnEvent) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7095SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7096SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7097SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7098SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7099SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7100SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7101SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7102SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7103SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7104SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7105SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7106SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7107SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7108SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7109SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7037SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7110SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7039SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7044SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandlerEventHandlerCompartment_7111SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventHandler modelElement = (EventHandler) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			OnEvent childElement = (OnEvent) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnEvent2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForEach modelElement = (ForEach) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7045SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		If modelElement = (If) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIf2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Else2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7112SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Pick modelElement = (Pick) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessage2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7046SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7047SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Scope modelElement = (Scope) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7048SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		While modelElement = (While) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseIfEliseIfCompartment_7054SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ElseIf modelElement = (ElseIf) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseElseCompartment_7062SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Else modelElement = (Else) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarmOnAlarmCompartment_7113SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnAlarm modelElement = (OnAlarm) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow4EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If9EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnEventOnEventCompartment_7114SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnEvent modelElement = (OnEvent) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity14EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If10EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnMessageOnMessageCompartment_7115SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OnMessage modelElement = (OnMessage) containerView.getElement();
		List result = new LinkedList();
		{
			Activity childElement = modelElement.getActivity();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == If11EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil12EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence8EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
			if (visualID == While13EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandlerEventHandlerCompartment_7116SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventHandler modelElement = (EventHandler) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAlarm().iterator(); it.hasNext();) {
			OnAlarm childElement = (OnAlarm) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm3EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			OnEvent childElement = (OnEvent) it.next();
			int visualID = BpeldiagVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnEvent2EditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcessContainer_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProcessContainer modelElement = (ProcessContainer) view.getElement();
		List result = new LinkedList();
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ProcessEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ProcessEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == AssignEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						AssignEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == CompensateEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						CompensateEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == CompensateScopeEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						CompensateScopeEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == EmptyEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						EmptyEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ExitEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ExitEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ExtensionActivityEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ExtensionActivityEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == FlowEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						FlowEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ForEachEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ForEachEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == IfEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						IfEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == InvokeEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						InvokeEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						OpaqueActivityEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == PickEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						PickEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ReceiveEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ReceiveEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == RepeatUntilEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						RepeatUntilEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ReplyEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ReplyEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == RethrowEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						RethrowEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ScopeEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ScopeEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == SequenceEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						SequenceEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ThrowEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ThrowEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ValidateEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ValidateEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == WaitEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						WaitEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == WhileEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						WhileEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						PartnerActivityEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ElseIfEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ElseIfEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == ElseEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						ElseEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == OnAlarmEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						OnAlarmEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == OnEventEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						OnEventEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == OnMessageEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						OnMessageEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == EventHandlerEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						EventHandlerEditPart.VISUAL_ID));
				continue;
			}
			if (BpeldiagVisualIDRegistry.getNodeVisualID(view, childElement) == OperationEditPart.VISUAL_ID) {
				result.add(new BpeldiagNodeDescriptor(childElement,
						OperationEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case ProcessContainerEditPart.VISUAL_ID:
			return getProcessContainer_1000ContainedLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2001ContainedLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_2002ContainedLinks(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_2003ContainedLinks(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_2004ContainedLinks(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_2005ContainedLinks(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_2006ContainedLinks(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_2007ContainedLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2008ContainedLinks(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_2009ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2010ContainedLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_2011ContainedLinks(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_2012ContainedLinks(view);
		case PickEditPart.VISUAL_ID:
			return getPick_2014ContainedLinks(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_2015ContainedLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2016ContainedLinks(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_2017ContainedLinks(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_2018ContainedLinks(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_2019ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2020ContainedLinks(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_2021ContainedLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_2022ContainedLinks(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_2023ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2024ContainedLinks(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_2013ContainedLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_2025ContainedLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2026ContainedLinks(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_2027ContainedLinks(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_2028ContainedLinks(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_2029ContainedLinks(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_2030ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2031ContainedLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3001ContainedLinks(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3004ContainedLinks(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3005ContainedLinks(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3006ContainedLinks(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3007ContainedLinks(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3008ContainedLinks(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3009ContainedLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3055ContainedLinks(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3056ContainedLinks(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3057ContainedLinks(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3058ContainedLinks(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3059ContainedLinks(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3060ContainedLinks(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3061ContainedLinks(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3062ContainedLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3077ContainedLinks(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3078ContainedLinks(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3079ContainedLinks(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3080ContainedLinks(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3081ContainedLinks(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3082ContainedLinks(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3083ContainedLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3084ContainedLinks(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3098ContainedLinks(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3099ContainedLinks(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3100ContainedLinks(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3101ContainedLinks(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3102ContainedLinks(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3103ContainedLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3104ContainedLinks(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3105ContainedLinks(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3085ContainedLinks(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3086ContainedLinks(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3087ContainedLinks(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3088ContainedLinks(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3227ContainedLinks(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3228ContainedLinks(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3229ContainedLinks(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3230ContainedLinks(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3231ContainedLinks(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3232ContainedLinks(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3233ContainedLinks(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3234ContainedLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3063ContainedLinks(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3163ContainedLinks(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3164ContainedLinks(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3165ContainedLinks(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3166ContainedLinks(view);
		case OnMessage2EditPart.VISUAL_ID:
			return getOnMessage_3235ContainedLinks(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3236ContainedLinks(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3237ContainedLinks(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3238ContainedLinks(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3239ContainedLinks(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3240ContainedLinks(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3241ContainedLinks(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3242ContainedLinks(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3064ContainedLinks(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3065ContainedLinks(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3066ContainedLinks(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3067ContainedLinks(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3068ContainedLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3069ContainedLinks(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3106ContainedLinks(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3107ContainedLinks(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3108ContainedLinks(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3109ContainedLinks(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3110ContainedLinks(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3111ContainedLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3112ContainedLinks(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3113ContainedLinks(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3089ContainedLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3090ContainedLinks(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3151ContainedLinks(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3152ContainedLinks(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3153ContainedLinks(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3154ContainedLinks(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3155ContainedLinks(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3156ContainedLinks(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3157ContainedLinks(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3158ContainedLinks(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3114ContainedLinks(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3115ContainedLinks(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3116ContainedLinks(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3117ContainedLinks(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3118ContainedLinks(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3119ContainedLinks(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3120ContainedLinks(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3121ContainedLinks(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3091ContainedLinks(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3092ContainedLinks(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3093ContainedLinks(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3140ContainedLinks(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3141ContainedLinks(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3142ContainedLinks(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3143ContainedLinks(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3144ContainedLinks(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3145ContainedLinks(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3146ContainedLinks(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3147ContainedLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3148ContainedLinks(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3149ContainedLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3150ContainedLinks(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3122ContainedLinks(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3123ContainedLinks(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3124ContainedLinks(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3125ContainedLinks(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3126ContainedLinks(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3127ContainedLinks(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3176ContainedLinks(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3070ContainedLinks(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3071ContainedLinks(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3072ContainedLinks(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3243ContainedLinks(view);
		case OnAlarm3EditPart.VISUAL_ID:
			return getOnAlarm_3244ContainedLinks(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3245ContainedLinks(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3094ContainedLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3095ContainedLinks(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3096ContainedLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097ContainedLinks(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3129ContainedLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3177ContainedLinks(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3167ContainedLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3168ContainedLinks(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3159ContainedLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3160ContainedLinks(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3161ContainedLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3162ContainedLinks(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3130ContainedLinks(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3131ContainedLinks(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3132ContainedLinks(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3133ContainedLinks(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3134ContainedLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3178ContainedLinks(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3135ContainedLinks(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3136ContainedLinks(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3179ContainedLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3180ContainedLinks(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3033ContainedLinks(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3034ContainedLinks(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3035ContainedLinks(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3036ContainedLinks(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3037ContainedLinks(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3038ContainedLinks(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3039ContainedLinks(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3073ContainedLinks(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3074ContainedLinks(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3075ContainedLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3076ContainedLinks(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3137ContainedLinks(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3138ContainedLinks(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3139ContainedLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3128ContainedLinks(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3040ContainedLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3032ContainedLinks(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3169ContainedLinks(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3170ContainedLinks(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3171ContainedLinks(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3172ContainedLinks(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3173ContainedLinks(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3174ContainedLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3175ContainedLinks(view);
		case ElseIf2EditPart.VISUAL_ID:
			return getElseIf_3246ContainedLinks(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3181ContainedLinks(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3182ContainedLinks(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3183ContainedLinks(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3184ContainedLinks(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3185ContainedLinks(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3186ContainedLinks(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3187ContainedLinks(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3188ContainedLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3189ContainedLinks(view);
		case Else2EditPart.VISUAL_ID:
			return getElse_3247ContainedLinks(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3204ContainedLinks(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3205ContainedLinks(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3206ContainedLinks(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3207ContainedLinks(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3208ContainedLinks(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3209ContainedLinks(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3210ContainedLinks(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3211ContainedLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3212ContainedLinks(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3213ContainedLinks(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3214ContainedLinks(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3215ContainedLinks(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3216ContainedLinks(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3217ContainedLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3218ContainedLinks(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3219ContainedLinks(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3220ContainedLinks(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3221ContainedLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3222ContainedLinks(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3041ContainedLinks(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3042ContainedLinks(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3043ContainedLinks(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3044ContainedLinks(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3045ContainedLinks(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3046ContainedLinks(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3047ContainedLinks(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3048ContainedLinks(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3049ContainedLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3050ContainedLinks(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3051ContainedLinks(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3052ContainedLinks(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3053ContainedLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3054ContainedLinks(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3223ContainedLinks(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3224ContainedLinks(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3225ContainedLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3226ContainedLinks(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3190ContainedLinks(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3191ContainedLinks(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3192ContainedLinks(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3193ContainedLinks(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3194ContainedLinks(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3195ContainedLinks(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3196ContainedLinks(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3197ContainedLinks(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3198ContainedLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3199ContainedLinks(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3200ContainedLinks(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3201ContainedLinks(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3202ContainedLinks(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3203ContainedLinks(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3248ContainedLinks(view);
		case Invoke11EditPart.VISUAL_ID:
			return getInvoke_3249ContainedLinks(view);
		case OpaqueActivity11EditPart.VISUAL_ID:
			return getOpaqueActivity_3250ContainedLinks(view);
		case PartnerActivity11EditPart.VISUAL_ID:
			return getPartnerActivity_3251ContainedLinks(view);
		case Pick11EditPart.VISUAL_ID:
			return getPick_3252ContainedLinks(view);
		case Receive11EditPart.VISUAL_ID:
			return getReceive_3253ContainedLinks(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3254ContainedLinks(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255ContainedLinks(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256ContainedLinks(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257ContainedLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3258ContainedLinks(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259ContainedLinks(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260ContainedLinks(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261ContainedLinks(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262ContainedLinks(view);
		case OnEvent2EditPart.VISUAL_ID:
			return getOnEvent_3263ContainedLinks(view);
		case Assign14EditPart.VISUAL_ID:
			return getAssign_3264ContainedLinks(view);
		case Compensate14EditPart.VISUAL_ID:
			return getCompensate_3265ContainedLinks(view);
		case CompensateScope14EditPart.VISUAL_ID:
			return getCompensateScope_3266ContainedLinks(view);
		case Empty14EditPart.VISUAL_ID:
			return getEmpty_3267ContainedLinks(view);
		case Exit14EditPart.VISUAL_ID:
			return getExit_3268ContainedLinks(view);
		case ExtensionActivity14EditPart.VISUAL_ID:
			return getExtensionActivity_3269ContainedLinks(view);
		case Flow10EditPart.VISUAL_ID:
			return getFlow_3270ContainedLinks(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3271ContainedLinks(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3272ContainedLinks(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3273ContainedLinks(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3274ContainedLinks(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3275ContainedLinks(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3276ContainedLinks(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3277ContainedLinks(view);
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3278ContainedLinks(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3279ContainedLinks(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3280ContainedLinks(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3281ContainedLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3282ContainedLinks(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3283ContainedLinks(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3284ContainedLinks(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3285ContainedLinks(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3286ContainedLinks(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3287ContainedLinks(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3288ContainedLinks(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3289ContainedLinks(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3290ContainedLinks(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3291ContainedLinks(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3292ContainedLinks(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3293ContainedLinks(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3294ContainedLinks(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3295ContainedLinks(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3296ContainedLinks(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3297ContainedLinks(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3298ContainedLinks(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3299ContainedLinks(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3300ContainedLinks(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3301ContainedLinks(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3302ContainedLinks(view);
		case ForEach14EditPart.VISUAL_ID:
			return getForEach_3010ContainedLinks(view);
		case If12EditPart.VISUAL_ID:
			return getIf_3011ContainedLinks(view);
		case Invoke14EditPart.VISUAL_ID:
			return getInvoke_3012ContainedLinks(view);
		case OpaqueActivity14EditPart.VISUAL_ID:
			return getOpaqueActivity_3013ContainedLinks(view);
		case PartnerActivity14EditPart.VISUAL_ID:
			return getPartnerActivity_3014ContainedLinks(view);
		case Pick14EditPart.VISUAL_ID:
			return getPick_3015ContainedLinks(view);
		case Receive14EditPart.VISUAL_ID:
			return getReceive_3016ContainedLinks(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3017ContainedLinks(view);
		case Reply14EditPart.VISUAL_ID:
			return getReply_3018ContainedLinks(view);
		case Rethrow14EditPart.VISUAL_ID:
			return getRethrow_3019ContainedLinks(view);
		case Scope14EditPart.VISUAL_ID:
			return getScope_3020ContainedLinks(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3002ContainedLinks(view);
		case Throw14EditPart.VISUAL_ID:
			return getThrow_3021ContainedLinks(view);
		case Validate14EditPart.VISUAL_ID:
			return getValidate_3022ContainedLinks(view);
		case Wait14EditPart.VISUAL_ID:
			return getWait_3023ContainedLinks(view);
		case While14EditPart.VISUAL_ID:
			return getWhile_3024ContainedLinks(view);
		case EventHandler3EditPart.VISUAL_ID:
			return getEventHandler_3303ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2001IncomingLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_2002IncomingLinks(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_2003IncomingLinks(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_2004IncomingLinks(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_2005IncomingLinks(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_2006IncomingLinks(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_2007IncomingLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2008IncomingLinks(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_2009IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2010IncomingLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_2011IncomingLinks(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_2012IncomingLinks(view);
		case PickEditPart.VISUAL_ID:
			return getPick_2014IncomingLinks(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_2015IncomingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2016IncomingLinks(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_2017IncomingLinks(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_2018IncomingLinks(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_2019IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2020IncomingLinks(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_2021IncomingLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_2022IncomingLinks(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_2023IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2024IncomingLinks(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_2013IncomingLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_2025IncomingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2026IncomingLinks(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_2027IncomingLinks(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_2028IncomingLinks(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_2029IncomingLinks(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_2030IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2031IncomingLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3001IncomingLinks(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3004IncomingLinks(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3005IncomingLinks(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3006IncomingLinks(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3007IncomingLinks(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3008IncomingLinks(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3009IncomingLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3055IncomingLinks(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3056IncomingLinks(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3057IncomingLinks(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3058IncomingLinks(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3059IncomingLinks(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3060IncomingLinks(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3061IncomingLinks(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3062IncomingLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3077IncomingLinks(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3078IncomingLinks(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3079IncomingLinks(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3080IncomingLinks(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3081IncomingLinks(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3082IncomingLinks(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3083IncomingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3084IncomingLinks(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3098IncomingLinks(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3099IncomingLinks(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3100IncomingLinks(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3101IncomingLinks(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3102IncomingLinks(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3103IncomingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3104IncomingLinks(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3105IncomingLinks(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3085IncomingLinks(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3086IncomingLinks(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3087IncomingLinks(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3088IncomingLinks(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3227IncomingLinks(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3228IncomingLinks(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3229IncomingLinks(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3230IncomingLinks(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3231IncomingLinks(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3232IncomingLinks(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3233IncomingLinks(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3234IncomingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3063IncomingLinks(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3163IncomingLinks(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3164IncomingLinks(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3165IncomingLinks(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3166IncomingLinks(view);
		case OnMessage2EditPart.VISUAL_ID:
			return getOnMessage_3235IncomingLinks(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3236IncomingLinks(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3237IncomingLinks(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3238IncomingLinks(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3239IncomingLinks(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3240IncomingLinks(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3241IncomingLinks(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3242IncomingLinks(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3064IncomingLinks(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3065IncomingLinks(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3066IncomingLinks(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3067IncomingLinks(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3068IncomingLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3069IncomingLinks(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3106IncomingLinks(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3107IncomingLinks(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3108IncomingLinks(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3109IncomingLinks(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3110IncomingLinks(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3111IncomingLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3112IncomingLinks(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3113IncomingLinks(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3089IncomingLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3090IncomingLinks(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3151IncomingLinks(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3152IncomingLinks(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3153IncomingLinks(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3154IncomingLinks(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3155IncomingLinks(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3156IncomingLinks(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3157IncomingLinks(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3158IncomingLinks(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3114IncomingLinks(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3115IncomingLinks(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3116IncomingLinks(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3117IncomingLinks(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3118IncomingLinks(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3119IncomingLinks(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3120IncomingLinks(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3121IncomingLinks(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3091IncomingLinks(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3092IncomingLinks(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3093IncomingLinks(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3140IncomingLinks(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3141IncomingLinks(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3142IncomingLinks(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3143IncomingLinks(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3144IncomingLinks(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3145IncomingLinks(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3146IncomingLinks(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3147IncomingLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3148IncomingLinks(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3149IncomingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3150IncomingLinks(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3122IncomingLinks(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3123IncomingLinks(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3124IncomingLinks(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3125IncomingLinks(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3126IncomingLinks(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3127IncomingLinks(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3176IncomingLinks(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3070IncomingLinks(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3071IncomingLinks(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3072IncomingLinks(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3243IncomingLinks(view);
		case OnAlarm3EditPart.VISUAL_ID:
			return getOnAlarm_3244IncomingLinks(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3245IncomingLinks(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3094IncomingLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3095IncomingLinks(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3096IncomingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097IncomingLinks(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3129IncomingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3177IncomingLinks(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3167IncomingLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3168IncomingLinks(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3159IncomingLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3160IncomingLinks(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3161IncomingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3162IncomingLinks(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3130IncomingLinks(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3131IncomingLinks(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3132IncomingLinks(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3133IncomingLinks(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3134IncomingLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3178IncomingLinks(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3135IncomingLinks(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3136IncomingLinks(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3179IncomingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3180IncomingLinks(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3033IncomingLinks(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3034IncomingLinks(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3035IncomingLinks(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3036IncomingLinks(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3037IncomingLinks(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3038IncomingLinks(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3039IncomingLinks(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3073IncomingLinks(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3074IncomingLinks(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3075IncomingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3076IncomingLinks(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3137IncomingLinks(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3138IncomingLinks(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3139IncomingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3128IncomingLinks(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3040IncomingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3032IncomingLinks(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3169IncomingLinks(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3170IncomingLinks(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3171IncomingLinks(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3172IncomingLinks(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3173IncomingLinks(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3174IncomingLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3175IncomingLinks(view);
		case ElseIf2EditPart.VISUAL_ID:
			return getElseIf_3246IncomingLinks(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3181IncomingLinks(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3182IncomingLinks(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3183IncomingLinks(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3184IncomingLinks(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3185IncomingLinks(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3186IncomingLinks(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3187IncomingLinks(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3188IncomingLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3189IncomingLinks(view);
		case Else2EditPart.VISUAL_ID:
			return getElse_3247IncomingLinks(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3204IncomingLinks(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3205IncomingLinks(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3206IncomingLinks(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3207IncomingLinks(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3208IncomingLinks(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3209IncomingLinks(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3210IncomingLinks(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3211IncomingLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3212IncomingLinks(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3213IncomingLinks(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3214IncomingLinks(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3215IncomingLinks(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3216IncomingLinks(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3217IncomingLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3218IncomingLinks(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3219IncomingLinks(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3220IncomingLinks(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3221IncomingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3222IncomingLinks(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3041IncomingLinks(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3042IncomingLinks(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3043IncomingLinks(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3044IncomingLinks(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3045IncomingLinks(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3046IncomingLinks(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3047IncomingLinks(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3048IncomingLinks(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3049IncomingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3050IncomingLinks(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3051IncomingLinks(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3052IncomingLinks(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3053IncomingLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3054IncomingLinks(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3223IncomingLinks(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3224IncomingLinks(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3225IncomingLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3226IncomingLinks(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3190IncomingLinks(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3191IncomingLinks(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3192IncomingLinks(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3193IncomingLinks(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3194IncomingLinks(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3195IncomingLinks(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3196IncomingLinks(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3197IncomingLinks(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3198IncomingLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3199IncomingLinks(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3200IncomingLinks(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3201IncomingLinks(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3202IncomingLinks(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3203IncomingLinks(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3248IncomingLinks(view);
		case Invoke11EditPart.VISUAL_ID:
			return getInvoke_3249IncomingLinks(view);
		case OpaqueActivity11EditPart.VISUAL_ID:
			return getOpaqueActivity_3250IncomingLinks(view);
		case PartnerActivity11EditPart.VISUAL_ID:
			return getPartnerActivity_3251IncomingLinks(view);
		case Pick11EditPart.VISUAL_ID:
			return getPick_3252IncomingLinks(view);
		case Receive11EditPart.VISUAL_ID:
			return getReceive_3253IncomingLinks(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3254IncomingLinks(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255IncomingLinks(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256IncomingLinks(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257IncomingLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3258IncomingLinks(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259IncomingLinks(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260IncomingLinks(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261IncomingLinks(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262IncomingLinks(view);
		case OnEvent2EditPart.VISUAL_ID:
			return getOnEvent_3263IncomingLinks(view);
		case Assign14EditPart.VISUAL_ID:
			return getAssign_3264IncomingLinks(view);
		case Compensate14EditPart.VISUAL_ID:
			return getCompensate_3265IncomingLinks(view);
		case CompensateScope14EditPart.VISUAL_ID:
			return getCompensateScope_3266IncomingLinks(view);
		case Empty14EditPart.VISUAL_ID:
			return getEmpty_3267IncomingLinks(view);
		case Exit14EditPart.VISUAL_ID:
			return getExit_3268IncomingLinks(view);
		case ExtensionActivity14EditPart.VISUAL_ID:
			return getExtensionActivity_3269IncomingLinks(view);
		case Flow10EditPart.VISUAL_ID:
			return getFlow_3270IncomingLinks(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3271IncomingLinks(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3272IncomingLinks(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3273IncomingLinks(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3274IncomingLinks(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3275IncomingLinks(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3276IncomingLinks(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3277IncomingLinks(view);
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3278IncomingLinks(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3279IncomingLinks(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3280IncomingLinks(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3281IncomingLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3282IncomingLinks(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3283IncomingLinks(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3284IncomingLinks(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3285IncomingLinks(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3286IncomingLinks(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3287IncomingLinks(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3288IncomingLinks(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3289IncomingLinks(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3290IncomingLinks(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3291IncomingLinks(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3292IncomingLinks(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3293IncomingLinks(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3294IncomingLinks(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3295IncomingLinks(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3296IncomingLinks(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3297IncomingLinks(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3298IncomingLinks(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3299IncomingLinks(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3300IncomingLinks(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3301IncomingLinks(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3302IncomingLinks(view);
		case ForEach14EditPart.VISUAL_ID:
			return getForEach_3010IncomingLinks(view);
		case If12EditPart.VISUAL_ID:
			return getIf_3011IncomingLinks(view);
		case Invoke14EditPart.VISUAL_ID:
			return getInvoke_3012IncomingLinks(view);
		case OpaqueActivity14EditPart.VISUAL_ID:
			return getOpaqueActivity_3013IncomingLinks(view);
		case PartnerActivity14EditPart.VISUAL_ID:
			return getPartnerActivity_3014IncomingLinks(view);
		case Pick14EditPart.VISUAL_ID:
			return getPick_3015IncomingLinks(view);
		case Receive14EditPart.VISUAL_ID:
			return getReceive_3016IncomingLinks(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3017IncomingLinks(view);
		case Reply14EditPart.VISUAL_ID:
			return getReply_3018IncomingLinks(view);
		case Rethrow14EditPart.VISUAL_ID:
			return getRethrow_3019IncomingLinks(view);
		case Scope14EditPart.VISUAL_ID:
			return getScope_3020IncomingLinks(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3002IncomingLinks(view);
		case Throw14EditPart.VISUAL_ID:
			return getThrow_3021IncomingLinks(view);
		case Validate14EditPart.VISUAL_ID:
			return getValidate_3022IncomingLinks(view);
		case Wait14EditPart.VISUAL_ID:
			return getWait_3023IncomingLinks(view);
		case While14EditPart.VISUAL_ID:
			return getWhile_3024IncomingLinks(view);
		case EventHandler3EditPart.VISUAL_ID:
			return getEventHandler_3303IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2001OutgoingLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_2002OutgoingLinks(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_2003OutgoingLinks(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_2004OutgoingLinks(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_2005OutgoingLinks(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_2006OutgoingLinks(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_2007OutgoingLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2008OutgoingLinks(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_2009OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2010OutgoingLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_2011OutgoingLinks(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_2012OutgoingLinks(view);
		case PickEditPart.VISUAL_ID:
			return getPick_2014OutgoingLinks(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_2015OutgoingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2016OutgoingLinks(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_2017OutgoingLinks(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_2018OutgoingLinks(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_2019OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2020OutgoingLinks(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_2021OutgoingLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_2022OutgoingLinks(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_2023OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2024OutgoingLinks(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_2013OutgoingLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_2025OutgoingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2026OutgoingLinks(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_2027OutgoingLinks(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_2028OutgoingLinks(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_2029OutgoingLinks(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_2030OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2031OutgoingLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3001OutgoingLinks(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3004OutgoingLinks(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3005OutgoingLinks(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3006OutgoingLinks(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3007OutgoingLinks(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3008OutgoingLinks(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3009OutgoingLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3055OutgoingLinks(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3056OutgoingLinks(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3057OutgoingLinks(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3058OutgoingLinks(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3059OutgoingLinks(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3060OutgoingLinks(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3061OutgoingLinks(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3062OutgoingLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3077OutgoingLinks(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3078OutgoingLinks(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3079OutgoingLinks(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3080OutgoingLinks(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3081OutgoingLinks(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3082OutgoingLinks(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3083OutgoingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3084OutgoingLinks(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3098OutgoingLinks(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3099OutgoingLinks(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3100OutgoingLinks(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3101OutgoingLinks(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3102OutgoingLinks(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3103OutgoingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3104OutgoingLinks(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3105OutgoingLinks(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3085OutgoingLinks(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3086OutgoingLinks(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3087OutgoingLinks(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3088OutgoingLinks(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3227OutgoingLinks(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3228OutgoingLinks(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3229OutgoingLinks(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3230OutgoingLinks(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3231OutgoingLinks(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3232OutgoingLinks(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3233OutgoingLinks(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3234OutgoingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3063OutgoingLinks(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3163OutgoingLinks(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3164OutgoingLinks(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3165OutgoingLinks(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3166OutgoingLinks(view);
		case OnMessage2EditPart.VISUAL_ID:
			return getOnMessage_3235OutgoingLinks(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3236OutgoingLinks(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3237OutgoingLinks(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3238OutgoingLinks(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3239OutgoingLinks(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3240OutgoingLinks(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3241OutgoingLinks(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3242OutgoingLinks(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3064OutgoingLinks(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3065OutgoingLinks(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3066OutgoingLinks(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3067OutgoingLinks(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3068OutgoingLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3069OutgoingLinks(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3106OutgoingLinks(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3107OutgoingLinks(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3108OutgoingLinks(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3109OutgoingLinks(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3110OutgoingLinks(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3111OutgoingLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3112OutgoingLinks(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3113OutgoingLinks(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3089OutgoingLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3090OutgoingLinks(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3151OutgoingLinks(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3152OutgoingLinks(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3153OutgoingLinks(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3154OutgoingLinks(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3155OutgoingLinks(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3156OutgoingLinks(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3157OutgoingLinks(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3158OutgoingLinks(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3114OutgoingLinks(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3115OutgoingLinks(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3116OutgoingLinks(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3117OutgoingLinks(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3118OutgoingLinks(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3119OutgoingLinks(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3120OutgoingLinks(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3121OutgoingLinks(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3091OutgoingLinks(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3092OutgoingLinks(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3093OutgoingLinks(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3140OutgoingLinks(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3141OutgoingLinks(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3142OutgoingLinks(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3143OutgoingLinks(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3144OutgoingLinks(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3145OutgoingLinks(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3146OutgoingLinks(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3147OutgoingLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3148OutgoingLinks(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3149OutgoingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3150OutgoingLinks(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3122OutgoingLinks(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3123OutgoingLinks(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3124OutgoingLinks(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3125OutgoingLinks(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3126OutgoingLinks(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3127OutgoingLinks(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3176OutgoingLinks(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3070OutgoingLinks(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3071OutgoingLinks(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3072OutgoingLinks(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3243OutgoingLinks(view);
		case OnAlarm3EditPart.VISUAL_ID:
			return getOnAlarm_3244OutgoingLinks(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3245OutgoingLinks(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3094OutgoingLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3095OutgoingLinks(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3096OutgoingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097OutgoingLinks(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3129OutgoingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3177OutgoingLinks(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3167OutgoingLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3168OutgoingLinks(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3159OutgoingLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3160OutgoingLinks(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3161OutgoingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3162OutgoingLinks(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3130OutgoingLinks(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3131OutgoingLinks(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3132OutgoingLinks(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3133OutgoingLinks(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3134OutgoingLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3178OutgoingLinks(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3135OutgoingLinks(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3136OutgoingLinks(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3179OutgoingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3180OutgoingLinks(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3033OutgoingLinks(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3034OutgoingLinks(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3035OutgoingLinks(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3036OutgoingLinks(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3037OutgoingLinks(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3038OutgoingLinks(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3039OutgoingLinks(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3073OutgoingLinks(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3074OutgoingLinks(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3075OutgoingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3076OutgoingLinks(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3137OutgoingLinks(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3138OutgoingLinks(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3139OutgoingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3128OutgoingLinks(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3040OutgoingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3032OutgoingLinks(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3169OutgoingLinks(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3170OutgoingLinks(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3171OutgoingLinks(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3172OutgoingLinks(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3173OutgoingLinks(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3174OutgoingLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3175OutgoingLinks(view);
		case ElseIf2EditPart.VISUAL_ID:
			return getElseIf_3246OutgoingLinks(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3181OutgoingLinks(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3182OutgoingLinks(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3183OutgoingLinks(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3184OutgoingLinks(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3185OutgoingLinks(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3186OutgoingLinks(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3187OutgoingLinks(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3188OutgoingLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3189OutgoingLinks(view);
		case Else2EditPart.VISUAL_ID:
			return getElse_3247OutgoingLinks(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3204OutgoingLinks(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3205OutgoingLinks(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3206OutgoingLinks(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3207OutgoingLinks(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3208OutgoingLinks(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3209OutgoingLinks(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3210OutgoingLinks(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3211OutgoingLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3212OutgoingLinks(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3213OutgoingLinks(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3214OutgoingLinks(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3215OutgoingLinks(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3216OutgoingLinks(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3217OutgoingLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3218OutgoingLinks(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3219OutgoingLinks(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3220OutgoingLinks(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3221OutgoingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3222OutgoingLinks(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3041OutgoingLinks(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3042OutgoingLinks(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3043OutgoingLinks(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3044OutgoingLinks(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3045OutgoingLinks(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3046OutgoingLinks(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3047OutgoingLinks(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3048OutgoingLinks(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3049OutgoingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3050OutgoingLinks(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3051OutgoingLinks(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3052OutgoingLinks(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3053OutgoingLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3054OutgoingLinks(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3223OutgoingLinks(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3224OutgoingLinks(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3225OutgoingLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3226OutgoingLinks(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3190OutgoingLinks(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3191OutgoingLinks(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3192OutgoingLinks(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3193OutgoingLinks(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3194OutgoingLinks(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3195OutgoingLinks(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3196OutgoingLinks(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3197OutgoingLinks(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3198OutgoingLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3199OutgoingLinks(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3200OutgoingLinks(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3201OutgoingLinks(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3202OutgoingLinks(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3203OutgoingLinks(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3248OutgoingLinks(view);
		case Invoke11EditPart.VISUAL_ID:
			return getInvoke_3249OutgoingLinks(view);
		case OpaqueActivity11EditPart.VISUAL_ID:
			return getOpaqueActivity_3250OutgoingLinks(view);
		case PartnerActivity11EditPart.VISUAL_ID:
			return getPartnerActivity_3251OutgoingLinks(view);
		case Pick11EditPart.VISUAL_ID:
			return getPick_3252OutgoingLinks(view);
		case Receive11EditPart.VISUAL_ID:
			return getReceive_3253OutgoingLinks(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3254OutgoingLinks(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255OutgoingLinks(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256OutgoingLinks(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257OutgoingLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3258OutgoingLinks(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259OutgoingLinks(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260OutgoingLinks(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261OutgoingLinks(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262OutgoingLinks(view);
		case OnEvent2EditPart.VISUAL_ID:
			return getOnEvent_3263OutgoingLinks(view);
		case Assign14EditPart.VISUAL_ID:
			return getAssign_3264OutgoingLinks(view);
		case Compensate14EditPart.VISUAL_ID:
			return getCompensate_3265OutgoingLinks(view);
		case CompensateScope14EditPart.VISUAL_ID:
			return getCompensateScope_3266OutgoingLinks(view);
		case Empty14EditPart.VISUAL_ID:
			return getEmpty_3267OutgoingLinks(view);
		case Exit14EditPart.VISUAL_ID:
			return getExit_3268OutgoingLinks(view);
		case ExtensionActivity14EditPart.VISUAL_ID:
			return getExtensionActivity_3269OutgoingLinks(view);
		case Flow10EditPart.VISUAL_ID:
			return getFlow_3270OutgoingLinks(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3271OutgoingLinks(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3272OutgoingLinks(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3273OutgoingLinks(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3274OutgoingLinks(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3275OutgoingLinks(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3276OutgoingLinks(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3277OutgoingLinks(view);
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3278OutgoingLinks(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3279OutgoingLinks(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3280OutgoingLinks(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3281OutgoingLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3282OutgoingLinks(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3283OutgoingLinks(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3284OutgoingLinks(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3285OutgoingLinks(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3286OutgoingLinks(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3287OutgoingLinks(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3288OutgoingLinks(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3289OutgoingLinks(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3290OutgoingLinks(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3291OutgoingLinks(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3292OutgoingLinks(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3293OutgoingLinks(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3294OutgoingLinks(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3295OutgoingLinks(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3296OutgoingLinks(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3297OutgoingLinks(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3298OutgoingLinks(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3299OutgoingLinks(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3300OutgoingLinks(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3301OutgoingLinks(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3302OutgoingLinks(view);
		case ForEach14EditPart.VISUAL_ID:
			return getForEach_3010OutgoingLinks(view);
		case If12EditPart.VISUAL_ID:
			return getIf_3011OutgoingLinks(view);
		case Invoke14EditPart.VISUAL_ID:
			return getInvoke_3012OutgoingLinks(view);
		case OpaqueActivity14EditPart.VISUAL_ID:
			return getOpaqueActivity_3013OutgoingLinks(view);
		case PartnerActivity14EditPart.VISUAL_ID:
			return getPartnerActivity_3014OutgoingLinks(view);
		case Pick14EditPart.VISUAL_ID:
			return getPick_3015OutgoingLinks(view);
		case Receive14EditPart.VISUAL_ID:
			return getReceive_3016OutgoingLinks(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3017OutgoingLinks(view);
		case Reply14EditPart.VISUAL_ID:
			return getReply_3018OutgoingLinks(view);
		case Rethrow14EditPart.VISUAL_ID:
			return getRethrow_3019OutgoingLinks(view);
		case Scope14EditPart.VISUAL_ID:
			return getScope_3020OutgoingLinks(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3002OutgoingLinks(view);
		case Throw14EditPart.VISUAL_ID:
			return getThrow_3021OutgoingLinks(view);
		case Validate14EditPart.VISUAL_ID:
			return getValidate_3022OutgoingLinks(view);
		case Wait14EditPart.VISUAL_ID:
			return getWait_3023OutgoingLinks(view);
		case While14EditPart.VISUAL_ID:
			return getWhile_3024OutgoingLinks(view);
		case EventHandler3EditPart.VISUAL_ID:
			return getEventHandler_3303OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessContainer_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_2011ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_2015ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_2017ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_2018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_2019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_2021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_2022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_2023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_2024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_2013ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_2025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_2026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_2027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_2028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_2029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_2030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2031ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3055ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3056ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3057ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3058ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3059ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3060ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3061ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3062ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3077ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3078ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3079ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3080ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3081ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3082ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3083ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3084ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3098ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3099ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3100ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3101ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3102ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3103ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3104ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3105ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3085ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3086ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3087ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3088ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3227ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3228ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3229ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3230ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3231ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3232ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3233ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3234ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3063ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3163ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3164ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3165ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3166ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_3235ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3236ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3237ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3238ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3239ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3240ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3241ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3242ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3064ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3065ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3066ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3067ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3068ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3069ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3106ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3107ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3108ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3109ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3110ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3111ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3112ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3113ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3089ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3090ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3151ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3152ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3153ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3154ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3155ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3156ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3157ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3158ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3114ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3115ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3116ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3117ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3118ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3119ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3120ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3121ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3091ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3092ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3093ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3140ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3141ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3142ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3143ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3144ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3145ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3146ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3147ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3148ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3149ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3150ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3122ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3123ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3124ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3125ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3126ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3127ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3176ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3070ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3071ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3072ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3243ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3244ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3245ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3094ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3095ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3096ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3097ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3129ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3177ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3167ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3168ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3159ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3160ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3161ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3162ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3130ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3131ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3132ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3133ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3134ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3178ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3135ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3136ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3179ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3180ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3036ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3037ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3039ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3073ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3074ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3075ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3076ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3137ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3138ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3139ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3128ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3169ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3170ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3171ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3172ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3173ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3174ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3175ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_3246ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3181ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3182ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3183ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3184ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3185ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3186ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3187ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3188ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3189ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_3247ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3204ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3205ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3206ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3207ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3208ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3209ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3210ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3211ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3212ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3213ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3214ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3215ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3216ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3217ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3218ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3219ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3220ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3221ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3222ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3041ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3042ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3043ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3044ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3045ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3046ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3047ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3048ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3049ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3050ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3051ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3052ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3053ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3054ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3223ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3224ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3225ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3226ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3190ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3191ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3192ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3193ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3194ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3195ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3196ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3197ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3198ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3199ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3200ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3201ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3202ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3203ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3248ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3249ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3250ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3251ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3252ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3253ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3254ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3255ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3256ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3257ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3258ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3259ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3260ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3261ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3262ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_3263ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3264ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3265ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3266ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3267ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3268ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3269ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3270ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3271ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3272ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3273ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3274ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3275ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3276ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3277ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3278ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3279ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3280ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3281ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3282ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3283ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3284ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3285ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3286ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3287ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3288ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3289ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3290ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3291ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3292ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3293ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3294ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3295ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3296ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3297ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3298ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3299ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3300ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3301ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3302ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3012ContainedLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3014ContainedLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3016ContainedLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3018ContainedLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3303ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_2006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_2007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_2008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_2010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_2011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_2012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_2014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_2015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_2017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_2018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_2019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2020IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_2021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_2022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_2023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_2024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_2013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_2025IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_2026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_2027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_2028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_2029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_2030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2031IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_PartnerActivity_Operation_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3055IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3056IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3057IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3058IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3059IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3060IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3061IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3062IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3077IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3078IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3079IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3080IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3081IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3082IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3083IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3084IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3098IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3099IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3100IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3101IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3102IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3103IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3104IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3105IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3085IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3086IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3087IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3088IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3227IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3228IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3229IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3230IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3231IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3232IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3233IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3234IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3063IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3163IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3164IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3165IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3166IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_3235IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3236IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3237IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3238IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3239IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3240IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3241IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3242IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3064IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3065IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3066IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3067IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3068IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3069IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3106IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3107IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3108IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3109IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3110IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3111IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3112IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3113IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3089IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3090IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3151IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3152IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3153IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3154IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3155IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3156IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3157IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3158IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3114IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3115IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3116IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3117IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3118IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3119IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3120IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3121IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3091IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3092IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3093IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3140IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3141IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3142IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3143IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3144IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3145IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3146IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3147IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3148IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3149IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3150IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3122IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3123IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3124IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3125IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3126IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3127IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3176IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3070IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3071IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3072IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3243IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3244IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3245IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3094IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3095IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3096IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3097IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3129IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3177IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3167IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3168IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3159IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3160IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3161IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3162IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3130IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3131IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3132IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3133IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3134IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3178IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3135IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3136IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3179IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3180IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3033IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3034IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3035IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3036IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3037IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3038IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3039IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3073IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3074IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3075IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3076IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3137IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3138IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3139IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3128IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3040IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3032IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3169IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3170IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3171IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3172IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3173IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3174IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3175IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_3246IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3181IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3182IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3183IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3184IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3185IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3186IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3187IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3188IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3189IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_3247IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3204IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3205IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3206IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3207IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3208IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3209IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3210IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3211IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3212IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3213IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3214IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3215IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3216IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3217IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3218IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3219IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3220IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3221IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3222IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3041IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3042IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3043IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3044IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3045IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3046IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3047IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3048IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3049IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3050IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3051IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3052IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3053IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3054IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3223IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3224IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3225IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3226IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3190IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3191IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3192IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3193IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3194IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3195IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3196IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3197IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3198IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3199IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3200IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3201IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3202IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3203IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3248IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3249IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3250IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3251IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3252IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3253IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3254IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3255IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3256IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3257IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3258IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3259IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3260IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3261IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3262IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_3263IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3264IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3265IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3266IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3267IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3268IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3269IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3270IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3271IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3272IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3273IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3274IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3275IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3276IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3277IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3278IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3279IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3280IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3281IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3282IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3283IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3284IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3285IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3286IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3287IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3288IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3289IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3290IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3291IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3292IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3293IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3294IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3295IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3296IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3297IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3298IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3299IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3300IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3301IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3302IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3020IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3303IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_2006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_2008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_2009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_2010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_2011OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_2012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_2014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_2015OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_2017OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_2018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_2019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2020OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_2021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_2022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_2023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_2024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_2013OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_2025OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_2026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_2027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_2028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_2029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_2030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2031OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3055OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3056OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3057OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3058OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3059OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3060OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3061OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3062OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3077OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3078OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3079OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3080OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3081OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3082OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3083OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3084OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3098OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3099OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3100OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3101OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3102OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3103OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3104OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3105OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3085OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3086OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3087OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3088OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3227OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3228OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3229OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3230OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3231OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3232OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3233OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3234OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3063OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3163OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3164OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3165OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3166OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_3235OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3236OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3237OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3238OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3239OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3240OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3241OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3242OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3064OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3065OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3066OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3067OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3068OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3069OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3106OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3107OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3108OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3109OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3110OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3111OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3112OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3113OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3089OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3090OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3151OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3152OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3153OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3154OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3155OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3156OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3157OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3158OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3114OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3115OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3116OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3117OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3118OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3119OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3120OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3121OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3091OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3092OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3093OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3140OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3141OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3142OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3143OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3144OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3145OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3146OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3147OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3148OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3149OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3150OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3122OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3123OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3124OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3125OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3126OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3127OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3176OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3070OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3071OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3072OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3243OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3244OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3245OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3094OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3095OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3096OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3097OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3129OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3177OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3167OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3168OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3159OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3160OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3161OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3162OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3130OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3131OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3132OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3133OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3134OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3178OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3135OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3136OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3179OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3180OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3033OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3034OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3035OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3036OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3037OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3038OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3039OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3073OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3074OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3075OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3076OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3137OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3138OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3139OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3128OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3040OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3032OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3169OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3170OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3171OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3172OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3173OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3174OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3175OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_3246OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3181OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3182OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3183OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3184OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3185OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3186OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3187OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3188OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3189OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_3247OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3204OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3205OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3206OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3207OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3208OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3209OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3210OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3211OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3212OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3213OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3214OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3215OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3216OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3217OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3218OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3219OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3220OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3221OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3222OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3041OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3042OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3043OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3044OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3045OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3046OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3047OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3048OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3049OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3050OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3051OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3052OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3053OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3054OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3223OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3224OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3225OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3226OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3190OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3191OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3192OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3193OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3194OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3195OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3196OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3197OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3198OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3199OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3200OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3201OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3202OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3203OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3248OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3249OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3250OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3251OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3252OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3253OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3254OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3255OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3256OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3257OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3258OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3259OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3260OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3261OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3262OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_3263OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3264OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3265OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3266OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3267OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3268OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3269OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3270OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3271OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3272OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3273OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3274OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3275OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3276OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3277OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3278OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3279OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3280OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3281OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3282OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3283OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3284OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3285OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3286OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3287OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3288OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3289OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3290OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3291OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3292OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3293OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3294OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3295OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3296OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3297OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3298OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3299OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3300OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3301OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3302OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3012OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3014OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3016OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3018OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3020OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3303OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_PartnerActivity_Operation_4001(
			Operation target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == BPELPackage.eINSTANCE
					.getPartnerActivity_Operation()) {
				result.add(new BpeldiagLinkDescriptor(setting.getEObject(),
						target,
						BpeldiagElementTypes.PartnerActivityOperation_4001,
						PartnerActivityOperationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_PartnerActivity_Operation_4001(
			PartnerActivity source) {
		Collection result = new LinkedList();
		Operation destination = source.getOperation();
		if (destination == null) {
			return result;
		}
		result.add(new BpeldiagLinkDescriptor(source, destination,
				BpeldiagElementTypes.PartnerActivityOperation_4001,
				PartnerActivityOperationEditPart.VISUAL_ID));
		return result;
	}

}
