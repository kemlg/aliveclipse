/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment;

import net.sf.ictalive.coordination.tasks.Plan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Enactment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.enactment.PlanEnactment#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#getPlanEnactment()
 * @model
 * @generated
 */
public interface PlanEnactment extends Enactment {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' reference.
	 * @see #setPlan(Plan)
	 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#getPlanEnactment_Plan()
	 * @model required="true"
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.enactment.PlanEnactment#getPlan <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

} // PlanEnactment
