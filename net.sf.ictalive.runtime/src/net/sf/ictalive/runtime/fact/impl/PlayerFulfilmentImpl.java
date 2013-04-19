/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.operetta.OM.Player;

import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.PlayerFulfilment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.PlayerFulfilmentImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.PlayerFulfilmentImpl#isSatisfy <em>Satisfy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerFulfilmentImpl extends OrganisationActImpl implements PlayerFulfilment {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The default value of the '{@link #isSatisfy() <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISFY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSatisfy() <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfy()
	 * @generated
	 * @ordered
	 */
	protected boolean satisfy = SATISFY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerFulfilmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.PLAYER_FULFILMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (Player)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.PLAYER_FULFILMENT__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.PLAYER_FULFILMENT__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfy() {
		return satisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfy(boolean newSatisfy) {
		boolean oldSatisfy = satisfy;
		satisfy = newSatisfy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.PLAYER_FULFILMENT__SATISFY, oldSatisfy, satisfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.PLAYER_FULFILMENT__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case FactPackage.PLAYER_FULFILMENT__SATISFY:
				return isSatisfy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FactPackage.PLAYER_FULFILMENT__PLAYER:
				setPlayer((Player)newValue);
				return;
			case FactPackage.PLAYER_FULFILMENT__SATISFY:
				setSatisfy((Boolean)newValue);
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
			case FactPackage.PLAYER_FULFILMENT__PLAYER:
				setPlayer((Player)null);
				return;
			case FactPackage.PLAYER_FULFILMENT__SATISFY:
				setSatisfy(SATISFY_EDEFAULT);
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
			case FactPackage.PLAYER_FULFILMENT__PLAYER:
				return player != null;
			case FactPackage.PLAYER_FULFILMENT__SATISFY:
				return satisfy != SATISFY_EDEFAULT;
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
		result.append(" (satisfy: ");
		result.append(satisfy);
		result.append(')');
		return result.toString();
	}

} //PlayerFulfilmentImpl
