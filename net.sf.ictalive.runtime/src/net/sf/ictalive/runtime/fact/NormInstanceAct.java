/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.runtime.NormInstances.NormInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Instance Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.NormInstanceAct#getNormInstance <em>Norm Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormInstanceAct()
 * @model abstract="true"
 * @generated
 */
public interface NormInstanceAct extends Fact {
	/**
	 * Returns the value of the '<em><b>Norm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norm Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norm Instance</em>' reference.
	 * @see #setNormInstance(NormInstance)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormInstanceAct_NormInstance()
	 * @model
	 * @generated
	 */
	NormInstance getNormInstance();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.NormInstanceAct#getNormInstance <em>Norm Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm Instance</em>' reference.
	 * @see #getNormInstance()
	 * @generated
	 */
	void setNormInstance(NormInstance value);

} // NormInstanceAct
