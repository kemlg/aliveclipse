/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.IfThenElse#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link control.IfThenElse#getThen <em>Then</em>}</li>
 *   <li>{@link control.IfThenElse#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends ControlConstruct
{
  /**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Expr)
	 * @see control.ControlPackage#getIfThenElse_IfCondition()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  Expr getIfCondition();

  /**
	 * Sets the value of the '{@link control.IfThenElse#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
  void setIfCondition(Expr value);

  /**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(ControlConstruct)
	 * @see control.ControlPackage#getIfThenElse_Then()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstruct getThen();

  /**
	 * Sets the value of the '{@link control.IfThenElse#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
  void setThen(ControlConstruct value);

  /**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ControlConstruct)
	 * @see control.ControlPackage#getIfThenElse_Else()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstruct getElse();

  /**
	 * Sets the value of the '{@link control.IfThenElse#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
  void setElse(ControlConstruct value);

} // IfThenElse
