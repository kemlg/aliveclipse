/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Expr;
import control.RemoteProcess;
import control.Result;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.RemoteProcessImpl#getRemoteURI <em>Remote URI</em>}</li>
 *   <li>{@link control.impl.RemoteProcessImpl#getRemoteURL <em>Remote URL</em>}</li>
 *   <li>{@link control.impl.RemoteProcessImpl#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link control.impl.RemoteProcessImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteProcessImpl extends AbstractProcessImpl implements RemoteProcess
{
  /**
	 * The default value of the '{@link #getRemoteURI() <em>Remote URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRemoteURI()
	 * @generated
	 * @ordered
	 */
  protected static final String REMOTE_URI_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRemoteURI() <em>Remote URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRemoteURI()
	 * @generated
	 * @ordered
	 */
  protected String remoteURI = REMOTE_URI_EDEFAULT;

  /**
	 * The default value of the '{@link #getRemoteURL() <em>Remote URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRemoteURL()
	 * @generated
	 * @ordered
	 */
  protected static final String REMOTE_URL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRemoteURL() <em>Remote URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRemoteURL()
	 * @generated
	 * @ordered
	 */
  protected String remoteURL = REMOTE_URL_EDEFAULT;

  /**
	 * The cached value of the '{@link #getHasResult() <em>Has Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasResult()
	 * @generated
	 * @ordered
	 */
  protected EList<Result> hasResult;

  /**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
  protected EList<Expr> expressions;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RemoteProcessImpl()
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
		return ControlPackage.Literals.REMOTE_PROCESS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getRemoteURI()
  {
		return remoteURI;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRemoteURI(String newRemoteURI)
  {
		String oldRemoteURI = remoteURI;
		remoteURI = newRemoteURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_PROCESS__REMOTE_URI, oldRemoteURI, remoteURI));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getRemoteURL()
  {
		return remoteURL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRemoteURL(String newRemoteURL)
  {
		String oldRemoteURL = remoteURL;
		remoteURL = newRemoteURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_PROCESS__REMOTE_URL, oldRemoteURL, remoteURL));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Result> getHasResult()
  {
		if (hasResult == null) {
			hasResult = new EObjectContainmentEList<Result>(Result.class, this, ControlPackage.REMOTE_PROCESS__HAS_RESULT);
		}
		return hasResult;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Expr> getExpressions()
  {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expr>(Expr.class, this, ControlPackage.REMOTE_PROCESS__EXPRESSIONS);
		}
		return expressions;
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
			case ControlPackage.REMOTE_PROCESS__HAS_RESULT:
				return ((InternalEList<?>)getHasResult()).basicRemove(otherEnd, msgs);
			case ControlPackage.REMOTE_PROCESS__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case ControlPackage.REMOTE_PROCESS__REMOTE_URI:
				return getRemoteURI();
			case ControlPackage.REMOTE_PROCESS__REMOTE_URL:
				return getRemoteURL();
			case ControlPackage.REMOTE_PROCESS__HAS_RESULT:
				return getHasResult();
			case ControlPackage.REMOTE_PROCESS__EXPRESSIONS:
				return getExpressions();
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
		switch (featureID) {
			case ControlPackage.REMOTE_PROCESS__REMOTE_URI:
				setRemoteURI((String)newValue);
				return;
			case ControlPackage.REMOTE_PROCESS__REMOTE_URL:
				setRemoteURL((String)newValue);
				return;
			case ControlPackage.REMOTE_PROCESS__HAS_RESULT:
				getHasResult().clear();
				getHasResult().addAll((Collection<? extends Result>)newValue);
				return;
			case ControlPackage.REMOTE_PROCESS__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expr>)newValue);
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
			case ControlPackage.REMOTE_PROCESS__REMOTE_URI:
				setRemoteURI(REMOTE_URI_EDEFAULT);
				return;
			case ControlPackage.REMOTE_PROCESS__REMOTE_URL:
				setRemoteURL(REMOTE_URL_EDEFAULT);
				return;
			case ControlPackage.REMOTE_PROCESS__HAS_RESULT:
				getHasResult().clear();
				return;
			case ControlPackage.REMOTE_PROCESS__EXPRESSIONS:
				getExpressions().clear();
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
			case ControlPackage.REMOTE_PROCESS__REMOTE_URI:
				return REMOTE_URI_EDEFAULT == null ? remoteURI != null : !REMOTE_URI_EDEFAULT.equals(remoteURI);
			case ControlPackage.REMOTE_PROCESS__REMOTE_URL:
				return REMOTE_URL_EDEFAULT == null ? remoteURL != null : !REMOTE_URL_EDEFAULT.equals(remoteURL);
			case ControlPackage.REMOTE_PROCESS__HAS_RESULT:
				return hasResult != null && !hasResult.isEmpty();
			case ControlPackage.REMOTE_PROCESS__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
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
		result.append(" (remoteURI: ");
		result.append(remoteURI);
		result.append(", remoteURL: ");
		result.append(remoteURL);
		result.append(')');
		return result.toString();
	}

} //RemoteProcessImpl
