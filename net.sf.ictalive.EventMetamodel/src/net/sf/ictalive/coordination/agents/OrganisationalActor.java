/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import net.sf.ictalive.coordination.tasks.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisational Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.OrganisationalActor#getUndertakeTask <em>Undertake Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getOrganisationalActor()
 * @model
 * @generated
 */
public interface OrganisationalActor extends Actor
{
	/**
	 * Returns the value of the '<em><b>Undertake Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undertake Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undertake Task</em>' reference.
	 * @see #setUndertakeTask(Task)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getOrganisationalActor_UndertakeTask()
	 * @model required="true"
	 * @generated
	 */
	Task getUndertakeTask();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.OrganisationalActor#getUndertakeTask <em>Undertake Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undertake Task</em>' reference.
	 * @see #getUndertakeTask()
	 * @generated
	 */
	void setUndertakeTask(Task value);

} // OrganisationalActor
