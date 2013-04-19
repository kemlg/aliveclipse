/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.EventModel.Fact.FactPackage
 * @generated
 */
public interface FactFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactFactory eINSTANCE = net.sf.ictalive.EventModel.Fact.impl.FactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Started Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Started Act</em>'.
	 * @generated
	 */
	StartedAct createStartedAct();

	/**
	 * Returns a new object of class '<em>Executed Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executed Act</em>'.
	 * @generated
	 */
	ExecutedAct createExecutedAct();

	/**
	 * Returns a new object of class '<em>Failure Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Act</em>'.
	 * @generated
	 */
	FailureAct createFailureAct();

	/**
	 * Returns a new object of class '<em>Disaster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disaster</em>'.
	 * @generated
	 */
	Disaster createDisaster();

	/**
	 * Returns a new object of class '<em>Norm Violated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Violated</em>'.
	 * @generated
	 */
	NormViolated createNormViolated();

	/**
	 * Returns a new object of class '<em>Receive Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Act</em>'.
	 * @generated
	 */
	ReceiveAct createReceiveAct();

	/**
	 * Returns a new object of class '<em>Send Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Act</em>'.
	 * @generated
	 */
	SendAct createSendAct();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	Content createContent();

	/**
	 * Returns a new object of class '<em>Deadline Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadline Violation</em>'.
	 * @generated
	 */
	DeadlineViolation createDeadlineViolation();

	/**
	 * Returns a new object of class '<em>Task Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Violation</em>'.
	 * @generated
	 */
	TaskViolation createTaskViolation();

	/**
	 * Returns a new object of class '<em>Session Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Timeout</em>'.
	 * @generated
	 */
	SessionTimeout createSessionTimeout();

	/**
	 * Returns a new object of class '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability</em>'.
	 * @generated
	 */
	Availability createAvailability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactPackage getFactPackage();

} //FactFactory
