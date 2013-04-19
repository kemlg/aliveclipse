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
 * A representation of the model object '<em><b>CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.CS#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.CS#getOntology <em>Ontology</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.CS#getTerms <em>Terms</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.CS#getCountsAsRules <em>Counts As Rules</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.CS#getContexts <em>Contexts</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.CS#getActionLibrary <em>Action Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS()
 * @model
 * @generated
 */
public interface CS extends EObject {
	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.PartialStateDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialStateDescription> getFormulas();

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Ontology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS_Ontology()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ontology> getOntology();

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerms();

	/**
	 * Returns the value of the '<em><b>Counts As Rules</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.CountsAs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counts As Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counts As Rules</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS_CountsAsRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CountsAs> getCountsAsRules();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Action Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Library</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Library</em>' containment reference.
	 * @see #setActionLibrary(Actions)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getCS_ActionLibrary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Actions getActionLibrary();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.CS#getActionLibrary <em>Action Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Library</em>' containment reference.
	 * @see #getActionLibrary()
	 * @generated
	 */
	void setActionLibrary(Actions value);

	// @added
	Ontology getDefaultOntology();
	
	// @added
	Concept getConcept(String id);

} // CS
