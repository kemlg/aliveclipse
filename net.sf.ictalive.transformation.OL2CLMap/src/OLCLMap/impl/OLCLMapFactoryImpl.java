/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.impl;

import OLCLMap.*;

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
public class OLCLMapFactoryImpl extends EFactoryImpl implements OLCLMapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OLCLMapFactory init() {
		try {
			OLCLMapFactory theOLCLMapFactory = (OLCLMapFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/integration/OL2CLMap"); 
			if (theOLCLMapFactory != null) {
				return theOLCLMapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OLCLMapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OLCLMapFactoryImpl() {
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
			case OLCLMapPackage.OBJECTIVE2_ACTION: return createObjective2Action();
			case OLCLMapPackage.MAPPING: return createMapping();
			case OLCLMapPackage.LANDMARK2_ACTION: return createLandmark2Action();
			case OLCLMapPackage.LANDMARK_PATTERN2_ACTION: return createLandmarkPattern2Action();
			case OLCLMapPackage.SCENE2_ACTION: return createScene2Action();
			case OLCLMapPackage.IS2_ACTION: return createIS2Action();
			case OLCLMapPackage.PLAYER2_PARTICIPANT: return createPlayer2Participant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective2Action createObjective2Action() {
		Objective2ActionImpl objective2Action = new Objective2ActionImpl();
		return objective2Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Landmark2Action createLandmark2Action() {
		Landmark2ActionImpl landmark2Action = new Landmark2ActionImpl();
		return landmark2Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandmarkPattern2Action createLandmarkPattern2Action() {
		LandmarkPattern2ActionImpl landmarkPattern2Action = new LandmarkPattern2ActionImpl();
		return landmarkPattern2Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene2Action createScene2Action() {
		Scene2ActionImpl scene2Action = new Scene2ActionImpl();
		return scene2Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IS2Action createIS2Action() {
		IS2ActionImpl is2Action = new IS2ActionImpl();
		return is2Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player2Participant createPlayer2Participant() {
		Player2ParticipantImpl player2Participant = new Player2ParticipantImpl();
		return player2Participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OLCLMapPackage getOLCLMapPackage() {
		return (OLCLMapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OLCLMapPackage getPackage() {
		return OLCLMapPackage.eINSTANCE;
	}

} //OLCLMapFactoryImpl
