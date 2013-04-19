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
 * A representation of the model object '<em><b>Service Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceFramework#getMatchmaker <em>Matchmaker</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceFramework#getExecution <em>Execution</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceFramework#getServiceDirectory <em>Service Directory</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.ServiceFramework#getTemplateRepository <em>Template Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceFramework()
 * @model
 * @generated
 */
public interface ServiceFramework extends EObject
{
	/**
	 * Returns the value of the '<em><b>Matchmaker</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchmaker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchmaker</em>' containment reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceFramework_Matchmaker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceTemplateMatchmaker> getMatchmaker();

	/**
	 * Returns the value of the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' containment reference.
	 * @see #setExecution(ExecutionFramework)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceFramework_Execution()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionFramework getExecution();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.ServiceFramework#getExecution <em>Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' containment reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(ExecutionFramework value);

	/**
	 * Returns the value of the '<em><b>Service Directory</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.architecture.ServiceDirectory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Directory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Directory</em>' containment reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceFramework_ServiceDirectory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceDirectory> getServiceDirectory();

	/**
	 * Returns the value of the '<em><b>Template Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Repository</em>' containment reference.
	 * @see #setTemplateRepository(TemplateRepository)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getServiceFramework_TemplateRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateRepository getTemplateRepository();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.ServiceFramework#getTemplateRepository <em>Template Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Repository</em>' containment reference.
	 * @see #getTemplateRepository()
	 * @generated
	 */
	void setTemplateRepository(TemplateRepository value);

} // ServiceFramework
