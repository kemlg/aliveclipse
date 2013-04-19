/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import net.sf.ictalive.operetta.OM.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.IndividualID#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getIndividualID()
 * @model
 * @generated
 */
public interface IndividualID extends IObject {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' reference.
	 * @see #setIndividual(Concept)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getIndividualID_Individual()
	 * @model
	 * @generated
	 */
	Concept getIndividual();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.IndividualID#getIndividual <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Concept value);

} // IndividualID
