/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.impl;

import net.sf.ictalive.service.semantics.grounding.*;

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
public class GroundingFactoryImpl extends EFactoryImpl implements GroundingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroundingFactory init() {
		try {
			GroundingFactory theGroundingFactory = (GroundingFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/services/semantics/grounding"); 
			if (theGroundingFactory != null) {
				return theGroundingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroundingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundingFactoryImpl() {
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
			case GroundingPackage.WSDL_GROUNDING: return createWsdlGrounding();
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING: return createWsdlAtomicProcessGrounding();
			case GroundingPackage.WSDL_OPERATION_REF: return createWsdlOperationRef();
			case GroundingPackage.WSDL_MESSAGE_MAP: return createWsdlMessageMap();
			case GroundingPackage.WSDL_INPUT_MESSAGE_MAP: return createWsdlInputMessageMap();
			case GroundingPackage.WSDL_OUTPUT_MESSAGE_MAP: return createWsdlOutputMessageMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlGrounding createWsdlGrounding() {
		WsdlGroundingImpl wsdlGrounding = new WsdlGroundingImpl();
		return wsdlGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlAtomicProcessGrounding createWsdlAtomicProcessGrounding() {
		WsdlAtomicProcessGroundingImpl wsdlAtomicProcessGrounding = new WsdlAtomicProcessGroundingImpl();
		return wsdlAtomicProcessGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOperationRef createWsdlOperationRef() {
		WsdlOperationRefImpl wsdlOperationRef = new WsdlOperationRefImpl();
		return wsdlOperationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlMessageMap createWsdlMessageMap() {
		WsdlMessageMapImpl wsdlMessageMap = new WsdlMessageMapImpl();
		return wsdlMessageMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlInputMessageMap createWsdlInputMessageMap() {
		WsdlInputMessageMapImpl wsdlInputMessageMap = new WsdlInputMessageMapImpl();
		return wsdlInputMessageMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOutputMessageMap createWsdlOutputMessageMap() {
		WsdlOutputMessageMapImpl wsdlOutputMessageMap = new WsdlOutputMessageMapImpl();
		return wsdlOutputMessageMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundingPackage getGroundingPackage() {
		return (GroundingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroundingPackage getPackage() {
		return GroundingPackage.eINSTANCE;
	}

} //GroundingFactoryImpl
