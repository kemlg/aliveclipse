/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.operetta.OM.Role;

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
 *   <li>{@link net.sf.ictalive.coordination.agents.Agent#getHasRole <em>Has Role</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.Agent#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.Agent#getAsFolderLocation <em>As Folder Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_Name()
	 * @model default=""
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
	 * Returns the value of the '<em><b>Has Role</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Role</em>' reference list.
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_HasRole()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getHasRole();

	/**
	 * Returns the value of the '<em><b>Has Action</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.actions.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Action</em>' reference list.
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_HasAction()
	 * @model
	 * @generated
	 */
	EList<Action> getHasAction();

	/**
	 * Returns the value of the '<em><b>As Folder Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Folder Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Folder Location</em>' attribute.
	 * @see #setAsFolderLocation(String)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getAgent_AsFolderLocation()
	 * @model
	 * @generated
	 */
	String getAsFolderLocation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.Agent#getAsFolderLocation <em>As Folder Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Folder Location</em>' attribute.
	 * @see #getAsFolderLocation()
	 * @generated
	 */
	void setAsFolderLocation(String value);

} // Agent
