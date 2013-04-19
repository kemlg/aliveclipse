/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions;

import net.sf.ictalive.owls.process.ProcessPackage;

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
 * @see net.sf.ictalive.coordination.actions.ActionsFactory
 * @model kind="package"
 * @generated
 */
public interface ActionsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/coordinationLevel/actions/0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "actions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsPackage eINSTANCE = net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.ActionImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIBES = ProcessPackage.PROCESS__DESCRIBES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = ProcessPackage.PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VERSION = ProcessPackage.PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ProcessPackage.PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_PARAMETER = ProcessPackage.PROCESS__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_INPUT = ProcessPackage.PROCESS__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_OUTPUT = ProcessPackage.PROCESS__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_LOCAL = ProcessPackage.PROCESS__HAS_LOCAL;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_RESULT = ProcessPackage.PROCESS__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_CLIENT = ProcessPackage.PROCESS__HAS_CLIENT;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_PARTICIPANT = ProcessPackage.PROCESS__HAS_PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PERFORMED_BY = ProcessPackage.PROCESS__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_PRECONDITION = ProcessPackage.PROCESS__HAS_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Performed By Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PERFORMED_BY_ROLE = ProcessPackage.PROCESS__PERFORMED_BY_ROLE;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ProcessPackage.PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.AtomicActionImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getAtomicAction()
	 * @generated
	 */
	int ATOMIC_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__DESCRIBES = ACTION__DESCRIBES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__VERSION = ACTION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_PARAMETER = ACTION__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_INPUT = ACTION__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_OUTPUT = ACTION__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_LOCAL = ACTION__HAS_LOCAL;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_RESULT = ACTION__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_CLIENT = ACTION__HAS_CLIENT;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_PARTICIPANT = ACTION__HAS_PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__PERFORMED_BY = ACTION__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_PRECONDITION = ACTION__HAS_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Performed By Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__PERFORMED_BY_ROLE = ACTION__PERFORMED_BY_ROLE;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__REALIZES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Atomic Action Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl <em>Composite Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.CompositeActionImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getCompositeAction()
	 * @generated
	 */
	int COMPOSITE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__DESCRIBES = ACTION__DESCRIBES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__VERSION = ACTION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_PARAMETER = ACTION__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_INPUT = ACTION__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_OUTPUT = ACTION__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_LOCAL = ACTION__HAS_LOCAL;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_RESULT = ACTION__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_CLIENT = ACTION__HAS_CLIENT;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_PARTICIPANT = ACTION__HAS_PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__PERFORMED_BY = ACTION__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__HAS_PRECONDITION = ACTION__HAS_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Performed By Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__PERFORMED_BY_ROLE = ACTION__PERFORMED_BY_ROLE;

	/**
	 * The feature id for the '<em><b>Collapses To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__COLLAPSES_TO = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__COMPOSED_OF = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__INVOCABLE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Computed Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__COMPUTED_INPUT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computed Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__COMPUTED_OUTPUT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Computed Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__COMPUTED_PRECONDITION = ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Computed Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__COMPUTED_EFFECT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Composite Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl <em>Action Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.ActionResultImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getActionResult()
	 * @generated
	 */
	int ACTION_RESULT = 3;

	/**
	 * The feature id for the '<em><b>In Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__IN_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Has Add Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__HAS_ADD_EFFECT = 1;

	/**
	 * The feature id for the '<em><b>Has Delete Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__HAS_DELETE_EFFECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__ID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Action Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl <em>Atomic Action Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getAtomicActionResult()
	 * @generated
	 */
	int ATOMIC_ACTION_RESULT = 4;

	/**
	 * The feature id for the '<em><b>In Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__IN_CONDITION = ACTION_RESULT__IN_CONDITION;

	/**
	 * The feature id for the '<em><b>Has Add Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__HAS_ADD_EFFECT = ACTION_RESULT__HAS_ADD_EFFECT;

	/**
	 * The feature id for the '<em><b>Has Delete Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__HAS_DELETE_EFFECT = ACTION_RESULT__HAS_DELETE_EFFECT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__ID = ACTION_RESULT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__VERSION = ACTION_RESULT__VERSION;

	/**
	 * The feature id for the '<em><b>Has Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__HAS_DENSITY = ACTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Cost Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION = ACTION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Duration Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION = ACTION_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Quality Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION = ACTION_RESULT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Atomic Action Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_RESULT_FEATURE_COUNT = ACTION_RESULT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.DistributionImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 5;

	/**
	 * The feature id for the '<em><b>Datapoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DATAPOINT = 0;

	/**
	 * The feature id for the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DENSITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl
	 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getActionsCollection()
	 * @generated
	 */
	int ACTIONS_COLLECTION = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION__PARTICIPANTS = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Control Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION__CONTROL_CONSTRUCTS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION__ID = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION__VERSION = 5;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_COLLECTION_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see net.sf.ictalive.coordination.actions.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Action</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicAction
	 * @generated
	 */
	EClass getAtomicAction();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.AtomicAction#getHasAtomicActionResult <em>Has Atomic Action Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Atomic Action Result</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicAction#getHasAtomicActionResult()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EReference getAtomicAction_HasAtomicActionResult();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.CompositeAction <em>Composite Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Action</em>'.
	 * @see net.sf.ictalive.coordination.actions.CompositeAction
	 * @generated
	 */
	EClass getCompositeAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.ActionResult <em>Action Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Result</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionResult
	 * @generated
	 */
	EClass getActionResult();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionResult#getInCondition <em>In Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Condition</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionResult#getInCondition()
	 * @see #getActionResult()
	 * @generated
	 */
	EReference getActionResult_InCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionResult#getHasAddEffect <em>Has Add Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Add Effect</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionResult#getHasAddEffect()
	 * @see #getActionResult()
	 * @generated
	 */
	EReference getActionResult_HasAddEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionResult#getHasDeleteEffect <em>Has Delete Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Delete Effect</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionResult#getHasDeleteEffect()
	 * @see #getActionResult()
	 * @generated
	 */
	EReference getActionResult_HasDeleteEffect();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.ActionResult#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionResult#getId()
	 * @see #getActionResult()
	 * @generated
	 */
	EAttribute getActionResult_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.ActionResult#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionResult#getVersion()
	 * @see #getActionResult()
	 * @generated
	 */
	EAttribute getActionResult_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.AtomicActionResult <em>Atomic Action Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Action Result</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicActionResult
	 * @generated
	 */
	EClass getAtomicActionResult();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDensity <em>Has Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Density</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDensity()
	 * @see #getAtomicActionResult()
	 * @generated
	 */
	EAttribute getAtomicActionResult_HasDensity();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasCostDistribution <em>Has Cost Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Cost Distribution</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicActionResult#getHasCostDistribution()
	 * @see #getAtomicActionResult()
	 * @generated
	 */
	EReference getAtomicActionResult_HasCostDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDurationDistribution <em>Has Duration Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Duration Distribution</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicActionResult#getHasDurationDistribution()
	 * @see #getAtomicActionResult()
	 * @generated
	 */
	EReference getAtomicActionResult_HasDurationDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.AtomicActionResult#getHasQualityDistribution <em>Has Quality Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Quality Distribution</em>'.
	 * @see net.sf.ictalive.coordination.actions.AtomicActionResult#getHasQualityDistribution()
	 * @see #getAtomicActionResult()
	 * @generated
	 */
	EReference getAtomicActionResult_HasQualityDistribution();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see net.sf.ictalive.coordination.actions.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.Distribution#getDatapoint <em>Datapoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datapoint</em>'.
	 * @see net.sf.ictalive.coordination.actions.Distribution#getDatapoint()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Datapoint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.Distribution#getDensity <em>Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Density</em>'.
	 * @see net.sf.ictalive.coordination.actions.Distribution#getDensity()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Density();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.Distribution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.actions.Distribution#getId()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.Distribution#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.actions.Distribution#getVersion()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.actions.ActionsCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection
	 * @generated
	 */
	EClass getActionsCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionsCollection#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection#getActions()
	 * @see #getActionsCollection()
	 * @generated
	 */
	EReference getActionsCollection_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionsCollection#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection#getParticipants()
	 * @see #getActionsCollection()
	 * @generated
	 */
	EReference getActionsCollection_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionsCollection#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection#getParameters()
	 * @see #getActionsCollection()
	 * @generated
	 */
	EReference getActionsCollection_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.actions.ActionsCollection#getControlConstructs <em>Control Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Constructs</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection#getControlConstructs()
	 * @see #getActionsCollection()
	 * @generated
	 */
	EReference getActionsCollection_ControlConstructs();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.ActionsCollection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection#getId()
	 * @see #getActionsCollection()
	 * @generated
	 */
	EAttribute getActionsCollection_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.actions.ActionsCollection#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.actions.ActionsCollection#getVersion()
	 * @see #getActionsCollection()
	 * @generated
	 */
	EAttribute getActionsCollection_Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionsFactory getActionsFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.ActionImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.AtomicActionImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getAtomicAction()
		 * @generated
		 */
		EClass ATOMIC_ACTION = eINSTANCE.getAtomicAction();

		/**
		 * The meta object literal for the '<em><b>Has Atomic Action Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT = eINSTANCE.getAtomicAction_HasAtomicActionResult();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl <em>Composite Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.CompositeActionImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getCompositeAction()
		 * @generated
		 */
		EClass COMPOSITE_ACTION = eINSTANCE.getCompositeAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.ActionResultImpl <em>Action Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.ActionResultImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getActionResult()
		 * @generated
		 */
		EClass ACTION_RESULT = eINSTANCE.getActionResult();

		/**
		 * The meta object literal for the '<em><b>In Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RESULT__IN_CONDITION = eINSTANCE.getActionResult_InCondition();

		/**
		 * The meta object literal for the '<em><b>Has Add Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RESULT__HAS_ADD_EFFECT = eINSTANCE.getActionResult_HasAddEffect();

		/**
		 * The meta object literal for the '<em><b>Has Delete Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RESULT__HAS_DELETE_EFFECT = eINSTANCE.getActionResult_HasDeleteEffect();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_RESULT__ID = eINSTANCE.getActionResult_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_RESULT__VERSION = eINSTANCE.getActionResult_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl <em>Atomic Action Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getAtomicActionResult()
		 * @generated
		 */
		EClass ATOMIC_ACTION_RESULT = eINSTANCE.getAtomicActionResult();

		/**
		 * The meta object literal for the '<em><b>Has Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_ACTION_RESULT__HAS_DENSITY = eINSTANCE.getAtomicActionResult_HasDensity();

		/**
		 * The meta object literal for the '<em><b>Has Cost Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION = eINSTANCE.getAtomicActionResult_HasCostDistribution();

		/**
		 * The meta object literal for the '<em><b>Has Duration Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION = eINSTANCE.getAtomicActionResult_HasDurationDistribution();

		/**
		 * The meta object literal for the '<em><b>Has Quality Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION = eINSTANCE.getAtomicActionResult_HasQualityDistribution();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.DistributionImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Datapoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__DATAPOINT = eINSTANCE.getDistribution_Datapoint();

		/**
		 * The meta object literal for the '<em><b>Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__DENSITY = eINSTANCE.getDistribution_Density();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__ID = eINSTANCE.getDistribution_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__VERSION = eINSTANCE.getDistribution_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsCollectionImpl
		 * @see net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl#getActionsCollection()
		 * @generated
		 */
		EClass ACTIONS_COLLECTION = eINSTANCE.getActionsCollection();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS_COLLECTION__ACTIONS = eINSTANCE.getActionsCollection_Actions();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS_COLLECTION__PARTICIPANTS = eINSTANCE.getActionsCollection_Participants();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS_COLLECTION__PARAMETERS = eINSTANCE.getActionsCollection_Parameters();

		/**
		 * The meta object literal for the '<em><b>Control Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS_COLLECTION__CONTROL_CONSTRUCTS = eINSTANCE.getActionsCollection_ControlConstructs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS_COLLECTION__ID = eINSTANCE.getActionsCollection_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS_COLLECTION__VERSION = eINSTANCE.getActionsCollection_Version();

	}

} //ActionsPackage
