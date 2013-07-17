/**
 */
package OM.impl;

import OM.OM;
import OM.OMPackage;
import OM.OperAModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oper AModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.OperAModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link OM.impl.OperAModelImpl#getOm <em>Om</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperAModelImpl extends MinimalEObjectImpl.Container implements OperAModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOm() <em>Om</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOm()
   * @generated
   * @ordered
   */
  protected OM om;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperAModelImpl()
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
    return OMPackage.Literals.OPER_AMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OPER_AMODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OM getOm()
  {
    if (om != null && om.eIsProxy())
    {
      InternalEObject oldOm = (InternalEObject)om;
      om = (OM)eResolveProxy(oldOm);
      if (om != oldOm)
      {
        InternalEObject newOm = (InternalEObject)om;
        NotificationChain msgs = oldOm.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.OPER_AMODEL__OM, null, null);
        if (newOm.eInternalContainer() == null)
        {
          msgs = newOm.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.OPER_AMODEL__OM, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.OPER_AMODEL__OM, oldOm, om));
      }
    }
    return om;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OM basicGetOm()
  {
    return om;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOm(OM newOm, NotificationChain msgs)
  {
    OM oldOm = om;
    om = newOm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.OPER_AMODEL__OM, oldOm, newOm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOm(OM newOm)
  {
    if (newOm != om)
    {
      NotificationChain msgs = null;
      if (om != null)
        msgs = ((InternalEObject)om).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.OPER_AMODEL__OM, null, msgs);
      if (newOm != null)
        msgs = ((InternalEObject)newOm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.OPER_AMODEL__OM, null, msgs);
      msgs = basicSetOm(newOm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OPER_AMODEL__OM, newOm, newOm));
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
      case OMPackage.OPER_AMODEL__OM:
        return basicSetOm(null, msgs);
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
      case OMPackage.OPER_AMODEL__NAME:
        return getName();
      case OMPackage.OPER_AMODEL__OM:
        if (resolve) return getOm();
        return basicGetOm();
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
      case OMPackage.OPER_AMODEL__NAME:
        setName((String)newValue);
        return;
      case OMPackage.OPER_AMODEL__OM:
        setOm((OM)newValue);
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
      case OMPackage.OPER_AMODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OMPackage.OPER_AMODEL__OM:
        setOm((OM)null);
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
      case OMPackage.OPER_AMODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OMPackage.OPER_AMODEL__OM:
        return om != null;
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
    result.append(" (Name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperAModelImpl
