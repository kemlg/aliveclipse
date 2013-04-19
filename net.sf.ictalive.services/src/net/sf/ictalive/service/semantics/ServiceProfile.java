/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import net.sf.ictalive.service.Service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getPresentedBy <em>Presented By</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasProcess <em>Has Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceProfile#getServiceClassification <em>Service Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile()
 * @model
 * @generated
 */
public interface ServiceProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Presented By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.Service#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presented By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presented By</em>' container reference.
	 * @see #setPresentedBy(Service)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_PresentedBy()
	 * @see net.sf.ictalive.service.Service#getPresents
	 * @model opposite="presents" transient="false"
	 * @generated
	 */
	Service getPresentedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceProfile#getPresentedBy <em>Presented By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presented By</em>' container reference.
	 * @see #getPresentedBy()
	 * @generated
	 */
	void setPresentedBy(Service value);

	/**
	 * Returns the value of the '<em><b>Has Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Process</em>' reference.
	 * @see #setHasProcess(ProcessModel)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_HasProcess()
	 * @model
	 * @generated
	 */
	ProcessModel getHasProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceProfile#getHasProcess <em>Has Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Process</em>' reference.
	 * @see #getHasProcess()
	 * @generated
	 */
	void setHasProcess(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_ServiceCategory()
	 * @model containment="true"
	 * @generated
	 */
	ServiceCategory getServiceCategory();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceProfile#getServiceCategory <em>Service Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' containment reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	void setServiceCategory(ServiceCategory value);

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
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_HasInput()
	 * @model
	 * @generated
	 */
	EList<ServiceInput> getHasInput();

	/**
	 * Returns the value of the '<em><b>Has Output</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_HasOutput()
	 * @model
	 * @generated
	 */
	EList<ServiceOutput> getHasOutput();

	/**
	 * Returns the value of the '<em><b>Has Result</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result</em>' reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_HasResult()
	 * @model
	 * @generated
	 */
	EList<ServiceResult> getHasResult();

	/**
	 * Returns the value of the '<em><b>Has Condition</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Condition</em>' reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_HasCondition()
	 * @model
	 * @generated
	 */
	EList<ServiceCondition> getHasCondition();

	/**
	 * Returns the value of the '<em><b>Service Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Classification</em>' attribute.
	 * @see #setServiceClassification(String)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceProfile_ServiceClassification()
	 * @model
	 * @generated
	 */
	String getServiceClassification();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceProfile#getServiceClassification <em>Service Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Classification</em>' attribute.
	 * @see #getServiceClassification()
	 * @generated
	 */
	void setServiceClassification(String value);

} // ServiceProfile
