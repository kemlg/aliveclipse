/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import java.util.Collection;

import net.sf.ictalive.EventModel.Fact.FactPackage;
import net.sf.ictalive.EventModel.Fact.TaskViolation;

import net.sf.ictalive.opera.OM.Objective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.TaskViolationImpl#getUnmetRequirement <em>Unmet Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskViolationImpl extends NormViolatedImpl implements TaskViolation
{
	/**
	 * The cached value of the '{@link #getUnmetRequirement() <em>Unmet Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmetRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> unmetRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskViolationImpl()
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
		return FactPackage.Literals.TASK_VIOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getUnmetRequirement()
	{
		if (unmetRequirement == null)
		{
			unmetRequirement = new EObjectResolvingEList<Objective>(Objective.class, this, FactPackage.TASK_VIOLATION__UNMET_REQUIREMENT);
		}
		return unmetRequirement;
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
			case FactPackage.TASK_VIOLATION__UNMET_REQUIREMENT:
				return getUnmetRequirement();
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
			case FactPackage.TASK_VIOLATION__UNMET_REQUIREMENT:
				getUnmetRequirement().clear();
				getUnmetRequirement().addAll((Collection<? extends Objective>)newValue);
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
			case FactPackage.TASK_VIOLATION__UNMET_REQUIREMENT:
				getUnmetRequirement().clear();
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
			case FactPackage.TASK_VIOLATION__UNMET_REQUIREMENT:
				return unmetRequirement != null && !unmetRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskViolationImpl
