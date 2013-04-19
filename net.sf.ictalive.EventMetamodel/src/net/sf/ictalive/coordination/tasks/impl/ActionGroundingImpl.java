/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.TasksPackage;

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
 * An implementation of the model object '<em><b>Action Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl#getOwlsProcess <em>Owls Process</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl#getInput <em>Input</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionGroundingImpl extends EObjectImpl implements ActionGrounding
{
	/**
	 * The cached value of the '{@link #getOwlsProcess() <em>Owls Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlsProcess()
	 * @generated
	 * @ordered
	 */
	protected Action owlsProcess;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputMessageMap> input;

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
	protected ActionGroundingImpl()
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
		return TasksPackage.Literals.ACTION_GROUNDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getOwlsProcess()
	{
		if (owlsProcess != null && owlsProcess.eIsProxy())
		{
			InternalEObject oldOwlsProcess = (InternalEObject)owlsProcess;
			owlsProcess = (Action)eResolveProxy(oldOwlsProcess);
			if (owlsProcess != oldOwlsProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksPackage.ACTION_GROUNDING__OWLS_PROCESS, oldOwlsProcess, owlsProcess));
			}
		}
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetOwlsProcess()
	{
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwlsProcess(Action newOwlsProcess)
	{
		Action oldOwlsProcess = owlsProcess;
		owlsProcess = newOwlsProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.ACTION_GROUNDING__OWLS_PROCESS, oldOwlsProcess, owlsProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputMessageMap> getInput()
	{
		if (input == null)
		{
			input = new EObjectContainmentEList<InputMessageMap>(InputMessageMap.class, this, TasksPackage.ACTION_GROUNDING__INPUT);
		}
		return input;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.ACTION_GROUNDING__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.ACTION_GROUNDING__VERSION, oldVersion, version));
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
			case TasksPackage.ACTION_GROUNDING__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
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
			case TasksPackage.ACTION_GROUNDING__OWLS_PROCESS:
				if (resolve) return getOwlsProcess();
				return basicGetOwlsProcess();
			case TasksPackage.ACTION_GROUNDING__INPUT:
				return getInput();
			case TasksPackage.ACTION_GROUNDING__ID:
				return new Integer(getId());
			case TasksPackage.ACTION_GROUNDING__VERSION:
				return new Integer(getVersion());
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
			case TasksPackage.ACTION_GROUNDING__OWLS_PROCESS:
				setOwlsProcess((Action)newValue);
				return;
			case TasksPackage.ACTION_GROUNDING__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputMessageMap>)newValue);
				return;
			case TasksPackage.ACTION_GROUNDING__ID:
				setId(((Integer)newValue).intValue());
				return;
			case TasksPackage.ACTION_GROUNDING__VERSION:
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
			case TasksPackage.ACTION_GROUNDING__OWLS_PROCESS:
				setOwlsProcess((Action)null);
				return;
			case TasksPackage.ACTION_GROUNDING__INPUT:
				getInput().clear();
				return;
			case TasksPackage.ACTION_GROUNDING__ID:
				setId(ID_EDEFAULT);
				return;
			case TasksPackage.ACTION_GROUNDING__VERSION:
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
			case TasksPackage.ACTION_GROUNDING__OWLS_PROCESS:
				return owlsProcess != null;
			case TasksPackage.ACTION_GROUNDING__INPUT:
				return input != null && !input.isEmpty();
			case TasksPackage.ACTION_GROUNDING__ID:
				return id != ID_EDEFAULT;
			case TasksPackage.ACTION_GROUNDING__VERSION:
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

} //ActionGroundingImpl
