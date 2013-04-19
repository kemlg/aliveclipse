/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlConstruct;
import control.ControlPackage;
import control.Expr;
import control.RepeatWhile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.RepeatWhileImpl#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link control.impl.RepeatWhileImpl#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatWhileImpl extends ControlConstructImpl implements RepeatWhile
{
  /**
	 * The cached value of the '{@link #getWhileCondition() <em>While Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWhileCondition()
	 * @generated
	 * @ordered
	 */
  protected Expr whileCondition;

  /**
	 * The cached value of the '{@link #getWhileProcess() <em>While Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWhileProcess()
	 * @generated
	 * @ordered
	 */
  protected ControlConstruct whileProcess;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RepeatWhileImpl()
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
		return ControlPackage.Literals.REPEAT_WHILE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expr getWhileCondition()
  {
		return whileCondition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWhileCondition(Expr newWhileCondition, NotificationChain msgs)
  {
		Expr oldWhileCondition = whileCondition;
		whileCondition = newWhileCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.REPEAT_WHILE__WHILE_CONDITION, oldWhileCondition, newWhileCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWhileCondition(Expr newWhileCondition)
  {
		if (newWhileCondition != whileCondition) {
			NotificationChain msgs = null;
			if (whileCondition != null)
				msgs = ((InternalEObject)whileCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.REPEAT_WHILE__WHILE_CONDITION, null, msgs);
			if (newWhileCondition != null)
				msgs = ((InternalEObject)newWhileCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.REPEAT_WHILE__WHILE_CONDITION, null, msgs);
			msgs = basicSetWhileCondition(newWhileCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REPEAT_WHILE__WHILE_CONDITION, newWhileCondition, newWhileCondition));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlConstruct getWhileProcess()
  {
		return whileProcess;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWhileProcess(ControlConstruct newWhileProcess, NotificationChain msgs)
  {
		ControlConstruct oldWhileProcess = whileProcess;
		whileProcess = newWhileProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, newWhileProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWhileProcess(ControlConstruct newWhileProcess)
  {
		if (newWhileProcess != whileProcess) {
			NotificationChain msgs = null;
			if (whileProcess != null)
				msgs = ((InternalEObject)whileProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.REPEAT_WHILE__WHILE_PROCESS, null, msgs);
			if (newWhileProcess != null)
				msgs = ((InternalEObject)newWhileProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.REPEAT_WHILE__WHILE_PROCESS, null, msgs);
			msgs = basicSetWhileProcess(newWhileProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REPEAT_WHILE__WHILE_PROCESS, newWhileProcess, newWhileProcess));
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
			case ControlPackage.REPEAT_WHILE__WHILE_CONDITION:
				return basicSetWhileCondition(null, msgs);
			case ControlPackage.REPEAT_WHILE__WHILE_PROCESS:
				return basicSetWhileProcess(null, msgs);
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
			case ControlPackage.REPEAT_WHILE__WHILE_CONDITION:
				return getWhileCondition();
			case ControlPackage.REPEAT_WHILE__WHILE_PROCESS:
				return getWhileProcess();
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
			case ControlPackage.REPEAT_WHILE__WHILE_CONDITION:
				setWhileCondition((Expr)newValue);
				return;
			case ControlPackage.REPEAT_WHILE__WHILE_PROCESS:
				setWhileProcess((ControlConstruct)newValue);
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
			case ControlPackage.REPEAT_WHILE__WHILE_CONDITION:
				setWhileCondition((Expr)null);
				return;
			case ControlPackage.REPEAT_WHILE__WHILE_PROCESS:
				setWhileProcess((ControlConstruct)null);
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
			case ControlPackage.REPEAT_WHILE__WHILE_CONDITION:
				return whileCondition != null;
			case ControlPackage.REPEAT_WHILE__WHILE_PROCESS:
				return whileProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatWhileImpl
