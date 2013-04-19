/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.Perform#getProcess <em>Process</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Perform#getHasDataFrom <em>Has Data From</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Perform#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getPerform()
 * @model
 * @generated
 */
public interface Perform extends ControlConstruct {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(net.sf.ictalive.owls.process.Process)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getPerform_Process()
	 * @model
	 * @generated
	 */
	net.sf.ictalive.owls.process.Process getProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Perform#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(net.sf.ictalive.owls.process.Process value);

	/**
	 * Returns the value of the '<em><b>Has Data From</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Data From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Data From</em>' containment reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getPerform_HasDataFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getHasDataFrom();

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
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getPerform_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Perform#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Perform
