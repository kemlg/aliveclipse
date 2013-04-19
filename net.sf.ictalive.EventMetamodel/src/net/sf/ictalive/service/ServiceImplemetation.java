/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implemetation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.ServiceImplemetation#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.sf.ictalive.service.ServiceImplemetation#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.ServicePackage#getServiceImplemetation()
 * @model
 * @generated
 */
public interface ServiceImplemetation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.service.ServiceImpLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see net.sf.ictalive.service.ServiceImpLanguage
	 * @see #setLanguage(ServiceImpLanguage)
	 * @see net.sf.ictalive.service.ServicePackage#getServiceImplemetation_Language()
	 * @model
	 * @generated
	 */
	ServiceImpLanguage getLanguage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.ServiceImplemetation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see net.sf.ictalive.service.ServiceImpLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ServiceImpLanguage value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see net.sf.ictalive.service.ServicePackage#getServiceImplemetation_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.ServiceImplemetation#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ServiceImplemetation
