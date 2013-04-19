/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.Mapping;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingFactory;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage;
import net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping;

import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.bpel.model.BPELPackage;

import org.eclipse.bpel.model.messageproperties.MessagepropertiesPackage;

import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypePackage;

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
public class MappingPackageImpl extends EPackageImpl implements MappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingContainerEClass = null;

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
	private EClass partnerActivityToAtomicActionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processToCompositeActionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceToSequenceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifToIfThenElseMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileToRepeatWhileMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatUntilToRepeatUntilMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowToSplitJoinMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forToRepeatWhileMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeToCompositeActionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseIfToIfThenElseMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseToElseMappingEClass = null;

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
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingPackageImpl() {
		super(eNS_URI, MappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingPackage init() {
		if (isInited) return (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Obtain or create and register package
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BPELPackage.eINSTANCE.eClass();
		PartnerlinktypePackage.eINSTANCE.eClass();
		MessagepropertiesPackage.eINSTANCE.eClass();
		ActionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI, theMappingPackage);
		return theMappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingContainer() {
		return mappingContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainer_Mappings() {
		return (EReference)mappingContainerEClass.getEStructuralFeatures().get(0);
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
	public EClass getPartnerActivityToAtomicActionMapping() {
		return partnerActivityToAtomicActionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartnerActivityToAtomicActionMapping_Source() {
		return (EReference)partnerActivityToAtomicActionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartnerActivityToAtomicActionMapping_Target() {
		return (EReference)partnerActivityToAtomicActionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessToCompositeActionMapping() {
		return processToCompositeActionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToCompositeActionMapping_Source() {
		return (EReference)processToCompositeActionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToCompositeActionMapping_Target() {
		return (EReference)processToCompositeActionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceToSequenceMapping() {
		return sequenceToSequenceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceToSequenceMapping_Source() {
		return (EReference)sequenceToSequenceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceToSequenceMapping_Target() {
		return (EReference)sequenceToSequenceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfToIfThenElseMapping() {
		return ifToIfThenElseMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfToIfThenElseMapping_Source() {
		return (EReference)ifToIfThenElseMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfToIfThenElseMapping_Target() {
		return (EReference)ifToIfThenElseMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileToRepeatWhileMapping() {
		return whileToRepeatWhileMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileToRepeatWhileMapping_Source() {
		return (EReference)whileToRepeatWhileMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileToRepeatWhileMapping_Target() {
		return (EReference)whileToRepeatWhileMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatUntilToRepeatUntilMapping() {
		return repeatUntilToRepeatUntilMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatUntilToRepeatUntilMapping_Source() {
		return (EReference)repeatUntilToRepeatUntilMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatUntilToRepeatUntilMapping_Target() {
		return (EReference)repeatUntilToRepeatUntilMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowToSplitJoinMapping() {
		return flowToSplitJoinMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowToSplitJoinMapping_Source() {
		return (EReference)flowToSplitJoinMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowToSplitJoinMapping_Target() {
		return (EReference)flowToSplitJoinMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForToRepeatWhileMapping() {
		return forToRepeatWhileMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForToRepeatWhileMapping_Source() {
		return (EReference)forToRepeatWhileMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForToRepeatWhileMapping_Target() {
		return (EReference)forToRepeatWhileMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeToCompositeActionMapping() {
		return scopeToCompositeActionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeToCompositeActionMapping_Source() {
		return (EReference)scopeToCompositeActionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeToCompositeActionMapping_Target() {
		return (EReference)scopeToCompositeActionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseIfToIfThenElseMapping() {
		return elseIfToIfThenElseMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfToIfThenElseMapping_Source() {
		return (EReference)elseIfToIfThenElseMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfToIfThenElseMapping_Target() {
		return (EReference)elseIfToIfThenElseMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseToElseMapping() {
		return elseToElseMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseToElseMapping_Source() {
		return (EReference)elseToElseMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseToElseMapping_Target() {
		return (EReference)elseToElseMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactory getMappingFactory() {
		return (MappingFactory)getEFactoryInstance();
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
		mappingContainerEClass = createEClass(MAPPING_CONTAINER);
		createEReference(mappingContainerEClass, MAPPING_CONTAINER__MAPPINGS);

		mappingEClass = createEClass(MAPPING);

		partnerActivityToAtomicActionMappingEClass = createEClass(PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING);
		createEReference(partnerActivityToAtomicActionMappingEClass, PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING__SOURCE);
		createEReference(partnerActivityToAtomicActionMappingEClass, PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING__TARGET);

		processToCompositeActionMappingEClass = createEClass(PROCESS_TO_COMPOSITE_ACTION_MAPPING);
		createEReference(processToCompositeActionMappingEClass, PROCESS_TO_COMPOSITE_ACTION_MAPPING__SOURCE);
		createEReference(processToCompositeActionMappingEClass, PROCESS_TO_COMPOSITE_ACTION_MAPPING__TARGET);

		sequenceToSequenceMappingEClass = createEClass(SEQUENCE_TO_SEQUENCE_MAPPING);
		createEReference(sequenceToSequenceMappingEClass, SEQUENCE_TO_SEQUENCE_MAPPING__SOURCE);
		createEReference(sequenceToSequenceMappingEClass, SEQUENCE_TO_SEQUENCE_MAPPING__TARGET);

		ifToIfThenElseMappingEClass = createEClass(IF_TO_IF_THEN_ELSE_MAPPING);
		createEReference(ifToIfThenElseMappingEClass, IF_TO_IF_THEN_ELSE_MAPPING__SOURCE);
		createEReference(ifToIfThenElseMappingEClass, IF_TO_IF_THEN_ELSE_MAPPING__TARGET);

		whileToRepeatWhileMappingEClass = createEClass(WHILE_TO_REPEAT_WHILE_MAPPING);
		createEReference(whileToRepeatWhileMappingEClass, WHILE_TO_REPEAT_WHILE_MAPPING__SOURCE);
		createEReference(whileToRepeatWhileMappingEClass, WHILE_TO_REPEAT_WHILE_MAPPING__TARGET);

		repeatUntilToRepeatUntilMappingEClass = createEClass(REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING);
		createEReference(repeatUntilToRepeatUntilMappingEClass, REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING__SOURCE);
		createEReference(repeatUntilToRepeatUntilMappingEClass, REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING__TARGET);

		flowToSplitJoinMappingEClass = createEClass(FLOW_TO_SPLIT_JOIN_MAPPING);
		createEReference(flowToSplitJoinMappingEClass, FLOW_TO_SPLIT_JOIN_MAPPING__SOURCE);
		createEReference(flowToSplitJoinMappingEClass, FLOW_TO_SPLIT_JOIN_MAPPING__TARGET);

		forToRepeatWhileMappingEClass = createEClass(FOR_TO_REPEAT_WHILE_MAPPING);
		createEReference(forToRepeatWhileMappingEClass, FOR_TO_REPEAT_WHILE_MAPPING__SOURCE);
		createEReference(forToRepeatWhileMappingEClass, FOR_TO_REPEAT_WHILE_MAPPING__TARGET);

		scopeToCompositeActionMappingEClass = createEClass(SCOPE_TO_COMPOSITE_ACTION_MAPPING);
		createEReference(scopeToCompositeActionMappingEClass, SCOPE_TO_COMPOSITE_ACTION_MAPPING__SOURCE);
		createEReference(scopeToCompositeActionMappingEClass, SCOPE_TO_COMPOSITE_ACTION_MAPPING__TARGET);

		elseIfToIfThenElseMappingEClass = createEClass(ELSE_IF_TO_IF_THEN_ELSE_MAPPING);
		createEReference(elseIfToIfThenElseMappingEClass, ELSE_IF_TO_IF_THEN_ELSE_MAPPING__SOURCE);
		createEReference(elseIfToIfThenElseMappingEClass, ELSE_IF_TO_IF_THEN_ELSE_MAPPING__TARGET);

		elseToElseMappingEClass = createEClass(ELSE_TO_ELSE_MAPPING);
		createEReference(elseToElseMappingEClass, ELSE_TO_ELSE_MAPPING__SOURCE);
		createEReference(elseToElseMappingEClass, ELSE_TO_ELSE_MAPPING__TARGET);
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
		BPELPackage theBPELPackage = (BPELPackage)EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partnerActivityToAtomicActionMappingEClass.getESuperTypes().add(this.getMapping());
		processToCompositeActionMappingEClass.getESuperTypes().add(this.getMapping());
		sequenceToSequenceMappingEClass.getESuperTypes().add(this.getMapping());
		ifToIfThenElseMappingEClass.getESuperTypes().add(this.getMapping());
		whileToRepeatWhileMappingEClass.getESuperTypes().add(this.getMapping());
		repeatUntilToRepeatUntilMappingEClass.getESuperTypes().add(this.getMapping());
		flowToSplitJoinMappingEClass.getESuperTypes().add(this.getMapping());
		forToRepeatWhileMappingEClass.getESuperTypes().add(this.getMapping());
		scopeToCompositeActionMappingEClass.getESuperTypes().add(this.getMapping());
		elseIfToIfThenElseMappingEClass.getESuperTypes().add(this.getMapping());
		elseToElseMappingEClass.getESuperTypes().add(this.getMapping());

		// Initialize classes and features; add operations and parameters
		initEClass(mappingContainerEClass, MappingContainer.class, "MappingContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingContainer_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, MappingContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partnerActivityToAtomicActionMappingEClass, PartnerActivityToAtomicActionMapping.class, "PartnerActivityToAtomicActionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartnerActivityToAtomicActionMapping_Source(), theBPELPackage.getPartnerActivity(), null, "source", null, 1, 1, PartnerActivityToAtomicActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartnerActivityToAtomicActionMapping_Target(), theActionsPackage.getAtomicAction(), null, "target", null, 1, 1, PartnerActivityToAtomicActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processToCompositeActionMappingEClass, ProcessToCompositeActionMapping.class, "ProcessToCompositeActionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessToCompositeActionMapping_Source(), theBPELPackage.getProcess(), null, "source", null, 0, 1, ProcessToCompositeActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessToCompositeActionMapping_Target(), theActionsPackage.getCompositeAction(), null, "target", null, 0, 1, ProcessToCompositeActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceToSequenceMappingEClass, SequenceToSequenceMapping.class, "SequenceToSequenceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceToSequenceMapping_Source(), theBPELPackage.getSequence(), null, "source", null, 0, 1, SequenceToSequenceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceToSequenceMapping_Target(), theProcessPackage.getSequence(), null, "target", null, 0, 1, SequenceToSequenceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifToIfThenElseMappingEClass, IfToIfThenElseMapping.class, "IfToIfThenElseMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfToIfThenElseMapping_Source(), theBPELPackage.getIf(), null, "source", null, 0, 1, IfToIfThenElseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfToIfThenElseMapping_Target(), theProcessPackage.getIfThenElse(), null, "target", null, 0, 1, IfToIfThenElseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileToRepeatWhileMappingEClass, WhileToRepeatWhileMapping.class, "WhileToRepeatWhileMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileToRepeatWhileMapping_Source(), theBPELPackage.getWhile(), null, "source", null, 0, 1, WhileToRepeatWhileMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileToRepeatWhileMapping_Target(), theProcessPackage.getRepeatWhile(), null, "target", null, 0, 1, WhileToRepeatWhileMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatUntilToRepeatUntilMappingEClass, RepeatUntilToRepeatUntilMapping.class, "RepeatUntilToRepeatUntilMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatUntilToRepeatUntilMapping_Source(), theBPELPackage.getRepeatUntil(), null, "source", null, 0, 1, RepeatUntilToRepeatUntilMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatUntilToRepeatUntilMapping_Target(), theProcessPackage.getRepeatUntil(), null, "target", null, 0, 1, RepeatUntilToRepeatUntilMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowToSplitJoinMappingEClass, FlowToSplitJoinMapping.class, "FlowToSplitJoinMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowToSplitJoinMapping_Source(), theBPELPackage.getFlow(), null, "source", null, 0, 1, FlowToSplitJoinMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowToSplitJoinMapping_Target(), theProcessPackage.getSplitJoin(), null, "target", null, 0, -1, FlowToSplitJoinMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forToRepeatWhileMappingEClass, ForToRepeatWhileMapping.class, "ForToRepeatWhileMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForToRepeatWhileMapping_Source(), theBPELPackage.getForEach(), null, "source", null, 0, 1, ForToRepeatWhileMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForToRepeatWhileMapping_Target(), theProcessPackage.getRepeatWhile(), null, "target", null, 0, 1, ForToRepeatWhileMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeToCompositeActionMappingEClass, ScopeToCompositeActionMapping.class, "ScopeToCompositeActionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeToCompositeActionMapping_Source(), theBPELPackage.getScope(), null, "source", null, 0, 1, ScopeToCompositeActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeToCompositeActionMapping_Target(), theActionsPackage.getCompositeAction(), null, "target", null, 0, 1, ScopeToCompositeActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseIfToIfThenElseMappingEClass, ElseIfToIfThenElseMapping.class, "ElseIfToIfThenElseMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseIfToIfThenElseMapping_Source(), theBPELPackage.getElseIf(), null, "source", null, 0, 1, ElseIfToIfThenElseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElseIfToIfThenElseMapping_Target(), theProcessPackage.getIfThenElse(), null, "target", null, 0, 1, ElseIfToIfThenElseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseToElseMappingEClass, ElseToElseMapping.class, "ElseToElseMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseToElseMapping_Source(), theBPELPackage.getElse(), null, "source", null, 0, 1, ElseToElseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElseToElseMapping_Target(), theProcessPackage.getControlConstruct(), null, "target", null, 0, 1, ElseToElseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MappingPackageImpl
