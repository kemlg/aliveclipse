/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

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
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/coordination/wfannotation/mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingContainerImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getMappingContainer()
	 * @generated
	 */
	int MAPPING_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.Mapping <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.Mapping
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.PartnerActivityToAtomicActionMappingImpl <em>Partner Activity To Atomic Action Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.PartnerActivityToAtomicActionMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getPartnerActivityToAtomicActionMapping()
	 * @generated
	 */
	int PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partner Activity To Atomic Action Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ProcessToCompositeActionMappingImpl <em>Process To Composite Action Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ProcessToCompositeActionMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getProcessToCompositeActionMapping()
	 * @generated
	 */
	int PROCESS_TO_COMPOSITE_ACTION_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_COMPOSITE_ACTION_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_COMPOSITE_ACTION_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process To Composite Action Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_COMPOSITE_ACTION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.SequenceToSequenceMappingImpl <em>Sequence To Sequence Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.SequenceToSequenceMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getSequenceToSequenceMapping()
	 * @generated
	 */
	int SEQUENCE_TO_SEQUENCE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TO_SEQUENCE_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TO_SEQUENCE_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence To Sequence Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TO_SEQUENCE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.IfToIfThenElseMappingImpl <em>If To If Then Else Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.IfToIfThenElseMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getIfToIfThenElseMapping()
	 * @generated
	 */
	int IF_TO_IF_THEN_ELSE_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TO_IF_THEN_ELSE_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TO_IF_THEN_ELSE_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If To If Then Else Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_TO_IF_THEN_ELSE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.WhileToRepeatWhileMappingImpl <em>While To Repeat While Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.WhileToRepeatWhileMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getWhileToRepeatWhileMapping()
	 * @generated
	 */
	int WHILE_TO_REPEAT_WHILE_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_TO_REPEAT_WHILE_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_TO_REPEAT_WHILE_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While To Repeat While Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_TO_REPEAT_WHILE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.RepeatUntilToRepeatUntilMappingImpl <em>Repeat Until To Repeat Until Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.RepeatUntilToRepeatUntilMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getRepeatUntilToRepeatUntilMapping()
	 * @generated
	 */
	int REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Until To Repeat Until Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.FlowToSplitJoinMappingImpl <em>Flow To Split Join Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.FlowToSplitJoinMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getFlowToSplitJoinMapping()
	 * @generated
	 */
	int FLOW_TO_SPLIT_JOIN_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TO_SPLIT_JOIN_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TO_SPLIT_JOIN_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow To Split Join Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TO_SPLIT_JOIN_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ForToRepeatWhileMappingImpl <em>For To Repeat While Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ForToRepeatWhileMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getForToRepeatWhileMapping()
	 * @generated
	 */
	int FOR_TO_REPEAT_WHILE_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_TO_REPEAT_WHILE_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_TO_REPEAT_WHILE_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For To Repeat While Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_TO_REPEAT_WHILE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ScopeToCompositeActionMappingImpl <em>Scope To Composite Action Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ScopeToCompositeActionMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getScopeToCompositeActionMapping()
	 * @generated
	 */
	int SCOPE_TO_COMPOSITE_ACTION_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_TO_COMPOSITE_ACTION_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_TO_COMPOSITE_ACTION_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scope To Composite Action Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_TO_COMPOSITE_ACTION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseIfToIfThenElseMappingImpl <em>Else If To If Then Else Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseIfToIfThenElseMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getElseIfToIfThenElseMapping()
	 * @generated
	 */
	int ELSE_IF_TO_IF_THEN_ELSE_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_TO_IF_THEN_ELSE_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_TO_IF_THEN_ELSE_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Else If To If Then Else Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_TO_IF_THEN_ELSE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseToElseMappingImpl <em>Else To Else Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseToElseMappingImpl
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getElseToElseMapping()
	 * @generated
	 */
	int ELSE_TO_ELSE_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_TO_ELSE_MAPPING__SOURCE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_TO_ELSE_MAPPING__TARGET = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Else To Else Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_TO_ELSE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer
	 * @generated
	 */
	EClass getMappingContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer#getMappings()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_Mappings();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping <em>Partner Activity To Atomic Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Activity To Atomic Action Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping
	 * @generated
	 */
	EClass getPartnerActivityToAtomicActionMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getSource()
	 * @see #getPartnerActivityToAtomicActionMapping()
	 * @generated
	 */
	EReference getPartnerActivityToAtomicActionMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping#getTarget()
	 * @see #getPartnerActivityToAtomicActionMapping()
	 * @generated
	 */
	EReference getPartnerActivityToAtomicActionMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping <em>Process To Composite Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process To Composite Action Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping
	 * @generated
	 */
	EClass getProcessToCompositeActionMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getSource()
	 * @see #getProcessToCompositeActionMapping()
	 * @generated
	 */
	EReference getProcessToCompositeActionMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping#getTarget()
	 * @see #getProcessToCompositeActionMapping()
	 * @generated
	 */
	EReference getProcessToCompositeActionMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping <em>Sequence To Sequence Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence To Sequence Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping
	 * @generated
	 */
	EClass getSequenceToSequenceMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping#getSource()
	 * @see #getSequenceToSequenceMapping()
	 * @generated
	 */
	EReference getSequenceToSequenceMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping#getTarget()
	 * @see #getSequenceToSequenceMapping()
	 * @generated
	 */
	EReference getSequenceToSequenceMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping <em>If To If Then Else Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If To If Then Else Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping
	 * @generated
	 */
	EClass getIfToIfThenElseMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping#getSource()
	 * @see #getIfToIfThenElseMapping()
	 * @generated
	 */
	EReference getIfToIfThenElseMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping#getTarget()
	 * @see #getIfToIfThenElseMapping()
	 * @generated
	 */
	EReference getIfToIfThenElseMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping <em>While To Repeat While Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While To Repeat While Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping
	 * @generated
	 */
	EClass getWhileToRepeatWhileMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getSource()
	 * @see #getWhileToRepeatWhileMapping()
	 * @generated
	 */
	EReference getWhileToRepeatWhileMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping#getTarget()
	 * @see #getWhileToRepeatWhileMapping()
	 * @generated
	 */
	EReference getWhileToRepeatWhileMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping <em>Repeat Until To Repeat Until Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until To Repeat Until Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping
	 * @generated
	 */
	EClass getRepeatUntilToRepeatUntilMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getSource()
	 * @see #getRepeatUntilToRepeatUntilMapping()
	 * @generated
	 */
	EReference getRepeatUntilToRepeatUntilMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping#getTarget()
	 * @see #getRepeatUntilToRepeatUntilMapping()
	 * @generated
	 */
	EReference getRepeatUntilToRepeatUntilMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping <em>Flow To Split Join Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow To Split Join Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping
	 * @generated
	 */
	EClass getFlowToSplitJoinMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getSource()
	 * @see #getFlowToSplitJoinMapping()
	 * @generated
	 */
	EReference getFlowToSplitJoinMapping_Source();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping#getTarget()
	 * @see #getFlowToSplitJoinMapping()
	 * @generated
	 */
	EReference getFlowToSplitJoinMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping <em>For To Repeat While Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For To Repeat While Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping
	 * @generated
	 */
	EClass getForToRepeatWhileMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getSource()
	 * @see #getForToRepeatWhileMapping()
	 * @generated
	 */
	EReference getForToRepeatWhileMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping#getTarget()
	 * @see #getForToRepeatWhileMapping()
	 * @generated
	 */
	EReference getForToRepeatWhileMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping <em>Scope To Composite Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope To Composite Action Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping
	 * @generated
	 */
	EClass getScopeToCompositeActionMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping#getSource()
	 * @see #getScopeToCompositeActionMapping()
	 * @generated
	 */
	EReference getScopeToCompositeActionMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping#getTarget()
	 * @see #getScopeToCompositeActionMapping()
	 * @generated
	 */
	EReference getScopeToCompositeActionMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping <em>Else If To If Then Else Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If To If Then Else Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping
	 * @generated
	 */
	EClass getElseIfToIfThenElseMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping#getSource()
	 * @see #getElseIfToIfThenElseMapping()
	 * @generated
	 */
	EReference getElseIfToIfThenElseMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping#getTarget()
	 * @see #getElseIfToIfThenElseMapping()
	 * @generated
	 */
	EReference getElseIfToIfThenElseMapping_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping <em>Else To Else Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else To Else Mapping</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping
	 * @generated
	 */
	EClass getElseToElseMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getSource()
	 * @see #getElseToElseMapping()
	 * @generated
	 */
	EReference getElseToElseMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping#getTarget()
	 * @see #getElseToElseMapping()
	 * @generated
	 */
	EReference getElseToElseMapping_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingContainerImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getMappingContainer()
		 * @generated
		 */
		EClass MAPPING_CONTAINER = eINSTANCE.getMappingContainer();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__MAPPINGS = eINSTANCE.getMappingContainer_Mappings();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.Mapping <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.Mapping
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.PartnerActivityToAtomicActionMappingImpl <em>Partner Activity To Atomic Action Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.PartnerActivityToAtomicActionMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getPartnerActivityToAtomicActionMapping()
		 * @generated
		 */
		EClass PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING = eINSTANCE.getPartnerActivityToAtomicActionMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING__SOURCE = eINSTANCE.getPartnerActivityToAtomicActionMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING__TARGET = eINSTANCE.getPartnerActivityToAtomicActionMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ProcessToCompositeActionMappingImpl <em>Process To Composite Action Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ProcessToCompositeActionMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getProcessToCompositeActionMapping()
		 * @generated
		 */
		EClass PROCESS_TO_COMPOSITE_ACTION_MAPPING = eINSTANCE.getProcessToCompositeActionMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TO_COMPOSITE_ACTION_MAPPING__SOURCE = eINSTANCE.getProcessToCompositeActionMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TO_COMPOSITE_ACTION_MAPPING__TARGET = eINSTANCE.getProcessToCompositeActionMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.SequenceToSequenceMappingImpl <em>Sequence To Sequence Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.SequenceToSequenceMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getSequenceToSequenceMapping()
		 * @generated
		 */
		EClass SEQUENCE_TO_SEQUENCE_MAPPING = eINSTANCE.getSequenceToSequenceMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TO_SEQUENCE_MAPPING__SOURCE = eINSTANCE.getSequenceToSequenceMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TO_SEQUENCE_MAPPING__TARGET = eINSTANCE.getSequenceToSequenceMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.IfToIfThenElseMappingImpl <em>If To If Then Else Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.IfToIfThenElseMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getIfToIfThenElseMapping()
		 * @generated
		 */
		EClass IF_TO_IF_THEN_ELSE_MAPPING = eINSTANCE.getIfToIfThenElseMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_TO_IF_THEN_ELSE_MAPPING__SOURCE = eINSTANCE.getIfToIfThenElseMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_TO_IF_THEN_ELSE_MAPPING__TARGET = eINSTANCE.getIfToIfThenElseMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.WhileToRepeatWhileMappingImpl <em>While To Repeat While Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.WhileToRepeatWhileMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getWhileToRepeatWhileMapping()
		 * @generated
		 */
		EClass WHILE_TO_REPEAT_WHILE_MAPPING = eINSTANCE.getWhileToRepeatWhileMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_TO_REPEAT_WHILE_MAPPING__SOURCE = eINSTANCE.getWhileToRepeatWhileMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_TO_REPEAT_WHILE_MAPPING__TARGET = eINSTANCE.getWhileToRepeatWhileMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.RepeatUntilToRepeatUntilMappingImpl <em>Repeat Until To Repeat Until Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.RepeatUntilToRepeatUntilMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getRepeatUntilToRepeatUntilMapping()
		 * @generated
		 */
		EClass REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING = eINSTANCE.getRepeatUntilToRepeatUntilMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING__SOURCE = eINSTANCE.getRepeatUntilToRepeatUntilMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING__TARGET = eINSTANCE.getRepeatUntilToRepeatUntilMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.FlowToSplitJoinMappingImpl <em>Flow To Split Join Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.FlowToSplitJoinMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getFlowToSplitJoinMapping()
		 * @generated
		 */
		EClass FLOW_TO_SPLIT_JOIN_MAPPING = eINSTANCE.getFlowToSplitJoinMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TO_SPLIT_JOIN_MAPPING__SOURCE = eINSTANCE.getFlowToSplitJoinMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TO_SPLIT_JOIN_MAPPING__TARGET = eINSTANCE.getFlowToSplitJoinMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ForToRepeatWhileMappingImpl <em>For To Repeat While Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ForToRepeatWhileMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getForToRepeatWhileMapping()
		 * @generated
		 */
		EClass FOR_TO_REPEAT_WHILE_MAPPING = eINSTANCE.getForToRepeatWhileMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_TO_REPEAT_WHILE_MAPPING__SOURCE = eINSTANCE.getForToRepeatWhileMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_TO_REPEAT_WHILE_MAPPING__TARGET = eINSTANCE.getForToRepeatWhileMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ScopeToCompositeActionMappingImpl <em>Scope To Composite Action Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ScopeToCompositeActionMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getScopeToCompositeActionMapping()
		 * @generated
		 */
		EClass SCOPE_TO_COMPOSITE_ACTION_MAPPING = eINSTANCE.getScopeToCompositeActionMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_TO_COMPOSITE_ACTION_MAPPING__SOURCE = eINSTANCE.getScopeToCompositeActionMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_TO_COMPOSITE_ACTION_MAPPING__TARGET = eINSTANCE.getScopeToCompositeActionMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseIfToIfThenElseMappingImpl <em>Else If To If Then Else Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseIfToIfThenElseMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getElseIfToIfThenElseMapping()
		 * @generated
		 */
		EClass ELSE_IF_TO_IF_THEN_ELSE_MAPPING = eINSTANCE.getElseIfToIfThenElseMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_TO_IF_THEN_ELSE_MAPPING__SOURCE = eINSTANCE.getElseIfToIfThenElseMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_TO_IF_THEN_ELSE_MAPPING__TARGET = eINSTANCE.getElseIfToIfThenElseMapping_Target();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseToElseMappingImpl <em>Else To Else Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.ElseToElseMappingImpl
		 * @see net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingPackageImpl#getElseToElseMapping()
		 * @generated
		 */
		EClass ELSE_TO_ELSE_MAPPING = eINSTANCE.getElseToElseMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_TO_ELSE_MAPPING__SOURCE = eINSTANCE.getElseToElseMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_TO_ELSE_MAPPING__TARGET = eINSTANCE.getElseToElseMapping_Target();

	}

} //MappingPackage
