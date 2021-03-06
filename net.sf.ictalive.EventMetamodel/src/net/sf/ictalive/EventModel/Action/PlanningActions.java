/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action;

import net.sf.ictalive.coordination.tasks.Plan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planning Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Action.PlanningActions#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getPlanningActions()
 * @model abstract="true"
 * @generated
 */
public interface PlanningActions extends Action
{
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
	 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getPlanningActions_Plan()
	 * @model
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Action.PlanningActions#getPlan <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

} // PlanningActions
