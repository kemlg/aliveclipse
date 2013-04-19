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
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.IfThenElse#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.IfThenElse#getThen <em>Then</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.IfThenElse#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends ControlConstruct
{
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Condition)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getIfThenElse_IfCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getIfCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.IfThenElse#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(ControlConstruct)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getIfThenElse_Then()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getThen();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.IfThenElse#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(ControlConstruct value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(ControlConstruct)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getIfThenElse_Else()
	 * @model
	 * @generated
	 */
	ControlConstruct getElse();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.IfThenElse#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ControlConstruct value);

} // IfThenElse
