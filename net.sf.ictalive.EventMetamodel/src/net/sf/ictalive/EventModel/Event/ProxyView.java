/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Event;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Event.ProxyView#getTransmitter <em>Transmitter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Event.EventPackage#getProxyView()
 * @model
 * @generated
 */
public interface ProxyView extends PointOfView
{
	/**
	 * Returns the value of the '<em><b>Transmitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmitter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmitter</em>' reference.
	 * @see #setTransmitter(Actor)
	 * @see net.sf.ictalive.EventModel.Event.EventPackage#getProxyView_Transmitter()
	 * @model
	 * @generated
	 */
	Actor getTransmitter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Event.ProxyView#getTransmitter <em>Transmitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmitter</em>' reference.
	 * @see #getTransmitter()
	 * @generated
	 */
	void setTransmitter(Actor value);

} // ProxyView
