/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import net.sf.ictalive.operetta.OM.Concept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataValue#getConceptType <em>Concept Type</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataValue#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataValue#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataValue()
 * @model
 * @generated
 */
public interface DataValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Type</em>' reference.
	 * @see #setConceptType(Concept)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataValue_ConceptType()
	 * @model
	 * @generated
	 */
	Concept getConceptType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DataValue#getConceptType <em>Concept Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Type</em>' reference.
	 * @see #getConceptType()
	 * @generated
	 */
	void setConceptType(Concept value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataValue_Literal()
	 * @model
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DataValue#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.rules.swrl.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.rules.swrl.DataType
	 * @see #setType(DataType)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataValue_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DataValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.rules.swrl.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // DataValue
