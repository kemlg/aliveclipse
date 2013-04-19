/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.BpeldiagPackage#getProcessContainer()
 * @model
 * @generated
 */
public interface ProcessContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(org.eclipse.bpel.model.Process)
	 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.BpeldiagPackage#getProcessContainer_Process()
	 * @model
	 * @generated
	 */
	org.eclipse.bpel.model.Process getProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.eclipse.bpel.model.Process value);

} // ProcessContainer
