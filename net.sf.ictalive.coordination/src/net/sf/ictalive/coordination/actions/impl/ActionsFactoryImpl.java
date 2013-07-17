/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import net.sf.ictalive.coordination.actions.*;

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
public class ActionsFactoryImpl extends EFactoryImpl implements ActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionsFactory init() {
		try {
			ActionsFactory theActionsFactory = (ActionsFactory)EPackage.Registry.INSTANCE.getEFactory(ActionsPackage.eNS_URI);
			if (theActionsFactory != null) {
				return theActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactoryImpl() {
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
			case ActionsPackage.ATOMIC_ACTION: return createAtomicAction();
			case ActionsPackage.COMPOSITE_ACTION: return createCompositeAction();
			case ActionsPackage.ACTION_RESULT: return createActionResult();
			case ActionsPackage.ATOMIC_ACTION_RESULT: return createAtomicActionResult();
			case ActionsPackage.DISTRIBUTION: return createDistribution();
			case ActionsPackage.ACTIONS_COLLECTION: return createActionsCollection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicAction createAtomicAction() {
		AtomicActionImpl atomicAction = new AtomicActionImpl();
		return atomicAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeAction createCompositeAction() {
		CompositeActionImpl compositeAction = new CompositeActionImpl();
		return compositeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResult createActionResult() {
		ActionResultImpl actionResult = new ActionResultImpl();
		return actionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicActionResult createAtomicActionResult() {
		AtomicActionResultImpl atomicActionResult = new AtomicActionResultImpl();
		return atomicActionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution createDistribution() {
		DistributionImpl distribution = new DistributionImpl();
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsCollection createActionsCollection() {
		ActionsCollectionImpl actionsCollection = new ActionsCollectionImpl();
		return actionsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsPackage getActionsPackage() {
		return (ActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionsPackage getPackage() {
		return ActionsPackage.eINSTANCE;
	}

} //ActionsFactoryImpl
