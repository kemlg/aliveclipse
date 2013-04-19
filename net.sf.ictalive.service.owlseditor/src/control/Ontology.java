/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Ontology#getOntologyURI <em>Ontology URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getOntology()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Ontology extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology URI</em>' attribute.
	 * @see #setOntologyURI(String)
	 * @see control.ControlPackage#getOntology_OntologyURI()
	 * @model
	 * @generated
	 */
	String getOntologyURI();

	/**
	 * Sets the value of the '{@link control.Ontology#getOntologyURI <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology URI</em>' attribute.
	 * @see #getOntologyURI()
	 * @generated
	 */
	void setOntologyURI(String value);

} // Ontology
