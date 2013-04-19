/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import net.sf.ictalive.service.template.GroundTemplate;
import net.sf.ictalive.service.template.ServiceTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.TemplateRepository#getTemplate <em>Template</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.TemplateRepository#getGroundTemplate <em>Ground Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getTemplateRepository()
 * @model
 * @generated
 */
public interface TemplateRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.template.ServiceTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getTemplateRepository_Template()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceTemplate> getTemplate();

	/**
	 * Returns the value of the '<em><b>Ground Template</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.template.GroundTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Template</em>' containment reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getTemplateRepository_GroundTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroundTemplate> getGroundTemplate();

} // TemplateRepository
