/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landmark Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.LandmarkPattern#getLandmarks <em>Landmarks</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.LandmarkPattern#getLandmarkOrder <em>Landmark Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getLandmarkPattern()
 * @model
 * @generated
 */
public interface LandmarkPattern extends EObject
{
	/**
	 * Returns the value of the '<em><b>Landmarks</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Landmark}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landmarks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landmarks</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getLandmarkPattern_Landmarks()
	 * @model containment="true" keys="name" lower="2"
	 * @generated
	 */
	EList<Landmark> getLandmarks();

	/**
	 * Returns the value of the '<em><b>Landmark Order</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.PartialOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landmark Order</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landmark Order</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getLandmarkPattern_LandmarkOrder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PartialOrder> getLandmarkOrder();

} // LandmarkPattern
