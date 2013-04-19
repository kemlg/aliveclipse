/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.util;

import java.util.List;

import net.sf.ictalive.runtime.fact.*;

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
 * @see net.sf.ictalive.runtime.fact.FactPackage
 * @generated
 */
public class FactSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactSwitch() {
		if (modelPackage == null) {
			modelPackage = FactPackage.eINSTANCE;
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
			case FactPackage.FACT: {
				Fact fact = (Fact)theEObject;
				T result = caseFact(fact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.STARTED_ACT: {
				StartedAct startedAct = (StartedAct)theEObject;
				T result = caseStartedAct(startedAct);
				if (result == null) result = caseInvocativeAct(startedAct);
				if (result == null) result = caseFact(startedAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.EXECUTED_ACT: {
				ExecutedAct executedAct = (ExecutedAct)theEObject;
				T result = caseExecutedAct(executedAct);
				if (result == null) result = caseInvocativeAct(executedAct);
				if (result == null) result = caseFact(executedAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.FAILURE_ACT: {
				FailureAct failureAct = (FailureAct)theEObject;
				T result = caseFailureAct(failureAct);
				if (result == null) result = caseInvocativeAct(failureAct);
				if (result == null) result = caseFact(failureAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.DISASTER: {
				Disaster disaster = (Disaster)theEObject;
				T result = caseDisaster(disaster);
				if (result == null) result = caseFact(disaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_ACT: {
				NormAct normAct = (NormAct)theEObject;
				T result = caseNormAct(normAct);
				if (result == null) result = caseFact(normAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.COMMUNICATIVE_ACT: {
				CommunicativeAct communicativeAct = (CommunicativeAct)theEObject;
				T result = caseCommunicativeAct(communicativeAct);
				if (result == null) result = caseFact(communicativeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.RECEIVE_ACT: {
				ReceiveAct receiveAct = (ReceiveAct)theEObject;
				T result = caseReceiveAct(receiveAct);
				if (result == null) result = caseCommunicativeAct(receiveAct);
				if (result == null) result = caseFact(receiveAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.SEND_ACT: {
				SendAct sendAct = (SendAct)theEObject;
				T result = caseSendAct(sendAct);
				if (result == null) result = caseCommunicativeAct(sendAct);
				if (result == null) result = caseFact(sendAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.INVOCATIVE_ACT: {
				InvocativeAct invocativeAct = (InvocativeAct)theEObject;
				T result = caseInvocativeAct(invocativeAct);
				if (result == null) result = caseFact(invocativeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.DEADLINE_VIOLATION: {
				DeadlineViolation deadlineViolation = (DeadlineViolation)theEObject;
				T result = caseDeadlineViolation(deadlineViolation);
				if (result == null) result = caseNormAct(deadlineViolation);
				if (result == null) result = caseFact(deadlineViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.TASK_VIOLATION: {
				TaskViolation taskViolation = (TaskViolation)theEObject;
				T result = caseTaskViolation(taskViolation);
				if (result == null) result = caseNormAct(taskViolation);
				if (result == null) result = caseFact(taskViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.AVAILABILITY: {
				Availability availability = (Availability)theEObject;
				T result = caseAvailability(availability);
				if (result == null) result = caseFact(availability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.FULFILMENT_ACT: {
				FulfilmentAct fulfilmentAct = (FulfilmentAct)theEObject;
				T result = caseFulfilmentAct(fulfilmentAct);
				if (result == null) result = caseFact(fulfilmentAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.LANDMARK_FULFILMENT: {
				LandmarkFulfilment landmarkFulfilment = (LandmarkFulfilment)theEObject;
				T result = caseLandmarkFulfilment(landmarkFulfilment);
				if (result == null) result = caseFulfilmentAct(landmarkFulfilment);
				if (result == null) result = caseFact(landmarkFulfilment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_CONDITION_FULFILMENT: {
				NormConditionFulfilment normConditionFulfilment = (NormConditionFulfilment)theEObject;
				T result = caseNormConditionFulfilment(normConditionFulfilment);
				if (result == null) result = caseFulfilmentAct(normConditionFulfilment);
				if (result == null) result = caseFact(normConditionFulfilment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.OBJECTIVE_FULFILMENT: {
				ObjectiveFulfilment objectiveFulfilment = (ObjectiveFulfilment)theEObject;
				T result = caseObjectiveFulfilment(objectiveFulfilment);
				if (result == null) result = caseFulfilmentAct(objectiveFulfilment);
				if (result == null) result = caseFact(objectiveFulfilment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.ORGANISATION_ACT: {
				OrganisationAct organisationAct = (OrganisationAct)theEObject;
				T result = caseOrganisationAct(organisationAct);
				if (result == null) result = caseFact(organisationAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.PLAYER_FULFILMENT: {
				PlayerFulfilment playerFulfilment = (PlayerFulfilment)theEObject;
				T result = casePlayerFulfilment(playerFulfilment);
				if (result == null) result = caseOrganisationAct(playerFulfilment);
				if (result == null) result = caseFact(playerFulfilment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_INSTANCE_ACT: {
				NormInstanceAct normInstanceAct = (NormInstanceAct)theEObject;
				T result = caseNormInstanceAct(normInstanceAct);
				if (result == null) result = caseFact(normInstanceAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_INSTANCE_VIOLATED: {
				NormInstanceViolated normInstanceViolated = (NormInstanceViolated)theEObject;
				T result = caseNormInstanceViolated(normInstanceViolated);
				if (result == null) result = caseNormInstanceAct(normInstanceViolated);
				if (result == null) result = caseFact(normInstanceViolated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_INSTANCE_ACTIVATED: {
				NormInstanceActivated normInstanceActivated = (NormInstanceActivated)theEObject;
				T result = caseNormInstanceActivated(normInstanceActivated);
				if (result == null) result = caseNormInstanceAct(normInstanceActivated);
				if (result == null) result = caseFact(normInstanceActivated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_INSTANCE_EXPIRED: {
				NormInstanceExpired normInstanceExpired = (NormInstanceExpired)theEObject;
				T result = caseNormInstanceExpired(normInstanceExpired);
				if (result == null) result = caseNormInstanceAct(normInstanceExpired);
				if (result == null) result = caseFact(normInstanceExpired);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFact(Fact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Started Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Started Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartedAct(StartedAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executed Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executed Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutedAct(ExecutedAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureAct(FailureAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disaster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disaster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisaster(Disaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormAct(NormAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicative Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicative Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicativeAct(CommunicativeAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveAct(ReceiveAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendAct(SendAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocative Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocative Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocativeAct(InvocativeAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Violation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Violation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineViolation(DeadlineViolation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Violation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Violation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskViolation(TaskViolation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailability(Availability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfilment Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfilment Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfilmentAct(FulfilmentAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landmark Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landmark Fulfilment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandmarkFulfilment(LandmarkFulfilment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Condition Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Condition Fulfilment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormConditionFulfilment(NormConditionFulfilment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Fulfilment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveFulfilment(ObjectiveFulfilment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationAct(OrganisationAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Fulfilment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerFulfilment(PlayerFulfilment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Instance Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Instance Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormInstanceAct(NormInstanceAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Instance Violated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Instance Violated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormInstanceViolated(NormInstanceViolated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Instance Activated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Instance Activated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormInstanceActivated(NormInstanceActivated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Instance Expired</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Instance Expired</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormInstanceExpired(NormInstanceExpired object) {
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

} //FactSwitch
