/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Output;
import control.OutputBinding;
import control.ValueSpecifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.OutputBindingImpl#getToParam <em>To Param</em>}</li>
 *   <li>{@link control.impl.OutputBindingImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputBindingImpl extends BindingImpl implements OutputBinding
{
  /**
	 * The cached value of the '{@link #getToParam() <em>To Param</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToParam()
	 * @generated
	 * @ordered
	 */
  protected Output toParam;

  /**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
  protected ValueSpecifier origin;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OutputBindingImpl()
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
		return ControlPackage.Literals.OUTPUT_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Output getToParam()
  {
		if (toParam != null && toParam.eIsProxy()) {
			InternalEObject oldToParam = (InternalEObject)toParam;
			toParam = (Output)eResolveProxy(oldToParam);
			if (toParam != oldToParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.OUTPUT_BINDING__TO_PARAM, oldToParam, toParam));
			}
		}
		return toParam;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Output basicGetToParam()
  {
		return toParam;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToParam(Output newToParam)
  {
		Output oldToParam = toParam;
		toParam = newToParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTPUT_BINDING__TO_PARAM, oldToParam, toParam));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSpecifier getOrigin()
  {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (ValueSpecifier)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.OUTPUT_BINDING__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSpecifier basicGetOrigin()
  {
		return origin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrigin(ValueSpecifier newOrigin)
  {
		ValueSpecifier oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTPUT_BINDING__ORIGIN, oldOrigin, origin));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ControlPackage.OUTPUT_BINDING__TO_PARAM:
				if (resolve) return getToParam();
				return basicGetToParam();
			case ControlPackage.OUTPUT_BINDING__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
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
		switch (featureID) {
			case ControlPackage.OUTPUT_BINDING__TO_PARAM:
				setToParam((Output)newValue);
				return;
			case ControlPackage.OUTPUT_BINDING__ORIGIN:
				setOrigin((ValueSpecifier)newValue);
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
		switch (featureID) {
			case ControlPackage.OUTPUT_BINDING__TO_PARAM:
				setToParam((Output)null);
				return;
			case ControlPackage.OUTPUT_BINDING__ORIGIN:
				setOrigin((ValueSpecifier)null);
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
		switch (featureID) {
			case ControlPackage.OUTPUT_BINDING__TO_PARAM:
				return toParam != null;
			case ControlPackage.OUTPUT_BINDING__ORIGIN:
				return origin != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputBindingImpl
