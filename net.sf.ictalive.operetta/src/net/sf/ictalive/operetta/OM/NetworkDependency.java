/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.NetworkDependency#getDependant1 <em>Dependant1</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.NetworkDependency#getDependant2 <em>Dependant2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getNetworkDependency()
 * @model
 * @generated
 */
public interface NetworkDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Dependant1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependant1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant1</em>' reference.
	 * @see #setDependant1(Role)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getNetworkDependency_Dependant1()
	 * @model required="true"
	 * @generated
	 */
	Role getDependant1();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.NetworkDependency#getDependant1 <em>Dependant1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant1</em>' reference.
	 * @see #getDependant1()
	 * @generated
	 */
	void setDependant1(Role value);

	/**
	 * Returns the value of the '<em><b>Dependant2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependant2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant2</em>' reference.
	 * @see #setDependant2(Role)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getNetworkDependency_Dependant2()
	 * @model required="true"
	 * @generated
	 */
	Role getDependant2();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.NetworkDependency#getDependant2 <em>Dependant2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant2</em>' reference.
	 * @see #getDependant2()
	 * @generated
	 */
	void setDependant2(Role value);

} // NetworkDependency
