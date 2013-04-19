/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Player#getPlayerID <em>Player ID</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Player#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject
{
	/**
	 * Returns the value of the '<em><b>Player ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player ID</em>' attribute.
	 * @see #setPlayerID(char)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getPlayer_PlayerID()
	 * @model required="true"
	 * @generated
	 */
	char getPlayerID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Player#getPlayerID <em>Player ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player ID</em>' attribute.
	 * @see #getPlayerID()
	 * @generated
	 */
	void setPlayerID(char value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getPlayer_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Player#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Player
