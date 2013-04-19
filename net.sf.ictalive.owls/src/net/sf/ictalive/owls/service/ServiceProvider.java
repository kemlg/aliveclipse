/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.ServiceProvider#getProvides <em>Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.service.Service}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.Service#getProvidedBy <em>Provided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceProvider_Provides()
	 * @see net.sf.ictalive.owls.service.Service#getProvidedBy
	 * @model opposite="providedBy"
	 * @generated
	 */
	EList<Service> getProvides();

} // ServiceProvider
