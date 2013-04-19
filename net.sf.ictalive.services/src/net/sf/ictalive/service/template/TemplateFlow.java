/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.TemplateFlow#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getTemplateFlow()
 * @model
 * @generated
 */
public interface TemplateFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.template.ControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see net.sf.ictalive.service.template.TemplatePackage#getTemplateFlow_ComposedOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlConstruct> getComposedOf();

} // TemplateFlow
