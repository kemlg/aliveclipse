/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Plan#getForTask <em>For Task</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Plan#getHasAtomicProcessGroundingList <em>Has Atomic Process Grounding List</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Plan#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.Plan#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getPlan()
 * @model
 * @generated
 */
public interface Plan extends EObject
{
	/**
	 * Returns the value of the '<em><b>For Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Task</em>' reference.
	 * @see #setForTask(Task)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getPlan_ForTask()
	 * @model required="true"
	 * @generated
	 */
	Task getForTask();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Plan#getForTask <em>For Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Task</em>' reference.
	 * @see #getForTask()
	 * @generated
	 */
	void setForTask(Task value);

	/**
	 * Returns the value of the '<em><b>Has Atomic Process Grounding List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atomic Process Grounding List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atomic Process Grounding List</em>' containment reference.
	 * @see #setHasAtomicProcessGroundingList(ActionGroundingList)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getPlan_HasAtomicProcessGroundingList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActionGroundingList getHasAtomicProcessGroundingList();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Plan#getHasAtomicProcessGroundingList <em>Has Atomic Process Grounding List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Atomic Process Grounding List</em>' containment reference.
	 * @see #getHasAtomicProcessGroundingList()
	 * @generated
	 */
	void setHasAtomicProcessGroundingList(ActionGroundingList value);

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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getPlan_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Plan#getId <em>Id</em>}' attribute.
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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getPlan_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.Plan#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // Plan
