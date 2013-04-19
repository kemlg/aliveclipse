/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.operetta.OM.Objective;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.ObjectiveFulfilment#getObjective <em>Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getObjectiveFulfilment()
 * @model
 * @generated
 */
public interface ObjectiveFulfilment extends FulfilmentAct {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' reference.
	 * @see #setObjective(Objective)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getObjectiveFulfilment_Objective()
	 * @model required="true"
	 * @generated
	 */
	Objective getObjective();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.ObjectiveFulfilment#getObjective <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Objective value);

} // ObjectiveFulfilment
