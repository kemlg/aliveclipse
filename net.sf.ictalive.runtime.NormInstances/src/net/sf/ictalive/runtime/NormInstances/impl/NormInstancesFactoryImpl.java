/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances.impl;

import net.sf.ictalive.runtime.NormInstances.*;

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
public class NormInstancesFactoryImpl extends EFactoryImpl implements NormInstancesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormInstancesFactory init() {
		try {
			NormInstancesFactory theNormInstancesFactory = (NormInstancesFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/RunTime/normInstance"); 
			if (theNormInstancesFactory != null) {
				return theNormInstancesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NormInstancesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstancesFactoryImpl() {
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
			case NormInstancesPackage.NORM_INSTANCE: return createNormInstance();
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE: return createPartialStateDescriptionInstance();
			case NormInstancesPackage.VALUE: return createValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstance createNormInstance() {
		NormInstanceImpl normInstance = new NormInstanceImpl();
		return normInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescriptionInstance createPartialStateDescriptionInstance() {
		PartialStateDescriptionInstanceImpl partialStateDescriptionInstance = new PartialStateDescriptionInstanceImpl();
		return partialStateDescriptionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstancesPackage getNormInstancesPackage() {
		return (NormInstancesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NormInstancesPackage getPackage() {
		return NormInstancesPackage.eINSTANCE;
	}

} //NormInstancesFactoryImpl
