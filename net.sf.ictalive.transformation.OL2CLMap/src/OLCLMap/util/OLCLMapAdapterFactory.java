/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.util;

import OLCLMap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see OLCLMap.OLCLMapPackage
 * @generated
 */
public class OLCLMapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OLCLMapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OLCLMapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OLCLMapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OLCLMapSwitch<Adapter> modelSwitch =
		new OLCLMapSwitch<Adapter>() {
			@Override
			public Adapter caseObjective2Action(Objective2Action object) {
				return createObjective2ActionAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseMapEntry(MapEntry object) {
				return createMapEntryAdapter();
			}
			@Override
			public Adapter caseLandmark2Action(Landmark2Action object) {
				return createLandmark2ActionAdapter();
			}
			@Override
			public Adapter caseLandmarkPattern2Action(LandmarkPattern2Action object) {
				return createLandmarkPattern2ActionAdapter();
			}
			@Override
			public Adapter caseScene2Action(Scene2Action object) {
				return createScene2ActionAdapter();
			}
			@Override
			public Adapter caseIS2Action(IS2Action object) {
				return createIS2ActionAdapter();
			}
			@Override
			public Adapter casePlayer2Participant(Player2Participant object) {
				return createPlayer2ParticipantAdapter();
			}
			@Override
			public Adapter caseToAction(ToAction object) {
				return createToActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.Objective2Action <em>Objective2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.Objective2Action
	 * @generated
	 */
	public Adapter createObjective2ActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.MapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.MapEntry
	 * @generated
	 */
	public Adapter createMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.Landmark2Action <em>Landmark2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.Landmark2Action
	 * @generated
	 */
	public Adapter createLandmark2ActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.LandmarkPattern2Action <em>Landmark Pattern2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.LandmarkPattern2Action
	 * @generated
	 */
	public Adapter createLandmarkPattern2ActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.Scene2Action <em>Scene2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.Scene2Action
	 * @generated
	 */
	public Adapter createScene2ActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.IS2Action <em>IS2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.IS2Action
	 * @generated
	 */
	public Adapter createIS2ActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.Player2Participant <em>Player2 Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.Player2Participant
	 * @generated
	 */
	public Adapter createPlayer2ParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OLCLMap.ToAction <em>To Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OLCLMap.ToAction
	 * @generated
	 */
	public Adapter createToActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OLCLMapAdapterFactory
