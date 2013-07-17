/**
 */
package OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.Variable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Term
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see OM.OMPackage#getVariable_Name()
   * @model unique="false" id="true" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link OM.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Variable
