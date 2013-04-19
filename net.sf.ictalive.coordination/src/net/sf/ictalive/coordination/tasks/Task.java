/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks;

import net.sf.ictalive.coordination.actions.ActionResult;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.ControlConstruct;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getComponents <em>Components</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getHasPrecondition <em>Has Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getInput <em>Input</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Task#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.ControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ControlConstruct> getComponents();

	/**
	 * Returns the value of the '<em><b>Has Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.expr.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Precondition</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_HasPrecondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getHasPrecondition();

	/**
	 * Returns the value of the '<em><b>Has Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result</em>' reference.
	 * @see #setHasResult(ActionResult)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_HasResult()
	 * @model
	 * @generated
	 */
	ActionResult getHasResult();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Task#getHasResult <em>Has Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Result</em>' reference.
	 * @see #getHasResult()
	 * @generated
	 */
	void setHasResult(ActionResult value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.tasks.InputMessageMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputMessageMap> getInput();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTask_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Task#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // Task
