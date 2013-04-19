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
 * A representation of the model object '<em><b>Different Individuals Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.DifferentIndividualsAtom#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDifferentIndividualsAtom()
 * @model
 * @generated
 */
public interface DifferentIndividualsAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.rules.swrl.IObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDifferentIndividualsAtom_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<IObject> getArgs();

} // DifferentIndividualsAtom
