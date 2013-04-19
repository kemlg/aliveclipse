/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

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
 *   <li>{@link net.sf.ictalive.opera.OM.Scene#getSceneID <em>Scene ID</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Scene#getPlayers <em>Players</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Scene#getResults <em>Results</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Scene#getInteractionPattern <em>Interaction Pattern</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Scene#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Scene#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getScene()
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
	 * @see net.sf.ictalive.opera.OM.OMPackage#getScene_SceneID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSceneID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Scene#getSceneID <em>Scene ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene ID</em>' attribute.
	 * @see #getSceneID()
	 * @generated
	 */
	void setSceneID(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getScene_Players()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Landmark}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getScene_Results()
	 * @model required="true"
	 * @generated
	 */
	EList<Landmark> getResults();

	/**
	 * Returns the value of the '<em><b>Interaction Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.LandmarkPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Pattern</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getScene_InteractionPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LandmarkPattern> getInteractionPattern();

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
	 * @see net.sf.ictalive.opera.OM.OMPackage#getScene_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Scene#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.opera.OM.SceneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.opera.OM.SceneType
	 * @see #setType(SceneType)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getScene_Type()
	 * @model required="true"
	 * @generated
	 */
	SceneType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Scene#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.opera.OM.SceneType
	 * @see #getType()
	 * @generated
	 */
	void setType(SceneType value);

} // Scene
