/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.BuiltInAtom#getBuiltInID <em>Built In ID</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.BuiltInAtom#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getBuiltInAtom()
 * @model
 * @generated
 */
public interface BuiltInAtom extends Atom
{
	/**
	 * Returns the value of the '<em><b>Built In ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In ID</em>' attribute.
	 * @see #setBuiltInID(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getBuiltInAtom_BuiltInID()
	 * @model
	 * @generated
	 */
	String getBuiltInID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.BuiltInAtom#getBuiltInID <em>Built In ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In ID</em>' attribute.
	 * @see #getBuiltInID()
	 * @generated
	 */
	void setBuiltInID(String value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.swrl.DataObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference list.
	 * @see net.sf.ictalive.swrl.SwrlPackage#getBuiltInAtom_Arg()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataObject> getArg();

} // BuiltInAtom
