/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks;

import net.sf.ictalive.owls.process.ControlConstruct;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.TasksCollection#getTasks <em>Tasks</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.TasksCollection#getControlConstructs <em>Control Constructs</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.TasksCollection#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.TasksCollection#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTasksCollection()
 * @model
 * @generated
 */
public interface TasksCollection extends EObject
{
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.tasks.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTasksCollection_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Control Constructs</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.ControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Constructs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Constructs</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTasksCollection_ControlConstructs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlConstruct> getControlConstructs();

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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTasksCollection_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.TasksCollection#getId <em>Id</em>}' attribute.
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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getTasksCollection_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.TasksCollection#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // TasksCollection
