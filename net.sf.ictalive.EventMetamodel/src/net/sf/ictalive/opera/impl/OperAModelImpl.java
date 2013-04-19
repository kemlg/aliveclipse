/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.impl;

import java.util.Collection;

import net.sf.ictalive.opera.OM.OM;
import net.sf.ictalive.opera.OM.Objective;

import net.sf.ictalive.opera.OperAModel;
import net.sf.ictalive.opera.OperaPackage;

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
 * An implementation of the model object '<em><b>Oper AModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.impl.OperAModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.impl.OperAModelImpl#getOm <em>Om</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.impl.OperAModelImpl#getOrganisationObjectives <em>Organisation Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperAModelImpl extends EObjectImpl implements OperAModel
{
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
	 * The cached value of the '{@link #getOm() <em>Om</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOm()
	 * @generated
	 * @ordered
	 */
	protected OM om;

	/**
	 * The cached value of the '{@link #getOrganisationObjectives() <em>Organisation Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> organisationObjectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperAModelImpl()
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
		return OperaPackage.Literals.OPER_AMODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperaPackage.OPER_AMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM getOm()
	{
		return om;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOm(OM newOm, NotificationChain msgs)
	{
		OM oldOm = om;
		om = newOm;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperaPackage.OPER_AMODEL__OM, oldOm, newOm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOm(OM newOm)
	{
		if (newOm != om)
		{
			NotificationChain msgs = null;
			if (om != null)
				msgs = ((InternalEObject)om).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperaPackage.OPER_AMODEL__OM, null, msgs);
			if (newOm != null)
				msgs = ((InternalEObject)newOm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperaPackage.OPER_AMODEL__OM, null, msgs);
			msgs = basicSetOm(newOm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperaPackage.OPER_AMODEL__OM, newOm, newOm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getOrganisationObjectives()
	{
		if (organisationObjectives == null)
		{
			organisationObjectives = new EObjectContainmentEList<Objective>(Objective.class, this, OperaPackage.OPER_AMODEL__ORGANISATION_OBJECTIVES);
		}
		return organisationObjectives;
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
			case OperaPackage.OPER_AMODEL__OM:
				return basicSetOm(null, msgs);
			case OperaPackage.OPER_AMODEL__ORGANISATION_OBJECTIVES:
				return ((InternalEList<?>)getOrganisationObjectives()).basicRemove(otherEnd, msgs);
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
			case OperaPackage.OPER_AMODEL__NAME:
				return getName();
			case OperaPackage.OPER_AMODEL__OM:
				return getOm();
			case OperaPackage.OPER_AMODEL__ORGANISATION_OBJECTIVES:
				return getOrganisationObjectives();
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
			case OperaPackage.OPER_AMODEL__NAME:
				setName((String)newValue);
				return;
			case OperaPackage.OPER_AMODEL__OM:
				setOm((OM)newValue);
				return;
			case OperaPackage.OPER_AMODEL__ORGANISATION_OBJECTIVES:
				getOrganisationObjectives().clear();
				getOrganisationObjectives().addAll((Collection<? extends Objective>)newValue);
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
			case OperaPackage.OPER_AMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OperaPackage.OPER_AMODEL__OM:
				setOm((OM)null);
				return;
			case OperaPackage.OPER_AMODEL__ORGANISATION_OBJECTIVES:
				getOrganisationObjectives().clear();
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
			case OperaPackage.OPER_AMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OperaPackage.OPER_AMODEL__OM:
				return om != null;
			case OperaPackage.OPER_AMODEL__ORGANISATION_OBJECTIVES:
				return organisationObjectives != null && !organisationObjectives.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperAModelImpl
