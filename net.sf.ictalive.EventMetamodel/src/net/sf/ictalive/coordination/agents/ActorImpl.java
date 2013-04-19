/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.ActorImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.ActorImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActorImpl()
 * @model
 * @generated
 */
public interface ActorImpl extends EObject
{
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActorImpl_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.ActorImpl#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.coordination.agents.AgentPlatform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see net.sf.ictalive.coordination.agents.AgentPlatform
	 * @see #setPlatform(AgentPlatform)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActorImpl_Platform()
	 * @model
	 * @generated
	 */
	AgentPlatform getPlatform();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.ActorImpl#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see net.sf.ictalive.coordination.agents.AgentPlatform
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(AgentPlatform value);

} // ActorImpl
