/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Event;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Actor#getUrl <em>Url</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Actor#getEmit <em>Emit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Event.EventPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends net.sf.ictalive.coordination.agents.Actor
{
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getActor_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Actor#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Emit</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.EventModel.Event.Event}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.EventModel.Event.Event#getAsserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emit</em>' reference list.
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getActor_Emit()
	 * @see net.sf.ictalive.EventModel.Event.Event#getAsserter
	 * @model opposite="asserter"
	 * @generated
	 */
	EList<Event> getEmit();

} // Actor
