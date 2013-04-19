/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.Binding#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Binding#getTransport <em>Transport</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Binding#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Binding#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getBinding_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Binding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.service.syntax.TransportProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' attribute.
	 * @see net.sf.ictalive.service.syntax.TransportProtocol
	 * @see #setTransport(TransportProtocol)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getBinding_Transport()
	 * @model
	 * @generated
	 */
	TransportProtocol getTransport();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Binding#getTransport <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' attribute.
	 * @see net.sf.ictalive.service.syntax.TransportProtocol
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(TransportProtocol value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(InterfaceDescription)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getBinding_Type()
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription#getBinding
	 * @model opposite="binding" required="true"
	 * @generated
	 */
	InterfaceDescription getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Binding#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(InterfaceDescription value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.service.syntax.StyleEncoding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see net.sf.ictalive.service.syntax.StyleEncoding
	 * @see #setStyle(StyleEncoding)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getBinding_Style()
	 * @model
	 * @generated
	 */
	StyleEncoding getStyle();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Binding#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see net.sf.ictalive.service.syntax.StyleEncoding
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleEncoding value);

} // Binding
