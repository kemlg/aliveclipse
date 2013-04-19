/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.EventModel.Action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionFactory eINSTANCE = net.sf.ictalive.EventModel.Action.impl.ActionFactoryImpl.init();

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
	 * Returns a new object of class '<em>Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enactment</em>'.
	 * @generated
	 */
	ActionEnactment createActionEnactment();

	/**
	 * Returns a new object of class '<em>Service Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Invocation</em>'.
	 * @generated
	 */
	ServiceInvocation createServiceInvocation();

	/**
	 * Returns a new object of class '<em>Find Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Service</em>'.
	 * @generated
	 */
	FindService createFindService();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionPackage getActionPackage();

} //ActionFactory
