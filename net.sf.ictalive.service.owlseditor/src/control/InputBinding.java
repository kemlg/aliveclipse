/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.InputBinding#getToParam <em>To Param</em>}</li>
 *   <li>{@link control.InputBinding#getValueSource <em>Value Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getInputBinding()
 * @model annotation="gmf.link source='valueSource' target='toParam' target.decoration='arrow' width='2' color='120,181,0'"
 * @generated
 */
public interface InputBinding extends Binding
{
  /**
	 * Returns the value of the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To Param</em>' reference.
	 * @see #setToParam(Input)
	 * @see control.ControlPackage#getInputBinding_ToParam()
	 * @model
	 * @generated
	 */
  Input getToParam();

  /**
	 * Sets the value of the '{@link control.InputBinding#getToParam <em>To Param</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Param</em>' reference.
	 * @see #getToParam()
	 * @generated
	 */
  void setToParam(Input value);

  /**
	 * Returns the value of the '<em><b>Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Source</em>' reference.
	 * @see #setValueSource(Parameter)
	 * @see control.ControlPackage#getInputBinding_ValueSource()
	 * @model
	 * @generated
	 */
  Parameter getValueSource();

  /**
	 * Sets the value of the '{@link control.InputBinding#getValueSource <em>Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Source</em>' reference.
	 * @see #getValueSource()
	 * @generated
	 */
  void setValueSource(Parameter value);

} // InputBinding
