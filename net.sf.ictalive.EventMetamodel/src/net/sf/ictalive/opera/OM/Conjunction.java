/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Conjunction#getLeftStateFormula <em>Left State Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Conjunction#getRightStateFormula <em>Right State Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getConjunction()
 * @model
 * @generated
 */
public interface Conjunction extends StateFormula
{
	/**
	 * Returns the value of the '<em><b>Left State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left State Formula</em>' reference.
	 * @see #setLeftStateFormula(StateFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getConjunction_LeftStateFormula()
	 * @model required="true"
	 * @generated
	 */
	StateFormula getLeftStateFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Conjunction#getLeftStateFormula <em>Left State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left State Formula</em>' reference.
	 * @see #getLeftStateFormula()
	 * @generated
	 */
	void setLeftStateFormula(StateFormula value);

	/**
	 * Returns the value of the '<em><b>Right State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right State Formula</em>' reference.
	 * @see #setRightStateFormula(StateFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getConjunction_RightStateFormula()
	 * @model required="true"
	 * @generated
	 */
	StateFormula getRightStateFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Conjunction#getRightStateFormula <em>Right State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right State Formula</em>' reference.
	 * @see #getRightStateFormula()
	 * @generated
	 */
	void setRightStateFormula(StateFormula value);

} // Conjunction
