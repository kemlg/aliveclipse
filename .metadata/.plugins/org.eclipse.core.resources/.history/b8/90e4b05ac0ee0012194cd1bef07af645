/**
 */
package OM.impl;

import OM.Concept;
import OM.OMPackage;
import OM.Ontology;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.OntologyImpl#getOntologyID <em>Ontology ID</em>}</li>
 *   <li>{@link OM.impl.OntologyImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends MinimalEObjectImpl.Container implements Ontology
{
  /**
   * The default value of the '{@link #getOntologyID() <em>Ontology ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyID()
   * @generated
   * @ordered
   */
  protected static final String ONTOLOGY_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOntologyID() <em>Ontology ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyID()
   * @generated
   * @ordered
   */
  protected String ontologyID = ONTOLOGY_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<Concept> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OntologyImpl()
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
    return OMPackage.Literals.ONTOLOGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOntologyID()
  {
    return ontologyID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOntologyID(String newOntologyID)
  {
    String oldOntologyID = ontologyID;
    ontologyID = newOntologyID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ONTOLOGY__ONTOLOGY_ID, oldOntologyID, ontologyID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Concept> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList.Resolving<Concept>(Concept.class, this, OMPackage.ONTOLOGY__CLASSES);
    }
    return classes;
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
      case OMPackage.ONTOLOGY__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
      case OMPackage.ONTOLOGY__ONTOLOGY_ID:
        return getOntologyID();
      case OMPackage.ONTOLOGY__CLASSES:
        return getClasses();
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
      case OMPackage.ONTOLOGY__ONTOLOGY_ID:
        setOntologyID((String)newValue);
        return;
      case OMPackage.ONTOLOGY__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends Concept>)newValue);
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
      case OMPackage.ONTOLOGY__ONTOLOGY_ID:
        setOntologyID(ONTOLOGY_ID_EDEFAULT);
        return;
      case OMPackage.ONTOLOGY__CLASSES:
        getClasses().clear();
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
      case OMPackage.ONTOLOGY__ONTOLOGY_ID:
        return ONTOLOGY_ID_EDEFAULT == null ? ontologyID != null : !ONTOLOGY_ID_EDEFAULT.equals(ontologyID);
      case OMPackage.ONTOLOGY__CLASSES:
        return classes != null && !classes.isEmpty();
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
    result.append(" (ontologyID: ");
    result.append(ontologyID);
    result.append(')');
    return result.toString();
  }

} //OntologyImpl
