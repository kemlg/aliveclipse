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
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.ServiceProfile#getPresentedBy <em>Presented By</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceProfile()
 * @model
 * @generated
 */
public interface ServiceProfile extends EObject
{
	/**
	 * Returns the value of the '<em><b>Presented By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.Service#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presented By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presented By</em>' container reference.
	 * @see #setPresentedBy(Service)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceProfile_PresentedBy()
	 * @see net.sf.ictalive.owls.service.Service#getPresents
	 * @model opposite="presents" transient="false"
	 * @generated
	 */
	Service getPresentedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.ServiceProfile#getPresentedBy <em>Presented By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presented By</em>' container reference.
	 * @see #getPresentedBy()
	 * @generated
	 */
	void setPresentedBy(Service value);

} // ServiceProfile
