/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.IS#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.IS#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.IS#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getIS()
 * @model
 * @generated
 */
public interface IS extends EObject
{
	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getIS_Scenes()
	 * @model containment="true" keys="sceneID" lower="2"
	 * @generated
	 */
	EList<Scene> getScenes();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getIS_Transitions()
	 * @model containment="true" keys="transitionID" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getIS_Arcs()
	 * @model containment="true" keys="arcID" lower="2"
	 * @generated
	 */
	EList<Arc> getArcs();

} // IS
