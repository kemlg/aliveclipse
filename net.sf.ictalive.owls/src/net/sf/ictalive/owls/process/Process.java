/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.service.ServiceModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasParameter <em>Has Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasLocal <em>Has Local</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasResult <em>Has Result</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasClient <em>Has Client</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasParticipant <em>Has Participant</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Process#getHasPrecondition <em>Has Precondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends ServiceModel {
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
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Parameter</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parameter</em>' reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasParameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getHasParameter();

	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasInput()
	 * @model
	 * @generated
	 */
	EList<Input> getHasInput();

	/**
	 * Returns the value of the '<em><b>Has Output</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasOutput()
	 * @model
	 * @generated
	 */
	EList<Output> getHasOutput();

	/**
	 * Returns the value of the '<em><b>Has Local</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.Local}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Local</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Local</em>' reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasLocal()
	 * @model
	 * @generated
	 */
	EList<Local> getHasLocal();

	/**
	 * Returns the value of the '<em><b>Has Result</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.Result}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result</em>' containment reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<Result> getHasResult();

	/**
	 * Returns the value of the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Client</em>' reference.
	 * @see #setHasClient(Participant)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasClient()
	 * @model
	 * @generated
	 */
	Participant getHasClient();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Process#getHasClient <em>Has Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Client</em>' reference.
	 * @see #getHasClient()
	 * @generated
	 */
	void setHasClient(Participant value);

	/**
	 * Returns the value of the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Participant</em>' reference.
	 * @see #setHasParticipant(Participant)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasParticipant()
	 * @model
	 * @generated
	 */
	Participant getHasParticipant();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Process#getHasParticipant <em>Has Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Participant</em>' reference.
	 * @see #getHasParticipant()
	 * @generated
	 */
	void setHasParticipant(Participant value);

	/**
	 * Returns the value of the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By</em>' reference.
	 * @see #setPerformedBy(Participant)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_PerformedBy()
	 * @model
	 * @generated
	 */
	Participant getPerformedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Process#getPerformedBy <em>Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed By</em>' reference.
	 * @see #getPerformedBy()
	 * @generated
	 */
	void setPerformedBy(Participant value);

	/**
	 * Returns the value of the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Precondition</em>' containment reference.
	 * @see #setHasPrecondition(Condition)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getProcess_HasPrecondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getHasPrecondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Process#getHasPrecondition <em>Has Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Precondition</em>' containment reference.
	 * @see #getHasPrecondition()
	 * @generated
	 */
	void setHasPrecondition(Condition value);

} // Process
