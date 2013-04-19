/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.operetta.OM.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.AgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.AgentImpl#getHasRole <em>Has Role</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.AgentImpl#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.AgentImpl#getAsFolderLocation <em>As Folder Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends EObjectImpl implements Agent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getHasRole() <em>Has Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> hasRole;

	/**
	 * The cached value of the '{@link #getHasAction() <em>Has Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> hasAction;

	/**
	 * The default value of the '{@link #getAsFolderLocation() <em>As Folder Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsFolderLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_FOLDER_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsFolderLocation() <em>As Folder Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsFolderLocation()
	 * @generated
	 * @ordered
	 */
	protected String asFolderLocation = AS_FOLDER_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentsPackage.Literals.AGENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.AGENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getHasRole() {
		if (hasRole == null) {
			hasRole = new EObjectResolvingEList<Role>(Role.class, this, AgentsPackage.AGENT__HAS_ROLE);
		}
		return hasRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getHasAction() {
		if (hasAction == null) {
			hasAction = new EObjectResolvingEList<Action>(Action.class, this, AgentsPackage.AGENT__HAS_ACTION);
		}
		return hasAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsFolderLocation() {
		return asFolderLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsFolderLocation(String newAsFolderLocation) {
		String oldAsFolderLocation = asFolderLocation;
		asFolderLocation = newAsFolderLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.AGENT__AS_FOLDER_LOCATION, oldAsFolderLocation, asFolderLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentsPackage.AGENT__NAME:
				return getName();
			case AgentsPackage.AGENT__HAS_ROLE:
				return getHasRole();
			case AgentsPackage.AGENT__HAS_ACTION:
				return getHasAction();
			case AgentsPackage.AGENT__AS_FOLDER_LOCATION:
				return getAsFolderLocation();
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
			case AgentsPackage.AGENT__NAME:
				setName((String)newValue);
				return;
			case AgentsPackage.AGENT__HAS_ROLE:
				getHasRole().clear();
				getHasRole().addAll((Collection<? extends Role>)newValue);
				return;
			case AgentsPackage.AGENT__HAS_ACTION:
				getHasAction().clear();
				getHasAction().addAll((Collection<? extends Action>)newValue);
				return;
			case AgentsPackage.AGENT__AS_FOLDER_LOCATION:
				setAsFolderLocation((String)newValue);
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
			case AgentsPackage.AGENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AgentsPackage.AGENT__HAS_ROLE:
				getHasRole().clear();
				return;
			case AgentsPackage.AGENT__HAS_ACTION:
				getHasAction().clear();
				return;
			case AgentsPackage.AGENT__AS_FOLDER_LOCATION:
				setAsFolderLocation(AS_FOLDER_LOCATION_EDEFAULT);
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
			case AgentsPackage.AGENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AgentsPackage.AGENT__HAS_ROLE:
				return hasRole != null && !hasRole.isEmpty();
			case AgentsPackage.AGENT__HAS_ACTION:
				return hasAction != null && !hasAction.isEmpty();
			case AgentsPackage.AGENT__AS_FOLDER_LOCATION:
				return AS_FOLDER_LOCATION_EDEFAULT == null ? asFolderLocation != null : !AS_FOLDER_LOCATION_EDEFAULT.equals(asFolderLocation);
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
		result.append(", asFolderLocation: ");
		result.append(asFolderLocation);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
