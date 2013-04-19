/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents.impl;

import net.sf.ictalive.coordination.agents.Actor;
import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.agents.AgentsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.ActorImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.ActorImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.impl.ActorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActorImpl extends EObjectImpl implements Actor
{
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected net.sf.ictalive.coordination.agents.ActorImpl implementedBy;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl()
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
		return AgentsPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent()
	{
		if (agent != null && agent.eIsProxy())
		{
			InternalEObject oldAgent = (InternalEObject)agent;
			agent = (Agent)eResolveProxy(oldAgent);
			if (agent != oldAgent)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentsPackage.ACTOR__AGENT, oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent()
	{
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs)
	{
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgentsPackage.ACTOR__AGENT, oldAgent, newAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent)
	{
		if (newAgent != agent)
		{
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, AgentsPackage.AGENT__ACTORS, Agent.class, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, AgentsPackage.AGENT__ACTORS, Agent.class, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.ACTOR__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.ictalive.coordination.agents.ActorImpl getImplementedBy()
	{
		if (implementedBy != null && implementedBy.eIsProxy())
		{
			InternalEObject oldImplementedBy = (InternalEObject)implementedBy;
			implementedBy = (net.sf.ictalive.coordination.agents.ActorImpl)eResolveProxy(oldImplementedBy);
			if (implementedBy != oldImplementedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentsPackage.ACTOR__IMPLEMENTED_BY, oldImplementedBy, implementedBy));
			}
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.ictalive.coordination.agents.ActorImpl basicGetImplementedBy()
	{
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedBy(net.sf.ictalive.coordination.agents.ActorImpl newImplementedBy)
	{
		net.sf.ictalive.coordination.agents.ActorImpl oldImplementedBy = implementedBy;
		implementedBy = newImplementedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.ACTOR__IMPLEMENTED_BY, oldImplementedBy, implementedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgentsPackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case AgentsPackage.ACTOR__AGENT:
				if (agent != null)
					msgs = ((InternalEObject)agent).eInverseRemove(this, AgentsPackage.AGENT__ACTORS, Agent.class, msgs);
				return basicSetAgent((Agent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case AgentsPackage.ACTOR__AGENT:
				return basicSetAgent(null, msgs);
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
			case AgentsPackage.ACTOR__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
			case AgentsPackage.ACTOR__IMPLEMENTED_BY:
				if (resolve) return getImplementedBy();
				return basicGetImplementedBy();
			case AgentsPackage.ACTOR__NAME:
				return getName();
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
			case AgentsPackage.ACTOR__AGENT:
				setAgent((Agent)newValue);
				return;
			case AgentsPackage.ACTOR__IMPLEMENTED_BY:
				setImplementedBy((net.sf.ictalive.coordination.agents.ActorImpl)newValue);
				return;
			case AgentsPackage.ACTOR__NAME:
				setName((String)newValue);
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
			case AgentsPackage.ACTOR__AGENT:
				setAgent((Agent)null);
				return;
			case AgentsPackage.ACTOR__IMPLEMENTED_BY:
				setImplementedBy((net.sf.ictalive.coordination.agents.ActorImpl)null);
				return;
			case AgentsPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
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
			case AgentsPackage.ACTOR__AGENT:
				return agent != null;
			case AgentsPackage.ACTOR__IMPLEMENTED_BY:
				return implementedBy != null;
			case AgentsPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ActorImpl
