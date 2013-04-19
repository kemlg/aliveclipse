/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.IfThenElse;

import org.eclipse.bpel.model.Else;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else To Else Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getElseToElseMapping()
 * @model
 * @generated
 */
public interface ElseToElseMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Else)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getElseToElseMapping_Source()
	 * @model
	 * @generated
	 */
	Else getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Else value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ControlConstruct)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getElseToElseMapping_Target()
	 * @model
	 * @generated
	 */
	ControlConstruct getTarget();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ControlConstruct value);

} // ElseToElseMapping
