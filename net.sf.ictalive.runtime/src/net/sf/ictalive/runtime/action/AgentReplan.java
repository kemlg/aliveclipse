/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import net.sf.ictalive.coordination.tasks.Plan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Replan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.AgentReplan#getFailedPlan <em>Failed Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getAgentReplan()
 * @model
 * @generated
 */
public interface AgentReplan extends AgentAction {
	/**
	 * Returns the value of the '<em><b>Failed Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Plan</em>' reference.
	 * @see #setFailedPlan(Plan)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAgentReplan_FailedPlan()
	 * @model
	 * @generated
	 */
	Plan getFailedPlan();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.AgentReplan#getFailedPlan <em>Failed Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Plan</em>' reference.
	 * @see #getFailedPlan()
	 * @generated
	 */
	void setFailedPlan(Plan value);

} // AgentReplan
