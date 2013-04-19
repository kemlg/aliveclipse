/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.RepeatWhile#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link control.RepeatWhile#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getRepeatWhile()
 * @model
 * @generated
 */
public interface RepeatWhile extends ControlConstruct
{
  /**
	 * Returns the value of the '<em><b>While Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' containment reference.
	 * @see #setWhileCondition(Expr)
	 * @see control.ControlPackage#getRepeatWhile_WhileCondition()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  Expr getWhileCondition();

  /**
	 * Sets the value of the '{@link control.RepeatWhile#getWhileCondition <em>While Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' containment reference.
	 * @see #getWhileCondition()
	 * @generated
	 */
  void setWhileCondition(Expr value);

  /**
	 * Returns the value of the '<em><b>While Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>While Process</em>' containment reference.
	 * @see #setWhileProcess(ControlConstruct)
	 * @see control.ControlPackage#getRepeatWhile_WhileProcess()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstruct getWhileProcess();

  /**
	 * Sets the value of the '{@link control.RepeatWhile#getWhileProcess <em>While Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Process</em>' containment reference.
	 * @see #getWhileProcess()
	 * @generated
	 */
  void setWhileProcess(ControlConstruct value);

} // RepeatWhile
