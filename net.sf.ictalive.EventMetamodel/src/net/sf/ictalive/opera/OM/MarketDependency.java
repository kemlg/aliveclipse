/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.MarketDependency#getDependant <em>Dependant</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.MarketDependency#getDependee <em>Dependee</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getMarketDependency()
 * @model
 * @generated
 */
public interface MarketDependency extends Dependency
{
	/**
	 * Returns the value of the '<em><b>Dependant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant</em>' reference.
	 * @see #setDependant(Role)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getMarketDependency_Dependant()
	 * @model required="true"
	 * @generated
	 */
	Role getDependant();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.MarketDependency#getDependant <em>Dependant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant</em>' reference.
	 * @see #getDependant()
	 * @generated
	 */
	void setDependant(Role value);

	/**
	 * Returns the value of the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependee</em>' reference.
	 * @see #setDependee(Role)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getMarketDependency_Dependee()
	 * @model required="true"
	 * @generated
	 */
	Role getDependee();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.MarketDependency#getDependee <em>Dependee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependee</em>' reference.
	 * @see #getDependee()
	 * @generated
	 */
	void setDependee(Role value);

} // MarketDependency
