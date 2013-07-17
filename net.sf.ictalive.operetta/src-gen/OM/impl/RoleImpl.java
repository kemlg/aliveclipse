/**
 */
package OM.impl;

import OM.Concept;
import OM.Dependency;
import OM.Norm;
import OM.OMPackage;
import OM.Objective;
import OM.Right;
import OM.Role;
import OM.RoleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link OM.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getConceptName <em>Concept Name</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getNorms <em>Norms</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getDependantOn <em>Dependant On</em>}</li>
 *   <li>{@link OM.impl.RoleImpl#getDependeeIn <em>Dependee In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role
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
  protected RoleImpl()
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
    return OMPackage.Literals.ROLE;
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
    boolean oldNameESet = nameESet;
    nameESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ROLE__NAME, oldName, name, !oldNameESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetName()
  {
    String oldName = name;
    boolean oldNameESet = nameESet;
    name = NAME_EDEFAULT;
    nameESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OMPackage.ROLE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetName()
  {
    return nameESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ROLE__CONCEPT_NAME, oldConceptName, conceptName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objective> getObjectives()
  {
    if (objectives == null)
    {
      objectives = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.ROLE__OBJECTIVES);
    }
    return objectives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Norm> getNorms()
  {
    // TODO: implement this method to return the 'Norms' reference list
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
  public EList<Right> getRights()
  {
    if (rights == null)
    {
      rights = new EObjectContainmentEList.Resolving<Right>(Right.class, this, OMPackage.ROLE__RIGHTS);
    }
    return rights;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType getRoleType()
  {
    return roleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoleType(RoleType newRoleType)
  {
    RoleType oldRoleType = roleType;
    roleType = newRoleType == null ? ROLE_TYPE_EDEFAULT : newRoleType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ROLE__ROLE_TYPE, oldRoleType, roleType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependantOn()
  {
    // TODO: implement this method to return the 'Dependant On' reference list
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
  public EList<Dependency> getDependeeIn()
  {
    // TODO: implement this method to return the 'Dependee In' reference list
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (Name: ");
    if (nameESet) result.append(name); else result.append("<unset>");
    result.append(", RoleType: ");
    result.append(roleType);
    result.append(')');
    return result.toString();
  }

} //RoleImpl
