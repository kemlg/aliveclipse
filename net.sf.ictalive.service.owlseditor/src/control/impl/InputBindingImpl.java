/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Input;
import control.InputBinding;
import control.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.InputBindingImpl#getToParam <em>To Param</em>}</li>
 *   <li>{@link control.impl.InputBindingImpl#getValueSource <em>Value Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputBindingImpl extends BindingImpl implements InputBinding
{
  /**
	 * The cached value of the '{@link #getToParam() <em>To Param</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToParam()
	 * @generated
	 * @ordered
	 */
  protected Input toParam;

  /**
	 * The cached value of the '{@link #getValueSource() <em>Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
  protected Parameter valueSource;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InputBindingImpl()
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
		return ControlPackage.Literals.INPUT_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Input getToParam()
  {
		if (toParam != null && toParam.eIsProxy()) {
			InternalEObject oldToParam = (InternalEObject)toParam;
			toParam = (Input)eResolveProxy(oldToParam);
			if (toParam != oldToParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.INPUT_BINDING__TO_PARAM, oldToParam, toParam));
			}
		}
		return toParam;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Input basicGetToParam()
  {
		return toParam;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToParam(Input newToParam)
  {
		Input oldToParam = toParam;
		toParam = newToParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.INPUT_BINDING__TO_PARAM, oldToParam, toParam));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getValueSource()
  {
		if (valueSource != null && valueSource.eIsProxy()) {
			InternalEObject oldValueSource = (InternalEObject)valueSource;
			valueSource = (Parameter)eResolveProxy(oldValueSource);
			if (valueSource != oldValueSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.INPUT_BINDING__VALUE_SOURCE, oldValueSource, valueSource));
			}
		}
		return valueSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter basicGetValueSource()
  {
		return valueSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValueSource(Parameter newValueSource)
  {
		Parameter oldValueSource = valueSource;
		valueSource = newValueSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.INPUT_BINDING__VALUE_SOURCE, oldValueSource, valueSource));
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
			case ControlPackage.INPUT_BINDING__TO_PARAM:
				if (resolve) return getToParam();
				return basicGetToParam();
			case ControlPackage.INPUT_BINDING__VALUE_SOURCE:
				if (resolve) return getValueSource();
				return basicGetValueSource();
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
			case ControlPackage.INPUT_BINDING__TO_PARAM:
				setToParam((Input)newValue);
				return;
			case ControlPackage.INPUT_BINDING__VALUE_SOURCE:
				setValueSource((Parameter)newValue);
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
			case ControlPackage.INPUT_BINDING__TO_PARAM:
				setToParam((Input)null);
				return;
			case ControlPackage.INPUT_BINDING__VALUE_SOURCE:
				setValueSource((Parameter)null);
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
			case ControlPackage.INPUT_BINDING__TO_PARAM:
				return toParam != null;
			case ControlPackage.INPUT_BINDING__VALUE_SOURCE:
				return valueSource != null;
		}
		return super.eIsSet(featureID);
	}

} //InputBindingImpl
