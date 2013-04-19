/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment;

import net.sf.ictalive.coordination.tasks.ActionGrounding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Enactment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.enactment.ActionEnactment#getGroundedAction <em>Grounded Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#getActionEnactment()
 * @model
 * @generated
 */
public interface ActionEnactment extends Enactment {
	/**
	 * Returns the value of the '<em><b>Grounded Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded Action</em>' reference.
	 * @see #setGroundedAction(ActionGrounding)
	 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#getActionEnactment_GroundedAction()
	 * @model required="true"
	 * @generated
	 */
	ActionGrounding getGroundedAction();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.enactment.ActionEnactment#getGroundedAction <em>Grounded Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded Action</em>' reference.
	 * @see #getGroundedAction()
	 * @generated
	 */
	void setGroundedAction(ActionGrounding value);

} // ActionEnactment
