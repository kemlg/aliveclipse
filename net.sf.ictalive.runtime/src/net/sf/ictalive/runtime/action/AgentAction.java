/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import net.sf.ictalive.coordination.agents.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.AgentAction#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getAgentAction()
 * @model abstract="true"
 * @generated
 */
public interface AgentAction extends Action {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAgentAction_Agent()
	 * @model required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.AgentAction#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // AgentAction
