/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions;

import net.sf.ictalive.owls.process.AtomicProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.AtomicAction#getHasAtomicActionResult <em>Has Atomic Action Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicAction()
 * @model
 * @generated
 */
public interface AtomicAction extends Action, AtomicProcess {
	/**
	 * Returns the value of the '<em><b>Has Atomic Action Result</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.actions.AtomicActionResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atomic Action Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atomic Action Result</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAtomicAction_HasAtomicActionResult()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<AtomicActionResult> getHasAtomicActionResult();

} // AtomicAction
