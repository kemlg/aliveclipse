/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.ActionResult;

import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.ControlConstruct;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getInput <em>Input</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlConstruct> components;

	/**
	 * The cached value of the '{@link #getHasPrecondition() <em>Has Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> hasPrecondition;

	/**
	 * The cached value of the '{@link #getHasResult() <em>Has Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResult()
	 * @generated
	 * @ordered
	 */
	protected ActionResult hasResult;

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
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlConstruct> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ControlConstruct>(ControlConstruct.class, this, TasksPackage.TASK__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getHasPrecondition() {
		if (hasPrecondition == null) {
			hasPrecondition = new EObjectContainmentEList<Condition>(Condition.class, this, TasksPackage.TASK__HAS_PRECONDITION);
		}
		return hasPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResult getHasResult() {
		if (hasResult != null && hasResult.eIsProxy()) {
			InternalEObject oldHasResult = (InternalEObject)hasResult;
			hasResult = (ActionResult)eResolveProxy(oldHasResult);
			if (hasResult != oldHasResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksPackage.TASK__HAS_RESULT, oldHasResult, hasResult));
			}
		}
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResult basicGetHasResult() {
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasResult(ActionResult newHasResult) {
		ActionResult oldHasResult = hasResult;
		hasResult = newHasResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__HAS_RESULT, oldHasResult, hasResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputMessageMap> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<InputMessageMap>(InputMessageMap.class, this, TasksPackage.TASK__INPUT);
		}
		return input;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasksPackage.TASK__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case TasksPackage.TASK__HAS_PRECONDITION:
				return ((InternalEList<?>)getHasPrecondition()).basicRemove(otherEnd, msgs);
			case TasksPackage.TASK__INPUT:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TasksPackage.TASK__COMPONENTS:
				return getComponents();
			case TasksPackage.TASK__HAS_PRECONDITION:
				return getHasPrecondition();
			case TasksPackage.TASK__HAS_RESULT:
				if (resolve) return getHasResult();
				return basicGetHasResult();
			case TasksPackage.TASK__INPUT:
				return getInput();
			case TasksPackage.TASK__NAME:
				return getName();
			case TasksPackage.TASK__ID:
				return getId();
			case TasksPackage.TASK__VERSION:
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
			case TasksPackage.TASK__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ControlConstruct>)newValue);
				return;
			case TasksPackage.TASK__HAS_PRECONDITION:
				getHasPrecondition().clear();
				getHasPrecondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case TasksPackage.TASK__HAS_RESULT:
				setHasResult((ActionResult)newValue);
				return;
			case TasksPackage.TASK__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputMessageMap>)newValue);
				return;
			case TasksPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case TasksPackage.TASK__ID:
				setId((Integer)newValue);
				return;
			case TasksPackage.TASK__VERSION:
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
			case TasksPackage.TASK__COMPONENTS:
				getComponents().clear();
				return;
			case TasksPackage.TASK__HAS_PRECONDITION:
				getHasPrecondition().clear();
				return;
			case TasksPackage.TASK__HAS_RESULT:
				setHasResult((ActionResult)null);
				return;
			case TasksPackage.TASK__INPUT:
				getInput().clear();
				return;
			case TasksPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TasksPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case TasksPackage.TASK__VERSION:
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
			case TasksPackage.TASK__COMPONENTS:
				return components != null && !components.isEmpty();
			case TasksPackage.TASK__HAS_PRECONDITION:
				return hasPrecondition != null && !hasPrecondition.isEmpty();
			case TasksPackage.TASK__HAS_RESULT:
				return hasResult != null;
			case TasksPackage.TASK__INPUT:
				return input != null && !input.isEmpty();
			case TasksPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TasksPackage.TASK__ID:
				return id != ID_EDEFAULT;
			case TasksPackage.TASK__VERSION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
