/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import net.sf.ictalive.EventModel.Action.CommunicativeAction;

import net.sf.ictalive.EventModel.Event.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicative Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getSender <em>Sender</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getCommunicativeAct()
 * @model abstract="true"
 * @generated
 */
public interface CommunicativeAct extends Fact
{
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
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getCommunicativeAct_Sender()
	 * @model
	 * @generated
	 */
	Actor getSender();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getSender <em>Sender</em>}' reference.
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
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getCommunicativeAct_Receiver()
	 * @model
	 * @generated
	 */
	Actor getReceiver();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Actor value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CommunicativeAction)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getCommunicativeAct_Action()
	 * @model containment="true"
	 * @generated
	 */
	CommunicativeAction getAction();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CommunicativeAction value);

} // CommunicativeAct
