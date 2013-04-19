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
 * A representation of the model object '<em><b>Antecedent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.Antecedent#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getAntecedent()
 * @model
 * @generated
 */
public interface Antecedent extends EObject
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
	 * @see net.sf.ictalive.swrl.SwrlPackage#getAntecedent_Atom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atom> getAtom();

} // Antecedent
