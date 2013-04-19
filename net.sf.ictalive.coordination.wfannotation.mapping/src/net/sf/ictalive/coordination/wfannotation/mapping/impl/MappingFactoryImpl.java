/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping.impl;

import net.sf.ictalive.coordination.wfannotation.mapping.*;

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
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingFactory init() {
		try {
			MappingFactory theMappingFactory = (MappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/coordination/wfannotation/mapping"); 
			if (theMappingFactory != null) {
				return theMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactoryImpl() {
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
			case MappingPackage.MAPPING_CONTAINER: return createMappingContainer();
			case MappingPackage.PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING: return createPartnerActivityToAtomicActionMapping();
			case MappingPackage.PROCESS_TO_COMPOSITE_ACTION_MAPPING: return createProcessToCompositeActionMapping();
			case MappingPackage.SEQUENCE_TO_SEQUENCE_MAPPING: return createSequenceToSequenceMapping();
			case MappingPackage.IF_TO_IF_THEN_ELSE_MAPPING: return createIfToIfThenElseMapping();
			case MappingPackage.WHILE_TO_REPEAT_WHILE_MAPPING: return createWhileToRepeatWhileMapping();
			case MappingPackage.REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING: return createRepeatUntilToRepeatUntilMapping();
			case MappingPackage.FLOW_TO_SPLIT_JOIN_MAPPING: return createFlowToSplitJoinMapping();
			case MappingPackage.FOR_TO_REPEAT_WHILE_MAPPING: return createForToRepeatWhileMapping();
			case MappingPackage.SCOPE_TO_COMPOSITE_ACTION_MAPPING: return createScopeToCompositeActionMapping();
			case MappingPackage.ELSE_IF_TO_IF_THEN_ELSE_MAPPING: return createElseIfToIfThenElseMapping();
			case MappingPackage.ELSE_TO_ELSE_MAPPING: return createElseToElseMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingContainer createMappingContainer() {
		MappingContainerImpl mappingContainer = new MappingContainerImpl();
		return mappingContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerActivityToAtomicActionMapping createPartnerActivityToAtomicActionMapping() {
		PartnerActivityToAtomicActionMappingImpl partnerActivityToAtomicActionMapping = new PartnerActivityToAtomicActionMappingImpl();
		return partnerActivityToAtomicActionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessToCompositeActionMapping createProcessToCompositeActionMapping() {
		ProcessToCompositeActionMappingImpl processToCompositeActionMapping = new ProcessToCompositeActionMappingImpl();
		return processToCompositeActionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceToSequenceMapping createSequenceToSequenceMapping() {
		SequenceToSequenceMappingImpl sequenceToSequenceMapping = new SequenceToSequenceMappingImpl();
		return sequenceToSequenceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfToIfThenElseMapping createIfToIfThenElseMapping() {
		IfToIfThenElseMappingImpl ifToIfThenElseMapping = new IfToIfThenElseMappingImpl();
		return ifToIfThenElseMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileToRepeatWhileMapping createWhileToRepeatWhileMapping() {
		WhileToRepeatWhileMappingImpl whileToRepeatWhileMapping = new WhileToRepeatWhileMappingImpl();
		return whileToRepeatWhileMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntilToRepeatUntilMapping createRepeatUntilToRepeatUntilMapping() {
		RepeatUntilToRepeatUntilMappingImpl repeatUntilToRepeatUntilMapping = new RepeatUntilToRepeatUntilMappingImpl();
		return repeatUntilToRepeatUntilMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowToSplitJoinMapping createFlowToSplitJoinMapping() {
		FlowToSplitJoinMappingImpl flowToSplitJoinMapping = new FlowToSplitJoinMappingImpl();
		return flowToSplitJoinMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForToRepeatWhileMapping createForToRepeatWhileMapping() {
		ForToRepeatWhileMappingImpl forToRepeatWhileMapping = new ForToRepeatWhileMappingImpl();
		return forToRepeatWhileMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeToCompositeActionMapping createScopeToCompositeActionMapping() {
		ScopeToCompositeActionMappingImpl scopeToCompositeActionMapping = new ScopeToCompositeActionMappingImpl();
		return scopeToCompositeActionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIfToIfThenElseMapping createElseIfToIfThenElseMapping() {
		ElseIfToIfThenElseMappingImpl elseIfToIfThenElseMapping = new ElseIfToIfThenElseMappingImpl();
		return elseIfToIfThenElseMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseToElseMapping createElseToElseMapping() {
		ElseToElseMappingImpl elseToElseMapping = new ElseToElseMappingImpl();
		return elseToElseMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPackage getMappingPackage() {
		return (MappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingPackage getPackage() {
		return MappingPackage.eINSTANCE;
	}

} //MappingFactoryImpl
