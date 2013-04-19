/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;

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
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl#getControlConstructs <em>Control Constructs</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionsCollectionImpl extends EObjectImpl implements ActionsCollection
{
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getControlConstructs() <em>Control Constructs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlConstructs()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlConstruct> controlConstructs;

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
	protected ActionsCollectionImpl()
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
		return ActionsPackage.Literals.ACTIONS_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions()
	{
		if (actions == null)
		{
			actions = new EObjectContainmentEList<Action>(Action.class, this, ActionsPackage.ACTIONS_COLLECTION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants()
	{
		if (participants == null)
		{
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, ActionsPackage.ACTIONS_COLLECTION__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ActionsPackage.ACTIONS_COLLECTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlConstruct> getControlConstructs()
	{
		if (controlConstructs == null)
		{
			controlConstructs = new EObjectContainmentEList<ControlConstruct>(ControlConstruct.class, this, ActionsPackage.ACTIONS_COLLECTION__CONTROL_CONSTRUCTS);
		}
		return controlConstructs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ACTIONS_COLLECTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ACTIONS_COLLECTION__VERSION, oldVersion, version));
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
			case ActionsPackage.ACTIONS_COLLECTION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACTIONS_COLLECTION__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACTIONS_COLLECTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACTIONS_COLLECTION__CONTROL_CONSTRUCTS:
				return ((InternalEList<?>)getControlConstructs()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.ACTIONS_COLLECTION__ACTIONS:
				return getActions();
			case ActionsPackage.ACTIONS_COLLECTION__PARTICIPANTS:
				return getParticipants();
			case ActionsPackage.ACTIONS_COLLECTION__PARAMETERS:
				return getParameters();
			case ActionsPackage.ACTIONS_COLLECTION__CONTROL_CONSTRUCTS:
				return getControlConstructs();
			case ActionsPackage.ACTIONS_COLLECTION__ID:
				return new Integer(getId());
			case ActionsPackage.ACTIONS_COLLECTION__VERSION:
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
			case ActionsPackage.ACTIONS_COLLECTION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case ActionsPackage.ACTIONS_COLLECTION__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case ActionsPackage.ACTIONS_COLLECTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ActionsPackage.ACTIONS_COLLECTION__CONTROL_CONSTRUCTS:
				getControlConstructs().clear();
				getControlConstructs().addAll((Collection<? extends ControlConstruct>)newValue);
				return;
			case ActionsPackage.ACTIONS_COLLECTION__ID:
				setId(((Integer)newValue).intValue());
				return;
			case ActionsPackage.ACTIONS_COLLECTION__VERSION:
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
			case ActionsPackage.ACTIONS_COLLECTION__ACTIONS:
				getActions().clear();
				return;
			case ActionsPackage.ACTIONS_COLLECTION__PARTICIPANTS:
				getParticipants().clear();
				return;
			case ActionsPackage.ACTIONS_COLLECTION__PARAMETERS:
				getParameters().clear();
				return;
			case ActionsPackage.ACTIONS_COLLECTION__CONTROL_CONSTRUCTS:
				getControlConstructs().clear();
				return;
			case ActionsPackage.ACTIONS_COLLECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case ActionsPackage.ACTIONS_COLLECTION__VERSION:
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
			case ActionsPackage.ACTIONS_COLLECTION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case ActionsPackage.ACTIONS_COLLECTION__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case ActionsPackage.ACTIONS_COLLECTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ActionsPackage.ACTIONS_COLLECTION__CONTROL_CONSTRUCTS:
				return controlConstructs != null && !controlConstructs.isEmpty();
			case ActionsPackage.ACTIONS_COLLECTION__ID:
				return id != ID_EDEFAULT;
			case ActionsPackage.ACTIONS_COLLECTION__VERSION:
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

} //ActionsCollectionImpl
