/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.coordination.agents.Agent;

import net.sf.ictalive.coordination.tasks.ActionGrounding;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.ServiceInvocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl#getEnactingAgent <em>Enacting Agent</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl#getCorrelatedAction <em>Correlated Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInvocationImpl extends ActionImpl implements ServiceInvocation {
	/**
	 * The default value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected String serviceURI = SERVICE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnactingAgent() <em>Enacting Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnactingAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent enactingAgent;

	/**
	 * The cached value of the '{@link #getCorrelatedAction() <em>Correlated Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelatedAction()
	 * @generated
	 * @ordered
	 */
	protected ActionGrounding correlatedAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.SERVICE_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURI() {
		return serviceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURI(String newServiceURI) {
		String oldServiceURI = serviceURI;
		serviceURI = newServiceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.SERVICE_INVOCATION__SERVICE_URI, oldServiceURI, serviceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getEnactingAgent() {
		if (enactingAgent != null && enactingAgent.eIsProxy()) {
			InternalEObject oldEnactingAgent = (InternalEObject)enactingAgent;
			enactingAgent = (Agent)eResolveProxy(oldEnactingAgent);
			if (enactingAgent != oldEnactingAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.SERVICE_INVOCATION__ENACTING_AGENT, oldEnactingAgent, enactingAgent));
			}
		}
		return enactingAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetEnactingAgent() {
		return enactingAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnactingAgent(Agent newEnactingAgent) {
		Agent oldEnactingAgent = enactingAgent;
		enactingAgent = newEnactingAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.SERVICE_INVOCATION__ENACTING_AGENT, oldEnactingAgent, enactingAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding getCorrelatedAction() {
		if (correlatedAction != null && correlatedAction.eIsProxy()) {
			InternalEObject oldCorrelatedAction = (InternalEObject)correlatedAction;
			correlatedAction = (ActionGrounding)eResolveProxy(oldCorrelatedAction);
			if (correlatedAction != oldCorrelatedAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.SERVICE_INVOCATION__CORRELATED_ACTION, oldCorrelatedAction, correlatedAction));
			}
		}
		return correlatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding basicGetCorrelatedAction() {
		return correlatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelatedAction(ActionGrounding newCorrelatedAction) {
		ActionGrounding oldCorrelatedAction = correlatedAction;
		correlatedAction = newCorrelatedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.SERVICE_INVOCATION__CORRELATED_ACTION, oldCorrelatedAction, correlatedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.SERVICE_INVOCATION__SERVICE_URI:
				return getServiceURI();
			case ActionPackage.SERVICE_INVOCATION__ENACTING_AGENT:
				if (resolve) return getEnactingAgent();
				return basicGetEnactingAgent();
			case ActionPackage.SERVICE_INVOCATION__CORRELATED_ACTION:
				if (resolve) return getCorrelatedAction();
				return basicGetCorrelatedAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionPackage.SERVICE_INVOCATION__SERVICE_URI:
				setServiceURI((String)newValue);
				return;
			case ActionPackage.SERVICE_INVOCATION__ENACTING_AGENT:
				setEnactingAgent((Agent)newValue);
				return;
			case ActionPackage.SERVICE_INVOCATION__CORRELATED_ACTION:
				setCorrelatedAction((ActionGrounding)newValue);
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
			case ActionPackage.SERVICE_INVOCATION__SERVICE_URI:
				setServiceURI(SERVICE_URI_EDEFAULT);
				return;
			case ActionPackage.SERVICE_INVOCATION__ENACTING_AGENT:
				setEnactingAgent((Agent)null);
				return;
			case ActionPackage.SERVICE_INVOCATION__CORRELATED_ACTION:
				setCorrelatedAction((ActionGrounding)null);
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
			case ActionPackage.SERVICE_INVOCATION__SERVICE_URI:
				return SERVICE_URI_EDEFAULT == null ? serviceURI != null : !SERVICE_URI_EDEFAULT.equals(serviceURI);
			case ActionPackage.SERVICE_INVOCATION__ENACTING_AGENT:
				return enactingAgent != null;
			case ActionPackage.SERVICE_INVOCATION__CORRELATED_ACTION:
				return correlatedAction != null;
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
		result.append(" (serviceURI: ");
		result.append(serviceURI);
		result.append(')');
		return result.toString();
	}

} //ServiceInvocationImpl
