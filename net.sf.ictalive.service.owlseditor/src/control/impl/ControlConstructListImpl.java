/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlConstruct;
import control.ControlConstructList;
import control.ControlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.ControlConstructListImpl#getFirst <em>First</em>}</li>
 *   <li>{@link control.impl.ControlConstructListImpl#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlConstructListImpl extends NamedElementImpl implements ControlConstructList
{
  /**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
  protected ControlConstruct first;

  /**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
  protected ControlConstructList rest;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControlConstructListImpl()
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
		return ControlPackage.Literals.CONTROL_CONSTRUCT_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlConstruct getFirst()
  {
		return first;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFirst(ControlConstruct newFirst, NotificationChain msgs)
  {
		ControlConstruct oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFirst(ControlConstruct newFirst)
  {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST, newFirst, newFirst));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlConstructList getRest()
  {
		return rest;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRest(ControlConstructList newRest, NotificationChain msgs)
  {
		ControlConstructList oldRest = rest;
		rest = newRest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.CONTROL_CONSTRUCT_LIST__REST, oldRest, newRest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRest(ControlConstructList newRest)
  {
		if (newRest != rest) {
			NotificationChain msgs = null;
			if (rest != null)
				msgs = ((InternalEObject)rest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.CONTROL_CONSTRUCT_LIST__REST, null, msgs);
			if (newRest != null)
				msgs = ((InternalEObject)newRest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.CONTROL_CONSTRUCT_LIST__REST, null, msgs);
			msgs = basicSetRest(newRest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.CONTROL_CONSTRUCT_LIST__REST, newRest, newRest));
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
			case ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST:
				return basicSetFirst(null, msgs);
			case ControlPackage.CONTROL_CONSTRUCT_LIST__REST:
				return basicSetRest(null, msgs);
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
			case ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST:
				return getFirst();
			case ControlPackage.CONTROL_CONSTRUCT_LIST__REST:
				return getRest();
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
			case ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST:
				setFirst((ControlConstruct)newValue);
				return;
			case ControlPackage.CONTROL_CONSTRUCT_LIST__REST:
				setRest((ControlConstructList)newValue);
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
			case ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST:
				setFirst((ControlConstruct)null);
				return;
			case ControlPackage.CONTROL_CONSTRUCT_LIST__REST:
				setRest((ControlConstructList)null);
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
			case ControlPackage.CONTROL_CONSTRUCT_LIST__FIRST:
				return first != null;
			case ControlPackage.CONTROL_CONSTRUCT_LIST__REST:
				return rest != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlConstructListImpl
