/**
 */
package OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.Scene#getSceneID <em>Scene ID</em>}</li>
 *   <li>{@link OM.Scene#getPlayers <em>Players</em>}</li>
 *   <li>{@link OM.Scene#getResults <em>Results</em>}</li>
 *   <li>{@link OM.Scene#getInteractionPattern <em>Interaction Pattern</em>}</li>
 *   <li>{@link OM.Scene#getDescription <em>Description</em>}</li>
 *   <li>{@link OM.Scene#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends EObject
{
  /**
   * Returns the value of the '<em><b>Scene ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scene ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scene ID</em>' attribute.
   * @see #setSceneID(String)
   * @see OM.OMPackage#getScene_SceneID()
   * @model unique="false" id="true" required="true"
   * @generated
   */
  String getSceneID();

  /**
   * Sets the value of the '{@link OM.Scene#getSceneID <em>Scene ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scene ID</em>' attribute.
   * @see #getSceneID()
   * @generated
   */
  void setSceneID(String value);

  /**
   * Returns the value of the '<em><b>Players</b></em>' containment reference list.
   * The list contents are of type {@link OM.Player}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Players</em>' containment reference list.
   * @see OM.OMPackage#getScene_Players()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<Player> getPlayers();

  /**
   * Returns the value of the '<em><b>Results</b></em>' reference list.
   * The list contents are of type {@link OM.Landmark}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' reference list.
   * @see OM.OMPackage#getScene_Results()
   * @model required="true"
   * @generated
   */
  EList<Landmark> getResults();

  /**
   * Returns the value of the '<em><b>Interaction Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Pattern</em>' containment reference.
   * @see #setInteractionPattern(LandmarkPattern)
   * @see OM.OMPackage#getScene_InteractionPattern()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  LandmarkPattern getInteractionPattern();

  /**
   * Sets the value of the '{@link OM.Scene#getInteractionPattern <em>Interaction Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Pattern</em>' containment reference.
   * @see #getInteractionPattern()
   * @generated
   */
  void setInteractionPattern(LandmarkPattern value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see OM.OMPackage#getScene_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link OM.Scene#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link OM.SceneType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see OM.SceneType
   * @see #setType(SceneType)
   * @see OM.OMPackage#getScene_Type()
   * @model unique="false" required="true"
   * @generated
   */
  SceneType getType();

  /**
   * Sets the value of the '{@link OM.Scene#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see OM.SceneType
   * @see #getType()
   * @generated
   */
  void setType(SceneType value);

} // Scene
