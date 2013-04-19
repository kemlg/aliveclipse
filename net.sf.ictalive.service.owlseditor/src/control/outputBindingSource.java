/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>output Binding Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.outputBindingSource#getSource <em>Source</em>}</li>
 *   <li>{@link control.outputBindingSource#getSpecifierElement <em>Specifier Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getoutputBindingSource()
 * @model annotation="gmf.link source='source' target='specifierElement' style='dash' target.decoration='arrow' width='2' color='255,0,0'"
 * @generated
 */
public interface outputBindingSource extends Binding
{
  /**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Parameter)
	 * @see control.ControlPackage#getoutputBindingSource_Source()
	 * @model
	 * @generated
	 */
  Parameter getSource();

  /**
	 * Sets the value of the '{@link control.outputBindingSource#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(Parameter value);

  /**
	 * Returns the value of the '<em><b>Specifier Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifier Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifier Element</em>' reference.
	 * @see #setSpecifierElement(ValueSpecifierElement)
	 * @see control.ControlPackage#getoutputBindingSource_SpecifierElement()
	 * @model
	 * @generated
	 */
  ValueSpecifierElement getSpecifierElement();

  /**
	 * Sets the value of the '{@link control.outputBindingSource#getSpecifierElement <em>Specifier Element</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifier Element</em>' reference.
	 * @see #getSpecifierElement()
	 * @generated
	 */
  void setSpecifierElement(ValueSpecifierElement value);

} // outputBindingSource
