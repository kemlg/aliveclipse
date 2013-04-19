/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import net.sf.ictalive.owls.process.RepeatWhile;

import org.eclipse.bpel.model.While;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While To Repeat While Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getWhileToRepeatWhileMapping()
 * @model
 * @generated
 */
public interface WhileToRepeatWhileMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(While)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getWhileToRepeatWhileMapping_Source()
	 * @model
	 * @generated
	 */
	While getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(While value);

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
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getWhileToRepeatWhileMapping_Target()
	 * @model
	 * @generated
	 */
	RepeatWhile getTarget();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RepeatWhile value);

} // WhileToRepeatWhileMapping
