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
 * A representation of the model object '<em><b>Coordination Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Action.CoordinationAction#getCoordAction <em>Coord Action</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Action.CoordinationAction#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getCoordinationAction()
 * @model abstract="true"
 * @generated
 */
public interface CoordinationAction extends Action
{
	/**
	 * Returns the value of the '<em><b>Coord Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Action</em>' reference.
	 * @see #setCoordAction(net.sf.ictalive.coordination.actions.Action)
	 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getCoordinationAction_CoordAction()
	 * @model
	 * @generated
	 */
	net.sf.ictalive.coordination.actions.Action getCoordAction();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Action.CoordinationAction#getCoordAction <em>Coord Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Action</em>' reference.
	 * @see #getCoordAction()
	 * @generated
	 */
	void setCoordAction(net.sf.ictalive.coordination.actions.Action value);

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
	 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getCoordinationAction_Plan()
	 * @model
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Action.CoordinationAction#getPlan <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

} // CoordinationAction
