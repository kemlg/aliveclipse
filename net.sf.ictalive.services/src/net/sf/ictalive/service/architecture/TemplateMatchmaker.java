/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Matchmaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.TemplateMatchmaker#getTemplateRepository <em>Template Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getTemplateMatchmaker()
 * @model
 * @generated
 */
public interface TemplateMatchmaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Repository</em>' reference.
	 * @see #setTemplateRepository(TemplateRepository)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getTemplateMatchmaker_TemplateRepository()
	 * @model required="true"
	 * @generated
	 */
	TemplateRepository getTemplateRepository();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.TemplateMatchmaker#getTemplateRepository <em>Template Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Repository</em>' reference.
	 * @see #getTemplateRepository()
	 * @generated
	 */
	void setTemplateRepository(TemplateRepository value);

} // TemplateMatchmaker
