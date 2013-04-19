/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.semantics.ServiceParameter;

import net.sf.ictalive.service.template.AbstractProcessModel;
import net.sf.ictalive.service.template.Perform;
import net.sf.ictalive.service.template.ServiceTemplate;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.PerformImpl#getPartnerProcess <em>Partner Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.PerformImpl#getHasDataFromProcess <em>Has Data From Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.PerformImpl#getValueData <em>Value Data</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.PerformImpl#getHasDataFromTemplate <em>Has Data From Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformImpl extends ControlConstructImpl implements Perform {
	/**
	 * The cached value of the '{@link #getPartnerProcess() <em>Partner Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerProcess()
	 * @generated
	 * @ordered
	 */
	protected AbstractProcessModel partnerProcess;

	/**
	 * The cached value of the '{@link #getHasDataFromProcess() <em>Has Data From Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDataFromProcess()
	 * @generated
	 * @ordered
	 */
	protected AbstractProcessModel hasDataFromProcess;

	/**
	 * The cached value of the '{@link #getValueData() <em>Value Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueData()
	 * @generated
	 * @ordered
	 */
	protected ServiceParameter valueData;

	/**
	 * The cached value of the '{@link #getHasDataFromTemplate() <em>Has Data From Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDataFromTemplate()
	 * @generated
	 * @ordered
	 */
	protected ServiceTemplate hasDataFromTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatePackage.Literals.PERFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel getPartnerProcess() {
		return partnerProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerProcess(AbstractProcessModel newPartnerProcess, NotificationChain msgs) {
		AbstractProcessModel oldPartnerProcess = partnerProcess;
		partnerProcess = newPartnerProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.PERFORM__PARTNER_PROCESS, oldPartnerProcess, newPartnerProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerProcess(AbstractProcessModel newPartnerProcess) {
		if (newPartnerProcess != partnerProcess) {
			NotificationChain msgs = null;
			if (partnerProcess != null)
				msgs = ((InternalEObject)partnerProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.PERFORM__PARTNER_PROCESS, null, msgs);
			if (newPartnerProcess != null)
				msgs = ((InternalEObject)newPartnerProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.PERFORM__PARTNER_PROCESS, null, msgs);
			msgs = basicSetPartnerProcess(newPartnerProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.PERFORM__PARTNER_PROCESS, newPartnerProcess, newPartnerProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel getHasDataFromProcess() {
		if (hasDataFromProcess != null && hasDataFromProcess.eIsProxy()) {
			InternalEObject oldHasDataFromProcess = (InternalEObject)hasDataFromProcess;
			hasDataFromProcess = (AbstractProcessModel)eResolveProxy(oldHasDataFromProcess);
			if (hasDataFromProcess != oldHasDataFromProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.PERFORM__HAS_DATA_FROM_PROCESS, oldHasDataFromProcess, hasDataFromProcess));
			}
		}
		return hasDataFromProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel basicGetHasDataFromProcess() {
		return hasDataFromProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDataFromProcess(AbstractProcessModel newHasDataFromProcess) {
		AbstractProcessModel oldHasDataFromProcess = hasDataFromProcess;
		hasDataFromProcess = newHasDataFromProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.PERFORM__HAS_DATA_FROM_PROCESS, oldHasDataFromProcess, hasDataFromProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter getValueData() {
		if (valueData != null && valueData.eIsProxy()) {
			InternalEObject oldValueData = (InternalEObject)valueData;
			valueData = (ServiceParameter)eResolveProxy(oldValueData);
			if (valueData != oldValueData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.PERFORM__VALUE_DATA, oldValueData, valueData));
			}
		}
		return valueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter basicGetValueData() {
		return valueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueData(ServiceParameter newValueData) {
		ServiceParameter oldValueData = valueData;
		valueData = newValueData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.PERFORM__VALUE_DATA, oldValueData, valueData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplate getHasDataFromTemplate() {
		if (hasDataFromTemplate != null && hasDataFromTemplate.eIsProxy()) {
			InternalEObject oldHasDataFromTemplate = (InternalEObject)hasDataFromTemplate;
			hasDataFromTemplate = (ServiceTemplate)eResolveProxy(oldHasDataFromTemplate);
			if (hasDataFromTemplate != oldHasDataFromTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.PERFORM__HAS_DATA_FROM_TEMPLATE, oldHasDataFromTemplate, hasDataFromTemplate));
			}
		}
		return hasDataFromTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplate basicGetHasDataFromTemplate() {
		return hasDataFromTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDataFromTemplate(ServiceTemplate newHasDataFromTemplate) {
		ServiceTemplate oldHasDataFromTemplate = hasDataFromTemplate;
		hasDataFromTemplate = newHasDataFromTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.PERFORM__HAS_DATA_FROM_TEMPLATE, oldHasDataFromTemplate, hasDataFromTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemplatePackage.PERFORM__PARTNER_PROCESS:
				return basicSetPartnerProcess(null, msgs);
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
			case TemplatePackage.PERFORM__PARTNER_PROCESS:
				return getPartnerProcess();
			case TemplatePackage.PERFORM__HAS_DATA_FROM_PROCESS:
				if (resolve) return getHasDataFromProcess();
				return basicGetHasDataFromProcess();
			case TemplatePackage.PERFORM__VALUE_DATA:
				if (resolve) return getValueData();
				return basicGetValueData();
			case TemplatePackage.PERFORM__HAS_DATA_FROM_TEMPLATE:
				if (resolve) return getHasDataFromTemplate();
				return basicGetHasDataFromTemplate();
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
			case TemplatePackage.PERFORM__PARTNER_PROCESS:
				setPartnerProcess((AbstractProcessModel)newValue);
				return;
			case TemplatePackage.PERFORM__HAS_DATA_FROM_PROCESS:
				setHasDataFromProcess((AbstractProcessModel)newValue);
				return;
			case TemplatePackage.PERFORM__VALUE_DATA:
				setValueData((ServiceParameter)newValue);
				return;
			case TemplatePackage.PERFORM__HAS_DATA_FROM_TEMPLATE:
				setHasDataFromTemplate((ServiceTemplate)newValue);
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
			case TemplatePackage.PERFORM__PARTNER_PROCESS:
				setPartnerProcess((AbstractProcessModel)null);
				return;
			case TemplatePackage.PERFORM__HAS_DATA_FROM_PROCESS:
				setHasDataFromProcess((AbstractProcessModel)null);
				return;
			case TemplatePackage.PERFORM__VALUE_DATA:
				setValueData((ServiceParameter)null);
				return;
			case TemplatePackage.PERFORM__HAS_DATA_FROM_TEMPLATE:
				setHasDataFromTemplate((ServiceTemplate)null);
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
			case TemplatePackage.PERFORM__PARTNER_PROCESS:
				return partnerProcess != null;
			case TemplatePackage.PERFORM__HAS_DATA_FROM_PROCESS:
				return hasDataFromProcess != null;
			case TemplatePackage.PERFORM__VALUE_DATA:
				return valueData != null;
			case TemplatePackage.PERFORM__HAS_DATA_FROM_TEMPLATE:
				return hasDataFromTemplate != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformImpl
