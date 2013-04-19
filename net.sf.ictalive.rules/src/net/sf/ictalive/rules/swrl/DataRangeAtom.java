/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import net.sf.ictalive.operetta.OM.Concept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Range Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getDataType <em>Data Type</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getOneOf <em>One Of</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getArgument1 <em>Argument1</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataRangeAtom()
 * @model
 * @generated
 */
public interface DataRangeAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Concept)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataRangeAtom_DataType()
	 * @model
	 * @generated
	 */
	Concept getDataType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Concept value);

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.rules.swrl.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' containment reference list.
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataRangeAtom_OneOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataValue> getOneOf();

	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' containment reference.
	 * @see #setArgument1(DObject)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDataRangeAtom_Argument1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DObject getArgument1();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getArgument1 <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' containment reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(DObject value);

} // DataRangeAtom
