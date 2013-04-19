/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.BpeldiagPackage
 * @generated
 */
public interface BpeldiagFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpeldiagFactory eINSTANCE = net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.BpeldiagFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Container</em>'.
	 * @generated
	 */
	ProcessContainer createProcessContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BpeldiagPackage getBpeldiagPackage();

} //BpeldiagFactory
