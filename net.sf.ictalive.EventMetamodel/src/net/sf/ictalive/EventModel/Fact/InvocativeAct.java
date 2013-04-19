/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import net.sf.ictalive.EventModel.Action.CoordinationAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocative Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.InvocativeAct#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getInvocativeAct()
 * @model abstract="true"
 * @generated
 */
public interface InvocativeAct extends Fact
{
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CoordinationAction)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getInvocativeAct_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoordinationAction getAction();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.InvocativeAct#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CoordinationAction value);

} // InvocativeAct
