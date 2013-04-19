/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment.impl;

import net.sf.ictalive.runtime.enactment.*;

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
public class EnactmentFactoryImpl extends EFactoryImpl implements EnactmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnactmentFactory init() {
		try {
			EnactmentFactory theEnactmentFactory = (EnactmentFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/RunTime/enactment"); 
			if (theEnactmentFactory != null) {
				return theEnactmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnactmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnactmentFactoryImpl() {
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
			case EnactmentPackage.ENACTMENT: return createEnactment();
			case EnactmentPackage.RESOURCE: return createResource();
			case EnactmentPackage.ACTION_ENACTMENT: return createActionEnactment();
			case EnactmentPackage.PLAN_ENACTMENT: return createPlanEnactment();
			case EnactmentPackage.SERVICE_INVOCATION_ENACTMENT: return createServiceInvocationEnactment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment createEnactment() {
		EnactmentImpl enactment = new EnactmentImpl();
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnactment createActionEnactment() {
		ActionEnactmentImpl actionEnactment = new ActionEnactmentImpl();
		return actionEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanEnactment createPlanEnactment() {
		PlanEnactmentImpl planEnactment = new PlanEnactmentImpl();
		return planEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInvocationEnactment createServiceInvocationEnactment() {
		ServiceInvocationEnactmentImpl serviceInvocationEnactment = new ServiceInvocationEnactmentImpl();
		return serviceInvocationEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnactmentPackage getEnactmentPackage() {
		return (EnactmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnactmentPackage getPackage() {
		return EnactmentPackage.eINSTANCE;
	}

} //EnactmentFactoryImpl
