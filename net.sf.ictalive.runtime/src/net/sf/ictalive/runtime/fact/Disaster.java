/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disaster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.Disaster#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getDisaster()
 * @model
 * @generated
 */
public interface Disaster extends Fact {
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
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getDisaster_Reason()
	 * @model
	 * @generated
	 */
	EObject getReason();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.Disaster#getReason <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(EObject value);

} // Disaster
