/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.impl;

import net.sf.ictalive.owls.wsdlGrounding.*;

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
public class WsdlGroundingFactoryImpl extends EFactoryImpl implements WsdlGroundingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WsdlGroundingFactory init() {
		try {
			WsdlGroundingFactory theWsdlGroundingFactory = (WsdlGroundingFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/owls/wsdlgrounding"); 
			if (theWsdlGroundingFactory != null) {
				return theWsdlGroundingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WsdlGroundingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlGroundingFactoryImpl() {
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
			case WsdlGroundingPackage.WSDL_GROUNDING: return createWsdlGrounding();
			case WsdlGroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING: return createWsdlAtomicProcessGrounding();
			case WsdlGroundingPackage.WSDL_OPERATION_REF: return createWsdlOperationRef();
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP: return createWsdlMessageMap();
			case WsdlGroundingPackage.WSDL_INPUT_MESSAGE_MAP: return createWsdlInputMessageMap();
			case WsdlGroundingPackage.WSDL_OUTPUT_MESSAGE_MAP: return createWsdlOutputMessageMap();
			case WsdlGroundingPackage.GD: return createGD();
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
	public GD createGD() {
		GDImpl gd = new GDImpl();
		return gd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlGroundingPackage getWsdlGroundingPackage() {
		return (WsdlGroundingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WsdlGroundingPackage getPackage() {
		return WsdlGroundingPackage.eINSTANCE;
	}

} //WsdlGroundingFactoryImpl
