/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import org.eclipse.bpel.model.RepeatUntil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Until To Repeat Until Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getRepeatUntilToRepeatUntilMapping()
 * @model
 * @generated
 */
public interface RepeatUntilToRepeatUntilMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(RepeatUntil)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getRepeatUntilToRepeatUntilMapping_Source()
	 * @model
	 * @generated
	 */
	RepeatUntil getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RepeatUntil value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(net.sf.ictalive.owls.process.RepeatUntil)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getRepeatUntilToRepeatUntilMapping_Target()
	 * @model
	 * @generated
	 */
	net.sf.ictalive.owls.process.RepeatUntil getTarget();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(net.sf.ictalive.owls.process.RepeatUntil value);

} // RepeatUntilToRepeatUntilMapping
