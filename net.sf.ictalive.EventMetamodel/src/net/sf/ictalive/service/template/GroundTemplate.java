/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.service.Service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.GroundTemplate#getImplement <em>Implement</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.GroundTemplate#getBindTemplateParameter <em>Bind Template Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.GroundTemplate#getBindProcessModel <em>Bind Process Model</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.GroundTemplate#getExpose <em>Expose</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.GroundTemplate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getGroundTemplate()
 * @model
 * @generated
 */
public interface GroundTemplate extends EObject
{
	/**
	 * Returns the value of the '<em><b>Implement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implement</em>' reference.
	 * @see #setImplement(ServiceTemplate)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getGroundTemplate_Implement()
	 * @model
	 * @generated
	 */
	ServiceTemplate getImplement();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.GroundTemplate#getImplement <em>Implement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implement</em>' reference.
	 * @see #getImplement()
	 * @generated
	 */
	void setImplement(ServiceTemplate value);

	/**
	 * Returns the value of the '<em><b>Bind Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.template.BoundTemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Template Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Template Parameter</em>' containment reference list.
	 * @see net.sf.ictalive.service.template.TemplatePackage#getGroundTemplate_BindTemplateParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundTemplateParameter> getBindTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Bind Process Model</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.template.BoundProcessModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Process Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Process Model</em>' containment reference list.
	 * @see net.sf.ictalive.service.template.TemplatePackage#getGroundTemplate_BindProcessModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundProcessModel> getBindProcessModel();

	/**
	 * Returns the value of the '<em><b>Expose</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.Service#getAdaptedBy <em>Adapted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose</em>' reference.
	 * @see #setExpose(Service)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getGroundTemplate_Expose()
	 * @see net.sf.ictalive.service.Service#getAdaptedBy
	 * @model opposite="adaptedBy" required="true"
	 * @generated
	 */
	Service getExpose();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.GroundTemplate#getExpose <em>Expose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose</em>' reference.
	 * @see #getExpose()
	 * @generated
	 */
	void setExpose(Service value);

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
	 * @see net.sf.ictalive.service.template.TemplatePackage#getGroundTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.GroundTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GroundTemplate
