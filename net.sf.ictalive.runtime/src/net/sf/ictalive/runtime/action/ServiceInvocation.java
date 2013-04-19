/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import net.sf.ictalive.coordination.agents.Agent;

import net.sf.ictalive.coordination.tasks.ActionGrounding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.ServiceInvocation#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.ServiceInvocation#getEnactingAgent <em>Enacting Agent</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.ServiceInvocation#getCorrelatedAction <em>Correlated Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getServiceInvocation()
 * @model
 * @generated
 */
public interface ServiceInvocation extends Action {
	/**
	 * Returns the value of the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URI</em>' attribute.
	 * @see #setServiceURI(String)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getServiceInvocation_ServiceURI()
	 * @model
	 * @generated
	 */
	String getServiceURI();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.ServiceInvocation#getServiceURI <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URI</em>' attribute.
	 * @see #getServiceURI()
	 * @generated
	 */
	void setServiceURI(String value);

	/**
	 * Returns the value of the '<em><b>Enacting Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enacting Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enacting Agent</em>' reference.
	 * @see #setEnactingAgent(Agent)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getServiceInvocation_EnactingAgent()
	 * @model
	 * @generated
	 */
	Agent getEnactingAgent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.ServiceInvocation#getEnactingAgent <em>Enacting Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enacting Agent</em>' reference.
	 * @see #getEnactingAgent()
	 * @generated
	 */
	void setEnactingAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Correlated Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlated Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlated Action</em>' reference.
	 * @see #setCorrelatedAction(ActionGrounding)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getServiceInvocation_CorrelatedAction()
	 * @model
	 * @generated
	 */
	ActionGrounding getCorrelatedAction();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.ServiceInvocation#getCorrelatedAction <em>Correlated Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlated Action</em>' reference.
	 * @see #getCorrelatedAction()
	 * @generated
	 */
	void setCorrelatedAction(ActionGrounding value);

} // ServiceInvocation
