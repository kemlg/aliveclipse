/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax;

import net.sf.ictalive.service.ServiceImplemetation;

import net.sf.ictalive.service.architecture.DeployedService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.Endpoint#getBinding <em>Binding</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Endpoint#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Endpoint#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Endpoint#getLocation <em>Location</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Endpoint#getDeployedService <em>Deployed Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends EObject
{
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(Binding)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getEndpoint_Binding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Endpoint#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(ServiceImplemetation)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getEndpoint_Implementation()
	 * @model
	 * @generated
	 */
	ServiceImplemetation getImplementation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Endpoint#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ServiceImplemetation value);

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
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getEndpoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Endpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getEndpoint_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Endpoint#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Deployed Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Service</em>' reference.
	 * @see #setDeployedService(DeployedService)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getEndpoint_DeployedService()
	 * @model
	 * @generated
	 */
	DeployedService getDeployedService();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Endpoint#getDeployedService <em>Deployed Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Service</em>' reference.
	 * @see #getDeployedService()
	 * @generated
	 */
	void setDeployedService(DeployedService value);

} // Endpoint
