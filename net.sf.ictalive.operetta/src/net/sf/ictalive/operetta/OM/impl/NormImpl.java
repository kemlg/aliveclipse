/**
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.DeonticStatement;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.NormImpl#getNormID <em>Norm ID</em>}</li>
 *   <li>{@link OM.impl.NormImpl#getActivatingCondition <em>Activating Condition</em>}</li>
 *   <li>{@link OM.impl.NormImpl#getDeactivatingCondition <em>Deactivating Condition</em>}</li>
 *   <li>{@link OM.impl.NormImpl#getMaintenanceCondition <em>Maintenance Condition</em>}</li>
 *   <li>{@link OM.impl.NormImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link OM.impl.NormImpl#getDeontics <em>Deontics</em>}</li>
 *   <li>{@link OM.impl.NormImpl#getRepairCondition <em>Repair Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormImpl extends MinimalEObjectImpl.Container implements Norm
{
  /**
   * The default value of the '{@link #getNormID() <em>Norm ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormID()
   * @generated
   * @ordered
   */
  protected static final String NORM_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNormID() <em>Norm ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormID()
   * @generated
   * @ordered
   */
  protected String normID = NORM_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getActivatingCondition() <em>Activating Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivatingCondition()
   * @generated
   * @ordered
   */
  protected PartialStateDescription activatingCondition;

  /**
   * The cached value of the '{@link #getDeactivatingCondition() <em>Deactivating Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeactivatingCondition()
   * @generated
   * @ordered
   */
  protected PartialStateDescription deactivatingCondition;

  /**
   * The cached value of the '{@link #getMaintenanceCondition() <em>Maintenance Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaintenanceCondition()
   * @generated
   * @ordered
   */
  protected PartialStateDescription maintenanceCondition;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected PartialStateDescription timeout;

  /**
   * The cached value of the '{@link #getDeontics() <em>Deontics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeontics()
   * @generated
   * @ordered
   */
  protected DeonticStatement deontics;

  /**
   * The cached value of the '{@link #getRepairCondition() <em>Repair Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepairCondition()
   * @generated
   * @ordered
   */
  protected PartialStateDescription repairCondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NormImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OMPackage.Literals.NORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNormID()
  {
    return normID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNormID(String newNormID)
  {
    String oldNormID = normID;
    normID = newNormID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__NORM_ID, oldNormID, normID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription getActivatingCondition()
  {
    if (activatingCondition != null && activatingCondition.eIsProxy())
    {
      InternalEObject oldActivatingCondition = (InternalEObject)activatingCondition;
      activatingCondition = (PartialStateDescription)eResolveProxy(oldActivatingCondition);
      if (activatingCondition != oldActivatingCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__ACTIVATING_CONDITION, oldActivatingCondition, activatingCondition));
      }
    }
    return activatingCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription basicGetActivatingCondition()
  {
    return activatingCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivatingCondition(PartialStateDescription newActivatingCondition)
  {
    PartialStateDescription oldActivatingCondition = activatingCondition;
    activatingCondition = newActivatingCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__ACTIVATING_CONDITION, oldActivatingCondition, activatingCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription getDeactivatingCondition()
  {
    if (deactivatingCondition != null && deactivatingCondition.eIsProxy())
    {
      InternalEObject oldDeactivatingCondition = (InternalEObject)deactivatingCondition;
      deactivatingCondition = (PartialStateDescription)eResolveProxy(oldDeactivatingCondition);
      if (deactivatingCondition != oldDeactivatingCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__DEACTIVATING_CONDITION, oldDeactivatingCondition, deactivatingCondition));
      }
    }
    return deactivatingCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription basicGetDeactivatingCondition()
  {
    return deactivatingCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeactivatingCondition(PartialStateDescription newDeactivatingCondition)
  {
    PartialStateDescription oldDeactivatingCondition = deactivatingCondition;
    deactivatingCondition = newDeactivatingCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__DEACTIVATING_CONDITION, oldDeactivatingCondition, deactivatingCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription getMaintenanceCondition()
  {
    if (maintenanceCondition != null && maintenanceCondition.eIsProxy())
    {
      InternalEObject oldMaintenanceCondition = (InternalEObject)maintenanceCondition;
      maintenanceCondition = (PartialStateDescription)eResolveProxy(oldMaintenanceCondition);
      if (maintenanceCondition != oldMaintenanceCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__MAINTENANCE_CONDITION, oldMaintenanceCondition, maintenanceCondition));
      }
    }
    return maintenanceCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription basicGetMaintenanceCondition()
  {
    return maintenanceCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaintenanceCondition(PartialStateDescription newMaintenanceCondition)
  {
    PartialStateDescription oldMaintenanceCondition = maintenanceCondition;
    maintenanceCondition = newMaintenanceCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__MAINTENANCE_CONDITION, oldMaintenanceCondition, maintenanceCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription getTimeout()
  {
    if (timeout != null && timeout.eIsProxy())
    {
      InternalEObject oldTimeout = (InternalEObject)timeout;
      timeout = (PartialStateDescription)eResolveProxy(oldTimeout);
      if (timeout != oldTimeout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__TIMEOUT, oldTimeout, timeout));
      }
    }
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription basicGetTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeout(PartialStateDescription newTimeout)
  {
    PartialStateDescription oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__TIMEOUT, oldTimeout, timeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeonticStatement getDeontics()
  {
    return deontics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeontics(DeonticStatement newDeontics, NotificationChain msgs)
  {
    DeonticStatement oldDeontics = deontics;
    deontics = newDeontics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.NORM__DEONTICS, oldDeontics, newDeontics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeontics(DeonticStatement newDeontics)
  {
    if (newDeontics != deontics)
    {
      NotificationChain msgs = null;
      if (deontics != null)
        msgs = ((InternalEObject)deontics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.NORM__DEONTICS, null, msgs);
      if (newDeontics != null)
        msgs = ((InternalEObject)newDeontics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.NORM__DEONTICS, null, msgs);
      msgs = basicSetDeontics(newDeontics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__DEONTICS, newDeontics, newDeontics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription getRepairCondition()
  {
    if (repairCondition != null && repairCondition.eIsProxy())
    {
      InternalEObject oldRepairCondition = (InternalEObject)repairCondition;
      repairCondition = (PartialStateDescription)eResolveProxy(oldRepairCondition);
      if (repairCondition != oldRepairCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__REPAIR_CONDITION, oldRepairCondition, repairCondition));
      }
    }
    return repairCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription basicGetRepairCondition()
  {
    return repairCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepairCondition(PartialStateDescription newRepairCondition)
  {
    PartialStateDescription oldRepairCondition = repairCondition;
    repairCondition = newRepairCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__REPAIR_CONDITION, oldRepairCondition, repairCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OMPackage.NORM__DEONTICS:
        return basicSetDeontics(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OMPackage.NORM__NORM_ID:
        return getNormID();
      case OMPackage.NORM__ACTIVATING_CONDITION:
        if (resolve) return getActivatingCondition();
        return basicGetActivatingCondition();
      case OMPackage.NORM__DEACTIVATING_CONDITION:
        if (resolve) return getDeactivatingCondition();
        return basicGetDeactivatingCondition();
      case OMPackage.NORM__MAINTENANCE_CONDITION:
        if (resolve) return getMaintenanceCondition();
        return basicGetMaintenanceCondition();
      case OMPackage.NORM__TIMEOUT:
        if (resolve) return getTimeout();
        return basicGetTimeout();
      case OMPackage.NORM__DEONTICS:
        return getDeontics();
      case OMPackage.NORM__REPAIR_CONDITION:
        if (resolve) return getRepairCondition();
        return basicGetRepairCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OMPackage.NORM__NORM_ID:
        setNormID((String)newValue);
        return;
      case OMPackage.NORM__ACTIVATING_CONDITION:
        setActivatingCondition((PartialStateDescription)newValue);
        return;
      case OMPackage.NORM__DEACTIVATING_CONDITION:
        setDeactivatingCondition((PartialStateDescription)newValue);
        return;
      case OMPackage.NORM__MAINTENANCE_CONDITION:
        setMaintenanceCondition((PartialStateDescription)newValue);
        return;
      case OMPackage.NORM__TIMEOUT:
        setTimeout((PartialStateDescription)newValue);
        return;
      case OMPackage.NORM__DEONTICS:
        setDeontics((DeonticStatement)newValue);
        return;
      case OMPackage.NORM__REPAIR_CONDITION:
        setRepairCondition((PartialStateDescription)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OMPackage.NORM__NORM_ID:
        setNormID(NORM_ID_EDEFAULT);
        return;
      case OMPackage.NORM__ACTIVATING_CONDITION:
        setActivatingCondition((PartialStateDescription)null);
        return;
      case OMPackage.NORM__DEACTIVATING_CONDITION:
        setDeactivatingCondition((PartialStateDescription)null);
        return;
      case OMPackage.NORM__MAINTENANCE_CONDITION:
        setMaintenanceCondition((PartialStateDescription)null);
        return;
      case OMPackage.NORM__TIMEOUT:
        setTimeout((PartialStateDescription)null);
        return;
      case OMPackage.NORM__DEONTICS:
        setDeontics((DeonticStatement)null);
        return;
      case OMPackage.NORM__REPAIR_CONDITION:
        setRepairCondition((PartialStateDescription)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OMPackage.NORM__NORM_ID:
        return NORM_ID_EDEFAULT == null ? normID != null : !NORM_ID_EDEFAULT.equals(normID);
      case OMPackage.NORM__ACTIVATING_CONDITION:
        return activatingCondition != null;
      case OMPackage.NORM__DEACTIVATING_CONDITION:
        return deactivatingCondition != null;
      case OMPackage.NORM__MAINTENANCE_CONDITION:
        return maintenanceCondition != null;
      case OMPackage.NORM__TIMEOUT:
        return timeout != null;
      case OMPackage.NORM__DEONTICS:
        return deontics != null;
      case OMPackage.NORM__REPAIR_CONDITION:
        return repairCondition != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (normID: ");
    result.append(normID);
    result.append(')');
    return result.toString();
  }

} //NormImpl
