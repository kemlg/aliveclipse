/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances;

import net.sf.ictalive.operetta.OM.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.Value#getOf <em>Of</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.Value#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' reference.
	 * @see #setOf(Variable)
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getValue_Of()
	 * @model required="true"
	 * @generated
	 */
	Variable getOf();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.NormInstances.Value#getOf <em>Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(Variable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#getValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.NormInstances.Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Value
