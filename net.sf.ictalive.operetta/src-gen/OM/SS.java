/**
 */
package OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.SS#getRoles <em>Roles</em>}</li>
 *   <li>{@link OM.SS#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link OM.SS#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getSS()
 * @model
 * @generated
 */
public interface SS extends EObject
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link OM.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see OM.OMPackage#getSS_Roles()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
   * The list contents are of type {@link OM.Objective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objectives</em>' containment reference list.
   * @see OM.OMPackage#getSS_Objectives()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<Objective> getObjectives();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link OM.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see OM.OMPackage#getSS_Dependencies()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<Dependency> getDependencies();

} // SS
