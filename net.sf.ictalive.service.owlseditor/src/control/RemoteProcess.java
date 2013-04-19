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
 * A representation of the model object '<em><b>Remote Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.RemoteProcess#getRemoteURI <em>Remote URI</em>}</li>
 *   <li>{@link control.RemoteProcess#getRemoteURL <em>Remote URL</em>}</li>
 *   <li>{@link control.RemoteProcess#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link control.RemoteProcess#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getRemoteProcess()
 * @model
 * @generated
 */
public interface RemoteProcess extends AbstractProcess
{
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
	 * @see control.ControlPackage#getRemoteProcess_RemoteURI()
	 * @model
	 * @generated
	 */
  String getRemoteURI();

  /**
	 * Sets the value of the '{@link control.RemoteProcess#getRemoteURI <em>Remote URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote URI</em>' attribute.
	 * @see #getRemoteURI()
	 * @generated
	 */
  void setRemoteURI(String value);

  /**
	 * Returns the value of the '<em><b>Remote URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote URL</em>' attribute.
	 * @see #setRemoteURL(String)
	 * @see control.ControlPackage#getRemoteProcess_RemoteURL()
	 * @model
	 * @generated
	 */
  String getRemoteURL();

  /**
	 * Sets the value of the '{@link control.RemoteProcess#getRemoteURL <em>Remote URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote URL</em>' attribute.
	 * @see #getRemoteURL()
	 * @generated
	 */
  void setRemoteURL(String value);

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
	 * @see control.ControlPackage#getRemoteProcess_HasResult()
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
	 * @see control.ControlPackage#getRemoteProcess_Expressions()
	 * @model containment="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
  EList<Expr> getExpressions();

} // RemoteProcess
