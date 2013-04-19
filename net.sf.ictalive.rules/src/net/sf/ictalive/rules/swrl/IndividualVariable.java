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
 * A representation of the model object '<em><b>Individual Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.IndividualVariable#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.IndividualVariable#getConceptType <em>Concept Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getIndividualVariable()
 * @model
 * @generated
 */
public interface IndividualVariable extends IObject {
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
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getIndividualVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.IndividualVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concept Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Type</em>' reference.
	 * @see #setConceptType(Concept)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getIndividualVariable_ConceptType()
	 * @model
	 * @generated
	 */
	Concept getConceptType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.IndividualVariable#getConceptType <em>Concept Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Type</em>' reference.
	 * @see #getConceptType()
	 * @generated
	 */
	void setConceptType(Concept value);

} // IndividualVariable
