/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service.impl;

import java.util.Collection;

import net.sf.ictalive.owls.service.Service;
import net.sf.ictalive.owls.service.ServiceGrounding;
import net.sf.ictalive.owls.service.ServiceModel;
import net.sf.ictalive.owls.service.ServicePackage;
import net.sf.ictalive.owls.service.ServiceProfile;
import net.sf.ictalive.owls.service.ServiceProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.impl.ServiceImpl#getPresents <em>Presents</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.impl.ServiceImpl#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.impl.ServiceImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.service.impl.ServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service
{
	/**
	 * The cached value of the '{@link #getPresents() <em>Presents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresents()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProfile> presents;

	/**
	 * The cached value of the '{@link #getDescribedBy() <em>Described By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedBy()
	 * @generated
	 * @ordered
	 */
	protected ServiceModel describedBy;

	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected ServiceGrounding supports;

	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProvider> providedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl()
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
		return ServicePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceProfile> getPresents()
	{
		if (presents == null)
		{
			presents = new EObjectContainmentWithInverseEList<ServiceProfile>(ServiceProfile.class, this, ServicePackage.SERVICE__PRESENTS, ServicePackage.SERVICE_PROFILE__PRESENTED_BY);
		}
		return presents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceModel getDescribedBy()
	{
		return describedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedBy(ServiceModel newDescribedBy, NotificationChain msgs)
	{
		ServiceModel oldDescribedBy = describedBy;
		describedBy = newDescribedBy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__DESCRIBED_BY, oldDescribedBy, newDescribedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedBy(ServiceModel newDescribedBy)
	{
		if (newDescribedBy != describedBy)
		{
			NotificationChain msgs = null;
			if (describedBy != null)
				msgs = ((InternalEObject)describedBy).eInverseRemove(this, ServicePackage.SERVICE_MODEL__DESCRIBES, ServiceModel.class, msgs);
			if (newDescribedBy != null)
				msgs = ((InternalEObject)newDescribedBy).eInverseAdd(this, ServicePackage.SERVICE_MODEL__DESCRIBES, ServiceModel.class, msgs);
			msgs = basicSetDescribedBy(newDescribedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__DESCRIBED_BY, newDescribedBy, newDescribedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGrounding getSupports()
	{
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupports(ServiceGrounding newSupports, NotificationChain msgs)
	{
		ServiceGrounding oldSupports = supports;
		supports = newSupports;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SUPPORTS, oldSupports, newSupports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupports(ServiceGrounding newSupports)
	{
		if (newSupports != supports)
		{
			NotificationChain msgs = null;
			if (supports != null)
				msgs = ((InternalEObject)supports).eInverseRemove(this, ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY, ServiceGrounding.class, msgs);
			if (newSupports != null)
				msgs = ((InternalEObject)newSupports).eInverseAdd(this, ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY, ServiceGrounding.class, msgs);
			msgs = basicSetSupports(newSupports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SUPPORTS, newSupports, newSupports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceProvider> getProvidedBy()
	{
		if (providedBy == null)
		{
			providedBy = new EObjectWithInverseResolvingEList.ManyInverse<ServiceProvider>(ServiceProvider.class, this, ServicePackage.SERVICE__PROVIDED_BY, ServicePackage.SERVICE_PROVIDER__PROVIDES);
		}
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE__PRESENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPresents()).basicAdd(otherEnd, msgs);
			case ServicePackage.SERVICE__DESCRIBED_BY:
				if (describedBy != null)
					msgs = ((InternalEObject)describedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__DESCRIBED_BY, null, msgs);
				return basicSetDescribedBy((ServiceModel)otherEnd, msgs);
			case ServicePackage.SERVICE__SUPPORTS:
				if (supports != null)
					msgs = ((InternalEObject)supports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__SUPPORTS, null, msgs);
				return basicSetSupports((ServiceGrounding)otherEnd, msgs);
			case ServicePackage.SERVICE__PROVIDED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedBy()).basicAdd(otherEnd, msgs);
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
			case ServicePackage.SERVICE__PRESENTS:
				return ((InternalEList<?>)getPresents()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__DESCRIBED_BY:
				return basicSetDescribedBy(null, msgs);
			case ServicePackage.SERVICE__SUPPORTS:
				return basicSetSupports(null, msgs);
			case ServicePackage.SERVICE__PROVIDED_BY:
				return ((InternalEList<?>)getProvidedBy()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE__PRESENTS:
				return getPresents();
			case ServicePackage.SERVICE__DESCRIBED_BY:
				return getDescribedBy();
			case ServicePackage.SERVICE__SUPPORTS:
				return getSupports();
			case ServicePackage.SERVICE__PROVIDED_BY:
				return getProvidedBy();
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
			case ServicePackage.SERVICE__PRESENTS:
				getPresents().clear();
				getPresents().addAll((Collection<? extends ServiceProfile>)newValue);
				return;
			case ServicePackage.SERVICE__DESCRIBED_BY:
				setDescribedBy((ServiceModel)newValue);
				return;
			case ServicePackage.SERVICE__SUPPORTS:
				setSupports((ServiceGrounding)newValue);
				return;
			case ServicePackage.SERVICE__PROVIDED_BY:
				getProvidedBy().clear();
				getProvidedBy().addAll((Collection<? extends ServiceProvider>)newValue);
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
			case ServicePackage.SERVICE__PRESENTS:
				getPresents().clear();
				return;
			case ServicePackage.SERVICE__DESCRIBED_BY:
				setDescribedBy((ServiceModel)null);
				return;
			case ServicePackage.SERVICE__SUPPORTS:
				setSupports((ServiceGrounding)null);
				return;
			case ServicePackage.SERVICE__PROVIDED_BY:
				getProvidedBy().clear();
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
			case ServicePackage.SERVICE__PRESENTS:
				return presents != null && !presents.isEmpty();
			case ServicePackage.SERVICE__DESCRIBED_BY:
				return describedBy != null;
			case ServicePackage.SERVICE__SUPPORTS:
				return supports != null;
			case ServicePackage.SERVICE__PROVIDED_BY:
				return providedBy != null && !providedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
