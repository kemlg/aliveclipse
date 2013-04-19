/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import net.sf.ictalive.operetta.OM.LandmarkPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landmark Pattern2 Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.LandmarkPattern2Action#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getLandmarkPattern2Action()
 * @model
 * @generated
 */
public interface LandmarkPattern2Action extends MapEntry, ToAction {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(LandmarkPattern)
	 * @see OLCLMap.OLCLMapPackage#getLandmarkPattern2Action_Pattern()
	 * @model
	 * @generated
	 */
	LandmarkPattern getPattern();

	/**
	 * Sets the value of the '{@link OLCLMap.LandmarkPattern2Action#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(LandmarkPattern value);

} // LandmarkPattern2Action
