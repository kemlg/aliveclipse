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
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.ServiceConsumer#getInvokes <em>Invokes</em>}</li>
 *   <li>{@link net.sf.ictalive.service.ServiceConsumer#getIsType <em>Is Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.ServicePackage#getServiceConsumer()
 * @model
 * @generated
 */
public interface ServiceConsumer extends Agent
{
	/**
	 * Returns the value of the '<em><b>Invokes</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes</em>' reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getServiceConsumer_Invokes()
	 * @model required="true"
	 * @generated
	 */
	EList<Service> getInvokes();

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
	 * @see net.sf.ictalive.service.ServicePackage#getServiceConsumer_IsType()
	 * @model required="true" derived="true"
	 * @generated
	 */
	ServiceType getIsType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.ServiceConsumer#getIsType <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Type</em>' attribute.
	 * @see net.sf.ictalive.service.ServiceType
	 * @see #getIsType()
	 * @generated
	 */
	void setIsType(ServiceType value);

} // ServiceConsumer
