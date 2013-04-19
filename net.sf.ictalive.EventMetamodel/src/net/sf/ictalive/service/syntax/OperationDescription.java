/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.OperationDescription#getInput <em>Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.OperationDescription#getFault <em>Fault</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.OperationDescription#getOutput <em>Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.OperationDescription#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getOperationDescription()
 * @model
 * @generated
 */
public interface OperationDescription extends EObject
{
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getOperationDescription_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getInput();

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getOperationDescription_Fault()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getFault();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getOperationDescription_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getOutput();

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
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getOperationDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.OperationDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OperationDescription
