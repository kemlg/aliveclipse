/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service;

import net.sf.ictalive.coordination.agents.Agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.ServiceProvider#getExposes <em>Exposes</em>}</li>
 *   <li>{@link net.sf.ictalive.service.ServiceProvider#getIsType <em>Is Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.ServiceProvider#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.ServicePackage#getServiceProvider()
 * @model abstract="true"
 * @generated
 */
public interface ServiceProvider extends Agent
{
	/**
	 * Returns the value of the '<em><b>Exposes</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposes</em>' reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getServiceProvider_Exposes()
	 * @model required="true"
	 * @generated
	 */
	EList<Service> getExposes();

	/**
	 * Returns the value of the '<em><b>Is Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.service.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Type</em>' attribute.
	 * @see net.sf.ictalive.service.ServiceType
	 * @see #setIsType(ServiceType)
	 * @see net.sf.ictalive.service.ServicePackage#getServiceProvider_IsType()
	 * @model required="true" derived="true"
	 * @generated
	 */
	ServiceType getIsType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.ServiceProvider#getIsType <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Type</em>' attribute.
	 * @see net.sf.ictalive.service.ServiceType
	 * @see #getIsType()
	 * @generated
	 */
	void setIsType(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.ServiceImplemetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getServiceProvider_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceImplemetation> getImplementation();

} // ServiceProvider
