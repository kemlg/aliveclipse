/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.ProcessVar#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link control.ProcessVar#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getProcessVar()
 * @model
 * @generated
 */
public interface ProcessVar extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see #setParameterType(String)
	 * @see control.ControlPackage#getProcessVar_ParameterType()
	 * @model
	 * @generated
	 */
  String getParameterType();

  /**
	 * Sets the value of the '{@link control.ProcessVar#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see #getParameterType()
	 * @generated
	 */
  void setParameterType(String value);

  /**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' attribute.
	 * @see #setParameterValue(String)
	 * @see control.ControlPackage#getProcessVar_ParameterValue()
	 * @model
	 * @generated
	 */
  String getParameterValue();

  /**
	 * Sets the value of the '{@link control.ProcessVar#getParameterValue <em>Parameter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value</em>' attribute.
	 * @see #getParameterValue()
	 * @generated
	 */
  void setParameterValue(String value);

} // ProcessVar
