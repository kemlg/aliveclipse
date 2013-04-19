/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.AbstractProcess;
import control.ControlPackage;
import control.InnerProcess;
import control.Perform;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.PerformImpl#getTheProcess <em>The Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformImpl extends ControlConstructImpl implements Perform
{
  /**
	 * The cached value of the '{@link #getTheProcess() <em>The Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTheProcess()
	 * @generated
	 * @ordered
	 */
  protected AbstractProcess theProcess;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PerformImpl()
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
		return ControlPackage.Literals.PERFORM;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractProcess getTheProcess()
  {
		return theProcess;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTheProcess(AbstractProcess newTheProcess, NotificationChain msgs)
  {
		AbstractProcess oldTheProcess = theProcess;
		theProcess = newTheProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.PERFORM__THE_PROCESS, oldTheProcess, newTheProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTheProcess(AbstractProcess newTheProcess)
  {
		if (newTheProcess != theProcess) {
			NotificationChain msgs = null;
			if (theProcess != null)
				msgs = ((InternalEObject)theProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.PERFORM__THE_PROCESS, null, msgs);
			if (newTheProcess != null)
				msgs = ((InternalEObject)newTheProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.PERFORM__THE_PROCESS, null, msgs);
			msgs = basicSetTheProcess(newTheProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.PERFORM__THE_PROCESS, newTheProcess, newTheProcess));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ControlPackage.PERFORM__THE_PROCESS:
				return basicSetTheProcess(null, msgs);
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
		switch (featureID) {
			case ControlPackage.PERFORM__THE_PROCESS:
				return getTheProcess();
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
			case ControlPackage.PERFORM__THE_PROCESS:
				setTheProcess((AbstractProcess)newValue);
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
			case ControlPackage.PERFORM__THE_PROCESS:
				setTheProcess((AbstractProcess)null);
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
			case ControlPackage.PERFORM__THE_PROCESS:
				return theProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformImpl
