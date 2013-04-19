/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service;

import net.sf.ictalive.service.architecture.ServiceFramework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.SL#getServices <em>Services</em>}</li>
 *   <li>{@link net.sf.ictalive.service.SL#getProviders <em>Providers</em>}</li>
 *   <li>{@link net.sf.ictalive.service.SL#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link net.sf.ictalive.service.SL#getFramework <em>Framework</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.ServicePackage#getSL()
 * @model
 * @generated
 */
public interface SL extends EObject
{
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getSL_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getSL_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceProvider> getProviders();

	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.ServiceConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' containment reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getSL_Consumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConsumer> getConsumers();

	/**
	 * Returns the value of the '<em><b>Framework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework</em>' containment reference.
	 * @see #setFramework(ServiceFramework)
	 * @see net.sf.ictalive.service.ServicePackage#getSL_Framework()
	 * @model containment="true"
	 * @generated
	 */
	ServiceFramework getFramework();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.SL#getFramework <em>Framework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework</em>' containment reference.
	 * @see #getFramework()
	 * @generated
	 */
	void setFramework(ServiceFramework value);

} // SL
