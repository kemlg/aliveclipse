/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import net.sf.ictalive.service.Service;

import net.sf.ictalive.service.syntax.InterfaceDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceGrounding#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceGrounding#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceGrounding#getInterface <em>Interface</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceGrounding#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceGrounding#getBindParams <em>Bind Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceGrounding()
 * @model
 * @generated
 */
public interface ServiceGrounding extends EObject
{
	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.Service#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported By</em>' container reference.
	 * @see #setSupportedBy(Service)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceGrounding_SupportedBy()
	 * @see net.sf.ictalive.service.Service#getSupports
	 * @model opposite="supports" transient="false"
	 * @generated
	 */
	Service getSupportedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getSupportedBy <em>Supported By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported By</em>' container reference.
	 * @see #getSupportedBy()
	 * @generated
	 */
	void setSupportedBy(Service value);

	/**
	 * Returns the value of the '<em><b>Process Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Model</em>' reference.
	 * @see #setProcessModel(ProcessModel)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceGrounding_ProcessModel()
	 * @model
	 * @generated
	 */
	ProcessModel getProcessModel();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getProcessModel <em>Process Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Model</em>' reference.
	 * @see #getProcessModel()
	 * @generated
	 */
	void setProcessModel(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(InterfaceDescription)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceGrounding_Interface()
	 * @model
	 * @generated
	 */
	InterfaceDescription getInterface();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceDescription value);

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
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceGrounding_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceGrounding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bind Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Params</em>' attribute list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceGrounding_BindParams()
	 * @model
	 * @generated
	 */
	EList<String> getBindParams();

} // ServiceGrounding
