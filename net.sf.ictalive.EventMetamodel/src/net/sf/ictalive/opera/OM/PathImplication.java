/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.PathImplication#getAntecedentPathFormula <em>Antecedent Path Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.PathImplication#getConsequentPathFormula <em>Consequent Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getPathImplication()
 * @model
 * @generated
 */
public interface PathImplication extends PathFormula
{
	/**
	 * Returns the value of the '<em><b>Antecedent Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Path Formula</em>' reference.
	 * @see #setAntecedentPathFormula(PathFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getPathImplication_AntecedentPathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getAntecedentPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.PathImplication#getAntecedentPathFormula <em>Antecedent Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Path Formula</em>' reference.
	 * @see #getAntecedentPathFormula()
	 * @generated
	 */
	void setAntecedentPathFormula(PathFormula value);

	/**
	 * Returns the value of the '<em><b>Consequent Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent Path Formula</em>' reference.
	 * @see #setConsequentPathFormula(PathFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getPathImplication_ConsequentPathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getConsequentPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.PathImplication#getConsequentPathFormula <em>Consequent Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent Path Formula</em>' reference.
	 * @see #getConsequentPathFormula()
	 * @generated
	 */
	void setConsequentPathFormula(PathFormula value);

} // PathImplication
