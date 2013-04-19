/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.TemplateConstraint#getAspCode <em>Asp Code</em>}</li>
 *   <li>{@link control.TemplateConstraint#getAspBinding <em>Asp Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getTemplateConstraint()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface TemplateConstraint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Asp Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asp Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asp Code</em>' attribute.
	 * @see #setAspCode(String)
	 * @see control.ControlPackage#getTemplateConstraint_AspCode()
	 * @model
	 * @generated
	 */
	String getAspCode();

	/**
	 * Sets the value of the '{@link control.TemplateConstraint#getAspCode <em>Asp Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asp Code</em>' attribute.
	 * @see #getAspCode()
	 * @generated
	 */
	void setAspCode(String value);

	/**
	 * Returns the value of the '<em><b>Asp Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asp Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asp Binding</em>' attribute.
	 * @see #setAspBinding(String)
	 * @see control.ControlPackage#getTemplateConstraint_AspBinding()
	 * @model
	 * @generated
	 */
	String getAspBinding();

	/**
	 * Sets the value of the '{@link control.TemplateConstraint#getAspBinding <em>Asp Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asp Binding</em>' attribute.
	 * @see #getAspBinding()
	 * @generated
	 */
	void setAspBinding(String value);

} // TemplateConstraint
