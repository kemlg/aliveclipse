/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.Consequent#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getConsequent()
 * @model
 * @generated
 */
public interface Consequent extends EObject
{
	/**
	 * Returns the value of the '<em><b>Atom</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.swrl.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' containment reference list.
	 * @see net.sf.ictalive.swrl.SwrlPackage#getConsequent_Atom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atom> getAtom();

} // Consequent
