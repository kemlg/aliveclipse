/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.impl;

import net.sf.ictalive.opera.OM.DeonticStatement;
import net.sf.ictalive.opera.OM.Norm;
import net.sf.ictalive.opera.OM.OMPackage;
import net.sf.ictalive.opera.OM.PartialStateDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.NormImpl#getNormID <em>Norm ID</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.NormImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.NormImpl#getExpirationCondition <em>Expiration Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.NormImpl#getMaintenanceCondition <em>Maintenance Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.NormImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.NormImpl#getDeontics <em>Deontics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormImpl extends EObjectImpl implements Norm
{
	/**
	 * The default value of the '{@link #getNormID() <em>Norm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormID()
	 * @generated
	 * @ordered
	 */
	protected static final String NORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormID() <em>Norm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormID()
	 * @generated
	 * @ordered
	 */
	protected String normID = NORM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivationCondition() <em>Activation Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCondition()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription activationCondition;

	/**
	 * The cached value of the '{@link #getExpirationCondition() <em>Expiration Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationCondition()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription expirationCondition;

	/**
	 * The cached value of the '{@link #getMaintenanceCondition() <em>Maintenance Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceCondition()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription maintenanceCondition;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription deadline;

	/**
	 * The cached value of the '{@link #getDeontics() <em>Deontics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeontics()
	 * @generated
	 * @ordered
	 */
	protected DeonticStatement deontics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormImpl()
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
		return OMPackage.Literals.NORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNormID()
	{
		return normID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormID(String newNormID)
	{
		String oldNormID = normID;
		normID = newNormID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__NORM_ID, oldNormID, normID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getActivationCondition()
	{
		if (activationCondition != null && activationCondition.eIsProxy())
		{
			InternalEObject oldActivationCondition = (InternalEObject)activationCondition;
			activationCondition = (PartialStateDescription)eResolveProxy(oldActivationCondition);
			if (activationCondition != oldActivationCondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__ACTIVATION_CONDITION, oldActivationCondition, activationCondition));
			}
		}
		return activationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetActivationCondition()
	{
		return activationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationCondition(PartialStateDescription newActivationCondition)
	{
		PartialStateDescription oldActivationCondition = activationCondition;
		activationCondition = newActivationCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__ACTIVATION_CONDITION, oldActivationCondition, activationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getExpirationCondition()
	{
		if (expirationCondition != null && expirationCondition.eIsProxy())
		{
			InternalEObject oldExpirationCondition = (InternalEObject)expirationCondition;
			expirationCondition = (PartialStateDescription)eResolveProxy(oldExpirationCondition);
			if (expirationCondition != oldExpirationCondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__EXPIRATION_CONDITION, oldExpirationCondition, expirationCondition));
			}
		}
		return expirationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetExpirationCondition()
	{
		return expirationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationCondition(PartialStateDescription newExpirationCondition)
	{
		PartialStateDescription oldExpirationCondition = expirationCondition;
		expirationCondition = newExpirationCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__EXPIRATION_CONDITION, oldExpirationCondition, expirationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getMaintenanceCondition()
	{
		if (maintenanceCondition != null && maintenanceCondition.eIsProxy())
		{
			InternalEObject oldMaintenanceCondition = (InternalEObject)maintenanceCondition;
			maintenanceCondition = (PartialStateDescription)eResolveProxy(oldMaintenanceCondition);
			if (maintenanceCondition != oldMaintenanceCondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__MAINTENANCE_CONDITION, oldMaintenanceCondition, maintenanceCondition));
			}
		}
		return maintenanceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetMaintenanceCondition()
	{
		return maintenanceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceCondition(PartialStateDescription newMaintenanceCondition)
	{
		PartialStateDescription oldMaintenanceCondition = maintenanceCondition;
		maintenanceCondition = newMaintenanceCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__MAINTENANCE_CONDITION, oldMaintenanceCondition, maintenanceCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getDeadline()
	{
		if (deadline != null && deadline.eIsProxy())
		{
			InternalEObject oldDeadline = (InternalEObject)deadline;
			deadline = (PartialStateDescription)eResolveProxy(oldDeadline);
			if (deadline != oldDeadline)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NORM__DEADLINE, oldDeadline, deadline));
			}
		}
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetDeadline()
	{
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(PartialStateDescription newDeadline)
	{
		PartialStateDescription oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeonticStatement getDeontics()
	{
		return deontics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeontics(DeonticStatement newDeontics, NotificationChain msgs)
	{
		DeonticStatement oldDeontics = deontics;
		deontics = newDeontics;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.NORM__DEONTICS, oldDeontics, newDeontics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeontics(DeonticStatement newDeontics)
	{
		if (newDeontics != deontics)
		{
			NotificationChain msgs = null;
			if (deontics != null)
				msgs = ((InternalEObject)deontics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.NORM__DEONTICS, null, msgs);
			if (newDeontics != null)
				msgs = ((InternalEObject)newDeontics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.NORM__DEONTICS, null, msgs);
			msgs = basicSetDeontics(newDeontics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NORM__DEONTICS, newDeontics, newDeontics));
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
			case OMPackage.NORM__DEONTICS:
				return basicSetDeontics(null, msgs);
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
			case OMPackage.NORM__NORM_ID:
				return getNormID();
			case OMPackage.NORM__ACTIVATION_CONDITION:
				if (resolve) return getActivationCondition();
				return basicGetActivationCondition();
			case OMPackage.NORM__EXPIRATION_CONDITION:
				if (resolve) return getExpirationCondition();
				return basicGetExpirationCondition();
			case OMPackage.NORM__MAINTENANCE_CONDITION:
				if (resolve) return getMaintenanceCondition();
				return basicGetMaintenanceCondition();
			case OMPackage.NORM__DEADLINE:
				if (resolve) return getDeadline();
				return basicGetDeadline();
			case OMPackage.NORM__DEONTICS:
				return getDeontics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case OMPackage.NORM__NORM_ID:
				setNormID((String)newValue);
				return;
			case OMPackage.NORM__ACTIVATION_CONDITION:
				setActivationCondition((PartialStateDescription)newValue);
				return;
			case OMPackage.NORM__EXPIRATION_CONDITION:
				setExpirationCondition((PartialStateDescription)newValue);
				return;
			case OMPackage.NORM__MAINTENANCE_CONDITION:
				setMaintenanceCondition((PartialStateDescription)newValue);
				return;
			case OMPackage.NORM__DEADLINE:
				setDeadline((PartialStateDescription)newValue);
				return;
			case OMPackage.NORM__DEONTICS:
				setDeontics((DeonticStatement)newValue);
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
			case OMPackage.NORM__NORM_ID:
				setNormID(NORM_ID_EDEFAULT);
				return;
			case OMPackage.NORM__ACTIVATION_CONDITION:
				setActivationCondition((PartialStateDescription)null);
				return;
			case OMPackage.NORM__EXPIRATION_CONDITION:
				setExpirationCondition((PartialStateDescription)null);
				return;
			case OMPackage.NORM__MAINTENANCE_CONDITION:
				setMaintenanceCondition((PartialStateDescription)null);
				return;
			case OMPackage.NORM__DEADLINE:
				setDeadline((PartialStateDescription)null);
				return;
			case OMPackage.NORM__DEONTICS:
				setDeontics((DeonticStatement)null);
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
			case OMPackage.NORM__NORM_ID:
				return NORM_ID_EDEFAULT == null ? normID != null : !NORM_ID_EDEFAULT.equals(normID);
			case OMPackage.NORM__ACTIVATION_CONDITION:
				return activationCondition != null;
			case OMPackage.NORM__EXPIRATION_CONDITION:
				return expirationCondition != null;
			case OMPackage.NORM__MAINTENANCE_CONDITION:
				return maintenanceCondition != null;
			case OMPackage.NORM__DEADLINE:
				return deadline != null;
			case OMPackage.NORM__DEONTICS:
				return deontics != null;
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
		result.append(" (normID: ");
		result.append(normID);
		result.append(')');
		return result.toString();
	}

} //NormImpl
