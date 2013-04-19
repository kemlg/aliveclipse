/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.service.semantics.ProcessModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Process Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.BoundProcessModel#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.BoundProcessModel#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getBoundProcessModel()
 * @model
 * @generated
 */
public interface BoundProcessModel extends EObject
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
	 * @see #setAbstract(AbstractProcessModel)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getBoundProcessModel_Abstract()
	 * @model required="true"
	 * @generated
	 */
	AbstractProcessModel getAbstract();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.BoundProcessModel#getAbstract <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractProcessModel value);

	/**
	 * Returns the value of the '<em><b>Concrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete</em>' reference.
	 * @see #setConcrete(ProcessModel)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getBoundProcessModel_Concrete()
	 * @model required="true"
	 * @generated
	 */
	ProcessModel getConcrete();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.BoundProcessModel#getConcrete <em>Concrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete</em>' reference.
	 * @see #getConcrete()
	 * @generated
	 */
	void setConcrete(ProcessModel value);

} // BoundProcessModel
