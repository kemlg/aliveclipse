/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Construct List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.ControlConstructList#getFirst <em>First</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.ControlConstructList#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getControlConstructList()
 * @model
 * @generated
 */
public interface ControlConstructList extends EObject {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(ControlConstruct)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getControlConstructList_First()
	 * @model containment="true"
	 * @generated
	 */
	ControlConstruct getFirst();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.ControlConstructList#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(ControlConstruct value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(ControlConstructList)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getControlConstructList_Rest()
	 * @model containment="true"
	 * @generated
	 */
	ControlConstructList getRest();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.ControlConstructList#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(ControlConstructList value);

} // ControlConstructList
