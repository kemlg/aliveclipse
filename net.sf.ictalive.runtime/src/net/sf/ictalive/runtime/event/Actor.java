/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.event;

import net.sf.ictalive.coordination.agents.Agent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.event.Actor#getUrl <em>Url</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Actor#getEmit <em>Emit</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Actor#getAgent <em>Agent</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Actor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.event.EventPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see net.sf.ictalive.runtime.event.EventPackage#getActor_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Actor#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Emit</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.event.Event}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.runtime.event.Event#getAsserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emit</em>' reference list.
	 * @see net.sf.ictalive.runtime.event.EventPackage#getActor_Emit()
	 * @see net.sf.ictalive.runtime.event.Event#getAsserter
	 * @model opposite="asserter"
	 * @generated
	 */
	EList<Event> getEmit();

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
	 * @see net.sf.ictalive.runtime.event.EventPackage#getActor_Agent()
	 * @model required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Actor#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.runtime.event.EventPackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Actor
