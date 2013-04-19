/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.runtime.event.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicative Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.CommunicativeAct#getSender <em>Sender</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.CommunicativeAct#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getCommunicativeAct()
 * @model abstract="true"
 * @generated
 */
public interface CommunicativeAct extends Fact {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Actor)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getCommunicativeAct_Sender()
	 * @model
	 * @generated
	 */
	Actor getSender();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.CommunicativeAct#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Actor value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Actor)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getCommunicativeAct_Receiver()
	 * @model
	 * @generated
	 */
	Actor getReceiver();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.CommunicativeAct#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Actor value);

} // CommunicativeAct
