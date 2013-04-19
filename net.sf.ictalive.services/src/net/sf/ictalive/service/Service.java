/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service;

import net.sf.ictalive.service.semantics.ProcessModel;
import net.sf.ictalive.service.semantics.ServiceGrounding;
import net.sf.ictalive.service.semantics.ServiceProfile;

import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.InterfaceDescription;

import net.sf.ictalive.service.template.GroundTemplate;

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
 *   <li>{@link net.sf.ictalive.service.Service#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getInterface <em>Interface</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getPresents <em>Presents</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getSupports <em>Supports</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link net.sf.ictalive.service.Service#getAdaptedBy <em>Adapted By</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.ServicePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.service.ServicePackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see net.sf.ictalive.service.ServicePackage#getService_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.sf.ictalive.service.ServicePackage#getService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.Endpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getService_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Endpoint> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(InterfaceDescription)
	 * @see net.sf.ictalive.service.ServicePackage#getService_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterfaceDescription getInterface();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceDescription value);

	/**
	 * Returns the value of the '<em><b>Presents</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.semantics.ServiceProfile#getPresentedBy <em>Presented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presents</em>' containment reference.
	 * @see #setPresents(ServiceProfile)
	 * @see net.sf.ictalive.service.ServicePackage#getService_Presents()
	 * @see net.sf.ictalive.service.semantics.ServiceProfile#getPresentedBy
	 * @model opposite="presentedBy" containment="true"
	 * @generated
	 */
	ServiceProfile getPresents();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getPresents <em>Presents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presents</em>' containment reference.
	 * @see #getPresents()
	 * @generated
	 */
	void setPresents(ServiceProfile value);

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceGrounding}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference list.
	 * @see net.sf.ictalive.service.ServicePackage#getService_Supports()
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding#getSupportedBy
	 * @model opposite="supportedBy" containment="true"
	 * @generated
	 */
	EList<ServiceGrounding> getSupports();

	/**
	 * Returns the value of the '<em><b>Described By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.semantics.ProcessModel#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described By</em>' containment reference.
	 * @see #setDescribedBy(ProcessModel)
	 * @see net.sf.ictalive.service.ServicePackage#getService_DescribedBy()
	 * @see net.sf.ictalive.service.semantics.ProcessModel#getDescribes
	 * @model opposite="describes" containment="true"
	 * @generated
	 */
	ProcessModel getDescribedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getDescribedBy <em>Described By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described By</em>' containment reference.
	 * @see #getDescribedBy()
	 * @generated
	 */
	void setDescribedBy(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Adapted By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.template.GroundTemplate#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapted By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapted By</em>' reference.
	 * @see #setAdaptedBy(GroundTemplate)
	 * @see net.sf.ictalive.service.ServicePackage#getService_AdaptedBy()
	 * @see net.sf.ictalive.service.template.GroundTemplate#getExpose
	 * @model opposite="expose"
	 * @generated
	 */
	GroundTemplate getAdaptedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.Service#getAdaptedBy <em>Adapted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapted By</em>' reference.
	 * @see #getAdaptedBy()
	 * @generated
	 */
	void setAdaptedBy(GroundTemplate value);

} // Service
