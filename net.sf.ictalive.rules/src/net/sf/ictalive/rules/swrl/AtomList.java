/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import net.sf.ictalive.rules.ruleml.Body;
import net.sf.ictalive.rules.ruleml.Head;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.AtomList#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getAtomList()
 * @model
 * @generated
 */
public interface AtomList extends Body, Head {
	/**
	 * Returns the value of the '<em><b>Atom</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.rules.swrl.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' containment reference list.
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getAtomList_Atom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atom> getAtom();

} // AtomList
