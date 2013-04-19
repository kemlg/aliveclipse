/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Player;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionNorm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Norm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getFromScene <em>From Scene</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getFromPlayers <em>From Players</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getFromResults <em>From Results</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getToScene <em>To Scene</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getToPlayer <em>To Player</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl#getAttachedTo <em>Attached To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionNormImpl extends EObjectImpl implements TransitionNorm {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromScene() <em>From Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromScene()
	 * @generated
	 * @ordered
	 */
	protected Scene fromScene;

	/**
	 * The cached value of the '{@link #getFromPlayers() <em>From Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> fromPlayers;

	/**
	 * The cached value of the '{@link #getFromResults() <em>From Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Landmark> fromResults;

	/**
	 * The cached value of the '{@link #getToScene() <em>To Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToScene()
	 * @generated
	 * @ordered
	 */
	protected Scene toScene;

	/**
	 * The cached value of the '{@link #getToPlayer() <em>To Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player toPlayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionNormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.TRANSITION_NORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION_NORM__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene getFromScene() {
		if (fromScene != null && fromScene.eIsProxy()) {
			InternalEObject oldFromScene = (InternalEObject)fromScene;
			fromScene = (Scene)eResolveProxy(oldFromScene);
			if (fromScene != oldFromScene) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.TRANSITION_NORM__FROM_SCENE, oldFromScene, fromScene));
			}
		}
		return fromScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene basicGetFromScene() {
		return fromScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromScene(Scene newFromScene) {
		Scene oldFromScene = fromScene;
		fromScene = newFromScene;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION_NORM__FROM_SCENE, oldFromScene, fromScene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getFromPlayers() {
		if (fromPlayers == null) {
			fromPlayers = new EObjectResolvingEList<Player>(Player.class, this, OMPackage.TRANSITION_NORM__FROM_PLAYERS);
		}
		return fromPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Landmark> getFromResults() {
		if (fromResults == null) {
			fromResults = new EObjectResolvingEList<Landmark>(Landmark.class, this, OMPackage.TRANSITION_NORM__FROM_RESULTS);
		}
		return fromResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene getToScene() {
		if (toScene != null && toScene.eIsProxy()) {
			InternalEObject oldToScene = (InternalEObject)toScene;
			toScene = (Scene)eResolveProxy(oldToScene);
			if (toScene != oldToScene) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.TRANSITION_NORM__TO_SCENE, oldToScene, toScene));
			}
		}
		return toScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene basicGetToScene() {
		return toScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToScene(Scene newToScene) {
		Scene oldToScene = toScene;
		toScene = newToScene;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION_NORM__TO_SCENE, oldToScene, toScene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getToPlayer() {
		if (toPlayer != null && toPlayer.eIsProxy()) {
			InternalEObject oldToPlayer = (InternalEObject)toPlayer;
			toPlayer = (Player)eResolveProxy(oldToPlayer);
			if (toPlayer != oldToPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.TRANSITION_NORM__TO_PLAYER, oldToPlayer, toPlayer));
			}
		}
		return toPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetToPlayer() {
		return toPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPlayer(Player newToPlayer) {
		Player oldToPlayer = toPlayer;
		toPlayer = newToPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION_NORM__TO_PLAYER, oldToPlayer, toPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getAttachedTo() {
		Transition attachedTo = basicGetAttachedTo();
		return attachedTo != null && attachedTo.eIsProxy() ? (Transition)eResolveProxy((InternalEObject)attachedTo) : attachedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Transition basicGetAttachedTo() {
		EList<Transition> transitions = ((OM)eContainer().eContainer()).getIs().getTransitions();
		
		for(Transition trans : transitions) {
			if(trans.getNorms().contains(this))
				return trans;
		}
		return null;
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAttachedTo(Transition newAttachedTo) {
		Transition oldTransition = getAttachedTo();
		
		EList<TransitionNorm> norms = newAttachedTo.getNorms();
		if (norms.contains(this))
			return;
		norms.add(this);

		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.TRANSITION__NORMS, oldTransition, newAttachedTo));
		}
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.TRANSITION_NORM__ID:
				return getID();
			case OMPackage.TRANSITION_NORM__FROM_SCENE:
				if (resolve) return getFromScene();
				return basicGetFromScene();
			case OMPackage.TRANSITION_NORM__FROM_PLAYERS:
				return getFromPlayers();
			case OMPackage.TRANSITION_NORM__FROM_RESULTS:
				return getFromResults();
			case OMPackage.TRANSITION_NORM__TO_SCENE:
				if (resolve) return getToScene();
				return basicGetToScene();
			case OMPackage.TRANSITION_NORM__TO_PLAYER:
				if (resolve) return getToPlayer();
				return basicGetToPlayer();
			case OMPackage.TRANSITION_NORM__ATTACHED_TO:
				if (resolve) return getAttachedTo();
				return basicGetAttachedTo();
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
			case OMPackage.TRANSITION_NORM__ID:
				setID((String)newValue);
				return;
			case OMPackage.TRANSITION_NORM__FROM_SCENE:
				setFromScene((Scene)newValue);
				return;
			case OMPackage.TRANSITION_NORM__FROM_PLAYERS:
				getFromPlayers().clear();
				getFromPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case OMPackage.TRANSITION_NORM__FROM_RESULTS:
				getFromResults().clear();
				getFromResults().addAll((Collection<? extends Landmark>)newValue);
				return;
			case OMPackage.TRANSITION_NORM__TO_SCENE:
				setToScene((Scene)newValue);
				return;
			case OMPackage.TRANSITION_NORM__TO_PLAYER:
				setToPlayer((Player)newValue);
				return;
			case OMPackage.TRANSITION_NORM__ATTACHED_TO:
				setAttachedTo((Transition)newValue);
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
			case OMPackage.TRANSITION_NORM__ID:
				setID(ID_EDEFAULT);
				return;
			case OMPackage.TRANSITION_NORM__FROM_SCENE:
				setFromScene((Scene)null);
				return;
			case OMPackage.TRANSITION_NORM__FROM_PLAYERS:
				getFromPlayers().clear();
				return;
			case OMPackage.TRANSITION_NORM__FROM_RESULTS:
				getFromResults().clear();
				return;
			case OMPackage.TRANSITION_NORM__TO_SCENE:
				setToScene((Scene)null);
				return;
			case OMPackage.TRANSITION_NORM__TO_PLAYER:
				setToPlayer((Player)null);
				return;
			case OMPackage.TRANSITION_NORM__ATTACHED_TO:
				setAttachedTo((Transition)null);
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
			case OMPackage.TRANSITION_NORM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OMPackage.TRANSITION_NORM__FROM_SCENE:
				return fromScene != null;
			case OMPackage.TRANSITION_NORM__FROM_PLAYERS:
				return fromPlayers != null && !fromPlayers.isEmpty();
			case OMPackage.TRANSITION_NORM__FROM_RESULTS:
				return fromResults != null && !fromResults.isEmpty();
			case OMPackage.TRANSITION_NORM__TO_SCENE:
				return toScene != null;
			case OMPackage.TRANSITION_NORM__TO_PLAYER:
				return toPlayer != null;
			case OMPackage.TRANSITION_NORM__ATTACHED_TO:
				return basicGetAttachedTo() != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TransitionNormImpl
