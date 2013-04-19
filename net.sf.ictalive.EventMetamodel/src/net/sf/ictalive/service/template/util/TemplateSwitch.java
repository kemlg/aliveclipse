/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.util;

import java.util.List;

import net.sf.ictalive.service.semantics.IOEP;

import net.sf.ictalive.service.template.*;

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
 * @see net.sf.ictalive.service.template.TemplatePackage
 * @generated
 */
public class TemplateSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TemplatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = TemplatePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
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
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case TemplatePackage.SERVICE_TEMPLATE:
			{
				ServiceTemplate serviceTemplate = (ServiceTemplate)theEObject;
				T result = caseServiceTemplate(serviceTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.TEMPLATE_FLOW:
			{
				TemplateFlow templateFlow = (TemplateFlow)theEObject;
				T result = caseTemplateFlow(templateFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.GROUND_TEMPLATE:
			{
				GroundTemplate groundTemplate = (GroundTemplate)theEObject;
				T result = caseGroundTemplate(groundTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.ABSTRACT_PROCESS_MODEL:
			{
				AbstractProcessModel abstractProcessModel = (AbstractProcessModel)theEObject;
				T result = caseAbstractProcessModel(abstractProcessModel);
				if (result == null) result = caseIOEP(abstractProcessModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER:
			{
				BoundTemplateParameter boundTemplateParameter = (BoundTemplateParameter)theEObject;
				T result = caseBoundTemplateParameter(boundTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.BOUND_PROCESS_MODEL:
			{
				BoundProcessModel boundProcessModel = (BoundProcessModel)theEObject;
				T result = caseBoundProcessModel(boundProcessModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.TEMPLATE_CONSTRAINT:
			{
				TemplateConstraint templateConstraint = (TemplateConstraint)theEObject;
				T result = caseTemplateConstraint(templateConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.CONTROL_CONSTRUCT:
			{
				ControlConstruct controlConstruct = (ControlConstruct)theEObject;
				T result = caseControlConstruct(controlConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.ANY_ORDER:
			{
				AnyOrder anyOrder = (AnyOrder)theEObject;
				T result = caseAnyOrder(anyOrder);
				if (result == null) result = caseControlConstruct(anyOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.CHOICE:
			{
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseControlConstruct(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.IF_THEN_ELSE:
			{
				IfThenElse ifThenElse = (IfThenElse)theEObject;
				T result = caseIfThenElse(ifThenElse);
				if (result == null) result = caseControlConstruct(ifThenElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.ITERATE:
			{
				Iterate iterate = (Iterate)theEObject;
				T result = caseIterate(iterate);
				if (result == null) result = caseControlConstruct(iterate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.PERFORM:
			{
				Perform perform = (Perform)theEObject;
				T result = casePerform(perform);
				if (result == null) result = caseControlConstruct(perform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.REPEAT_UNTIL:
			{
				RepeatUntil repeatUntil = (RepeatUntil)theEObject;
				T result = caseRepeatUntil(repeatUntil);
				if (result == null) result = caseIterate(repeatUntil);
				if (result == null) result = caseControlConstruct(repeatUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.REPEAT_WHILE:
			{
				RepeatWhile repeatWhile = (RepeatWhile)theEObject;
				T result = caseRepeatWhile(repeatWhile);
				if (result == null) result = caseIterate(repeatWhile);
				if (result == null) result = caseControlConstruct(repeatWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.SEQUENCE:
			{
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseControlConstruct(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.SPLIT:
			{
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseControlConstruct(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.SPLIT_JOIN:
			{
				SplitJoin splitJoin = (SplitJoin)theEObject;
				T result = caseSplitJoin(splitJoin);
				if (result == null) result = caseControlConstruct(splitJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.CONTROL_CONSTRUCT_LIST:
			{
				ControlConstructList controlConstructList = (ControlConstructList)theEObject;
				T result = caseControlConstructList(controlConstructList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.CONTROL_CONSTRUCT_BAG:
			{
				ControlConstructBag controlConstructBag = (ControlConstructBag)theEObject;
				T result = caseControlConstructBag(controlConstructBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatePackage.INTERVAL_THING:
			{
				IntervalThing intervalThing = (IntervalThing)theEObject;
				T result = caseIntervalThing(intervalThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTemplate(ServiceTemplate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateFlow(TemplateFlow object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundTemplate(GroundTemplate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Process Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractProcessModel(AbstractProcessModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundTemplateParameter(BoundTemplateParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Process Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundProcessModel(BoundProcessModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateConstraint(TemplateConstraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConstruct(ControlConstruct object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyOrder(AnyOrder object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElse(IfThenElse object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterate(Iterate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerform(Perform object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatUntil(RepeatUntil object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatWhile(RepeatWhile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitJoin(SplitJoin object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConstructList(ControlConstructList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConstructBag(ControlConstructBag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalThing(IntervalThing object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOEP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOEP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOEP(IOEP object)
	{
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
	public T defaultCase(EObject object)
	{
		return null;
	}

} //TemplateSwitch
