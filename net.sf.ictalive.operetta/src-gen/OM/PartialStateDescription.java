/**
 */
package OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial State Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.PartialStateDescription#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getPartialStateDescription()
 * @model abstract="true"
 * @generated
 */
public interface PartialStateDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see OM.OMPackage#getPartialStateDescription_ID()
   * @model unique="false" id="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  String getID();

} // PartialStateDescription
