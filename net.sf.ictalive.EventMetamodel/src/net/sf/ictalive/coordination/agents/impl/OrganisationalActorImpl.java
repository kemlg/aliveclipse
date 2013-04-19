/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents.impl;

import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.OrganisationalActor;

import net.sf.ictalive.coordination.tasks.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisational Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.OrganisationalActorImpl#getUndertakeTask <em>Undertake Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationalActorImpl extends ActorImpl implements OrganisationalActor
{
	/**
	 * The cached value of the '{@link #getUndertakeTask() <em>Undertake Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndertakeTask()
	 * @generated
	 * @ordered
	 */
	protected Task undertakeTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationalActorImpl()
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
		return AgentsPackage.Literals.ORGANISATIONAL_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getUndertakeTask()
	{
		if (undertakeTask != null && undertakeTask.eIsProxy())
		{
			InternalEObject oldUndertakeTask = (InternalEObject)undertakeTask;
			undertakeTask = (Task)eResolveProxy(oldUndertakeTask);
			if (undertakeTask != oldUndertakeTask)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentsPackage.ORGANISATIONAL_ACTOR__UNDERTAKE_TASK, oldUndertakeTask, undertakeTask));
			}
		}
		return undertakeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetUndertakeTask()
	{
		return undertakeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndertakeTask(Task newUndertakeTask)
	{
		Task oldUndertakeTask = undertakeTask;
		undertakeTask = newUndertakeTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.ORGANISATIONAL_ACTOR__UNDERTAKE_TASK, oldUndertakeTask, undertakeTask));
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
			case AgentsPackage.ORGANISATIONAL_ACTOR__UNDERTAKE_TASK:
				if (resolve) return getUndertakeTask();
				return basicGetUndertakeTask();
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
			case AgentsPackage.ORGANISATIONAL_ACTOR__UNDERTAKE_TASK:
				setUndertakeTask((Task)newValue);
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
			case AgentsPackage.ORGANISATIONAL_ACTOR__UNDERTAKE_TASK:
				setUndertakeTask((Task)null);
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
			case AgentsPackage.ORGANISATIONAL_ACTOR__UNDERTAKE_TASK:
				return undertakeTask != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganisationalActorImpl
