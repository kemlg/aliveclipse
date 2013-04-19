/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Norm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromScene <em>From Scene</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromPlayers <em>From Players</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromResults <em>From Results</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getToScene <em>To Scene</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getToPlayer <em>To Player</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionNorm#getAttachedTo <em>Attached To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm()
 * @model
 * @generated
 */
public interface TransitionNorm extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>From Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Scene</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Scene</em>' reference.
	 * @see #setFromScene(Scene)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_FromScene()
	 * @model required="true"
	 * @generated
	 */
	Scene getFromScene();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromScene <em>From Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Scene</em>' reference.
	 * @see #getFromScene()
	 * @generated
	 */
	void setFromScene(Scene value);

	/**
	 * Returns the value of the '<em><b>From Players</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Players</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_FromPlayers()
	 * @model required="true"
	 * @generated
	 */
	EList<Player> getFromPlayers();

	/**
	 * Returns the value of the '<em><b>From Results</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Landmark}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Results</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_FromResults()
	 * @model required="true"
	 * @generated
	 */
	EList<Landmark> getFromResults();

	/**
	 * Returns the value of the '<em><b>To Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Scene</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Scene</em>' reference.
	 * @see #setToScene(Scene)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_ToScene()
	 * @model required="true"
	 * @generated
	 */
	Scene getToScene();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getToScene <em>To Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Scene</em>' reference.
	 * @see #getToScene()
	 * @generated
	 */
	void setToScene(Scene value);

	/**
	 * Returns the value of the '<em><b>To Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Player</em>' reference.
	 * @see #setToPlayer(Player)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_ToPlayer()
	 * @model required="true"
	 * @generated
	 */
	Player getToPlayer();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getToPlayer <em>To Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Player</em>' reference.
	 * @see #getToPlayer()
	 * @generated
	 */
	void setToPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Attached To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To</em>' reference.
	 * @see #setAttachedTo(Transition)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionNorm_AttachedTo()
	 * @model required="true" transient="true" volatile="true"
	 * @generated
	 */
	Transition getAttachedTo();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getAttachedTo <em>Attached To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached To</em>' reference.
	 * @see #getAttachedTo()
	 * @generated
	 */
	void setAttachedTo(Transition value);

} // TransitionNorm
