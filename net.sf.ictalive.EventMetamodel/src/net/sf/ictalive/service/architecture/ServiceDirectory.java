/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import net.sf.ictalive.service.semantics.ServiceProfile;

import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.InterfaceDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceDirectory#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceDirectory#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceDirectory#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceDirectory()
 * @model
 * @generated
 */
public interface ServiceDirectory extends EObject
{
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.Endpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceDirectory_Endpoint()
	 * @model
	 * @generated
	 */
	EList<Endpoint> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Semantic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic</em>' reference.
	 * @see #setSemantic(ServiceProfile)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceDirectory_Semantic()
	 * @model
	 * @generated
	 */
	ServiceProfile getSemantic();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.ServiceDirectory#getSemantic <em>Semantic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic</em>' reference.
	 * @see #getSemantic()
	 * @generated
	 */
	void setSemantic(ServiceProfile value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.InterfaceDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceDirectory_Interface()
	 * @model
	 * @generated
	 */
	EList<InterfaceDescription> getInterface();

} // ServiceDirectory
