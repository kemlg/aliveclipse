/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.InnerProcess#getName <em>Name</em>}</li>
 *   <li>{@link control.InnerProcess#getRemoteURI <em>Remote URI</em>}</li>
 *   <li>{@link control.InnerProcess#getSlotName <em>Slot Name</em>}</li>
 *   <li>{@link control.InnerProcess#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link control.InnerProcess#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link control.InnerProcess#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link control.InnerProcess#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getInnerProcess()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface InnerProcess extends EObject
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
   * @see control.ControlPackage#getInnerProcess_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link control.InnerProcess#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Remote URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote URI</em>' attribute.
   * @see #setRemoteURI(String)
   * @see control.ControlPackage#getInnerProcess_RemoteURI()
   * @model
   * @generated
   */
  String getRemoteURI();

  /**
   * Sets the value of the '{@link control.InnerProcess#getRemoteURI <em>Remote URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote URI</em>' attribute.
   * @see #getRemoteURI()
   * @generated
   */
  void setRemoteURI(String value);

  /**
   * Returns the value of the '<em><b>Slot Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slot Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slot Name</em>' attribute.
   * @see #setSlotName(String)
   * @see control.ControlPackage#getInnerProcess_SlotName()
   * @model
   * @generated
   */
  String getSlotName();

  /**
   * Sets the value of the '{@link control.InnerProcess#getSlotName <em>Slot Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slot Name</em>' attribute.
   * @see #getSlotName()
   * @generated
   */
  void setSlotName(String value);

  /**
   * Returns the value of the '<em><b>Has Input</b></em>' containment reference list.
   * The list contents are of type {@link control.Input}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Input</em>' containment reference list.
   * @see control.ControlPackage#getInnerProcess_HasInput()
   * @model containment="true"
   *        annotation="gmf.affixed foo='bar'"
   * @generated
   */
  EList<Input> getHasInput();

  /**
   * Returns the value of the '<em><b>Has Output</b></em>' containment reference list.
   * The list contents are of type {@link control.Output}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Output</em>' containment reference list.
   * @see control.ControlPackage#getInnerProcess_HasOutput()
   * @model containment="true"
   *        annotation="gmf.affixed foo='bar'"
   * @generated
   */
  EList<Output> getHasOutput();

  /**
   * Returns the value of the '<em><b>Has Result</b></em>' containment reference list.
   * The list contents are of type {@link control.Result}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Result</em>' containment reference list.
   * @see control.ControlPackage#getInnerProcess_HasResult()
   * @model containment="true"
   *        annotation="gmf.affixed foo='bar'"
   * @generated
   */
  EList<Result> getHasResult();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link control.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see control.ControlPackage#getInnerProcess_Expressions()
   * @model containment="true"
   *        annotation="gmf.affixed foo='bar'"
   * @generated
   */
  EList<Expr> getExpressions();

} // InnerProcess
