/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Link;
import control.LinkBinding;
import control.ValueSpecifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.LinkBindingImpl#getToLink <em>To Link</em>}</li>
 *   <li>{@link control.impl.LinkBindingImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkBindingImpl extends BindingImpl implements LinkBinding
{
  /**
	 * The cached value of the '{@link #getToLink() <em>To Link</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToLink()
	 * @generated
	 * @ordered
	 */
  protected Link toLink;

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
  protected LinkBindingImpl()
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
		return ControlPackage.Literals.LINK_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Link getToLink()
  {
		if (toLink != null && toLink.eIsProxy()) {
			InternalEObject oldToLink = (InternalEObject)toLink;
			toLink = (Link)eResolveProxy(oldToLink);
			if (toLink != oldToLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.LINK_BINDING__TO_LINK, oldToLink, toLink));
			}
		}
		return toLink;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Link basicGetToLink()
  {
		return toLink;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToLink(Link newToLink)
  {
		Link oldToLink = toLink;
		toLink = newToLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.LINK_BINDING__TO_LINK, oldToLink, toLink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.LINK_BINDING__ORIGIN, oldOrigin, origin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.LINK_BINDING__ORIGIN, oldOrigin, origin));
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
			case ControlPackage.LINK_BINDING__TO_LINK:
				if (resolve) return getToLink();
				return basicGetToLink();
			case ControlPackage.LINK_BINDING__ORIGIN:
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
			case ControlPackage.LINK_BINDING__TO_LINK:
				setToLink((Link)newValue);
				return;
			case ControlPackage.LINK_BINDING__ORIGIN:
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
			case ControlPackage.LINK_BINDING__TO_LINK:
				setToLink((Link)null);
				return;
			case ControlPackage.LINK_BINDING__ORIGIN:
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
			case ControlPackage.LINK_BINDING__TO_LINK:
				return toLink != null;
			case ControlPackage.LINK_BINDING__ORIGIN:
				return origin != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkBindingImpl
