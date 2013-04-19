/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.Choice#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends ControlConstruct
{
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ControlConstructBag)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getChoice_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlConstructBag getComponents();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.Choice#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(ControlConstructBag value);

} // Choice
