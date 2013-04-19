/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Implication#getAntecedentStateFormula <em>Antecedent State Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Implication#getConsequentStateFormula <em>Consequent State Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getImplication()
 * @model
 * @generated
 */
public interface Implication extends StateFormula {
	/**
	 * Returns the value of the '<em><b>Antecedent State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent State Formula</em>' reference.
	 * @see #setAntecedentStateFormula(StateFormula)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getImplication_AntecedentStateFormula()
	 * @model required="true"
	 * @generated
	 */
	StateFormula getAntecedentStateFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Implication#getAntecedentStateFormula <em>Antecedent State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent State Formula</em>' reference.
	 * @see #getAntecedentStateFormula()
	 * @generated
	 */
	void setAntecedentStateFormula(StateFormula value);

	/**
	 * Returns the value of the '<em><b>Consequent State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent State Formula</em>' reference.
	 * @see #setConsequentStateFormula(StateFormula)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getImplication_ConsequentStateFormula()
	 * @model required="true"
	 * @generated
	 */
	StateFormula getConsequentStateFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Implication#getConsequentStateFormula <em>Consequent State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent State Formula</em>' reference.
	 * @see #getConsequentStateFormula()
	 * @generated
	 */
	void setConsequentStateFormula(StateFormula value);

	// @added
	public String write();
	
} // Implication
