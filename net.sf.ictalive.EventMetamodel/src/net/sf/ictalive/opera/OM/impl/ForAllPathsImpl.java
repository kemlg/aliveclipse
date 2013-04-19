/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.impl;

import net.sf.ictalive.opera.OM.ForAllPaths;
import net.sf.ictalive.opera.OM.OMPackage;
import net.sf.ictalive.opera.OM.PathFormula;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For All Paths</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ForAllPathsImpl#getPathFormula <em>Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForAllPathsImpl extends StateFormulaImpl implements ForAllPaths
{
	/**
	 * The cached value of the '{@link #getPathFormula() <em>Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathFormula()
	 * @generated
	 * @ordered
	 */
	protected PathFormula pathFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForAllPathsImpl()
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
		return OMPackage.Literals.FOR_ALL_PATHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula getPathFormula()
	{
		if (pathFormula != null && pathFormula.eIsProxy())
		{
			InternalEObject oldPathFormula = (InternalEObject)pathFormula;
			pathFormula = (PathFormula)eResolveProxy(oldPathFormula);
			if (pathFormula != oldPathFormula)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.FOR_ALL_PATHS__PATH_FORMULA, oldPathFormula, pathFormula));
			}
		}
		return pathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula basicGetPathFormula()
	{
		return pathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathFormula(PathFormula newPathFormula)
	{
		PathFormula oldPathFormula = pathFormula;
		pathFormula = newPathFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.FOR_ALL_PATHS__PATH_FORMULA, oldPathFormula, pathFormula));
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
			case OMPackage.FOR_ALL_PATHS__PATH_FORMULA:
				if (resolve) return getPathFormula();
				return basicGetPathFormula();
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
			case OMPackage.FOR_ALL_PATHS__PATH_FORMULA:
				setPathFormula((PathFormula)newValue);
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
			case OMPackage.FOR_ALL_PATHS__PATH_FORMULA:
				setPathFormula((PathFormula)null);
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
			case OMPackage.FOR_ALL_PATHS__PATH_FORMULA:
				return pathFormula != null;
		}
		return super.eIsSet(featureID);
	}

} //ForAllPathsImpl
