/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

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
 *   <li>{@link net.sf.ictalive.opera.OM.CS#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.CS#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getCS()
 * @model
 * @generated
 */
public interface CS extends EObject
{
	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.PartialStateDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getCS_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialStateDescription> getFormulas();

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' containment reference.
	 * @see #setOntology(Ontology)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getCS_Ontology()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ontology getOntology();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.CS#getOntology <em>Ontology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' containment reference.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(Ontology value);

} // CS
