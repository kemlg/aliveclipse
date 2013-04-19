/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances;

import net.sf.ictalive.operetta.OM.PartialStateDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial State Description Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getPartialStateDescription <em>Partial State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getPartialStateDescriptionInstance()
 * @model
 * @generated
 */
public interface PartialStateDescriptionInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Partial State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial State Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial State Description</em>' reference.
	 * @see #setPartialStateDescription(PartialStateDescription)
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getPartialStateDescriptionInstance_PartialStateDescription()
	 * @model required="true"
	 * @generated
	 */
	PartialStateDescription getPartialStateDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getPartialStateDescription <em>Partial State Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial State Description</em>' reference.
	 * @see #getPartialStateDescription()
	 * @generated
	 */
	void setPartialStateDescription(PartialStateDescription value);

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
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getPartialStateDescriptionInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.NormInstances.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getPartialStateDescriptionInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

} // PartialStateDescriptionInstance
