/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Head#getHeadLiteral <em>Head Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getHead()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Head extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Head Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Literal</em>' attribute.
   * @see #setHeadLiteral(String)
   * @see control.ControlPackage#getHead_HeadLiteral()
   * @model
   * @generated
   */
  String getHeadLiteral();

  /**
   * Sets the value of the '{@link control.Head#getHeadLiteral <em>Head Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head Literal</em>' attribute.
   * @see #getHeadLiteral()
   * @generated
   */
  void setHeadLiteral(String value);

} // Head
