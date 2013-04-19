/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Until#getFromPathFormula <em>From Path Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Until#getUntilPathFormula <em>Until Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getUntil()
 * @model
 * @generated
 */
public interface Until extends PathFormula {
	/**
	 * Returns the value of the '<em><b>From Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Path Formula</em>' reference.
	 * @see #setFromPathFormula(PathFormula)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getUntil_FromPathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getFromPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Until#getFromPathFormula <em>From Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Path Formula</em>' reference.
	 * @see #getFromPathFormula()
	 * @generated
	 */
	void setFromPathFormula(PathFormula value);

	/**
	 * Returns the value of the '<em><b>Until Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Path Formula</em>' reference.
	 * @see #setUntilPathFormula(PathFormula)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getUntil_UntilPathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getUntilPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Until#getUntilPathFormula <em>Until Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Path Formula</em>' reference.
	 * @see #getUntilPathFormula()
	 * @generated
	 */
	void setUntilPathFormula(PathFormula value);
	
	// @added
	public String write();

} // Until
