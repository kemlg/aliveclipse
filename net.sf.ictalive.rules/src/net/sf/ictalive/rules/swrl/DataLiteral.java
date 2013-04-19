/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataLiteral#getDataValue <em>Data Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataLiteral()
 * @model
 * @generated
 */
public interface DataLiteral extends DObject {
	/**
	 * Returns the value of the '<em><b>Data Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Value</em>' containment reference.
	 * @see #setDataValue(DataValue)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataLiteral_DataValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getDataValue();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DataLiteral#getDataValue <em>Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Value</em>' containment reference.
	 * @see #getDataValue()
	 * @generated
	 */
	void setDataValue(DataValue value);

} // DataLiteral
