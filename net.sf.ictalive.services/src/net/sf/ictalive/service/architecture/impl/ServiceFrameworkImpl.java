/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import java.util.Collection;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.ExecutionFramework;
import net.sf.ictalive.service.architecture.ServiceDirectory;
import net.sf.ictalive.service.architecture.ServiceFramework;
import net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker;
import net.sf.ictalive.service.architecture.TemplateRepository;

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
 * An implementation of the model object '<em><b>Service Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl#getMatchmaker <em>Matchmaker</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl#getServiceDirectory <em>Service Directory</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl#getTemplateRepository <em>Template Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceFrameworkImpl extends EObjectImpl implements ServiceFramework {
	/**
	 * The cached value of the '{@link #getMatchmaker() <em>Matchmaker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchmaker()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceTemplateMatchmaker> matchmaker;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected ExecutionFramework execution;

	/**
	 * The cached value of the '{@link #getServiceDirectory() <em>Service Directory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDirectory()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDirectory> serviceDirectory;

	/**
	 * The cached value of the '{@link #getTemplateRepository() <em>Template Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateRepository()
	 * @generated
	 * @ordered
	 */
	protected TemplateRepository templateRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.SERVICE_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceTemplateMatchmaker> getMatchmaker() {
		if (matchmaker == null) {
			matchmaker = new EObjectContainmentEList<ServiceTemplateMatchmaker>(ServiceTemplateMatchmaker.class, this, ArchitecturePackage.SERVICE_FRAMEWORK__MATCHMAKER);
		}
		return matchmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFramework getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecution(ExecutionFramework newExecution, NotificationChain msgs) {
		ExecutionFramework oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION, oldExecution, newExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(ExecutionFramework newExecution) {
		if (newExecution != execution) {
			NotificationChain msgs = null;
			if (execution != null)
				msgs = ((InternalEObject)execution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION, null, msgs);
			if (newExecution != null)
				msgs = ((InternalEObject)newExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION, null, msgs);
			msgs = basicSetExecution(newExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION, newExecution, newExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDirectory> getServiceDirectory() {
		if (serviceDirectory == null) {
			serviceDirectory = new EObjectContainmentEList<ServiceDirectory>(ServiceDirectory.class, this, ArchitecturePackage.SERVICE_FRAMEWORK__SERVICE_DIRECTORY);
		}
		return serviceDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRepository getTemplateRepository() {
		return templateRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateRepository(TemplateRepository newTemplateRepository, NotificationChain msgs) {
		TemplateRepository oldTemplateRepository = templateRepository;
		templateRepository = newTemplateRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY, oldTemplateRepository, newTemplateRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateRepository(TemplateRepository newTemplateRepository) {
		if (newTemplateRepository != templateRepository) {
			NotificationChain msgs = null;
			if (templateRepository != null)
				msgs = ((InternalEObject)templateRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY, null, msgs);
			if (newTemplateRepository != null)
				msgs = ((InternalEObject)newTemplateRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY, null, msgs);
			msgs = basicSetTemplateRepository(newTemplateRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY, newTemplateRepository, newTemplateRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.SERVICE_FRAMEWORK__MATCHMAKER:
				return ((InternalEList<?>)getMatchmaker()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION:
				return basicSetExecution(null, msgs);
			case ArchitecturePackage.SERVICE_FRAMEWORK__SERVICE_DIRECTORY:
				return ((InternalEList<?>)getServiceDirectory()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY:
				return basicSetTemplateRepository(null, msgs);
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
			case ArchitecturePackage.SERVICE_FRAMEWORK__MATCHMAKER:
				return getMatchmaker();
			case ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION:
				return getExecution();
			case ArchitecturePackage.SERVICE_FRAMEWORK__SERVICE_DIRECTORY:
				return getServiceDirectory();
			case ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY:
				return getTemplateRepository();
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
			case ArchitecturePackage.SERVICE_FRAMEWORK__MATCHMAKER:
				getMatchmaker().clear();
				getMatchmaker().addAll((Collection<? extends ServiceTemplateMatchmaker>)newValue);
				return;
			case ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION:
				setExecution((ExecutionFramework)newValue);
				return;
			case ArchitecturePackage.SERVICE_FRAMEWORK__SERVICE_DIRECTORY:
				getServiceDirectory().clear();
				getServiceDirectory().addAll((Collection<? extends ServiceDirectory>)newValue);
				return;
			case ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY:
				setTemplateRepository((TemplateRepository)newValue);
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
			case ArchitecturePackage.SERVICE_FRAMEWORK__MATCHMAKER:
				getMatchmaker().clear();
				return;
			case ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION:
				setExecution((ExecutionFramework)null);
				return;
			case ArchitecturePackage.SERVICE_FRAMEWORK__SERVICE_DIRECTORY:
				getServiceDirectory().clear();
				return;
			case ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY:
				setTemplateRepository((TemplateRepository)null);
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
			case ArchitecturePackage.SERVICE_FRAMEWORK__MATCHMAKER:
				return matchmaker != null && !matchmaker.isEmpty();
			case ArchitecturePackage.SERVICE_FRAMEWORK__EXECUTION:
				return execution != null;
			case ArchitecturePackage.SERVICE_FRAMEWORK__SERVICE_DIRECTORY:
				return serviceDirectory != null && !serviceDirectory.isEmpty();
			case ArchitecturePackage.SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY:
				return templateRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceFrameworkImpl
