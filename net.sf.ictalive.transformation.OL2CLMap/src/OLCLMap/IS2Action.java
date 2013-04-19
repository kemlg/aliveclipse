/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import net.sf.ictalive.operetta.OM.IS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS2 Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.IS2Action#getInteractionScene <em>Interaction Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getIS2Action()
 * @model
 * @generated
 */
public interface IS2Action extends MapEntry, ToAction {
	/**
	 * Returns the value of the '<em><b>Interaction Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Scene</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Scene</em>' reference.
	 * @see #setInteractionScene(IS)
	 * @see OLCLMap.OLCLMapPackage#getIS2Action_InteractionScene()
	 * @model
	 * @generated
	 */
	IS getInteractionScene();

	/**
	 * Sets the value of the '{@link OLCLMap.IS2Action#getInteractionScene <em>Interaction Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Scene</em>' reference.
	 * @see #getInteractionScene()
	 * @generated
	 */
	void setInteractionScene(IS value);

} // IS2Action
