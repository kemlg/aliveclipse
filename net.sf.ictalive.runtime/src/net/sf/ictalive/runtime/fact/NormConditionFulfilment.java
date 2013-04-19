/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.operetta.OM.Norm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Condition Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment#getNorm <em>Norm</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormConditionFulfilment()
 * @model
 * @generated
 */
public interface NormConditionFulfilment extends FulfilmentAct {
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
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormConditionFulfilment_Norm()
	 * @model required="true"
	 * @generated
	 */
	Norm getNorm();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment#getNorm <em>Norm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm</em>' reference.
	 * @see #getNorm()
	 * @generated
	 */
	void setNorm(Norm value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.runtime.fact.NormType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.runtime.fact.NormType
	 * @see #setType(NormType)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormConditionFulfilment_Type()
	 * @model
	 * @generated
	 */
	NormType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.runtime.fact.NormType
	 * @see #getType()
	 * @generated
	 */
	void setType(NormType value);

} // NormConditionFulfilment
