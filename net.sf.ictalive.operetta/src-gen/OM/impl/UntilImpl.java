/**
 */
package OM.impl;

import OM.OMPackage;
import OM.PathFormula;
import OM.Until;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.UntilImpl#getFromPathFormula <em>From Path Formula</em>}</li>
 *   <li>{@link OM.impl.UntilImpl#getUntilPathFormula <em>Until Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UntilImpl extends PathFormulaImpl implements Until
{
  /**
   * The cached value of the '{@link #getFromPathFormula() <em>From Path Formula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromPathFormula()
   * @generated
   * @ordered
   */
  protected PathFormula fromPathFormula;

  /**
   * The cached value of the '{@link #getUntilPathFormula() <em>Until Path Formula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntilPathFormula()
   * @generated
   * @ordered
   */
  protected PathFormula untilPathFormula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UntilImpl()
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
    return OMPackage.Literals.UNTIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula getFromPathFormula()
  {
    if (fromPathFormula != null && fromPathFormula.eIsProxy())
    {
      InternalEObject oldFromPathFormula = (InternalEObject)fromPathFormula;
      fromPathFormula = (PathFormula)eResolveProxy(oldFromPathFormula);
      if (fromPathFormula != oldFromPathFormula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.UNTIL__FROM_PATH_FORMULA, oldFromPathFormula, fromPathFormula));
      }
    }
    return fromPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula basicGetFromPathFormula()
  {
    return fromPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromPathFormula(PathFormula newFromPathFormula)
  {
    PathFormula oldFromPathFormula = fromPathFormula;
    fromPathFormula = newFromPathFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.UNTIL__FROM_PATH_FORMULA, oldFromPathFormula, fromPathFormula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula getUntilPathFormula()
  {
    if (untilPathFormula != null && untilPathFormula.eIsProxy())
    {
      InternalEObject oldUntilPathFormula = (InternalEObject)untilPathFormula;
      untilPathFormula = (PathFormula)eResolveProxy(oldUntilPathFormula);
      if (untilPathFormula != oldUntilPathFormula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.UNTIL__UNTIL_PATH_FORMULA, oldUntilPathFormula, untilPathFormula));
      }
    }
    return untilPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula basicGetUntilPathFormula()
  {
    return untilPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUntilPathFormula(PathFormula newUntilPathFormula)
  {
    PathFormula oldUntilPathFormula = untilPathFormula;
    untilPathFormula = newUntilPathFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.UNTIL__UNTIL_PATH_FORMULA, oldUntilPathFormula, untilPathFormula));
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
      case OMPackage.UNTIL__FROM_PATH_FORMULA:
        if (resolve) return getFromPathFormula();
        return basicGetFromPathFormula();
      case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
        if (resolve) return getUntilPathFormula();
        return basicGetUntilPathFormula();
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
      case OMPackage.UNTIL__FROM_PATH_FORMULA:
        setFromPathFormula((PathFormula)newValue);
        return;
      case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
        setUntilPathFormula((PathFormula)newValue);
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
      case OMPackage.UNTIL__FROM_PATH_FORMULA:
        setFromPathFormula((PathFormula)null);
        return;
      case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
        setUntilPathFormula((PathFormula)null);
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
      case OMPackage.UNTIL__FROM_PATH_FORMULA:
        return fromPathFormula != null;
      case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
        return untilPathFormula != null;
    }
    return super.eIsSet(featureID);
  }

} //UntilImpl
