/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import net.sf.ictalive.opera.OM.Role;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.Agent#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.Agent#getActors <em>Actors</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.Agent#getPlayRole <em>Play Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject
{
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
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.Agent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.agents.Actor}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.coordination.agents.Actor#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_Actors()
	 * @see net.sf.ictalive.coordination.agents.Actor#getAgent
	 * @model opposite="agent" required="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Play Role</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play Role</em>' reference list.
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_PlayRole()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getPlayRole();

} // Agent
