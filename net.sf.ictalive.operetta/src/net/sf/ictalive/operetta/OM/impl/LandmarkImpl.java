/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.Scene;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landmark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.LandmarkImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.LandmarkImpl#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.LandmarkImpl#getEntails <em>Entails</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.LandmarkImpl#isIsResult <em>Is Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandmarkImpl extends EObjectImpl implements Landmark {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateDescription() <em>State Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDescription()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription stateDescription;

	/**
	 * The cached value of the '{@link #getEntails() <em>Entails</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntails()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> entails;

	/**
	 * The default value of the '{@link #isIsResult() <em>Is Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESULT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandmarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.LANDMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.LANDMARK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getStateDescription() {
		if (stateDescription != null && stateDescription.eIsProxy()) {
			InternalEObject oldStateDescription = (InternalEObject)stateDescription;
			stateDescription = (PartialStateDescription)eResolveProxy(oldStateDescription);
			if (stateDescription != oldStateDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.LANDMARK__STATE_DESCRIPTION, oldStateDescription, stateDescription));
			}
		}
		return stateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetStateDescription() {
		return stateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDescription(PartialStateDescription newStateDescription) {
		PartialStateDescription oldStateDescription = stateDescription;
		stateDescription = newStateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.LANDMARK__STATE_DESCRIPTION, oldStateDescription, stateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getEntails() {
		if (entails == null) {
			entails = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.LANDMARK__ENTAILS);
		}
		return entails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isIsResult() {
		
		Scene scene = (Scene)eContainer().eContainer();
		if(scene.getResults().contains(this))
			return true;
		else
			return IS_RESULT_EDEFAULT;
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsResult(boolean newIsResult) {
		
		boolean oldIsResult = isIsResult();
		
		Scene scene = (Scene)eContainer().eContainer();
		EList<Landmark> resultLMs = scene.getResults();
		if(oldIsResult != newIsResult) {//we changed something
			if(newIsResult) {//we added it
				resultLMs.add(this);
			} else { // we removed it
				resultLMs.remove(this);
			}
		} //if nothing changed, we don't have to change the result list of the scene.
//		throw new UnsupportedOperationException();
	
		// notification added by hand, since it is not generated for volatile properties.
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.LANDMARK__IS_RESULT, oldIsResult, newIsResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.LANDMARK__NAME:
				return getName();
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				if (resolve) return getStateDescription();
				return basicGetStateDescription();
			case OMPackage.LANDMARK__ENTAILS:
				return getEntails();
			case OMPackage.LANDMARK__IS_RESULT:
				return isIsResult();
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
			case OMPackage.LANDMARK__NAME:
				setName((String)newValue);
				return;
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				setStateDescription((PartialStateDescription)newValue);
				return;
			case OMPackage.LANDMARK__ENTAILS:
				getEntails().clear();
				getEntails().addAll((Collection<? extends Objective>)newValue);
				return;
			case OMPackage.LANDMARK__IS_RESULT:
				setIsResult((Boolean)newValue);
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
			case OMPackage.LANDMARK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				setStateDescription((PartialStateDescription)null);
				return;
			case OMPackage.LANDMARK__ENTAILS:
				getEntails().clear();
				return;
			case OMPackage.LANDMARK__IS_RESULT:
				setIsResult(IS_RESULT_EDEFAULT);
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
			case OMPackage.LANDMARK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				return stateDescription != null;
			case OMPackage.LANDMARK__ENTAILS:
				return entails != null && !entails.isEmpty();
			case OMPackage.LANDMARK__IS_RESULT:
				return isIsResult() != IS_RESULT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LandmarkImpl
