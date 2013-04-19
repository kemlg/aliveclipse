/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loc Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.LocBinding#getToLoc <em>To Loc</em>}</li>
 *   <li>{@link control.LocBinding#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getLocBinding()
 * @model annotation="gmf.link source='origin' target='toLoc' target.decoration='arrow' width='2' color='0,0,255'"
 * @generated
 */
public interface LocBinding extends SetBinding
{
  /**
	 * Returns the value of the '<em><b>To Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Loc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To Loc</em>' reference.
	 * @see #setToLoc(Loc)
	 * @see control.ControlPackage#getLocBinding_ToLoc()
	 * @model
	 * @generated
	 */
  Loc getToLoc();

  /**
	 * Sets the value of the '{@link control.LocBinding#getToLoc <em>To Loc</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Loc</em>' reference.
	 * @see #getToLoc()
	 * @generated
	 */
  void setToLoc(Loc value);

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
	 * @see control.ControlPackage#getLocBinding_Origin()
	 * @model
	 * @generated
	 */
  ValueSpecifier getOrigin();

  /**
	 * Sets the value of the '{@link control.LocBinding#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
  void setOrigin(ValueSpecifier value);

} // LocBinding
