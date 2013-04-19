/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.RepeatUntil#getUntilCondition <em>Until Condition</em>}</li>
 *   <li>{@link control.RepeatUntil#getUntilProcess <em>Until Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getRepeatUntil()
 * @model
 * @generated
 */
public interface RepeatUntil extends ControlConstruct
{
  /**
	 * Returns the value of the '<em><b>Until Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Until Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Condition</em>' containment reference.
	 * @see #setUntilCondition(Expr)
	 * @see control.ControlPackage#getRepeatUntil_UntilCondition()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  Expr getUntilCondition();

  /**
	 * Sets the value of the '{@link control.RepeatUntil#getUntilCondition <em>Until Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Condition</em>' containment reference.
	 * @see #getUntilCondition()
	 * @generated
	 */
  void setUntilCondition(Expr value);

  /**
	 * Returns the value of the '<em><b>Until Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Until Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Process</em>' containment reference.
	 * @see #setUntilProcess(ControlConstruct)
	 * @see control.ControlPackage#getRepeatUntil_UntilProcess()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstruct getUntilProcess();

  /**
	 * Sets the value of the '{@link control.RepeatUntil#getUntilProcess <em>Until Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Process</em>' containment reference.
	 * @see #getUntilProcess()
	 * @generated
	 */
  void setUntilProcess(ControlConstruct value);

} // RepeatUntil
