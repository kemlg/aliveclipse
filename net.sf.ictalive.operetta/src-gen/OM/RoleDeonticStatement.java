/**
 */
package OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Deontic Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.RoleDeonticStatement#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getRoleDeonticStatement()
 * @model
 * @generated
 */
public interface RoleDeonticStatement extends DeonticStatement
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see OM.OMPackage#getRoleDeonticStatement_Role()
   * @model required="true"
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link OM.RoleDeonticStatement#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

} // RoleDeonticStatement
