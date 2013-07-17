/**
 */
package OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.Conditional#getCondition <em>Condition</em>}</li>
 *   <li>{@link OM.Conditional#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends ActionDescription
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' reference.
   * @see #setCondition(StateFormula)
   * @see OM.OMPackage#getConditional_Condition()
   * @model required="true"
   * @generated
   */
  StateFormula getCondition();

  /**
   * Sets the value of the '{@link OM.Conditional#getCondition <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(StateFormula value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(ActionDescription)
   * @see OM.OMPackage#getConditional_Action()
   * @model required="true"
   * @generated
   */
  ActionDescription getAction();

  /**
   * Sets the value of the '{@link OM.Conditional#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ActionDescription value);

} // Conditional
