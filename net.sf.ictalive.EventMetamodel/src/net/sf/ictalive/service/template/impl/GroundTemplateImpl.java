/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import java.util.Collection;

import net.sf.ictalive.service.Service;
import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.template.BoundProcessModel;
import net.sf.ictalive.service.template.BoundTemplateParameter;
import net.sf.ictalive.service.template.GroundTemplate;
import net.sf.ictalive.service.template.ServiceTemplate;
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
 * An implementation of the model object '<em><b>Ground Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl#getImplement <em>Implement</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl#getBindTemplateParameter <em>Bind Template Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl#getBindProcessModel <em>Bind Process Model</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl#getExpose <em>Expose</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroundTemplateImpl extends EObjectImpl implements GroundTemplate
{
	/**
	 * The cached value of the '{@link #getImplement() <em>Implement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplement()
	 * @generated
	 * @ordered
	 */
	protected ServiceTemplate implement;

	/**
	 * The cached value of the '{@link #getBindTemplateParameter() <em>Bind Template Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundTemplateParameter> bindTemplateParameter;

	/**
	 * The cached value of the '{@link #getBindProcessModel() <em>Bind Process Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindProcessModel()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundProcessModel> bindProcessModel;

	/**
	 * The cached value of the '{@link #getExpose() <em>Expose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected Service expose;

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
	protected GroundTemplateImpl()
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
		return TemplatePackage.Literals.GROUND_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplate getImplement()
	{
		if (implement != null && implement.eIsProxy())
		{
			InternalEObject oldImplement = (InternalEObject)implement;
			implement = (ServiceTemplate)eResolveProxy(oldImplement);
			if (implement != oldImplement)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.GROUND_TEMPLATE__IMPLEMENT, oldImplement, implement));
			}
		}
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplate basicGetImplement()
	{
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplement(ServiceTemplate newImplement)
	{
		ServiceTemplate oldImplement = implement;
		implement = newImplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.GROUND_TEMPLATE__IMPLEMENT, oldImplement, implement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundTemplateParameter> getBindTemplateParameter()
	{
		if (bindTemplateParameter == null)
		{
			bindTemplateParameter = new EObjectContainmentEList<BoundTemplateParameter>(BoundTemplateParameter.class, this, TemplatePackage.GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER);
		}
		return bindTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundProcessModel> getBindProcessModel()
	{
		if (bindProcessModel == null)
		{
			bindProcessModel = new EObjectContainmentEList<BoundProcessModel>(BoundProcessModel.class, this, TemplatePackage.GROUND_TEMPLATE__BIND_PROCESS_MODEL);
		}
		return bindProcessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getExpose()
	{
		if (expose != null && expose.eIsProxy())
		{
			InternalEObject oldExpose = (InternalEObject)expose;
			expose = (Service)eResolveProxy(oldExpose);
			if (expose != oldExpose)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.GROUND_TEMPLATE__EXPOSE, oldExpose, expose));
			}
		}
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetExpose()
	{
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpose(Service newExpose, NotificationChain msgs)
	{
		Service oldExpose = expose;
		expose = newExpose;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.GROUND_TEMPLATE__EXPOSE, oldExpose, newExpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpose(Service newExpose)
	{
		if (newExpose != expose)
		{
			NotificationChain msgs = null;
			if (expose != null)
				msgs = ((InternalEObject)expose).eInverseRemove(this, ServicePackage.SERVICE__ADAPTED_BY, Service.class, msgs);
			if (newExpose != null)
				msgs = ((InternalEObject)newExpose).eInverseAdd(this, ServicePackage.SERVICE__ADAPTED_BY, Service.class, msgs);
			msgs = basicSetExpose(newExpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.GROUND_TEMPLATE__EXPOSE, newExpose, newExpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.GROUND_TEMPLATE__NAME, oldName, name));
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
			case TemplatePackage.GROUND_TEMPLATE__EXPOSE:
				if (expose != null)
					msgs = ((InternalEObject)expose).eInverseRemove(this, ServicePackage.SERVICE__ADAPTED_BY, Service.class, msgs);
				return basicSetExpose((Service)otherEnd, msgs);
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
			case TemplatePackage.GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getBindTemplateParameter()).basicRemove(otherEnd, msgs);
			case TemplatePackage.GROUND_TEMPLATE__BIND_PROCESS_MODEL:
				return ((InternalEList<?>)getBindProcessModel()).basicRemove(otherEnd, msgs);
			case TemplatePackage.GROUND_TEMPLATE__EXPOSE:
				return basicSetExpose(null, msgs);
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
			case TemplatePackage.GROUND_TEMPLATE__IMPLEMENT:
				if (resolve) return getImplement();
				return basicGetImplement();
			case TemplatePackage.GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER:
				return getBindTemplateParameter();
			case TemplatePackage.GROUND_TEMPLATE__BIND_PROCESS_MODEL:
				return getBindProcessModel();
			case TemplatePackage.GROUND_TEMPLATE__EXPOSE:
				if (resolve) return getExpose();
				return basicGetExpose();
			case TemplatePackage.GROUND_TEMPLATE__NAME:
				return getName();
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
			case TemplatePackage.GROUND_TEMPLATE__IMPLEMENT:
				setImplement((ServiceTemplate)newValue);
				return;
			case TemplatePackage.GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER:
				getBindTemplateParameter().clear();
				getBindTemplateParameter().addAll((Collection<? extends BoundTemplateParameter>)newValue);
				return;
			case TemplatePackage.GROUND_TEMPLATE__BIND_PROCESS_MODEL:
				getBindProcessModel().clear();
				getBindProcessModel().addAll((Collection<? extends BoundProcessModel>)newValue);
				return;
			case TemplatePackage.GROUND_TEMPLATE__EXPOSE:
				setExpose((Service)newValue);
				return;
			case TemplatePackage.GROUND_TEMPLATE__NAME:
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case TemplatePackage.GROUND_TEMPLATE__IMPLEMENT:
				setImplement((ServiceTemplate)null);
				return;
			case TemplatePackage.GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER:
				getBindTemplateParameter().clear();
				return;
			case TemplatePackage.GROUND_TEMPLATE__BIND_PROCESS_MODEL:
				getBindProcessModel().clear();
				return;
			case TemplatePackage.GROUND_TEMPLATE__EXPOSE:
				setExpose((Service)null);
				return;
			case TemplatePackage.GROUND_TEMPLATE__NAME:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case TemplatePackage.GROUND_TEMPLATE__IMPLEMENT:
				return implement != null;
			case TemplatePackage.GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER:
				return bindTemplateParameter != null && !bindTemplateParameter.isEmpty();
			case TemplatePackage.GROUND_TEMPLATE__BIND_PROCESS_MODEL:
				return bindProcessModel != null && !bindProcessModel.isEmpty();
			case TemplatePackage.GROUND_TEMPLATE__EXPOSE:
				return expose != null;
			case TemplatePackage.GROUND_TEMPLATE__NAME:
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GroundTemplateImpl
