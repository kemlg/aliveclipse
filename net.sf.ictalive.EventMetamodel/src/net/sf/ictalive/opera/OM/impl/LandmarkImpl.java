/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.impl;

import java.util.Collection;

import net.sf.ictalive.opera.OM.Landmark;
import net.sf.ictalive.opera.OM.OMPackage;
import net.sf.ictalive.opera.OM.Objective;
import net.sf.ictalive.opera.OM.PartialStateDescription;

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
 *   <li>{@link net.sf.ictalive.opera.OM.impl.LandmarkImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.LandmarkImpl#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.LandmarkImpl#getEntails <em>Entails</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandmarkImpl extends EObjectImpl implements Landmark
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandmarkImpl()
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
		return OMPackage.Literals.LANDMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
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
	public PartialStateDescription getStateDescription()
	{
		if (stateDescription != null && stateDescription.eIsProxy())
		{
			InternalEObject oldStateDescription = (InternalEObject)stateDescription;
			stateDescription = (PartialStateDescription)eResolveProxy(oldStateDescription);
			if (stateDescription != oldStateDescription)
			{
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
	public PartialStateDescription basicGetStateDescription()
	{
		return stateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDescription(PartialStateDescription newStateDescription)
	{
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
	public EList<Objective> getEntails()
	{
		if (entails == null)
		{
			entails = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.LANDMARK__ENTAILS);
		}
		return entails;
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
			case OMPackage.LANDMARK__NAME:
				return getName();
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				if (resolve) return getStateDescription();
				return basicGetStateDescription();
			case OMPackage.LANDMARK__ENTAILS:
				return getEntails();
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
			case OMPackage.LANDMARK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				setStateDescription((PartialStateDescription)null);
				return;
			case OMPackage.LANDMARK__ENTAILS:
				getEntails().clear();
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
			case OMPackage.LANDMARK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMPackage.LANDMARK__STATE_DESCRIPTION:
				return stateDescription != null;
			case OMPackage.LANDMARK__ENTAILS:
				return entails != null && !entails.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LandmarkImpl
