/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Ontology#getOntologyID <em>Ontology ID</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Ontology#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontology ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology ID</em>' attribute.
	 * @see #setOntologyID(String)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getOntology_OntologyID()
	 * @model required="true"
	 * @generated
	 */
	String getOntologyID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Ontology#getOntologyID <em>Ontology ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology ID</em>' attribute.
	 * @see #getOntologyID()
	 * @generated
	 */
	void setOntologyID(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getOntology_Classes()
	 * @model containment="true" keys="concept" required="true"
	 * @generated
	 */
	EList<Concept> getClasses();
	
	// @added
	boolean contains(String string);
	
	// @added
	Concept getConceptByName(String name);

} // Ontology
