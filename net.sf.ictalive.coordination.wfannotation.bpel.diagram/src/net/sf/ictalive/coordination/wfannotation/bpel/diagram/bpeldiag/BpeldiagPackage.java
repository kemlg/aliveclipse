/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.BpeldiagFactory
 * @model kind="package"
 * @generated
 */
public interface BpeldiagPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpeldiag";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/coordination/wfannotation/bpeldiag";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpeldiag";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpeldiagPackage eINSTANCE = net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.BpeldiagPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.ProcessContainerImpl <em>Process Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.ProcessContainerImpl
	 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.BpeldiagPackageImpl#getProcessContainer()
	 * @generated
	 */
	int PROCESS_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__PROCESS = 0;

	/**
	 * The number of structural features of the '<em>Process Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer <em>Process Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Container</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer
	 * @generated
	 */
	EClass getProcessContainer();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.ProcessContainer#getProcess()
	 * @see #getProcessContainer()
	 * @generated
	 */
	EReference getProcessContainer_Process();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpeldiagFactory getBpeldiagFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.ProcessContainerImpl <em>Process Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.ProcessContainerImpl
		 * @see net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl.BpeldiagPackageImpl#getProcessContainer()
		 * @generated
		 */
		EClass PROCESS_CONTAINER = eINSTANCE.getProcessContainer();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_CONTAINER__PROCESS = eINSTANCE.getProcessContainer_Process();

	}

} //BpeldiagPackage
