/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping.util;

import net.sf.ictalive.coordination.wfannotation.mapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage
 * @generated
 */
public class MappingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
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
	protected MappingSwitch<Adapter> modelSwitch =
		new MappingSwitch<Adapter>() {
			@Override
			public Adapter caseMappingContainer(MappingContainer object) {
				return createMappingContainerAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter casePartnerActivityToAtomicActionMapping(PartnerActivityToAtomicActionMapping object) {
				return createPartnerActivityToAtomicActionMappingAdapter();
			}
			@Override
			public Adapter caseProcessToCompositeActionMapping(ProcessToCompositeActionMapping object) {
				return createProcessToCompositeActionMappingAdapter();
			}
			@Override
			public Adapter caseSequenceToSequenceMapping(SequenceToSequenceMapping object) {
				return createSequenceToSequenceMappingAdapter();
			}
			@Override
			public Adapter caseIfToIfThenElseMapping(IfToIfThenElseMapping object) {
				return createIfToIfThenElseMappingAdapter();
			}
			@Override
			public Adapter caseWhileToRepeatWhileMapping(WhileToRepeatWhileMapping object) {
				return createWhileToRepeatWhileMappingAdapter();
			}
			@Override
			public Adapter caseRepeatUntilToRepeatUntilMapping(RepeatUntilToRepeatUntilMapping object) {
				return createRepeatUntilToRepeatUntilMappingAdapter();
			}
			@Override
			public Adapter caseFlowToSplitJoinMapping(FlowToSplitJoinMapping object) {
				return createFlowToSplitJoinMappingAdapter();
			}
			@Override
			public Adapter caseForToRepeatWhileMapping(ForToRepeatWhileMapping object) {
				return createForToRepeatWhileMappingAdapter();
			}
			@Override
			public Adapter caseScopeToCompositeActionMapping(ScopeToCompositeActionMapping object) {
				return createScopeToCompositeActionMappingAdapter();
			}
			@Override
			public Adapter caseElseIfToIfThenElseMapping(ElseIfToIfThenElseMapping object) {
				return createElseIfToIfThenElseMappingAdapter();
			}
			@Override
			public Adapter caseElseToElseMapping(ElseToElseMapping object) {
				return createElseToElseMappingAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer
	 * @generated
	 */
	public Adapter createMappingContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping <em>Partner Activity To Atomic Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.PartnerActivityToAtomicActionMapping
	 * @generated
	 */
	public Adapter createPartnerActivityToAtomicActionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping <em>Process To Composite Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ProcessToCompositeActionMapping
	 * @generated
	 */
	public Adapter createProcessToCompositeActionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping <em>Sequence To Sequence Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping
	 * @generated
	 */
	public Adapter createSequenceToSequenceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping <em>If To If Then Else Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.IfToIfThenElseMapping
	 * @generated
	 */
	public Adapter createIfToIfThenElseMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping <em>While To Repeat While Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping
	 * @generated
	 */
	public Adapter createWhileToRepeatWhileMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping <em>Repeat Until To Repeat Until Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.RepeatUntilToRepeatUntilMapping
	 * @generated
	 */
	public Adapter createRepeatUntilToRepeatUntilMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping <em>Flow To Split Join Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.FlowToSplitJoinMapping
	 * @generated
	 */
	public Adapter createFlowToSplitJoinMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping <em>For To Repeat While Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ForToRepeatWhileMapping
	 * @generated
	 */
	public Adapter createForToRepeatWhileMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping <em>Scope To Composite Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping
	 * @generated
	 */
	public Adapter createScopeToCompositeActionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping <em>Else If To If Then Else Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping
	 * @generated
	 */
	public Adapter createElseIfToIfThenElseMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping <em>Else To Else Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.coordination.wfannotation.mapping.ElseToElseMapping
	 * @generated
	 */
	public Adapter createElseToElseMappingAdapter() {
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

} //MappingAdapterFactory
