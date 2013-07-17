/**
 */
package OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.NS#getNorms <em>Norms</em>}</li>
 *   <li>{@link OM.NS#getTransitionNorms <em>Transition Norms</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getNS()
 * @model
 * @generated
 */
public interface NS extends EObject
{
  /**
   * Returns the value of the '<em><b>Norms</b></em>' containment reference list.
   * The list contents are of type {@link OM.Norm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Norms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Norms</em>' containment reference list.
   * @see OM.OMPackage#getNS_Norms()
   * @model containment="true" resolveProxies="true" keys="normID"
   * @generated
   */
  EList<Norm> getNorms();

  /**
   * Returns the value of the '<em><b>Transition Norms</b></em>' containment reference list.
   * The list contents are of type {@link OM.TransitionNorm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Norms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Norms</em>' containment reference list.
   * @see OM.OMPackage#getNS_TransitionNorms()
   * @model containment="true" resolveProxies="true" keys="ID"
   * @generated
   */
  EList<TransitionNorm> getTransitionNorms();

} // NS
