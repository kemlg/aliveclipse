/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Event;

import java.util.Date;

import net.sf.ictalive.EventModel.Fact.Content;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getLocalKey <em>Local Key</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getContent <em>Content</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getPointOfView <em>Point Of View</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Event.Event#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
	/**
	 * Returns the value of the '<em><b>Local Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Key</em>' containment reference.
	 * @see #setLocalKey(Key)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_LocalKey()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Key getLocalKey();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getLocalKey <em>Local Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Key</em>' containment reference.
	 * @see #getLocalKey()
	 * @generated
	 */
	void setLocalKey(Key value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.EventModel.Event.Actor#getEmit <em>Emit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserter</em>' reference.
	 * @see #setAsserter(Actor)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_Asserter()
	 * @see net.sf.ictalive.EventModel.Event.Actor#getEmit
	 * @model opposite="emit" required="true"
	 * @generated
	 */
	Actor getAsserter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getAsserter <em>Asserter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Actor value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Content)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Point Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of View</em>' containment reference.
	 * @see #setPointOfView(PointOfView)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_PointOfView()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PointOfView getPointOfView();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getPointOfView <em>Point Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of View</em>' containment reference.
	 * @see #getPointOfView()
	 * @generated
	 */
	void setPointOfView(PointOfView value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.EventModel.Event.EncodingStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see net.sf.ictalive.EventModel.Event.EncodingStyle
	 * @see #setEncoding(EncodingStyle)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_Encoding()
	 * @model
	 * @generated
	 */
	EncodingStyle getEncoding();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see net.sf.ictalive.EventModel.Event.EncodingStyle
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingStyle value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getEvent_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.Event#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // Event
