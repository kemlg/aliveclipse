/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Produce#getProducedBindingValueSpecifier <em>Produced Binding Value Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getProduce()
 * @model
 * @generated
 */
public interface Produce extends ControlConstruct
{
  /**
	 * Returns the value of the '<em><b>Produced Binding Value Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produced Binding Value Specifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Binding Value Specifier</em>' containment reference.
	 * @see #setProducedBindingValueSpecifier(ValueSpecifierElement)
	 * @see control.ControlPackage#getProduce_ProducedBindingValueSpecifier()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ValueSpecifierElement getProducedBindingValueSpecifier();

  /**
	 * Sets the value of the '{@link control.Produce#getProducedBindingValueSpecifier <em>Produced Binding Value Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced Binding Value Specifier</em>' containment reference.
	 * @see #getProducedBindingValueSpecifier()
	 * @generated
	 */
  void setProducedBindingValueSpecifier(ValueSpecifierElement value);

} // Produce
