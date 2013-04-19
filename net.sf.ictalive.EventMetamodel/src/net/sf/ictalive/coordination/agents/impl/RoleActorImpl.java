/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents.impl;

import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.RoleActor;

import net.sf.ictalive.opera.OM.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.RoleActorImpl#getTakeRole <em>Take Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleActorImpl extends ActorImpl implements RoleActor
{
	/**
	 * The cached value of the '{@link #getTakeRole() <em>Take Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeRole()
	 * @generated
	 * @ordered
	 */
	protected Role takeRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleActorImpl()
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
		return AgentsPackage.Literals.ROLE_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getTakeRole()
	{
		if (takeRole != null && takeRole.eIsProxy())
		{
			InternalEObject oldTakeRole = (InternalEObject)takeRole;
			takeRole = (Role)eResolveProxy(oldTakeRole);
			if (takeRole != oldTakeRole)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentsPackage.ROLE_ACTOR__TAKE_ROLE, oldTakeRole, takeRole));
			}
		}
		return takeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetTakeRole()
	{
		return takeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTakeRole(Role newTakeRole)
	{
		Role oldTakeRole = takeRole;
		takeRole = newTakeRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.ROLE_ACTOR__TAKE_ROLE, oldTakeRole, takeRole));
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
			case AgentsPackage.ROLE_ACTOR__TAKE_ROLE:
				if (resolve) return getTakeRole();
				return basicGetTakeRole();
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
			case AgentsPackage.ROLE_ACTOR__TAKE_ROLE:
				setTakeRole((Role)newValue);
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
			case AgentsPackage.ROLE_ACTOR__TAKE_ROLE:
				setTakeRole((Role)null);
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
			case AgentsPackage.ROLE_ACTOR__TAKE_ROLE:
				return takeRole != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleActorImpl
