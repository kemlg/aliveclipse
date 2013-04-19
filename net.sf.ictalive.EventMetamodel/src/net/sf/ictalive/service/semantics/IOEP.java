/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOEP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.IOEP#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.IOEP#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.IOEP#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.IOEP#getHasResult <em>Has Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getIOEP()
 * @model abstract="true"
 * @generated
 */
public interface IOEP extends EObject
{
	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' containment reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getIOEP_HasInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceInput> getHasInput();

	/**
	 * Returns the value of the '<em><b>Has Condition</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Condition</em>' containment reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getIOEP_HasCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceCondition> getHasCondition();

	/**
	 * Returns the value of the '<em><b>Has Output</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' containment reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getIOEP_HasOutput()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceOutput> getHasOutput();

	/**
	 * Returns the value of the '<em><b>Has Result</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.semantics.ServiceResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result</em>' containment reference list.
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getIOEP_HasResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceResult> getHasResult();

} // IOEP
