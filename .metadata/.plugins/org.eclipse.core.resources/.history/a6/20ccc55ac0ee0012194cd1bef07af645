/**
 */
package OM.impl;

import OM.Dependency;
import OM.OMPackage;
import OM.Objective;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.DependencyImpl#getID <em>ID</em>}</li>
 *   <li>{@link OM.impl.DependencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link OM.impl.DependencyImpl#getObjectOfDependency <em>Object Of Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The default value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getObjectOfDependency() <em>Object Of Dependency</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectOfDependency()
   * @generated
   * @ordered
   */
  protected EList<Objective> objectOfDependency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return OMPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getID()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setID(String newID)
  {
    String oldID = id;
    id = newID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.DEPENDENCY__ID, oldID, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    // TODO: implement this method to return the 'Name' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objective> getObjectOfDependency()
  {
    if (objectOfDependency == null)
    {
      objectOfDependency = new EObjectResolvingEList<Objective>(Objective.class, this, OMPackage.DEPENDENCY__OBJECT_OF_DEPENDENCY);
    }
    return objectOfDependency;
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
      case OMPackage.DEPENDENCY__ID:
        return getID();
      case OMPackage.DEPENDENCY__NAME:
        return getName();
      case OMPackage.DEPENDENCY__OBJECT_OF_DEPENDENCY:
        return getObjectOfDependency();
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
      case OMPackage.DEPENDENCY__ID:
        setID((String)newValue);
        return;
      case OMPackage.DEPENDENCY__OBJECT_OF_DEPENDENCY:
        getObjectOfDependency().clear();
        getObjectOfDependency().addAll((Collection<? extends Objective>)newValue);
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
      case OMPackage.DEPENDENCY__ID:
        setID(ID_EDEFAULT);
        return;
      case OMPackage.DEPENDENCY__OBJECT_OF_DEPENDENCY:
        getObjectOfDependency().clear();
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
      case OMPackage.DEPENDENCY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case OMPackage.DEPENDENCY__NAME:
        return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
      case OMPackage.DEPENDENCY__OBJECT_OF_DEPENDENCY:
        return objectOfDependency != null && !objectOfDependency.isEmpty();
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
    result.append(" (ID: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //DependencyImpl
