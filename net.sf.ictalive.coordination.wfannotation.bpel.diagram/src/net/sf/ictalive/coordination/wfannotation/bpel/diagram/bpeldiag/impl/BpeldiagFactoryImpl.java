/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.impl;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpeldiagFactoryImpl extends EFactoryImpl implements BpeldiagFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpeldiagFactory init() {
		try {
			BpeldiagFactory theBpeldiagFactory = (BpeldiagFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/coordination/wfannotation/bpeldiag"); 
			if (theBpeldiagFactory != null) {
				return theBpeldiagFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpeldiagFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpeldiagFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BpeldiagPackage.PROCESS_CONTAINER: return createProcessContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessContainer createProcessContainer() {
		ProcessContainerImpl processContainer = new ProcessContainerImpl();
		return processContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpeldiagPackage getBpeldiagPackage() {
		return (BpeldiagPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpeldiagPackage getPackage() {
		return BpeldiagPackage.eINSTANCE;
	}

} //BpeldiagFactoryImpl
