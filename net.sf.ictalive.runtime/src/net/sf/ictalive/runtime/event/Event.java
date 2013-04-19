/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.event;

import java.util.Date;

import net.sf.ictalive.runtime.fact.Content;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#getLocalKey <em>Local Key</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#getContent <em>Content</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#getPointOfView <em>Point Of View</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Event#isMinimized <em>Minimized</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
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
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_LocalKey()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Key getLocalKey();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Event#getLocalKey <em>Local Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Key</em>' containment reference.
	 * @see #getLocalKey()
	 * @generated
	 */
	void setLocalKey(Key value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.runtime.event.Actor#getEmit <em>Emit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserter</em>' reference.
	 * @see #setAsserter(Actor)
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_Asserter()
	 * @see net.sf.ictalive.runtime.event.Actor#getEmit
	 * @model opposite="emit" required="true"
	 * @generated
	 */
	Actor getAsserter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Event#getAsserter <em>Asserter</em>}' reference.
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
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Event#getContent <em>Content</em>}' containment reference.
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
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_PointOfView()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PointOfView getPointOfView();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Event#getPointOfView <em>Point Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of View</em>' containment reference.
	 * @see #getPointOfView()
	 * @generated
	 */
	void setPointOfView(PointOfView value);

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
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Event#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.event.Cause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provenance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_Provenance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cause> getProvenance();

	/**
	 * Returns the value of the '<em><b>Minimized</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimized</em>' attribute.
	 * @see #setMinimized(boolean)
	 * @see net.sf.ictalive.runtime.event.EventPackage#getEvent_Minimized()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" transient="true"
	 * @generated
	 */
	boolean isMinimized();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Event#isMinimized <em>Minimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimized</em>' attribute.
	 * @see #isMinimized()
	 * @generated
	 */
	void setMinimized(boolean value);

} // Event
