/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.ActionResult;
import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.Expression;

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
 * An implementation of the model object '<em><b>Action Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl#getInCondition <em>In Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl#getHasAddEffect <em>Has Add Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl#getHasDeleteEffect <em>Has Delete Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionResultImpl extends EObjectImpl implements ActionResult {
	/**
	 * The cached value of the '{@link #getInCondition() <em>In Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> inCondition;

	/**
	 * The cached value of the '{@link #getHasAddEffect() <em>Has Add Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAddEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> hasAddEffect;

	/**
	 * The cached value of the '{@link #getHasDeleteEffect() <em>Has Delete Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDeleteEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> hasDeleteEffect;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ACTION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getInCondition() {
		if (inCondition == null) {
			inCondition = new EObjectContainmentEList<Condition>(Condition.class, this, ActionsPackage.ACTION_RESULT__IN_CONDITION);
		}
		return inCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getHasAddEffect() {
		if (hasAddEffect == null) {
			hasAddEffect = new EObjectContainmentEList<Expression>(Expression.class, this, ActionsPackage.ACTION_RESULT__HAS_ADD_EFFECT);
		}
		return hasAddEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getHasDeleteEffect() {
		if (hasDeleteEffect == null) {
			hasDeleteEffect = new EObjectContainmentEList<Expression>(Expression.class, this, ActionsPackage.ACTION_RESULT__HAS_DELETE_EFFECT);
		}
		return hasDeleteEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ACTION_RESULT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ACTION_RESULT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.ACTION_RESULT__IN_CONDITION:
				return ((InternalEList<?>)getInCondition()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACTION_RESULT__HAS_ADD_EFFECT:
				return ((InternalEList<?>)getHasAddEffect()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACTION_RESULT__HAS_DELETE_EFFECT:
				return ((InternalEList<?>)getHasDeleteEffect()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.ACTION_RESULT__IN_CONDITION:
				return getInCondition();
			case ActionsPackage.ACTION_RESULT__HAS_ADD_EFFECT:
				return getHasAddEffect();
			case ActionsPackage.ACTION_RESULT__HAS_DELETE_EFFECT:
				return getHasDeleteEffect();
			case ActionsPackage.ACTION_RESULT__ID:
				return getId();
			case ActionsPackage.ACTION_RESULT__VERSION:
				return getVersion();
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
			case ActionsPackage.ACTION_RESULT__IN_CONDITION:
				getInCondition().clear();
				getInCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case ActionsPackage.ACTION_RESULT__HAS_ADD_EFFECT:
				getHasAddEffect().clear();
				getHasAddEffect().addAll((Collection<? extends Expression>)newValue);
				return;
			case ActionsPackage.ACTION_RESULT__HAS_DELETE_EFFECT:
				getHasDeleteEffect().clear();
				getHasDeleteEffect().addAll((Collection<? extends Expression>)newValue);
				return;
			case ActionsPackage.ACTION_RESULT__ID:
				setId((Integer)newValue);
				return;
			case ActionsPackage.ACTION_RESULT__VERSION:
				setVersion((Integer)newValue);
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
			case ActionsPackage.ACTION_RESULT__IN_CONDITION:
				getInCondition().clear();
				return;
			case ActionsPackage.ACTION_RESULT__HAS_ADD_EFFECT:
				getHasAddEffect().clear();
				return;
			case ActionsPackage.ACTION_RESULT__HAS_DELETE_EFFECT:
				getHasDeleteEffect().clear();
				return;
			case ActionsPackage.ACTION_RESULT__ID:
				setId(ID_EDEFAULT);
				return;
			case ActionsPackage.ACTION_RESULT__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ActionsPackage.ACTION_RESULT__IN_CONDITION:
				return inCondition != null && !inCondition.isEmpty();
			case ActionsPackage.ACTION_RESULT__HAS_ADD_EFFECT:
				return hasAddEffect != null && !hasAddEffect.isEmpty();
			case ActionsPackage.ACTION_RESULT__HAS_DELETE_EFFECT:
				return hasDeleteEffect != null && !hasDeleteEffect.isEmpty();
			case ActionsPackage.ACTION_RESULT__ID:
				return id != ID_EDEFAULT;
			case ActionsPackage.ACTION_RESULT__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ActionResultImpl
