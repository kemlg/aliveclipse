/**
 */
package OM.impl;

import OM.DeonticModality;
import OM.DeonticStatement;
import OM.OMPackage;
import OM.PartialStateDescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deontic Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.DeonticStatementImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link OM.impl.DeonticStatementImpl#getWhat <em>What</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeonticStatementImpl extends MinimalEObjectImpl.Container implements DeonticStatement
{
  /**
   * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModality()
   * @generated
   * @ordered
   */
  protected static final DeonticModality MODALITY_EDEFAULT = DeonticModality.OBLIGATION;

  /**
   * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModality()
   * @generated
   * @ordered
   */
  protected DeonticModality modality = MODALITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhat() <em>What</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhat()
   * @generated
   * @ordered
   */
  protected PartialStateDescription what;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeonticStatementImpl()
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
    return OMPackage.Literals.DEONTIC_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeonticModality getModality()
  {
    return modality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModality(DeonticModality newModality)
  {
    DeonticModality oldModality = modality;
    modality = newModality == null ? MODALITY_EDEFAULT : newModality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.DEONTIC_STATEMENT__MODALITY, oldModality, modality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription getWhat()
  {
    if (what != null && what.eIsProxy())
    {
      InternalEObject oldWhat = (InternalEObject)what;
      what = (PartialStateDescription)eResolveProxy(oldWhat);
      if (what != oldWhat)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.DEONTIC_STATEMENT__WHAT, oldWhat, what));
      }
    }
    return what;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialStateDescription basicGetWhat()
  {
    return what;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhat(PartialStateDescription newWhat)
  {
    PartialStateDescription oldWhat = what;
    what = newWhat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.DEONTIC_STATEMENT__WHAT, oldWhat, what));
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
      case OMPackage.DEONTIC_STATEMENT__MODALITY:
        return getModality();
      case OMPackage.DEONTIC_STATEMENT__WHAT:
        if (resolve) return getWhat();
        return basicGetWhat();
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
      case OMPackage.DEONTIC_STATEMENT__MODALITY:
        setModality((DeonticModality)newValue);
        return;
      case OMPackage.DEONTIC_STATEMENT__WHAT:
        setWhat((PartialStateDescription)newValue);
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
      case OMPackage.DEONTIC_STATEMENT__MODALITY:
        setModality(MODALITY_EDEFAULT);
        return;
      case OMPackage.DEONTIC_STATEMENT__WHAT:
        setWhat((PartialStateDescription)null);
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
      case OMPackage.DEONTIC_STATEMENT__MODALITY:
        return modality != MODALITY_EDEFAULT;
      case OMPackage.DEONTIC_STATEMENT__WHAT:
        return what != null;
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
    result.append(" (modality: ");
    result.append(modality);
    result.append(')');
    return result.toString();
  }

} //DeonticStatementImpl
