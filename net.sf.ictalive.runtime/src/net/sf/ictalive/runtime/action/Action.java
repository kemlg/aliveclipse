/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import net.sf.ictalive.runtime.enactment.Enactment;

import net.sf.ictalive.runtime.event.Actor;

import net.sf.ictalive.runtime.fact.Fact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.Action#getByActor <em>By Actor</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.Action#getCause <em>Cause</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.Action#getEnactment <em>Enactment</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.Action#getResult <em>Result</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.Action#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Actor</em>' reference.
	 * @see #setByActor(Actor)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAction_ByActor()
	 * @model required="true"
	 * @generated
	 */
	Actor getByActor();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.Action#getByActor <em>By Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Actor</em>' reference.
	 * @see #getByActor()
	 * @generated
	 */
	void setByActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference.
	 * @see #setCause(Fact)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAction_Cause()
	 * @model
	 * @generated
	 */
	Fact getCause();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.Action#getCause <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(Fact value);

	/**
	 * Returns the value of the '<em><b>Enactment</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.enactment.Enactment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enactment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enactment</em>' reference list.
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAction_Enactment()
	 * @model
	 * @generated
	 */
	EList<Enactment> getEnactment();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.action.Result}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<Result> getResult();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.action.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getAction_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInput();

} // Action
