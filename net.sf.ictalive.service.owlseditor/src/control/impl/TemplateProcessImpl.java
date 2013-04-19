/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.TemplateProcess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.TemplateProcessImpl#getSlotName <em>Slot Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateProcessImpl extends AbstractProcessImpl implements TemplateProcess
{
  /**
	 * The default value of the '{@link #getSlotName() <em>Slot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSlotName()
	 * @generated
	 * @ordered
	 */
  protected static final String SLOT_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSlotName() <em>Slot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSlotName()
	 * @generated
	 * @ordered
	 */
  protected String slotName = SLOT_NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TemplateProcessImpl()
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
		return ControlPackage.Literals.TEMPLATE_PROCESS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSlotName()
  {
		return slotName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSlotName(String newSlotName)
  {
		String oldSlotName = slotName;
		slotName = newSlotName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.TEMPLATE_PROCESS__SLOT_NAME, oldSlotName, slotName));
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
			case ControlPackage.TEMPLATE_PROCESS__SLOT_NAME:
				return getSlotName();
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
			case ControlPackage.TEMPLATE_PROCESS__SLOT_NAME:
				setSlotName((String)newValue);
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
			case ControlPackage.TEMPLATE_PROCESS__SLOT_NAME:
				setSlotName(SLOT_NAME_EDEFAULT);
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
			case ControlPackage.TEMPLATE_PROCESS__SLOT_NAME:
				return SLOT_NAME_EDEFAULT == null ? slotName != null : !SLOT_NAME_EDEFAULT.equals(slotName);
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
		result.append(" (slotName: ");
		result.append(slotName);
		result.append(')');
		return result.toString();
	}

} //TemplateProcessImpl
