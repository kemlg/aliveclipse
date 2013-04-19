/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Body#getBodyLiteral <em>Body Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getBody()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Body extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Body Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Literal</em>' attribute.
	 * @see #setBodyLiteral(String)
	 * @see control.ControlPackage#getBody_BodyLiteral()
	 * @model
	 * @generated
	 */
  String getBodyLiteral();

  /**
	 * Sets the value of the '{@link control.Body#getBodyLiteral <em>Body Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Literal</em>' attribute.
	 * @see #getBodyLiteral()
	 * @generated
	 */
  void setBodyLiteral(String value);

} // Body
