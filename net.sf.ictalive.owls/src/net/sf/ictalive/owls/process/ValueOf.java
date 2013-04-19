/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.ValueOf#getTheVar <em>The Var</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.ValueOf#getFromProcess <em>From Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getValueOf()
 * @model
 * @generated
 */
public interface ValueOf extends EObject {
	/**
	 * Returns the value of the '<em><b>The Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Var</em>' reference.
	 * @see #setTheVar(Parameter)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getValueOf_TheVar()
	 * @model required="true"
	 * @generated
	 */
	Parameter getTheVar();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.ValueOf#getTheVar <em>The Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Var</em>' reference.
	 * @see #getTheVar()
	 * @generated
	 */
	void setTheVar(Parameter value);

	/**
	 * Returns the value of the '<em><b>From Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Process</em>' reference.
	 * @see #setFromProcess(Perform)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getValueOf_FromProcess()
	 * @model
	 * @generated
	 */
	Perform getFromProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.ValueOf#getFromProcess <em>From Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Process</em>' reference.
	 * @see #getFromProcess()
	 * @generated
	 */
	void setFromProcess(Perform value);

} // ValueOf
