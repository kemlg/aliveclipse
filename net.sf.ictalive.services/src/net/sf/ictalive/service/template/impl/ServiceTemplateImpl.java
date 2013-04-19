/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import java.util.Collection;

import net.sf.ictalive.service.semantics.ServiceParameter;

import net.sf.ictalive.service.template.AbstractProcessModel;
import net.sf.ictalive.service.template.ServiceTemplate;
import net.sf.ictalive.service.template.TemplateConstraint;
import net.sf.ictalive.service.template.TemplateFlow;
import net.sf.ictalive.service.template.TemplatePackage;

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
 * An implementation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl#getExpose <em>Expose</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTemplateImpl extends EObjectImpl implements ServiceTemplate {
	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected TemplateFlow flow;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceParameter> templateParameter;

	/**
	 * The cached value of the '{@link #getExpose() <em>Expose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected AbstractProcessModel expose;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateConstraint> constraints;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatePackage.Literals.SERVICE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFlow getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlow(TemplateFlow newFlow, NotificationChain msgs) {
		TemplateFlow oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.SERVICE_TEMPLATE__FLOW, oldFlow, newFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(TemplateFlow newFlow) {
		if (newFlow != flow) {
			NotificationChain msgs = null;
			if (flow != null)
				msgs = ((InternalEObject)flow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.SERVICE_TEMPLATE__FLOW, null, msgs);
			if (newFlow != null)
				msgs = ((InternalEObject)newFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.SERVICE_TEMPLATE__FLOW, null, msgs);
			msgs = basicSetFlow(newFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.SERVICE_TEMPLATE__FLOW, newFlow, newFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceParameter> getTemplateParameter() {
		if (templateParameter == null) {
			templateParameter = new EObjectContainmentEList<ServiceParameter>(ServiceParameter.class, this, TemplatePackage.SERVICE_TEMPLATE__TEMPLATE_PARAMETER);
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel getExpose() {
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpose(AbstractProcessModel newExpose, NotificationChain msgs) {
		AbstractProcessModel oldExpose = expose;
		expose = newExpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.SERVICE_TEMPLATE__EXPOSE, oldExpose, newExpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpose(AbstractProcessModel newExpose) {
		if (newExpose != expose) {
			NotificationChain msgs = null;
			if (expose != null)
				msgs = ((InternalEObject)expose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.SERVICE_TEMPLATE__EXPOSE, null, msgs);
			if (newExpose != null)
				msgs = ((InternalEObject)newExpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.SERVICE_TEMPLATE__EXPOSE, null, msgs);
			msgs = basicSetExpose(newExpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.SERVICE_TEMPLATE__EXPOSE, newExpose, newExpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<TemplateConstraint>(TemplateConstraint.class, this, TemplatePackage.SERVICE_TEMPLATE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.SERVICE_TEMPLATE__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemplatePackage.SERVICE_TEMPLATE__FLOW:
				return basicSetFlow(null, msgs);
			case TemplatePackage.SERVICE_TEMPLATE__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case TemplatePackage.SERVICE_TEMPLATE__EXPOSE:
				return basicSetExpose(null, msgs);
			case TemplatePackage.SERVICE_TEMPLATE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case TemplatePackage.SERVICE_TEMPLATE__FLOW:
				return getFlow();
			case TemplatePackage.SERVICE_TEMPLATE__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case TemplatePackage.SERVICE_TEMPLATE__EXPOSE:
				return getExpose();
			case TemplatePackage.SERVICE_TEMPLATE__CONSTRAINTS:
				return getConstraints();
			case TemplatePackage.SERVICE_TEMPLATE__URI:
				return getURI();
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
			case TemplatePackage.SERVICE_TEMPLATE__FLOW:
				setFlow((TemplateFlow)newValue);
				return;
			case TemplatePackage.SERVICE_TEMPLATE__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends ServiceParameter>)newValue);
				return;
			case TemplatePackage.SERVICE_TEMPLATE__EXPOSE:
				setExpose((AbstractProcessModel)newValue);
				return;
			case TemplatePackage.SERVICE_TEMPLATE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends TemplateConstraint>)newValue);
				return;
			case TemplatePackage.SERVICE_TEMPLATE__URI:
				setURI((String)newValue);
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
			case TemplatePackage.SERVICE_TEMPLATE__FLOW:
				setFlow((TemplateFlow)null);
				return;
			case TemplatePackage.SERVICE_TEMPLATE__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case TemplatePackage.SERVICE_TEMPLATE__EXPOSE:
				setExpose((AbstractProcessModel)null);
				return;
			case TemplatePackage.SERVICE_TEMPLATE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case TemplatePackage.SERVICE_TEMPLATE__URI:
				setURI(URI_EDEFAULT);
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
			case TemplatePackage.SERVICE_TEMPLATE__FLOW:
				return flow != null;
			case TemplatePackage.SERVICE_TEMPLATE__TEMPLATE_PARAMETER:
				return templateParameter != null && !templateParameter.isEmpty();
			case TemplatePackage.SERVICE_TEMPLATE__EXPOSE:
				return expose != null;
			case TemplatePackage.SERVICE_TEMPLATE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case TemplatePackage.SERVICE_TEMPLATE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (URI: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ServiceTemplateImpl
