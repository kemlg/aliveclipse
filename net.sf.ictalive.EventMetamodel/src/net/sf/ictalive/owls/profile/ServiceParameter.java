/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.profile.ServiceParameter#getServiceParameterName <em>Service Parameter Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.ServiceParameter#getSParameter <em>SParameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceParameter()
 * @model
 * @generated
 */
public interface ServiceParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Service Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Parameter Name</em>' attribute.
	 * @see #setServiceParameterName(Object)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceParameter_ServiceParameterName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getServiceParameterName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.ServiceParameter#getServiceParameterName <em>Service Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Parameter Name</em>' attribute.
	 * @see #getServiceParameterName()
	 * @generated
	 */
	void setServiceParameterName(Object value);

	/**
	 * Returns the value of the '<em><b>SParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SParameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SParameter</em>' reference.
	 * @see #setSParameter(EObject)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceParameter_SParameter()
	 * @model required="true"
	 * @generated
	 */
	EObject getSParameter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.ServiceParameter#getSParameter <em>SParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SParameter</em>' reference.
	 * @see #getSParameter()
	 * @generated
	 */
	void setSParameter(EObject value);

} // ServiceParameter
