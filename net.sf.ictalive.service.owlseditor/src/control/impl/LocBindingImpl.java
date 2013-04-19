/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Loc;
import control.LocBinding;
import control.ValueSpecifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loc Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.LocBindingImpl#getToLoc <em>To Loc</em>}</li>
 *   <li>{@link control.impl.LocBindingImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocBindingImpl extends SetBindingImpl implements LocBinding
{
  /**
	 * The cached value of the '{@link #getToLoc() <em>To Loc</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToLoc()
	 * @generated
	 * @ordered
	 */
  protected Loc toLoc;

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
  protected LocBindingImpl()
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
		return ControlPackage.Literals.LOC_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Loc getToLoc()
  {
		if (toLoc != null && toLoc.eIsProxy()) {
			InternalEObject oldToLoc = (InternalEObject)toLoc;
			toLoc = (Loc)eResolveProxy(oldToLoc);
			if (toLoc != oldToLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.LOC_BINDING__TO_LOC, oldToLoc, toLoc));
			}
		}
		return toLoc;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Loc basicGetToLoc()
  {
		return toLoc;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToLoc(Loc newToLoc)
  {
		Loc oldToLoc = toLoc;
		toLoc = newToLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.LOC_BINDING__TO_LOC, oldToLoc, toLoc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.LOC_BINDING__ORIGIN, oldOrigin, origin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.LOC_BINDING__ORIGIN, oldOrigin, origin));
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
			case ControlPackage.LOC_BINDING__TO_LOC:
				if (resolve) return getToLoc();
				return basicGetToLoc();
			case ControlPackage.LOC_BINDING__ORIGIN:
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
			case ControlPackage.LOC_BINDING__TO_LOC:
				setToLoc((Loc)newValue);
				return;
			case ControlPackage.LOC_BINDING__ORIGIN:
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
			case ControlPackage.LOC_BINDING__TO_LOC:
				setToLoc((Loc)null);
				return;
			case ControlPackage.LOC_BINDING__ORIGIN:
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
			case ControlPackage.LOC_BINDING__TO_LOC:
				return toLoc != null;
			case ControlPackage.LOC_BINDING__ORIGIN:
				return origin != null;
		}
		return super.eIsSet(featureID);
	}

} //LocBindingImpl
