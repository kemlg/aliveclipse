/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import net.sf.ictalive.owls.expr.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.RepeatWhile#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.RepeatWhile#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getRepeatWhile()
 * @model
 * @generated
 */
public interface RepeatWhile extends Iterate
{
	/**
	 * Returns the value of the '<em><b>While Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' containment reference.
	 * @see #setWhileCondition(Condition)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getRepeatWhile_WhileCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getWhileCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.RepeatWhile#getWhileCondition <em>While Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' containment reference.
	 * @see #getWhileCondition()
	 * @generated
	 */
	void setWhileCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>While Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Process</em>' reference.
	 * @see #setWhileProcess(ControlConstruct)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getRepeatWhile_WhileProcess()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getWhileProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.RepeatWhile#getWhileProcess <em>While Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Process</em>' reference.
	 * @see #getWhileProcess()
	 * @generated
	 */
	void setWhileProcess(ControlConstruct value);

} // RepeatWhile
