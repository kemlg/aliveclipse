/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Objects.impl;

import java.util.Collection;
import java.util.Date;

import net.sf.ictalive.EventModel.Objects.Enactment;
import net.sf.ictalive.EventModel.Objects.ObjectsPackage;
import net.sf.ictalive.EventModel.Objects.Resource;
import net.sf.ictalive.EventModel.Objects.time;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enactment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl#getExpireTime <em>Expire Time</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnactmentImpl extends EObjectImpl implements Enactment
{
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The default value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected String sessionId = SESSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpireTime() <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpireTime() <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireTime()
	 * @generated
	 * @ordered
	 */
	protected Date expireTime = EXPIRE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinishTime() <em>Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FINISH_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishTime() <em>Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishTime()
	 * @generated
	 * @ordered
	 */
	protected Date finishTime = FINISH_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected time time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnactmentImpl()
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
		return ObjectsPackage.Literals.ENACTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource()
	{
		if (resource == null)
		{
			resource = new EObjectResolvingEList<Resource>(Resource.class, this, ObjectsPackage.ENACTMENT__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionId()
	{
		return sessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionId(String newSessionId)
	{
		String oldSessionId = sessionId;
		sessionId = newSessionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectsPackage.ENACTMENT__SESSION_ID, oldSessionId, sessionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime()
	{
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime)
	{
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectsPackage.ENACTMENT__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpireTime()
	{
		return expireTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpireTime(Date newExpireTime)
	{
		Date oldExpireTime = expireTime;
		expireTime = newExpireTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectsPackage.ENACTMENT__EXPIRE_TIME, oldExpireTime, expireTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFinishTime()
	{
		return finishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishTime(Date newFinishTime)
	{
		Date oldFinishTime = finishTime;
		finishTime = newFinishTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectsPackage.ENACTMENT__FINISH_TIME, oldFinishTime, finishTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public time getTime()
	{
		if (time != null && time.eIsProxy())
		{
			InternalEObject oldTime = (InternalEObject)time;
			time = (time)eResolveProxy(oldTime);
			if (time != oldTime)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectsPackage.ENACTMENT__TIME, oldTime, time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public time basicGetTime()
	{
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(time newTime)
	{
		time oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectsPackage.ENACTMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ObjectsPackage.ENACTMENT__RESOURCE:
				return getResource();
			case ObjectsPackage.ENACTMENT__SESSION_ID:
				return getSessionId();
			case ObjectsPackage.ENACTMENT__START_TIME:
				return getStartTime();
			case ObjectsPackage.ENACTMENT__EXPIRE_TIME:
				return getExpireTime();
			case ObjectsPackage.ENACTMENT__FINISH_TIME:
				return getFinishTime();
			case ObjectsPackage.ENACTMENT__TIME:
				if (resolve) return getTime();
				return basicGetTime();
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
		switch (featureID)
		{
			case ObjectsPackage.ENACTMENT__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case ObjectsPackage.ENACTMENT__SESSION_ID:
				setSessionId((String)newValue);
				return;
			case ObjectsPackage.ENACTMENT__START_TIME:
				setStartTime((Date)newValue);
				return;
			case ObjectsPackage.ENACTMENT__EXPIRE_TIME:
				setExpireTime((Date)newValue);
				return;
			case ObjectsPackage.ENACTMENT__FINISH_TIME:
				setFinishTime((Date)newValue);
				return;
			case ObjectsPackage.ENACTMENT__TIME:
				setTime((time)newValue);
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
		switch (featureID)
		{
			case ObjectsPackage.ENACTMENT__RESOURCE:
				getResource().clear();
				return;
			case ObjectsPackage.ENACTMENT__SESSION_ID:
				setSessionId(SESSION_ID_EDEFAULT);
				return;
			case ObjectsPackage.ENACTMENT__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case ObjectsPackage.ENACTMENT__EXPIRE_TIME:
				setExpireTime(EXPIRE_TIME_EDEFAULT);
				return;
			case ObjectsPackage.ENACTMENT__FINISH_TIME:
				setFinishTime(FINISH_TIME_EDEFAULT);
				return;
			case ObjectsPackage.ENACTMENT__TIME:
				setTime((time)null);
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
		switch (featureID)
		{
			case ObjectsPackage.ENACTMENT__RESOURCE:
				return resource != null && !resource.isEmpty();
			case ObjectsPackage.ENACTMENT__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? sessionId != null : !SESSION_ID_EDEFAULT.equals(sessionId);
			case ObjectsPackage.ENACTMENT__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case ObjectsPackage.ENACTMENT__EXPIRE_TIME:
				return EXPIRE_TIME_EDEFAULT == null ? expireTime != null : !EXPIRE_TIME_EDEFAULT.equals(expireTime);
			case ObjectsPackage.ENACTMENT__FINISH_TIME:
				return FINISH_TIME_EDEFAULT == null ? finishTime != null : !FINISH_TIME_EDEFAULT.equals(finishTime);
			case ObjectsPackage.ENACTMENT__TIME:
				return time != null;
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
		result.append(" (sessionId: ");
		result.append(sessionId);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", expireTime: ");
		result.append(expireTime);
		result.append(", finishTime: ");
		result.append(finishTime);
		result.append(')');
		return result.toString();
	}

} //EnactmentImpl
