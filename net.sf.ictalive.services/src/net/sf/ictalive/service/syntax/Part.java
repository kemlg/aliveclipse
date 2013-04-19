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
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.Part#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Part#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Part#getXsdType <em>Xsd Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.Part#getXsdElement <em>Xsd Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
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
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getPart_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Part#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getPart_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Part#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Xsd Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Type</em>' reference.
	 * @see #setXsdType(TopLevelComplexType)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getPart_XsdType()
	 * @model
	 * @generated
	 */
	TopLevelComplexType getXsdType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Part#getXsdType <em>Xsd Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Type</em>' reference.
	 * @see #getXsdType()
	 * @generated
	 */
	void setXsdType(TopLevelComplexType value);

	/**
	 * Returns the value of the '<em><b>Xsd Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Element</em>' reference.
	 * @see #setXsdElement(TopLevelElement)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getPart_XsdElement()
	 * @model
	 * @generated
	 */
	TopLevelElement getXsdElement();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.Part#getXsdElement <em>Xsd Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Element</em>' reference.
	 * @see #getXsdElement()
	 * @generated
	 */
	void setXsdElement(TopLevelElement value);

} // Part
