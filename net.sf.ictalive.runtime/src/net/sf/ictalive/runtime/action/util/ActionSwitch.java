/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.util;

import java.util.List;

import net.sf.ictalive.runtime.action.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ActionPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.COMMUNICATIVE_ACTION: {
				CommunicativeAction communicativeAction = (CommunicativeAction)theEObject;
				T result = caseCommunicativeAction(communicativeAction);
				if (result == null) result = caseAction(communicativeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.COORDINATION_ACTION: {
				CoordinationAction coordinationAction = (CoordinationAction)theEObject;
				T result = caseCoordinationAction(coordinationAction);
				if (result == null) result = caseAction(coordinationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.PLAN_SYNTHESIS: {
				PlanSynthesis planSynthesis = (PlanSynthesis)theEObject;
				T result = casePlanSynthesis(planSynthesis);
				if (result == null) result = casePlanningActions(planSynthesis);
				if (result == null) result = caseAction(planSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.PLAN_DISTRIBUTION: {
				PlanDistribution planDistribution = (PlanDistribution)theEObject;
				T result = casePlanDistribution(planDistribution);
				if (result == null) result = casePlanningActions(planDistribution);
				if (result == null) result = caseAction(planDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.PLAN_SCHEDULE: {
				PlanSchedule planSchedule = (PlanSchedule)theEObject;
				T result = casePlanSchedule(planSchedule);
				if (result == null) result = casePlanningActions(planSchedule);
				if (result == null) result = caseAction(planSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.PLAN_EXECUTION: {
				PlanExecution planExecution = (PlanExecution)theEObject;
				T result = casePlanExecution(planExecution);
				if (result == null) result = casePlanningActions(planExecution);
				if (result == null) result = caseAction(planExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case ActionPackage.SERVICE_INVOCATION: {
				ServiceInvocation serviceInvocation = (ServiceInvocation)theEObject;
				T result = caseServiceInvocation(serviceInvocation);
				if (result == null) result = caseAction(serviceInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.MATCHMAKER_RESPONSE: {
				MatchmakerResponse matchmakerResponse = (MatchmakerResponse)theEObject;
				T result = caseMatchmakerResponse(matchmakerResponse);
				if (result == null) result = caseAction(matchmakerResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.PLANNING_ACTIONS: {
				PlanningActions planningActions = (PlanningActions)theEObject;
				T result = casePlanningActions(planningActions);
				if (result == null) result = caseAction(planningActions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.AGENT_ACTION: {
				AgentAction agentAction = (AgentAction)theEObject;
				T result = caseAgentAction(agentAction);
				if (result == null) result = caseAction(agentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.REPLACE_AGENT: {
				ReplaceAgent replaceAgent = (ReplaceAgent)theEObject;
				T result = caseReplaceAgent(replaceAgent);
				if (result == null) result = caseAgentAction(replaceAgent);
				if (result == null) result = caseAction(replaceAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.AGENT_REPLAN: {
				AgentReplan agentReplan = (AgentReplan)theEObject;
				T result = caseAgentReplan(agentReplan);
				if (result == null) result = caseAgentAction(agentReplan);
				if (result == null) result = caseAction(agentReplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.NOTIFY_STATE_OF_WORLD: {
				NotifyStateOfWorld notifyStateOfWorld = (NotifyStateOfWorld)theEObject;
				T result = caseNotifyStateOfWorld(notifyStateOfWorld);
				if (result == null) result = caseAgentAction(notifyStateOfWorld);
				if (result == null) result = caseAction(notifyStateOfWorld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.STATE_OF_WORLD: {
				StateOfWorld stateOfWorld = (StateOfWorld)theEObject;
				T result = caseStateOfWorld(stateOfWorld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.MATCHMAKER_QUERY: {
				MatchmakerQuery matchmakerQuery = (MatchmakerQuery)theEObject;
				T result = caseMatchmakerQuery(matchmakerQuery);
				if (result == null) result = caseAction(matchmakerQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.MATCHMAKER_RESULT: {
				MatchmakerResult matchmakerResult = (MatchmakerResult)theEObject;
				T result = caseMatchmakerResult(matchmakerResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicative Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicative Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicativeAction(CommunicativeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationAction(CoordinationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanSynthesis(PlanSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDistribution(PlanDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanSchedule(PlanSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanExecution(PlanExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInvocation(ServiceInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matchmaker Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matchmaker Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchmakerResponse(MatchmakerResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planning Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planning Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanningActions(PlanningActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentAction(AgentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceAgent(ReplaceAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Replan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Replan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentReplan(AgentReplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notify State Of World</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notify State Of World</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotifyStateOfWorld(NotifyStateOfWorld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Of World</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Of World</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateOfWorld(StateOfWorld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matchmaker Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matchmaker Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchmakerQuery(MatchmakerQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matchmaker Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matchmaker Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchmakerResult(MatchmakerResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ActionSwitch
