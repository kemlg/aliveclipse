/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDensity <em>Has Density</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasCostDistribution <em>Has Cost Distribution</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDurationDistribution <em>Has Duration Distribution</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasQualityDistribution <em>Has Quality Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicActionResult()
 * @model
 * @generated
 */
public interface AtomicActionResult extends ActionResult {
	/**
	 * Returns the value of the '<em><b>Has Density</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Density</em>' attribute.
	 * @see #setHasDensity(float)
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicActionResult_HasDensity()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getHasDensity();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDensity <em>Has Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Density</em>' attribute.
	 * @see #getHasDensity()
	 * @generated
	 */
	void setHasDensity(float value);

	/**
	 * Returns the value of the '<em><b>Has Cost Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.actions.Distribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Cost Distribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Cost Distribution</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicActionResult_HasCostDistribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Distribution> getHasCostDistribution();

	/**
	 * Returns the value of the '<em><b>Has Duration Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.actions.Distribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Duration Distribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Duration Distribution</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicActionResult_HasDurationDistribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Distribution> getHasDurationDistribution();

	/**
	 * Returns the value of the '<em><b>Has Quality Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.actions.Distribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Quality Distribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Quality Distribution</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicActionResult_HasQualityDistribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Distribution> getHasQualityDistribution();

} // AtomicActionResult
