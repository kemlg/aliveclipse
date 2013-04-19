/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.ForAllPaths#getPathFormula <em>Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getForAllPaths()
 * @model
 * @generated
 */
public interface ForAllPaths extends StateFormula {
	/**
	 * Returns the value of the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Formula</em>' reference.
	 * @see #setPathFormula(PathFormula)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getForAllPaths_PathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.ForAllPaths#getPathFormula <em>Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Formula</em>' reference.
	 * @see #getPathFormula()
	 * @generated
	 */
	void setPathFormula(PathFormula value);
	
	// @added
	public String write();

} // ForAllPaths
