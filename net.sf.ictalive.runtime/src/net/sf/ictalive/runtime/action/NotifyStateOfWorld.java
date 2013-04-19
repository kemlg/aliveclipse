/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify State Of World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.NotifyStateOfWorld#getStateOfWorld <em>State Of World</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getNotifyStateOfWorld()
 * @model
 * @generated
 */
public interface NotifyStateOfWorld extends AgentAction {
	/**
	 * Returns the value of the '<em><b>State Of World</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.action.StateOfWorld}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Of World</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Of World</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getNotifyStateOfWorld_StateOfWorld()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateOfWorld> getStateOfWorld();

} // NotifyStateOfWorld
