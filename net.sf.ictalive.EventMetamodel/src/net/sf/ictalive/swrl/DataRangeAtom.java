/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Range Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.DataRangeAtom#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.DataRangeAtom#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getDataRangeAtom()
 * @model
 * @generated
 */
public interface DataRangeAtom extends Atom
{
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getDataRangeAtom_Predicate()
	 * @model required="true"
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.DataRangeAtom#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference.
	 * @see #setArg(DataObject)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getDataRangeAtom_Arg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataObject getArg();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.DataRangeAtom#getArg <em>Arg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' containment reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(DataObject value);

} // DataRangeAtom
