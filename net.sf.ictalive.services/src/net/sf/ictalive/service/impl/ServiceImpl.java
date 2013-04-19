/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.impl;

import java.util.Collection;

import net.sf.ictalive.service.Service;
import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.semantics.ProcessModel;
import net.sf.ictalive.service.semantics.SemanticsPackage;
import net.sf.ictalive.service.semantics.ServiceGrounding;
import net.sf.ictalive.service.semantics.ServiceProfile;

import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.InterfaceDescription;

import net.sf.ictalive.service.template.GroundTemplate;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getPresents <em>Presents</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceImpl#getAdaptedBy <em>Adapted By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Endpoint> endpoint;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDescription interface_;

	/**
	 * The cached value of the '{@link #getPresents() <em>Presents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresents()
	 * @generated
	 * @ordered
	 */
	protected ServiceProfile presents;

	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceGrounding> supports;

	/**
	 * The cached value of the '{@link #getDescribedBy() <em>Described By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedBy()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel describedBy;

	/**
	 * The cached value of the '{@link #getAdaptedBy() <em>Adapted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptedBy()
	 * @generated
	 * @ordered
	 */
	protected GroundTemplate adaptedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Endpoint>(Endpoint.class, this, ServicePackage.SERVICE__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDescription getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(InterfaceDescription newInterface, NotificationChain msgs) {
		InterfaceDescription oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(InterfaceDescription newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProfile getPresents() {
		return presents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresents(ServiceProfile newPresents, NotificationChain msgs) {
		ServiceProfile oldPresents = presents;
		presents = newPresents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__PRESENTS, oldPresents, newPresents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresents(ServiceProfile newPresents) {
		if (newPresents != presents) {
			NotificationChain msgs = null;
			if (presents != null)
				msgs = ((InternalEObject)presents).eInverseRemove(this, SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY, ServiceProfile.class, msgs);
			if (newPresents != null)
				msgs = ((InternalEObject)newPresents).eInverseAdd(this, SemanticsPackage.SERVICE_PROFILE__PRESENTED_BY, ServiceProfile.class, msgs);
			msgs = basicSetPresents(newPresents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__PRESENTS, newPresents, newPresents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceGrounding> getSupports() {
		if (supports == null) {
			supports = new EObjectContainmentWithInverseEList<ServiceGrounding>(ServiceGrounding.class, this, ServicePackage.SERVICE__SUPPORTS, SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY);
		}
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getDescribedBy() {
		return describedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedBy(ProcessModel newDescribedBy, NotificationChain msgs) {
		ProcessModel oldDescribedBy = describedBy;
		describedBy = newDescribedBy;
		if (eNotificationRequired()) {
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
	public void setDescribedBy(ProcessModel newDescribedBy) {
		if (newDescribedBy != describedBy) {
			NotificationChain msgs = null;
			if (describedBy != null)
				msgs = ((InternalEObject)describedBy).eInverseRemove(this, SemanticsPackage.PROCESS_MODEL__DESCRIBES, ProcessModel.class, msgs);
			if (newDescribedBy != null)
				msgs = ((InternalEObject)newDescribedBy).eInverseAdd(this, SemanticsPackage.PROCESS_MODEL__DESCRIBES, ProcessModel.class, msgs);
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
	public GroundTemplate getAdaptedBy() {
		if (adaptedBy != null && adaptedBy.eIsProxy()) {
			InternalEObject oldAdaptedBy = (InternalEObject)adaptedBy;
			adaptedBy = (GroundTemplate)eResolveProxy(oldAdaptedBy);
			if (adaptedBy != oldAdaptedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE__ADAPTED_BY, oldAdaptedBy, adaptedBy));
			}
		}
		return adaptedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundTemplate basicGetAdaptedBy() {
		return adaptedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdaptedBy(GroundTemplate newAdaptedBy, NotificationChain msgs) {
		GroundTemplate oldAdaptedBy = adaptedBy;
		adaptedBy = newAdaptedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__ADAPTED_BY, oldAdaptedBy, newAdaptedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptedBy(GroundTemplate newAdaptedBy) {
		if (newAdaptedBy != adaptedBy) {
			NotificationChain msgs = null;
			if (adaptedBy != null)
				msgs = ((InternalEObject)adaptedBy).eInverseRemove(this, TemplatePackage.GROUND_TEMPLATE__EXPOSE, GroundTemplate.class, msgs);
			if (newAdaptedBy != null)
				msgs = ((InternalEObject)newAdaptedBy).eInverseAdd(this, TemplatePackage.GROUND_TEMPLATE__EXPOSE, GroundTemplate.class, msgs);
			msgs = basicSetAdaptedBy(newAdaptedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__ADAPTED_BY, newAdaptedBy, newAdaptedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE__PRESENTS:
				if (presents != null)
					msgs = ((InternalEObject)presents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__PRESENTS, null, msgs);
				return basicSetPresents((ServiceProfile)otherEnd, msgs);
			case ServicePackage.SERVICE__SUPPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupports()).basicAdd(otherEnd, msgs);
			case ServicePackage.SERVICE__DESCRIBED_BY:
				if (describedBy != null)
					msgs = ((InternalEObject)describedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__DESCRIBED_BY, null, msgs);
				return basicSetDescribedBy((ProcessModel)otherEnd, msgs);
			case ServicePackage.SERVICE__ADAPTED_BY:
				if (adaptedBy != null)
					msgs = ((InternalEObject)adaptedBy).eInverseRemove(this, TemplatePackage.GROUND_TEMPLATE__EXPOSE, GroundTemplate.class, msgs);
				return basicSetAdaptedBy((GroundTemplate)otherEnd, msgs);
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
			case ServicePackage.SERVICE__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__INTERFACE:
				return basicSetInterface(null, msgs);
			case ServicePackage.SERVICE__PRESENTS:
				return basicSetPresents(null, msgs);
			case ServicePackage.SERVICE__SUPPORTS:
				return ((InternalEList<?>)getSupports()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__DESCRIBED_BY:
				return basicSetDescribedBy(null, msgs);
			case ServicePackage.SERVICE__ADAPTED_BY:
				return basicSetAdaptedBy(null, msgs);
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
			case ServicePackage.SERVICE__NAME:
				return getName();
			case ServicePackage.SERVICE__NAMESPACE:
				return getNamespace();
			case ServicePackage.SERVICE__DESCRIPTION:
				return getDescription();
			case ServicePackage.SERVICE__ENDPOINT:
				return getEndpoint();
			case ServicePackage.SERVICE__INTERFACE:
				return getInterface();
			case ServicePackage.SERVICE__PRESENTS:
				return getPresents();
			case ServicePackage.SERVICE__SUPPORTS:
				return getSupports();
			case ServicePackage.SERVICE__DESCRIBED_BY:
				return getDescribedBy();
			case ServicePackage.SERVICE__ADAPTED_BY:
				if (resolve) return getAdaptedBy();
				return basicGetAdaptedBy();
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
			case ServicePackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.SERVICE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case ServicePackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ServicePackage.SERVICE__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Endpoint>)newValue);
				return;
			case ServicePackage.SERVICE__INTERFACE:
				setInterface((InterfaceDescription)newValue);
				return;
			case ServicePackage.SERVICE__PRESENTS:
				setPresents((ServiceProfile)newValue);
				return;
			case ServicePackage.SERVICE__SUPPORTS:
				getSupports().clear();
				getSupports().addAll((Collection<? extends ServiceGrounding>)newValue);
				return;
			case ServicePackage.SERVICE__DESCRIBED_BY:
				setDescribedBy((ProcessModel)newValue);
				return;
			case ServicePackage.SERVICE__ADAPTED_BY:
				setAdaptedBy((GroundTemplate)newValue);
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
			case ServicePackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.SERVICE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case ServicePackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ServicePackage.SERVICE__ENDPOINT:
				getEndpoint().clear();
				return;
			case ServicePackage.SERVICE__INTERFACE:
				setInterface((InterfaceDescription)null);
				return;
			case ServicePackage.SERVICE__PRESENTS:
				setPresents((ServiceProfile)null);
				return;
			case ServicePackage.SERVICE__SUPPORTS:
				getSupports().clear();
				return;
			case ServicePackage.SERVICE__DESCRIBED_BY:
				setDescribedBy((ProcessModel)null);
				return;
			case ServicePackage.SERVICE__ADAPTED_BY:
				setAdaptedBy((GroundTemplate)null);
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
			case ServicePackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.SERVICE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case ServicePackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ServicePackage.SERVICE__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case ServicePackage.SERVICE__INTERFACE:
				return interface_ != null;
			case ServicePackage.SERVICE__PRESENTS:
				return presents != null;
			case ServicePackage.SERVICE__SUPPORTS:
				return supports != null && !supports.isEmpty();
			case ServicePackage.SERVICE__DESCRIBED_BY:
				return describedBy != null;
			case ServicePackage.SERVICE__ADAPTED_BY:
				return adaptedBy != null;
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
