/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.service.semantics.ServiceParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.Perform#getPartnerProcess <em>Partner Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.Perform#getHasDataFromProcess <em>Has Data From Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.Perform#getValueData <em>Value Data</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.Perform#getHasDataFromTemplate <em>Has Data From Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getPerform()
 * @model
 * @generated
 */
public interface Perform extends ControlConstruct {
	/**
	 * Returns the value of the '<em><b>Partner Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Process</em>' containment reference.
	 * @see #setPartnerProcess(AbstractProcessModel)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getPerform_PartnerProcess()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractProcessModel getPartnerProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.Perform#getPartnerProcess <em>Partner Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Process</em>' containment reference.
	 * @see #getPartnerProcess()
	 * @generated
	 */
	void setPartnerProcess(AbstractProcessModel value);

	/**
	 * Returns the value of the '<em><b>Has Data From Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Data From Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Data From Process</em>' reference.
	 * @see #setHasDataFromProcess(AbstractProcessModel)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getPerform_HasDataFromProcess()
	 * @model
	 * @generated
	 */
	AbstractProcessModel getHasDataFromProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.Perform#getHasDataFromProcess <em>Has Data From Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Data From Process</em>' reference.
	 * @see #getHasDataFromProcess()
	 * @generated
	 */
	void setHasDataFromProcess(AbstractProcessModel value);

	/**
	 * Returns the value of the '<em><b>Value Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Data</em>' reference.
	 * @see #setValueData(ServiceParameter)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getPerform_ValueData()
	 * @model
	 * @generated
	 */
	ServiceParameter getValueData();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.Perform#getValueData <em>Value Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Data</em>' reference.
	 * @see #getValueData()
	 * @generated
	 */
	void setValueData(ServiceParameter value);

	/**
	 * Returns the value of the '<em><b>Has Data From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Data From Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Data From Template</em>' reference.
	 * @see #setHasDataFromTemplate(ServiceTemplate)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getPerform_HasDataFromTemplate()
	 * @model
	 * @generated
	 */
	ServiceTemplate getHasDataFromTemplate();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.Perform#getHasDataFromTemplate <em>Has Data From Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Data From Template</em>' reference.
	 * @see #getHasDataFromTemplate()
	 * @generated
	 */
	void setHasDataFromTemplate(ServiceTemplate value);

} // Perform
