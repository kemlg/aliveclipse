/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import net.sf.ictalive.operetta.OM.Scene;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene2 Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.Scene2Action#getScene <em>Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getScene2Action()
 * @model
 * @generated
 */
public interface Scene2Action extends MapEntry, ToAction {
	/**
	 * Returns the value of the '<em><b>Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' reference.
	 * @see #setScene(Scene)
	 * @see OLCLMap.OLCLMapPackage#getScene2Action_Scene()
	 * @model
	 * @generated
	 */
	Scene getScene();

	/**
	 * Sets the value of the '{@link OLCLMap.Scene2Action#getScene <em>Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' reference.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(Scene value);

} // Scene2Action
