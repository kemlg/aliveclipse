/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionFactory eINSTANCE = net.sf.ictalive.runtime.action.impl.ActionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communicative Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communicative Action</em>'.
	 * @generated
	 */
	CommunicativeAction createCommunicativeAction();

	/**
	 * Returns a new object of class '<em>Coordination Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Action</em>'.
	 * @generated
	 */
	CoordinationAction createCoordinationAction();

	/**
	 * Returns a new object of class '<em>Plan Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Synthesis</em>'.
	 * @generated
	 */
	PlanSynthesis createPlanSynthesis();

	/**
	 * Returns a new object of class '<em>Plan Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Distribution</em>'.
	 * @generated
	 */
	PlanDistribution createPlanDistribution();

	/**
	 * Returns a new object of class '<em>Plan Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Schedule</em>'.
	 * @generated
	 */
	PlanSchedule createPlanSchedule();

	/**
	 * Returns a new object of class '<em>Plan Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Execution</em>'.
	 * @generated
	 */
	PlanExecution createPlanExecution();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>Service Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Invocation</em>'.
	 * @generated
	 */
	ServiceInvocation createServiceInvocation();

	/**
	 * Returns a new object of class '<em>Matchmaker Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matchmaker Response</em>'.
	 * @generated
	 */
	MatchmakerResponse createMatchmakerResponse();

	/**
	 * Returns a new object of class '<em>Replace Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Agent</em>'.
	 * @generated
	 */
	ReplaceAgent createReplaceAgent();

	/**
	 * Returns a new object of class '<em>Agent Replan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Replan</em>'.
	 * @generated
	 */
	AgentReplan createAgentReplan();

	/**
	 * Returns a new object of class '<em>Notify State Of World</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notify State Of World</em>'.
	 * @generated
	 */
	NotifyStateOfWorld createNotifyStateOfWorld();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>State Of World</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Of World</em>'.
	 * @generated
	 */
	StateOfWorld createStateOfWorld();

	/**
	 * Returns a new object of class '<em>Matchmaker Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matchmaker Query</em>'.
	 * @generated
	 */
	MatchmakerQuery createMatchmakerQuery();

	/**
	 * Returns a new object of class '<em>Matchmaker Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matchmaker Result</em>'.
	 * @generated
	 */
	MatchmakerResult createMatchmakerResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionPackage getActionPackage();

} //ActionFactory
