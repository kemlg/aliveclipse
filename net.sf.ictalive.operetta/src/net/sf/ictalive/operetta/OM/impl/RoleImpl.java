/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.operetta.OM.Dependency;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Right;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.RoleType;

// begin @added
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.common.util.BasicEList;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.MarketDependency;
import net.sf.ictalive.operetta.OM.NetworkDependency;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.RoleDeonticStatement;
import net.sf.ictalive.operetta.OM.SS;
// end @added

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getConceptName <em>Concept Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getNorms <em>Norms</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getDependantOn <em>Dependant On</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.RoleImpl#getDependeeIn <em>Dependee In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends EObjectImpl implements Role {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> objectives;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<Right> rights;

	/**
	 * The default value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected static final RoleType ROLE_TYPE_EDEFAULT = RoleType.INTERNAL;

	/**
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleType = ROLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * return the string of the concept if possible.
	 */
	public String getName() {
		return getConceptName() != null ? getConceptName().getConcept() : name;
//		return name;
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
		//Needed to add a check for eContainer being null to remove exceptions at loading a file.
		if (name != oldName && eContainer != null) {
			//match name to existing concepts
			Concept concept;
			CS cs = ((OM)eContainer.eContainer()).getCs();
			if (cs.getConcept(name) != null) {
				concept = cs.getConcept(name);
			} else {
				Ontology defaultOntology = cs.getDefaultOntology();
				concept = OMFactory.eINSTANCE.createConcept();
				concept.setConcept(name);
				defaultOntology.getClasses().add(concept);
			}
			setConceptName(concept);
		}
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ROLE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * updated to unset conceptName as well
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		if (getConceptName().getConcept() == oldName) {
			setConceptName(null);
		}
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMPackage.ROLE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.ROLE__CONCEPT_NAME, oldConceptName, conceptName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ROLE__CONCEPT_NAME, oldConceptName, conceptName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.ROLE__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * implementing the volatile listing of norms applicable to this role.
	 */
	public EList<Norm> getNorms() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		List<Norm> normList = new ArrayList<Norm>();
		for (Iterator<Norm> iter = ((OM)this.eContainer.eContainer()).getNs().getNorms().iterator(); iter.hasNext();) {
			Norm norm = iter.next();
			if (norm.getDeontics() instanceof RoleDeonticStatement) {
				if (((RoleDeonticStatement) norm.getDeontics()).getRole().equals(this)) {
					normList.add(norm);
				}
			}
		}
		
		
		return new EcoreEList.UnmodifiableEList<Norm>(this,
				OMPackage.Literals.ROLE__NORMS,
				normList.size(), normList.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Right> getRights() {
		if (rights == null) {
			rights = new EObjectContainmentEList<Right>(Right.class, this, OMPackage.ROLE__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRoleType() {
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleType(RoleType newRoleType) {
		RoleType oldRoleType = roleType;
		roleType = newRoleType == null ? ROLE_TYPE_EDEFAULT : newRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ROLE__ROLE_TYPE, oldRoleType, roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Implemented list generation
	 */
	public EList<Dependency> getDependantOn() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		List<Dependency> dependants = new ArrayList<Dependency>();
		for(Iterator<Dependency> iter = ((SS)this.eContainer).getDependencies().iterator(); iter.hasNext();){
			Dependency dep = iter.next();
			if (dep instanceof HierarchyDependency) {
				if (((HierarchyDependency) dep).getDependant() == this) {
					dependants.add(dep);
				}
			}
			if (dep instanceof MarketDependency) {
				if (((MarketDependency) dep).getDependant() == this) {
					dependants.add(dep);
				}
			}
			if (dep instanceof NetworkDependency) {
				if (((NetworkDependency) dep).getDependant1().equals(this) || ((NetworkDependency) dep).getDependant2().equals(this)) {
					dependants.add(dep);
				}
			}
			
		}
			
			return  new EcoreEList.UnmodifiableEList<Dependency>(this,
									OMPackage.Literals.ROLE__DEPENDANT_ON,
									dependants.size(), dependants.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * implemented List creation
	 */
	public EList<Dependency> getDependeeIn() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		List<Dependency> dependants = new ArrayList<Dependency>();
		for(Iterator<Dependency> iter = ((SS)this.eContainer).getDependencies().iterator(); iter.hasNext();){
			Dependency dep = iter.next();
			if (dep instanceof HierarchyDependency) {
				if (((HierarchyDependency) dep).getDependee() == this) {
					dependants.add(dep);
				}
			}
			if (dep instanceof MarketDependency) {
				if (((MarketDependency) dep).getDependee() == this) {
					dependants.add(dep);
				}
			}
			if (dep instanceof NetworkDependency) {
				if (((NetworkDependency) dep).getDependant1().equals(this) || ((NetworkDependency) dep).getDependant2().equals(this)) {
					dependants.add(dep);
				}
			}
			
		}
			
			return  new EcoreEList.UnmodifiableEList<Dependency>(this,
									OMPackage.Literals.ROLE__DEPENDANT_ON,
									dependants.size(), dependants.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMPackage.ROLE__RIGHTS:
				return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
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
			case OMPackage.ROLE__NAME:
				return getName();
			case OMPackage.ROLE__CONCEPT_NAME:
				if (resolve) return getConceptName();
				return basicGetConceptName();
			case OMPackage.ROLE__OBJECTIVES:
				return getObjectives();
			case OMPackage.ROLE__NORMS:
				return getNorms();
			case OMPackage.ROLE__RIGHTS:
				return getRights();
			case OMPackage.ROLE__ROLE_TYPE:
				return getRoleType();
			case OMPackage.ROLE__DEPENDANT_ON:
				return getDependantOn();
			case OMPackage.ROLE__DEPENDEE_IN:
				return getDependeeIn();
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
			case OMPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case OMPackage.ROLE__CONCEPT_NAME:
				setConceptName((Concept)newValue);
				return;
			case OMPackage.ROLE__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case OMPackage.ROLE__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends Right>)newValue);
				return;
			case OMPackage.ROLE__ROLE_TYPE:
				setRoleType((RoleType)newValue);
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
			case OMPackage.ROLE__NAME:
				unsetName();
				return;
			case OMPackage.ROLE__CONCEPT_NAME:
				setConceptName((Concept)null);
				return;
			case OMPackage.ROLE__OBJECTIVES:
				getObjectives().clear();
				return;
			case OMPackage.ROLE__RIGHTS:
				getRights().clear();
				return;
			case OMPackage.ROLE__ROLE_TYPE:
				setRoleType(ROLE_TYPE_EDEFAULT);
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
			case OMPackage.ROLE__NAME:
				return isSetName();
			case OMPackage.ROLE__CONCEPT_NAME:
				return conceptName != null;
			case OMPackage.ROLE__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
			case OMPackage.ROLE__NORMS:
				return !getNorms().isEmpty();
			case OMPackage.ROLE__RIGHTS:
				return rights != null && !rights.isEmpty();
			case OMPackage.ROLE__ROLE_TYPE:
				return roleType != ROLE_TYPE_EDEFAULT;
			case OMPackage.ROLE__DEPENDANT_ON:
				return !getDependantOn().isEmpty();
			case OMPackage.ROLE__DEPENDEE_IN:
				return !getDependeeIn().isEmpty();
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
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", RoleType: ");
		result.append(roleType);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Custom function to allow the gathering of all objectives and subObjectives:
	 * @added
	 */
	public EList<Objective> getAllObjectives() {
		EList<Objective> tempResult = getObjectives();
		if (tempResult.size() == 0) return tempResult;
		
		EList<Objective> result = new BasicEList<Objective>();
		 for(Iterator<Objective> iter = tempResult.iterator(); iter.hasNext(); ) {
			 EList<Objective> children = iter.next().getAllChildren();
			 for (Objective obj : children) {
				 if (!result.contains(obj))
					 result.add(obj);
			 } 
		 }
		return result;
	}

} //RoleImpl
