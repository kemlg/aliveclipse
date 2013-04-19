/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.service.semantics.ServiceParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.ServiceTemplate#getFlow <em>Flow</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.ServiceTemplate#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.ServiceTemplate#getExpose <em>Expose</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.ServiceTemplate#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.ServiceTemplate#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getServiceTemplate()
 * @model
 * @generated
 */
public interface ServiceTemplate extends EObject
{
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference.
	 * @see #setFlow(TemplateFlow)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getServiceTemplate_Flow()
	 * @model containment="true"
	 * @generated
	 */
	TemplateFlow getFlow();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.ServiceTemplate#getFlow <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' containment reference.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(TemplateFlow value);

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference list.
	 * @see net.sf.ictalive.service.template.TemplatePackage#getServiceTemplate_TemplateParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Expose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose</em>' containment reference.
	 * @see #setExpose(AbstractProcessModel)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getServiceTemplate_Expose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractProcessModel getExpose();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.ServiceTemplate#getExpose <em>Expose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose</em>' containment reference.
	 * @see #getExpose()
	 * @generated
	 */
	void setExpose(AbstractProcessModel value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.template.TemplateConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see net.sf.ictalive.service.template.TemplatePackage#getServiceTemplate_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getServiceTemplate_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.ServiceTemplate#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // ServiceTemplate
