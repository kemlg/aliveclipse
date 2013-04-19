/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltInAtom <em>Built In Atom</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getArgs <em>Args</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltIn <em>Built In</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getBuiltInAtom()
 * @model
 * @generated
 */
public interface BuiltInAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Built In</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.rules.swrl.DefaultBuiltIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In</em>' attribute.
	 * @see net.sf.ictalive.rules.swrl.DefaultBuiltIn
	 * @see #setBuiltIn(DefaultBuiltIn)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getBuiltInAtom_BuiltIn()
	 * @model required="true"
	 * @generated
	 */
	DefaultBuiltIn getBuiltIn();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltIn <em>Built In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In</em>' attribute.
	 * @see net.sf.ictalive.rules.swrl.DefaultBuiltIn
	 * @see #getBuiltIn()
	 * @generated
	 */
	void setBuiltIn(DefaultBuiltIn value);

	/**
	 * Returns the value of the '<em><b>Built In Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In Atom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Atom</em>' containment reference.
	 * @see #setBuiltInAtom(BuiltInAtom)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getBuiltInAtom_BuiltInAtom()
	 * @model containment="true"
	 * @generated
	 */
	BuiltInAtom getBuiltInAtom();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltInAtom <em>Built In Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Atom</em>' containment reference.
	 * @see #getBuiltInAtom()
	 * @generated
	 */
	void setBuiltInAtom(BuiltInAtom value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.rules.swrl.DObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference list.
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getBuiltInAtom_Args()
	 * @model
	 * @generated
	 */
	EList<DObject> getArgs();

} // BuiltInAtom
