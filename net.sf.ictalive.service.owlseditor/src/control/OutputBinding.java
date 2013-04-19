/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.OutputBinding#getToParam <em>To Param</em>}</li>
 *   <li>{@link control.OutputBinding#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getOutputBinding()
 * @model annotation="gmf.link source='origin' target='toParam' target.decoration='arrow' width='2' color='255,0,0'"
 * @generated
 */
public interface OutputBinding extends Binding
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
	 * @see #setToParam(Output)
	 * @see control.ControlPackage#getOutputBinding_ToParam()
	 * @model
	 * @generated
	 */
  Output getToParam();

  /**
	 * Sets the value of the '{@link control.OutputBinding#getToParam <em>To Param</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Param</em>' reference.
	 * @see #getToParam()
	 * @generated
	 */
  void setToParam(Output value);

  /**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(ValueSpecifier)
	 * @see control.ControlPackage#getOutputBinding_Origin()
	 * @model
	 * @generated
	 */
  ValueSpecifier getOrigin();

  /**
	 * Sets the value of the '{@link control.OutputBinding#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
  void setOrigin(ValueSpecifier value);

} // OutputBinding
