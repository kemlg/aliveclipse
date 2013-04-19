/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.Distribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.DistributionImpl#getDatapoint <em>Datapoint</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.DistributionImpl#getDensity <em>Density</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.DistributionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.DistributionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributionImpl extends EObjectImpl implements Distribution
{
	/**
	 * The default value of the '{@link #getDatapoint() <em>Datapoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapoint()
	 * @generated
	 * @ordered
	 */
	protected static final float DATAPOINT_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getDatapoint() <em>Datapoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapoint()
	 * @generated
	 * @ordered
	 */
	protected float datapoint = DATAPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected static final float DENSITY_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected float density = DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionImpl()
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
		return ActionsPackage.Literals.DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDatapoint()
	{
		return datapoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatapoint(float newDatapoint)
	{
		float oldDatapoint = datapoint;
		datapoint = newDatapoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.DISTRIBUTION__DATAPOINT, oldDatapoint, datapoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDensity()
	{
		return density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDensity(float newDensity)
	{
		float oldDensity = density;
		density = newDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.DISTRIBUTION__DENSITY, oldDensity, density));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.DISTRIBUTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion()
	{
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion)
	{
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.DISTRIBUTION__VERSION, oldVersion, version));
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
			case ActionsPackage.DISTRIBUTION__DATAPOINT:
				return new Float(getDatapoint());
			case ActionsPackage.DISTRIBUTION__DENSITY:
				return new Float(getDensity());
			case ActionsPackage.DISTRIBUTION__ID:
				return new Integer(getId());
			case ActionsPackage.DISTRIBUTION__VERSION:
				return new Integer(getVersion());
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
			case ActionsPackage.DISTRIBUTION__DATAPOINT:
				setDatapoint(((Float)newValue).floatValue());
				return;
			case ActionsPackage.DISTRIBUTION__DENSITY:
				setDensity(((Float)newValue).floatValue());
				return;
			case ActionsPackage.DISTRIBUTION__ID:
				setId(((Integer)newValue).intValue());
				return;
			case ActionsPackage.DISTRIBUTION__VERSION:
				setVersion(((Integer)newValue).intValue());
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
			case ActionsPackage.DISTRIBUTION__DATAPOINT:
				setDatapoint(DATAPOINT_EDEFAULT);
				return;
			case ActionsPackage.DISTRIBUTION__DENSITY:
				setDensity(DENSITY_EDEFAULT);
				return;
			case ActionsPackage.DISTRIBUTION__ID:
				setId(ID_EDEFAULT);
				return;
			case ActionsPackage.DISTRIBUTION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ActionsPackage.DISTRIBUTION__DATAPOINT:
				return datapoint != DATAPOINT_EDEFAULT;
			case ActionsPackage.DISTRIBUTION__DENSITY:
				return density != DENSITY_EDEFAULT;
			case ActionsPackage.DISTRIBUTION__ID:
				return id != ID_EDEFAULT;
			case ActionsPackage.DISTRIBUTION__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(" (datapoint: ");
		result.append(datapoint);
		result.append(", density: ");
		result.append(density);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DistributionImpl
