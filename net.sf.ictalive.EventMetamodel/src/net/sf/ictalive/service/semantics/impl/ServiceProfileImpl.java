/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.impl;

import java.util.Collection;

import net.sf.ictalive.service.Service;
import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.semantics.ProcessModel;
import net.sf.ictalive.service.semantics.SemanticsPackage;
import net.sf.ictalive.service.semantics.ServiceCategory;
import net.sf.ictalive.service.semantics.ServiceCondition;
import net.sf.ictalive.service.semantics.ServiceInput;
import net.sf.ictalive.service.semantics.ServiceOutput;
import net.sf.ictalive.service.semantics.ServiceProfile;
import net.sf.ictalive.service.semantics.ServiceResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getPresentedBy <em>Presented By</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getHasProcess <em>Has Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.ServiceProfileImpl#getServiceClassification <em>Service Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProfileImpl extends EObjectImpl implements ServiceProfile
{
	/**
	 * The cached value of the '{@link #getHasProcess() <em>Has Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProcess()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel hasProcess;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected ServiceCategory serviceCategory;

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
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInput> hasInput;

	/**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOutput> hasOutput;

	/**
	 * The cached value of the '{@link #getHasResult() <em>Has Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceResult> hasResult;

	/**
	 * The cached value of the '{@link #getHasCondition() <em>Has Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCondition> hasCondition;

	/**
	 * The default value of the '{@link #getServiceClassification() <em>Service Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceClassification() <em>Service Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassification()
	 * @generated
	 * @ordered
	 */
	protected String serviceClassification = SERVICE_CLASSIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProfileImpl()
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
		return SemanticsPackage.Literals.SERVICE_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getPresentedBy()
	{
		if (eContainerFeatureID != SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentedBy(Service newPresentedBy, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newPresentedBy, SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentedBy(Service newPresentedBy)
	{
		if (newPresentedBy != eInternalContainer() || (eContainerFeatureID != SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY && newPresentedBy != null))
		{
			if (EcoreUtil.isAncestor(this, newPresentedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPresentedBy != null)
				msgs = ((InternalEObject)newPresentedBy).eInverseAdd(this, ServicePackage.SERVICE__PRESENTS, Service.class, msgs);
			msgs = basicSetPresentedBy(newPresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY, newPresentedBy, newPresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getHasProcess()
	{
		if (hasProcess != null && hasProcess.eIsProxy())
		{
			InternalEObject oldHasProcess = (InternalEObject)hasProcess;
			hasProcess = (ProcessModel)eResolveProxy(oldHasProcess);
			if (hasProcess != oldHasProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticsPackage.SERVICE_PROFILE__HAS_PROCESS, oldHasProcess, hasProcess));
			}
		}
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetHasProcess()
	{
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasProcess(ProcessModel newHasProcess)
	{
		ProcessModel oldHasProcess = hasProcess;
		hasProcess = newHasProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_PROFILE__HAS_PROCESS, oldHasProcess, hasProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory getServiceCategory()
	{
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(ServiceCategory newServiceCategory, NotificationChain msgs)
	{
		ServiceCategory oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(ServiceCategory newServiceCategory)
	{
		if (newServiceCategory != serviceCategory)
		{
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY, null, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY, null, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInput> getHasInput()
	{
		if (hasInput == null)
		{
			hasInput = new EObjectResolvingEList<ServiceInput>(ServiceInput.class, this, SemanticsPackage.SERVICE_PROFILE__HAS_INPUT);
		}
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceOutput> getHasOutput()
	{
		if (hasOutput == null)
		{
			hasOutput = new EObjectResolvingEList<ServiceOutput>(ServiceOutput.class, this, SemanticsPackage.SERVICE_PROFILE__HAS_OUTPUT);
		}
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceResult> getHasResult()
	{
		if (hasResult == null)
		{
			hasResult = new EObjectResolvingEList<ServiceResult>(ServiceResult.class, this, SemanticsPackage.SERVICE_PROFILE__HAS_RESULT);
		}
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceCondition> getHasCondition()
	{
		if (hasCondition == null)
		{
			hasCondition = new EObjectResolvingEList<ServiceCondition>(ServiceCondition.class, this, SemanticsPackage.SERVICE_PROFILE__HAS_CONDITION);
		}
		return hasCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceClassification()
	{
		return serviceClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClassification(String newServiceClassification)
	{
		String oldServiceClassification = serviceClassification;
		serviceClassification = newServiceClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticsPackage.SERVICE_PROFILE__SERVICE_CLASSIFICATION, oldServiceClassification, serviceClassification));
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
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPresentedBy((Service)otherEnd, msgs);
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
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				return basicSetPresentedBy(null, msgs);
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID)
		{
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.SERVICE__PRESENTS, Service.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				return getPresentedBy();
			case SemanticsPackage.SERVICE_PROFILE__HAS_PROCESS:
				if (resolve) return getHasProcess();
				return basicGetHasProcess();
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY:
				return getServiceCategory();
			case SemanticsPackage.SERVICE_PROFILE__NAME:
				return getName();
			case SemanticsPackage.SERVICE_PROFILE__HAS_INPUT:
				return getHasInput();
			case SemanticsPackage.SERVICE_PROFILE__HAS_OUTPUT:
				return getHasOutput();
			case SemanticsPackage.SERVICE_PROFILE__HAS_RESULT:
				return getHasResult();
			case SemanticsPackage.SERVICE_PROFILE__HAS_CONDITION:
				return getHasCondition();
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CLASSIFICATION:
				return getServiceClassification();
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
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				setPresentedBy((Service)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_PROCESS:
				setHasProcess((ProcessModel)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__NAME:
				setName((String)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_INPUT:
				getHasInput().clear();
				getHasInput().addAll((Collection<? extends ServiceInput>)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_OUTPUT:
				getHasOutput().clear();
				getHasOutput().addAll((Collection<? extends ServiceOutput>)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_RESULT:
				getHasResult().clear();
				getHasResult().addAll((Collection<? extends ServiceResult>)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_CONDITION:
				getHasCondition().clear();
				getHasCondition().addAll((Collection<? extends ServiceCondition>)newValue);
				return;
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CLASSIFICATION:
				setServiceClassification((String)newValue);
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
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				setPresentedBy((Service)null);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_PROCESS:
				setHasProcess((ProcessModel)null);
				return;
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case SemanticsPackage.SERVICE_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_INPUT:
				getHasInput().clear();
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_OUTPUT:
				getHasOutput().clear();
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_RESULT:
				getHasResult().clear();
				return;
			case SemanticsPackage.SERVICE_PROFILE__HAS_CONDITION:
				getHasCondition().clear();
				return;
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CLASSIFICATION:
				setServiceClassification(SERVICE_CLASSIFICATION_EDEFAULT);
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
			case SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY:
				return getPresentedBy() != null;
			case SemanticsPackage.SERVICE_PROFILE__HAS_PROCESS:
				return hasProcess != null;
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case SemanticsPackage.SERVICE_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SemanticsPackage.SERVICE_PROFILE__HAS_INPUT:
				return hasInput != null && !hasInput.isEmpty();
			case SemanticsPackage.SERVICE_PROFILE__HAS_OUTPUT:
				return hasOutput != null && !hasOutput.isEmpty();
			case SemanticsPackage.SERVICE_PROFILE__HAS_RESULT:
				return hasResult != null && !hasResult.isEmpty();
			case SemanticsPackage.SERVICE_PROFILE__HAS_CONDITION:
				return hasCondition != null && !hasCondition.isEmpty();
			case SemanticsPackage.SERVICE_PROFILE__SERVICE_CLASSIFICATION:
				return SERVICE_CLASSIFICATION_EDEFAULT == null ? serviceClassification != null : !SERVICE_CLASSIFICATION_EDEFAULT.equals(serviceClassification);
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
		result.append(", serviceClassification: ");
		result.append(serviceClassification);
		result.append(')');
		return result.toString();
	}

} //ServiceProfileImpl
