/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import net.sf.ictalive.EventModel.Action.Action;

import net.sf.ictalive.EventModel.Fact.Fact;
import net.sf.ictalive.EventModel.Fact.FactPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.FactImpl#getDueTo <em>Due To</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.FactImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.FactImpl#getRelate <em>Relate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FactImpl extends EObjectImpl implements Fact
{
	/**
	 * The cached value of the '{@link #getDueTo() <em>Due To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueTo()
	 * @generated
	 * @ordered
	 */
	protected Action dueTo;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected Action effect;

	/**
	 * The cached value of the '{@link #getRelate() <em>Relate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelate()
	 * @generated
	 * @ordered
	 */
	protected Fact relate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactImpl()
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
		return FactPackage.Literals.FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getDueTo()
	{
		if (dueTo != null && dueTo.eIsProxy())
		{
			InternalEObject oldDueTo = (InternalEObject)dueTo;
			dueTo = (Action)eResolveProxy(oldDueTo);
			if (dueTo != oldDueTo)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.FACT__DUE_TO, oldDueTo, dueTo));
			}
		}
		return dueTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetDueTo()
	{
		return dueTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueTo(Action newDueTo)
	{
		Action oldDueTo = dueTo;
		dueTo = newDueTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.FACT__DUE_TO, oldDueTo, dueTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getEffect()
	{
		if (effect != null && effect.eIsProxy())
		{
			InternalEObject oldEffect = (InternalEObject)effect;
			effect = (Action)eResolveProxy(oldEffect);
			if (effect != oldEffect)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.FACT__EFFECT, oldEffect, effect));
			}
		}
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetEffect()
	{
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(Action newEffect)
	{
		Action oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.FACT__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact getRelate()
	{
		return relate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelate(Fact newRelate, NotificationChain msgs)
	{
		Fact oldRelate = relate;
		relate = newRelate;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactPackage.FACT__RELATE, oldRelate, newRelate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelate(Fact newRelate)
	{
		if (newRelate != relate)
		{
			NotificationChain msgs = null;
			if (relate != null)
				msgs = ((InternalEObject)relate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactPackage.FACT__RELATE, null, msgs);
			if (newRelate != null)
				msgs = ((InternalEObject)newRelate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactPackage.FACT__RELATE, null, msgs);
			msgs = basicSetRelate(newRelate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.FACT__RELATE, newRelate, newRelate));
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
			case FactPackage.FACT__RELATE:
				return basicSetRelate(null, msgs);
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
			case FactPackage.FACT__DUE_TO:
				if (resolve) return getDueTo();
				return basicGetDueTo();
			case FactPackage.FACT__EFFECT:
				if (resolve) return getEffect();
				return basicGetEffect();
			case FactPackage.FACT__RELATE:
				return getRelate();
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
			case FactPackage.FACT__DUE_TO:
				setDueTo((Action)newValue);
				return;
			case FactPackage.FACT__EFFECT:
				setEffect((Action)newValue);
				return;
			case FactPackage.FACT__RELATE:
				setRelate((Fact)newValue);
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
			case FactPackage.FACT__DUE_TO:
				setDueTo((Action)null);
				return;
			case FactPackage.FACT__EFFECT:
				setEffect((Action)null);
				return;
			case FactPackage.FACT__RELATE:
				setRelate((Fact)null);
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
			case FactPackage.FACT__DUE_TO:
				return dueTo != null;
			case FactPackage.FACT__EFFECT:
				return effect != null;
			case FactPackage.FACT__RELATE:
				return relate != null;
		}
		return super.eIsSet(featureID);
	}

} //FactImpl
