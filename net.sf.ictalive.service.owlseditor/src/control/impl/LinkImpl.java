/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.LinkImpl#getHasBeenWritten <em>Has Been Written</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends ProcessVarImpl implements Link
{
  /**
	 * The default value of the '{@link #getHasBeenWritten() <em>Has Been Written</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasBeenWritten()
	 * @generated
	 * @ordered
	 */
  protected static final Boolean HAS_BEEN_WRITTEN_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getHasBeenWritten() <em>Has Been Written</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasBeenWritten()
	 * @generated
	 * @ordered
	 */
  protected Boolean hasBeenWritten = HAS_BEEN_WRITTEN_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LinkImpl()
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
		return ControlPackage.Literals.LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Boolean getHasBeenWritten()
  {
		return hasBeenWritten;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHasBeenWritten(Boolean newHasBeenWritten)
  {
		Boolean oldHasBeenWritten = hasBeenWritten;
		hasBeenWritten = newHasBeenWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.LINK__HAS_BEEN_WRITTEN, oldHasBeenWritten, hasBeenWritten));
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
			case ControlPackage.LINK__HAS_BEEN_WRITTEN:
				return getHasBeenWritten();
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
			case ControlPackage.LINK__HAS_BEEN_WRITTEN:
				setHasBeenWritten((Boolean)newValue);
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
			case ControlPackage.LINK__HAS_BEEN_WRITTEN:
				setHasBeenWritten(HAS_BEEN_WRITTEN_EDEFAULT);
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
			case ControlPackage.LINK__HAS_BEEN_WRITTEN:
				return HAS_BEEN_WRITTEN_EDEFAULT == null ? hasBeenWritten != null : !HAS_BEEN_WRITTEN_EDEFAULT.equals(hasBeenWritten);
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
		result.append(" (hasBeenWritten: ");
		result.append(hasBeenWritten);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
