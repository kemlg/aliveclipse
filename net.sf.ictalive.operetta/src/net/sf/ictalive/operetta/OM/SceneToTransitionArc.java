/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene To Transition Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getSceneToTransitionArc()
 * @model
 * @generated
 */
public interface SceneToTransitionArc extends Arc {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Scene)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getSceneToTransitionArc_From()
	 * @model keys="sceneID" required="true"
	 * @generated
	 */
	Scene getFrom();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Scene value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Transition)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getSceneToTransitionArc_To()
	 * @model keys="transitionID" required="true"
	 * @generated
	 */
	Transition getTo();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Transition value);

} // SceneToTransitionArc
