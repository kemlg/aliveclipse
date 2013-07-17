/**
 */
package OM.impl;

import OM.ActionDescription;
import OM.Conditional;
import OM.OMPackage;
import OM.StateFormula;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link OM.impl.ConditionalImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends ActionDescriptionImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected StateFormula condition;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ActionDescription action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return OMPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateFormula getCondition()
  {
    if (condition != null && condition.eIsProxy())
    {
      InternalEObject oldCondition = (InternalEObject)condition;
      condition = (StateFormula)eResolveProxy(oldCondition);
      if (condition != oldCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.CONDITIONAL__CONDITION, oldCondition, condition));
      }
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateFormula basicGetCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(StateFormula newCondition)
  {
    StateFormula oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.CONDITIONAL__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDescription getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (ActionDescription)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.CONDITIONAL__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDescription basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(ActionDescription newAction)
  {
    ActionDescription oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.CONDITIONAL__ACTION, oldAction, action));
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
      case OMPackage.CONDITIONAL__CONDITION:
        if (resolve) return getCondition();
        return basicGetCondition();
      case OMPackage.CONDITIONAL__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
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
      case OMPackage.CONDITIONAL__CONDITION:
        setCondition((StateFormula)newValue);
        return;
      case OMPackage.CONDITIONAL__ACTION:
        setAction((ActionDescription)newValue);
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
      case OMPackage.CONDITIONAL__CONDITION:
        setCondition((StateFormula)null);
        return;
      case OMPackage.CONDITIONAL__ACTION:
        setAction((ActionDescription)null);
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
      case OMPackage.CONDITIONAL__CONDITION:
        return condition != null;
      case OMPackage.CONDITIONAL__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl
