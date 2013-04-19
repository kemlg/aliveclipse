/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.impl;

import java.util.Collection;

import net.sf.ictalive.service.SL;
import net.sf.ictalive.service.Service;
import net.sf.ictalive.service.ServiceConsumer;
import net.sf.ictalive.service.ServicePackage;
import net.sf.ictalive.service.ServiceProvider;

import net.sf.ictalive.service.architecture.ServiceFramework;

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
 * An implementation of the model object '<em><b>SL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.impl.SLImpl#getServices <em>Services</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.SLImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.SLImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.SLImpl#getFramework <em>Framework</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SLImpl extends EObjectImpl implements SL {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProvider> providers;

	/**
	 * The cached value of the '{@link #getConsumers() <em>Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConsumer> consumers;

	/**
	 * The cached value of the '{@link #getFramework() <em>Framework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework()
	 * @generated
	 * @ordered
	 */
	protected ServiceFramework framework;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, ServicePackage.SL__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceProvider> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, ServicePackage.SL__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceConsumer> getConsumers() {
		if (consumers == null) {
			consumers = new EObjectContainmentEList<ServiceConsumer>(ServiceConsumer.class, this, ServicePackage.SL__CONSUMERS);
		}
		return consumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFramework getFramework() {
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFramework(ServiceFramework newFramework, NotificationChain msgs) {
		ServiceFramework oldFramework = framework;
		framework = newFramework;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SL__FRAMEWORK, oldFramework, newFramework);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramework(ServiceFramework newFramework) {
		if (newFramework != framework) {
			NotificationChain msgs = null;
			if (framework != null)
				msgs = ((InternalEObject)framework).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SL__FRAMEWORK, null, msgs);
			if (newFramework != null)
				msgs = ((InternalEObject)newFramework).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SL__FRAMEWORK, null, msgs);
			msgs = basicSetFramework(newFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SL__FRAMEWORK, newFramework, newFramework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SL__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ServicePackage.SL__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
			case ServicePackage.SL__CONSUMERS:
				return ((InternalEList<?>)getConsumers()).basicRemove(otherEnd, msgs);
			case ServicePackage.SL__FRAMEWORK:
				return basicSetFramework(null, msgs);
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
			case ServicePackage.SL__SERVICES:
				return getServices();
			case ServicePackage.SL__PROVIDERS:
				return getProviders();
			case ServicePackage.SL__CONSUMERS:
				return getConsumers();
			case ServicePackage.SL__FRAMEWORK:
				return getFramework();
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
			case ServicePackage.SL__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.SL__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends ServiceProvider>)newValue);
				return;
			case ServicePackage.SL__CONSUMERS:
				getConsumers().clear();
				getConsumers().addAll((Collection<? extends ServiceConsumer>)newValue);
				return;
			case ServicePackage.SL__FRAMEWORK:
				setFramework((ServiceFramework)newValue);
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
			case ServicePackage.SL__SERVICES:
				getServices().clear();
				return;
			case ServicePackage.SL__PROVIDERS:
				getProviders().clear();
				return;
			case ServicePackage.SL__CONSUMERS:
				getConsumers().clear();
				return;
			case ServicePackage.SL__FRAMEWORK:
				setFramework((ServiceFramework)null);
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
			case ServicePackage.SL__SERVICES:
				return services != null && !services.isEmpty();
			case ServicePackage.SL__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case ServicePackage.SL__CONSUMERS:
				return consumers != null && !consumers.isEmpty();
			case ServicePackage.SL__FRAMEWORK:
				return framework != null;
		}
		return super.eIsSet(featureID);
	}

} //SLImpl
