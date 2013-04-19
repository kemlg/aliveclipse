/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import net.sf.ictalive.opera.OM.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.RoleActor#getTakeRole <em>Take Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getRoleActor()
 * @model
 * @generated
 */
public interface RoleActor extends Actor
{
	/**
	 * Returns the value of the '<em><b>Take Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Take Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Take Role</em>' reference.
	 * @see #setTakeRole(Role)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getRoleActor_TakeRole()
	 * @model required="true"
	 * @generated
	 */
	Role getTakeRole();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.RoleActor#getTakeRole <em>Take Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Role</em>' reference.
	 * @see #getTakeRole()
	 * @generated
	 */
	void setTakeRole(Role value);

} // RoleActor
