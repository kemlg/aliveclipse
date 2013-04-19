/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Result#getInCondition <em>In Condition</em>}</li>
 *   <li>{@link control.Result#getHasResultVar <em>Has Result Var</em>}</li>
 *   <li>{@link control.Result#getHasEffect <em>Has Effect</em>}</li>
 *   <li>{@link control.Result#getBindingSource <em>Binding Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getResult()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Result extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>In Condition</b></em>' containment reference list.
	 * The list contents are of type {@link control.Expr}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>In Condition</em>' containment reference list.
	 * @see control.ControlPackage#getResult_InCondition()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  EList<Expr> getInCondition();

  /**
	 * Returns the value of the '<em><b>Has Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Result Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result Var</em>' containment reference.
	 * @see #setHasResultVar(ResultVar)
	 * @see control.ControlPackage#getResult_HasResultVar()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ResultVar getHasResultVar();

  /**
	 * Sets the value of the '{@link control.Result#getHasResultVar <em>Has Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Result Var</em>' containment reference.
	 * @see #getHasResultVar()
	 * @generated
	 */
  void setHasResultVar(ResultVar value);

  /**
	 * Returns the value of the '<em><b>Has Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Effect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Effect</em>' containment reference.
	 * @see #setHasEffect(Expr)
	 * @see control.ControlPackage#getResult_HasEffect()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  Expr getHasEffect();

  /**
	 * Sets the value of the '{@link control.Result#getHasEffect <em>Has Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Effect</em>' containment reference.
	 * @see #getHasEffect()
	 * @generated
	 */
  void setHasEffect(Expr value);

  /**
	 * Returns the value of the '<em><b>Binding Source</b></em>' containment reference list.
	 * The list contents are of type {@link control.ValueSpecifierElement}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding Source</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Source</em>' containment reference list.
	 * @see control.ControlPackage#getResult_BindingSource()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  EList<ValueSpecifierElement> getBindingSource();

} // Result
