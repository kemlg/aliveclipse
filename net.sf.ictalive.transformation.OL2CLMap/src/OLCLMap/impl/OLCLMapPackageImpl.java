/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.impl;

import OLCLMap.IS2Action;
import OLCLMap.Landmark2Action;
import OLCLMap.LandmarkPattern2Action;
import OLCLMap.MapEntry;
import OLCLMap.Mapping;
import OLCLMap.OLCLMapFactory;
import OLCLMap.OLCLMapPackage;
import OLCLMap.Objective2Action;
import OLCLMap.Player2Participant;
import OLCLMap.Scene2Action;
import OLCLMap.ToAction;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.operetta.OM.OMPackage;

import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OLCLMapPackageImpl extends EPackageImpl implements OLCLMapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objective2ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landmark2ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landmarkPattern2ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scene2ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass is2ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass player2ParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toActionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see OLCLMap.OLCLMapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OLCLMapPackageImpl() {
		super(eNS_URI, OLCLMapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OLCLMapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OLCLMapPackage init() {
		if (isInited) return (OLCLMapPackage)EPackage.Registry.INSTANCE.getEPackage(OLCLMapPackage.eNS_URI);

		// Obtain or create and register package
		OLCLMapPackageImpl theOLCLMapPackage = (OLCLMapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OLCLMapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OLCLMapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOLCLMapPackage.createPackageContents();

		// Initialize created meta-data
		theOLCLMapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOLCLMapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OLCLMapPackage.eNS_URI, theOLCLMapPackage);
		return theOLCLMapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective2Action() {
		return objective2ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective2Action_Objective() {
		return (EReference)objective2ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Entry() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_OperaFile() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_ActionFile() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapEntry() {
		return mapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandmark2Action() {
		return landmark2ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandmark2Action_Landmark() {
		return (EReference)landmark2ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandmarkPattern2Action() {
		return landmarkPattern2ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandmarkPattern2Action_Pattern() {
		return (EReference)landmarkPattern2ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScene2Action() {
		return scene2ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene2Action_Scene() {
		return (EReference)scene2ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIS2Action() {
		return is2ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIS2Action_InteractionScene() {
		return (EReference)is2ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer2Participant() {
		return player2ParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer2Participant_Player() {
		return (EReference)player2ParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer2Participant_Participant() {
		return (EReference)player2ParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToAction() {
		return toActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToAction_Action() {
		return (EReference)toActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OLCLMapFactory getOLCLMapFactory() {
		return (OLCLMapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		objective2ActionEClass = createEClass(OBJECTIVE2_ACTION);
		createEReference(objective2ActionEClass, OBJECTIVE2_ACTION__OBJECTIVE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__ENTRY);
		createEAttribute(mappingEClass, MAPPING__OPERA_FILE);
		createEAttribute(mappingEClass, MAPPING__ACTION_FILE);

		mapEntryEClass = createEClass(MAP_ENTRY);

		landmark2ActionEClass = createEClass(LANDMARK2_ACTION);
		createEReference(landmark2ActionEClass, LANDMARK2_ACTION__LANDMARK);

		landmarkPattern2ActionEClass = createEClass(LANDMARK_PATTERN2_ACTION);
		createEReference(landmarkPattern2ActionEClass, LANDMARK_PATTERN2_ACTION__PATTERN);

		scene2ActionEClass = createEClass(SCENE2_ACTION);
		createEReference(scene2ActionEClass, SCENE2_ACTION__SCENE);

		is2ActionEClass = createEClass(IS2_ACTION);
		createEReference(is2ActionEClass, IS2_ACTION__INTERACTION_SCENE);

		player2ParticipantEClass = createEClass(PLAYER2_PARTICIPANT);
		createEReference(player2ParticipantEClass, PLAYER2_PARTICIPANT__PLAYER);
		createEReference(player2ParticipantEClass, PLAYER2_PARTICIPANT__PARTICIPANT);

		toActionEClass = createEClass(TO_ACTION);
		createEReference(toActionEClass, TO_ACTION__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objective2ActionEClass.getESuperTypes().add(this.getMapEntry());
		objective2ActionEClass.getESuperTypes().add(this.getToAction());
		landmark2ActionEClass.getESuperTypes().add(this.getMapEntry());
		landmark2ActionEClass.getESuperTypes().add(this.getToAction());
		landmarkPattern2ActionEClass.getESuperTypes().add(this.getMapEntry());
		landmarkPattern2ActionEClass.getESuperTypes().add(this.getToAction());
		scene2ActionEClass.getESuperTypes().add(this.getMapEntry());
		scene2ActionEClass.getESuperTypes().add(this.getToAction());
		is2ActionEClass.getESuperTypes().add(this.getMapEntry());
		is2ActionEClass.getESuperTypes().add(this.getToAction());
		player2ParticipantEClass.getESuperTypes().add(this.getMapEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(objective2ActionEClass, Objective2Action.class, "Objective2Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjective2Action_Objective(), theOMPackage.getObjective(), null, "objective", null, 0, 1, Objective2Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Entry(), this.getMapEntry(), null, "entry", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapping_OperaFile(), ecorePackage.getEString(), "operaFile", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapping_ActionFile(), ecorePackage.getEString(), "actionFile", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEntryEClass, MapEntry.class, "MapEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landmark2ActionEClass, Landmark2Action.class, "Landmark2Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandmark2Action_Landmark(), theOMPackage.getLandmark(), null, "landmark", null, 0, 1, Landmark2Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landmarkPattern2ActionEClass, LandmarkPattern2Action.class, "LandmarkPattern2Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandmarkPattern2Action_Pattern(), theOMPackage.getLandmarkPattern(), null, "pattern", null, 0, 1, LandmarkPattern2Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scene2ActionEClass, Scene2Action.class, "Scene2Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScene2Action_Scene(), theOMPackage.getScene(), null, "scene", null, 0, 1, Scene2Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(is2ActionEClass, IS2Action.class, "IS2Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIS2Action_InteractionScene(), theOMPackage.getIS(), null, "interactionScene", null, 0, 1, IS2Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(player2ParticipantEClass, Player2Participant.class, "Player2Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer2Participant_Player(), theOMPackage.getPlayer(), null, "player", null, 0, 1, Player2Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer2Participant_Participant(), theProcessPackage.getParticipant(), null, "participant", null, 0, 1, Player2Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toActionEClass, ToAction.class, "ToAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToAction_Action(), theActionsPackage.getAction(), null, "action", null, 0, 1, ToAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OLCLMapPackageImpl
