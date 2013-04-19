/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Negation#getStateFormula <em>State Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends StateFormula
{
	/**
	 * Returns the value of the '<em><b>State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Formula</em>' reference.
	 * @see #setStateFormula(StateFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNegation_StateFormula()
	 * @model required="true"
	 * @generated
	 */
	StateFormula getStateFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Negation#getStateFormula <em>State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Formula</em>' reference.
	 * @see #getStateFormula()
	 * @generated
	 */
	void setStateFormula(StateFormula value);

} // Negation
