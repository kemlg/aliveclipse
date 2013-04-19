/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import net.sf.ictalive.operetta.OM.Objective;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective2 Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.Objective2Action#getObjective <em>Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getObjective2Action()
 * @model
 * @generated
 */
public interface Objective2Action extends MapEntry, ToAction {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' reference.
	 * @see #setObjective(Objective)
	 * @see OLCLMap.OLCLMapPackage#getObjective2Action_Objective()
	 * @model
	 * @generated
	 */
	Objective getObjective();

	/**
	 * Sets the value of the '{@link OLCLMap.Objective2Action#getObjective <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Objective value);

} // Objective2Action
