/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deadline Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.DeadlineViolation#getDealine <em>Dealine</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getDeadlineViolation()
 * @model
 * @generated
 */
public interface DeadlineViolation extends NormViolated
{
	/**
	 * Returns the value of the '<em><b>Dealine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dealine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dealine</em>' attribute.
	 * @see #setDealine(Date)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getDeadlineViolation_Dealine()
	 * @model
	 * @generated
	 */
	Date getDealine();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.DeadlineViolation#getDealine <em>Dealine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dealine</em>' attribute.
	 * @see #getDealine()
	 * @generated
	 */
	void setDealine(Date value);

} // DeadlineViolation
