/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions;

import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.Role;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.Action#getPerformedByRole <em>Performed By Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends net.sf.ictalive.owls.process.Process {
	/**
	 * Returns the value of the '<em><b>Performed By Role</b></em>' reference list.
	 * The list contents are of type {@link OM.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed By Role</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By Role</em>' reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getAction_PerformedByRole()
	 * @model
	 * @generated
	 */
	EList<Role> getPerformedByRole();

} // Action
