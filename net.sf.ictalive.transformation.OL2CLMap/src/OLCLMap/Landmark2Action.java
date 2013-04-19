/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import net.sf.ictalive.operetta.OM.Landmark;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landmark2 Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.Landmark2Action#getLandmark <em>Landmark</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getLandmark2Action()
 * @model
 * @generated
 */
public interface Landmark2Action extends MapEntry, ToAction {
	/**
	 * Returns the value of the '<em><b>Landmark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landmark</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landmark</em>' reference.
	 * @see #setLandmark(Landmark)
	 * @see OLCLMap.OLCLMapPackage#getLandmark2Action_Landmark()
	 * @model
	 * @generated
	 */
	Landmark getLandmark();

	/**
	 * Sets the value of the '{@link OLCLMap.Landmark2Action#getLandmark <em>Landmark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landmark</em>' reference.
	 * @see #getLandmark()
	 * @generated
	 */
	void setLandmark(Landmark value);

} // Landmark2Action
