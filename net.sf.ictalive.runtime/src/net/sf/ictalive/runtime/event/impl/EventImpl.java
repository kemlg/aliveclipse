/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.event.impl;

import java.util.Collection;
import java.util.Date;

import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Cause;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.event.Key;
import net.sf.ictalive.runtime.event.PointOfView;

import net.sf.ictalive.runtime.fact.Content;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#getLocalKey <em>Local Key</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#getContent <em>Content</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#getPointOfView <em>Point Of View</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.impl.EventImpl#isMinimized <em>Minimized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EObjectImpl implements Event {
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
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected EList<Cause> provenance;

	/**
	 * The default value of the '{@link #isMinimized() <em>Minimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINIMIZED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMinimized() <em>Minimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimized()
	 * @generated
	 * @ordered
	 */
	protected boolean minimized = MINIMIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getLocalKey() {
		return localKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalKey(Key newLocalKey, NotificationChain msgs) {
		Key oldLocalKey = localKey;
		localKey = newLocalKey;
		if (eNotificationRequired()) {
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
	public void setLocalKey(Key newLocalKey) {
		if (newLocalKey != localKey) {
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
	public Actor getAsserter() {
		if (asserter != null && asserter.eIsProxy()) {
			InternalEObject oldAsserter = (InternalEObject)asserter;
			asserter = (Actor)eResolveProxy(oldAsserter);
			if (asserter != oldAsserter) {
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
	public Actor basicGetAsserter() {
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsserter(Actor newAsserter, NotificationChain msgs) {
		Actor oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired()) {
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
	public void setAsserter(Actor newAsserter) {
		if (newAsserter != asserter) {
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
	public Content getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Content newContent, NotificationChain msgs) {
		Content oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
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
	public void setContent(Content newContent) {
		if (newContent != content) {
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
	public PointOfView getPointOfView() {
		return pointOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfView(PointOfView newPointOfView, NotificationChain msgs) {
		PointOfView oldPointOfView = pointOfView;
		pointOfView = newPointOfView;
		if (eNotificationRequired()) {
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
	public void setPointOfView(PointOfView newPointOfView) {
		if (newPointOfView != pointOfView) {
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
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
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
	public EList<Cause> getProvenance() {
		if (provenance == null) {
			provenance = new EObjectContainmentEList<Cause>(Cause.class, this, EventPackage.EVENT__PROVENANCE);
		}
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinimized() {
		return minimized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimized(boolean newMinimized) {
		boolean oldMinimized = minimized;
		minimized = newMinimized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT__MINIMIZED, oldMinimized, minimized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventPackage.EVENT__LOCAL_KEY:
				return basicSetLocalKey(null, msgs);
			case EventPackage.EVENT__ASSERTER:
				return basicSetAsserter(null, msgs);
			case EventPackage.EVENT__CONTENT:
				return basicSetContent(null, msgs);
			case EventPackage.EVENT__POINT_OF_VIEW:
				return basicSetPointOfView(null, msgs);
			case EventPackage.EVENT__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventPackage.EVENT__LOCAL_KEY:
				return getLocalKey();
			case EventPackage.EVENT__ASSERTER:
				if (resolve) return getAsserter();
				return basicGetAsserter();
			case EventPackage.EVENT__CONTENT:
				return getContent();
			case EventPackage.EVENT__POINT_OF_VIEW:
				return getPointOfView();
			case EventPackage.EVENT__TIMESTAMP:
				return getTimestamp();
			case EventPackage.EVENT__PROVENANCE:
				return getProvenance();
			case EventPackage.EVENT__MINIMIZED:
				return isMinimized();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case EventPackage.EVENT__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case EventPackage.EVENT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Cause>)newValue);
				return;
			case EventPackage.EVENT__MINIMIZED:
				setMinimized((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
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
			case EventPackage.EVENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case EventPackage.EVENT__PROVENANCE:
				getProvenance().clear();
				return;
			case EventPackage.EVENT__MINIMIZED:
				setMinimized(MINIMIZED_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventPackage.EVENT__LOCAL_KEY:
				return localKey != null;
			case EventPackage.EVENT__ASSERTER:
				return asserter != null;
			case EventPackage.EVENT__CONTENT:
				return content != null;
			case EventPackage.EVENT__POINT_OF_VIEW:
				return pointOfView != null;
			case EventPackage.EVENT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case EventPackage.EVENT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EventPackage.EVENT__MINIMIZED:
				return minimized != MINIMIZED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", minimized: ");
		result.append(minimized);
		result.append(')');
		return result.toString();
	}

} //EventImpl
