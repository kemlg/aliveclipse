/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action;

import net.sf.ictalive.coordination.agents.Agent;

import net.sf.ictalive.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Action.ServiceInvocation#getAgent <em>Agent</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Action.ServiceInvocation#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getServiceInvocation()
 * @model
 * @generated
 */
public interface ServiceInvocation extends ServiceActions
{
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
	 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getServiceInvocation_Agent()
	 * @model
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Action.ServiceInvocation#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getServiceInvocation_Service()
	 * @model
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Action.ServiceInvocation#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ServiceInvocation
