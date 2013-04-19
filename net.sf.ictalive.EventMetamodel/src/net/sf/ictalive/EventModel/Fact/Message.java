/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.Message#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
{
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getMessage_Object()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getObject();

} // Message
