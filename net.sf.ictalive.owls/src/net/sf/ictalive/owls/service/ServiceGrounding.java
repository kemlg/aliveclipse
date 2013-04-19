/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.ServiceGrounding#getSupportedBy <em>Supported By</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceGrounding()
 * @model
 * @generated
 */
public interface ServiceGrounding extends EObject {
	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.Service#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported By</em>' container reference.
	 * @see #setSupportedBy(Service)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceGrounding_SupportedBy()
	 * @see net.sf.ictalive.owls.service.Service#getSupports
	 * @model opposite="supports" required="true" transient="false"
	 * @generated
	 */
	Service getSupportedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.ServiceGrounding#getSupportedBy <em>Supported By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported By</em>' container reference.
	 * @see #getSupportedBy()
	 * @generated
	 */
	void setSupportedBy(Service value);

} // ServiceGrounding
