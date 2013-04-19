/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see OLCLMap.OLCLMapFactory
 * @model kind="package"
 * @generated
 */
public interface OLCLMapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OLCLMap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/integration/OL2CLMap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "map";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OLCLMapPackage eINSTANCE = OLCLMap.impl.OLCLMapPackageImpl.init();

	/**
	 * The meta object id for the '{@link OLCLMap.impl.MapEntryImpl <em>Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.MapEntryImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getMapEntry()
	 * @generated
	 */
	int MAP_ENTRY = 2;

	/**
	 * The number of structural features of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.Objective2ActionImpl <em>Objective2 Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.Objective2ActionImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getObjective2Action()
	 * @generated
	 */
	int OBJECTIVE2_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE2_ACTION__ACTION = MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE2_ACTION__OBJECTIVE = MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Objective2 Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE2_ACTION_FEATURE_COUNT = MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.MappingImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Opera File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OPERA_FILE = 1;

	/**
	 * The feature id for the '<em><b>Action File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ACTION_FILE = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.Landmark2ActionImpl <em>Landmark2 Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.Landmark2ActionImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getLandmark2Action()
	 * @generated
	 */
	int LANDMARK2_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK2_ACTION__ACTION = MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Landmark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK2_ACTION__LANDMARK = MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Landmark2 Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK2_ACTION_FEATURE_COUNT = MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.LandmarkPattern2ActionImpl <em>Landmark Pattern2 Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.LandmarkPattern2ActionImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getLandmarkPattern2Action()
	 * @generated
	 */
	int LANDMARK_PATTERN2_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_PATTERN2_ACTION__ACTION = MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_PATTERN2_ACTION__PATTERN = MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Landmark Pattern2 Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_PATTERN2_ACTION_FEATURE_COUNT = MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.Scene2ActionImpl <em>Scene2 Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.Scene2ActionImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getScene2Action()
	 * @generated
	 */
	int SCENE2_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE2_ACTION__ACTION = MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE2_ACTION__SCENE = MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scene2 Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE2_ACTION_FEATURE_COUNT = MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.IS2ActionImpl <em>IS2 Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.IS2ActionImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getIS2Action()
	 * @generated
	 */
	int IS2_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS2_ACTION__ACTION = MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS2_ACTION__INTERACTION_SCENE = MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS2 Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS2_ACTION_FEATURE_COUNT = MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.Player2ParticipantImpl <em>Player2 Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.Player2ParticipantImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getPlayer2Participant()
	 * @generated
	 */
	int PLAYER2_PARTICIPANT = 7;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER2_PARTICIPANT__PLAYER = MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER2_PARTICIPANT__PARTICIPANT = MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Player2 Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER2_PARTICIPANT_FEATURE_COUNT = MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link OLCLMap.impl.ToActionImpl <em>To Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OLCLMap.impl.ToActionImpl
	 * @see OLCLMap.impl.OLCLMapPackageImpl#getToAction()
	 * @generated
	 */
	int TO_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ACTION__ACTION = 0;

	/**
	 * The number of structural features of the '<em>To Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ACTION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link OLCLMap.Objective2Action <em>Objective2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective2 Action</em>'.
	 * @see OLCLMap.Objective2Action
	 * @generated
	 */
	EClass getObjective2Action();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.Objective2Action#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objective</em>'.
	 * @see OLCLMap.Objective2Action#getObjective()
	 * @see #getObjective2Action()
	 * @generated
	 */
	EReference getObjective2Action_Objective();

	/**
	 * Returns the meta object for class '{@link OLCLMap.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see OLCLMap.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link OLCLMap.Mapping#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see OLCLMap.Mapping#getEntry()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Entry();

	/**
	 * Returns the meta object for the attribute '{@link OLCLMap.Mapping#getOperaFile <em>Opera File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opera File</em>'.
	 * @see OLCLMap.Mapping#getOperaFile()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_OperaFile();

	/**
	 * Returns the meta object for the attribute '{@link OLCLMap.Mapping#getActionFile <em>Action File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action File</em>'.
	 * @see OLCLMap.Mapping#getActionFile()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_ActionFile();

	/**
	 * Returns the meta object for class '{@link OLCLMap.MapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Entry</em>'.
	 * @see OLCLMap.MapEntry
	 * @generated
	 */
	EClass getMapEntry();

	/**
	 * Returns the meta object for class '{@link OLCLMap.Landmark2Action <em>Landmark2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landmark2 Action</em>'.
	 * @see OLCLMap.Landmark2Action
	 * @generated
	 */
	EClass getLandmark2Action();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.Landmark2Action#getLandmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landmark</em>'.
	 * @see OLCLMap.Landmark2Action#getLandmark()
	 * @see #getLandmark2Action()
	 * @generated
	 */
	EReference getLandmark2Action_Landmark();

	/**
	 * Returns the meta object for class '{@link OLCLMap.LandmarkPattern2Action <em>Landmark Pattern2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landmark Pattern2 Action</em>'.
	 * @see OLCLMap.LandmarkPattern2Action
	 * @generated
	 */
	EClass getLandmarkPattern2Action();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.LandmarkPattern2Action#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see OLCLMap.LandmarkPattern2Action#getPattern()
	 * @see #getLandmarkPattern2Action()
	 * @generated
	 */
	EReference getLandmarkPattern2Action_Pattern();

	/**
	 * Returns the meta object for class '{@link OLCLMap.Scene2Action <em>Scene2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene2 Action</em>'.
	 * @see OLCLMap.Scene2Action
	 * @generated
	 */
	EClass getScene2Action();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.Scene2Action#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scene</em>'.
	 * @see OLCLMap.Scene2Action#getScene()
	 * @see #getScene2Action()
	 * @generated
	 */
	EReference getScene2Action_Scene();

	/**
	 * Returns the meta object for class '{@link OLCLMap.IS2Action <em>IS2 Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS2 Action</em>'.
	 * @see OLCLMap.IS2Action
	 * @generated
	 */
	EClass getIS2Action();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.IS2Action#getInteractionScene <em>Interaction Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interaction Scene</em>'.
	 * @see OLCLMap.IS2Action#getInteractionScene()
	 * @see #getIS2Action()
	 * @generated
	 */
	EReference getIS2Action_InteractionScene();

	/**
	 * Returns the meta object for class '{@link OLCLMap.Player2Participant <em>Player2 Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player2 Participant</em>'.
	 * @see OLCLMap.Player2Participant
	 * @generated
	 */
	EClass getPlayer2Participant();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.Player2Participant#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see OLCLMap.Player2Participant#getPlayer()
	 * @see #getPlayer2Participant()
	 * @generated
	 */
	EReference getPlayer2Participant_Player();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.Player2Participant#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant</em>'.
	 * @see OLCLMap.Player2Participant#getParticipant()
	 * @see #getPlayer2Participant()
	 * @generated
	 */
	EReference getPlayer2Participant_Participant();

	/**
	 * Returns the meta object for class '{@link OLCLMap.ToAction <em>To Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Action</em>'.
	 * @see OLCLMap.ToAction
	 * @generated
	 */
	EClass getToAction();

	/**
	 * Returns the meta object for the reference '{@link OLCLMap.ToAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see OLCLMap.ToAction#getAction()
	 * @see #getToAction()
	 * @generated
	 */
	EReference getToAction_Action();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OLCLMapFactory getOLCLMapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link OLCLMap.impl.Objective2ActionImpl <em>Objective2 Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.Objective2ActionImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getObjective2Action()
		 * @generated
		 */
		EClass OBJECTIVE2_ACTION = eINSTANCE.getObjective2Action();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE2_ACTION__OBJECTIVE = eINSTANCE.getObjective2Action_Objective();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.MappingImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ENTRY = eINSTANCE.getMapping_Entry();

		/**
		 * The meta object literal for the '<em><b>Opera File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__OPERA_FILE = eINSTANCE.getMapping_OperaFile();

		/**
		 * The meta object literal for the '<em><b>Action File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__ACTION_FILE = eINSTANCE.getMapping_ActionFile();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.MapEntryImpl <em>Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.MapEntryImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getMapEntry()
		 * @generated
		 */
		EClass MAP_ENTRY = eINSTANCE.getMapEntry();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.Landmark2ActionImpl <em>Landmark2 Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.Landmark2ActionImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getLandmark2Action()
		 * @generated
		 */
		EClass LANDMARK2_ACTION = eINSTANCE.getLandmark2Action();

		/**
		 * The meta object literal for the '<em><b>Landmark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK2_ACTION__LANDMARK = eINSTANCE.getLandmark2Action_Landmark();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.LandmarkPattern2ActionImpl <em>Landmark Pattern2 Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.LandmarkPattern2ActionImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getLandmarkPattern2Action()
		 * @generated
		 */
		EClass LANDMARK_PATTERN2_ACTION = eINSTANCE.getLandmarkPattern2Action();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK_PATTERN2_ACTION__PATTERN = eINSTANCE.getLandmarkPattern2Action_Pattern();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.Scene2ActionImpl <em>Scene2 Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.Scene2ActionImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getScene2Action()
		 * @generated
		 */
		EClass SCENE2_ACTION = eINSTANCE.getScene2Action();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE2_ACTION__SCENE = eINSTANCE.getScene2Action_Scene();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.IS2ActionImpl <em>IS2 Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.IS2ActionImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getIS2Action()
		 * @generated
		 */
		EClass IS2_ACTION = eINSTANCE.getIS2Action();

		/**
		 * The meta object literal for the '<em><b>Interaction Scene</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS2_ACTION__INTERACTION_SCENE = eINSTANCE.getIS2Action_InteractionScene();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.Player2ParticipantImpl <em>Player2 Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.Player2ParticipantImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getPlayer2Participant()
		 * @generated
		 */
		EClass PLAYER2_PARTICIPANT = eINSTANCE.getPlayer2Participant();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER2_PARTICIPANT__PLAYER = eINSTANCE.getPlayer2Participant_Player();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER2_PARTICIPANT__PARTICIPANT = eINSTANCE.getPlayer2Participant_Participant();

		/**
		 * The meta object literal for the '{@link OLCLMap.impl.ToActionImpl <em>To Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OLCLMap.impl.ToActionImpl
		 * @see OLCLMap.impl.OLCLMapPackageImpl#getToAction()
		 * @generated
		 */
		EClass TO_ACTION = eINSTANCE.getToAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_ACTION__ACTION = eINSTANCE.getToAction_Action();

	}

} //OLCLMapPackage
