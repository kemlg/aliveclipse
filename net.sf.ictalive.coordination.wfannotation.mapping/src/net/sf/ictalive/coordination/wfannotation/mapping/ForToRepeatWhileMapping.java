/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import net.sf.ictalive.owls.process.RepeatWhile;

import org.eclipse.bpel.model.ForEach;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For To Repeat While Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getForToRepeatWhileMapping()
 * @model
 * @generated
 */
public interface ForToRepeatWhileMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ForEach)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getForToRepeatWhileMapping_Source()
	 * @model
	 * @generated
	 */
	ForEach getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ForEach value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RepeatWhile)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getForToRepeatWhileMapping_Target()
	 * @model
	 * @generated
	 */
	RepeatWhile getTarget();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RepeatWhile value);

} // ForToRepeatWhileMapping
