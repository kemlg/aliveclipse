/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mas Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.agents.MasModel#getAgents <em>Agents</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.MasModel#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.agents.MasModel#getDomainOntologyNameSpace <em>Domain Ontology Name Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getMasModel()
 * @model
 * @generated
 */
public interface MasModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.agents.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getMasModel_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

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
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getMasModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.MasModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Ontology Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Ontology Name Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Ontology Name Space</em>' attribute.
	 * @see #setDomainOntologyNameSpace(String)
	 * @see net.sf.ictalive.coordination.agents.AgentsPackage#getMasModel_DomainOntologyNameSpace()
	 * @model required="true"
	 * @generated
	 */
	String getDomainOntologyNameSpace();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.agents.MasModel#getDomainOntologyNameSpace <em>Domain Ontology Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Ontology Name Space</em>' attribute.
	 * @see #getDomainOntologyNameSpace()
	 * @generated
	 */
	void setDomainOntologyNameSpace(String value);

} // MasModel
