/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingFactory eINSTANCE = net.sf.ictalive.coordination.wfannotation.mapping.impl.MappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	MappingContainer createMappingContainer();

	/**
	 * Returns a new object of class '<em>Partner Activity To Atomic Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partner Activity To Atomic Action Mapping</em>'.
	 * @generated
	 */
	PartnerActivityToAtomicActionMapping createPartnerActivityToAtomicActionMapping();

	/**
	 * Returns a new object of class '<em>Process To Composite Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process To Composite Action Mapping</em>'.
	 * @generated
	 */
	ProcessToCompositeActionMapping createProcessToCompositeActionMapping();

	/**
	 * Returns a new object of class '<em>Sequence To Sequence Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence To Sequence Mapping</em>'.
	 * @generated
	 */
	SequenceToSequenceMapping createSequenceToSequenceMapping();

	/**
	 * Returns a new object of class '<em>If To If Then Else Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If To If Then Else Mapping</em>'.
	 * @generated
	 */
	IfToIfThenElseMapping createIfToIfThenElseMapping();

	/**
	 * Returns a new object of class '<em>While To Repeat While Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While To Repeat While Mapping</em>'.
	 * @generated
	 */
	WhileToRepeatWhileMapping createWhileToRepeatWhileMapping();

	/**
	 * Returns a new object of class '<em>Repeat Until To Repeat Until Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Until To Repeat Until Mapping</em>'.
	 * @generated
	 */
	RepeatUntilToRepeatUntilMapping createRepeatUntilToRepeatUntilMapping();

	/**
	 * Returns a new object of class '<em>Flow To Split Join Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow To Split Join Mapping</em>'.
	 * @generated
	 */
	FlowToSplitJoinMapping createFlowToSplitJoinMapping();

	/**
	 * Returns a new object of class '<em>For To Repeat While Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For To Repeat While Mapping</em>'.
	 * @generated
	 */
	ForToRepeatWhileMapping createForToRepeatWhileMapping();

	/**
	 * Returns a new object of class '<em>Scope To Composite Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope To Composite Action Mapping</em>'.
	 * @generated
	 */
	ScopeToCompositeActionMapping createScopeToCompositeActionMapping();

	/**
	 * Returns a new object of class '<em>Else If To If Then Else Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else If To If Then Else Mapping</em>'.
	 * @generated
	 */
	ElseIfToIfThenElseMapping createElseIfToIfThenElseMapping();

	/**
	 * Returns a new object of class '<em>Else To Else Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else To Else Mapping</em>'.
	 * @generated
	 */
	ElseToElseMapping createElseToElseMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingPackage getMappingPackage();

} //MappingFactory
