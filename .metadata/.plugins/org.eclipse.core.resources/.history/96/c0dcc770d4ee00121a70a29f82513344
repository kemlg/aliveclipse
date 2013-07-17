/**
 */
package OM.impl;

import OM.OMPackage;
import OM.Transition;
import OM.TransitionNorm;
import OM.TransitionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.TransitionImpl#getTransitionID <em>Transition ID</em>}</li>
 *   <li>{@link OM.impl.TransitionImpl#getTransitionType <em>Transition Type</em>}</li>
 *   <li>{@link OM.impl.TransitionImpl#getNorms <em>Norms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getTransitionID() <em>Transition ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionID()
   * @generated
   * @ordered
   */
  protected static final String TRANSITION_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransitionID() <em>Transition ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionID()
   * @generated
   * @ordered
   */
  protected String transitionID = TRANSITION_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getTransitionType() <em>Transition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionType()
   * @generated
   * @ordered
   */
  protected static final TransitionType TRANSITION_TYPE_EDEFAULT = TransitionType.AND;

  /**
   * The cached value of the '{@link #getTransitionType() <em>Transition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionType()
   * @generated
   * @ordered
   */
  protected TransitionType transitionType = TRANSITION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getNorms() <em>Norms</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNorms()
   * @generated
   * @ordered
   */
  protected EList<TransitionNorm> norms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return OMPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransitionID()
  {
    return transitionID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionID(String newTransitionID)
  {
    String oldTransitionID = transitionID;
    transitionID = newTransitionID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION__TRANSITION_ID, oldTransitionID, transitionID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType getTransitionType()
  {
    return transitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionType(TransitionType newTransitionType)
  {
    TransitionType oldTransitionType = transitionType;
    transitionType = newTransitionType == null ? TRANSITION_TYPE_EDEFAULT : newTransitionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION__TRANSITION_TYPE, oldTransitionType, transitionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionNorm> getNorms()
  {
    if (norms == null)
    {
      norms = new EObjectResolvingEList<TransitionNorm>(TransitionNorm.class, this, OMPackage.TRANSITION__NORMS);
    }
    return norms;
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
      case OMPackage.TRANSITION__TRANSITION_ID:
        return getTransitionID();
      case OMPackage.TRANSITION__TRANSITION_TYPE:
        return getTransitionType();
      case OMPackage.TRANSITION__NORMS:
        return getNorms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OMPackage.TRANSITION__TRANSITION_ID:
        setTransitionID((String)newValue);
        return;
      case OMPackage.TRANSITION__TRANSITION_TYPE:
        setTransitionType((TransitionType)newValue);
        return;
      case OMPackage.TRANSITION__NORMS:
        getNorms().clear();
        getNorms().addAll((Collection<? extends TransitionNorm>)newValue);
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
      case OMPackage.TRANSITION__TRANSITION_ID:
        setTransitionID(TRANSITION_ID_EDEFAULT);
        return;
      case OMPackage.TRANSITION__TRANSITION_TYPE:
        setTransitionType(TRANSITION_TYPE_EDEFAULT);
        return;
      case OMPackage.TRANSITION__NORMS:
        getNorms().clear();
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
      case OMPackage.TRANSITION__TRANSITION_ID:
        return TRANSITION_ID_EDEFAULT == null ? transitionID != null : !TRANSITION_ID_EDEFAULT.equals(transitionID);
      case OMPackage.TRANSITION__TRANSITION_TYPE:
        return transitionType != TRANSITION_TYPE_EDEFAULT;
      case OMPackage.TRANSITION__NORMS:
        return norms != null && !norms.isEmpty();
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
    result.append(" (transitionID: ");
    result.append(transitionID);
    result.append(", transitionType: ");
    result.append(transitionType);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
