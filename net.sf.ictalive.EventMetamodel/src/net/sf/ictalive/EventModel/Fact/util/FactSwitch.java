/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.util;

import java.util.List;

import net.sf.ictalive.EventModel.Fact.*;

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
 * @see net.sf.ictalive.EventModel.Fact.FactPackage
 * @generated
 */
public class FactSwitch<T>
{
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
	public FactSwitch()
	{
		if (modelPackage == null)
		{
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
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
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
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case FactPackage.FACT:
			{
				Fact fact = (Fact)theEObject;
				T result = caseFact(fact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.STARTED_ACT:
			{
				StartedAct startedAct = (StartedAct)theEObject;
				T result = caseStartedAct(startedAct);
				if (result == null) result = caseInvocativeAct(startedAct);
				if (result == null) result = caseFact(startedAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.EXECUTED_ACT:
			{
				ExecutedAct executedAct = (ExecutedAct)theEObject;
				T result = caseExecutedAct(executedAct);
				if (result == null) result = caseInvocativeAct(executedAct);
				if (result == null) result = caseFact(executedAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.FAILURE_ACT:
			{
				FailureAct failureAct = (FailureAct)theEObject;
				T result = caseFailureAct(failureAct);
				if (result == null) result = caseInvocativeAct(failureAct);
				if (result == null) result = caseFact(failureAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.DISASTER:
			{
				Disaster disaster = (Disaster)theEObject;
				T result = caseDisaster(disaster);
				if (result == null) result = caseFact(disaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.NORM_VIOLATED:
			{
				NormViolated normViolated = (NormViolated)theEObject;
				T result = caseNormViolated(normViolated);
				if (result == null) result = caseFact(normViolated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.COMMUNICATIVE_ACT:
			{
				CommunicativeAct communicativeAct = (CommunicativeAct)theEObject;
				T result = caseCommunicativeAct(communicativeAct);
				if (result == null) result = caseFact(communicativeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.RECEIVE_ACT:
			{
				ReceiveAct receiveAct = (ReceiveAct)theEObject;
				T result = caseReceiveAct(receiveAct);
				if (result == null) result = caseCommunicativeAct(receiveAct);
				if (result == null) result = caseFact(receiveAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.SEND_ACT:
			{
				SendAct sendAct = (SendAct)theEObject;
				T result = caseSendAct(sendAct);
				if (result == null) result = caseCommunicativeAct(sendAct);
				if (result == null) result = caseFact(sendAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.INVOCATIVE_ACT:
			{
				InvocativeAct invocativeAct = (InvocativeAct)theEObject;
				T result = caseInvocativeAct(invocativeAct);
				if (result == null) result = caseFact(invocativeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.MESSAGE:
			{
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.CONTENT:
			{
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.DEADLINE_VIOLATION:
			{
				DeadlineViolation deadlineViolation = (DeadlineViolation)theEObject;
				T result = caseDeadlineViolation(deadlineViolation);
				if (result == null) result = caseNormViolated(deadlineViolation);
				if (result == null) result = caseFact(deadlineViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.TASK_VIOLATION:
			{
				TaskViolation taskViolation = (TaskViolation)theEObject;
				T result = caseTaskViolation(taskViolation);
				if (result == null) result = caseNormViolated(taskViolation);
				if (result == null) result = caseFact(taskViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.SESSION_TIMEOUT:
			{
				SessionTimeout sessionTimeout = (SessionTimeout)theEObject;
				T result = caseSessionTimeout(sessionTimeout);
				if (result == null) result = caseNormViolated(sessionTimeout);
				if (result == null) result = caseFact(sessionTimeout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactPackage.AVAILABILITY:
			{
				Availability availability = (Availability)theEObject;
				T result = caseAvailability(availability);
				if (result == null) result = caseFact(availability);
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
	public T caseFact(Fact object)
	{
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
	public T caseStartedAct(StartedAct object)
	{
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
	public T caseExecutedAct(ExecutedAct object)
	{
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
	public T caseFailureAct(FailureAct object)
	{
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
	public T caseDisaster(Disaster object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm Violated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm Violated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormViolated(NormViolated object)
	{
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
	public T caseCommunicativeAct(CommunicativeAct object)
	{
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
	public T caseReceiveAct(ReceiveAct object)
	{
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
	public T caseSendAct(SendAct object)
	{
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
	public T caseInvocativeAct(InvocativeAct object)
	{
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
	public T caseMessage(Message object)
	{
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
	public T caseContent(Content object)
	{
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
	public T caseDeadlineViolation(DeadlineViolation object)
	{
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
	public T caseTaskViolation(TaskViolation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionTimeout(SessionTimeout object)
	{
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
	public T caseAvailability(Availability object)
	{
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
	public T defaultCase(EObject object)
	{
		return null;
	}

} //FactSwitch
