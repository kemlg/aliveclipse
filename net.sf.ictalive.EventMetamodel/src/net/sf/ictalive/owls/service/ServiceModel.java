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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.ServiceModel#getDescribes <em>Describes</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.ServiceModel#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.ServiceModel#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceModel()
 * @model
 * @generated
 */
public interface ServiceModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Describes</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.service.Service#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' container reference.
	 * @see #setDescribes(Service)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceModel_Describes()
	 * @see net.sf.ictalive.owls.service.Service#getDescribedBy
	 * @model opposite="describedBy" transient="false"
	 * @generated
	 */
	Service getDescribes();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.ServiceModel#getDescribes <em>Describes</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describes</em>' container reference.
	 * @see #getDescribes()
	 * @generated
	 */
	void setDescribes(Service value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceModel_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.ServiceModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see net.sf.ictalive.owls.service.ServicePackage#getServiceModel_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.service.ServiceModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // ServiceModel
