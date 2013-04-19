/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfannotation.mapping.util;

import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MappingPackage.MAPPING_CONTAINER: {
				MappingContainer mappingContainer = (MappingContainer)theEObject;
				T result = caseMappingContainer(mappingContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PARTNER_ACTIVITY_TO_ATOMIC_ACTION_MAPPING: {
				PartnerActivityToAtomicActionMapping partnerActivityToAtomicActionMapping = (PartnerActivityToAtomicActionMapping)theEObject;
				T result = casePartnerActivityToAtomicActionMapping(partnerActivityToAtomicActionMapping);
				if (result == null) result = caseMapping(partnerActivityToAtomicActionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PROCESS_TO_COMPOSITE_ACTION_MAPPING: {
				ProcessToCompositeActionMapping processToCompositeActionMapping = (ProcessToCompositeActionMapping)theEObject;
				T result = caseProcessToCompositeActionMapping(processToCompositeActionMapping);
				if (result == null) result = caseMapping(processToCompositeActionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SEQUENCE_TO_SEQUENCE_MAPPING: {
				SequenceToSequenceMapping sequenceToSequenceMapping = (SequenceToSequenceMapping)theEObject;
				T result = caseSequenceToSequenceMapping(sequenceToSequenceMapping);
				if (result == null) result = caseMapping(sequenceToSequenceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.IF_TO_IF_THEN_ELSE_MAPPING: {
				IfToIfThenElseMapping ifToIfThenElseMapping = (IfToIfThenElseMapping)theEObject;
				T result = caseIfToIfThenElseMapping(ifToIfThenElseMapping);
				if (result == null) result = caseMapping(ifToIfThenElseMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.WHILE_TO_REPEAT_WHILE_MAPPING: {
				WhileToRepeatWhileMapping whileToRepeatWhileMapping = (WhileToRepeatWhileMapping)theEObject;
				T result = caseWhileToRepeatWhileMapping(whileToRepeatWhileMapping);
				if (result == null) result = caseMapping(whileToRepeatWhileMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.REPEAT_UNTIL_TO_REPEAT_UNTIL_MAPPING: {
				RepeatUntilToRepeatUntilMapping repeatUntilToRepeatUntilMapping = (RepeatUntilToRepeatUntilMapping)theEObject;
				T result = caseRepeatUntilToRepeatUntilMapping(repeatUntilToRepeatUntilMapping);
				if (result == null) result = caseMapping(repeatUntilToRepeatUntilMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FLOW_TO_SPLIT_JOIN_MAPPING: {
				FlowToSplitJoinMapping flowToSplitJoinMapping = (FlowToSplitJoinMapping)theEObject;
				T result = caseFlowToSplitJoinMapping(flowToSplitJoinMapping);
				if (result == null) result = caseMapping(flowToSplitJoinMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FOR_TO_REPEAT_WHILE_MAPPING: {
				ForToRepeatWhileMapping forToRepeatWhileMapping = (ForToRepeatWhileMapping)theEObject;
				T result = caseForToRepeatWhileMapping(forToRepeatWhileMapping);
				if (result == null) result = caseMapping(forToRepeatWhileMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SCOPE_TO_COMPOSITE_ACTION_MAPPING: {
				ScopeToCompositeActionMapping scopeToCompositeActionMapping = (ScopeToCompositeActionMapping)theEObject;
				T result = caseScopeToCompositeActionMapping(scopeToCompositeActionMapping);
				if (result == null) result = caseMapping(scopeToCompositeActionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.ELSE_IF_TO_IF_THEN_ELSE_MAPPING: {
				ElseIfToIfThenElseMapping elseIfToIfThenElseMapping = (ElseIfToIfThenElseMapping)theEObject;
				T result = caseElseIfToIfThenElseMapping(elseIfToIfThenElseMapping);
				if (result == null) result = caseMapping(elseIfToIfThenElseMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.ELSE_TO_ELSE_MAPPING: {
				ElseToElseMapping elseToElseMapping = (ElseToElseMapping)theEObject;
				T result = caseElseToElseMapping(elseToElseMapping);
				if (result == null) result = caseMapping(elseToElseMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingContainer(MappingContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partner Activity To Atomic Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partner Activity To Atomic Action Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartnerActivityToAtomicActionMapping(PartnerActivityToAtomicActionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process To Composite Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process To Composite Action Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessToCompositeActionMapping(ProcessToCompositeActionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence To Sequence Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence To Sequence Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceToSequenceMapping(SequenceToSequenceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If To If Then Else Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If To If Then Else Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfToIfThenElseMapping(IfToIfThenElseMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While To Repeat While Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While To Repeat While Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileToRepeatWhileMapping(WhileToRepeatWhileMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Until To Repeat Until Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Until To Repeat Until Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatUntilToRepeatUntilMapping(RepeatUntilToRepeatUntilMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow To Split Join Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow To Split Join Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowToSplitJoinMapping(FlowToSplitJoinMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For To Repeat While Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For To Repeat While Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForToRepeatWhileMapping(ForToRepeatWhileMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope To Composite Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope To Composite Action Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeToCompositeActionMapping(ScopeToCompositeActionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else If To If Then Else Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If To If Then Else Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseIfToIfThenElseMapping(ElseIfToIfThenElseMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else To Else Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else To Else Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseToElseMapping(ElseToElseMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MappingSwitch
