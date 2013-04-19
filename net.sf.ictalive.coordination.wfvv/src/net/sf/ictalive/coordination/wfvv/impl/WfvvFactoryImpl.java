/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.impl;

import net.sf.ictalive.coordination.wfvv.*;

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
public class WfvvFactoryImpl extends EFactoryImpl implements WfvvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WfvvFactory init() {
		try {
			WfvvFactory theWfvvFactory = (WfvvFactory)EPackage.Registry.INSTANCE.getEFactory("http://net.sf.ictalive.coordination.wfvv"); 
			if (theWfvvFactory != null) {
				return theWfvvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WfvvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfvvFactoryImpl() {
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
			case WfvvPackage.EVENT_MODEL_CONTAINER: return createEventModelContainer();
			case WfvvPackage.EVENT_GROUP: return createEventGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelContainer createEventModelContainer() {
		EventModelContainerImpl eventModelContainer = new EventModelContainerImpl();
		return eventModelContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGroup createEventGroup() {
		EventGroupImpl eventGroup = new EventGroupImpl();
		return eventGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfvvPackage getWfvvPackage() {
		return (WfvvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WfvvPackage getPackage() {
		return WfvvPackage.eINSTANCE;
	}

} //WfvvFactoryImpl
