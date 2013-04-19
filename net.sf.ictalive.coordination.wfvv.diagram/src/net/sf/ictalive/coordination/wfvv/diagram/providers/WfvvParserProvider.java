package net.sf.ictalive.coordination.wfvv.diagram.providers;

import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentExpireTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentFinishTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentSessionIdEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentStartTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityStatusEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DeadlineViolationDealineEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentExpireTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentFinishTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentSessionIdEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentStartTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupName2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventTimestamp2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventTimestamp3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventTimestampEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ObjectiveNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentExpireTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentFinishTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentSessionIdEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentStartTimeEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WfvvParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eventTimestamp_5029Parser;

	/**
	 * @generated
	 */
	private IParser getEventTimestamp_5029Parser() {
		if (eventTimestamp_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { EventPackage.eINSTANCE
					.getEvent_Timestamp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Timestamp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Timestamp: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Timestamp: {0}"); //$NON-NLS-1$
			eventTimestamp_5029Parser = parser;
		}
		return eventTimestamp_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventTimestamp_5030Parser;

	/**
	 * @generated
	 */
	private IParser getEventTimestamp_5030Parser() {
		if (eventTimestamp_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { EventPackage.eINSTANCE
					.getEvent_Timestamp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Timestamp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Timestamp: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Timestamp: {0}"); //$NON-NLS-1$
			eventTimestamp_5030Parser = parser;
		}
		return eventTimestamp_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionEnactmentSessionId_5021Parser;

	/**
	 * @generated
	 */
	private IParser getActionEnactmentSessionId_5021Parser() {
		if (actionEnactmentSessionId_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_SessionId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Session ID: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Session ID: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Session ID: {0}"); //$NON-NLS-1$
			actionEnactmentSessionId_5021Parser = parser;
		}
		return actionEnactmentSessionId_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionEnactmentStartTime_5022Parser;

	/**
	 * @generated
	 */
	private IParser getActionEnactmentStartTime_5022Parser() {
		if (actionEnactmentStartTime_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_StartTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Start time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Start time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Start time: {0}"); //$NON-NLS-1$
			actionEnactmentStartTime_5022Parser = parser;
		}
		return actionEnactmentStartTime_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionEnactmentFinishTime_5023Parser;

	/**
	 * @generated
	 */
	private IParser getActionEnactmentFinishTime_5023Parser() {
		if (actionEnactmentFinishTime_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_FinishTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Finish time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Finish time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Finish time: {0}"); //$NON-NLS-1$
			actionEnactmentFinishTime_5023Parser = parser;
		}
		return actionEnactmentFinishTime_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionEnactmentExpireTime_5024Parser;

	/**
	 * @generated
	 */
	private IParser getActionEnactmentExpireTime_5024Parser() {
		if (actionEnactmentExpireTime_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_ExpireTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Expire time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Expire time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Expire time: {0}"); //$NON-NLS-1$
			actionEnactmentExpireTime_5024Parser = parser;
		}
		return actionEnactmentExpireTime_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser planEnactmentSessionId_5025Parser;

	/**
	 * @generated
	 */
	private IParser getPlanEnactmentSessionId_5025Parser() {
		if (planEnactmentSessionId_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_SessionId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Session ID: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Session ID: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Session ID: {0}"); //$NON-NLS-1$
			planEnactmentSessionId_5025Parser = parser;
		}
		return planEnactmentSessionId_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser planEnactmentStartTime_5026Parser;

	/**
	 * @generated
	 */
	private IParser getPlanEnactmentStartTime_5026Parser() {
		if (planEnactmentStartTime_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_StartTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Start time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Start time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Start time: {0}"); //$NON-NLS-1$
			planEnactmentStartTime_5026Parser = parser;
		}
		return planEnactmentStartTime_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser planEnactmentFinishTime_5027Parser;

	/**
	 * @generated
	 */
	private IParser getPlanEnactmentFinishTime_5027Parser() {
		if (planEnactmentFinishTime_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_FinishTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Finish time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Finish time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Finish time: {0}"); //$NON-NLS-1$
			planEnactmentFinishTime_5027Parser = parser;
		}
		return planEnactmentFinishTime_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser planEnactmentExpireTime_5028Parser;

	/**
	 * @generated
	 */
	private IParser getPlanEnactmentExpireTime_5028Parser() {
		if (planEnactmentExpireTime_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_ExpireTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Expire time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Expire time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Expire time: {0}"); //$NON-NLS-1$
			planEnactmentExpireTime_5028Parser = parser;
		}
		return planEnactmentExpireTime_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser enactmentSessionId_5031Parser;

	/**
	 * @generated
	 */
	private IParser getEnactmentSessionId_5031Parser() {
		if (enactmentSessionId_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_SessionId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Session ID: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Session ID: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Session ID: {0}"); //$NON-NLS-1$
			enactmentSessionId_5031Parser = parser;
		}
		return enactmentSessionId_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser enactmentStartTime_5032Parser;

	/**
	 * @generated
	 */
	private IParser getEnactmentStartTime_5032Parser() {
		if (enactmentStartTime_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_StartTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Start time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Start time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Start time: {0}"); //$NON-NLS-1$
			enactmentStartTime_5032Parser = parser;
		}
		return enactmentStartTime_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser enactmentFinishTime_5033Parser;

	/**
	 * @generated
	 */
	private IParser getEnactmentFinishTime_5033Parser() {
		if (enactmentFinishTime_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_FinishTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Finish time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Finish time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Finish time: {0}"); //$NON-NLS-1$
			enactmentFinishTime_5033Parser = parser;
		}
		return enactmentFinishTime_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser enactmentExpireTime_5034Parser;

	/**
	 * @generated
	 */
	private IParser getEnactmentExpireTime_5034Parser() {
		if (enactmentExpireTime_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { EnactmentPackage.eINSTANCE
					.getEnactment_ExpireTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Expire time: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Expire time: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Expire time: {0}"); //$NON-NLS-1$
			enactmentExpireTime_5034Parser = parser;
		}
		return enactmentExpireTime_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser agentName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_5018Parser() {
		if (agentName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { AgentsPackage.eINSTANCE
					.getAgent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agentName_5018Parser = parser;
		}
		return agentName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser actorName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_5035Parser() {
		if (actorName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { EventPackage.eINSTANCE
					.getActor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5035Parser = parser;
		}
		return actorName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectiveName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getObjectiveName_5019Parser() {
		if (objectiveName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getObjective_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("name {0}"); //$NON-NLS-1$
			parser.setEditorPattern("name {0}"); //$NON-NLS-1$
			parser.setEditPattern("name {0}"); //$NON-NLS-1$
			objectiveName_5019Parser = parser;
		}
		return objectiveName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionName_5020Parser() {
		if (atomicActionName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Atomic Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Atomic Action {0}"); //$NON-NLS-1$
			parser.setEditPattern("Atomic Action {0}"); //$NON-NLS-1$
			atomicActionName_5020Parser = parser;
		}
		return atomicActionName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventGroupName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getEventGroupName_5036Parser() {
		if (eventGroupName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { WfvvPackage.eINSTANCE
					.getEventGroup_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Event Group {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			eventGroupName_5036Parser = parser;
		}
		return eventGroupName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventGroupName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getEventGroupName_5037Parser() {
		if (eventGroupName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { WfvvPackage.eINSTANCE
					.getEventGroup_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Event Group {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			eventGroupName_5037Parser = parser;
		}
		return eventGroupName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser deadlineViolationDealine_5001Parser;

	/**
	 * @generated
	 */
	private IParser getDeadlineViolationDealine_5001Parser() {
		if (deadlineViolationDealine_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FactPackage.eINSTANCE
					.getDeadlineViolation_Dealine() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deadlineViolationDealine_5001Parser = parser;
		}
		return deadlineViolationDealine_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser availabilityStatus_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAvailabilityStatus_5002Parser() {
		if (availabilityStatus_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FactPackage.eINSTANCE
					.getAvailability_Status() };
			MessageFormatParser parser = new MessageFormatParser(features);
			availabilityStatus_5002Parser = parser;
		}
		return availabilityStatus_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventTimestamp_5038Parser;

	/**
	 * @generated
	 */
	private IParser getEventTimestamp_5038Parser() {
		if (eventTimestamp_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { EventPackage.eINSTANCE
					.getEvent_Timestamp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Timestamp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Timestamp: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Timestamp: {0}"); //$NON-NLS-1$
			eventTimestamp_5038Parser = parser;
		}
		return eventTimestamp_5038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EventTimestampEditPart.VISUAL_ID:
			return getEventTimestamp_5029Parser();
		case EventTimestamp2EditPart.VISUAL_ID:
			return getEventTimestamp_5030Parser();
		case ActionEnactmentSessionIdEditPart.VISUAL_ID:
			return getActionEnactmentSessionId_5021Parser();
		case ActionEnactmentStartTimeEditPart.VISUAL_ID:
			return getActionEnactmentStartTime_5022Parser();
		case ActionEnactmentFinishTimeEditPart.VISUAL_ID:
			return getActionEnactmentFinishTime_5023Parser();
		case ActionEnactmentExpireTimeEditPart.VISUAL_ID:
			return getActionEnactmentExpireTime_5024Parser();
		case PlanEnactmentSessionIdEditPart.VISUAL_ID:
			return getPlanEnactmentSessionId_5025Parser();
		case PlanEnactmentStartTimeEditPart.VISUAL_ID:
			return getPlanEnactmentStartTime_5026Parser();
		case PlanEnactmentFinishTimeEditPart.VISUAL_ID:
			return getPlanEnactmentFinishTime_5027Parser();
		case PlanEnactmentExpireTimeEditPart.VISUAL_ID:
			return getPlanEnactmentExpireTime_5028Parser();
		case EnactmentSessionIdEditPart.VISUAL_ID:
			return getEnactmentSessionId_5031Parser();
		case EnactmentStartTimeEditPart.VISUAL_ID:
			return getEnactmentStartTime_5032Parser();
		case EnactmentFinishTimeEditPart.VISUAL_ID:
			return getEnactmentFinishTime_5033Parser();
		case EnactmentExpireTimeEditPart.VISUAL_ID:
			return getEnactmentExpireTime_5034Parser();
		case AgentNameEditPart.VISUAL_ID:
			return getAgentName_5018Parser();
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5035Parser();
		case ObjectiveNameEditPart.VISUAL_ID:
			return getObjectiveName_5019Parser();
		case AtomicActionNameEditPart.VISUAL_ID:
			return getAtomicActionName_5020Parser();
		case EventGroupNameEditPart.VISUAL_ID:
			return getEventGroupName_5036Parser();
		case EventGroupName2EditPart.VISUAL_ID:
			return getEventGroupName_5037Parser();
		case DeadlineViolationDealineEditPart.VISUAL_ID:
			return getDeadlineViolationDealine_5001Parser();
		case AvailabilityStatusEditPart.VISUAL_ID:
			return getAvailabilityStatus_5002Parser();
		case EventTimestamp3EditPart.VISUAL_ID:
			return getEventTimestamp_5038Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WfvvVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WfvvVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WfvvElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
