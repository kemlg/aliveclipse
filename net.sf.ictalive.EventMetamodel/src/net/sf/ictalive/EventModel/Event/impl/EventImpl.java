/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Event.impl;

import java.util.Date;

import net.sf.ictalive.EventModel.Event.Actor;
import net.sf.ictalive.EventModel.Event.EncodingStyle;
import net.sf.ictalive.EventModel.Event.Event;
import net.sf.ictalive.EventModel.Event.EventPackage;
import net.sf.ictalive.EventModel.Event.Key;
import net.sf.ictalive.EventModel.Event.Language;
import net.sf.ictalive.EventModel.Event.PointOfView;

import net.sf.ictalive.EventModel.Fact.Content;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getLocalKey <em>Local Key</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getContent <em>Content</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getPointOfView <em>Point Of View</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.EventImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EObjectImpl implements Event
{
	/**
	 * The cached value of the '{@link #getLocalKey() <em>Local Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalKey()
	 * @generated
	 * @ordered
	 */
	protected Key localKey;

	/**
	 * The cached value of the '{@link #getAsserter() <em>Asserter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserter()
	 * @generated
	 * @ordered
	 */
	protected Actor asserter;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Content content;

	/**
	 * The cached value of the '{@link #getPointOfView() <em>Point Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfView()
	 * @generated
	 * @ordered
	 */
	protected PointOfView pointOfView;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final EncodingStyle ENCODING_EDEFAULT = EncodingStyle.PLAIN_TEXT;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EncodingStyle encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl()
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
		return EventPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getLocalKey()
	{
		return localKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalKey(Key newLocalKey, NotificationChain msgs)
	{
		Key oldLocalKey = localKey;
		localKey = newLocalKey;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__LOCAL_KEY, oldLocalKey, newLocalKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalKey(Key newLocalKey)
	{
		if (newLocalKey != localKey)
		{
			NotificationChain msgs = null;
			if (localKey != null)
				msgs = ((InternalEObject)localKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__LOCAL_KEY, null, msgs);
			if (newLocalKey != null)
				msgs = ((InternalEObject)newLocalKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__LOCAL_KEY, null, msgs);
			msgs = basicSetLocalKey(newLocalKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__LOCAL_KEY, newLocalKey, newLocalKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getAsserter()
	{
		if (asserter != null && asserter.eIsProxy())
		{
			InternalEObject oldAsserter = (InternalEObject)asserter;
			asserter = (Actor)eResolveProxy(oldAsserter);
			if (asserter != oldAsserter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.EVENT__ASSERTER, oldAsserter, asserter));
			}
		}
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetAsserter()
	{
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsserter(Actor newAsserter, NotificationChain msgs)
	{
		Actor oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__ASSERTER, oldAsserter, newAsserter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsserter(Actor newAsserter)
	{
		if (newAsserter != asserter)
		{
			NotificationChain msgs = null;
			if (asserter != null)
				msgs = ((InternalEObject)asserter).eInverseRemove(this, EventPackage.ACTOR__EMIT, Actor.class, msgs);
			if (newAsserter != null)
				msgs = ((InternalEObject)newAsserter).eInverseAdd(this, EventPackage.ACTOR__EMIT, Actor.class, msgs);
			msgs = basicSetAsserter(newAsserter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__ASSERTER, newAsserter, newAsserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getContent()
	{
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Content newContent, NotificationChain msgs)
	{
		Content oldContent = content;
		content = newContent;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Content newContent)
	{
		if (newContent != content)
		{
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfView getPointOfView()
	{
		return pointOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfView(PointOfView newPointOfView, NotificationChain msgs)
	{
		PointOfView oldPointOfView = pointOfView;
		pointOfView = newPointOfView;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__POINT_OF_VIEW, oldPointOfView, newPointOfView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfView(PointOfView newPointOfView)
	{
		if (newPointOfView != pointOfView)
		{
			NotificationChain msgs = null;
			if (pointOfView != null)
				msgs = ((InternalEObject)pointOfView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__POINT_OF_VIEW, null, msgs);
			if (newPointOfView != null)
				msgs = ((InternalEObject)newPointOfView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__POINT_OF_VIEW, null, msgs);
			msgs = basicSetPointOfView(newPointOfView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__POINT_OF_VIEW, newPointOfView, newPointOfView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage()
	{
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Language newLanguage, NotificationChain msgs)
	{
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage)
	{
		if (newLanguage != language)
		{
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.EVENT__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingStyle getEncoding()
	{
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(EncodingStyle newEncoding)
	{
		EncodingStyle oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp()
	{
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp)
	{
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case EventPackage.EVENT__ASSERTER:
				if (asserter != null)
					msgs = ((InternalEObject)asserter).eInverseRemove(this, EventPackage.ACTOR__EMIT, Actor.class, msgs);
				return basicSetAsserter((Actor)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case EventPackage.EVENT__LOCAL_KEY:
				return basicSetLocalKey(null, msgs);
			case EventPackage.EVENT__ASSERTER:
				return basicSetAsserter(null, msgs);
			case EventPackage.EVENT__CONTENT:
				return basicSetContent(null, msgs);
			case EventPackage.EVENT__POINT_OF_VIEW:
				return basicSetPointOfView(null, msgs);
			case EventPackage.EVENT__LANGUAGE:
				return basicSetLanguage(null, msgs);
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
		switch (featureID)
		{
			case EventPackage.EVENT__LOCAL_KEY:
				return getLocalKey();
			case EventPackage.EVENT__ASSERTER:
				if (resolve) return getAsserter();
				return basicGetAsserter();
			case EventPackage.EVENT__CONTENT:
				return getContent();
			case EventPackage.EVENT__POINT_OF_VIEW:
				return getPointOfView();
			case EventPackage.EVENT__LANGUAGE:
				return getLanguage();
			case EventPackage.EVENT__ENCODING:
				return getEncoding();
			case EventPackage.EVENT__TIMESTAMP:
				return getTimestamp();
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
		switch (featureID)
		{
			case EventPackage.EVENT__LOCAL_KEY:
				setLocalKey((Key)newValue);
				return;
			case EventPackage.EVENT__ASSERTER:
				setAsserter((Actor)newValue);
				return;
			case EventPackage.EVENT__CONTENT:
				setContent((Content)newValue);
				return;
			case EventPackage.EVENT__POINT_OF_VIEW:
				setPointOfView((PointOfView)newValue);
				return;
			case EventPackage.EVENT__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case EventPackage.EVENT__ENCODING:
				setEncoding((EncodingStyle)newValue);
				return;
			case EventPackage.EVENT__TIMESTAMP:
				setTimestamp((Date)newValue);
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
			case EventPackage.EVENT__LOCAL_KEY:
				setLocalKey((Key)null);
				return;
			case EventPackage.EVENT__ASSERTER:
				setAsserter((Actor)null);
				return;
			case EventPackage.EVENT__CONTENT:
				setContent((Content)null);
				return;
			case EventPackage.EVENT__POINT_OF_VIEW:
				setPointOfView((PointOfView)null);
				return;
			case EventPackage.EVENT__LANGUAGE:
				setLanguage((Language)null);
				return;
			case EventPackage.EVENT__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case EventPackage.EVENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case EventPackage.EVENT__LOCAL_KEY:
				return localKey != null;
			case EventPackage.EVENT__ASSERTER:
				return asserter != null;
			case EventPackage.EVENT__CONTENT:
				return content != null;
			case EventPackage.EVENT__POINT_OF_VIEW:
				return pointOfView != null;
			case EventPackage.EVENT__LANGUAGE:
				return language != null;
			case EventPackage.EVENT__ENCODING:
				return encoding != ENCODING_EDEFAULT;
			case EventPackage.EVENT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (encoding: ");
		result.append(encoding);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //EventImpl
