package net.sf.ictalive.coordination.wfannotation.mapping.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage;
import net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;

import org.eclipse.bpel.model.Activity;
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

/**
 * @generated
 */
public class MappingDiagramUpdater {

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
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case ProcessProcessCompartmentEditPart.VISUAL_ID:
			return getProcessProcessCompartment_7001SemanticChildren(view);
		case FlowFlowCompartmentEditPart.VISUAL_ID:
			return getFlowFlowCompartment_7002SemanticChildren(view);
		case FlowFlowCompartment2EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7003SemanticChildren(view);
		case ForEachForEachCompartmentEditPart.VISUAL_ID:
			return getForEachForEachCompartment_7004SemanticChildren(view);
		case ForEachForEachCompartment2EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7005SemanticChildren(view);
		case IfIfCompartmentEditPart.VISUAL_ID:
			return getIfIfCompartment_7006SemanticChildren(view);
		case IfIfCompartment2EditPart.VISUAL_ID:
			return getIfIfCompartment_7007SemanticChildren(view);
		case ForEachForEachCompartment3EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7008SemanticChildren(view);
		case PickPickCompartmentEditPart.VISUAL_ID:
			return getPickPickCompartment_7009SemanticChildren(view);
		case OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID:
			return getOnAlarmOnAlarmCompartment_7010SemanticChildren(view);
		case FlowFlowCompartment3EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7011SemanticChildren(view);
		case IfIfCompartment3EditPart.VISUAL_ID:
			return getIfIfCompartment_7012SemanticChildren(view);
		case PickPickCompartment2EditPart.VISUAL_ID:
			return getPickPickCompartment_7013SemanticChildren(view);
		case OnMessageOnMessageCompartmentEditPart.VISUAL_ID:
			return getOnMessageOnMessageCompartment_7014SemanticChildren(view);
		case FlowFlowCompartment4EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7015SemanticChildren(view);
		case PickPickCompartment3EditPart.VISUAL_ID:
			return getPickPickCompartment_7016SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7017SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7018SemanticChildren(view);
		case ForEachForEachCompartment4EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7019SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7020SemanticChildren(view);
		case PickPickCompartment4EditPart.VISUAL_ID:
			return getPickPickCompartment_7021SemanticChildren(view);
		case ScopeScopeCompartmentEditPart.VISUAL_ID:
			return getScopeScopeCompartment_7022SemanticChildren(view);
		case ScopeScopeCompartment2EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7023SemanticChildren(view);
		case ForEachForEachCompartment5EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7024SemanticChildren(view);
		case ScopeScopeCompartment3EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7025SemanticChildren(view);
		case PickPickCompartment5EditPart.VISUAL_ID:
			return getPickPickCompartment_7026SemanticChildren(view);
		case WhileWhileCompartmentEditPart.VISUAL_ID:
			return getWhileWhileCompartment_7027SemanticChildren(view);
		case FlowFlowCompartment5EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7028SemanticChildren(view);
		case ScopeScopeCompartment4EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7029SemanticChildren(view);
		case EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID:
			return getEventHandlerEventHandlerCompartment_7030SemanticChildren(view);
		case OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID:
			return getOnAlarmOnAlarmCompartment_7031SemanticChildren(view);
		case ForEachForEachCompartment6EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7032SemanticChildren(view);
		case WhileWhileCompartment2EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7033SemanticChildren(view);
		case ForEachForEachCompartment7EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7034SemanticChildren(view);
		case IfIfCompartment4EditPart.VISUAL_ID:
			return getIfIfCompartment_7035SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7036SemanticChildren(view);
		case WhileWhileCompartment3EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7037SemanticChildren(view);
		case PickPickCompartment6EditPart.VISUAL_ID:
			return getPickPickCompartment_7038SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7039SemanticChildren(view);
		case ScopeScopeCompartment5EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7040SemanticChildren(view);
		case SequenceSequenceCompartmentEditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7041SemanticChildren(view);
		case FlowFlowCompartment6EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7042SemanticChildren(view);
		case WhileWhileCompartment4EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7043SemanticChildren(view);
		case WhileWhileCompartment5EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7044SemanticChildren(view);
		case ForEachForEachCompartment8EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7045SemanticChildren(view);
		case IfIfCompartment5EditPart.VISUAL_ID:
			return getIfIfCompartment_7046SemanticChildren(view);
		case ScopeScopeCompartment6EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7047SemanticChildren(view);
		case WhileWhileCompartment6EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7048SemanticChildren(view);
		case ElseIfEliseIfCompartmentEditPart.VISUAL_ID:
			return getElseIfEliseIfCompartment_7049SemanticChildren(view);
		case FlowFlowCompartment7EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7050SemanticChildren(view);
		case ForEachForEachCompartment9EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7051SemanticChildren(view);
		case IfIfCompartment6EditPart.VISUAL_ID:
			return getIfIfCompartment_7052SemanticChildren(view);
		case ElseElseCompartmentEditPart.VISUAL_ID:
			return getElseElseCompartment_7053SemanticChildren(view);
		case FlowFlowCompartment8EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7054SemanticChildren(view);
		case ForEachForEachCompartment10EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7055SemanticChildren(view);
		case IfIfCompartment7EditPart.VISUAL_ID:
			return getIfIfCompartment_7056SemanticChildren(view);
		case PickPickCompartment7EditPart.VISUAL_ID:
			return getPickPickCompartment_7057SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7058SemanticChildren(view);
		case ScopeScopeCompartment7EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7059SemanticChildren(view);
		case SequenceSequenceCompartment2EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7060SemanticChildren(view);
		case PickPickCompartment8EditPart.VISUAL_ID:
			return getPickPickCompartment_7061SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7062SemanticChildren(view);
		case ScopeScopeCompartment8EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7063SemanticChildren(view);
		case SequenceSequenceCompartment3EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7064SemanticChildren(view);
		case WhileWhileCompartment7EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7065SemanticChildren(view);
		case WhileWhileCompartment8EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7066SemanticChildren(view);
		case PickPickCompartment9EditPart.VISUAL_ID:
			return getPickPickCompartment_7067SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7068SemanticChildren(view);
		case ScopeScopeCompartment9EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7069SemanticChildren(view);
		case SequenceSequenceCompartment4EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7070SemanticChildren(view);
		case WhileWhileCompartment9EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7071SemanticChildren(view);
		case IfIfCompartment8EditPart.VISUAL_ID:
			return getIfIfCompartment_7072SemanticChildren(view);
		case PickPickCompartment10EditPart.VISUAL_ID:
			return getPickPickCompartment_7073SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7074SemanticChildren(view);
		case ScopeScopeCompartment10EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7075SemanticChildren(view);
		case SequenceSequenceCompartment5EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7076SemanticChildren(view);
		case WhileWhileCompartment10EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7077SemanticChildren(view);
		case OnEventOnEventCompartmentEditPart.VISUAL_ID:
			return getOnEventOnEventCompartment_7078SemanticChildren(view);
		case FlowFlowCompartment9EditPart.VISUAL_ID:
			return getFlowFlowCompartment_7079SemanticChildren(view);
		case ForEachForEachCompartment11EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7080SemanticChildren(view);
		case IfIfCompartment9EditPart.VISUAL_ID:
			return getIfIfCompartment_7081SemanticChildren(view);
		case PickPickCompartment11EditPart.VISUAL_ID:
			return getPickPickCompartment_7082SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7083SemanticChildren(view);
		case ScopeScopeCompartment11EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7084SemanticChildren(view);
		case SequenceSequenceCompartment6EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7085SemanticChildren(view);
		case WhileWhileCompartment11EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7086SemanticChildren(view);
		case ForEachForEachCompartment12EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7087SemanticChildren(view);
		case IfIfCompartment10EditPart.VISUAL_ID:
			return getIfIfCompartment_7088SemanticChildren(view);
		case PickPickCompartment12EditPart.VISUAL_ID:
			return getPickPickCompartment_7089SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7090SemanticChildren(view);
		case ScopeScopeCompartment12EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7091SemanticChildren(view);
		case SequenceSequenceCompartment7EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7092SemanticChildren(view);
		case WhileWhileCompartment12EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7093SemanticChildren(view);
		case ForEachForEachCompartment13EditPart.VISUAL_ID:
			return getForEachForEachCompartment_7094SemanticChildren(view);
		case IfIfCompartment11EditPart.VISUAL_ID:
			return getIfIfCompartment_7095SemanticChildren(view);
		case PickPickCompartment13EditPart.VISUAL_ID:
			return getPickPickCompartment_7096SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7097SemanticChildren(view);
		case ScopeScopeCompartment13EditPart.VISUAL_ID:
			return getScopeScopeCompartment_7098SemanticChildren(view);
		case SequenceSequenceCompartment8EditPart.VISUAL_ID:
			return getSequenceSequenceCompartment_7099SemanticChildren(view);
		case WhileWhileCompartment13EditPart.VISUAL_ID:
			return getWhileWhileCompartment_7100SemanticChildren(view);
		case EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID:
			return getEventHandlerEventHandlerCompartment_7101SemanticChildren(view);
		case MappingContainerEditPart.VISUAL_ID:
			return getMappingContainer_1000SemanticChildren(view);
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssignEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == EmptyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == FlowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandler2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7002SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7003SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7004SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7005SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7006SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7007SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7008SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7009SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarmOnAlarmCompartment_7010SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7011SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7012SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7013SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnMessageOnMessageCompartment_7014SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7015SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7016SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7017SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7019SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7020SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7021SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7023SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7024SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7025SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7026SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7028SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7029SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandlerEventHandlerCompartment_7030SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			OnEvent childElement = (OnEvent) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnEventEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarmOnAlarmCompartment_7031SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7032SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7033SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7034SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7035SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7036SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7037SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7038SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7039SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7040SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7041SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7042SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7045SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7046SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseIfEliseIfCompartment_7049SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7050SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7051SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7052SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseElseCompartment_7053SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity12EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7054SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7055SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7056SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7057SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7061SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7062SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7063SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7064SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7065SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7066SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7067SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7068SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7069SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7070SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7071SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7072SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7074SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7075SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7076SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7077SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnEventOnEventCompartment_7078SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity13EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While11EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFlowCompartment_7079SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEachEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReceiveEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7080SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7081SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7083SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7084SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7085SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7086SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7087SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEachForEachCompartment_7094SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivityEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PickEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfIfCompartment_7095SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getElseIf().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPickPickCompartment_7096SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarmEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OnMessage childElement = (OnMessage) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnMessageEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilCompartment_7097SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReplyEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RethrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ScopeEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScopeScopeCompartment_7098SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow3EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ThrowEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WaitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventHandler childElement = modelElement.getEventHandlers();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventHandlerEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceCompartment_7099SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Compensate10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompensateScope10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Empty10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exit10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtensionActivity10EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Flow6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEach8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Invoke8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartnerActivity8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pick8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Receive8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatUntil8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Reply8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rethrow8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Scope8EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Throw7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Validate7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Wait7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWhileWhileCompartment_7100SemanticChildren(View view) {
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Assign9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Compensate9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompensateScope9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Empty9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Exit9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExtensionActivity9EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Flow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == ForEach7EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Invoke6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == OpaqueActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == PartnerActivity6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Pick6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Receive6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Reply5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Rethrow5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Scope5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Throw5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Validate5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wait5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandlerEventHandlerCompartment_7101SemanticChildren(
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
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnAlarm2EditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			OnEvent childElement = (OnEvent) it.next();
			int visualID = MappingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OnEventEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMappingContainer_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MappingContainer modelElement = (MappingContainer) view.getElement();
		List result = new LinkedList();
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == ProcessEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						ProcessEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == AtomicActionEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						AtomicActionEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == CompositeActionEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						CompositeActionEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == SequenceEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						SequenceEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == AnyOrderEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						AnyOrderEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						ControlConstructBagEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == PerformEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						PerformEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == ChoiceEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						ChoiceEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						ControlConstructListEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == RepeatUntilEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						RepeatUntilEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == RepeatWhileEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						RepeatWhileEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == IfThenElseEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						IfThenElseEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == SplitEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						SplitEditPart.VISUAL_ID));
				continue;
			}
			if (MappingVisualIDRegistry.getNodeVisualID(view, childElement) == SplitJoinEditPart.VISUAL_ID) {
				result.add(new MappingNodeDescriptor(childElement,
						SplitJoinEditPart.VISUAL_ID));
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
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case MappingContainerEditPart.VISUAL_ID:
			return getMappingContainer_1000ContainedLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2002ContainedLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2001ContainedLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2014ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004ContainedLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2005ContainedLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2006ContainedLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2007ContainedLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2008ContainedLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2009ContainedLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010ContainedLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011ContainedLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2012ContainedLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2015ContainedLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2016ContainedLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3001ContainedLinks(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_3002ContainedLinks(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_3003ContainedLinks(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_3004ContainedLinks(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_3005ContainedLinks(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_3006ContainedLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_3007ContainedLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3008ContainedLinks(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3009ContainedLinks(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3010ContainedLinks(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3011ContainedLinks(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3012ContainedLinks(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3013ContainedLinks(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3014ContainedLinks(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_3015ContainedLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3016ContainedLinks(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3017ContainedLinks(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3018ContainedLinks(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3019ContainedLinks(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3020ContainedLinks(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3021ContainedLinks(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3022ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3023ContainedLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3024ContainedLinks(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3025ContainedLinks(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3026ContainedLinks(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3027ContainedLinks(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3028ContainedLinks(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3029ContainedLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3030ContainedLinks(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3031ContainedLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3032ContainedLinks(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_3033ContainedLinks(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_3034ContainedLinks(view);
		case PickEditPart.VISUAL_ID:
			return getPick_3035ContainedLinks(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_3036ContainedLinks(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3037ContainedLinks(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3038ContainedLinks(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3039ContainedLinks(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3040ContainedLinks(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3041ContainedLinks(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3042ContainedLinks(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3043ContainedLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3044ContainedLinks(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3045ContainedLinks(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3046ContainedLinks(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3047ContainedLinks(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3048ContainedLinks(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_3049ContainedLinks(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3050ContainedLinks(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3051ContainedLinks(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3052ContainedLinks(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3053ContainedLinks(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3054ContainedLinks(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3055ContainedLinks(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3056ContainedLinks(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3057ContainedLinks(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3058ContainedLinks(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3059ContainedLinks(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3060ContainedLinks(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_3061ContainedLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3062ContainedLinks(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3063ContainedLinks(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3064ContainedLinks(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3065ContainedLinks(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3066ContainedLinks(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3067ContainedLinks(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3068ContainedLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3069ContainedLinks(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3070ContainedLinks(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3071ContainedLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3072ContainedLinks(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3073ContainedLinks(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3074ContainedLinks(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3075ContainedLinks(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3076ContainedLinks(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3077ContainedLinks(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_3078ContainedLinks(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_3079ContainedLinks(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_3080ContainedLinks(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3081ContainedLinks(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3082ContainedLinks(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3083ContainedLinks(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3084ContainedLinks(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3085ContainedLinks(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3086ContainedLinks(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3087ContainedLinks(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3088ContainedLinks(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3089ContainedLinks(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3090ContainedLinks(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3091ContainedLinks(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3092ContainedLinks(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3093ContainedLinks(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3094ContainedLinks(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3095ContainedLinks(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3096ContainedLinks(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3097ContainedLinks(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3098ContainedLinks(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_3099ContainedLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3100ContainedLinks(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_3101ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3102ContainedLinks(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3103ContainedLinks(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3104ContainedLinks(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3105ContainedLinks(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3106ContainedLinks(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3107ContainedLinks(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3108ContainedLinks(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3109ContainedLinks(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3110ContainedLinks(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3111ContainedLinks(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3112ContainedLinks(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_3113ContainedLinks(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3114ContainedLinks(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3115ContainedLinks(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3116ContainedLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3117ContainedLinks(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3118ContainedLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3119ContainedLinks(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3120ContainedLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3121ContainedLinks(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3122ContainedLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3123ContainedLinks(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3124ContainedLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3125ContainedLinks(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3126ContainedLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3127ContainedLinks(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3128ContainedLinks(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3129ContainedLinks(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3130ContainedLinks(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3131ContainedLinks(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3132ContainedLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3133ContainedLinks(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3134ContainedLinks(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3135ContainedLinks(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3136ContainedLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3137ContainedLinks(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3138ContainedLinks(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3139ContainedLinks(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3140ContainedLinks(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3141ContainedLinks(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3142ContainedLinks(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3143ContainedLinks(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3144ContainedLinks(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3145ContainedLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3146ContainedLinks(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3147ContainedLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3148ContainedLinks(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3149ContainedLinks(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3150ContainedLinks(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3151ContainedLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3152ContainedLinks(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3153ContainedLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3154ContainedLinks(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3155ContainedLinks(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3156ContainedLinks(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3157ContainedLinks(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3158ContainedLinks(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3159ContainedLinks(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3160ContainedLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3161ContainedLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3162ContainedLinks(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3163ContainedLinks(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3164ContainedLinks(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3165ContainedLinks(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3166ContainedLinks(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3167ContainedLinks(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3168ContainedLinks(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3169ContainedLinks(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3170ContainedLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3171ContainedLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3172ContainedLinks(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3173ContainedLinks(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3174ContainedLinks(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3175ContainedLinks(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3176ContainedLinks(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3177ContainedLinks(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3178ContainedLinks(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3179ContainedLinks(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3180ContainedLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3181ContainedLinks(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3182ContainedLinks(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3183ContainedLinks(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3184ContainedLinks(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3185ContainedLinks(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3186ContainedLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3187ContainedLinks(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3188ContainedLinks(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3189ContainedLinks(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3190ContainedLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3191ContainedLinks(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3192ContainedLinks(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3193ContainedLinks(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3194ContainedLinks(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3195ContainedLinks(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3196ContainedLinks(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3197ContainedLinks(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3198ContainedLinks(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3199ContainedLinks(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3200ContainedLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3201ContainedLinks(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3202ContainedLinks(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3203ContainedLinks(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3204ContainedLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3205ContainedLinks(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3206ContainedLinks(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3207ContainedLinks(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3208ContainedLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3209ContainedLinks(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3210ContainedLinks(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3211ContainedLinks(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3212ContainedLinks(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3213ContainedLinks(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3214ContainedLinks(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3215ContainedLinks(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3216ContainedLinks(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3217ContainedLinks(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3218ContainedLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3219ContainedLinks(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3220ContainedLinks(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3221ContainedLinks(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3222ContainedLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3223ContainedLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3224ContainedLinks(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3225ContainedLinks(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3226ContainedLinks(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3227ContainedLinks(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3228ContainedLinks(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3229ContainedLinks(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3230ContainedLinks(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3231ContainedLinks(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3232ContainedLinks(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3233ContainedLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3234ContainedLinks(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3235ContainedLinks(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3236ContainedLinks(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3237ContainedLinks(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3238ContainedLinks(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_3239ContainedLinks(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3240ContainedLinks(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3241ContainedLinks(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3242ContainedLinks(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3243ContainedLinks(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3244ContainedLinks(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3245ContainedLinks(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3246ContainedLinks(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3247ContainedLinks(view);
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
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3254ContainedLinks(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255ContainedLinks(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256ContainedLinks(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257ContainedLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3258ContainedLinks(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259ContainedLinks(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260ContainedLinks(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261ContainedLinks(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262ContainedLinks(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3263ContainedLinks(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3264ContainedLinks(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3265ContainedLinks(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3266ContainedLinks(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3267ContainedLinks(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3268ContainedLinks(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3269ContainedLinks(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3270ContainedLinks(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3271ContainedLinks(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3272ContainedLinks(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3273ContainedLinks(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3274ContainedLinks(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3275ContainedLinks(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3276ContainedLinks(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3277ContainedLinks(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3278ContainedLinks(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3279ContainedLinks(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3280ContainedLinks(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3281ContainedLinks(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3282ContainedLinks(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3283ContainedLinks(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3284ContainedLinks(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3285ContainedLinks(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3286ContainedLinks(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3287ContainedLinks(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3288ContainedLinks(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3289ContainedLinks(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3290ContainedLinks(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3291ContainedLinks(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3292ContainedLinks(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3293ContainedLinks(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3294ContainedLinks(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3295ContainedLinks(view);
		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
			return getPartnerActivityToAtomicActionMapping_4001ContainedLinks(view);
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return getProcessToCompositeActionMapping_4002ContainedLinks(view);
		case SequenceToSequenceMappingEditPart.VISUAL_ID:
			return getSequenceToSequenceMapping_4016ContainedLinks(view);
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return getIfToIfThenElseMapping_4017ContainedLinks(view);
		case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
			return getWhileToRepeatWhileMapping_4018ContainedLinks(view);
		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
			return getRepeatUntilToRepeatUntilMapping_4019ContainedLinks(view);
		case FlowToSplitJoinMappingEditPart.VISUAL_ID:
			return getFlowToSplitJoinMapping_4020ContainedLinks(view);
		case ForToRepeatWhileMappingEditPart.VISUAL_ID:
			return getForToRepeatWhileMapping_4021ContainedLinks(view);
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return getScopeToCompositeActionMapping_4022ContainedLinks(view);
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return getElseIfToIfThenElseMapping_4023ContainedLinks(view);
		case ElseToElseMappingEditPart.VISUAL_ID:
			return getElseToElseMapping_4024ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2002IncomingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2001IncomingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2014IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004IncomingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2005IncomingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2006IncomingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2007IncomingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2008IncomingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2009IncomingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010IncomingLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011IncomingLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2012IncomingLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2015IncomingLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2016IncomingLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3001IncomingLinks(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_3002IncomingLinks(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_3003IncomingLinks(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_3004IncomingLinks(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_3005IncomingLinks(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_3006IncomingLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_3007IncomingLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3008IncomingLinks(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3009IncomingLinks(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3010IncomingLinks(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3011IncomingLinks(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3012IncomingLinks(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3013IncomingLinks(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3014IncomingLinks(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_3015IncomingLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3016IncomingLinks(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3017IncomingLinks(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3018IncomingLinks(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3019IncomingLinks(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3020IncomingLinks(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3021IncomingLinks(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3022IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3023IncomingLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3024IncomingLinks(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3025IncomingLinks(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3026IncomingLinks(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3027IncomingLinks(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3028IncomingLinks(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3029IncomingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3030IncomingLinks(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3031IncomingLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3032IncomingLinks(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_3033IncomingLinks(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_3034IncomingLinks(view);
		case PickEditPart.VISUAL_ID:
			return getPick_3035IncomingLinks(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_3036IncomingLinks(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3037IncomingLinks(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3038IncomingLinks(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3039IncomingLinks(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3040IncomingLinks(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3041IncomingLinks(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3042IncomingLinks(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3043IncomingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3044IncomingLinks(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3045IncomingLinks(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3046IncomingLinks(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3047IncomingLinks(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3048IncomingLinks(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_3049IncomingLinks(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3050IncomingLinks(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3051IncomingLinks(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3052IncomingLinks(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3053IncomingLinks(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3054IncomingLinks(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3055IncomingLinks(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3056IncomingLinks(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3057IncomingLinks(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3058IncomingLinks(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3059IncomingLinks(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3060IncomingLinks(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_3061IncomingLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3062IncomingLinks(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3063IncomingLinks(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3064IncomingLinks(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3065IncomingLinks(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3066IncomingLinks(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3067IncomingLinks(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3068IncomingLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3069IncomingLinks(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3070IncomingLinks(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3071IncomingLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3072IncomingLinks(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3073IncomingLinks(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3074IncomingLinks(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3075IncomingLinks(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3076IncomingLinks(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3077IncomingLinks(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_3078IncomingLinks(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_3079IncomingLinks(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_3080IncomingLinks(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3081IncomingLinks(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3082IncomingLinks(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3083IncomingLinks(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3084IncomingLinks(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3085IncomingLinks(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3086IncomingLinks(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3087IncomingLinks(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3088IncomingLinks(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3089IncomingLinks(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3090IncomingLinks(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3091IncomingLinks(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3092IncomingLinks(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3093IncomingLinks(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3094IncomingLinks(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3095IncomingLinks(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3096IncomingLinks(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3097IncomingLinks(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3098IncomingLinks(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_3099IncomingLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3100IncomingLinks(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_3101IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3102IncomingLinks(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3103IncomingLinks(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3104IncomingLinks(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3105IncomingLinks(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3106IncomingLinks(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3107IncomingLinks(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3108IncomingLinks(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3109IncomingLinks(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3110IncomingLinks(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3111IncomingLinks(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3112IncomingLinks(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_3113IncomingLinks(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3114IncomingLinks(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3115IncomingLinks(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3116IncomingLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3117IncomingLinks(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3118IncomingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3119IncomingLinks(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3120IncomingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3121IncomingLinks(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3122IncomingLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3123IncomingLinks(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3124IncomingLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3125IncomingLinks(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3126IncomingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3127IncomingLinks(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3128IncomingLinks(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3129IncomingLinks(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3130IncomingLinks(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3131IncomingLinks(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3132IncomingLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3133IncomingLinks(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3134IncomingLinks(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3135IncomingLinks(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3136IncomingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3137IncomingLinks(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3138IncomingLinks(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3139IncomingLinks(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3140IncomingLinks(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3141IncomingLinks(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3142IncomingLinks(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3143IncomingLinks(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3144IncomingLinks(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3145IncomingLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3146IncomingLinks(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3147IncomingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3148IncomingLinks(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3149IncomingLinks(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3150IncomingLinks(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3151IncomingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3152IncomingLinks(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3153IncomingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3154IncomingLinks(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3155IncomingLinks(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3156IncomingLinks(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3157IncomingLinks(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3158IncomingLinks(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3159IncomingLinks(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3160IncomingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3161IncomingLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3162IncomingLinks(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3163IncomingLinks(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3164IncomingLinks(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3165IncomingLinks(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3166IncomingLinks(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3167IncomingLinks(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3168IncomingLinks(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3169IncomingLinks(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3170IncomingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3171IncomingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3172IncomingLinks(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3173IncomingLinks(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3174IncomingLinks(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3175IncomingLinks(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3176IncomingLinks(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3177IncomingLinks(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3178IncomingLinks(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3179IncomingLinks(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3180IncomingLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3181IncomingLinks(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3182IncomingLinks(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3183IncomingLinks(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3184IncomingLinks(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3185IncomingLinks(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3186IncomingLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3187IncomingLinks(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3188IncomingLinks(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3189IncomingLinks(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3190IncomingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3191IncomingLinks(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3192IncomingLinks(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3193IncomingLinks(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3194IncomingLinks(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3195IncomingLinks(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3196IncomingLinks(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3197IncomingLinks(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3198IncomingLinks(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3199IncomingLinks(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3200IncomingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3201IncomingLinks(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3202IncomingLinks(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3203IncomingLinks(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3204IncomingLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3205IncomingLinks(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3206IncomingLinks(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3207IncomingLinks(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3208IncomingLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3209IncomingLinks(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3210IncomingLinks(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3211IncomingLinks(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3212IncomingLinks(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3213IncomingLinks(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3214IncomingLinks(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3215IncomingLinks(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3216IncomingLinks(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3217IncomingLinks(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3218IncomingLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3219IncomingLinks(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3220IncomingLinks(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3221IncomingLinks(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3222IncomingLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3223IncomingLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3224IncomingLinks(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3225IncomingLinks(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3226IncomingLinks(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3227IncomingLinks(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3228IncomingLinks(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3229IncomingLinks(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3230IncomingLinks(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3231IncomingLinks(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3232IncomingLinks(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3233IncomingLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3234IncomingLinks(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3235IncomingLinks(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3236IncomingLinks(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3237IncomingLinks(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3238IncomingLinks(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_3239IncomingLinks(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3240IncomingLinks(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3241IncomingLinks(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3242IncomingLinks(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3243IncomingLinks(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3244IncomingLinks(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3245IncomingLinks(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3246IncomingLinks(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3247IncomingLinks(view);
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
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3254IncomingLinks(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255IncomingLinks(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256IncomingLinks(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257IncomingLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3258IncomingLinks(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259IncomingLinks(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260IncomingLinks(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261IncomingLinks(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262IncomingLinks(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3263IncomingLinks(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3264IncomingLinks(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3265IncomingLinks(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3266IncomingLinks(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3267IncomingLinks(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3268IncomingLinks(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3269IncomingLinks(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3270IncomingLinks(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3271IncomingLinks(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3272IncomingLinks(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3273IncomingLinks(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3274IncomingLinks(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3275IncomingLinks(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3276IncomingLinks(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3277IncomingLinks(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3278IncomingLinks(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3279IncomingLinks(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3280IncomingLinks(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3281IncomingLinks(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3282IncomingLinks(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3283IncomingLinks(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3284IncomingLinks(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3285IncomingLinks(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3286IncomingLinks(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3287IncomingLinks(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3288IncomingLinks(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3289IncomingLinks(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3290IncomingLinks(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3291IncomingLinks(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3292IncomingLinks(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3293IncomingLinks(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3294IncomingLinks(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3295IncomingLinks(view);
		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
			return getPartnerActivityToAtomicActionMapping_4001IncomingLinks(view);
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return getProcessToCompositeActionMapping_4002IncomingLinks(view);
		case SequenceToSequenceMappingEditPart.VISUAL_ID:
			return getSequenceToSequenceMapping_4016IncomingLinks(view);
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return getIfToIfThenElseMapping_4017IncomingLinks(view);
		case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
			return getWhileToRepeatWhileMapping_4018IncomingLinks(view);
		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
			return getRepeatUntilToRepeatUntilMapping_4019IncomingLinks(view);
		case FlowToSplitJoinMappingEditPart.VISUAL_ID:
			return getFlowToSplitJoinMapping_4020IncomingLinks(view);
		case ForToRepeatWhileMappingEditPart.VISUAL_ID:
			return getForToRepeatWhileMapping_4021IncomingLinks(view);
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return getScopeToCompositeActionMapping_4022IncomingLinks(view);
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return getElseIfToIfThenElseMapping_4023IncomingLinks(view);
		case ElseToElseMappingEditPart.VISUAL_ID:
			return getElseToElseMapping_4024IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2002OutgoingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2001OutgoingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2014OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004OutgoingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2005OutgoingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2006OutgoingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2007OutgoingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2008OutgoingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2009OutgoingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010OutgoingLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011OutgoingLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2012OutgoingLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2015OutgoingLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2016OutgoingLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3001OutgoingLinks(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_3002OutgoingLinks(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_3003OutgoingLinks(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_3004OutgoingLinks(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_3005OutgoingLinks(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_3006OutgoingLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_3007OutgoingLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3008OutgoingLinks(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3009OutgoingLinks(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3010OutgoingLinks(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3011OutgoingLinks(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3012OutgoingLinks(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3013OutgoingLinks(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3014OutgoingLinks(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_3015OutgoingLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3016OutgoingLinks(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3017OutgoingLinks(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3018OutgoingLinks(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3019OutgoingLinks(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3020OutgoingLinks(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3021OutgoingLinks(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3022OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3023OutgoingLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3024OutgoingLinks(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3025OutgoingLinks(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3026OutgoingLinks(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3027OutgoingLinks(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3028OutgoingLinks(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3029OutgoingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3030OutgoingLinks(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3031OutgoingLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3032OutgoingLinks(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_3033OutgoingLinks(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_3034OutgoingLinks(view);
		case PickEditPart.VISUAL_ID:
			return getPick_3035OutgoingLinks(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_3036OutgoingLinks(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3037OutgoingLinks(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3038OutgoingLinks(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3039OutgoingLinks(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3040OutgoingLinks(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3041OutgoingLinks(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3042OutgoingLinks(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3043OutgoingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3044OutgoingLinks(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3045OutgoingLinks(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3046OutgoingLinks(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3047OutgoingLinks(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3048OutgoingLinks(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_3049OutgoingLinks(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3050OutgoingLinks(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3051OutgoingLinks(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3052OutgoingLinks(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3053OutgoingLinks(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3054OutgoingLinks(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3055OutgoingLinks(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3056OutgoingLinks(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3057OutgoingLinks(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3058OutgoingLinks(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3059OutgoingLinks(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3060OutgoingLinks(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_3061OutgoingLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3062OutgoingLinks(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3063OutgoingLinks(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3064OutgoingLinks(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3065OutgoingLinks(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3066OutgoingLinks(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3067OutgoingLinks(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3068OutgoingLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3069OutgoingLinks(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3070OutgoingLinks(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3071OutgoingLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3072OutgoingLinks(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3073OutgoingLinks(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3074OutgoingLinks(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3075OutgoingLinks(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3076OutgoingLinks(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3077OutgoingLinks(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_3078OutgoingLinks(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_3079OutgoingLinks(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_3080OutgoingLinks(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3081OutgoingLinks(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3082OutgoingLinks(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3083OutgoingLinks(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3084OutgoingLinks(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3085OutgoingLinks(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3086OutgoingLinks(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3087OutgoingLinks(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3088OutgoingLinks(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3089OutgoingLinks(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3090OutgoingLinks(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3091OutgoingLinks(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3092OutgoingLinks(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3093OutgoingLinks(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3094OutgoingLinks(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3095OutgoingLinks(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3096OutgoingLinks(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3097OutgoingLinks(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3098OutgoingLinks(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_3099OutgoingLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3100OutgoingLinks(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_3101OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3102OutgoingLinks(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3103OutgoingLinks(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3104OutgoingLinks(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3105OutgoingLinks(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3106OutgoingLinks(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3107OutgoingLinks(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3108OutgoingLinks(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3109OutgoingLinks(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3110OutgoingLinks(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3111OutgoingLinks(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3112OutgoingLinks(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_3113OutgoingLinks(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3114OutgoingLinks(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3115OutgoingLinks(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3116OutgoingLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3117OutgoingLinks(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3118OutgoingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3119OutgoingLinks(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3120OutgoingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3121OutgoingLinks(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3122OutgoingLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3123OutgoingLinks(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3124OutgoingLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3125OutgoingLinks(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3126OutgoingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3127OutgoingLinks(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3128OutgoingLinks(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3129OutgoingLinks(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3130OutgoingLinks(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3131OutgoingLinks(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3132OutgoingLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3133OutgoingLinks(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3134OutgoingLinks(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3135OutgoingLinks(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3136OutgoingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3137OutgoingLinks(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3138OutgoingLinks(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3139OutgoingLinks(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3140OutgoingLinks(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3141OutgoingLinks(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3142OutgoingLinks(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3143OutgoingLinks(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3144OutgoingLinks(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3145OutgoingLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3146OutgoingLinks(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3147OutgoingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3148OutgoingLinks(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3149OutgoingLinks(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3150OutgoingLinks(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3151OutgoingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3152OutgoingLinks(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3153OutgoingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3154OutgoingLinks(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3155OutgoingLinks(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3156OutgoingLinks(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3157OutgoingLinks(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3158OutgoingLinks(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3159OutgoingLinks(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3160OutgoingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3161OutgoingLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3162OutgoingLinks(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3163OutgoingLinks(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3164OutgoingLinks(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3165OutgoingLinks(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3166OutgoingLinks(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3167OutgoingLinks(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3168OutgoingLinks(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3169OutgoingLinks(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3170OutgoingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3171OutgoingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3172OutgoingLinks(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3173OutgoingLinks(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3174OutgoingLinks(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3175OutgoingLinks(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3176OutgoingLinks(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3177OutgoingLinks(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3178OutgoingLinks(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3179OutgoingLinks(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3180OutgoingLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3181OutgoingLinks(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3182OutgoingLinks(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3183OutgoingLinks(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3184OutgoingLinks(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3185OutgoingLinks(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3186OutgoingLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3187OutgoingLinks(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3188OutgoingLinks(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3189OutgoingLinks(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3190OutgoingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3191OutgoingLinks(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3192OutgoingLinks(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3193OutgoingLinks(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3194OutgoingLinks(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3195OutgoingLinks(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3196OutgoingLinks(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3197OutgoingLinks(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3198OutgoingLinks(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3199OutgoingLinks(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3200OutgoingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3201OutgoingLinks(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3202OutgoingLinks(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3203OutgoingLinks(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3204OutgoingLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3205OutgoingLinks(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3206OutgoingLinks(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3207OutgoingLinks(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3208OutgoingLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3209OutgoingLinks(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3210OutgoingLinks(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3211OutgoingLinks(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3212OutgoingLinks(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3213OutgoingLinks(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3214OutgoingLinks(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3215OutgoingLinks(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3216OutgoingLinks(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3217OutgoingLinks(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3218OutgoingLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3219OutgoingLinks(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3220OutgoingLinks(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3221OutgoingLinks(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3222OutgoingLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3223OutgoingLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3224OutgoingLinks(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3225OutgoingLinks(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3226OutgoingLinks(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3227OutgoingLinks(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3228OutgoingLinks(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3229OutgoingLinks(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3230OutgoingLinks(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3231OutgoingLinks(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3232OutgoingLinks(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3233OutgoingLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3234OutgoingLinks(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3235OutgoingLinks(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3236OutgoingLinks(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3237OutgoingLinks(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3238OutgoingLinks(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_3239OutgoingLinks(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3240OutgoingLinks(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3241OutgoingLinks(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3242OutgoingLinks(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3243OutgoingLinks(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3244OutgoingLinks(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3245OutgoingLinks(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3246OutgoingLinks(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3247OutgoingLinks(view);
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
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3254OutgoingLinks(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255OutgoingLinks(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256OutgoingLinks(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257OutgoingLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3258OutgoingLinks(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259OutgoingLinks(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260OutgoingLinks(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261OutgoingLinks(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262OutgoingLinks(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3263OutgoingLinks(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3264OutgoingLinks(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3265OutgoingLinks(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3266OutgoingLinks(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3267OutgoingLinks(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3268OutgoingLinks(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3269OutgoingLinks(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3270OutgoingLinks(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3271OutgoingLinks(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3272OutgoingLinks(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3273OutgoingLinks(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3274OutgoingLinks(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3275OutgoingLinks(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3276OutgoingLinks(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3277OutgoingLinks(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3278OutgoingLinks(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3279OutgoingLinks(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3280OutgoingLinks(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3281OutgoingLinks(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3282OutgoingLinks(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3283OutgoingLinks(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3284OutgoingLinks(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3285OutgoingLinks(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3286OutgoingLinks(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3287OutgoingLinks(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3288OutgoingLinks(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3289OutgoingLinks(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3290OutgoingLinks(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3291OutgoingLinks(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3292OutgoingLinks(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3293OutgoingLinks(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3294OutgoingLinks(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3295OutgoingLinks(view);
		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
			return getPartnerActivityToAtomicActionMapping_4001OutgoingLinks(view);
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return getProcessToCompositeActionMapping_4002OutgoingLinks(view);
		case SequenceToSequenceMappingEditPart.VISUAL_ID:
			return getSequenceToSequenceMapping_4016OutgoingLinks(view);
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return getIfToIfThenElseMapping_4017OutgoingLinks(view);
		case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
			return getWhileToRepeatWhileMapping_4018OutgoingLinks(view);
		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
			return getRepeatUntilToRepeatUntilMapping_4019OutgoingLinks(view);
		case FlowToSplitJoinMappingEditPart.VISUAL_ID:
			return getFlowToSplitJoinMapping_4020OutgoingLinks(view);
		case ForToRepeatWhileMappingEditPart.VISUAL_ID:
			return getForToRepeatWhileMapping_4021OutgoingLinks(view);
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return getScopeToCompositeActionMapping_4022OutgoingLinks(view);
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return getElseIfToIfThenElseMapping_4023OutgoingLinks(view);
		case ElseToElseMappingEditPart.VISUAL_ID:
			return getElseToElseMapping_4024OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMappingContainer_1000ContainedLinks(View view) {
		MappingContainer modelElement = (MappingContainer) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ProcessToCompositeActionMapping_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ElseIfToIfThenElseMapping_4023(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ElseToElseMapping_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2014ContainedLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2004ContainedLinks(View view) {
		net.sf.ictalive.owls.process.Sequence modelElement = (net.sf.ictalive.owls.process.Sequence) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Sequence_Components_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2005ContainedLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2006ContainedLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4008(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2007ContainedLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_Process_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2008ContainedLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Choice_Components_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2009ContainedLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4009(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2010ContainedLinks(View view) {
		net.sf.ictalive.owls.process.RepeatUntil modelElement = (net.sf.ictalive.owls.process.RepeatUntil) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2011ContainedLinks(View view) {
		RepeatWhile modelElement = (RepeatWhile) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2012ContainedLinks(View view) {
		IfThenElse modelElement = (IfThenElse) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Then_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Else_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2015ContainedLinks(View view) {
		Split modelElement = (Split) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Split_Components_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2016ContainedLinks(View view) {
		SplitJoin modelElement = (SplitJoin) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SplitJoin_Components_4026(modelElement));
		return result;
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
	public static List getCompensate_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3031ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3036ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3037ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3039ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3041ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3042ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3043ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3044ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3045ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3046ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3047ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3048ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_3049ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3050ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3051ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3052ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3053ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3054ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3055ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3056ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3057ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3058ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3059ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3060ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3061ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3062ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3063ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3064ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3065ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3066ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3067ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3068ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
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
	public static List getForEach_3070ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3071ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3072ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3073ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3074ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3075ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3076ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3077ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3078ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3079ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3080ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3081ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3082ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3083ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3084ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3085ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3086ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3087ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3088ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3089ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3090ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3091ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3092ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3093ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3094ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3095ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3096ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3097ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3098ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3099ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3100ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3101ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3102ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3103ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3104ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3105ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3106ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3107ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3108ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3109ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3110ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3111ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3112ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3113ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3114ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3115ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3116ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3117ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3118ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3119ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3120ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3121ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3122ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3123ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3124ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3125ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3126ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3127ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3128ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3129ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3130ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3131ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3132ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3133ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3134ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3135ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3136ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3137ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3138ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3139ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3140ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3141ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3142ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3143ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3144ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3145ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3146ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3147ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3148ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3149ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3150ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3151ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3152ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3153ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3154ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3155ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3156ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3157ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3158ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3159ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3160ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3161ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_3162ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3163ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3164ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3165ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3166ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3167ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3168ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3169ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3170ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3171ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_3172ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3173ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3174ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3175ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3176ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3177ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3178ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3179ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3180ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3181ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3182ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3183ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3184ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3185ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3186ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3187ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3188ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3189ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3190ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3191ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3192ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3193ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3194ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3195ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3196ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3197ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3198ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3199ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3200ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3201ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3202ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3203ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3204ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3205ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3206ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3207ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3208ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3209ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3210ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3211ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3212ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3213ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3214ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3215ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3216ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3217ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3218ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3219ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3220ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3221ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3222ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3223ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3224ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3225ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3226ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3227ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3228ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3229ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3230ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3231ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3232ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3233ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3234ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3235ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3236ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3237ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3238ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_3239ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3240ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3241ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3242ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3243ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3244ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3245ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3246ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3247ContainedLinks(View view) {
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
		return Collections.EMPTY_LIST;
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
		return Collections.EMPTY_LIST;
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
		return Collections.EMPTY_LIST;
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
		return Collections.EMPTY_LIST;
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
	public static List getForEach_3263ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3264ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3265ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3266ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3267ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3268ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3269ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3270ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3271ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3272ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3273ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3274ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3275ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3276ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3277ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3278ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3279ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3280ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3281ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3282ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3283ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3284ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3285ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3286ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3287ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3288ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3289ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3290ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3291ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3292ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3293ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3294ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3295ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivityToAtomicActionMapping_4001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessToCompositeActionMapping_4002ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequenceToSequenceMapping_4016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfToIfThenElseMapping_4017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhileToRepeatWhileMapping_4018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilToRepeatUntilMapping_4019ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlowToSplitJoinMapping_4020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForToRepeatWhileMapping_4021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScopeToCompositeActionMapping_4022ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIfToIfThenElseMapping_4023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseToElseMapping_4024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2001IncomingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Perform_Process_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2014IncomingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_ProcessToCompositeActionMapping_4002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Perform_Process_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2004IncomingLinks(View view) {
		net.sf.ictalive.owls.process.Sequence modelElement = (net.sf.ictalive.owls.process.Sequence) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_SequenceToSequenceMapping_4016(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2005IncomingLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2006IncomingLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Choice_Components_4005(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AnyOrder_Components_4006(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_Rest_4008(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Split_Components_4025(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SplitJoin_Components_4026(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2007IncomingLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2008IncomingLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2009IncomingLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Sequence_Components_4007(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_Rest_4009(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2010IncomingLinks(View view) {
		net.sf.ictalive.owls.process.RepeatUntil modelElement = (net.sf.ictalive.owls.process.RepeatUntil) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2011IncomingLinks(View view) {
		RepeatWhile modelElement = (RepeatWhile) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2012IncomingLinks(View view) {
		IfThenElse modelElement = (IfThenElse) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_IfToIfThenElseMapping_4017(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_ElseIfToIfThenElseMapping_4023(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2015IncomingLinks(View view) {
		Split modelElement = (Split) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2016IncomingLinks(View view) {
		SplitJoin modelElement = (SplitJoin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
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
	public static List getCompensate_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3020IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3025IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3031IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3032IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3033IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3034IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3035IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3036IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3037IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3038IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3039IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3040IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3041IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3042IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3043IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3044IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3045IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3046IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3047IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3048IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_3049IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3050IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3051IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3052IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3053IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3054IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3055IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3056IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3057IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3058IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3059IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3060IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3061IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3062IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3063IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3064IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3065IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3066IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3067IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3068IncomingLinks(View view) {
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
	public static List getForEach_3070IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3071IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3072IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3073IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3074IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3075IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3076IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3077IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3078IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3079IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3080IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3081IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3082IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3083IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3084IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3085IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3086IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3087IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3088IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3089IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3090IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3091IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3092IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3093IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3094IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3095IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3096IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3097IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3098IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3099IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3100IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3101IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3102IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3103IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3104IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3105IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3106IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3107IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3108IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3109IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3110IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3111IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3112IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3113IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3114IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3115IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3116IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3117IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3118IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3119IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3120IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3121IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3122IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3123IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3124IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3125IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3126IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3127IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3128IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3129IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3130IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3131IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3132IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3133IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3134IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3135IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3136IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3137IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3138IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3139IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3140IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3141IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3142IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3143IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3144IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3145IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3146IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3147IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3148IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3149IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3150IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3151IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3152IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3153IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3154IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3155IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3156IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3157IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3158IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3159IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3160IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3161IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_3162IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3163IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3164IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3165IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3166IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3167IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3168IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3169IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3170IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3171IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElse_3172IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3173IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3174IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3175IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3176IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3177IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3178IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3179IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3180IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3181IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3182IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3183IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3184IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3185IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3186IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3187IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3188IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3189IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3190IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3191IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3192IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3193IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3194IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3195IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3196IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3197IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3198IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3199IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3200IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3201IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3202IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3203IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3204IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3205IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3206IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3207IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3208IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3209IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3210IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3211IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3212IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3213IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3214IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3215IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3216IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3217IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3218IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3219IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3220IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3221IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3222IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3223IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3224IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3225IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3226IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3227IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3228IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3229IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3230IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3231IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3232IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3233IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3234IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3235IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3236IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3237IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3238IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_3239IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3240IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3241IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3242IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3243IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3244IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3245IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3246IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3247IncomingLinks(View view) {
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
	public static List getForEach_3263IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3264IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3265IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3266IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3267IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3268IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3269IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3270IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3271IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3272IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3273IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3274IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3275IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3276IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3277IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3278IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3279IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3280IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3281IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3282IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3283IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPick_3284IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3285IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3286IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReply_3287IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3288IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3289IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3290IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3291IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3292IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3293IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3294IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3295IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivityToAtomicActionMapping_4001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessToCompositeActionMapping_4002IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequenceToSequenceMapping_4016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfToIfThenElseMapping_4017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhileToRepeatWhileMapping_4018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilToRepeatUntilMapping_4019IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlowToSplitJoinMapping_4020IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForToRepeatWhileMapping_4021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScopeToCompositeActionMapping_4022IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIfToIfThenElseMapping_4023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseToElseMapping_4024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2002OutgoingLinks(View view) {
		Process modelElement = (Process) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ProcessToCompositeActionMapping_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2014OutgoingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2004OutgoingLinks(View view) {
		net.sf.ictalive.owls.process.Sequence modelElement = (net.sf.ictalive.owls.process.Sequence) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Sequence_Components_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2005OutgoingLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2006OutgoingLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4008(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2007OutgoingLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_Process_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2008OutgoingLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Choice_Components_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2009OutgoingLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4009(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2010OutgoingLinks(View view) {
		net.sf.ictalive.owls.process.RepeatUntil modelElement = (net.sf.ictalive.owls.process.RepeatUntil) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2011OutgoingLinks(View view) {
		RepeatWhile modelElement = (RepeatWhile) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2012OutgoingLinks(View view) {
		IfThenElse modelElement = (IfThenElse) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Then_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Else_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2015OutgoingLinks(View view) {
		Split modelElement = (Split) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Split_Components_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2016OutgoingLinks(View view) {
		SplitJoin modelElement = (SplitJoin) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SplitJoin_Components_4026(modelElement));
		return result;
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
	public static List getCompensate_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3007OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3014OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3015OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3020OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3022OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3023OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3025OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIf_3030OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3031OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3032OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3033OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3034OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3035OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3036OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3037OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3038OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3039OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3040OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3041OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3042OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3043OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3044OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3045OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3046OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3047OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3048OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnMessage_3049OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3050OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3051OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3052OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3053OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3054OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3055OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3056OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3057OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3058OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3059OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3060OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3061OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3062OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3063OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3064OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3065OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3066OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3067OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3068OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3069OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3070OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3071OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3072OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3073OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3074OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3075OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3076OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3077OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3078OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3079OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3080OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3081OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3082OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3083OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3084OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3085OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3086OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3087OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3088OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3089OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3090OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3091OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3092OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3093OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3094OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3095OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3096OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3097OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3098OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3099OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3100OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3101OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3102OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3103OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3104OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3105OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3106OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3107OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3108OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3109OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3110OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3111OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3112OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3113OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOnAlarm_3114OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3115OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3116OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3117OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3118OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3119OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3120OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3121OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3122OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3123OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3124OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3125OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3126OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3127OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3128OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3129OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3130OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3131OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3132OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3133OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3134OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3135OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3136OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3137OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3138OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3139OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3140OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3141OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3142OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3143OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3144OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3145OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3146OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3147OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3148OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3149OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3150OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3151OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3152OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3153OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3154OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3155OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3156OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3157OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3158OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3159OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3160OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3161OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElseIf_3162OutgoingLinks(View view) {
		ElseIf modelElement = (ElseIf) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ElseIfToIfThenElseMapping_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3163OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3164OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3165OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3166OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3167OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3168OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3169OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3170OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3171OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElse_3172OutgoingLinks(View view) {
		Else modelElement = (Else) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ElseToElseMapping_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3173OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3174OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3175OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3176OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3177OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3178OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3179OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3180OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3181OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3182OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3183OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3184OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3185OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3186OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3187OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3188OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3189OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3190OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3191OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3192OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3193OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3194OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3195OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3196OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3197OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3198OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3199OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3200OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3201OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3202OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3203OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3204OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3205OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3206OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3207OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3208OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3209OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3210OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3211OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3212OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3213OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3214OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3215OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3216OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3217OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3218OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3219OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3220OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3221OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3222OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3223OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3224OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3225OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3226OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3227OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3228OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3229OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3230OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3231OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3232OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3233OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3234OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3235OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3236OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3237OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3238OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOnEvent_3239OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssign_3240OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensate_3241OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompensateScope_3242OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEmpty_3243OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExit_3244OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExtensionActivity_3245OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_3246OutgoingLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3247OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3248OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3249OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
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
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
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
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3254OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3255OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
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
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3258OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
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
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3263OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3264OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3265OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3266OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3267OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3268OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3269OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3270OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3271OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3272OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3273OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3274OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3275OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3276OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3277OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3278OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForEach_3279OutgoingLinks(View view) {
		ForEach modelElement = (ForEach) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIf_3280OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInvoke_3281OutgoingLinks(View view) {
		Invoke modelElement = (Invoke) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueActivity_3282OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivity_3283OutgoingLinks(View view) {
		PartnerActivity modelElement = (PartnerActivity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPick_3284OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getReceive_3285OutgoingLinks(View view) {
		Receive modelElement = (Receive) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3286OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReply_3287OutgoingLinks(View view) {
		Reply modelElement = (Reply) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRethrow_3288OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScope_3289OutgoingLinks(View view) {
		Scope modelElement = (Scope) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3290OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThrow_3291OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValidate_3292OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWait_3293OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhile_3294OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventHandler_3295OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPartnerActivityToAtomicActionMapping_4001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessToCompositeActionMapping_4002OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequenceToSequenceMapping_4016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfToIfThenElseMapping_4017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWhileToRepeatWhileMapping_4018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilToRepeatUntilMapping_4019OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlowToSplitJoinMapping_4020OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForToRepeatWhileMapping_4021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScopeToCompositeActionMapping_4022OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseIfToIfThenElseMapping_4023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElseToElseMapping_4024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PartnerActivityToAtomicActionMapping) {
				continue;
			}
			PartnerActivityToAtomicActionMapping link = (PartnerActivityToAtomicActionMapping) linkObject;
			if (PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AtomicAction dst = link.getTarget();
			PartnerActivity src = link.getSource();
			result
					.add(new MappingLinkDescriptor(
							src,
							dst,
							link,
							MappingElementTypes.PartnerActivityToAtomicActionMapping_4001,
							PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ProcessToCompositeActionMapping_4002(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ProcessToCompositeActionMapping) {
				continue;
			}
			ProcessToCompositeActionMapping link = (ProcessToCompositeActionMapping) linkObject;
			if (ProcessToCompositeActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CompositeAction dst = link.getTarget();
			Process src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ProcessToCompositeActionMapping_4002,
					ProcessToCompositeActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SequenceToSequenceMapping_4016(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SequenceToSequenceMapping) {
				continue;
			}
			SequenceToSequenceMapping link = (SequenceToSequenceMapping) linkObject;
			if (SequenceToSequenceMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			net.sf.ictalive.owls.process.Sequence dst = link.getTarget();
			Sequence src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.SequenceToSequenceMapping_4016,
					SequenceToSequenceMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_IfToIfThenElseMapping_4017(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IfToIfThenElseMapping) {
				continue;
			}
			IfToIfThenElseMapping link = (IfToIfThenElseMapping) linkObject;
			if (IfToIfThenElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IfThenElse dst = link.getTarget();
			If src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.IfToIfThenElseMapping_4017,
					IfToIfThenElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WhileToRepeatWhileMapping) {
				continue;
			}
			WhileToRepeatWhileMapping link = (WhileToRepeatWhileMapping) linkObject;
			if (WhileToRepeatWhileMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RepeatWhile dst = link.getTarget();
			While src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.WhileToRepeatWhileMapping_4018,
					WhileToRepeatWhileMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RepeatUntilToRepeatUntilMapping) {
				continue;
			}
			RepeatUntilToRepeatUntilMapping link = (RepeatUntilToRepeatUntilMapping) linkObject;
			if (RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			net.sf.ictalive.owls.process.RepeatUntil dst = link.getTarget();
			RepeatUntil src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019,
					RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_FlowToSplitJoinMapping_4020(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FlowToSplitJoinMapping) {
				continue;
			}
			FlowToSplitJoinMapping link = (FlowToSplitJoinMapping) linkObject;
			if (FlowToSplitJoinMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof SplitJoin) {
				continue;
			}
			SplitJoin dst = (SplitJoin) theTarget;
			Flow src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.FlowToSplitJoinMapping_4020,
					FlowToSplitJoinMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ForToRepeatWhileMapping_4021(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ForToRepeatWhileMapping) {
				continue;
			}
			ForToRepeatWhileMapping link = (ForToRepeatWhileMapping) linkObject;
			if (ForToRepeatWhileMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RepeatWhile dst = link.getTarget();
			ForEach src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ForToRepeatWhileMapping_4021,
					ForToRepeatWhileMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ScopeToCompositeActionMapping) {
				continue;
			}
			ScopeToCompositeActionMapping link = (ScopeToCompositeActionMapping) linkObject;
			if (ScopeToCompositeActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CompositeAction dst = link.getTarget();
			Scope src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ScopeToCompositeActionMapping_4022,
					ScopeToCompositeActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ElseIfToIfThenElseMapping_4023(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ElseIfToIfThenElseMapping) {
				continue;
			}
			ElseIfToIfThenElseMapping link = (ElseIfToIfThenElseMapping) linkObject;
			if (ElseIfToIfThenElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IfThenElse dst = link.getTarget();
			ElseIf src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ElseIfToIfThenElseMapping_4023,
					ElseIfToIfThenElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ElseToElseMapping_4024(
			MappingContainer container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ElseToElseMapping) {
				continue;
			}
			ElseToElseMapping link = (ElseToElseMapping) linkObject;
			if (ElseToElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControlConstruct dst = link.getTarget();
			Else src = link.getSource();
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ElseToElseMapping_4024,
					ElseToElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(
			AtomicAction target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getPartnerActivityToAtomicActionMapping_Target()
					|| false == setting.getEObject() instanceof PartnerActivityToAtomicActionMapping) {
				continue;
			}
			PartnerActivityToAtomicActionMapping link = (PartnerActivityToAtomicActionMapping) setting
					.getEObject();
			if (PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PartnerActivity src = link.getSource();
			result
					.add(new MappingLinkDescriptor(
							src,
							target,
							link,
							MappingElementTypes.PartnerActivityToAtomicActionMapping_4001,
							PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ProcessToCompositeActionMapping_4002(
			CompositeAction target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getProcessToCompositeActionMapping_Target()
					|| false == setting.getEObject() instanceof ProcessToCompositeActionMapping) {
				continue;
			}
			ProcessToCompositeActionMapping link = (ProcessToCompositeActionMapping) setting
					.getEObject();
			if (ProcessToCompositeActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Process src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.ProcessToCompositeActionMapping_4002,
					ProcessToCompositeActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SequenceToSequenceMapping_4016(
			net.sf.ictalive.owls.process.Sequence target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getSequenceToSequenceMapping_Target()
					|| false == setting.getEObject() instanceof SequenceToSequenceMapping) {
				continue;
			}
			SequenceToSequenceMapping link = (SequenceToSequenceMapping) setting
					.getEObject();
			if (SequenceToSequenceMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Sequence src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.SequenceToSequenceMapping_4016,
					SequenceToSequenceMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_IfToIfThenElseMapping_4017(
			IfThenElse target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getIfToIfThenElseMapping_Target()
					|| false == setting.getEObject() instanceof IfToIfThenElseMapping) {
				continue;
			}
			IfToIfThenElseMapping link = (IfToIfThenElseMapping) setting
					.getEObject();
			if (IfToIfThenElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			If src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.IfToIfThenElseMapping_4017,
					IfToIfThenElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(
			RepeatWhile target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getWhileToRepeatWhileMapping_Target()
					|| false == setting.getEObject() instanceof WhileToRepeatWhileMapping) {
				continue;
			}
			WhileToRepeatWhileMapping link = (WhileToRepeatWhileMapping) setting
					.getEObject();
			if (WhileToRepeatWhileMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			While src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.WhileToRepeatWhileMapping_4018,
					WhileToRepeatWhileMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(
			net.sf.ictalive.owls.process.RepeatUntil target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getRepeatUntilToRepeatUntilMapping_Target()
					|| false == setting.getEObject() instanceof RepeatUntilToRepeatUntilMapping) {
				continue;
			}
			RepeatUntilToRepeatUntilMapping link = (RepeatUntilToRepeatUntilMapping) setting
					.getEObject();
			if (RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RepeatUntil src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019,
					RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(
			SplitJoin target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getFlowToSplitJoinMapping_Target()
					|| false == setting.getEObject() instanceof FlowToSplitJoinMapping) {
				continue;
			}
			FlowToSplitJoinMapping link = (FlowToSplitJoinMapping) setting
					.getEObject();
			if (FlowToSplitJoinMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Flow src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.FlowToSplitJoinMapping_4020,
					FlowToSplitJoinMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(
			RepeatWhile target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getForToRepeatWhileMapping_Target()
					|| false == setting.getEObject() instanceof ForToRepeatWhileMapping) {
				continue;
			}
			ForToRepeatWhileMapping link = (ForToRepeatWhileMapping) setting
					.getEObject();
			if (ForToRepeatWhileMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ForEach src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.ForToRepeatWhileMapping_4021,
					ForToRepeatWhileMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(
			CompositeAction target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getScopeToCompositeActionMapping_Target()
					|| false == setting.getEObject() instanceof ScopeToCompositeActionMapping) {
				continue;
			}
			ScopeToCompositeActionMapping link = (ScopeToCompositeActionMapping) setting
					.getEObject();
			if (ScopeToCompositeActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Scope src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.ScopeToCompositeActionMapping_4022,
					ScopeToCompositeActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ElseIfToIfThenElseMapping_4023(
			IfThenElse target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getElseIfToIfThenElseMapping_Target()
					|| false == setting.getEObject() instanceof ElseIfToIfThenElseMapping) {
				continue;
			}
			ElseIfToIfThenElseMapping link = (ElseIfToIfThenElseMapping) setting
					.getEObject();
			if (ElseIfToIfThenElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElseIf src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.ElseIfToIfThenElseMapping_4023,
					ElseIfToIfThenElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ElseToElseMapping_4024(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MappingPackage.eINSTANCE
					.getElseToElseMapping_Target()
					|| false == setting.getEObject() instanceof ElseToElseMapping) {
				continue;
			}
			ElseToElseMapping link = (ElseToElseMapping) setting.getEObject();
			if (ElseToElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Else src = link.getSource();
			result.add(new MappingLinkDescriptor(src, target, link,
					MappingElementTypes.ElseToElseMapping_4024,
					ElseToElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getCompositeProcess_ComposedOf()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.CompositeProcessComposedOf_4003,
						CompositeProcessComposedOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Perform_Process_4004(
			net.sf.ictalive.owls.process.Process target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getPerform_Process()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.PerformProcess_4004,
						PerformProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Choice_Components_4005(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getChoice_Components()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.ChoiceComponents_4005,
						ChoiceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AnyOrder_Components_4006(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getAnyOrder_Components()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.AnyOrderComponents_4006,
						AnyOrderComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Sequence_Components_4007(
			ControlConstructList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getSequence_Components()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.SequenceComponents_4007,
						SequenceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructBag_Rest_4008(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructBag_Rest()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.ControlConstructBagRest_4008,
						ControlConstructBagRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructList_Rest_4009(
			ControlConstructList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructList_Rest()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.ControlConstructListRest_4009,
						ControlConstructListRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IfThenElse_Then_4010(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getIfThenElse_Then()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.IfThenElseThen_4010,
						IfThenElseThenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IfThenElse_Else_4011(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getIfThenElse_Else()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.IfThenElseElse_4011,
						IfThenElseElseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getRepeatUntil_UntilProcess()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.RepeatUntilUntilProcess_4012,
						RepeatUntilUntilProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getRepeatWhile_WhileProcess()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.RepeatWhileWhileProcess_4013,
						RepeatWhileWhileProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4014(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructBag_First()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.ControlConstructBagFirst_4014,
						ControlConstructBagFirstEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructList_First_4015(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructList_First()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target,
						MappingElementTypes.ControlConstructListFirst_4015,
						ControlConstructListFirstEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Split_Components_4025(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getSplit_Components()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.SplitComponents_4025,
						SplitComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_SplitJoin_Components_4026(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getSplitJoin_Components()) {
				result.add(new MappingLinkDescriptor(setting.getEObject(),
						target, MappingElementTypes.SplitJoinComponents_4026,
						SplitJoinComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_PartnerActivityToAtomicActionMapping_4001(
			PartnerActivity source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PartnerActivityToAtomicActionMapping) {
				continue;
			}
			PartnerActivityToAtomicActionMapping link = (PartnerActivityToAtomicActionMapping) linkObject;
			if (PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AtomicAction dst = link.getTarget();
			PartnerActivity src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new MappingLinkDescriptor(
							src,
							dst,
							link,
							MappingElementTypes.PartnerActivityToAtomicActionMapping_4001,
							PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ProcessToCompositeActionMapping_4002(
			Process source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ProcessToCompositeActionMapping) {
				continue;
			}
			ProcessToCompositeActionMapping link = (ProcessToCompositeActionMapping) linkObject;
			if (ProcessToCompositeActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CompositeAction dst = link.getTarget();
			Process src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ProcessToCompositeActionMapping_4002,
					ProcessToCompositeActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SequenceToSequenceMapping_4016(
			Sequence source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SequenceToSequenceMapping) {
				continue;
			}
			SequenceToSequenceMapping link = (SequenceToSequenceMapping) linkObject;
			if (SequenceToSequenceMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			net.sf.ictalive.owls.process.Sequence dst = link.getTarget();
			Sequence src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.SequenceToSequenceMapping_4016,
					SequenceToSequenceMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_IfToIfThenElseMapping_4017(
			If source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IfToIfThenElseMapping) {
				continue;
			}
			IfToIfThenElseMapping link = (IfToIfThenElseMapping) linkObject;
			if (IfToIfThenElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IfThenElse dst = link.getTarget();
			If src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.IfToIfThenElseMapping_4017,
					IfToIfThenElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_WhileToRepeatWhileMapping_4018(
			While source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WhileToRepeatWhileMapping) {
				continue;
			}
			WhileToRepeatWhileMapping link = (WhileToRepeatWhileMapping) linkObject;
			if (WhileToRepeatWhileMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RepeatWhile dst = link.getTarget();
			While src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.WhileToRepeatWhileMapping_4018,
					WhileToRepeatWhileMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_RepeatUntilToRepeatUntilMapping_4019(
			RepeatUntil source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RepeatUntilToRepeatUntilMapping) {
				continue;
			}
			RepeatUntilToRepeatUntilMapping link = (RepeatUntilToRepeatUntilMapping) linkObject;
			if (RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			net.sf.ictalive.owls.process.RepeatUntil dst = link.getTarget();
			RepeatUntil src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019,
					RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_FlowToSplitJoinMapping_4020(
			Flow source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FlowToSplitJoinMapping) {
				continue;
			}
			FlowToSplitJoinMapping link = (FlowToSplitJoinMapping) linkObject;
			if (FlowToSplitJoinMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof SplitJoin) {
				continue;
			}
			SplitJoin dst = (SplitJoin) theTarget;
			Flow src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.FlowToSplitJoinMapping_4020,
					FlowToSplitJoinMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ForToRepeatWhileMapping_4021(
			ForEach source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ForToRepeatWhileMapping) {
				continue;
			}
			ForToRepeatWhileMapping link = (ForToRepeatWhileMapping) linkObject;
			if (ForToRepeatWhileMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RepeatWhile dst = link.getTarget();
			ForEach src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ForToRepeatWhileMapping_4021,
					ForToRepeatWhileMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ScopeToCompositeActionMapping_4022(
			Scope source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ScopeToCompositeActionMapping) {
				continue;
			}
			ScopeToCompositeActionMapping link = (ScopeToCompositeActionMapping) linkObject;
			if (ScopeToCompositeActionMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CompositeAction dst = link.getTarget();
			Scope src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ScopeToCompositeActionMapping_4022,
					ScopeToCompositeActionMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ElseIfToIfThenElseMapping_4023(
			ElseIf source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ElseIfToIfThenElseMapping) {
				continue;
			}
			ElseIfToIfThenElseMapping link = (ElseIfToIfThenElseMapping) linkObject;
			if (ElseIfToIfThenElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IfThenElse dst = link.getTarget();
			ElseIf src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ElseIfToIfThenElseMapping_4023,
					ElseIfToIfThenElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ElseToElseMapping_4024(
			Else source) {
		MappingContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MappingContainer) {
				container = (MappingContainer) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ElseToElseMapping) {
				continue;
			}
			ElseToElseMapping link = (ElseToElseMapping) linkObject;
			if (ElseToElseMappingEditPart.VISUAL_ID != MappingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControlConstruct dst = link.getTarget();
			Else src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MappingLinkDescriptor(src, dst, link,
					MappingElementTypes.ElseToElseMapping_4024,
					ElseToElseMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4003(
			CompositeProcess source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getComposedOf();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.CompositeProcessComposedOf_4003,
				CompositeProcessComposedOfEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Perform_Process_4004(
			Perform source) {
		Collection result = new LinkedList();
		net.sf.ictalive.owls.process.Process destination = source.getProcess();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.PerformProcess_4004,
				PerformProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Choice_Components_4005(
			Choice source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.ChoiceComponents_4005,
				ChoiceComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4006(
			AnyOrder source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.AnyOrderComponents_4006,
				AnyOrderComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Sequence_Components_4007(
			net.sf.ictalive.owls.process.Sequence source) {
		Collection result = new LinkedList();
		ControlConstructList destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.SequenceComponents_4007,
				SequenceComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4008(
			ControlConstructBag source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.ControlConstructBagRest_4008,
				ControlConstructBagRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4009(
			ControlConstructList source) {
		Collection result = new LinkedList();
		ControlConstructList destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.ControlConstructListRest_4009,
				ControlConstructListRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IfThenElse_Then_4010(
			IfThenElse source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getThen();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.IfThenElseThen_4010,
				IfThenElseThenEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IfThenElse_Else_4011(
			IfThenElse source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getElse();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.IfThenElseElse_4011,
				IfThenElseElseEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4012(
			net.sf.ictalive.owls.process.RepeatUntil source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getUntilProcess();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.RepeatUntilUntilProcess_4012,
				RepeatUntilUntilProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4013(
			RepeatWhile source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getWhileProcess();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.RepeatWhileWhileProcess_4013,
				RepeatWhileWhileProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4014(
			ControlConstructBag source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getFirst();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.ControlConstructBagFirst_4014,
				ControlConstructBagFirstEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4015(
			ControlConstructList source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getFirst();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.ControlConstructListFirst_4015,
				ControlConstructListFirstEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Split_Components_4025(
			Split source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.SplitComponents_4025,
				SplitComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SplitJoin_Components_4026(
			SplitJoin source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new MappingLinkDescriptor(source, destination,
				MappingElementTypes.SplitJoinComponents_4026,
				SplitJoinComponentsEditPart.VISUAL_ID));
		return result;
	}

}
