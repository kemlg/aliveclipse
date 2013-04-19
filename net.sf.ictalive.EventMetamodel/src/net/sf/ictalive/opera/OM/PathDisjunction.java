/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.PathDisjunction#getLeftPathFormula <em>Left Path Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.PathDisjunction#getRightPathFormula <em>Right Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getPathDisjunction()
 * @model
 * @generated
 */
public interface PathDisjunction extends PathFormula
{
	/**
	 * Returns the value of the '<em><b>Left Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Path Formula</em>' reference.
	 * @see #setLeftPathFormula(PathFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getPathDisjunction_LeftPathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getLeftPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.PathDisjunction#getLeftPathFormula <em>Left Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Path Formula</em>' reference.
	 * @see #getLeftPathFormula()
	 * @generated
	 */
	void setLeftPathFormula(PathFormula value);

	/**
	 * Returns the value of the '<em><b>Right Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Path Formula</em>' reference.
	 * @see #setRightPathFormula(PathFormula)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getPathDisjunction_RightPathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getRightPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.PathDisjunction#getRightPathFormula <em>Right Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Path Formula</em>' reference.
	 * @see #getRightPathFormula()
	 * @generated
	 */
	void setRightPathFormula(PathFormula value);

} // PathDisjunction
