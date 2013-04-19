/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks.impl;

import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.PlanImpl#getForTask <em>For Task</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.PlanImpl#getHasAtomicProcessGroundingList <em>Has Atomic Process Grounding List</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.PlanImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.PlanImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanImpl extends EObjectImpl implements Plan
{
	/**
	 * The cached value of the '{@link #getForTask() <em>For Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForTask()
	 * @generated
	 * @ordered
	 */
	protected Task forTask;

	/**
	 * The cached value of the '{@link #getHasAtomicProcessGroundingList() <em>Has Atomic Process Grounding List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtomicProcessGroundingList()
	 * @generated
	 * @ordered
	 */
	protected ActionGroundingList hasAtomicProcessGroundingList;

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
	protected PlanImpl()
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
		return TasksPackage.Literals.PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getForTask()
	{
		if (forTask != null && forTask.eIsProxy())
		{
			InternalEObject oldForTask = (InternalEObject)forTask;
			forTask = (Task)eResolveProxy(oldForTask);
			if (forTask != oldForTask)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksPackage.PLAN__FOR_TASK, oldForTask, forTask));
			}
		}
		return forTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetForTask()
	{
		return forTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForTask(Task newForTask)
	{
		Task oldForTask = forTask;
		forTask = newForTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PLAN__FOR_TASK, oldForTask, forTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroundingList getHasAtomicProcessGroundingList()
	{
		return hasAtomicProcessGroundingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAtomicProcessGroundingList(ActionGroundingList newHasAtomicProcessGroundingList, NotificationChain msgs)
	{
		ActionGroundingList oldHasAtomicProcessGroundingList = hasAtomicProcessGroundingList;
		hasAtomicProcessGroundingList = newHasAtomicProcessGroundingList;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST, oldHasAtomicProcessGroundingList, newHasAtomicProcessGroundingList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAtomicProcessGroundingList(ActionGroundingList newHasAtomicProcessGroundingList)
	{
		if (newHasAtomicProcessGroundingList != hasAtomicProcessGroundingList)
		{
			NotificationChain msgs = null;
			if (hasAtomicProcessGroundingList != null)
				msgs = ((InternalEObject)hasAtomicProcessGroundingList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST, null, msgs);
			if (newHasAtomicProcessGroundingList != null)
				msgs = ((InternalEObject)newHasAtomicProcessGroundingList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST, null, msgs);
			msgs = basicSetHasAtomicProcessGroundingList(newHasAtomicProcessGroundingList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST, newHasAtomicProcessGroundingList, newHasAtomicProcessGroundingList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PLAN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion()
	{
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion)
	{
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PLAN__VERSION, oldVersion, version));
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
			case TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST:
				return basicSetHasAtomicProcessGroundingList(null, msgs);
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
			case TasksPackage.PLAN__FOR_TASK:
				if (resolve) return getForTask();
				return basicGetForTask();
			case TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST:
				return getHasAtomicProcessGroundingList();
			case TasksPackage.PLAN__ID:
				return new Integer(getId());
			case TasksPackage.PLAN__VERSION:
				return new Integer(getVersion());
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
			case TasksPackage.PLAN__FOR_TASK:
				setForTask((Task)newValue);
				return;
			case TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST:
				setHasAtomicProcessGroundingList((ActionGroundingList)newValue);
				return;
			case TasksPackage.PLAN__ID:
				setId(((Integer)newValue).intValue());
				return;
			case TasksPackage.PLAN__VERSION:
				setVersion(((Integer)newValue).intValue());
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
			case TasksPackage.PLAN__FOR_TASK:
				setForTask((Task)null);
				return;
			case TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST:
				setHasAtomicProcessGroundingList((ActionGroundingList)null);
				return;
			case TasksPackage.PLAN__ID:
				setId(ID_EDEFAULT);
				return;
			case TasksPackage.PLAN__VERSION:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case TasksPackage.PLAN__FOR_TASK:
				return forTask != null;
			case TasksPackage.PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST:
				return hasAtomicProcessGroundingList != null;
			case TasksPackage.PLAN__ID:
				return id != ID_EDEFAULT;
			case TasksPackage.PLAN__VERSION:
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PlanImpl
