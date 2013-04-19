/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.coordination.tasks.Task;

import net.sf.ictalive.operetta.OM.Objective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.TaskViolation#getUnmetRequirement <em>Unmet Requirement</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.TaskViolation#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getTaskViolation()
 * @model
 * @generated
 */
public interface TaskViolation extends NormAct {
	/**
	 * Returns the value of the '<em><b>Unmet Requirement</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmet Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmet Requirement</em>' reference list.
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getTaskViolation_UnmetRequirement()
	 * @model
	 * @generated
	 */
	EList<Objective> getUnmetRequirement();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getTaskViolation_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.TaskViolation#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskViolation
