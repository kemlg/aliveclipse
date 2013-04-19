/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.impl;

import net.sf.ictalive.service.Service;
import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.semantics.ProcessModel;
import net.sf.ictalive.service.semantics.SemanticsPackage;
import net.sf.ictalive.service.semantics.ServiceGrounding;

import net.sf.ictalive.service.syntax.InterfaceDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceGroundingImpl extends EObjectImpl implements ServiceGrounding {
	/**
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel processModel;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDescription interface_;

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
	protected ServiceGroundingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticsPackage.Literals.SERVICE_GROUNDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getSupportedBy() {
		if (eContainerFeatureID() != SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedBy(Service newSupportedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupportedBy, SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedBy(Service newSupportedBy) {
		if (newSupportedBy != eInternalContainer() || (eContainerFeatureID() != SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY && newSupportedBy != null)) {
			if (EcoreUtil.isAncestor(this, newSupportedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupportedBy != null)
				msgs = ((InternalEObject)newSupportedBy).eInverseAdd(this, ServicePackage.SERVICE__SUPPORTS, Service.class, msgs);
			msgs = basicSetSupportedBy(newSupportedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY, newSupportedBy, newSupportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getProcessModel() {
		if (processModel != null && processModel.eIsProxy()) {
			InternalEObject oldProcessModel = (InternalEObject)processModel;
			processModel = (ProcessModel)eResolveProxy(oldProcessModel);
			if (processModel != oldProcessModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL, oldProcessModel, processModel));
			}
		}
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetProcessModel() {
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessModel(ProcessModel newProcessModel) {
		ProcessModel oldProcessModel = processModel;
		processModel = newProcessModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL, oldProcessModel, processModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDescription getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (InterfaceDescription)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticsPackage.SERVICE_GROUNDING__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDescription basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(InterfaceDescription newInterface) {
		InterfaceDescription oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_GROUNDING__INTERFACE, oldInterface, interface_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_GROUNDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupportedBy((Service)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return basicSetSupportedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.SERVICE__SUPPORTS, Service.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return getSupportedBy();
			case SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL:
				if (resolve) return getProcessModel();
				return basicGetProcessModel();
			case SemanticsPackage.SERVICE_GROUNDING__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case SemanticsPackage.SERVICE_GROUNDING__NAME:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				setSupportedBy((Service)newValue);
				return;
			case SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL:
				setProcessModel((ProcessModel)newValue);
				return;
			case SemanticsPackage.SERVICE_GROUNDING__INTERFACE:
				setInterface((InterfaceDescription)newValue);
				return;
			case SemanticsPackage.SERVICE_GROUNDING__NAME:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				setSupportedBy((Service)null);
				return;
			case SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL:
				setProcessModel((ProcessModel)null);
				return;
			case SemanticsPackage.SERVICE_GROUNDING__INTERFACE:
				setInterface((InterfaceDescription)null);
				return;
			case SemanticsPackage.SERVICE_GROUNDING__NAME:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return getSupportedBy() != null;
			case SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL:
				return processModel != null;
			case SemanticsPackage.SERVICE_GROUNDING__INTERFACE:
				return interface_ != null;
			case SemanticsPackage.SERVICE_GROUNDING__NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceGroundingImpl
