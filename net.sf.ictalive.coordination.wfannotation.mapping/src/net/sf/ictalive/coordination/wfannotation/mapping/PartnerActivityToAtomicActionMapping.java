/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import net.sf.ictalive.coordination.actions.AtomicAction;

import org.eclipse.bpel.model.PartnerActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner Activity To Atomic Action Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getPartnerActivityToAtomicActionMapping()
 * @model
 * @generated
 */
public interface PartnerActivityToAtomicActionMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PartnerActivity)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getPartnerActivityToAtomicActionMapping_Source()
	 * @model required="true"
	 * @generated
	 */
	PartnerActivity getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PartnerActivity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AtomicAction)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getPartnerActivityToAtomicActionMapping_Target()
	 * @model required="true"
	 * @generated
	 */
	AtomicAction getTarget();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AtomicAction value);

} // PartnerActivityToAtomicActionMapping
