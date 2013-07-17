/**
 */
package OM.impl;

import OM.Atom;
import OM.Concept;
import OM.OMPackage;
import OM.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.AtomImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link OM.impl.AtomImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link OM.impl.AtomImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomImpl extends StateFormulaImpl implements Atom
{
  /**
   * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected static final String PREDICATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected String predicate = PREDICATE_EDEFAULT;

  /**
   * This is true if the Predicate attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean predicateESet;

  /**
   * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcept()
   * @generated
   * @ordered
   */
  protected Concept concept;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Term> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomImpl()
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
    return OMPackage.Literals.ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(String newPredicate)
  {
    String oldPredicate = predicate;
    predicate = newPredicate;
    boolean oldPredicateESet = predicateESet;
    predicateESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ATOM__PREDICATE, oldPredicate, predicate, !oldPredicateESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetPredicate()
  {
    String oldPredicate = predicate;
    boolean oldPredicateESet = predicateESet;
    predicate = PREDICATE_EDEFAULT;
    predicateESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OMPackage.ATOM__PREDICATE, oldPredicate, PREDICATE_EDEFAULT, oldPredicateESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPredicate()
  {
    return predicateESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept getConcept()
  {
    if (concept != null && concept.eIsProxy())
    {
      InternalEObject oldConcept = (InternalEObject)concept;
      concept = (Concept)eResolveProxy(oldConcept);
      if (concept != oldConcept)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.ATOM__CONCEPT, oldConcept, concept));
      }
    }
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept basicGetConcept()
  {
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcept(Concept newConcept)
  {
    Concept oldConcept = concept;
    concept = newConcept;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ATOM__CONCEPT, oldConcept, concept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectResolvingEList<Term>(Term.class, this, OMPackage.ATOM__ARGUMENTS);
    }
    return arguments;
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
      case OMPackage.ATOM__PREDICATE:
        return getPredicate();
      case OMPackage.ATOM__CONCEPT:
        if (resolve) return getConcept();
        return basicGetConcept();
      case OMPackage.ATOM__ARGUMENTS:
        return getArguments();
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
      case OMPackage.ATOM__PREDICATE:
        setPredicate((String)newValue);
        return;
      case OMPackage.ATOM__CONCEPT:
        setConcept((Concept)newValue);
        return;
      case OMPackage.ATOM__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Term>)newValue);
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
      case OMPackage.ATOM__PREDICATE:
        unsetPredicate();
        return;
      case OMPackage.ATOM__CONCEPT:
        setConcept((Concept)null);
        return;
      case OMPackage.ATOM__ARGUMENTS:
        getArguments().clear();
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
      case OMPackage.ATOM__PREDICATE:
        return isSetPredicate();
      case OMPackage.ATOM__CONCEPT:
        return concept != null;
      case OMPackage.ATOM__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
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
    result.append(" (predicate: ");
    if (predicateESet) result.append(predicate); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //AtomImpl
