/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.impl;

import java.util.Collection;

import net.sf.ictalive.opera.OM.Concept;
import net.sf.ictalive.opera.OM.OMPackage;
import net.sf.ictalive.opera.OM.Objective;
import net.sf.ictalive.opera.OM.PartialStateDescription;
import net.sf.ictalive.opera.OM.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ObjectiveImpl#getConceptName <em>Concept Name</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ObjectiveImpl#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ObjectiveImpl#getSubObjectives <em>Sub Objectives</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ObjectiveImpl#getParentObjective <em>Parent Objective</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ObjectiveImpl#getUsedByRole <em>Used By Role</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ObjectiveImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveImpl extends EObjectImpl implements Objective
{
	/**
	 * The cached value of the '{@link #getConceptName() <em>Concept Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptName()
	 * @generated
	 * @ordered
	 */
	protected Concept conceptName;

	/**
	 * The cached value of the '{@link #getStateDescription() <em>State Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDescription()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription stateDescription;

	/**
	 * The cached value of the '{@link #getSubObjectives() <em>Sub Objectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> subObjectives;

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
	protected ObjectiveImpl()
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
		return OMPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getConceptName()
	{
		if (conceptName != null && conceptName.eIsProxy())
		{
			InternalEObject oldConceptName = (InternalEObject)conceptName;
			conceptName = (Concept)eResolveProxy(oldConceptName);
			if (conceptName != oldConceptName)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.OBJECTIVE__CONCEPT_NAME, oldConceptName, conceptName));
			}
		}
		return conceptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetConceptName()
	{
		return conceptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptName(Concept newConceptName)
	{
		Concept oldConceptName = conceptName;
		conceptName = newConceptName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OBJECTIVE__CONCEPT_NAME, oldConceptName, conceptName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getStateDescription()
	{
		if (stateDescription != null && stateDescription.eIsProxy())
		{
			InternalEObject oldStateDescription = (InternalEObject)stateDescription;
			stateDescription = (PartialStateDescription)eResolveProxy(oldStateDescription);
			if (stateDescription != oldStateDescription)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.OBJECTIVE__STATE_DESCRIPTION, oldStateDescription, stateDescription));
			}
		}
		return stateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetStateDescription()
	{
		return stateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDescription(PartialStateDescription newStateDescription)
	{
		PartialStateDescription oldStateDescription = stateDescription;
		stateDescription = newStateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OBJECTIVE__STATE_DESCRIPTION, oldStateDescription, stateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getSubObjectives()
	{
		if (subObjectives == null)
		{
			subObjectives = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.OBJECTIVE__SUB_OBJECTIVES);
		}
		return subObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getParentObjective()
	{
		// TODO: implement this method to return the 'Parent Objective' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getUsedByRole()
	{
		// TODO: implement this method to return the 'Used By Role' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OBJECTIVE__NAME, oldName, name));
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
			case OMPackage.OBJECTIVE__CONCEPT_NAME:
				if (resolve) return getConceptName();
				return basicGetConceptName();
			case OMPackage.OBJECTIVE__STATE_DESCRIPTION:
				if (resolve) return getStateDescription();
				return basicGetStateDescription();
			case OMPackage.OBJECTIVE__SUB_OBJECTIVES:
				return getSubObjectives();
			case OMPackage.OBJECTIVE__PARENT_OBJECTIVE:
				return getParentObjective();
			case OMPackage.OBJECTIVE__USED_BY_ROLE:
				return getUsedByRole();
			case OMPackage.OBJECTIVE__NAME:
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
			case OMPackage.OBJECTIVE__CONCEPT_NAME:
				setConceptName((Concept)newValue);
				return;
			case OMPackage.OBJECTIVE__STATE_DESCRIPTION:
				setStateDescription((PartialStateDescription)newValue);
				return;
			case OMPackage.OBJECTIVE__SUB_OBJECTIVES:
				getSubObjectives().clear();
				getSubObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case OMPackage.OBJECTIVE__NAME:
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
			case OMPackage.OBJECTIVE__CONCEPT_NAME:
				setConceptName((Concept)null);
				return;
			case OMPackage.OBJECTIVE__STATE_DESCRIPTION:
				setStateDescription((PartialStateDescription)null);
				return;
			case OMPackage.OBJECTIVE__SUB_OBJECTIVES:
				getSubObjectives().clear();
				return;
			case OMPackage.OBJECTIVE__NAME:
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
			case OMPackage.OBJECTIVE__CONCEPT_NAME:
				return conceptName != null;
			case OMPackage.OBJECTIVE__STATE_DESCRIPTION:
				return stateDescription != null;
			case OMPackage.OBJECTIVE__SUB_OBJECTIVES:
				return subObjectives != null && !subObjectives.isEmpty();
			case OMPackage.OBJECTIVE__PARENT_OBJECTIVE:
				return !getParentObjective().isEmpty();
			case OMPackage.OBJECTIVE__USED_BY_ROLE:
				return !getUsedByRole().isEmpty();
			case OMPackage.OBJECTIVE__NAME:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectiveImpl
