/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import net.sf.ictalive.coordination.actions.CompositeAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process To Composite Action Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getProcessToCompositeActionMapping()
 * @model
 * @generated
 */
public interface ProcessToCompositeActionMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.eclipse.bpel.model.Process)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getProcessToCompositeActionMapping_Source()
	 * @model
	 * @generated
	 */
	org.eclipse.bpel.model.Process getSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.eclipse.bpel.model.Process value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CompositeAction)
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#getProcessToCompositeActionMapping_Target()
	 * @model
	 * @generated
	 */
	CompositeAction getTarget();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CompositeAction value);

} // ProcessToCompositeActionMapping
