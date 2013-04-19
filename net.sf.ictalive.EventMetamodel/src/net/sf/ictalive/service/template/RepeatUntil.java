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
 * A representation of the model object '<em><b>Repeat Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.RepeatUntil#getUntilCondition <em>Until Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.RepeatUntil#getUntilProcess <em>Until Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getRepeatUntil()
 * @model
 * @generated
 */
public interface RepeatUntil extends Iterate
{
	/**
	 * Returns the value of the '<em><b>Until Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Condition</em>' reference.
	 * @see #setUntilCondition(Antecedent)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getRepeatUntil_UntilCondition()
	 * @model required="true"
	 * @generated
	 */
	Antecedent getUntilCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.RepeatUntil#getUntilCondition <em>Until Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Condition</em>' reference.
	 * @see #getUntilCondition()
	 * @generated
	 */
	void setUntilCondition(Antecedent value);

	/**
	 * Returns the value of the '<em><b>Until Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Process</em>' reference.
	 * @see #setUntilProcess(ControlConstruct)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getRepeatUntil_UntilProcess()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getUntilProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.RepeatUntil#getUntilProcess <em>Until Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Process</em>' reference.
	 * @see #getUntilProcess()
	 * @generated
	 */
	void setUntilProcess(ControlConstruct value);

} // RepeatUntil
