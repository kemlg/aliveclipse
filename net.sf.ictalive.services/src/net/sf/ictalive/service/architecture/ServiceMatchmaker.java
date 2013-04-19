/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Matchmaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceMatchmaker#getServiceDirectory <em>Service Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceMatchmaker()
 * @model
 * @generated
 */
public interface ServiceMatchmaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Directory</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.architecture.ServiceDirectory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Directory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Directory</em>' reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceMatchmaker_ServiceDirectory()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceDirectory> getServiceDirectory();

} // ServiceMatchmaker
