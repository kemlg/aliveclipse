/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import net.sf.ictalive.owls.process.SplitJoin;

import org.eclipse.bpel.model.Flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow To Split Join Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getFlowToSplitJoinMapping()
 * @model
 * @generated
 */
public interface FlowToSplitJoinMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Flow)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getFlowToSplitJoinMapping_Source()
	 * @model
	 * @generated
	 */
	Flow getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Flow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.SplitJoin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getFlowToSplitJoinMapping_Target()
	 * @model
	 * @generated
	 */
	EList<SplitJoin> getTarget();

} // FlowToSplitJoinMapping
