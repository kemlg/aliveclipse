/**
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.Norm#getNormID <em>Norm ID</em>}</li>
 *   <li>{@link OM.Norm#getActivatingCondition <em>Activating Condition</em>}</li>
 *   <li>{@link OM.Norm#getDeactivatingCondition <em>Deactivating Condition</em>}</li>
 *   <li>{@link OM.Norm#getMaintenanceCondition <em>Maintenance Condition</em>}</li>
 *   <li>{@link OM.Norm#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link OM.Norm#getDeontics <em>Deontics</em>}</li>
 *   <li>{@link OM.Norm#getRepairCondition <em>Repair Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getNorm()
 * @model
 * @generated
 */
public interface Norm extends EObject
{
  /**
   * Returns the value of the '<em><b>Norm ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Norm ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Norm ID</em>' attribute.
   * @see #setNormID(String)
   * @see OM.OMPackage#getNorm_NormID()
   * @model unique="false" id="true" required="true"
   * @generated
   */
  String getNormID();

  /**
   * Sets the value of the '{@link OM.Norm#getNormID <em>Norm ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Norm ID</em>' attribute.
   * @see #getNormID()
   * @generated
   */
  void setNormID(String value);

  /**
   * Returns the value of the '<em><b>Activating Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activating Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activating Condition</em>' reference.
   * @see #setActivatingCondition(PartialStateDescription)
   * @see OM.OMPackage#getNorm_ActivatingCondition()
   * @model required="true"
   * @generated
   */
  PartialStateDescription getActivatingCondition();

  /**
   * Sets the value of the '{@link OM.Norm#getActivatingCondition <em>Activating Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activating Condition</em>' reference.
   * @see #getActivatingCondition()
   * @generated
   */
  void setActivatingCondition(PartialStateDescription value);

  /**
   * Returns the value of the '<em><b>Deactivating Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deactivating Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deactivating Condition</em>' reference.
   * @see #setDeactivatingCondition(PartialStateDescription)
   * @see OM.OMPackage#getNorm_DeactivatingCondition()
   * @model required="true"
   * @generated
   */
  PartialStateDescription getDeactivatingCondition();

  /**
   * Sets the value of the '{@link OM.Norm#getDeactivatingCondition <em>Deactivating Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deactivating Condition</em>' reference.
   * @see #getDeactivatingCondition()
   * @generated
   */
  void setDeactivatingCondition(PartialStateDescription value);

  /**
   * Returns the value of the '<em><b>Maintenance Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maintenance Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maintenance Condition</em>' reference.
   * @see #setMaintenanceCondition(PartialStateDescription)
   * @see OM.OMPackage#getNorm_MaintenanceCondition()
   * @model required="true"
   * @generated
   */
  PartialStateDescription getMaintenanceCondition();

  /**
   * Sets the value of the '{@link OM.Norm#getMaintenanceCondition <em>Maintenance Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maintenance Condition</em>' reference.
   * @see #getMaintenanceCondition()
   * @generated
   */
  void setMaintenanceCondition(PartialStateDescription value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' reference.
   * @see #setTimeout(PartialStateDescription)
   * @see OM.OMPackage#getNorm_Timeout()
   * @model
   * @generated
   */
  PartialStateDescription getTimeout();

  /**
   * Sets the value of the '{@link OM.Norm#getTimeout <em>Timeout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' reference.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(PartialStateDescription value);

  /**
   * Returns the value of the '<em><b>Deontics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deontics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deontics</em>' containment reference.
   * @see #setDeontics(DeonticStatement)
   * @see OM.OMPackage#getNorm_Deontics()
   * @model containment="true" required="true"
   * @generated
   */
  DeonticStatement getDeontics();

  /**
   * Sets the value of the '{@link OM.Norm#getDeontics <em>Deontics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deontics</em>' containment reference.
   * @see #getDeontics()
   * @generated
   */
  void setDeontics(DeonticStatement value);

  /**
   * Returns the value of the '<em><b>Repair Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repair Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repair Condition</em>' reference.
   * @see #setRepairCondition(PartialStateDescription)
   * @see OM.OMPackage#getNorm_RepairCondition()
   * @model
   * @generated
   */
  PartialStateDescription getRepairCondition();

  /**
   * Sets the value of the '{@link OM.Norm#getRepairCondition <em>Repair Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repair Condition</em>' reference.
   * @see #getRepairCondition()
   * @generated
   */
  void setRepairCondition(PartialStateDescription value);

} // Norm
