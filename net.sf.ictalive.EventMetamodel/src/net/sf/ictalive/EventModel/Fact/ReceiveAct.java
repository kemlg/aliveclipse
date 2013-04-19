/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.ReceiveAct#getReceivedMessage <em>Received Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getReceiveAct()
 * @model
 * @generated
 */
public interface ReceiveAct extends CommunicativeAct
{
	/**
	 * Returns the value of the '<em><b>Received Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Message</em>' containment reference.
	 * @see #setReceivedMessage(Message)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getReceiveAct_ReceivedMessage()
	 * @model containment="true"
	 * @generated
	 */
	Message getReceivedMessage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.ReceiveAct#getReceivedMessage <em>Received Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Message</em>' containment reference.
	 * @see #getReceivedMessage()
	 * @generated
	 */
	void setReceivedMessage(Message value);

} // ReceiveAct
