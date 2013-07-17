/**
 */
package OM.impl;

import OM.Landmark;
import OM.LandmarkPattern;
import OM.OMPackage;
import OM.Player;
import OM.Scene;
import OM.SceneType;

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
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.SceneImpl#getSceneID <em>Scene ID</em>}</li>
 *   <li>{@link OM.impl.SceneImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link OM.impl.SceneImpl#getResults <em>Results</em>}</li>
 *   <li>{@link OM.impl.SceneImpl#getInteractionPattern <em>Interaction Pattern</em>}</li>
 *   <li>{@link OM.impl.SceneImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link OM.impl.SceneImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneImpl extends MinimalEObjectImpl.Container implements Scene
{
  /**
   * The default value of the '{@link #getSceneID() <em>Scene ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSceneID()
   * @generated
   * @ordered
   */
  protected static final String SCENE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSceneID() <em>Scene ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSceneID()
   * @generated
   * @ordered
   */
  protected String sceneID = SCENE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayers()
   * @generated
   * @ordered
   */
  protected EList<Player> players;

  /**
   * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResults()
   * @generated
   * @ordered
   */
  protected EList<Landmark> results;

  /**
   * The cached value of the '{@link #getInteractionPattern() <em>Interaction Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionPattern()
   * @generated
   * @ordered
   */
  protected LandmarkPattern interactionPattern;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final SceneType TYPE_EDEFAULT = SceneType.NORMAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SceneType type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SceneImpl()
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
    return OMPackage.Literals.SCENE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSceneID()
  {
    return sceneID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSceneID(String newSceneID)
  {
    String oldSceneID = sceneID;
    sceneID = newSceneID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.SCENE__SCENE_ID, oldSceneID, sceneID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Player> getPlayers()
  {
    if (players == null)
    {
      players = new EObjectContainmentEList.Resolving<Player>(Player.class, this, OMPackage.SCENE__PLAYERS);
    }
    return players;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Landmark> getResults()
  {
    if (results == null)
    {
      results = new EObjectResolvingEList<Landmark>(Landmark.class, this, OMPackage.SCENE__RESULTS);
    }
    return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LandmarkPattern getInteractionPattern()
  {
    if (interactionPattern != null && interactionPattern.eIsProxy())
    {
      InternalEObject oldInteractionPattern = (InternalEObject)interactionPattern;
      interactionPattern = (LandmarkPattern)eResolveProxy(oldInteractionPattern);
      if (interactionPattern != oldInteractionPattern)
      {
        InternalEObject newInteractionPattern = (InternalEObject)interactionPattern;
        NotificationChain msgs = oldInteractionPattern.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.SCENE__INTERACTION_PATTERN, null, null);
        if (newInteractionPattern.eInternalContainer() == null)
        {
          msgs = newInteractionPattern.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.SCENE__INTERACTION_PATTERN, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.SCENE__INTERACTION_PATTERN, oldInteractionPattern, interactionPattern));
      }
    }
    return interactionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LandmarkPattern basicGetInteractionPattern()
  {
    return interactionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteractionPattern(LandmarkPattern newInteractionPattern, NotificationChain msgs)
  {
    LandmarkPattern oldInteractionPattern = interactionPattern;
    interactionPattern = newInteractionPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.SCENE__INTERACTION_PATTERN, oldInteractionPattern, newInteractionPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionPattern(LandmarkPattern newInteractionPattern)
  {
    if (newInteractionPattern != interactionPattern)
    {
      NotificationChain msgs = null;
      if (interactionPattern != null)
        msgs = ((InternalEObject)interactionPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.SCENE__INTERACTION_PATTERN, null, msgs);
      if (newInteractionPattern != null)
        msgs = ((InternalEObject)newInteractionPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.SCENE__INTERACTION_PATTERN, null, msgs);
      msgs = basicSetInteractionPattern(newInteractionPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.SCENE__INTERACTION_PATTERN, newInteractionPattern, newInteractionPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.SCENE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SceneType newType)
  {
    SceneType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.SCENE__TYPE, oldType, type));
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
      case OMPackage.SCENE__PLAYERS:
        return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
      case OMPackage.SCENE__INTERACTION_PATTERN:
        return basicSetInteractionPattern(null, msgs);
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
      case OMPackage.SCENE__SCENE_ID:
        return getSceneID();
      case OMPackage.SCENE__PLAYERS:
        return getPlayers();
      case OMPackage.SCENE__RESULTS:
        return getResults();
      case OMPackage.SCENE__INTERACTION_PATTERN:
        if (resolve) return getInteractionPattern();
        return basicGetInteractionPattern();
      case OMPackage.SCENE__DESCRIPTION:
        return getDescription();
      case OMPackage.SCENE__TYPE:
        return getType();
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
      case OMPackage.SCENE__SCENE_ID:
        setSceneID((String)newValue);
        return;
      case OMPackage.SCENE__PLAYERS:
        getPlayers().clear();
        getPlayers().addAll((Collection<? extends Player>)newValue);
        return;
      case OMPackage.SCENE__RESULTS:
        getResults().clear();
        getResults().addAll((Collection<? extends Landmark>)newValue);
        return;
      case OMPackage.SCENE__INTERACTION_PATTERN:
        setInteractionPattern((LandmarkPattern)newValue);
        return;
      case OMPackage.SCENE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OMPackage.SCENE__TYPE:
        setType((SceneType)newValue);
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
      case OMPackage.SCENE__SCENE_ID:
        setSceneID(SCENE_ID_EDEFAULT);
        return;
      case OMPackage.SCENE__PLAYERS:
        getPlayers().clear();
        return;
      case OMPackage.SCENE__RESULTS:
        getResults().clear();
        return;
      case OMPackage.SCENE__INTERACTION_PATTERN:
        setInteractionPattern((LandmarkPattern)null);
        return;
      case OMPackage.SCENE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OMPackage.SCENE__TYPE:
        setType(TYPE_EDEFAULT);
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
      case OMPackage.SCENE__SCENE_ID:
        return SCENE_ID_EDEFAULT == null ? sceneID != null : !SCENE_ID_EDEFAULT.equals(sceneID);
      case OMPackage.SCENE__PLAYERS:
        return players != null && !players.isEmpty();
      case OMPackage.SCENE__RESULTS:
        return results != null && !results.isEmpty();
      case OMPackage.SCENE__INTERACTION_PATTERN:
        return interactionPattern != null;
      case OMPackage.SCENE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OMPackage.SCENE__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(" (sceneID: ");
    result.append(sceneID);
    result.append(", description: ");
    result.append(description);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //SceneImpl
