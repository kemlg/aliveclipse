/**
 */
package OM.impl;

import OM.NS;
import OM.Norm;
import OM.OMPackage;
import OM.TransitionNorm;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.NSImpl#getNorms <em>Norms</em>}</li>
 *   <li>{@link OM.impl.NSImpl#getTransitionNorms <em>Transition Norms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NSImpl extends MinimalEObjectImpl.Container implements NS
{
  /**
   * The cached value of the '{@link #getNorms() <em>Norms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNorms()
   * @generated
   * @ordered
   */
  protected EList<Norm> norms;

  /**
   * The cached value of the '{@link #getTransitionNorms() <em>Transition Norms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionNorms()
   * @generated
   * @ordered
   */
  protected EList<TransitionNorm> transitionNorms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NSImpl()
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
    return OMPackage.Literals.NS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Norm> getNorms()
  {
    if (norms == null)
    {
      norms = new EObjectContainmentEList.Resolving<Norm>(Norm.class, this, OMPackage.NS__NORMS);
    }
    return norms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionNorm> getTransitionNorms()
  {
    if (transitionNorms == null)
    {
      transitionNorms = new EObjectContainmentEList.Resolving<TransitionNorm>(TransitionNorm.class, this, OMPackage.NS__TRANSITION_NORMS);
    }
    return transitionNorms;
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
      case OMPackage.NS__NORMS:
        return ((InternalEList<?>)getNorms()).basicRemove(otherEnd, msgs);
      case OMPackage.NS__TRANSITION_NORMS:
        return ((InternalEList<?>)getTransitionNorms()).basicRemove(otherEnd, msgs);
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
      case OMPackage.NS__NORMS:
        return getNorms();
      case OMPackage.NS__TRANSITION_NORMS:
        return getTransitionNorms();
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
      case OMPackage.NS__NORMS:
        getNorms().clear();
        getNorms().addAll((Collection<? extends Norm>)newValue);
        return;
      case OMPackage.NS__TRANSITION_NORMS:
        getTransitionNorms().clear();
        getTransitionNorms().addAll((Collection<? extends TransitionNorm>)newValue);
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
      case OMPackage.NS__NORMS:
        getNorms().clear();
        return;
      case OMPackage.NS__TRANSITION_NORMS:
        getTransitionNorms().clear();
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
      case OMPackage.NS__NORMS:
        return norms != null && !norms.isEmpty();
      case OMPackage.NS__TRANSITION_NORMS:
        return transitionNorms != null && !transitionNorms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NSImpl
