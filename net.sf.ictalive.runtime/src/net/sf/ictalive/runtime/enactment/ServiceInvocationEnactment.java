/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment;

import net.sf.ictalive.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Invocation Enactment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#getServiceInvocationEnactment()
 * @model
 * @generated
 */
public interface ServiceInvocationEnactment extends Enactment {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#getServiceInvocationEnactment_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ServiceInvocationEnactment
