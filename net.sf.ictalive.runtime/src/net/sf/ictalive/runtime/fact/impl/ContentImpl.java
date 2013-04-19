/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import java.util.Collection;

import net.sf.ictalive.runtime.action.Action;

import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.FactPackage;

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
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.ContentImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.ContentImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends EObjectImpl implements Content {
	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected Fact fact;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> effect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact getFact() {
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFact(Fact newFact, NotificationChain msgs) {
		Fact oldFact = fact;
		fact = newFact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactPackage.CONTENT__FACT, oldFact, newFact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFact(Fact newFact) {
		if (newFact != fact) {
			NotificationChain msgs = null;
			if (fact != null)
				msgs = ((InternalEObject)fact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactPackage.CONTENT__FACT, null, msgs);
			if (newFact != null)
				msgs = ((InternalEObject)newFact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactPackage.CONTENT__FACT, null, msgs);
			msgs = basicSetFact(newFact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.CONTENT__FACT, newFact, newFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getEffect() {
		if (effect == null) {
			effect = new EObjectContainmentEList<Action>(Action.class, this, FactPackage.CONTENT__EFFECT);
		}
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactPackage.CONTENT__FACT:
				return basicSetFact(null, msgs);
			case FactPackage.CONTENT__EFFECT:
				return ((InternalEList<?>)getEffect()).basicRemove(otherEnd, msgs);
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
			case FactPackage.CONTENT__FACT:
				return getFact();
			case FactPackage.CONTENT__EFFECT:
				return getEffect();
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
			case FactPackage.CONTENT__FACT:
				setFact((Fact)newValue);
				return;
			case FactPackage.CONTENT__EFFECT:
				getEffect().clear();
				getEffect().addAll((Collection<? extends Action>)newValue);
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
			case FactPackage.CONTENT__FACT:
				setFact((Fact)null);
				return;
			case FactPackage.CONTENT__EFFECT:
				getEffect().clear();
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
			case FactPackage.CONTENT__FACT:
				return fact != null;
			case FactPackage.CONTENT__EFFECT:
				return effect != null && !effect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentImpl
