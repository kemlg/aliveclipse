/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Link#getHasBeenWritten <em>Has Been Written</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getLink()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Link extends ProcessVar
{
  /**
	 * Returns the value of the '<em><b>Has Been Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Been Written</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Been Written</em>' attribute.
	 * @see #setHasBeenWritten(Boolean)
	 * @see control.ControlPackage#getLink_HasBeenWritten()
	 * @model
	 * @generated
	 */
  Boolean getHasBeenWritten();

  /**
	 * Sets the value of the '{@link control.Link#getHasBeenWritten <em>Has Been Written</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Been Written</em>' attribute.
	 * @see #getHasBeenWritten()
	 * @generated
	 */
  void setHasBeenWritten(Boolean value);

} // Link
