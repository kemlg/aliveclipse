/**
 */
package OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.Role#getName <em>Name</em>}</li>
 *   <li>{@link OM.Role#getConceptName <em>Concept Name</em>}</li>
 *   <li>{@link OM.Role#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link OM.Role#getNorms <em>Norms</em>}</li>
 *   <li>{@link OM.Role#getRights <em>Rights</em>}</li>
 *   <li>{@link OM.Role#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link OM.Role#getDependantOn <em>Dependant On</em>}</li>
 *   <li>{@link OM.Role#getDependeeIn <em>Dependee In</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject
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
   * @see #isSetName()
   * @see #unsetName()
   * @see #setName(String)
   * @see OM.OMPackage#getRole_Name()
   * @model unique="false" unsettable="true" id="true" required="true" derived="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link OM.Role#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #isSetName()
   * @see #unsetName()
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Unsets the value of the '{@link OM.Role#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetName()
   * @see #getName()
   * @see #setName(String)
   * @generated
   */
  void unsetName();

  /**
   * Returns whether the value of the '{@link OM.Role#getName <em>Name</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Name</em>' attribute is set.
   * @see #unsetName()
   * @see #getName()
   * @see #setName(String)
   * @generated
   */
  boolean isSetName();

  /**
   * Returns the value of the '<em><b>Concept Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept Name</em>' reference.
   * @see #setConceptName(Concept)
   * @see OM.OMPackage#getRole_ConceptName()
   * @model keys="concept" required="true"
   * @generated
   */
  Concept getConceptName();

  /**
   * Sets the value of the '{@link OM.Role#getConceptName <em>Concept Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept Name</em>' reference.
   * @see #getConceptName()
   * @generated
   */
  void setConceptName(Concept value);

  /**
   * Returns the value of the '<em><b>Objectives</b></em>' reference list.
   * The list contents are of type {@link OM.Objective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objectives</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objectives</em>' reference list.
   * @see OM.OMPackage#getRole_Objectives()
   * @model required="true"
   * @generated
   */
  EList<Objective> getObjectives();

  /**
   * Returns the value of the '<em><b>Norms</b></em>' reference list.
   * The list contents are of type {@link OM.Norm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Norms</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Norms</em>' reference list.
   * @see OM.OMPackage#getRole_Norms()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<Norm> getNorms();

  /**
   * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
   * The list contents are of type {@link OM.Right}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rights</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rights</em>' containment reference list.
   * @see OM.OMPackage#getRole_Rights()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Right> getRights();

  /**
   * Returns the value of the '<em><b>Role Type</b></em>' attribute.
   * The literals are from the enumeration {@link OM.RoleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Type</em>' attribute.
   * @see OM.RoleType
   * @see #setRoleType(RoleType)
   * @see OM.OMPackage#getRole_RoleType()
   * @model unique="false" required="true"
   * @generated
   */
  RoleType getRoleType();

  /**
   * Sets the value of the '{@link OM.Role#getRoleType <em>Role Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role Type</em>' attribute.
   * @see OM.RoleType
   * @see #getRoleType()
   * @generated
   */
  void setRoleType(RoleType value);

  /**
   * Returns the value of the '<em><b>Dependant On</b></em>' reference list.
   * The list contents are of type {@link OM.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependant On</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependant On</em>' reference list.
   * @see OM.OMPackage#getRole_DependantOn()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<Dependency> getDependantOn();

  /**
   * Returns the value of the '<em><b>Dependee In</b></em>' reference list.
   * The list contents are of type {@link OM.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependee In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependee In</em>' reference list.
   * @see OM.OMPackage#getRole_DependeeIn()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<Dependency> getDependeeIn();

} // Role
