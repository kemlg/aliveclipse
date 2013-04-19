/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances;

import net.sf.ictalive.operetta.OM.Norm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getNorm <em>Norm</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getPartialStateDescriptionInstance <em>Partial State Description Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getNormInstance()
 * @model
 * @generated
 */
public interface NormInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norm</em>' reference.
	 * @see #setNorm(Norm)
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getNormInstance_Norm()
	 * @model required="true"
	 * @generated
	 */
	Norm getNorm();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getNorm <em>Norm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm</em>' reference.
	 * @see #getNorm()
	 * @generated
	 */
	void setNorm(Norm value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getNormInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.NormInstances.NormInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Partial State Description Instance</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial State Description Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial State Description Instance</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getNormInstance_PartialStateDescriptionInstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialStateDescriptionInstance> getPartialStateDescriptionInstance();

} // NormInstance
