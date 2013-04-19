/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.FailureAct#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getFailureAct()
 * @model
 * @generated
 */
public interface FailureAct extends InvocativeAct
{
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' reference.
	 * @see #setReason(EObject)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getFailureAct_Reason()
	 * @model
	 * @generated
	 */
	EObject getReason();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.FailureAct#getReason <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(EObject value);

} // FailureAct
