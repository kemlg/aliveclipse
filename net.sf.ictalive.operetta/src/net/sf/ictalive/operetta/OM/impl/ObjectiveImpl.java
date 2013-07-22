/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.SS;

import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.Role;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl#getConceptName <em>Concept Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl#getSubObjectives <em>Sub Objectives</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl#getParentObjective <em>Parent Objective</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl#getUsedByRole <em>Used By Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveImpl extends EObjectImpl implements Objective {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Changed to return the concept name if appropriate
	 */
	public String getName() {
		return getConceptName() != null ? getConceptName().getConcept() : name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Setting the name should match/create a concept in the ontology
	 */
	public void setName(String newName) {
		//if the name contains spaces, replace them with underscores!
		if (newName.contains(" ")) {
			newName = newName.replace(' ', '_');
		}
		String oldName = name;
		name = newName;
		//added a check for eContainer to remove nullpointer problems at initialising (loading) an existing file.
		if (name != oldName && eContainer != null) {
			//match name to existing concepts
			Concept concept;
			CS cs = ((OM)eContainer.eContainer()).getCs();
			if (cs.getConcept(name) != null) {
				concept = cs.getConcept(name);
			} else {
				Ontology ontology = cs.getDefaultOntology();
				concept = OMFactory.eINSTANCE.createConcept();
				concept.setConcept(name);
				ontology.getClasses().add(concept);
			}
			setConceptName(concept);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OBJECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getConceptName() {
		if (conceptName != null && conceptName.eIsProxy()) {
			InternalEObject oldConceptName = (InternalEObject)conceptName;
			conceptName = (Concept)eResolveProxy(oldConceptName);
			if (conceptName != oldConceptName) {
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
	public Concept basicGetConceptName() {
		return conceptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Updated to change the name of the role in accordance with the new set concept name.
	 */
	public void setConceptName(Concept newConceptName) {
		Concept oldConceptName = conceptName;
		conceptName = newConceptName;
		if (name != conceptName.getConcept()) {
			//setting a different concept as name; change the name
			name = conceptName.getConcept();
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OBJECTIVE__CONCEPT_NAME, oldConceptName, conceptName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getStateDescription() {
		if (stateDescription != null && stateDescription.eIsProxy()) {
			InternalEObject oldStateDescription = (InternalEObject)stateDescription;
			stateDescription = (PartialStateDescription)eResolveProxy(oldStateDescription);
			if (stateDescription != oldStateDescription) {
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
	public PartialStateDescription basicGetStateDescription() {
		return stateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDescription(PartialStateDescription newStateDescription) {
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
	public EList<Objective> getSubObjectives() {
		if (subObjectives == null) {
			subObjectives = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.OBJECTIVE__SUB_OBJECTIVES);
		}
		return subObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * implemented the volatile getParentObjective listing. Lists the parent objectives of this objective.
	 */
	public EList<Objective> getParentObjective() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		List<Objective> parents = new ArrayList<Objective>();
		for(Iterator<Objective> iter = ((SS)this.eContainer).getObjectives().iterator(); iter.hasNext();) {
			Objective obj = iter.next();
			if(obj.getSubObjectives().contains(this)) {
				parents.add(obj);
			}
		}
		
		return new EcoreEList.UnmodifiableEList<Objective>(this,
				OMPackage.Literals.OBJECTIVE__PARENT_OBJECTIVE,
				parents.size(), parents.toArray());
		
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * implemented the volatile getUsedByRole listing. Lists the roles that use this objective
	 */
	public EList<Role> getUsedByRole() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		List<Role> roles = new ArrayList<Role>();
		for(Iterator<Role> iter = ((SS)this.eContainer).getRoles().iterator(); iter.hasNext();) {
			Role role = iter.next();
			if (role.getAllObjectives().contains(this)) {
				roles.add(role);
			}
		}

		return new EcoreEList.UnmodifiableEList<Role>(this,
				OMPackage.Literals.OBJECTIVE__USED_BY_ROLE,
				roles.size(), roles.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.OBJECTIVE__NAME:
				return getName();
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
			case OMPackage.OBJECTIVE__NAME:
				setName((String)newValue);
				return;
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
			case OMPackage.OBJECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMPackage.OBJECTIVE__CONCEPT_NAME:
				setConceptName((Concept)null);
				return;
			case OMPackage.OBJECTIVE__STATE_DESCRIPTION:
				setStateDescription((PartialStateDescription)null);
				return;
			case OMPackage.OBJECTIVE__SUB_OBJECTIVES:
				getSubObjectives().clear();
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
			case OMPackage.OBJECTIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
	// @added
	protected EList<Objective> parent = new BasicEList<Objective>(); //cached value to denote the parent(s) of this objective. an empty list indicates that the SS is the parent.

	/**
	 * Add a parent to the list of parents of this objective
	 * Note: using multiple objectives in one OperA model with the exact same name *is bad*!
	 * @throws ObjectiveException 
	 * @added
	 */
	public void addParent(Objective objective) throws ObjectiveException {
		if(objective == this) throw new ObjectiveException();
		if (!parent.contains(objective)) {
			parent.add(objective);
		}
	}
	
	/**
	 * Removes an objective from the parents list.
	 * @added
	 */
	public void removeParent(Objective objective) {
			parent.remove(objective);
	}

	/**
	 * Custom method for returning the parent of the objective
	 * Returns null if the objective is a top-level objective
	 * Returns the parent objective if the objective is a subObjective 
	 * @added
	 */
	public EList<Objective> getParent() {
		return parent;
	}

	// @added
	public EList<Objective> getAllChildren() {
		EList<Objective> result = new BasicEList<Objective>();
		result.add(this);
		for(Iterator<Objective> iter = getSubObjectives().iterator(); iter.hasNext(); ) {
			EList<Objective> childObjectives = ((Objective) iter.next()).getAllChildren();
			result.addAll(childObjectives);
		}
		return result;
	}
	
	// @added
	public class ObjectiveException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = -8826042824609768902L;

		public ObjectiveException() {
			super("Cannot set objective as it's own child!");
		}
	}

} //ObjectiveImpl
