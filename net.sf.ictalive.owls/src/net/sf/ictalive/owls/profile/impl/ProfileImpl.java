/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile.impl;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Result;

import net.sf.ictalive.owls.profile.Profile;
import net.sf.ictalive.owls.profile.ProfilePackage;
import net.sf.ictalive.owls.profile.ServiceCategory;
import net.sf.ictalive.owls.profile.ServiceParameter;

import net.sf.ictalive.owls.service.impl.ServiceProfileImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getTextDescription <em>Text Description</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getHas_process <em>Has process</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getServiceParameter <em>Service Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getHasParameter <em>Has Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getServiceClassification <em>Service Classification</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ProfileImpl#getServiceProduct <em>Service Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends ServiceProfileImpl implements Profile {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextDescription() <em>Text Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextDescription() <em>Text Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDescription()
	 * @generated
	 * @ordered
	 */
	protected String textDescription = TEXT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactInformation() <em>Contact Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTACT_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected Object contactInformation = CONTACT_INFORMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas_process() <em>Has process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_process()
	 * @generated
	 * @ordered
	 */
	protected net.sf.ictalive.owls.process.Process has_process;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected ServiceCategory serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceParameter() <em>Service Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceParameter()
	 * @generated
	 * @ordered
	 */
	protected ServiceParameter serviceParameter;

	/**
	 * The cached value of the '{@link #getHasParameter() <em>Has Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter hasParameter;

	/**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected Input hasInput;

	/**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
	protected Output hasOutput;

	/**
	 * The cached value of the '{@link #getHasPrecondition() <em>Has Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Condition hasPrecondition;

	/**
	 * The cached value of the '{@link #getHasResult() <em>Has Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResult()
	 * @generated
	 * @ordered
	 */
	protected Result hasResult;

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
	 * The default value of the '{@link #getServiceProduct() <em>Service Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProduct()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceProduct() <em>Service Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProduct()
	 * @generated
	 * @ordered
	 */
	protected String serviceProduct = SERVICE_PRODUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextDescription() {
		return textDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDescription(String newTextDescription) {
		String oldTextDescription = textDescription;
		textDescription = newTextDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__TEXT_DESCRIPTION, oldTextDescription, textDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContactInformation() {
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactInformation(Object newContactInformation) {
		Object oldContactInformation = contactInformation;
		contactInformation = newContactInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__CONTACT_INFORMATION, oldContactInformation, contactInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.ictalive.owls.process.Process getHas_process() {
		if (has_process != null && has_process.eIsProxy()) {
			InternalEObject oldHas_process = (InternalEObject)has_process;
			has_process = (net.sf.ictalive.owls.process.Process)eResolveProxy(oldHas_process);
			if (has_process != oldHas_process) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__HAS_PROCESS, oldHas_process, has_process));
			}
		}
		return has_process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.ictalive.owls.process.Process basicGetHas_process() {
		return has_process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_process(net.sf.ictalive.owls.process.Process newHas_process) {
		net.sf.ictalive.owls.process.Process oldHas_process = has_process;
		has_process = newHas_process;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__HAS_PROCESS, oldHas_process, has_process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory getServiceCategory() {
		if (serviceCategory != null && serviceCategory.eIsProxy()) {
			InternalEObject oldServiceCategory = (InternalEObject)serviceCategory;
			serviceCategory = (ServiceCategory)eResolveProxy(oldServiceCategory);
			if (serviceCategory != oldServiceCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
			}
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory basicGetServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(ServiceCategory newServiceCategory) {
		ServiceCategory oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter getServiceParameter() {
		if (serviceParameter != null && serviceParameter.eIsProxy()) {
			InternalEObject oldServiceParameter = (InternalEObject)serviceParameter;
			serviceParameter = (ServiceParameter)eResolveProxy(oldServiceParameter);
			if (serviceParameter != oldServiceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__SERVICE_PARAMETER, oldServiceParameter, serviceParameter));
			}
		}
		return serviceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter basicGetServiceParameter() {
		return serviceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceParameter(ServiceParameter newServiceParameter) {
		ServiceParameter oldServiceParameter = serviceParameter;
		serviceParameter = newServiceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__SERVICE_PARAMETER, oldServiceParameter, serviceParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getHasParameter() {
		if (hasParameter != null && hasParameter.eIsProxy()) {
			InternalEObject oldHasParameter = (InternalEObject)hasParameter;
			hasParameter = (Parameter)eResolveProxy(oldHasParameter);
			if (hasParameter != oldHasParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__HAS_PARAMETER, oldHasParameter, hasParameter));
			}
		}
		return hasParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetHasParameter() {
		return hasParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasParameter(Parameter newHasParameter) {
		Parameter oldHasParameter = hasParameter;
		hasParameter = newHasParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__HAS_PARAMETER, oldHasParameter, hasParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getHasInput() {
		if (hasInput != null && hasInput.eIsProxy()) {
			InternalEObject oldHasInput = (InternalEObject)hasInput;
			hasInput = (Input)eResolveProxy(oldHasInput);
			if (hasInput != oldHasInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__HAS_INPUT, oldHasInput, hasInput));
			}
		}
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetHasInput() {
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInput(Input newHasInput) {
		Input oldHasInput = hasInput;
		hasInput = newHasInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__HAS_INPUT, oldHasInput, hasInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getHasOutput() {
		if (hasOutput != null && hasOutput.eIsProxy()) {
			InternalEObject oldHasOutput = (InternalEObject)hasOutput;
			hasOutput = (Output)eResolveProxy(oldHasOutput);
			if (hasOutput != oldHasOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__HAS_OUTPUT, oldHasOutput, hasOutput));
			}
		}
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetHasOutput() {
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOutput(Output newHasOutput) {
		Output oldHasOutput = hasOutput;
		hasOutput = newHasOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__HAS_OUTPUT, oldHasOutput, hasOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getHasPrecondition() {
		if (hasPrecondition != null && hasPrecondition.eIsProxy()) {
			InternalEObject oldHasPrecondition = (InternalEObject)hasPrecondition;
			hasPrecondition = (Condition)eResolveProxy(oldHasPrecondition);
			if (hasPrecondition != oldHasPrecondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__HAS_PRECONDITION, oldHasPrecondition, hasPrecondition));
			}
		}
		return hasPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetHasPrecondition() {
		return hasPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPrecondition(Condition newHasPrecondition) {
		Condition oldHasPrecondition = hasPrecondition;
		hasPrecondition = newHasPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__HAS_PRECONDITION, oldHasPrecondition, hasPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result getHasResult() {
		if (hasResult != null && hasResult.eIsProxy()) {
			InternalEObject oldHasResult = (InternalEObject)hasResult;
			hasResult = (Result)eResolveProxy(oldHasResult);
			if (hasResult != oldHasResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.PROFILE__HAS_RESULT, oldHasResult, hasResult));
			}
		}
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result basicGetHasResult() {
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasResult(Result newHasResult) {
		Result oldHasResult = hasResult;
		hasResult = newHasResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__HAS_RESULT, oldHasResult, hasResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceClassification() {
		return serviceClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClassification(String newServiceClassification) {
		String oldServiceClassification = serviceClassification;
		serviceClassification = newServiceClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__SERVICE_CLASSIFICATION, oldServiceClassification, serviceClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceProduct() {
		return serviceProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProduct(String newServiceProduct) {
		String oldServiceProduct = serviceProduct;
		serviceProduct = newServiceProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PROFILE__SERVICE_PRODUCT, oldServiceProduct, serviceProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilePackage.PROFILE__SERVICE_NAME:
				return getServiceName();
			case ProfilePackage.PROFILE__TEXT_DESCRIPTION:
				return getTextDescription();
			case ProfilePackage.PROFILE__CONTACT_INFORMATION:
				return getContactInformation();
			case ProfilePackage.PROFILE__HAS_PROCESS:
				if (resolve) return getHas_process();
				return basicGetHas_process();
			case ProfilePackage.PROFILE__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case ProfilePackage.PROFILE__SERVICE_PARAMETER:
				if (resolve) return getServiceParameter();
				return basicGetServiceParameter();
			case ProfilePackage.PROFILE__HAS_PARAMETER:
				if (resolve) return getHasParameter();
				return basicGetHasParameter();
			case ProfilePackage.PROFILE__HAS_INPUT:
				if (resolve) return getHasInput();
				return basicGetHasInput();
			case ProfilePackage.PROFILE__HAS_OUTPUT:
				if (resolve) return getHasOutput();
				return basicGetHasOutput();
			case ProfilePackage.PROFILE__HAS_PRECONDITION:
				if (resolve) return getHasPrecondition();
				return basicGetHasPrecondition();
			case ProfilePackage.PROFILE__HAS_RESULT:
				if (resolve) return getHasResult();
				return basicGetHasResult();
			case ProfilePackage.PROFILE__SERVICE_CLASSIFICATION:
				return getServiceClassification();
			case ProfilePackage.PROFILE__SERVICE_PRODUCT:
				return getServiceProduct();
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
			case ProfilePackage.PROFILE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ProfilePackage.PROFILE__TEXT_DESCRIPTION:
				setTextDescription((String)newValue);
				return;
			case ProfilePackage.PROFILE__CONTACT_INFORMATION:
				setContactInformation(newValue);
				return;
			case ProfilePackage.PROFILE__HAS_PROCESS:
				setHas_process((net.sf.ictalive.owls.process.Process)newValue);
				return;
			case ProfilePackage.PROFILE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case ProfilePackage.PROFILE__SERVICE_PARAMETER:
				setServiceParameter((ServiceParameter)newValue);
				return;
			case ProfilePackage.PROFILE__HAS_PARAMETER:
				setHasParameter((Parameter)newValue);
				return;
			case ProfilePackage.PROFILE__HAS_INPUT:
				setHasInput((Input)newValue);
				return;
			case ProfilePackage.PROFILE__HAS_OUTPUT:
				setHasOutput((Output)newValue);
				return;
			case ProfilePackage.PROFILE__HAS_PRECONDITION:
				setHasPrecondition((Condition)newValue);
				return;
			case ProfilePackage.PROFILE__HAS_RESULT:
				setHasResult((Result)newValue);
				return;
			case ProfilePackage.PROFILE__SERVICE_CLASSIFICATION:
				setServiceClassification((String)newValue);
				return;
			case ProfilePackage.PROFILE__SERVICE_PRODUCT:
				setServiceProduct((String)newValue);
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
			case ProfilePackage.PROFILE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ProfilePackage.PROFILE__TEXT_DESCRIPTION:
				setTextDescription(TEXT_DESCRIPTION_EDEFAULT);
				return;
			case ProfilePackage.PROFILE__CONTACT_INFORMATION:
				setContactInformation(CONTACT_INFORMATION_EDEFAULT);
				return;
			case ProfilePackage.PROFILE__HAS_PROCESS:
				setHas_process((net.sf.ictalive.owls.process.Process)null);
				return;
			case ProfilePackage.PROFILE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case ProfilePackage.PROFILE__SERVICE_PARAMETER:
				setServiceParameter((ServiceParameter)null);
				return;
			case ProfilePackage.PROFILE__HAS_PARAMETER:
				setHasParameter((Parameter)null);
				return;
			case ProfilePackage.PROFILE__HAS_INPUT:
				setHasInput((Input)null);
				return;
			case ProfilePackage.PROFILE__HAS_OUTPUT:
				setHasOutput((Output)null);
				return;
			case ProfilePackage.PROFILE__HAS_PRECONDITION:
				setHasPrecondition((Condition)null);
				return;
			case ProfilePackage.PROFILE__HAS_RESULT:
				setHasResult((Result)null);
				return;
			case ProfilePackage.PROFILE__SERVICE_CLASSIFICATION:
				setServiceClassification(SERVICE_CLASSIFICATION_EDEFAULT);
				return;
			case ProfilePackage.PROFILE__SERVICE_PRODUCT:
				setServiceProduct(SERVICE_PRODUCT_EDEFAULT);
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
			case ProfilePackage.PROFILE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ProfilePackage.PROFILE__TEXT_DESCRIPTION:
				return TEXT_DESCRIPTION_EDEFAULT == null ? textDescription != null : !TEXT_DESCRIPTION_EDEFAULT.equals(textDescription);
			case ProfilePackage.PROFILE__CONTACT_INFORMATION:
				return CONTACT_INFORMATION_EDEFAULT == null ? contactInformation != null : !CONTACT_INFORMATION_EDEFAULT.equals(contactInformation);
			case ProfilePackage.PROFILE__HAS_PROCESS:
				return has_process != null;
			case ProfilePackage.PROFILE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case ProfilePackage.PROFILE__SERVICE_PARAMETER:
				return serviceParameter != null;
			case ProfilePackage.PROFILE__HAS_PARAMETER:
				return hasParameter != null;
			case ProfilePackage.PROFILE__HAS_INPUT:
				return hasInput != null;
			case ProfilePackage.PROFILE__HAS_OUTPUT:
				return hasOutput != null;
			case ProfilePackage.PROFILE__HAS_PRECONDITION:
				return hasPrecondition != null;
			case ProfilePackage.PROFILE__HAS_RESULT:
				return hasResult != null;
			case ProfilePackage.PROFILE__SERVICE_CLASSIFICATION:
				return SERVICE_CLASSIFICATION_EDEFAULT == null ? serviceClassification != null : !SERVICE_CLASSIFICATION_EDEFAULT.equals(serviceClassification);
			case ProfilePackage.PROFILE__SERVICE_PRODUCT:
				return SERVICE_PRODUCT_EDEFAULT == null ? serviceProduct != null : !SERVICE_PRODUCT_EDEFAULT.equals(serviceProduct);
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
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", textDescription: ");
		result.append(textDescription);
		result.append(", contactInformation: ");
		result.append(contactInformation);
		result.append(", serviceClassification: ");
		result.append(serviceClassification);
		result.append(", serviceProduct: ");
		result.append(serviceProduct);
		result.append(')');
		return result.toString();
	}

} //ProfileImpl
