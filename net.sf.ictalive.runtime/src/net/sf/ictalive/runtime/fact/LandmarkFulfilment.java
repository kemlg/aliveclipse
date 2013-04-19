/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.operetta.OM.Landmark;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landmark Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.LandmarkFulfilment#getLandmark <em>Landmark</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getLandmarkFulfilment()
 * @model
 * @generated
 */
public interface LandmarkFulfilment extends FulfilmentAct {
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
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getLandmarkFulfilment_Landmark()
	 * @model required="true"
	 * @generated
	 */
	Landmark getLandmark();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.LandmarkFulfilment#getLandmark <em>Landmark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landmark</em>' reference.
	 * @see #getLandmark()
	 * @generated
	 */
	void setLandmark(Landmark value);

} // LandmarkFulfilment
