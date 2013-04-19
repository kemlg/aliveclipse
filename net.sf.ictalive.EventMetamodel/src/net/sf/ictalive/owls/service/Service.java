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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.Service#getPresents <em>Presents</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.Service#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.Service#getSupports <em>Supports</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.Service#getProvidedBy <em>Provided By</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.service.ServicePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
	/**
	 * Returns the value of the '<em><b>Presents</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.service.ServiceProfile}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.ServiceProfile#getPresentedBy <em>Presented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presents</em>' containment reference list.
	 * @see net.sf.ictalive.owls.service.ServicePackage#getService_Presents()
	 * @see net.sf.ictalive.owls.service.ServiceProfile#getPresentedBy
	 * @model opposite="presentedBy" containment="true"
	 * @generated
	 */
	EList<ServiceProfile> getPresents();

	/**
	 * Returns the value of the '<em><b>Described By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.ServiceModel#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described By</em>' containment reference.
	 * @see #setDescribedBy(ServiceModel)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getService_DescribedBy()
	 * @see net.sf.ictalive.owls.service.ServiceModel#getDescribes
	 * @model opposite="describes" containment="true"
	 * @generated
	 */
	ServiceModel getDescribedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.Service#getDescribedBy <em>Described By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described By</em>' containment reference.
	 * @see #getDescribedBy()
	 * @generated
	 */
	void setDescribedBy(ServiceModel value);

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.ServiceGrounding#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference.
	 * @see #setSupports(ServiceGrounding)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getService_Supports()
	 * @see net.sf.ictalive.owls.service.ServiceGrounding#getSupportedBy
	 * @model opposite="supportedBy" containment="true"
	 * @generated
	 */
	ServiceGrounding getSupports();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.Service#getSupports <em>Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports</em>' containment reference.
	 * @see #getSupports()
	 * @generated
	 */
	void setSupports(ServiceGrounding value);

	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.service.ServiceProvider}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.ServiceProvider#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By</em>' reference list.
	 * @see net.sf.ictalive.owls.service.ServicePackage#getService_ProvidedBy()
	 * @see net.sf.ictalive.owls.service.ServiceProvider#getProvides
	 * @model opposite="provides"
	 * @generated
	 */
	EList<ServiceProvider> getProvidedBy();

} // Service
