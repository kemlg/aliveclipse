/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax;

import net.sf.ictalive.schema.TopLevelComplexType;
import net.sf.ictalive.schema.TopLevelElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.Message#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Message#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Message#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
{
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
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TopLevelComplexType)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getMessage_Type()
	 * @model
	 * @generated
	 */
	TopLevelComplexType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Message#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TopLevelComplexType value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(TopLevelElement)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getMessage_Element()
	 * @model
	 * @generated
	 */
	TopLevelElement getElement();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Message#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(TopLevelElement value);

} // Message
