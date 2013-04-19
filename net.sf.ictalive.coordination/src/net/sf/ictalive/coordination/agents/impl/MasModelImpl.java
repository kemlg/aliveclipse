/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.MasModel;

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
 * An implementation of the model object '<em><b>Mas Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.MasModelImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.MasModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.MasModelImpl#getDomainOntologyNameSpace <em>Domain Ontology Name Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasModelImpl extends EObjectImpl implements MasModel {
	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

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
	 * The default value of the '{@link #getDomainOntologyNameSpace() <em>Domain Ontology Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOntologyNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ONTOLOGY_NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainOntologyNameSpace() <em>Domain Ontology Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOntologyNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String domainOntologyNameSpace = DOMAIN_ONTOLOGY_NAME_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentsPackage.Literals.MAS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, AgentsPackage.MAS_MODEL__AGENTS);
		}
		return agents;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.MAS_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainOntologyNameSpace() {
		return domainOntologyNameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainOntologyNameSpace(String newDomainOntologyNameSpace) {
		String oldDomainOntologyNameSpace = domainOntologyNameSpace;
		domainOntologyNameSpace = newDomainOntologyNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE, oldDomainOntologyNameSpace, domainOntologyNameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgentsPackage.MAS_MODEL__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
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
			case AgentsPackage.MAS_MODEL__AGENTS:
				return getAgents();
			case AgentsPackage.MAS_MODEL__NAME:
				return getName();
			case AgentsPackage.MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE:
				return getDomainOntologyNameSpace();
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
			case AgentsPackage.MAS_MODEL__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case AgentsPackage.MAS_MODEL__NAME:
				setName((String)newValue);
				return;
			case AgentsPackage.MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE:
				setDomainOntologyNameSpace((String)newValue);
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
			case AgentsPackage.MAS_MODEL__AGENTS:
				getAgents().clear();
				return;
			case AgentsPackage.MAS_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AgentsPackage.MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE:
				setDomainOntologyNameSpace(DOMAIN_ONTOLOGY_NAME_SPACE_EDEFAULT);
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
			case AgentsPackage.MAS_MODEL__AGENTS:
				return agents != null && !agents.isEmpty();
			case AgentsPackage.MAS_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AgentsPackage.MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE:
				return DOMAIN_ONTOLOGY_NAME_SPACE_EDEFAULT == null ? domainOntologyNameSpace != null : !DOMAIN_ONTOLOGY_NAME_SPACE_EDEFAULT.equals(domainOntologyNameSpace);
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
		result.append(", domainOntologyNameSpace: ");
		result.append(domainOntologyNameSpace);
		result.append(')');
		return result.toString();
	}

} //MasModelImpl
