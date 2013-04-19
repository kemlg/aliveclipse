/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import java.util.Collection;

import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.Parameter;
import net.sf.ictalive.runtime.action.Result;

import net.sf.ictalive.runtime.enactment.Enactment;

import net.sf.ictalive.runtime.event.Actor;

import net.sf.ictalive.runtime.fact.Fact;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ActionImpl#getByActor <em>By Actor</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ActionImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ActionImpl#getEnactment <em>Enactment</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ActionImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends EObjectImpl implements Action {
	/**
	 * The cached value of the '{@link #getByActor() <em>By Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByActor()
	 * @generated
	 * @ordered
	 */
	protected Actor byActor;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected Fact cause;

	/**
	 * The cached value of the '{@link #getEnactment() <em>Enactment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnactment()
	 * @generated
	 * @ordered
	 */
	protected EList<Enactment> enactment;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> result;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getByActor() {
		if (byActor != null && byActor.eIsProxy()) {
			InternalEObject oldByActor = (InternalEObject)byActor;
			byActor = (Actor)eResolveProxy(oldByActor);
			if (byActor != oldByActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.ACTION__BY_ACTOR, oldByActor, byActor));
			}
		}
		return byActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetByActor() {
		return byActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByActor(Actor newByActor) {
		Actor oldByActor = byActor;
		byActor = newByActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.ACTION__BY_ACTOR, oldByActor, byActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact getCause() {
		if (cause != null && cause.eIsProxy()) {
			InternalEObject oldCause = (InternalEObject)cause;
			cause = (Fact)eResolveProxy(oldCause);
			if (cause != oldCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.ACTION__CAUSE, oldCause, cause));
			}
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact basicGetCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(Fact newCause) {
		Fact oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.ACTION__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enactment> getEnactment() {
		if (enactment == null) {
			enactment = new EObjectResolvingEList<Enactment>(Enactment.class, this, ActionPackage.ACTION__ENACTMENT);
		}
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Result> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<Result>(Result.class, this, ActionPackage.ACTION__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Parameter>(Parameter.class, this, ActionPackage.ACTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionPackage.ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case ActionPackage.ACTION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
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
			case ActionPackage.ACTION__BY_ACTOR:
				if (resolve) return getByActor();
				return basicGetByActor();
			case ActionPackage.ACTION__CAUSE:
				if (resolve) return getCause();
				return basicGetCause();
			case ActionPackage.ACTION__ENACTMENT:
				return getEnactment();
			case ActionPackage.ACTION__RESULT:
				return getResult();
			case ActionPackage.ACTION__INPUT:
				return getInput();
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
			case ActionPackage.ACTION__BY_ACTOR:
				setByActor((Actor)newValue);
				return;
			case ActionPackage.ACTION__CAUSE:
				setCause((Fact)newValue);
				return;
			case ActionPackage.ACTION__ENACTMENT:
				getEnactment().clear();
				getEnactment().addAll((Collection<? extends Enactment>)newValue);
				return;
			case ActionPackage.ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Result>)newValue);
				return;
			case ActionPackage.ACTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Parameter>)newValue);
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
			case ActionPackage.ACTION__BY_ACTOR:
				setByActor((Actor)null);
				return;
			case ActionPackage.ACTION__CAUSE:
				setCause((Fact)null);
				return;
			case ActionPackage.ACTION__ENACTMENT:
				getEnactment().clear();
				return;
			case ActionPackage.ACTION__RESULT:
				getResult().clear();
				return;
			case ActionPackage.ACTION__INPUT:
				getInput().clear();
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
			case ActionPackage.ACTION__BY_ACTOR:
				return byActor != null;
			case ActionPackage.ACTION__CAUSE:
				return cause != null;
			case ActionPackage.ACTION__ENACTMENT:
				return enactment != null && !enactment.isEmpty();
			case ActionPackage.ACTION__RESULT:
				return result != null && !result.isEmpty();
			case ActionPackage.ACTION__INPUT:
				return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
