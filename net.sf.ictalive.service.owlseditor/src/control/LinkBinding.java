/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.LinkBinding#getToLink <em>To Link</em>}</li>
 *   <li>{@link control.LinkBinding#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getLinkBinding()
 * @model annotation="gmf.link source='origin' target='toLink' target.decoration='arrow' width='2' color='0,0,255'"
 * @generated
 */
public interface LinkBinding extends Binding
{
  /**
	 * Returns the value of the '<em><b>To Link</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Link</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To Link</em>' reference.
	 * @see #setToLink(Link)
	 * @see control.ControlPackage#getLinkBinding_ToLink()
	 * @model
	 * @generated
	 */
  Link getToLink();

  /**
	 * Sets the value of the '{@link control.LinkBinding#getToLink <em>To Link</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Link</em>' reference.
	 * @see #getToLink()
	 * @generated
	 */
  void setToLink(Link value);

  /**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(ValueSpecifier)
	 * @see control.ControlPackage#getLinkBinding_Origin()
	 * @model
	 * @generated
	 */
  ValueSpecifier getOrigin();

  /**
	 * Sets the value of the '{@link control.LinkBinding#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
  void setOrigin(ValueSpecifier value);

} // LinkBinding
