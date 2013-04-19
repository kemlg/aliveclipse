/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks;

import net.sf.ictalive.coordination.actions.Action;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getOwlsProcess <em>Owls Process</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getInput <em>Input</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getActionGrounding()
 * @model
 * @generated
 */
public interface ActionGrounding extends EObject
{
	/**
	 * Returns the value of the '<em><b>Owls Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owls Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owls Process</em>' reference.
	 * @see #setOwlsProcess(Action)
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getActionGrounding_OwlsProcess()
	 * @model required="true"
	 * @generated
	 */
	Action getOwlsProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getOwlsProcess <em>Owls Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owls Process</em>' reference.
	 * @see #getOwlsProcess()
	 * @generated
	 */
	void setOwlsProcess(Action value);

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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getActionGrounding_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputMessageMap> getInput();

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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getActionGrounding_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getId <em>Id</em>}' attribute.
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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#getActionGrounding_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // ActionGrounding
