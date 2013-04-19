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
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.Actor#getAgent <em>Agent</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.Actor#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.Actor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActor()
 * @model abstract="true"
 * @generated
 */
public interface Actor extends EObject
{
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.coordination.agents.Agent#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActor_Agent()
	 * @see net.sf.ictalive.coordination.agents.Agent#getActors
	 * @model opposite="actors" required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.Actor#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference.
	 * @see #setImplementedBy(ActorImpl)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActor_ImplementedBy()
	 * @model
	 * @generated
	 */
	ActorImpl getImplementedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.Actor#getImplementedBy <em>Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented By</em>' reference.
	 * @see #getImplementedBy()
	 * @generated
	 */
	void setImplementedBy(ActorImpl value);

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
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Actor
