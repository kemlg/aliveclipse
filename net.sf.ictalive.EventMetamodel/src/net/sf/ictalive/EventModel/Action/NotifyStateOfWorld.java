/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify State Of World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Action.NotifyStateOfWorld#getStateOfWorld <em>State Of World</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getNotifyStateOfWorld()
 * @model
 * @generated
 */
public interface NotifyStateOfWorld extends AgentAction
{
	/**
	 * Returns the value of the '<em><b>State Of World</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Of World</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Of World</em>' containment reference list.
	 * @see net.sf.ictalive.EventModel.Action.ActionPackage#getNotifyStateOfWorld_StateOfWorld()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getStateOfWorld();

} // NotifyStateOfWorld
