/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.SendAct#getSendMessage <em>Send Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getSendAct()
 * @model
 * @generated
 */
public interface SendAct extends CommunicativeAct {
	/**
	 * Returns the value of the '<em><b>Send Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Message</em>' containment reference.
	 * @see #setSendMessage(Message)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getSendAct_SendMessage()
	 * @model containment="true"
	 * @generated
	 */
	Message getSendMessage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.SendAct#getSendMessage <em>Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Message</em>' containment reference.
	 * @see #getSendMessage()
	 * @generated
	 */
	void setSendMessage(Message value);

} // SendAct
