/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.service.semantics.ServiceParameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.BoundTemplateParameter#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.BoundTemplateParameter#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getBoundTemplateParameter()
 * @model
 * @generated
 */
public interface BoundTemplateParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' reference.
	 * @see #setAbstract(ServiceParameter)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getBoundTemplateParameter_Abstract()
	 * @model required="true"
	 * @generated
	 */
	ServiceParameter getAbstract();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.BoundTemplateParameter#getAbstract <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(ServiceParameter value);

	/**
	 * Returns the value of the '<em><b>Concrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete</em>' reference.
	 * @see #setConcrete(ServiceParameter)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getBoundTemplateParameter_Concrete()
	 * @model required="true"
	 * @generated
	 */
	ServiceParameter getConcrete();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.BoundTemplateParameter#getConcrete <em>Concrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete</em>' reference.
	 * @see #getConcrete()
	 * @generated
	 */
	void setConcrete(ServiceParameter value);

} // BoundTemplateParameter
