/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition To Scene Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getTo <em>To</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionToSceneArc()
 * @model
 * @generated
 */
public interface TransitionToSceneArc extends Arc {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Transition)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionToSceneArc_From()
	 * @model keys="transitionID" required="true"
	 * @generated
	 */
	Transition getFrom();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Transition value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Scene)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionToSceneArc_To()
	 * @model keys="sceneID" required="true"
	 * @generated
	 */
	Scene getTo();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Scene value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.operetta.OM.TTSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.operetta.OM.TTSType
	 * @see #setType(TTSType)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransitionToSceneArc_Type()
	 * @model required="true"
	 * @generated
	 */
	TTSType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.operetta.OM.TTSType
	 * @see #getType()
	 * @generated
	 */
	void setType(TTSType value);

} // TransitionToSceneArc
