/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.fact.FactPackage
 * @generated
 */
public interface FactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactFactory eINSTANCE = net.sf.ictalive.runtime.fact.impl.FactFactoryImpl.init();

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
	 * Returns a new object of class '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability</em>'.
	 * @generated
	 */
	Availability createAvailability();

	/**
	 * Returns a new object of class '<em>Landmark Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Landmark Fulfilment</em>'.
	 * @generated
	 */
	LandmarkFulfilment createLandmarkFulfilment();

	/**
	 * Returns a new object of class '<em>Norm Condition Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Condition Fulfilment</em>'.
	 * @generated
	 */
	NormConditionFulfilment createNormConditionFulfilment();

	/**
	 * Returns a new object of class '<em>Objective Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Fulfilment</em>'.
	 * @generated
	 */
	ObjectiveFulfilment createObjectiveFulfilment();

	/**
	 * Returns a new object of class '<em>Player Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Fulfilment</em>'.
	 * @generated
	 */
	PlayerFulfilment createPlayerFulfilment();

	/**
	 * Returns a new object of class '<em>Norm Instance Violated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Instance Violated</em>'.
	 * @generated
	 */
	NormInstanceViolated createNormInstanceViolated();

	/**
	 * Returns a new object of class '<em>Norm Instance Activated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Instance Activated</em>'.
	 * @generated
	 */
	NormInstanceActivated createNormInstanceActivated();

	/**
	 * Returns a new object of class '<em>Norm Instance Expired</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Instance Expired</em>'.
	 * @generated
	 */
	NormInstanceExpired createNormInstanceExpired();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactPackage getFactPackage();

} //FactFactory
