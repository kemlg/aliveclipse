/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.rules.swrl.Atom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.IfThenElse#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.IfThenElse#getThen <em>Then</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.IfThenElse#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.template.TemplatePackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends ControlConstruct {
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' reference.
	 * @see #setIfCondition(Atom)
	 * @see net.sf.ictalive.service.template.TemplatePackage#getIfThenElse_IfCondition()
	 * @model required="true"
	 * @generated
	 */
	Atom getIfCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.IfThenElse#getIfCondition <em>If Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Atom value);

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
	 * @see net.sf.ictalive.service.template.TemplatePackage#getIfThenElse_Then()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getThen();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.IfThenElse#getThen <em>Then</em>}' reference.
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
	 * @see net.sf.ictalive.service.template.TemplatePackage#getIfThenElse_Else()
	 * @model
	 * @generated
	 */
	ControlConstruct getElse();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.template.IfThenElse#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ControlConstruct value);

} // IfThenElse
