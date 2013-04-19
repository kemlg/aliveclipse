/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.swrl.Antecedent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.RepeatWhile#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.RepeatWhile#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getRepeatWhile()
 * @model
 * @generated
 */
public interface RepeatWhile extends Iterate
{
	/**
	 * Returns the value of the '<em><b>While Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' reference.
	 * @see #setWhileCondition(Antecedent)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getRepeatWhile_WhileCondition()
	 * @model required="true"
	 * @generated
	 */
	Antecedent getWhileCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.RepeatWhile#getWhileCondition <em>While Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' reference.
	 * @see #getWhileCondition()
	 * @generated
	 */
	void setWhileCondition(Antecedent value);

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
	 * @see net.sf.ictalive.service.template.TemplatePackage#getRepeatWhile_WhileProcess()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getWhileProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.RepeatWhile#getWhileProcess <em>While Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Process</em>' reference.
	 * @see #getWhileProcess()
	 * @generated
	 */
	void setWhileProcess(ControlConstruct value);

} // RepeatWhile
